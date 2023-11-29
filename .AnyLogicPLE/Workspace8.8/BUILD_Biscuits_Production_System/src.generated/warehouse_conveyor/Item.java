package warehouse_conveyor;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Currency;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.Timer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.awt.Color;
import java.awt.Font;
import com.anylogic.engine.connectivity.ResultSet;
import com.anylogic.engine.connectivity.Statement;
import com.anylogic.engine.elements.*;
import com.anylogic.engine.markup.Network;
import com.anylogic.engine.Position;
import com.anylogic.engine.markup.PedFlowStatistics;
import com.anylogic.engine.markup.DensityMap;


import static java.lang.Math.*;
import static com.anylogic.engine.UtilitiesArray.*;
import static com.anylogic.engine.UtilitiesCollection.*;
import static com.anylogic.engine.presentation.UtilitiesColor.*;
import static com.anylogic.engine.HyperArray.*;

import com.anylogic.engine.*;
import com.anylogic.engine.analysis.*;
import com.anylogic.engine.connectivity.*;
import com.anylogic.engine.database.*;
import com.anylogic.engine.gis.*;
import com.anylogic.engine.markup.*;
import com.anylogic.engine.routing.*;
import com.anylogic.engine.presentation.*;
import com.anylogic.engine.gui.*;

import com.anylogic.libraries.processmodeling.*;
import com.anylogic.libraries.material_handling.*;
import com.anylogic.libraries.modules.markup_descriptors.*;

import static warehouse_conveyor.ItemType.*;

import java.awt.geom.Arc2D;

