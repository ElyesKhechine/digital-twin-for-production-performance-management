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
ResourcePool  asrsResource;

  /**
   * Returns default value for parameter <code>asrsResource</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public ResourcePool _asrsResource_DefaultValue_xjal() {
    final Storing self = this;
    return 
 
;
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

 
;
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
      // Additional class code

 
      // End of additional class code
      @Override
      public PalletRackAccess<?> rackSystem( Item agent ) {
        return _rackStore_rackSystem_xjal( this, agent );
      }
      @Override
      public int row( Item agent ) {
        return _rackStore_row_xjal( this, agent );
      }
      @Override
      public int position( Item agent ) {
        return _rackStore_position_xjal( this, agent );
      }
      @Override
      public int level( Item agent ) {
        return _rackStore_level_xjal( this, agent );
      }
      @Override
      public boolean leftAisle( Item agent, com.anylogic.libraries.processmodeling.RackSystem rackSystem, PalletRack palletRack ) {
        return _rackStore_leftAisle_xjal( this, agent, rackSystem, palletRack );
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
      public double delayTime( Item agent, com.anylogic.libraries.processmodeling.RackSystem rackSystem, PalletRack palletRack, int row, int position, int level ) {
        return _rackStore_delayTime_xjal( this, agent, rackSystem, palletRack, row, position, level );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool[][] resourceSets( Item agent ) {
        return _rackStore_resourceSets_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool movingResource( Item agent ) {
        return _rackStore_movingResource_xjal( this, agent );
      }
      @Override
      public double priority( Item agent ) {
        return _rackStore_priority_xjal( this, agent );
      }
      @Override
      public boolean taskMayPreemptOtherTasks( Item agent ) {
        return _rackStore_taskMayPreemptOtherTasks_xjal( this, agent );
      }
      @Override
      public com.anylogic.engine.TaskPreemptionPolicy taskPreemptionPolicy( Item agent ) {
        return _rackStore_taskPreemptionPolicy_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.Enter terminatedTasksEnter( Item agent, Agent unit ) {
        return _rackStore_terminatedTasksEnter_xjal( this, agent, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.WrapUpPolicy wrapUpTaskPolicyType( Item agent, Agent unit ) {
        return _rackStore_wrapUpTaskPolicyType_xjal( this, agent, unit );
      }
      @Override
      public double wrapUpTaskPriority( Item agent, Agent unit ) {
        return _rackStore_wrapUpTaskPriority_xjal( this, agent, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy wrapUpTaskPreemptionPolicy( Item agent, Agent unit ) {
        return _rackStore_wrapUpTaskPreemptionPolicy_xjal( this, agent, unit );
      }
      @Override
      public boolean resourceChoiceCondition( Item agent, Agent unit, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
        return _rackStore_resourceChoiceCondition_xjal( this, agent, unit, pool );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceSelectionMode resourceSelectionMode( Item agent, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
        return _rackStore_resourceSelectionMode_xjal( this, agent, pool );
      }
      @Override
      public double resourceRating( Agent unit, Item agent ) {
        return _rackStore_resourceRating_xjal( this, unit, agent );
      }
      @Override
      public boolean resourceComparison( Agent unit1, Agent unit2, Item agent ) {
        return _rackStore_resourceComparison_xjal( this, unit1, unit2, agent );
      }
      @Override
      public void onEnter( Item agent ) {
        _rackStore_onEnter_xjal( this, agent );
      }
      @Override
      public void onResourcesArrived( Item agent ) {
        _rackStore_onResourcesArrived_xjal( this, agent );
      }
      @Override
      public void onDelayStarts( Item agent, double delayTime, com.anylogic.libraries.processmodeling.RackSystem rackSystem, PalletRack palletRack, int row, int position, int level ) {
        _rackStore_onDelayStarts_xjal( this, agent, delayTime, rackSystem, palletRack, row, position, level );
      }
      @Override
      public void onDelayEnds( Item agent ) {
        _rackStore_onDelayEnds_xjal( this, agent );
      }
      @Override
      public void onExit( Item agent, com.anylogic.libraries.processmodeling.RackSystem rackSystem, PalletRack palletRack, int row, int position, int level ) {
        _rackStore_onExit_xjal( this, agent, rackSystem, palletRack, row, position, level );
      }
      @Override
      public void onTaskTerminated( Item agent, Agent unit ) {
        _rackStore_onTaskTerminated_xjal( this, agent, unit );
      }
      @Override
      public void onTaskSuspended( Item agent, Agent unit ) {
        _rackStore_onTaskSuspended_xjal( this, agent, unit );
      }
      @Override
      public void onTaskResumed( Item agent, Agent unit ) {
        _rackStore_onTaskResumed_xjal( this, agent, unit );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_rackStore_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, TableInput _t ) {
    self.autoChooseCell = 
true 
;
    self.closeToFront = 
false 
;
    self.movementDestination = 
self.DEST_CELL_LEVEL 
;
    self.useDelay = 
false 
;
    self.entityLocationQueue = 
asrsResource.homeNodes[0] 
;
    self.useResources = 
true 
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
  private void doBeforeCreate_rackStore_xjal( com.anylogic.libraries.processmodeling.RackStore<Item> self, TableInput _t ) {
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
  protected com.anylogic.libraries.processmodeling.Queue<Item> instantiate_queueToRack_xjal() {
    com.anylogic.libraries.processmodeling.Queue<Item> _result_xjal = new com.anylogic.libraries.processmodeling.Queue<Item>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public double priority( Item agent ) {
        return _queueToRack_priority_xjal( this, agent );
      }
      @Override
      public boolean comparison( Item agent1, Item agent2 ) {
        return _queueToRack_comparison_xjal( this, agent1, agent2 );
      }
      @Override
      public double timeout( Item agent ) {
        return _queueToRack_timeout_xjal( this, agent );
      }
      @Override
      public void onEnter( Item agent ) {
        _queueToRack_onEnter_xjal( this, agent );
      }
      @Override
      public void onAtExit( Item agent ) {
        _queueToRack_onAtExit_xjal( this, agent );
      }
      @Override
      public void onExit( Item agent ) {
        _queueToRack_onExit_xjal( this, agent );
      }
      @Override
      public void onExitTimeout( Item agent ) {
        _queueToRack_onExitTimeout_xjal( this, agent );
      }
      @Override
      public void onExitPreempted( Item agent ) {
        _queueToRack_onExitPreempted_xjal( this, agent );
      }
      @Override
      public void onRemove( Item agent ) {
        _queueToRack_onRemove_xjal( this, agent );
      }
	};
    
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
    self.maximumCapacity = 
false 
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
  private void doBeforeCreate_queueToRack_xjal( com.anylogic.libraries.processmodeling.Queue<Item> self, TableInput _t ) {
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
  protected com.anylogic.libraries.material_handling.ConveyorExit<Item> instantiate_conveyorExit_xjal() {
    com.anylogic.libraries.material_handling.ConveyorExit<Item> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorExit<Item>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public boolean removeFromSpace( Item agent ) {
        return _conveyorExit_removeFromSpace_xjal( this, agent );
      }
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
  protected com.anylogic.libraries.processmodeling.RestrictedAreaStart<Item> instantiate_restrictedAreaStart_xjal() {
    com.anylogic.libraries.processmodeling.RestrictedAreaStart<Item> _result_xjal = new com.anylogic.libraries.processmodeling.RestrictedAreaStart<Item>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public void onEnter( Item agent ) {
        _restrictedAreaStart_onEnter_xjal( this, agent );
      }
	};
    
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
  protected com.anylogic.libraries.processmodeling.RestrictedAreaEnd<Item> instantiate_restrictedAreaEnd_xjal() {
    com.anylogic.libraries.processmodeling.RestrictedAreaEnd<Item> _result_xjal = new com.anylogic.libraries.processmodeling.RestrictedAreaEnd<Item>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public com.anylogic.libraries.processmodeling.RestrictedAreaStart restrictedAreaStart(  ) {
        return _restrictedAreaEnd_restrictedAreaStart_xjal( this );
      }
      @Override
      public void onEnter( Item agent ) {
        _restrictedAreaEnd_onEnter_xjal( this, agent );
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
  protected com.anylogic.libraries.processmodeling.Enter<Item> instantiate_enter_xjal() {
    com.anylogic.libraries.processmodeling.Enter<Item> _result_xjal = new com.anylogic.libraries.processmodeling.Enter<Item>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public double locationX( Item agent ) {
        return _enter_locationX_xjal( this, agent );
      }
      @Override
      public double locationY( Item agent ) {
        return _enter_locationY_xjal( this, agent );
      }
      @Override
      public double locationZ( Item agent ) {
        return _enter_locationZ_xjal( this, agent );
      }
      @Override
      public double locationLatitude( Item agent ) {
        return _enter_locationLatitude_xjal( this, agent );
      }
      @Override
      public double locationLongitude( Item agent ) {
        return _enter_locationLongitude_xjal( this, agent );
      }
      @Override
      public String locationGeoPlaceName( Item agent ) {
        return _enter_locationGeoPlaceName_xjal( this, agent );
      }
      @Override
      public INetwork locationNetwork( Item agent ) {
        return _enter_locationNetwork_xjal( this, agent );
      }
      @Override
      public Level locationLevel( Item agent ) {
        return _enter_locationLevel_xjal( this, agent );
      }
      @Override
      public INode locationNode( Item agent ) {
        return _enter_locationNode_xjal( this, agent );
      }
      @Override
      public Attractor locationAttractor( Item agent ) {
        return _enter_locationAttractor_xjal( this, agent );
      }
      @Override
      public double speed( Item agent ) {
        return _enter_speed_xjal( this, agent );
      }
      @Override
      public boolean changeDimensions( Item agent ) {
        return _enter_changeDimensions_xjal( this, agent );
      }
      @Override
      public double length( Item agent ) {
        return _enter_length_xjal( this, agent );
      }
      @Override
      public double width( Item agent ) {
        return _enter_width_xjal( this, agent );
      }
      @Override
      public double height( Item agent ) {
        return _enter_height_xjal( this, agent );
      }
      @Override
      public AgentList population( Item agent ) {
        return _enter_population_xjal( this, agent );
      }
      @Override
      public void onEnter( Item agent ) {
        _enter_onEnter_xjal( this, agent );
      }
      @Override
      public void onRemove( Item agent ) {
        _enter_onRemove_xjal( this, agent );
      }
      @Override
      public void onAtEnter( Item agent ) {
        _enter_onAtEnter_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_enter_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, TableInput _t ) {
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
  private void doBeforeCreate_enter_xjal( com.anylogic.libraries.processmodeling.Enter<Item> self, TableInput _t ) {
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
  protected com.anylogic.libraries.processmodeling.SelectOutput<Item> instantiate_rackCanAccept_xjal() {
    com.anylogic.libraries.processmodeling.SelectOutput<Item> _result_xjal = new com.anylogic.libraries.processmodeling.SelectOutput<Item>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public boolean condition( Item agent ) {
        return _rackCanAccept_condition_xjal( this, agent );
      }
      @Override
      public double probability( Item agent ) {
        return _rackCanAccept_probability_xjal( this, agent );
      }
      @Override
      public void onEnter( Item agent ) {
        _rackCanAccept_onEnter_xjal( this, agent );
      }
      @Override
      public void onExitTrue( Item agent ) {
        _rackCanAccept_onExitTrue_xjal( this, agent );
      }
      @Override
      public void onExitFalse( Item agent ) {
        _rackCanAccept_onExitFalse_xjal( this, agent );
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
  protected com.anylogic.libraries.processmodeling.Delay<Item> instantiate_waitForFreeSpace_xjal() {
    com.anylogic.libraries.processmodeling.Delay<Item> _result_xjal = new com.anylogic.libraries.processmodeling.Delay<Item>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public double delayTime( Item agent ) {
        return _waitForFreeSpace_delayTime_xjal( this, agent );
      }
      @Override
      public void onEnter( Item agent, double delayTime ) {
        _waitForFreeSpace_onEnter_xjal( this, agent, delayTime );
      }
      @Override
      public void onAtExit( Item agent ) {
        _waitForFreeSpace_onAtExit_xjal( this, agent );
      }
      @Override
      public void onExit( Item agent ) {
        _waitForFreeSpace_onExit_xjal( this, agent );
      }
      @Override
      public void onRemove( Item agent ) {
        _waitForFreeSpace_onRemove_xjal( this, agent );
      }
	};
    
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
    self.capacity = 
1 
;
    self.maximumCapacity = 
false 
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
  private void doBeforeCreate_waitForFreeSpace_xjal( com.anylogic.libraries.processmodeling.Delay<Item> self, TableInput _t ) {
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

  private PalletRackAccess<?> _rackStore_rackSystem_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, Item agent ) {
    PalletRackAccess<?> _value;
    _value = 
rack 
;
    return _value;
  }
  private int _rackStore_row_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, Item agent ) {
    int _value;
    _value = 
 
;
    return _value;
  }
  private int _rackStore_position_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, Item agent ) {
    int _value;
    _value = 
 
;
    return _value;
  }
  private int _rackStore_level_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, Item agent ) {
    int _value;
    _value = 
 
;
    return _value;
  }
  private boolean _rackStore_leftAisle_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, Item agent, com.anylogic.libraries.processmodeling.RackSystem rackSystem, PalletRack palletRack ) {
    boolean _value;
    _value = 
true 
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
  private double _rackStore_delayTime_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, Item agent, com.anylogic.libraries.processmodeling.RackSystem rackSystem, PalletRack palletRack, int row, int position, int level ) {
    double _value;
    _value = 
triangular( 0.5, 1, 1.5 ) 
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
  private com.anylogic.libraries.processmodeling.ResourcePool _rackStore_movingResource_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, Item agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool _value;
    _value = 
asrsResource ( agent ) 
;
    return _value;
  }
  private double _rackStore_priority_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, Item agent ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _rackStore_taskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, Item agent ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.engine.TaskPreemptionPolicy _rackStore_taskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, Item agent ) {
    com.anylogic.engine.TaskPreemptionPolicy _value;
    _value = 
self.PP_NO_PREEMPTION 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.Enter _rackStore_terminatedTasksEnter_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, Item agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.Enter _value;
    _value = 
 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.WrapUpPolicy _rackStore_wrapUpTaskPolicyType_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, Item agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.WrapUpPolicy _value;
    _value = 
self.WRAP_UP_ALWAYS 
;
    return _value;
  }
  private double _rackStore_wrapUpTaskPriority_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, Item agent, Agent unit ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _rackStore_wrapUpTaskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, Item agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _value;
    _value = 
self.WPP_NO_PREEMPTION 
;
    return _value;
  }
  private boolean _rackStore_resourceChoiceCondition_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, Item agent, Agent unit, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceSelectionMode _rackStore_resourceSelectionMode_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, Item agent, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
    com.anylogic.libraries.processmodeling.ResourceSelectionMode _value;
    _value = 
self.RESOURCE_SELECTION_SOME_UNIT 
;
    return _value;
  }
  private double _rackStore_resourceRating_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, Agent unit, Item agent ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _rackStore_resourceComparison_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, Agent unit1, Agent unit2, Item agent ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private void _rackStore_onEnter_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, Item agent ) {
    
 
;
  }
  private void _rackStore_onResourcesArrived_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, Item agent ) {
    
 
;
  }
  private void _rackStore_onDelayStarts_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, Item agent, double delayTime, com.anylogic.libraries.processmodeling.RackSystem rackSystem, PalletRack palletRack, int row, int position, int level ) {
    
 
;
  }
  private void _rackStore_onDelayEnds_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, Item agent ) {
    
 
;
  }
  private void _rackStore_onExit_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, Item agent, com.anylogic.libraries.processmodeling.RackSystem rackSystem, PalletRack palletRack, int row, int position, int level ) {
    
 
;
  }
  private void _rackStore_onTaskTerminated_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, Item agent, Agent unit ) {
    
 
;
  }
  private void _rackStore_onTaskSuspended_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, Item agent, Agent unit ) {
    
 
;
  }
  private void _rackStore_onTaskResumed_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, Item agent, Agent unit ) {
    
 
;
  }
  private double _queueToRack_priority_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, Item agent ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _queueToRack_comparison_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, Item agent1, Item agent2 ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _queueToRack_timeout_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, Item agent ) {
    double _value;
    _value = 
100 
;
    return _value;
  }
  private void _queueToRack_onEnter_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, Item agent ) {
    
 
;
  }
  private void _queueToRack_onAtExit_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, Item agent ) {
    
 
;
  }
  private void _queueToRack_onExit_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, Item agent ) {
    
 
;
  }
  private void _queueToRack_onExitTimeout_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, Item agent ) {
    
 
;
  }
  private void _queueToRack_onExitPreempted_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, Item agent ) {
    
 
;
  }
  private void _queueToRack_onRemove_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, Item agent ) {
    
 
;
  }
  private boolean _conveyorExit_removeFromSpace_xjal( final com.anylogic.libraries.material_handling.ConveyorExit<Item> self, Item agent ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private void _conveyorExit_onExit_xjal( final com.anylogic.libraries.material_handling.ConveyorExit<Item> self, Item agent ) {
    
agent.setNetwork( rack.getNetwork() ); 
;
  }
  private void _restrictedAreaStart_onEnter_xjal( final com.anylogic.libraries.processmodeling.RestrictedAreaStart<Item> self, Item agent ) {
    
 
;
  }
  private com.anylogic.libraries.processmodeling.RestrictedAreaStart _restrictedAreaEnd_restrictedAreaStart_xjal( final com.anylogic.libraries.processmodeling.RestrictedAreaEnd<Item> self ) {
    com.anylogic.libraries.processmodeling.RestrictedAreaStart _value;
    _value = 
restrictedAreaStart 
;
    return _value;
  }
  private void _restrictedAreaEnd_onEnter_xjal( final com.anylogic.libraries.processmodeling.RestrictedAreaEnd<Item> self, Item agent ) {
    
 
;
  }
  private double _enter_locationX_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _enter_locationY_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _enter_locationZ_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _enter_locationLatitude_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _enter_locationLongitude_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private String _enter_locationGeoPlaceName_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    String _value;
    _value = 
 
;
    return _value;
  }
  private INetwork _enter_locationNetwork_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    INetwork _value;
    _value = 
 
;
    return _value;
  }
  private Level _enter_locationLevel_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    Level _value;
    _value = 
 
;
    return _value;
  }
  private INode _enter_locationNode_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    INode _value;
    _value = 
 
;
    return _value;
  }
  private Attractor _enter_locationAttractor_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    Attractor _value;
    _value = 
 
;
    return _value;
  }
  private double _enter_speed_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    double _value;
    _value = 
10 
;
    return _value;
  }
  private boolean _enter_changeDimensions_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _enter_length_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private double _enter_width_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private double _enter_height_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private AgentList _enter_population_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    AgentList _value;
    _value = 
 
;
    return _value;
  }
  private void _enter_onEnter_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    
 
;
  }
  private void _enter_onRemove_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    
 
;
  }
  private void _enter_onAtEnter_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    
 
;
  }
  private boolean _rackCanAccept_condition_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Item> self, Item agent ) {
    boolean _value;
    _value = 
( rack.size() + rack.reserved() ) < rack.capacity() 
;
    return _value;
  }
  private double _rackCanAccept_probability_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Item> self, Item agent ) {
    double _value;
    _value = 
0.5 
;
    return _value;
  }
  private void _rackCanAccept_onEnter_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Item> self, Item agent ) {
    
 
;
  }
  private void _rackCanAccept_onExitTrue_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Item> self, Item agent ) {
    
 
;
  }
  private void _rackCanAccept_onExitFalse_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Item> self, Item agent ) {
    
 
;
  }
  private double _waitForFreeSpace_delayTime_xjal( final com.anylogic.libraries.processmodeling.Delay<Item> self, Item agent ) {
    double _value;
    _value = 
triangular( 0.5, 1, 1.5 ) 
;
    return _value;
  }
  private void _waitForFreeSpace_onEnter_xjal( final com.anylogic.libraries.processmodeling.Delay<Item> self, Item agent, double delayTime ) {
    
 
;
  }
  private void _waitForFreeSpace_onAtExit_xjal( final com.anylogic.libraries.processmodeling.Delay<Item> self, Item agent ) {
    
 
;
  }
  private void _waitForFreeSpace_onExit_xjal( final com.anylogic.libraries.processmodeling.Delay<Item> self, Item agent ) {
    
 
;
  }
  private void _waitForFreeSpace_onRemove_xjal( final com.anylogic.libraries.processmodeling.Delay<Item> self, Item agent ) {
    
 
;
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
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void onShapeGroupDraw( int _shape, int index ) {
    switch( _shape ) {
      case _groupStoring:
          
 
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
3 
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
  private void _groupStoring_SetDynamicParams_xjal( ShapeGroup shape ) {
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
		2.0, LINE_STYLE_SOLID	 ) {
      @Override
      public void updateDynamicProperties() {
        _roundRectangle_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    text = new ShapeText(
        SHAPE_DRAW_2D, true,-16.0, -7.0, 0.0, 0.0, 
        black,"Storing",
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
    groupStoring = new ShapeGroup( Storing.this, SHAPE_DRAW_2D, true, 90.0, 100.0, 0.0, 0.0
	
	     , roundRectangle
	     , text ) {
      @Override
      public void updateDynamicProperties() {
        _groupStoring_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }

      @Override
      @AnyLogicInternalCodegenAPI
      public boolean onClick( double clickx, double clicky ) {
        return onShapeClick( _groupStoring, 0, clickx, clicky );
      }

      @Override
      @AnyLogicInternalCodegenAPI
      public void onDraw() {
        onShapeGroupDraw( _groupStoring, 0 );
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

  @AnyLogicInternalCodegenAPI
  public boolean executeOnSendActionOf( Port<?, ?> _p, Object _msg ) {
    if( _p == this.out ) {
      Port< Object, Object > self = this.out;
      Object msg = (Object) _msg;

 
    }
    return super.executeOnSendActionOf( _p, _msg );
  }

  @AnyLogicInternalCodegenAPI
  public boolean executeOnReceiveActionOf( Port<?, ?> _p, Object _msg ) {
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
    rackStore.startAsEmbedded();
    queueToRack.startAsEmbedded();
    conveyorExit.startAsEmbedded();
    restrictedAreaStart.startAsEmbedded();
    restrictedAreaEnd.startAsEmbedded();
    enter.startAsEmbedded();
    rackCanAccept.startAsEmbedded();
    waitForFreeSpace.startAsEmbedded();
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
    // On destroy code
    
 
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

  // Additional class code

 
  // End of additional class code


}
