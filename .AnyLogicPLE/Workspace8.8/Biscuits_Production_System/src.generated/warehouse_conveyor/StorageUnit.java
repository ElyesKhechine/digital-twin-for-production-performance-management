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

 

public class StorageUnit extends Agent
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
    final StorageUnit self = this;
    return 
 
;
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

 
;  
  }


 
  public 
ConveyorPath<?>  infeedingConveyor;

  /**
   * Returns default value for parameter <code>infeedingConveyor</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public ConveyorPath<?> _infeedingConveyor_DefaultValue_xjal() {
    final StorageUnit self = this;
    return 
 
;
  }

  public void set_infeedingConveyor( ConveyorPath<?> value ) {
    if (value == this.infeedingConveyor) {
      return;
    }
    ConveyorPath<?> _oldValue_xjal = this.infeedingConveyor;
    this.infeedingConveyor = value;
    onChange_infeedingConveyor_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter infeedingConveyor.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_infeedingConveyor()</code> method instead.
   */
  protected void onChange_infeedingConveyor() {
    onChange_infeedingConveyor_xjal( infeedingConveyor );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_infeedingConveyor_xjal( ConveyorPath<?> oldValue ) {

 
;  
  }


 
  public 
ConveyorPath<?>  pickingInLine;

  /**
   * Returns default value for parameter <code>pickingInLine</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public ConveyorPath<?> _pickingInLine_DefaultValue_xjal() {
    final StorageUnit self = this;
    return 
 
;
  }

  public void set_pickingInLine( ConveyorPath<?> value ) {
    if (value == this.pickingInLine) {
      return;
    }
    ConveyorPath<?> _oldValue_xjal = this.pickingInLine;
    this.pickingInLine = value;
    onChange_pickingInLine_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter pickingInLine.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_pickingInLine()</code> method instead.
   */
  protected void onChange_pickingInLine() {
    onChange_pickingInLine_xjal( pickingInLine );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_pickingInLine_xjal( ConveyorPath<?> oldValue ) {

 
;  
  }


 
  public 
PointNode  pickupStation;

  /**
   * Returns default value for parameter <code>pickupStation</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public PointNode _pickupStation_DefaultValue_xjal() {
    final StorageUnit self = this;
    return 
 
;
  }

  public void set_pickupStation( PointNode value ) {
    if (value == this.pickupStation) {
      return;
    }
    PointNode _oldValue_xjal = this.pickupStation;
    this.pickupStation = value;
    onChange_pickupStation_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter pickupStation.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_pickupStation()</code> method instead.
   */
  protected void onChange_pickupStation() {
    onChange_pickupStation_xjal( pickupStation );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_pickupStation_xjal( PointNode oldValue ) {

 
;  
  }


 
  public 
ResourcePool  asrs;

  /**
   * Returns default value for parameter <code>asrs</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public ResourcePool _asrs_DefaultValue_xjal() {
    final StorageUnit self = this;
    return 
 
;
  }

  public void set_asrs( ResourcePool value ) {
    if (value == this.asrs) {
      return;
    }
    ResourcePool _oldValue_xjal = this.asrs;
    this.asrs = value;
    onChange_asrs_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter asrs.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_asrs()</code> method instead.
   */
  protected void onChange_asrs() {
    onChange_asrs_xjal( asrs );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_asrs_xjal( ResourcePool oldValue ) {

 
;  
  }


 
  public 
PositionOnConveyor  infeedingBlocker;

  /**
   * Returns default value for parameter <code>infeedingBlocker</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public PositionOnConveyor _infeedingBlocker_DefaultValue_xjal() {
    final StorageUnit self = this;
    return 
 
;
  }

  public void set_infeedingBlocker( PositionOnConveyor value ) {
    if (value == this.infeedingBlocker) {
      return;
    }
    PositionOnConveyor _oldValue_xjal = this.infeedingBlocker;
    this.infeedingBlocker = value;
    onChange_infeedingBlocker_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter infeedingBlocker.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_infeedingBlocker()</code> method instead.
   */
  protected void onChange_infeedingBlocker() {
    onChange_infeedingBlocker_xjal( infeedingBlocker );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_infeedingBlocker_xjal( PositionOnConveyor oldValue ) {

 
;  
  }


 
  public 
ConveyorPath<?>  pickupEntryLine;

  /**
   * Returns default value for parameter <code>pickupEntryLine</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public ConveyorPath<?> _pickupEntryLine_DefaultValue_xjal() {
    final StorageUnit self = this;
    return 
 
;
  }

  public void set_pickupEntryLine( ConveyorPath<?> value ) {
    if (value == this.pickupEntryLine) {
      return;
    }
    ConveyorPath<?> _oldValue_xjal = this.pickupEntryLine;
    this.pickupEntryLine = value;
    onChange_pickupEntryLine_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter pickupEntryLine.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_pickupEntryLine()</code> method instead.
   */
  protected void onChange_pickupEntryLine() {
    onChange_pickupEntryLine_xjal( pickupEntryLine );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_pickupEntryLine_xjal( ConveyorPath<?> oldValue ) {

 
;  
  }


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    rack = _rack_DefaultValue_xjal();
    infeedingConveyor = _infeedingConveyor_DefaultValue_xjal();
    pickingInLine = _pickingInLine_DefaultValue_xjal();
    pickupStation = _pickupStation_DefaultValue_xjal();
    asrs = _asrs_DefaultValue_xjal();
    infeedingBlocker = _infeedingBlocker_DefaultValue_xjal();
    pickupEntryLine = _pickupEntryLine_DefaultValue_xjal();
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
    case "infeedingConveyor":
      if ( _callOnChange_xjal ) {
        set_infeedingConveyor( (ConveyorPath<?>) _value_xjal );
      } else {
        infeedingConveyor = (ConveyorPath<?>) _value_xjal;
      }
      return true;
    case "pickingInLine":
      if ( _callOnChange_xjal ) {
        set_pickingInLine( (ConveyorPath<?>) _value_xjal );
      } else {
        pickingInLine = (ConveyorPath<?>) _value_xjal;
      }
      return true;
    case "pickupStation":
      if ( _callOnChange_xjal ) {
        set_pickupStation( (PointNode) _value_xjal );
      } else {
        pickupStation = (PointNode) _value_xjal;
      }
      return true;
    case "asrs":
      if ( _callOnChange_xjal ) {
        set_asrs( (ResourcePool) _value_xjal );
      } else {
        asrs = (ResourcePool) _value_xjal;
      }
      return true;
    case "infeedingBlocker":
      if ( _callOnChange_xjal ) {
        set_infeedingBlocker( (PositionOnConveyor) _value_xjal );
      } else {
        infeedingBlocker = (PositionOnConveyor) _value_xjal;
      }
      return true;
    case "pickupEntryLine":
      if ( _callOnChange_xjal ) {
        set_pickupEntryLine( (ConveyorPath<?>) _value_xjal );
      } else {
        pickupEntryLine = (ConveyorPath<?>) _value_xjal;
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
    case "infeedingConveyor": _result_xjal = infeedingConveyor; break;
    case "pickingInLine": _result_xjal = pickingInLine; break;
    case "pickupStation": _result_xjal = pickupStation; break;
    case "asrs": _result_xjal = asrs; break;
    case "infeedingBlocker": _result_xjal = infeedingBlocker; break;
    case "pickupEntryLine": _result_xjal = pickupEntryLine; break;
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
      list.add( "infeedingConveyor" );
      list.add( "pickingInLine" );
      list.add( "pickupStation" );
      list.add( "asrs" );
      list.add( "infeedingBlocker" );
      list.add( "pickupEntryLine" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
  }
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( StorageUnit.class );
  
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


  // Stub function for code completion support (internal)
  @AnyLogicInternalCodegenAPI
  private void _stubForCodeCompletion_xjal(){
    {double _t = 
0 
;}
    {double _t = 
1 
;}
    class _Stub_Implements_xjal implements 
  {}
    class _Stub_Extends_xjal extends 
  {}
  }

  // Functions

 
  void releaseIncomingFlow( double itemLength ) { 

if ( infeedingBlocker.isBlocked() ) {
	double occupancy = sum( infeedingConveyor.getAgents(), item -> itemLength + infeedingConveyor.getGap(METER) );
	
	if ( occupancy <= infeedingConveyor.length(METER) /  2 ) 
		infeedingBlocker.unblock();
} 
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
  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 1;

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

  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
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

	


  @Override
  @AnyLogicInternalCodegenAPI
  public void onArrival() {
    super.onArrival();
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onStep() {
    super.onStep();
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onBeforeStep() {
    super.onBeforeStep();
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onEnterFlowchartBlock(Agent oldBlock, Agent block) {
    super.onEnterFlowchartBlock( oldBlock, block );
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onExitFlowchartBlock(Agent block) {
    super.onExitFlowchartBlock(block);
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onSeizeResource(Agent unit) {
    super.onSeizeResource(unit);
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onReleaseResource(Agent unit) {
    super.onReleaseResource(unit);
    
 
  }

  /**
   * Constructor
   */
  public StorageUnit( Engine engine, Agent owner, AgentList<? extends StorageUnit> ownerPopulation ) {
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
  public StorageUnit() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public StorageUnit( PalletRack rack, ConveyorPath<?> infeedingConveyor, ConveyorPath<?> pickingInLine, PointNode pickupStation, ResourcePool asrs, PositionOnConveyor infeedingBlocker, ConveyorPath<?> pickupEntryLine ) {
    markParametersAreSet();
    this.rack = rack;
    this.infeedingConveyor = infeedingConveyor;
    this.pickingInLine = pickingInLine;
    this.pickupStation = pickupStation;
    this.asrs = asrs;
    this.infeedingBlocker = infeedingBlocker;
    this.pickupEntryLine = pickupEntryLine;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Assigning initial values for plain variables
    setupPlainVariables_StorageUnit_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( StorageUnit.this, true, 0, 0, 0, 0 , level );
    icon = new ShapeModelElementsGroup( StorageUnit.this, getElementProperty( "warehouse_conveyor.StorageUnit.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
	 // Port connectors with non-replicated objects
    // Creating replicated embedded objects
    setupInitialConditions_xjal( StorageUnit.class );
    // Dynamic initialization of persistent elements
    _createPersistentElementsBS0_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void setupExt_xjal(AgentExtension _ext) {
    // Agent properties setup
    if ( _ext instanceof ExtAgentWithSpatialMetrics && _ext instanceof ExtWithSpaceType && !(tryExt(ExtAgentWithSpatialMetrics.class) instanceof ExtWithSpaceType) ) {
      double _speed;
      _speed = 
10 
;
      ((ExtAgentWithSpatialMetrics) _ext).setSpeed( _speed, MPS );
    }
    if ( _ext instanceof ExtEntity && tryExt(ExtEntity.class) == null ) {
      ExtEntity _e = (ExtEntity) _ext;
      double _length;
      _length = 
1 
;
	  _e.setLength( _length, METER );
	  double _width;
      _width = 
1 
;
	  _e.setWidth( _width, METER );
	  double _height;
      _height = 
1 
;
	  _e.setHeight( _height, METER );
    }
    if ( _ext instanceof ExtAgentWithSpatialMetrics && tryExt(ExtAgentWithSpatialMetrics.class) == null ) {
      ExtAgentWithSpatialMetrics _e = (ExtAgentWithSpatialMetrics) _ext;
      _e.setAutomaticHorizontalRotation( true );
    }
    if ( _ext instanceof ExtAgentContinuous && tryExt(ExtAgentContinuous.class) == null ) {
      ExtAgentContinuous _e = (ExtAgentContinuous) _ext;
      _e.setAutomaticVerticalRotation( false );
    }
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
  }
 
  @AnyLogicInternalCodegenAPI
  public void onStartup() {
    super.onStartup();
    
 
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_StorageUnit_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_StorageUnit_xjal() {
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
    
Object  msg = (Object) _msg_xjal;
    Agent sender = _sender_xjal;
    
 
  }



  @AnyLogicInternalCodegenAPI
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal) {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if ( _underAgents_xjal ) {
      _animator_xjal.drawLink( this, connections, true, true );
    }
  }

  public AgentList<? extends StorageUnit> getPopulation() {
    return (AgentList<? extends StorageUnit>) super.getPopulation();
  }

  public List<? extends StorageUnit> agentsInRange( double distance ) {
    return (List<? extends StorageUnit>) super.agentsInRange( distance );
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    // On destroy code
    
 
    super.onDestroy();
  }

  // Additional class code

 
  // End of additional class code


}