public class Item extends Agent
        implements IMaterialItem
{
  // Parameters

  public 
ItemType  type;

  /**
   * Returns default value for parameter <code>type</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public ItemType _type_DefaultValue_xjal() {
    final Item self = this;
    return null;
  }

  public void set_type( ItemType value ) {
    if (value == this.type) {
      return;
    }
    ItemType _oldValue_xjal = this.type;
    this.type = value;
    onChange_type_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter type.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_type()</code> method instead.
   */
  protected void onChange_type() {
    onChange_type_xjal( type );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_type_xjal( ItemType oldValue ) {  
  }


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    type = _type_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "type":
      if ( _callOnChange_xjal ) {
        set_type( (ItemType) _value_xjal );
      } else {
        type = (ItemType) _value_xjal;
      }
      return true;
    default:
      return super.setParameter( _name_xjal, _value_xjal, _callOnChange_xjal );
    }
  }

  @Override
  public <T> T getParameter(String _name_xjal) {
    Object _result_xjal;
    switch ( _name_xjal ) {
    case "type": _result_xjal = type; break;
    default: _result_xjal = super.getParameter( _name_xjal ); break;
    }
    return (T) _result_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private static String[] _parameterNames_xjal;

  @Override
  public String[] getParameterNames() {
    String[] result = _parameterNames_xjal;
    if (result == null) {
      List<String> list = new ArrayList<>( Arrays.asList( super.getParameterNames() ) );
      list.add( "type" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
  }
  // Plain Variables

  public 
Order 
 order;
  public 
StorageUnit 
 storage;
  public 
double 
 timeStoredStart;
  /**
   * TODO : replace with something so that order is only one thing used to match item and carton<br>
   * Currently is used to simplify code to take carton from waitForItemsFromRack flowchart block
   */
  public 
Carton 
 carton;
  public 
Pallet 
 pallet;
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Item.class );
  
  @AnyLogicInternalCodegenAPI
  @Override
  public Map<String, IElementDescriptor> getElementDesciptors() {
    return elementDesciptors_xjal;
  }
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Scale scale = new Scale( 10.0 );

  @Override
  public Scale getScale() {
    return scale;
  }



	

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _STATECHART_COUNT_xjal = 1;


  // Statecharts
  public Statechart<statechart_state> statechart = new Statechart<>( this, (short)1 );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( Statechart _s ) {
    if(_s == this.statechart) return "statechart";
    return super.getNameOf( _s );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public int getIdOf( Statechart _s ) {
    if(_s == this.statechart) return 0;
    return super.getIdOf( _s );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( Statechart _s ) {
    if( _s == this.statechart ) {
      enterState( delivered, true );
      return;
    }
    super.executeActionOf( _s );
  }

   // States of all statecharts
   
  public enum statechart_state implements IStatechartState<Item, statechart_state> {
    delivered,
    transported,
    stored,
    ordered,
    branch,
    finalState;

    @AnyLogicInternalCodegenAPI
    private Collection<statechart_state> _simpleStatesDeep_xjal;

    @AnyLogicInternalCodegenAPI
    private Set<statechart_state> _fullState_xjal;

    @AnyLogicInternalCodegenAPI
    private Set<statechart_state> _statesInside_xjal;

    @Override
    @AnyLogicInternalCodegenAPI
    public Collection<statechart_state> getSimpleStatesDeep() {
      Collection<statechart_state> result = _simpleStatesDeep_xjal;
      if (result == null) {
        _simpleStatesDeep_xjal = result = calculateAllSimpleStatesDeep();
      }
      return result;
    }
    
    @Override
    public Set<statechart_state> getFullState() {
      Set<statechart_state> result = _fullState_xjal;
      if (result == null) {
        _fullState_xjal = result = calculateFullState();
      }
      return result;
    }
    
    @Override
    @AnyLogicInternalCodegenAPI
    public Set<statechart_state> getStatesInside() {
      Set<statechart_state> result = _statesInside_xjal;
      if (result == null) {
        _statesInside_xjal = result = calculateStatesInside();
      }
      return result;
    }

    @Override
    @AnyLogicInternalCodegenAPI
    public Statechart<statechart_state> getStatechart( Item _a ) {
      return _a.statechart;
    }
  }
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final statechart_state delivered = statechart_state.delivered;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final statechart_state transported = statechart_state.transported;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final statechart_state stored = statechart_state.stored;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final statechart_state ordered = statechart_state.ordered;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final statechart_state branch = statechart_state.branch;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final statechart_state finalState = statechart_state.finalState;


  @AnyLogicInternalCodegenAPI
  private void enterState( statechart_state self, boolean _destination ) {
    switch( self ) {
      case delivered:
  	    logToDBEnterState(statechart, self);
        // (Simple state (not composite))
        statechart.setActiveState_xjal( delivered );
        transition3.start();
        return;
      case transported:
  	    logToDBEnterState(statechart, self);
        // (Simple state (not composite))
        statechart.setActiveState_xjal( transported );
        transition.start();
        return;
      case stored:
  	    logToDBEnterState(statechart, self);
        // (Simple state (not composite))
        statechart.setActiveState_xjal( stored );
        transition1.start();
        return;
      case ordered:
  	    logToDBEnterState(statechart, self);
        // (Simple state (not composite))
        statechart.setActiveState_xjal( ordered );
        transition2.start();
        return;
      case branch:
  	    logToDBEnterState(statechart, self);
        // (Branch)
        if ( 
isPreordered() 
 ) { // transition5
          enterState( ordered, true );
          return;
        }
        // transition4 (default)
          enterState( stored, true );
        return;
      case finalState:
  	    logToDBEnterState(statechart, self);
        // (Final State)
        statechart.setActiveState_xjal( finalState );
        statechart.onDestroy();
        {
group.setVisible(false); 
;}
        return;
      default:
        return;
    }
  }

  @AnyLogicInternalCodegenAPI
  private void exitState( statechart_state self, Transition _t, boolean _source ) {
    switch( self ) {
      case delivered: 
  	    logToDBExitState(statechart, self);
  	    logToDB(statechart, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != transition3) transition3.cancel();
        return;
      case transported: 
  	    logToDBExitState(statechart, self);
  	    logToDB(statechart, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != transition) transition.cancel();
        {
timeStoredStart = time( MINUTE ); 
;}
        return;
      case stored: 
  	    logToDBExitState(statechart, self);
  	    logToDB(statechart, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != transition1) transition1.cancel();
        return;
      case ordered: 
  	    logToDBExitState(statechart, self);
  	    logToDB(statechart, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != transition2) transition2.cancel();
        {
main.itemStoredTimeDistribution.add( time( MINUTE ) - timeStoredStart ); 
;}
        return;
      default:
        return;
    }
  }

  @AnyLogicInternalCodegenAPI
  private void exitInnerStates( statechart_state _destination ) {
    statechart_state _state = statechart.getActiveSimpleState();
    while( _state != _destination ) {
			exitState( _state, null, false );
			_state = _state.getContainerState();
		}
	}
  



  public TransitionMessage transition3 = new TransitionMessage( this );
  public TransitionMessage transition = new TransitionMessage( this );
  public TransitionMessage transition1 = new TransitionMessage( this );
  public TransitionMessage transition2 = new TransitionMessage( this );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( TransitionMessage _t ) {
    if ( _t == transition3 ) return "transition3";
    if ( _t == transition ) return "transition";
    if ( _t == transition1 ) return "transition1";
    if ( _t == transition2 ) return "transition2";
    return super.getNameOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public Statechart getStatechartOf( TransitionMessage _t ) { 
    if ( _t == transition3 ) return statechart;
    if ( _t == transition ) return statechart;
    if ( _t == transition1 ) return statechart;
    if ( _t == transition2 ) return statechart;
    return super.getStatechartOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( TransitionMessage self, Object _msg ) {
    if ( self == transition3 ) {
      exitState( delivered, self, true );
          enterState( transported, true );
      return;
    }
    if ( self == transition ) {
      exitState( transported, self, true );
          enterState( branch, true );
      return;
    }
    if ( self == transition1 ) {
      exitState( stored, self, true );
          enterState( ordered, true );
      return;
    }
    if ( self == transition2 ) {
      exitState( ordered, self, true );
          enterState( finalState, true );
      return;
    }
    super.executeActionOf( self, _msg );
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public boolean testMessageOf( TransitionMessage _t, Object _msg ) {
    if ( _t == transition3 ) {
      if ( !(_msg instanceof String) )
        return false;
      
String 
msg = (String) _msg;
      Object _g = 
"toConveyor" 
;
      return msg.equals( _g );
    }
    if ( _t == transition ) {
      if ( !(_msg instanceof String) )
        return false;
      
String 
msg = (String) _msg;
      Object _g = 
"placedAtRack" 
;
      return msg.equals( _g );
    }
    if ( _t == transition1 ) {
      if ( !(_msg instanceof Order) )
        return false;
      
Order 
msg = (Order) _msg;
      return true;
    }
    if ( _t == transition2 ) {
      if ( !(_msg instanceof String) )
        return false;
      
String 
msg = (String) _msg;
      Object _g = 
"toClient" 
;
      return msg.equals( _g );
    }
    return super.testMessageOf( _t, _msg );
  }
  // Functions

  
boolean 
 isPreordered(  ) { 

Order preOrder = main.checkPreOrders( type );
if ( preOrder != null )
	order = preOrder;
	
return preOrder != null; 
  }
  // View areas
  public ViewArea _origin_VA = new ViewArea( this, "[Origin]", 0, 0, 1400.0, 700.0 );
  @Override
  @AnyLogicInternalCodegenAPI
  public int getViewAreas(Map<String, ViewArea> _output) {
    if ( _output != null ) {
      _output.put( "_origin_VA", this._origin_VA );
    }
    return 1 + super.getViewAreas( _output );
  }
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _box_closed_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_Box", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _box_closed1_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_Box", orange ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _box_closed2_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_Box", chartreuse ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final int _box_closed = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int _box_closed1 = 2;
  @AnyLogicInternalCodegenAPI
  protected static final int _box_closed2 = 3;
  @AnyLogicInternalCodegenAPI
  protected static final int _group = 4;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 5;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return true;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll(box_closed, box_closed1, group);
  }

  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _box_closed_SetDynamicParams_xjal( Shape3DObject shape ) {
    boolean _visible = 
type == food && !inState( delivered ) 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
 	}
  }
  
  protected Shape3DObject box_closed;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _box_closed1_SetDynamicParams_xjal( Shape3DObject shape ) {
    boolean _visible = 
type == beverage && !inState( delivered ) 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
 	}
  }
  
  protected Shape3DObject box_closed1;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _box_closed2_SetDynamicParams_xjal( Shape3DObject shape ) {
    boolean _visible = 
( type == dish ) && !inState( delivered ) 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
 	}
  }
  
  protected Shape3DObject box_closed2;
  protected ShapeGroup group;
  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    box_closed = new Shape3DObject(
		Item.this, SHAPE_DRAW_2D3D, true, 0.0, 0.0, 0.0, 0.0,
			1.0, true, "/warehouse_conveyor/",
			"3d/box_closed.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -3.0, -2.0,
			6.0, 4.0, null, _box_closed_customColors_xjal ) {
      @Override
      public void updateDynamicProperties() {
        _box_closed_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    box_closed1 = new Shape3DObject(
		Item.this, SHAPE_DRAW_2D3D, true, 0.0, 0.0, 0.0, 0.0,
			1.0, true, "/warehouse_conveyor/",
			"3d/box_closed.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -3.0, -2.0,
			6.0, 4.0, 1511948789576L, _box_closed1_customColors_xjal ) {
      @Override
      public void updateDynamicProperties() {
        _box_closed1_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    box_closed2 = new Shape3DObject(
		Item.this, SHAPE_DRAW_2D3D, true, 0.0, 0.0, 0.0, 0.0,
			1.0, true, "/warehouse_conveyor/",
			"3d/box_closed.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -3.0, -2.0,
			6.0, 4.0, 1511948878305L, _box_closed2_customColors_xjal ) {
      @Override
      public void updateDynamicProperties() {
        _box_closed2_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {				
    group = new ShapeGroup( Item.this, SHAPE_DRAW_2D3D, true, 0.0, 0.0, 0.0, 0.0
	
	     , box_closed2 );

    }
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBS0_xjal() {
  }


  // Static initialization of persistent elements
  private void instantiatePersistentElements_xjal() {
    level = new com.anylogic.engine.markup.Level(this, "level", SHAPE_DRAW_2D3D, 0.0, true, true);  			
	_getLevels_xjal = new com.anylogic.engine.markup.Level[] { 
      level };
    _createPersistentElementsBP0_xjal();
  }
  protected ShapeTopLevelPresentationGroup presentation;
  protected ShapeModelElementsGroup icon; 

  @Override
  @AnyLogicInternalCodegenAPI
  public ShapeTopLevelPresentationGroup getPresentationShape() {
    return presentation;
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public ShapeModelElementsGroup getModelElementsShape() {
    return icon;
  }

	


  /**
   * Constructor
   */
  public Item( Engine engine, Agent owner, AgentList<? extends Item> ownerPopulation ) {
    super( engine, owner, ownerPopulation );
    instantiateBaseStructureThis_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void onOwnerChanged_xjal() {
    super.onOwnerChanged_xjal();
    setupReferences_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void instantiateBaseStructure_xjal() {
    super.instantiateBaseStructure_xjal();
    instantiateBaseStructureThis_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void instantiateBaseStructureThis_xjal() {
	instantiatePersistentElements_xjal();
    setupReferences_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void setupReferences_xjal() {
    main = get_Main();
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Item() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Item( ItemType type ) {
    markParametersAreSet();
    this.type = type;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Assigning initial values for plain variables
    setupPlainVariables_Item_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( Item.this, true, 0, 0, 0, 0 , level );
    icon = new ShapeModelElementsGroup( Item.this, getElementProperty( "warehouse_conveyor.Item.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
	 // Port connectors with non-replicated objects
    // Creating replicated embedded objects
    setupInitialConditions_xjal( Item.class );
    // Dynamic initialization of persistent elements
    _createPersistentElementsBS0_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void setupExt_xjal(AgentExtension _ext) {
    // Agent properties setup
    if ( _ext instanceof ExtAgentWithSpatialMetrics && _ext instanceof ExtWithSpaceType && !(tryExt(ExtAgentWithSpatialMetrics.class) instanceof ExtWithSpaceType) ) {
      double _speed;
      _speed = 
1 
;
      ((ExtAgentWithSpatialMetrics) _ext).setSpeed( _speed, MPS );
    }
    if ( _ext instanceof ExtEntity && tryExt(ExtEntity.class) == null ) {
      ExtEntity _e = (ExtEntity) _ext;
      double _length;
      _length = 
0.6 
;
	  _e.setLength( _length, METER );
	  double _width;
      _width = 
0.4 
;
	  _e.setWidth( _width, METER );
	  double _height;
      _height = 
0.4 
;
	  _e.setHeight( _height, METER );
    }
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
    statechart.start();
  }
 

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_Item_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Item_xjal() {
    carton = 
null 
;
    pallet = 
null 
;
  }

  // User API -----------------------------------------------------
  public Main get_Main() {
    {
      Agent owner = getOwner();
      if ( owner instanceof Main ) return (Main) owner;
    }
    return null;
  }

  /**
   * Read-only variable. <em>Shouldn't be modified by user.</em>
   */
  @AnyLogicCustomSerialization(AnyLogicCustomSerializationMode.REFERENCE)
  public transient warehouse_conveyor.Main main;

  @AnyLogicInternalCodegenAPI
  public static LinkToAgentAnimationSettings _connections_commonAnimationSettings_xjal = new LinkToAgentAnimationSettingsImpl( false, black, 1.0, LINE_STYLE_SOLID, ARROW_NONE, 0.0 );

  public LinkToAgentCollection<Agent, Agent> connections = new LinkToAgentStandardImpl<Agent, Agent>(this, _connections_commonAnimationSettings_xjal);
  @Override
  public LinkToAgentCollection<? extends Agent, ? extends Agent> getLinkToAgentStandard_xjal() {
    return connections;
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public void onReceive( Object _msg_xjal, Agent _sender_xjal ) {
    super.onReceive( _msg_xjal, _sender_xjal );
    statechart.fireEvent( _msg_xjal );
  }



  @AnyLogicInternalCodegenAPI
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal) {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if ( _underAgents_xjal ) {
      _animator_xjal.drawLink( this, connections, true, true );
    }
  }

  public AgentList<? extends Item> getPopulation() {
    return (AgentList<? extends Item>) super.getPopulation();
  }

  public List<? extends Item> agentsInRange( double distance ) {
    return (List<? extends Item>) super.agentsInRange( distance );
  }

  // Reaction on changes -------------------------------------
  public void onChange() {
    super.onChange();
    statechart.onChange();
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    statechart.onDestroy();
    super.onDestroy();
  }



	public AgentOrientation getOrientationOnConveyor() {
		return ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).getOrientationOnConveyor();
	}
	
	public void setOrientationOnConveyor(AgentOrientation orientation) {
		ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).setOrientationOnConveyor(orientation);
	}
	
	public boolean canChangeOrientationOnConveyor(AgentOrientation orientation) {
		return ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).canChangeOrientationOnConveyor(orientation);
	}
	
	public ConveyorPath getLeadingEdgeConveyor() {
		return ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).getLeadingEdgeConveyor();
	}
	
	public ConveyorPath getTrailingEdgeConveyor() {
		return ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).getTrailingEdgeConveyor();
	}
	
	public List<ConveyorPath> getConveyors() {
		return ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).getConveyors();
	}
	
	public double getLeadingEdgeOffset(LengthUnits units) {
		return ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).getLeadingEdgeOffset(units);
	}
	
	public double getTrailingEdgeOffset(LengthUnits units) {
		return ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).getTrailingEdgeOffset(units);
	}
	
	public Position getLeadingEdgePosition() {
		return ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).getLeadingEdgePosition();
	}
	
	public Position getTrailingEdgePosition() {
		return ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).getTrailingEdgePosition();
	}
	
	public void conveyTo() {
		ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).conveyTo();
	}
	
	public void conveyTo(ConveyorPath conveyor, double offset, LengthUnits units, ConveyorPath[] conveyorsToAvoid) {
		ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).conveyTo(conveyor, offset, units, conveyorsToAvoid);
	}
	
	public void conveyTo(PositionOnConveyor positionOnConveyor, ConveyorPath[] conveyorsToAvoid) {
		ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).conveyTo(positionOnConveyor, conveyorsToAvoid);
	}
	
	public void conveyTo(ConveyorSimpleStation simpleStation, ConveyorPath[] conveyorsToAvoid) {
		ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).conveyTo(simpleStation, conveyorsToAvoid);
	}
	
	public void conveyTo(ConveyorCustomStation customStation, ConveyorPath[] conveyorsToAvoid) {
		ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).conveyTo(customStation, conveyorsToAvoid);
	}
	
	public Agent getTransporter() {
		return ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).getTransporter();
	}

    public double getConveyingSpeed(SpeedUnits units) {
  		return ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).getConveyingSpeed(units);
  	}

  	public double getConveyingSpeed() {
  		return ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).getConveyingSpeed();
  	}
	
}
