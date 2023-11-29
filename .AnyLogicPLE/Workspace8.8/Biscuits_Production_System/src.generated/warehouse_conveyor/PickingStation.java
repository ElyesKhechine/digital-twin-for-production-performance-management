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
    return 
 
;
  }

 
  public 
PointNode  pickingStation( Item item ) {
    final PickingStation self = this;
    return 
 
;
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
      // Additional class code

 
      // End of additional class code
      @Override
      public PalletRackAccess<?> rackSystem( Item agent ) {
        return _rackPick_rackSystem_xjal( this, agent );
      }
      @Override
      public INode destinationNode( Item agent ) {
        return _rackPick_destinationNode_xjal( this, agent );
      }
      @Override
      public Attractor destinationAttractor( Item agent ) {
        return _rackPick_destinationAttractor_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool destinationResource( Item agent ) {
        return _rackPick_destinationResource_xjal( this, agent );
      }
      @Override
      public Agent destinationAgent( Item agent ) {
        return _rackPick_destinationAgent_xjal( this, agent );
      }
      @Override
      public double destinationX( Item agent ) {
        return _rackPick_destinationX_xjal( this, agent );
      }
      @Override
      public double destinationY( Item agent ) {
        return _rackPick_destinationY_xjal( this, agent );
      }
      @Override
      public double destinationZ( Item agent ) {
        return _rackPick_destinationZ_xjal( this, agent );
      }
      @Override
      public double delayTime( Item agent, com.anylogic.libraries.processmodeling.RackSystem rackSystem, PalletRack palletRack, int row, int position, int level ) {
        return _rackPick_delayTime_xjal( this, agent, rackSystem, palletRack, row, position, level );
      }
      @Override
      public double dropTimePerLevel( Item agent ) {
        return _rackPick_dropTimePerLevel_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool[][] resourceSets( Item agent ) {
        return _rackPick_resourceSets_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool movingResource( Item agent ) {
        return _rackPick_movingResource_xjal( this, agent );
      }
      @Override
      public double priority( Item agent ) {
        return _rackPick_priority_xjal( this, agent );
      }
      @Override
      public boolean taskMayPreemptOtherTasks( Item agent ) {
        return _rackPick_taskMayPreemptOtherTasks_xjal( this, agent );
      }
      @Override
      public com.anylogic.engine.TaskPreemptionPolicy taskPreemptionPolicy( Item agent ) {
        return _rackPick_taskPreemptionPolicy_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.Enter terminatedTasksEnter( Item agent, Agent unit ) {
        return _rackPick_terminatedTasksEnter_xjal( this, agent, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.WrapUpPolicy wrapUpTaskPolicyType( Item agent, Agent unit ) {
        return _rackPick_wrapUpTaskPolicyType_xjal( this, agent, unit );
      }
      @Override
      public double wrapUpTaskPriority( Item agent, Agent unit ) {
        return _rackPick_wrapUpTaskPriority_xjal( this, agent, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy wrapUpTaskPreemptionPolicy( Item agent, Agent unit ) {
        return _rackPick_wrapUpTaskPreemptionPolicy_xjal( this, agent, unit );
      }
      @Override
      public boolean resourceChoiceCondition( Item agent, Agent unit, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
        return _rackPick_resourceChoiceCondition_xjal( this, agent, unit, pool );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceSelectionMode resourceSelectionMode( Item agent, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
        return _rackPick_resourceSelectionMode_xjal( this, agent, pool );
      }
      @Override
      public double resourceRating( Agent unit, Item agent ) {
        return _rackPick_resourceRating_xjal( this, unit, agent );
      }
      @Override
      public boolean resourceComparison( Agent unit1, Agent unit2, Item agent ) {
        return _rackPick_resourceComparison_xjal( this, unit1, unit2, agent );
      }
      @Override
      public void onEnter( Item agent ) {
        _rackPick_onEnter_xjal( this, agent );
      }
      @Override
      public void onResourcesArrived( Item agent, com.anylogic.libraries.processmodeling.RackSystem rackSystem, PalletRack palletRack, int row, int position, int level ) {
        _rackPick_onResourcesArrived_xjal( this, agent, rackSystem, palletRack, row, position, level );
      }
      @Override
      public void onDelayStarts( Item agent, double delayTime, com.anylogic.libraries.processmodeling.RackSystem rackSystem, PalletRack palletRack, int row, int position, int level ) {
        _rackPick_onDelayStarts_xjal( this, agent, delayTime, rackSystem, palletRack, row, position, level );
      }
      @Override
      public void onDelayEnds( Item agent ) {
        _rackPick_onDelayEnds_xjal( this, agent );
      }
      @Override
      public void onExit( Item agent ) {
        _rackPick_onExit_xjal( this, agent );
      }
      @Override
      public void onTaskTerminated( Item agent, Agent unit ) {
        _rackPick_onTaskTerminated_xjal( this, agent, unit );
      }
      @Override
      public void onTaskSuspended( Item agent, Agent unit ) {
        _rackPick_onTaskSuspended_xjal( this, agent, unit );
      }
      @Override
      public void onTaskResumed( Item agent, Agent unit ) {
        _rackPick_onTaskResumed_xjal( this, agent, unit );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_rackPick_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, TableInput _t ) {
    self.destinationType = 
self.DEST_NODE 
;
    self.useDelay = 
false 
;
    self.movementDestination = 
self.DEST_CELL_BASE 
;
    self.useResources = 
false 
;
    self.seizePolicy = 
self.SEIZE_WHOLE_SET 
;
    self.moveWithSpeedOfResourceUnit = 
false 
;
    self.suspendResumeEntities = 
true 
;
    self.resourcesGoHome = 
true 
;
    self.customizeResourceChoice = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_rackPick_xjal( com.anylogic.libraries.processmodeling.RackPick<Item> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Enter<Item> instantiate_orderedItemsEnter_xjal() {
    com.anylogic.libraries.processmodeling.Enter<Item> _result_xjal = new com.anylogic.libraries.processmodeling.Enter<Item>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public double locationX( Item agent ) {
        return _orderedItemsEnter_locationX_xjal( this, agent );
      }
      @Override
      public double locationY( Item agent ) {
        return _orderedItemsEnter_locationY_xjal( this, agent );
      }
      @Override
      public double locationZ( Item agent ) {
        return _orderedItemsEnter_locationZ_xjal( this, agent );
      }
      @Override
      public double locationLatitude( Item agent ) {
        return _orderedItemsEnter_locationLatitude_xjal( this, agent );
      }
      @Override
      public double locationLongitude( Item agent ) {
        return _orderedItemsEnter_locationLongitude_xjal( this, agent );
      }
      @Override
      public String locationGeoPlaceName( Item agent ) {
        return _orderedItemsEnter_locationGeoPlaceName_xjal( this, agent );
      }
      @Override
      public INetwork locationNetwork( Item agent ) {
        return _orderedItemsEnter_locationNetwork_xjal( this, agent );
      }
      @Override
      public Level locationLevel( Item agent ) {
        return _orderedItemsEnter_locationLevel_xjal( this, agent );
      }
      @Override
      public INode locationNode( Item agent ) {
        return _orderedItemsEnter_locationNode_xjal( this, agent );
      }
      @Override
      public Attractor locationAttractor( Item agent ) {
        return _orderedItemsEnter_locationAttractor_xjal( this, agent );
      }
      @Override
      public double speed( Item agent ) {
        return _orderedItemsEnter_speed_xjal( this, agent );
      }
      @Override
      public boolean changeDimensions( Item agent ) {
        return _orderedItemsEnter_changeDimensions_xjal( this, agent );
      }
      @Override
      public double length( Item agent ) {
        return _orderedItemsEnter_length_xjal( this, agent );
      }
      @Override
      public double width( Item agent ) {
        return _orderedItemsEnter_width_xjal( this, agent );
      }
      @Override
      public double height( Item agent ) {
        return _orderedItemsEnter_height_xjal( this, agent );
      }
      @Override
      public AgentList population( Item agent ) {
        return _orderedItemsEnter_population_xjal( this, agent );
      }
      @Override
      public void onEnter( Item agent ) {
        _orderedItemsEnter_onEnter_xjal( this, agent );
      }
      @Override
      public void onRemove( Item agent ) {
        _orderedItemsEnter_onRemove_xjal( this, agent );
      }
      @Override
      public void onAtEnter( Item agent ) {
        _orderedItemsEnter_onAtEnter_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_orderedItemsEnter_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, TableInput _t ) {
    self.locationType = 
self.LOCATION_NOT_SPECIFIED 
;
    self.locationXYZInNetwork = 
false 
;
    self.addToCustomPopulation = 
false 
;
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
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Delay<Item> instantiate_putAndScan_xjal() {
    com.anylogic.libraries.processmodeling.Delay<Item> _result_xjal = new com.anylogic.libraries.processmodeling.Delay<Item>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
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
      @Override
      public void onAtExit( Item agent ) {
        _putAndScan_onAtExit_xjal( this, agent );
      }
      @Override
      public void onExit( Item agent ) {
        _putAndScan_onExit_xjal( this, agent );
      }
      @Override
      public void onRemove( Item agent ) {
        _putAndScan_onRemove_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_putAndScan_xjal( final com.anylogic.libraries.processmodeling.Delay<Item> self, TableInput _t ) {
    self.type = 
self.TIMEOUT 
;
    self.capacity = 
1 
;
    self.maximumCapacity = 
true 
;
    self.entityLocation = 
 
;
    self.pushProtocol = 
false 
;
    self.restoreEntityLocationOnExit = 
true 
;
    self.forceStatisticsCollection = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_putAndScan_xjal( com.anylogic.libraries.processmodeling.Delay<Item> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Queue<Item> instantiate_queue_xjal() {
    com.anylogic.libraries.processmodeling.Queue<Item> _result_xjal = new com.anylogic.libraries.processmodeling.Queue<Item>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public double priority( Item agent ) {
        return _queue_priority_xjal( this, agent );
      }
      @Override
      public boolean comparison( Item agent1, Item agent2 ) {
        return _queue_comparison_xjal( this, agent1, agent2 );
      }
      @Override
      public double timeout( Item agent ) {
        return _queue_timeout_xjal( this, agent );
      }
      @Override
      public void onEnter( Item agent ) {
        _queue_onEnter_xjal( this, agent );
      }
      @Override
      public void onAtExit( Item agent ) {
        _queue_onAtExit_xjal( this, agent );
      }
      @Override
      public void onExit( Item agent ) {
        _queue_onExit_xjal( this, agent );
      }
      @Override
      public void onExitTimeout( Item agent ) {
        _queue_onExitTimeout_xjal( this, agent );
      }
      @Override
      public void onExitPreempted( Item agent ) {
        _queue_onExitPreempted_xjal( this, agent );
      }
      @Override
      public void onRemove( Item agent ) {
        _queue_onRemove_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_queue_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, TableInput _t ) {
    self.capacity = 
100 
;
    self.maximumCapacity = 
true 
;
    self.entityLocation = 
 
;
    self.queuing = 
self.QUEUING_FIFO 
;
    self.enableTimeout = 
false 
;
    self.enablePreemption = 
false 
;
    self.restoreEntityLocationOnExit = 
true 
;
    self.forceStatisticsCollection = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_queue_xjal( com.anylogic.libraries.processmodeling.Queue<Item> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Pickup<Carton, Item> instantiate_pickup_xjal() {
    com.anylogic.libraries.processmodeling.Pickup<Carton, Item> _result_xjal = new com.anylogic.libraries.processmodeling.Pickup<Carton, Item>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public boolean condition( Carton container, Item agent ) {
        return _pickup_condition_xjal( this, container, agent );
      }
      @Override
      public int quantity( Carton container ) {
        return _pickup_quantity_xjal( this, container );
      }
      @Override
      public com.anylogic.libraries.processmodeling.Queue queue( Carton container ) {
        return _pickup_queue_xjal( this, container );
      }
      @Override
      public void onEnter( Carton container ) {
        _pickup_onEnter_xjal( this, container );
      }
      @Override
      public void onPickup( Carton container, Item agent ) {
        _pickup_onPickup_xjal( this, container, agent );
      }
      @Override
      public void onExit( Carton container ) {
        _pickup_onExit_xjal( this, container );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_pickup_xjal( final com.anylogic.libraries.processmodeling.Pickup<Carton, Item> self, TableInput _t ) {
    self.pickupType = 
self.BY_CONDITION 
;
    self.queueIsConnectedToPort = 
true 
;
    self.pushProtocol = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_pickup_xjal( com.anylogic.libraries.processmodeling.Pickup<Carton, Item> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Delay<Carton> instantiate_waitForItemsDeliveryFromRack_xjal() {
    com.anylogic.libraries.processmodeling.Delay<Carton> _result_xjal = new com.anylogic.libraries.processmodeling.Delay<Carton>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public double delayTime( Carton agent ) {
        return _waitForItemsDeliveryFromRack_delayTime_xjal( this, agent );
      }
      @Override
      public void onEnter( Carton agent, double delayTime ) {
        _waitForItemsDeliveryFromRack_onEnter_xjal( this, agent, delayTime );
      }
      @Override
      public void onAtExit( Carton agent ) {
        _waitForItemsDeliveryFromRack_onAtExit_xjal( this, agent );
      }
      @Override
      public void onExit( Carton agent ) {
        _waitForItemsDeliveryFromRack_onExit_xjal( this, agent );
      }
      @Override
      public void onRemove( Carton agent ) {
        _waitForItemsDeliveryFromRack_onRemove_xjal( this, agent );
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
    self.capacity = 
1 
;
    self.maximumCapacity = 
true 
;
    self.entityLocation = 
 
;
    self.pushProtocol = 
false 
;
    self.restoreEntityLocationOnExit = 
true 
;
    self.forceStatisticsCollection = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_waitForItemsDeliveryFromRack_xjal( com.anylogic.libraries.processmodeling.Delay<Carton> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
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
  private Attractor _rackPick_destinationAttractor_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, Item agent ) {
    Attractor _value;
    _value = 
 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool _rackPick_destinationResource_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, Item agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool _value;
    _value = 
 
;
    return _value;
  }
  private Agent _rackPick_destinationAgent_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, Item agent ) {
    Agent _value;
    _value = 
 
;
    return _value;
  }
  private double _rackPick_destinationX_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, Item agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _rackPick_destinationY_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, Item agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _rackPick_destinationZ_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, Item agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _rackPick_delayTime_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, Item agent, com.anylogic.libraries.processmodeling.RackSystem rackSystem, PalletRack palletRack, int row, int position, int level ) {
    double _value;
    _value = 
triangular( 0.5, 1, 1.5 ) 
;
    return _value;
  }
  private double _rackPick_dropTimePerLevel_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, Item agent ) {
    double _value;
    _value = 
10 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool[][] _rackPick_resourceSets_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, Item agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool[][] _value;
    _value = 
{{}} 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool _rackPick_movingResource_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, Item agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool _value;
    _value = 
 
;
    return _value;
  }
  private double _rackPick_priority_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, Item agent ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _rackPick_taskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, Item agent ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.engine.TaskPreemptionPolicy _rackPick_taskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, Item agent ) {
    com.anylogic.engine.TaskPreemptionPolicy _value;
    _value = 
self.PP_NO_PREEMPTION 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.Enter _rackPick_terminatedTasksEnter_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, Item agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.Enter _value;
    _value = 
 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.WrapUpPolicy _rackPick_wrapUpTaskPolicyType_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, Item agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.WrapUpPolicy _value;
    _value = 
self.WRAP_UP_ALWAYS 
;
    return _value;
  }
  private double _rackPick_wrapUpTaskPriority_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, Item agent, Agent unit ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _rackPick_wrapUpTaskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, Item agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _value;
    _value = 
self.WPP_NO_PREEMPTION 
;
    return _value;
  }
  private boolean _rackPick_resourceChoiceCondition_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, Item agent, Agent unit, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceSelectionMode _rackPick_resourceSelectionMode_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, Item agent, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
    com.anylogic.libraries.processmodeling.ResourceSelectionMode _value;
    _value = 
self.RESOURCE_SELECTION_SOME_UNIT 
;
    return _value;
  }
  private double _rackPick_resourceRating_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, Agent unit, Item agent ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _rackPick_resourceComparison_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, Agent unit1, Agent unit2, Item agent ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private void _rackPick_onEnter_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, Item agent ) {
    
 
;
  }
  private void _rackPick_onResourcesArrived_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, Item agent, com.anylogic.libraries.processmodeling.RackSystem rackSystem, PalletRack palletRack, int row, int position, int level ) {
    
 
;
  }
  private void _rackPick_onDelayStarts_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, Item agent, double delayTime, com.anylogic.libraries.processmodeling.RackSystem rackSystem, PalletRack palletRack, int row, int position, int level ) {
    
 
;
  }
  private void _rackPick_onDelayEnds_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, Item agent ) {
    
 
;
  }
  private void _rackPick_onExit_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, Item agent ) {
    
 
;
  }
  private void _rackPick_onTaskTerminated_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, Item agent, Agent unit ) {
    
 
;
  }
  private void _rackPick_onTaskSuspended_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, Item agent, Agent unit ) {
    
 
;
  }
  private void _rackPick_onTaskResumed_xjal( final com.anylogic.libraries.processmodeling.RackPick<Item> self, Item agent, Agent unit ) {
    
 
;
  }
  private double _orderedItemsEnter_locationX_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _orderedItemsEnter_locationY_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _orderedItemsEnter_locationZ_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _orderedItemsEnter_locationLatitude_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _orderedItemsEnter_locationLongitude_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private String _orderedItemsEnter_locationGeoPlaceName_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    String _value;
    _value = 
 
;
    return _value;
  }
  private INetwork _orderedItemsEnter_locationNetwork_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    INetwork _value;
    _value = 
 
;
    return _value;
  }
  private Level _orderedItemsEnter_locationLevel_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    Level _value;
    _value = 
 
;
    return _value;
  }
  private INode _orderedItemsEnter_locationNode_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    INode _value;
    _value = 
 
;
    return _value;
  }
  private Attractor _orderedItemsEnter_locationAttractor_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    Attractor _value;
    _value = 
 
;
    return _value;
  }
  private double _orderedItemsEnter_speed_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    double _value;
    _value = 
10 
;
    return _value;
  }
  private boolean _orderedItemsEnter_changeDimensions_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _orderedItemsEnter_length_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private double _orderedItemsEnter_width_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private double _orderedItemsEnter_height_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private AgentList _orderedItemsEnter_population_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    AgentList _value;
    _value = 
 
;
    return _value;
  }
  private void _orderedItemsEnter_onEnter_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    
 
;
  }
  private void _orderedItemsEnter_onRemove_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    
 
;
  }
  private void _orderedItemsEnter_onAtEnter_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    
 
;
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
  private void _putAndScan_onAtExit_xjal( final com.anylogic.libraries.processmodeling.Delay<Item> self, Item agent ) {
    
 
;
  }
  private void _putAndScan_onExit_xjal( final com.anylogic.libraries.processmodeling.Delay<Item> self, Item agent ) {
    
 
;
  }
  private void _putAndScan_onRemove_xjal( final com.anylogic.libraries.processmodeling.Delay<Item> self, Item agent ) {
    
 
;
  }
  private double _queue_priority_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, Item agent ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _queue_comparison_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, Item agent1, Item agent2 ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _queue_timeout_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, Item agent ) {
    double _value;
    _value = 
100 
;
    return _value;
  }
  private void _queue_onEnter_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, Item agent ) {
    
agent.carton.amountOfCurrentTypeReady++;
if ( agent.carton.amountOfCurrentTypeReady == agent.carton.getAmountOfItems() ) {
	waitForItemsDeliveryFromRack.stopDelay(agent.carton);
 	agent.carton.amountOfCurrentTypeReady = 0;
} 
;
  }
  private void _queue_onAtExit_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, Item agent ) {
    
 
;
  }
  private void _queue_onExit_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, Item agent ) {
    
 
;
  }
  private void _queue_onExitTimeout_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, Item agent ) {
    
 
;
  }
  private void _queue_onExitPreempted_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, Item agent ) {
    
 
;
  }
  private void _queue_onRemove_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, Item agent ) {
    
 
;
  }
  private boolean _pickup_condition_xjal( final com.anylogic.libraries.processmodeling.Pickup<Carton, Item> self, Carton container, Item agent ) {
    boolean _value;
    _value = 
agent.order == container.order 
;
    return _value;
  }
  private int _pickup_quantity_xjal( final com.anylogic.libraries.processmodeling.Pickup<Carton, Item> self, Carton container ) {
    int _value;
    _value = 
1 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.Queue _pickup_queue_xjal( final com.anylogic.libraries.processmodeling.Pickup<Carton, Item> self, Carton container ) {
    com.anylogic.libraries.processmodeling.Queue _value;
    _value = 
 
;
    return _value;
  }
  private void _pickup_onEnter_xjal( final com.anylogic.libraries.processmodeling.Pickup<Carton, Item> self, Carton container ) {
    
 
;
  }
  private void _pickup_onPickup_xjal( final com.anylogic.libraries.processmodeling.Pickup<Carton, Item> self, Carton container, Item agent ) {
    
agent.receive( "toClient" ); 
;
  }
  private void _pickup_onExit_xjal( final com.anylogic.libraries.processmodeling.Pickup<Carton, Item> self, Carton container ) {
    
 
;
  }
  private double _waitForItemsDeliveryFromRack_delayTime_xjal( final com.anylogic.libraries.processmodeling.Delay<Carton> self, Carton agent ) {
    double _value;
    _value = 
triangular( 0.5, 1, 1.5 ) 
;
    return _value;
  }
  private void _waitForItemsDeliveryFromRack_onEnter_xjal( final com.anylogic.libraries.processmodeling.Delay<Carton> self, Carton agent, double delayTime ) {
    
for ( int i = 0; i < agent.getAmountOfItems() ; i++ ) 
	orderedItemsEnter.take( getItem( agent ) ); 
;
  }
  private void _waitForItemsDeliveryFromRack_onAtExit_xjal( final com.anylogic.libraries.processmodeling.Delay<Carton> self, Carton agent ) {
    
 
;
  }
  private void _waitForItemsDeliveryFromRack_onExit_xjal( final com.anylogic.libraries.processmodeling.Delay<Carton> self, Carton agent ) {
    
agent.itemsAreTaken(); 
;
  }
  private void _waitForItemsDeliveryFromRack_onRemove_xjal( final com.anylogic.libraries.processmodeling.Delay<Carton> self, Carton agent ) {
    
 
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
      case _roundRectangle:
        if (true) {
          ShapeRoundedRectangle self = this.roundRectangle;
          
 
        }
        break;
      case _text:
        if (true) {
          ShapeText self = this.text;
          
 
        }
        break;
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
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void onShapeGroupDraw( int _shape, int index ) {
    switch( _shape ) {
      case _pickingGroup:
          
 
        break;
      default:
        super.onShapeGroupDraw( _shape, index );
        break;
    }
  }
  
  // Stub function for code completion support (internal)
  @AnyLogicInternalCodegenAPI
  private void _stubForReplication_xjal() {
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
  }

  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _roundRectangle_SetDynamicParams_xjal( ShapeRoundedRectangle shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setWidth(
 
);
    shape.setHeight(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setRadius(
 
);
    shape.setRotation(
 
);
    shape.setLineColor(
 
);
    shape.setFillColor(
 
);
    shape.setLineWidth(
 
);
    shape.setLineStyle(
 
);
 	}
  }
  
  protected ShapeRoundedRectangle roundRectangle;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text_SetDynamicParams_xjal( ShapeText shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setZ(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setRotation(
 
);
    shape.setColor(
 
);
    shape.setText(
 
);
    shape.setFont(
 
);
    shape.setAlignment(
 
);
 	}
  }
  
  protected ShapeText text;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _pickingGroup_SetDynamicParams_xjal( ShapeGroup shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setZ(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setScaleZ(
 
);
    shape.setRotationY(
 
);
    shape.setRotationX(
 
);
    shape.setRotationZ(
 
);
 	}
  }
  
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
		2.0, LINE_STYLE_SOLID	 ) {
      @Override
      public void updateDynamicProperties() {
        _roundRectangle_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    text = new ShapeText(
        SHAPE_DRAW_2D, true,-17.0, -8.0, 0.0, 0.0, 
        black,"Picking",
        _text_Font, ALIGNMENT_LEFT ) {
      @Override
      public void updateDynamicProperties() {
        _text_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {				
    pickingGroup = new ShapeGroup( PickingStation.this, SHAPE_DRAW_2D, true, 130.0, 100.0, 0.0, 0.0
	
	     , roundRectangle
	     , text ) {
      @Override
      public void updateDynamicProperties() {
        _pickingGroup_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }

      @Override
      @AnyLogicInternalCodegenAPI
      public boolean onClick( double clickx, double clicky ) {
        return onShapeClick( _pickingGroup, 0, clickx, clicky );
      }

      @Override
      @AnyLogicInternalCodegenAPI
      public void onDraw() {
        onShapeGroupDraw( _pickingGroup, 0 );
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

  @AnyLogicInternalCodegenAPI
  public boolean executeOnSendActionOf( Port<?, ?> _p, Object _msg ) {
    if( _p == this.in ) {
      Port< Object, Object > self = this.in;
      Object msg = (Object) _msg;

 
    }
    if( _p == this.out ) {
      Port< Object, Object > self = this.out;
      Object msg = (Object) _msg;

 
    }
    return super.executeOnSendActionOf( _p, _msg );
  }

  @AnyLogicInternalCodegenAPI
  public boolean executeOnReceiveActionOf( Port<?, ?> _p, Object _msg ) {
    if( _p == this.in ) {
      Port< Object, Object > self = this.in;
      Object msg = (Object) _msg;
      
 
    }
    if( _p == this.out ) {
      Port< Object, Object > self = this.out;
      Object msg = (Object) _msg;
      
 
    }
    return super.executeOnReceiveActionOf( _p, _msg );
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
    rackPick.startAsEmbedded();
    orderedItemsEnter.startAsEmbedded();
    putAndScan.startAsEmbedded();
    queue.startAsEmbedded();
    pickup.startAsEmbedded();
    waitForItemsDeliveryFromRack.startAsEmbedded();
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
    // On destroy code
    
 
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

  // Additional class code

 
  // End of additional class code


}
