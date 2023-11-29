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

public class Storing extends Agent
{
  // Parameters

  public 
PalletRack  rack;

  /**
   * Returns default value for parameter <code>rack</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public PalletRack _rack_DefaultValue_xjal() {
    final Storing self = this;
    return null;
  }

  public void set_rack( PalletRack value ) {
    if (value == this.rack) {
      return;
    }
    PalletRack _oldValue_xjal = this.rack;
    this.rack = value;
    onChange_rack_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter rack.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_rack()</code> method instead.
   */
  protected void onChange_rack() {
    onChange_rack_xjal( rack );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_rack_xjal( PalletRack oldValue ) {  
  }


  public 
ResourcePool  asrsResource;

  /**
   * Returns default value for parameter <code>asrsResource</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public ResourcePool _asrsResource_DefaultValue_xjal() {
    final Storing self = this;
    return null;
  }

  public void set_asrsResource( ResourcePool value ) {
    if (value == this.asrsResource) {
      return;
    }
    ResourcePool _oldValue_xjal = this.asrsResource;
    this.asrsResource = value;
    onChange_asrsResource_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter asrsResource.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_asrsResource()</code> method instead.
   */
  protected void onChange_asrsResource() {
    onChange_asrsResource_xjal( asrsResource );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_asrsResource_xjal( ResourcePool oldValue ) {
	int index;
    {
      com.anylogic.libraries.processmodeling.RackStore<Item> self = rackStore;
      AnimationStaticLocationProvider _value;
      _value = asrsResource.homeNodes[0]
;
      rackStore.set_entityLocationQueue( _value );
    }  
  }


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    rack = _rack_DefaultValue_xjal();
    asrsResource = _asrsResource_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "rack":
      if ( _callOnChange_xjal ) {
        set_rack( (PalletRack) _value_xjal );
      } else {
        rack = (PalletRack) _value_xjal;
      }
      return true;
    case "asrsResource":
      if ( _callOnChange_xjal ) {
        set_asrsResource( (ResourcePool) _value_xjal );
      } else {
        asrsResource = (ResourcePool) _value_xjal;
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
    case "rack": _result_xjal = rack; break;
    case "asrsResource": _result_xjal = asrsResource; break;
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
      list.add( "rack" );
      list.add( "asrsResource" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
  }
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Storing.class );
  
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
  protected static final int _STATECHART_COUNT_xjal = 0;


  // Embedded Objects

  public com.anylogic.libraries.processmodeling.RackStore<
Item 
> rackStore;
  public com.anylogic.libraries.processmodeling.Queue<
Item 
> queueToRack;
  public com.anylogic.libraries.material_handling.ConveyorExit<
Item 
> conveyorExit;
  public com.anylogic.libraries.processmodeling.RestrictedAreaStart<
Item 
> restrictedAreaStart;
  public com.anylogic.libraries.processmodeling.RestrictedAreaEnd<
Item 
> restrictedAreaEnd;
  public com.anylogic.libraries.processmodeling.Enter<
Item 
> enter;
  public com.anylogic.libraries.processmodeling.SelectOutput<
Item 
> rackCanAccept;
  public com.anylogic.libraries.processmodeling.Delay<
Item 
> waitForFreeSpace;

  public String getNameOf( Agent ao ) {
    if ( ao == rackStore ) return "rackStore";
    if ( ao == queueToRack ) return "queueToRack";
    if ( ao == conveyorExit ) return "conveyorExit";
    if ( ao == restrictedAreaStart ) return "restrictedAreaStart";
    if ( ao == restrictedAreaEnd ) return "restrictedAreaEnd";
    if ( ao == enter ) return "enter";
    if ( ao == rackCanAccept ) return "rackCanAccept";
    if ( ao == waitForFreeSpace ) return "waitForFreeSpace";
    return super.getNameOf( ao );
  }

  public AgentAnimationSettings getAnimationSettingsOf( Agent ao ) {
    return super.getAnimationSettingsOf( ao );
  }


  public String getNameOf( AgentList<?> aolist ) {
    return super.getNameOf( aolist );
  }
  
  public AgentAnimationSettings getAnimationSettingsOf( AgentList<?> aolist ) {
    return super.getAnimationSettingsOf( aolist );
  }


  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.RackStore<Item> instantiate_rackStore_xjal() {
    com.anylogic.libraries.processmodeling.RackStore<Item> _result_xjal = new com.anylogic.libraries.processmodeling.RackStore<Item>( getEngine(), this, null ) {
      @Override
      public PalletRackAccess<?> rackSystem( Item agent ) {
        return _rackStore_rackSystem_xjal( this, agent );
      }
      @Override
      public double elevationTimePerLevel( Item agent ) {
        return _rackStore_elevationTimePerLevel_xjal( this, agent );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_elevationTimePerLevel() {
        return SECOND;
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool[][] resourceSets( Item agent ) {
        return _rackStore_resourceSets_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_rackStore_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, TableInput _t ) {
    self.autoChooseCell = self._autoChooseCell_DefaultValue_xjal();
    self.closeToFront = 
false 
;
    self.movementDestination = self._movementDestination_DefaultValue_xjal();
    self.useDelay = self._useDelay_DefaultValue_xjal();
    self.entityLocationQueue = 
asrsResource.homeNodes[0] 
;
    self.useResources = 
true 
;
    self.moveWithSpeedOfResourceUnit = self._moveWithSpeedOfResourceUnit_DefaultValue_xjal();
    self.suspendResumeEntities = self._suspendResumeEntities_DefaultValue_xjal();
    self.resourcesGoHome = self._resourcesGoHome_DefaultValue_xjal();
    self.customizeResourceChoice = self._customizeResourceChoice_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_rackStore_xjal( com.anylogic.libraries.processmodeling.RackStore<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Queue<Item> instantiate_queueToRack_xjal() {
    com.anylogic.libraries.processmodeling.Queue<Item> _result_xjal = new com.anylogic.libraries.processmodeling.Queue<Item>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_queueToRack_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, TableInput _t ) {
    self.capacity = 
1 
;
    self.maximumCapacity = self._maximumCapacity_DefaultValue_xjal();
    self.entityLocation = self._entityLocation_DefaultValue_xjal();
    self.queuing = self._queuing_DefaultValue_xjal();
    self.enableTimeout = self._enableTimeout_DefaultValue_xjal();
    self.enablePreemption = self._enablePreemption_DefaultValue_xjal();
    self.restoreEntityLocationOnExit = self._restoreEntityLocationOnExit_DefaultValue_xjal();
    self.forceStatisticsCollection = self._forceStatisticsCollection_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_queueToRack_xjal( com.anylogic.libraries.processmodeling.Queue<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorExit<Item> instantiate_conveyorExit_xjal() {
    com.anylogic.libraries.material_handling.ConveyorExit<Item> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorExit<Item>( getEngine(), this, null ) {
      @Override
      public void onExit( Item agent ) {
        _conveyorExit_onExit_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_conveyorExit_xjal( final com.anylogic.libraries.material_handling.ConveyorExit<Item> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_conveyorExit_xjal( com.anylogic.libraries.material_handling.ConveyorExit<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.RestrictedAreaStart<Item> instantiate_restrictedAreaStart_xjal() {
    com.anylogic.libraries.processmodeling.RestrictedAreaStart<Item> _result_xjal = new com.anylogic.libraries.processmodeling.RestrictedAreaStart<Item>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_restrictedAreaStart_xjal( final com.anylogic.libraries.processmodeling.RestrictedAreaStart<Item> self, TableInput _t ) {
    self.capacity = 
1 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_restrictedAreaStart_xjal( com.anylogic.libraries.processmodeling.RestrictedAreaStart<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.RestrictedAreaEnd<Item> instantiate_restrictedAreaEnd_xjal() {
    com.anylogic.libraries.processmodeling.RestrictedAreaEnd<Item> _result_xjal = new com.anylogic.libraries.processmodeling.RestrictedAreaEnd<Item>( getEngine(), this, null ) {
      @Override
      public com.anylogic.libraries.processmodeling.RestrictedAreaStart restrictedAreaStart(  ) {
        return _restrictedAreaEnd_restrictedAreaStart_xjal( this );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_restrictedAreaEnd_xjal( final com.anylogic.libraries.processmodeling.RestrictedAreaEnd<Item> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_restrictedAreaEnd_xjal( com.anylogic.libraries.processmodeling.RestrictedAreaEnd<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Enter<Item> instantiate_enter_xjal() {
    com.anylogic.libraries.processmodeling.Enter<Item> _result_xjal = new com.anylogic.libraries.processmodeling.Enter<Item>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_enter_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, TableInput _t ) {
    self.locationType = self._locationType_DefaultValue_xjal();
    self.locationXYZInNetwork = self._locationXYZInNetwork_DefaultValue_xjal();
    self.addToCustomPopulation = self._addToCustomPopulation_DefaultValue_xjal();
    self.pushProtocol = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_enter_xjal( com.anylogic.libraries.processmodeling.Enter<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.SelectOutput<Item> instantiate_rackCanAccept_xjal() {
    com.anylogic.libraries.processmodeling.SelectOutput<Item> _result_xjal = new com.anylogic.libraries.processmodeling.SelectOutput<Item>( getEngine(), this, null ) {
      @Override
      public boolean condition( Item agent ) {
        return _rackCanAccept_condition_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_rackCanAccept_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Item> self, TableInput _t ) {
    self.conditionIsProbabilistic = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_rackCanAccept_xjal( com.anylogic.libraries.processmodeling.SelectOutput<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Delay<Item> instantiate_waitForFreeSpace_xjal() {
    com.anylogic.libraries.processmodeling.Delay<Item> _result_xjal = new com.anylogic.libraries.processmodeling.Delay<Item>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_waitForFreeSpace_xjal( final com.anylogic.libraries.processmodeling.Delay<Item> self, TableInput _t ) {
    self.type = 
self.MANUAL 
;
    self.capacity = self._capacity_DefaultValue_xjal();
    self.maximumCapacity = self._maximumCapacity_DefaultValue_xjal();
    self.entityLocation = self._entityLocation_DefaultValue_xjal();
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
    self.restoreEntityLocationOnExit = self._restoreEntityLocationOnExit_DefaultValue_xjal();
    self.forceStatisticsCollection = self._forceStatisticsCollection_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_waitForFreeSpace_xjal( com.anylogic.libraries.processmodeling.Delay<Item> self, TableInput _t ) {
  }

  private PalletRackAccess<?> _rackStore_rackSystem_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, Item agent ) {
    PalletRackAccess<?> _value;
    _value = 
rack 
;
    return _value;
  }
  private double _rackStore_elevationTimePerLevel_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, Item agent ) {
    double _value;
    _value = 
5 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool[][] _rackStore_resourceSets_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, Item agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool[][] _value;
    _value = new com.anylogic.libraries.processmodeling.ResourcePool[][]
{ { asrsResource } } 
;
    return _value;
  }
  private void _conveyorExit_onExit_xjal( final com.anylogic.libraries.material_handling.ConveyorExit<Item> self, Item agent ) {
    
agent.setNetwork( rack.getNetwork() ); 
;
  }
  private com.anylogic.libraries.processmodeling.RestrictedAreaStart _restrictedAreaEnd_restrictedAreaStart_xjal( final com.anylogic.libraries.processmodeling.RestrictedAreaEnd<Item> self ) {
    com.anylogic.libraries.processmodeling.RestrictedAreaStart _value;
    _value = 
restrictedAreaStart 
;
    return _value;
  }
  private boolean _rackCanAccept_condition_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Item> self, Item agent ) {
    boolean _value;
    _value = 
( rack.size() + rack.reserved() ) < rack.capacity() 
;
    return _value;
  }
  // Functions

  void freeWaitingItem(  ) { 

if ( ( rack.size() + rack.reserved() ) < rack.capacity() )
	waitForFreeSpace.stopDelayForAll(); 
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
  protected static final Font _text_Font = new Font("SansSerif", 0, 11 );
  @AnyLogicInternalCodegenAPI
  protected static final int _roundRectangle = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int _text = 2;
  @AnyLogicInternalCodegenAPI
  protected static final int _groupStoring = 3;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 4;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return false;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll();
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean onShapeClick( int _shape, int index, double clickx, double clicky ){
    switch( _shape ){
      case _groupStoring:
        if (true) {
          ShapeGroup self = this.groupStoring;
          
return true; 
        }
        break;
      default: return super.onShapeClick( _shape, index, clickx, clicky );
 	}
 	return false;
  }
  
  protected ShapeRoundedRectangle roundRectangle;
  protected ShapeText text;
  protected ShapeGroup groupStoring;
  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    roundRectangle = new ShapeRoundedRectangle(
		true,-30.0, -30.0, 0.0, 
        dodgerBlue, white,
		60.0, 60.0,10.0,  
		2.0, LINE_STYLE_SOLID	 );

    text = new ShapeText(
        SHAPE_DRAW_2D, true,-16.0, -7.0, 0.0, 0.0, 
        black,"Storing",
        _text_Font, ALIGNMENT_LEFT );

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {				
    groupStoring = new ShapeGroup( Storing.this, SHAPE_DRAW_2D, true, 90.0, 100.0, 0.0, 0.0
	
	     , roundRectangle
	     , text ) {

      @Override
      @AnyLogicInternalCodegenAPI
      public boolean onClick( double clickx, double clicky ) {
        return onShapeClick( _groupStoring, 0, clickx, clicky );
      }
    };

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

	

  // Ports

  public Port< 
Object 
, 
Object > out = new Port< Object, Object >( this );

  @AnyLogicInternalCodegenAPI
  public String getNameOf( Port<?, ?> _p ) {
    if( _p == this.out ) return "out";
    return super.getNameOf( _p ); 
  }


  /**
   * Constructor
   */
  public Storing( Engine engine, Agent owner, AgentList<? extends Storing> ownerPopulation ) {
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
    rackStore = instantiate_rackStore_xjal();
    queueToRack = instantiate_queueToRack_xjal();
    conveyorExit = instantiate_conveyorExit_xjal();
    restrictedAreaStart = instantiate_restrictedAreaStart_xjal();
    restrictedAreaEnd = instantiate_restrictedAreaEnd_xjal();
    enter = instantiate_enter_xjal();
    rackCanAccept = instantiate_rackCanAccept_xjal();
    waitForFreeSpace = instantiate_waitForFreeSpace_xjal();
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
  public Storing() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Storing( PalletRack rack, ResourcePool asrsResource ) {
    markParametersAreSet();
    this.rack = rack;
    this.asrsResource = asrsResource;
  }
  
  /**
   * Creating embedded object instances
   */
  @AnyLogicInternalCodegenAPI
  private void instantiatePopulations_xjal() {
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Creating embedded object instances
    instantiatePopulations_xjal();
    // Assigning initial values for plain variables
    setupPlainVariables_Storing_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( Storing.this, true, 0, 0, 0, 0 , level );
    // Creating embedded object instances
    instantiatePopulations_xjal();
    icon = new ShapeModelElementsGroup( Storing.this, getElementProperty( "warehouse_conveyor.Storing.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS ) , groupStoring );
    icon.setIconOffsets( 60.0, 70.0 );
    // Creating non-replicated embedded objects
    setupParameters_rackStore_xjal( rackStore, null );
    doBeforeCreate_rackStore_xjal( rackStore, null );
    rackStore.createAsEmbedded();
    setupParameters_queueToRack_xjal( queueToRack, null );
    doBeforeCreate_queueToRack_xjal( queueToRack, null );
    queueToRack.createAsEmbedded();
    setupParameters_conveyorExit_xjal( conveyorExit, null );
    doBeforeCreate_conveyorExit_xjal( conveyorExit, null );
    conveyorExit.createAsEmbedded();
    setupParameters_restrictedAreaStart_xjal( restrictedAreaStart, null );
    doBeforeCreate_restrictedAreaStart_xjal( restrictedAreaStart, null );
    restrictedAreaStart.createAsEmbedded();
    setupParameters_restrictedAreaEnd_xjal( restrictedAreaEnd, null );
    doBeforeCreate_restrictedAreaEnd_xjal( restrictedAreaEnd, null );
    restrictedAreaEnd.createAsEmbedded();
    setupParameters_enter_xjal( enter, null );
    doBeforeCreate_enter_xjal( enter, null );
    enter.createAsEmbedded();
    setupParameters_rackCanAccept_xjal( rackCanAccept, null );
    doBeforeCreate_rackCanAccept_xjal( rackCanAccept, null );
    rackCanAccept.createAsEmbedded();
    setupParameters_waitForFreeSpace_xjal( waitForFreeSpace, null );
    doBeforeCreate_waitForFreeSpace_xjal( waitForFreeSpace, null );
    waitForFreeSpace.createAsEmbedded();
	 // Port connectors with non-replicated objects
    conveyorExit.out.connect( rackStore.in ); // connector20
    enter.out.connect( queueToRack.in ); // connector1
    rackCanAccept.outT.connect( conveyorExit.in ); // connector2
    conveyorExit.in.connect( waitForFreeSpace.out ); // connector3
    waitForFreeSpace.in.connect( rackCanAccept.outF ); // connector4
    queueToRack.out.connect( restrictedAreaStart.in ); // connector
    restrictedAreaStart.out.connect( rackCanAccept.in ); // connector5
    rackStore.out.connect( restrictedAreaEnd.in ); // connector6
    out.map( restrictedAreaEnd.out ); // connector7
    // Creating replicated embedded objects
    setupInitialConditions_xjal( Storing.class );
    // Dynamic initialization of persistent elements
    _createPersistentElementsBS0_xjal();
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
    rackStore.startAsEmbedded();
    queueToRack.startAsEmbedded();
    conveyorExit.startAsEmbedded();
    restrictedAreaStart.startAsEmbedded();
    restrictedAreaEnd.startAsEmbedded();
    enter.startAsEmbedded();
    rackCanAccept.startAsEmbedded();
    waitForFreeSpace.startAsEmbedded();
  }
 

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_Storing_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Storing_xjal() {
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


  @AnyLogicInternalCodegenAPI
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal) {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if ( _underAgents_xjal ) {
      _animator_xjal.drawLink( this, connections, true, true );
    }
  }

  public List<Object> getEmbeddedObjects() {
    List<Object> list = super.getEmbeddedObjects();
    if (list == null) {
      list = new LinkedList<Object>();
    }
    list.add( rackStore );
    list.add( queueToRack );
    list.add( conveyorExit );
    list.add( restrictedAreaStart );
    list.add( restrictedAreaEnd );
    list.add( enter );
    list.add( rackCanAccept );
    list.add( waitForFreeSpace );
    return list;
  }

  public AgentList<? extends Storing> getPopulation() {
    return (AgentList<? extends Storing>) super.getPopulation();
  }

  public List<? extends Storing> agentsInRange( double distance ) {
    return (List<? extends Storing>) super.agentsInRange( distance );
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    out.onDestroy();
    rackStore.onDestroy();
    queueToRack.onDestroy();
    conveyorExit.onDestroy();
    restrictedAreaStart.onDestroy();
    restrictedAreaEnd.onDestroy();
    enter.onDestroy();
    rackCanAccept.onDestroy();
    waitForFreeSpace.onDestroy();
    super.onDestroy();
  }

  @AnyLogicInternalCodegenAPI
  @Override
  public void doFinish() {
    super.doFinish();
    rackStore.doFinish();
    queueToRack.doFinish();
    conveyorExit.doFinish();
    restrictedAreaStart.doFinish();
    restrictedAreaEnd.doFinish();
    enter.doFinish();
    rackCanAccept.doFinish();
    waitForFreeSpace.doFinish();
  }



}
