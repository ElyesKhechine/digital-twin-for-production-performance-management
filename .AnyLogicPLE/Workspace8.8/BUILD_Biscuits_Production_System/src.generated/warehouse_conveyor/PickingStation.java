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

public class PickingStation<
T extends Agent 

> extends Agent
{
  // Parameters

  public 
PalletRack  rack( Item item ) {
    final PickingStation self = this;
    return null;
  }

  public 
PointNode  pickingStation( Item item ) {
    final PickingStation self = this;
    return null;
  }

  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
  }
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( PickingStation.class );
  
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

  public com.anylogic.libraries.processmodeling.RackPick<
Item 
> rackPick;
  public com.anylogic.libraries.processmodeling.Enter<
Item 
> orderedItemsEnter;
  public com.anylogic.libraries.processmodeling.Delay<
Item 
> putAndScan;
  public com.anylogic.libraries.processmodeling.Queue<
Item 
> queue;
  public com.anylogic.libraries.processmodeling.Pickup<
Carton 
, 
Item 
> pickup;
  public com.anylogic.libraries.processmodeling.Delay<
Carton 
> waitForItemsDeliveryFromRack;

  public String getNameOf( Agent ao ) {
    if ( ao == rackPick ) return "rackPick";
    if ( ao == orderedItemsEnter ) return "orderedItemsEnter";
    if ( ao == putAndScan ) return "putAndScan";
    if ( ao == queue ) return "queue";
    if ( ao == pickup ) return "pickup";
    if ( ao == waitForItemsDeliveryFromRack ) return "waitForItemsDeliveryFromRack";
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
  protected com.anylogic.libraries.processmodeling.RackPick<Item> instantiate_rackPick_xjal() {
    com.anylogic.libraries.processmodeling.RackPick<Item> _result_xjal = new com.anylogic.libraries.processmodeling.RackPick<Item>( getEngine(), this, null ) {
      @Override
      public PalletRackAccess<?> rackSystem( Item agent ) {
        return _rackPick_rackSystem_xjal( this, agent );
      }
      @Override
      public INode destinationNode( Item agent ) {
        return _rackPick_destinationNode_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_rackPick_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, TableInput _t ) {
    self.destinationType = self._destinationType_DefaultValue_xjal();
    self.useDelay = self._useDelay_DefaultValue_xjal();
    self.movementDestination = 
self.DEST_CELL_BASE 
;
    self.useResources = self._useResources_DefaultValue_xjal();
    self.seizePolicy = self._seizePolicy_DefaultValue_xjal();
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
  private void doBeforeCreate_rackPick_xjal( com.anylogic.libraries.processmodeling.RackPick<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Enter<Item> instantiate_orderedItemsEnter_xjal() {
    com.anylogic.libraries.processmodeling.Enter<Item> _result_xjal = new com.anylogic.libraries.processmodeling.Enter<Item>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_orderedItemsEnter_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, TableInput _t ) {
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
  private void doBeforeCreate_orderedItemsEnter_xjal( com.anylogic.libraries.processmodeling.Enter<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Delay<Item> instantiate_putAndScan_xjal() {
    com.anylogic.libraries.processmodeling.Delay<Item> _result_xjal = new com.anylogic.libraries.processmodeling.Delay<Item>( getEngine(), this, null ) {
      @Override
      public double delayTime( Item agent ) {
        return _putAndScan_delayTime_xjal( this, agent );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTime() {
        return SECOND;
      }
      @Override
      public void onEnter( Item agent, double delayTime ) {
        _putAndScan_onEnter_xjal( this, agent, delayTime );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_putAndScan_xjal( final com.anylogic.libraries.processmodeling.Delay<Item> self, TableInput _t ) {
    self.type = self._type_DefaultValue_xjal();
    self.capacity = self._capacity_DefaultValue_xjal();
    self.maximumCapacity = 
true 
;
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
  private void doBeforeCreate_putAndScan_xjal( com.anylogic.libraries.processmodeling.Delay<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Queue<Item> instantiate_queue_xjal() {
    com.anylogic.libraries.processmodeling.Queue<Item> _result_xjal = new com.anylogic.libraries.processmodeling.Queue<Item>( getEngine(), this, null ) {
      @Override
      public void onEnter( Item agent ) {
        _queue_onEnter_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_queue_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, TableInput _t ) {
    self.capacity = self._capacity_DefaultValue_xjal();
    self.maximumCapacity = 
true 
;
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
  private void doBeforeCreate_queue_xjal( com.anylogic.libraries.processmodeling.Queue<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Pickup<Carton, Item> instantiate_pickup_xjal() {
    com.anylogic.libraries.processmodeling.Pickup<Carton, Item> _result_xjal = new com.anylogic.libraries.processmodeling.Pickup<Carton, Item>( getEngine(), this, null ) {
      @Override
      public boolean condition( Carton container, Item agent ) {
        return _pickup_condition_xjal( this, container, agent );
      }
      @Override
      public void onPickup( Carton container, Item agent ) {
        _pickup_onPickup_xjal( this, container, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_pickup_xjal( final com.anylogic.libraries.processmodeling.Pickup<Carton, Item> self, TableInput _t ) {
    self.pickupType = self._pickupType_DefaultValue_xjal();
    self.queueIsConnectedToPort = self._queueIsConnectedToPort_DefaultValue_xjal();
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_pickup_xjal( com.anylogic.libraries.processmodeling.Pickup<Carton, Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Delay<Carton> instantiate_waitForItemsDeliveryFromRack_xjal() {
    com.anylogic.libraries.processmodeling.Delay<Carton> _result_xjal = new com.anylogic.libraries.processmodeling.Delay<Carton>( getEngine(), this, null ) {
      @Override
      public void onEnter( Carton agent, double delayTime ) {
        _waitForItemsDeliveryFromRack_onEnter_xjal( this, agent, delayTime );
      }
      @Override
      public void onExit( Carton agent ) {
        _waitForItemsDeliveryFromRack_onExit_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_waitForItemsDeliveryFromRack_xjal( final com.anylogic.libraries.processmodeling.Delay<Carton> self, TableInput _t ) {
    self.type = 
self.MANUAL 
;
    self.capacity = self._capacity_DefaultValue_xjal();
    self.maximumCapacity = 
true 
;
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
  private void doBeforeCreate_waitForItemsDeliveryFromRack_xjal( com.anylogic.libraries.processmodeling.Delay<Carton> self, TableInput _t ) {
  }

  private PalletRackAccess<?> _rackPick_rackSystem_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, Item agent ) {
    PalletRackAccess<?> _value;
    _value = 
rack( agent ) 
;
    return _value;
  }
  private INode _rackPick_destinationNode_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, Item agent ) {
    INode _value;
    _value = 
pickingStation( agent ) 
;
    return _value;
  }
  private double _putAndScan_delayTime_xjal( final com.anylogic.libraries.processmodeling.Delay<Item> self, Item agent ) {
    double _value;
    _value = 
triangular( 15, 30, 40 ) 
;
    return _value;
  }
  private void _putAndScan_onEnter_xjal( final com.anylogic.libraries.processmodeling.Delay<Item> self, Item agent, double delayTime ) {
    
main.storingStations.get( agent.type.ordinal() ).freeWaitingItem(); 
;
  }
  private void _queue_onEnter_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, Item agent ) {
    
agent.carton.amountOfCurrentTypeReady++;
if ( agent.carton.amountOfCurrentTypeReady == agent.carton.getAmountOfItems() ) {
	waitForItemsDeliveryFromRack.stopDelay(agent.carton);
 	agent.carton.amountOfCurrentTypeReady = 0;
} 
;
  }
  private boolean _pickup_condition_xjal( final com.anylogic.libraries.processmodeling.Pickup<Carton, Item> self, Carton container, Item agent ) {
    boolean _value;
    _value = 
agent.order == container.order 
;
    return _value;
  }
  private void _pickup_onPickup_xjal( final com.anylogic.libraries.processmodeling.Pickup<Carton, Item> self, Carton container, Item agent ) {
    
agent.receive( "toClient" ); 
;
  }
  private void _waitForItemsDeliveryFromRack_onEnter_xjal( final com.anylogic.libraries.processmodeling.Delay<Carton> self, Carton agent, double delayTime ) {
    
for ( int i = 0; i < agent.getAmountOfItems() ; i++ ) 
	orderedItemsEnter.take( getItem( agent ) ); 
;
  }
  private void _waitForItemsDeliveryFromRack_onExit_xjal( final com.anylogic.libraries.processmodeling.Delay<Carton> self, Carton agent ) {
    
agent.itemsAreTaken(); 
;
  }
  // Functions

  
Item 
 getItem( Carton carton ) { 

Item gift = randomWhere( main.storedItems, item -> item.type == carton.currentTypeOfItemsToTake && 
								item.order == carton.order  && item.carton == null ); 

gift.carton = carton;
return gift; 
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
  protected static final int _pickingGroup = 3;

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
      case _pickingGroup:
        if (true) {
          ShapeGroup self = this.pickingGroup;
          
return true; 
        }
        break;
      default: return super.onShapeClick( _shape, index, clickx, clicky );
 	}
 	return false;
  }
  
  protected ShapeRoundedRectangle roundRectangle;
  protected ShapeText text;
  protected ShapeGroup pickingGroup;
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
        SHAPE_DRAW_2D, true,-17.0, -8.0, 0.0, 0.0, 
        black,"Picking",
        _text_Font, ALIGNMENT_LEFT );

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {				
    pickingGroup = new ShapeGroup( PickingStation.this, SHAPE_DRAW_2D, true, 130.0, 100.0, 0.0, 0.0
	
	     , roundRectangle
	     , text ) {

      @Override
      @AnyLogicInternalCodegenAPI
      public boolean onClick( double clickx, double clicky ) {
        return onShapeClick( _pickingGroup, 0, clickx, clicky );
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
Object > in = new Port< Object, Object >( this );
  public Port< 
Object 
, 
Object > out = new Port< Object, Object >( this );

  @AnyLogicInternalCodegenAPI
  public String getNameOf( Port<?, ?> _p ) {
    if( _p == this.in ) return "in";
    if( _p == this.out ) return "out";
    return super.getNameOf( _p ); 
  }


  /**
   * Constructor
   */
  public PickingStation( Engine engine, Agent owner, AgentList<? extends PickingStation> ownerPopulation ) {
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
    rackPick = instantiate_rackPick_xjal();
    orderedItemsEnter = instantiate_orderedItemsEnter_xjal();
    putAndScan = instantiate_putAndScan_xjal();
    queue = instantiate_queue_xjal();
    pickup = instantiate_pickup_xjal();
    waitForItemsDeliveryFromRack = instantiate_waitForItemsDeliveryFromRack_xjal();
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
  public PickingStation() {
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
    setupPlainVariables_PickingStation_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( PickingStation.this, true, 0, 0, 0, 0 , level );
    // Creating embedded object instances
    instantiatePopulations_xjal();
    icon = new ShapeModelElementsGroup( PickingStation.this, getElementProperty( "warehouse_conveyor.PickingStation.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS ) , pickingGroup );
    icon.setIconOffsets( 100.0, 70.0 );
    // Creating non-replicated embedded objects
    setupParameters_rackPick_xjal( rackPick, null );
    doBeforeCreate_rackPick_xjal( rackPick, null );
    rackPick.createAsEmbedded();
    setupParameters_orderedItemsEnter_xjal( orderedItemsEnter, null );
    doBeforeCreate_orderedItemsEnter_xjal( orderedItemsEnter, null );
    orderedItemsEnter.createAsEmbedded();
    setupParameters_putAndScan_xjal( putAndScan, null );
    doBeforeCreate_putAndScan_xjal( putAndScan, null );
    putAndScan.createAsEmbedded();
    setupParameters_queue_xjal( queue, null );
    doBeforeCreate_queue_xjal( queue, null );
    queue.createAsEmbedded();
    setupParameters_pickup_xjal( pickup, null );
    doBeforeCreate_pickup_xjal( pickup, null );
    pickup.createAsEmbedded();
    setupParameters_waitForItemsDeliveryFromRack_xjal( waitForItemsDeliveryFromRack, null );
    doBeforeCreate_waitForItemsDeliveryFromRack_xjal( waitForItemsDeliveryFromRack, null );
    waitForItemsDeliveryFromRack.createAsEmbedded();
	 // Port connectors with non-replicated objects
    orderedItemsEnter.out.connect( rackPick.in ); // connector
    rackPick.out.connect( putAndScan.in ); // connector1
    queue.out.connect( pickup.inPickup ); // connector3
    out.map( pickup.out ); // connector5
    pickup.in.connect( waitForItemsDeliveryFromRack.out ); // connector6
    in.map( waitForItemsDeliveryFromRack.in ); // connector7
    putAndScan.out.connect( queue.in ); // connector2
    // Creating replicated embedded objects
    setupInitialConditions_xjal( PickingStation.class );
    // Dynamic initialization of persistent elements
    _createPersistentElementsBS0_xjal();
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
    rackPick.startAsEmbedded();
    orderedItemsEnter.startAsEmbedded();
    putAndScan.startAsEmbedded();
    queue.startAsEmbedded();
    pickup.startAsEmbedded();
    waitForItemsDeliveryFromRack.startAsEmbedded();
  }
 

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_PickingStation_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_PickingStation_xjal() {
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
    list.add( rackPick );
    list.add( orderedItemsEnter );
    list.add( putAndScan );
    list.add( queue );
    list.add( pickup );
    list.add( waitForItemsDeliveryFromRack );
    return list;
  }

  public AgentList<? extends PickingStation> getPopulation() {
    return (AgentList<? extends PickingStation>) super.getPopulation();
  }

  public List<? extends PickingStation> agentsInRange( double distance ) {
    return (List<? extends PickingStation>) super.agentsInRange( distance );
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    in.onDestroy();
    out.onDestroy();
    rackPick.onDestroy();
    orderedItemsEnter.onDestroy();
    putAndScan.onDestroy();
    queue.onDestroy();
    pickup.onDestroy();
    waitForItemsDeliveryFromRack.onDestroy();
    super.onDestroy();
  }

  @AnyLogicInternalCodegenAPI
  @Override
  public void doFinish() {
    super.doFinish();
    rackPick.doFinish();
    orderedItemsEnter.doFinish();
    putAndScan.doFinish();
    queue.doFinish();
    pickup.doFinish();
    waitForItemsDeliveryFromRack.doFinish();
  }



}
