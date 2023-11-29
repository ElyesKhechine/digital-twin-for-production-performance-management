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

public class DropOffStation extends Agent
{
  // Parameters

  public 
ResourcePool  resource;

  /**
   * Returns default value for parameter <code>resource</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public ResourcePool _resource_DefaultValue_xjal() {
    final DropOffStation self = this;
    return null;
  }

  public void set_resource( ResourcePool value ) {
    if (value == this.resource) {
      return;
    }
    ResourcePool _oldValue_xjal = this.resource;
    this.resource = value;
    onChange_resource_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter resource.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_resource()</code> method instead.
   */
  protected void onChange_resource() {
    onChange_resource_xjal( resource );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_resource_xjal( ResourcePool oldValue ) {  
  }


  public 
int  nItemsToDrop;

  /**
   * Returns default value for parameter <code>nItemsToDrop</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _nItemsToDrop_DefaultValue_xjal() {
    final DropOffStation self = this;
    return 0;
  }

  public void set_nItemsToDrop( int value ) {
    if (value == this.nItemsToDrop) {
      return;
    }
    int _oldValue_xjal = this.nItemsToDrop;
    this.nItemsToDrop = value;
    onChange_nItemsToDrop_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter nItemsToDrop.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_nItemsToDrop()</code> method instead.
   */
  protected void onChange_nItemsToDrop() {
    onChange_nItemsToDrop_xjal( nItemsToDrop );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_nItemsToDrop_xjal( int oldValue ) {  
  }


  public 
int  capacity;

  /**
   * Returns default value for parameter <code>capacity</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _capacity_DefaultValue_xjal() {
    final DropOffStation self = this;
    return 0;
  }

  public void set_capacity( int value ) {
    if (value == this.capacity) {
      return;
    }
    int _oldValue_xjal = this.capacity;
    this.capacity = value;
    onChange_capacity_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter capacity.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_capacity()</code> method instead.
   */
  protected void onChange_capacity() {
    onChange_capacity_xjal( capacity );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_capacity_xjal( int oldValue ) {
	int index;
    {
      com.anylogic.libraries.processmodeling.RestrictedAreaStart<Item> self = raStart;
      int _value;
      _value = capacity
;
      raStart.set_capacity( _value );
    }  
  }


  public 
double  operationTime;

  /**
   * Returns default value for parameter <code>operationTime</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _operationTime_DefaultValue_xjal() {
    final DropOffStation self = this;
    return 0.0;
  }

  public void set_operationTime( double value ) {
    if (value == this.operationTime) {
      return;
    }
    double _oldValue_xjal = this.operationTime;
    this.operationTime = value;
    onChange_operationTime_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter operationTime.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_operationTime()</code> method instead.
   */
  protected void onChange_operationTime() {
    onChange_operationTime_xjal( operationTime );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_operationTime_xjal( double oldValue ) {  
  }


  public 
Path  trajectoryToConveyor;

  /**
   * Returns default value for parameter <code>trajectoryToConveyor</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public Path _trajectoryToConveyor_DefaultValue_xjal() {
    final DropOffStation self = this;
    return null;
  }

  public void set_trajectoryToConveyor( Path value ) {
    if (value == this.trajectoryToConveyor) {
      return;
    }
    Path _oldValue_xjal = this.trajectoryToConveyor;
    this.trajectoryToConveyor = value;
    onChange_trajectoryToConveyor_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter trajectoryToConveyor.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_trajectoryToConveyor()</code> method instead.
   */
  protected void onChange_trajectoryToConveyor() {
    onChange_trajectoryToConveyor_xjal( trajectoryToConveyor );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_trajectoryToConveyor_xjal( Path oldValue ) {
	int index;
    {
      com.anylogic.libraries.processmodeling.Delay<Item> self = dropOnConveyor1;
      AnimationStaticLocationProvider _value;
      _value = trajectoryToConveyor
;
      dropOnConveyor1.set_entityLocation( _value );
    }
    {
      com.anylogic.libraries.processmodeling.Delay<ItemBatch> self = dropOnConveyor;
      AnimationStaticLocationProvider _value;
      _value = trajectoryToConveyor
;
      dropOnConveyor.set_entityLocation( _value );
    }  
  }


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    resource = _resource_DefaultValue_xjal();
    nItemsToDrop = _nItemsToDrop_DefaultValue_xjal();
    capacity = _capacity_DefaultValue_xjal();
    operationTime = _operationTime_DefaultValue_xjal();
    trajectoryToConveyor = _trajectoryToConveyor_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "resource":
      if ( _callOnChange_xjal ) {
        set_resource( (ResourcePool) _value_xjal );
      } else {
        resource = (ResourcePool) _value_xjal;
      }
      return true;
    case "nItemsToDrop":
      if ( _callOnChange_xjal ) {
        set_nItemsToDrop( ((Number) _value_xjal).intValue() );
      } else {
        nItemsToDrop = ((Number) _value_xjal).intValue();
      }
      return true;
    case "capacity":
      if ( _callOnChange_xjal ) {
        set_capacity( ((Number) _value_xjal).intValue() );
      } else {
        capacity = ((Number) _value_xjal).intValue();
      }
      return true;
    case "operationTime":
      if ( _callOnChange_xjal ) {
        set_operationTime( ((Number) _value_xjal).doubleValue() );
      } else {
        operationTime = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "trajectoryToConveyor":
      if ( _callOnChange_xjal ) {
        set_trajectoryToConveyor( (Path) _value_xjal );
      } else {
        trajectoryToConveyor = (Path) _value_xjal;
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
    case "resource": _result_xjal = resource; break;
    case "nItemsToDrop": _result_xjal = nItemsToDrop; break;
    case "capacity": _result_xjal = capacity; break;
    case "operationTime": _result_xjal = operationTime; break;
    case "trajectoryToConveyor": _result_xjal = trajectoryToConveyor; break;
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
      list.add( "resource" );
      list.add( "nItemsToDrop" );
      list.add( "capacity" );
      list.add( "operationTime" );
      list.add( "trajectoryToConveyor" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
  }
  // Plain Variables

  public 
Color 
 palletColor;
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( DropOffStation.class );
  
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

  public com.anylogic.libraries.processmodeling.Batch<
Item 
, 
ItemBatch 
> batch;
  public com.anylogic.libraries.processmodeling.Unbatch<
ItemBatch 
, 
Item 
> unbatch;
  public com.anylogic.libraries.processmodeling.Dropoff<
Pallet 
, 
Item 
> dropoff;
  public com.anylogic.libraries.processmodeling.RestrictedAreaStart<
Item 
> raStart;
  public com.anylogic.libraries.processmodeling.Hold<
Pallet 
> hold;
  public com.anylogic.libraries.processmodeling.RestrictedAreaEnd<
Item 
> raEnd;
  public com.anylogic.libraries.processmodeling.Queue<
Item 
> waitForRobot;
  public com.anylogic.libraries.processmodeling.Seize<
Pallet 
> seize;
  public com.anylogic.libraries.processmodeling.Release<
Pallet 
> release;
  public com.anylogic.libraries.processmodeling.SelectOutput<
Item 
> singleInput;
  public com.anylogic.libraries.processmodeling.Delay<
Item 
> dropOnConveyor1;
  public com.anylogic.libraries.processmodeling.Delay<
ItemBatch 
> dropOnConveyor;
  public com.anylogic.libraries.processmodeling.Seize<
ItemBatch 
> seizeRobot;
  public com.anylogic.libraries.processmodeling.Release<
ItemBatch 
> releaseRobot;

  public String getNameOf( Agent ao ) {
    if ( ao == batch ) return "batch";
    if ( ao == unbatch ) return "unbatch";
    if ( ao == dropoff ) return "dropoff";
    if ( ao == raStart ) return "raStart";
    if ( ao == hold ) return "hold";
    if ( ao == raEnd ) return "raEnd";
    if ( ao == waitForRobot ) return "waitForRobot";
    if ( ao == seize ) return "seize";
    if ( ao == release ) return "release";
    if ( ao == singleInput ) return "singleInput";
    if ( ao == dropOnConveyor1 ) return "dropOnConveyor1";
    if ( ao == dropOnConveyor ) return "dropOnConveyor";
    if ( ao == seizeRobot ) return "seizeRobot";
    if ( ao == releaseRobot ) return "releaseRobot";
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
  protected com.anylogic.libraries.processmodeling.Batch<Item, ItemBatch> instantiate_batch_xjal() {
    com.anylogic.libraries.processmodeling.Batch<Item, ItemBatch> _result_xjal = new com.anylogic.libraries.processmodeling.Batch<Item, ItemBatch>( getEngine(), this, null ) {
      @Override
      public Agent newBatch(  ) {
        return _batch_newBatch_xjal( this );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_batch_xjal( final com.anylogic.libraries.processmodeling.Batch<Item, ItemBatch> self, TableInput _t ) {
    self.batchSize = self._batchSize_DefaultValue_xjal();
    self.permanent = self._permanent_DefaultValue_xjal();
    self.entityLocation = self._entityLocation_DefaultValue_xjal();
    self.locationType = self._locationType_DefaultValue_xjal();
    self.locationXYZInNetwork = self._locationXYZInNetwork_DefaultValue_xjal();
    self.addToCustomPopulation = self._addToCustomPopulation_DefaultValue_xjal();
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
    self.restoreEntityLocationOnExit = self._restoreEntityLocationOnExit_DefaultValue_xjal();
    self.forceStatisticsCollection = self._forceStatisticsCollection_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_batch_xjal( com.anylogic.libraries.processmodeling.Batch<Item, ItemBatch> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Unbatch<ItemBatch, Item> instantiate_unbatch_xjal() {
    com.anylogic.libraries.processmodeling.Unbatch<ItemBatch, Item> _result_xjal = new com.anylogic.libraries.processmodeling.Unbatch<ItemBatch, Item>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_unbatch_xjal( final com.anylogic.libraries.processmodeling.Unbatch<ItemBatch, Item> self, TableInput _t ) {
    self.sameAsBatchLocation = self._sameAsBatchLocation_DefaultValue_xjal();
    self.locationType = self._locationType_DefaultValue_xjal();
    self.locationXYZInNetwork = self._locationXYZInNetwork_DefaultValue_xjal();
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_unbatch_xjal( com.anylogic.libraries.processmodeling.Unbatch<ItemBatch, Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Dropoff<Pallet, Item> instantiate_dropoff_xjal() {
    com.anylogic.libraries.processmodeling.Dropoff<Pallet, Item> _result_xjal = new com.anylogic.libraries.processmodeling.Dropoff<Pallet, Item>( getEngine(), this, null ) {
      @Override
      public int quantity( Pallet container ) {
        return _dropoff_quantity_xjal( this, container );
      }
      @Override
      public void onEnter( Pallet container ) {
        _dropoff_onEnter_xjal( this, container );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_dropoff_xjal( final com.anylogic.libraries.processmodeling.Dropoff<Pallet, Item> self, TableInput _t ) {
    self.dropoffType = 
self.QUANTITY 
;
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_dropoff_xjal( com.anylogic.libraries.processmodeling.Dropoff<Pallet, Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.RestrictedAreaStart<Item> instantiate_raStart_xjal() {
    com.anylogic.libraries.processmodeling.RestrictedAreaStart<Item> _result_xjal = new com.anylogic.libraries.processmodeling.RestrictedAreaStart<Item>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_raStart_xjal( final com.anylogic.libraries.processmodeling.RestrictedAreaStart<Item> self, TableInput _t ) {
    self.capacity = 
capacity 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_raStart_xjal( com.anylogic.libraries.processmodeling.RestrictedAreaStart<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Hold<Pallet> instantiate_hold_xjal() {
    com.anylogic.libraries.processmodeling.Hold<Pallet> _result_xjal = new com.anylogic.libraries.processmodeling.Hold<Pallet>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_hold_xjal( final com.anylogic.libraries.processmodeling.Hold<Pallet> self, TableInput _t ) {
    self.mode = 
self.BLOCK_AFTER_N_ENTITIES 
;
    self.nEntitiesForSelfBlock = self._nEntitiesForSelfBlock_DefaultValue_xjal();
    self.initiallyBlocked = 
true 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_hold_xjal( com.anylogic.libraries.processmodeling.Hold<Pallet> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.RestrictedAreaEnd<Item> instantiate_raEnd_xjal() {
    com.anylogic.libraries.processmodeling.RestrictedAreaEnd<Item> _result_xjal = new com.anylogic.libraries.processmodeling.RestrictedAreaEnd<Item>( getEngine(), this, null ) {
      @Override
      public com.anylogic.libraries.processmodeling.RestrictedAreaStart restrictedAreaStart(  ) {
        return _raEnd_restrictedAreaStart_xjal( this );
      }
      @Override
      public void onEnter( Item agent ) {
        _raEnd_onEnter_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_raEnd_xjal( final com.anylogic.libraries.processmodeling.RestrictedAreaEnd<Item> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_raEnd_xjal( com.anylogic.libraries.processmodeling.RestrictedAreaEnd<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Queue<Item> instantiate_waitForRobot_xjal() {
    com.anylogic.libraries.processmodeling.Queue<Item> _result_xjal = new com.anylogic.libraries.processmodeling.Queue<Item>( getEngine(), this, null ) {
      @Override
      public void onExit( Item agent ) {
        _waitForRobot_onExit_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_waitForRobot_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, TableInput _t ) {
    self.capacity = self._capacity_DefaultValue_xjal();
    self.maximumCapacity = 
true 
;
    self.entityLocation = self._entityLocation_DefaultValue_xjal();
    self.queuing = self._queuing_DefaultValue_xjal();
    self.enableTimeout = self._enableTimeout_DefaultValue_xjal();
    self.enablePreemption = self._enablePreemption_DefaultValue_xjal();
    self.restoreEntityLocationOnExit = 
false 
;
    self.forceStatisticsCollection = self._forceStatisticsCollection_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_waitForRobot_xjal( com.anylogic.libraries.processmodeling.Queue<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Seize<Pallet> instantiate_seize_xjal() {
    com.anylogic.libraries.processmodeling.Seize<Pallet> _result_xjal = new com.anylogic.libraries.processmodeling.Seize<Pallet>( getEngine(), this, null ) {
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool resourcePool( Pallet agent ) {
        return _seize_resourcePool_xjal( this, agent );
      }
      @Override
      public com.anylogic.engine.TaskPreemptionPolicy taskPreemptionPolicy( Pallet agent ) {
        return _seize_taskPreemptionPolicy_xjal( this, agent );
      }
      @Override
      public void onSeizeUnit( Pallet agent, Agent unit ) {
        _seize_onSeizeUnit_xjal( this, agent, unit );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_seize_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, TableInput _t ) {
    self.seizeFromOnePool = 
true 
;
    self.seizePolicy = self._seizePolicy_DefaultValue_xjal();
    self.capacity = 
1 
;
    self.maximumCapacity = self._maximumCapacity_DefaultValue_xjal();
    self.destinationType = self._destinationType_DefaultValue_xjal();
    self.entityLocationQueue = self._entityLocationQueue_DefaultValue_xjal();
    self.terminatedTaskProcessing = self._terminatedTaskProcessing_DefaultValue_xjal();
    self.suspendResumeEntities = self._suspendResumeEntities_DefaultValue_xjal();
    self.customizeResourceChoice = self._customizeResourceChoice_DefaultValue_xjal();
    self.taskStartBlocksAreConnected = self._taskStartBlocksAreConnected_DefaultValue_xjal();
    self.taskStartBlocks = self._taskStartBlocks_DefaultValue_xjal();
    self.enableTimeout = self._enableTimeout_DefaultValue_xjal();
    self.enablePreemption = self._enablePreemption_DefaultValue_xjal();
    self.canceledUnitsBehavior = self._canceledUnitsBehavior_DefaultValue_xjal();
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
    self.restoreEntityLocationOnExit = self._restoreEntityLocationOnExit_DefaultValue_xjal();
    self.forceStatisticsCollection = self._forceStatisticsCollection_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_seize_xjal( com.anylogic.libraries.processmodeling.Seize<Pallet> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Release<Pallet> instantiate_release_xjal() {
    com.anylogic.libraries.processmodeling.Release<Pallet> _result_xjal = new com.anylogic.libraries.processmodeling.Release<Pallet>( getEngine(), this, null ) {
      @Override
      public boolean movingGoHome( Pallet agent, Agent unit ) {
        return _release_movingGoHome_xjal( this, agent, unit );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_release_xjal( final com.anylogic.libraries.processmodeling.Release<Pallet> self, TableInput _t ) {
    self.releaseMode = self._releaseMode_DefaultValue_xjal();
    self.seizeBlocks = self._seizeBlocks_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_release_xjal( com.anylogic.libraries.processmodeling.Release<Pallet> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.SelectOutput<Item> instantiate_singleInput_xjal() {
    com.anylogic.libraries.processmodeling.SelectOutput<Item> _result_xjal = new com.anylogic.libraries.processmodeling.SelectOutput<Item>( getEngine(), this, null ) {
      @Override
      public boolean condition( Item agent ) {
        return _singleInput_condition_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_singleInput_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Item> self, TableInput _t ) {
    self.conditionIsProbabilistic = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_singleInput_xjal( com.anylogic.libraries.processmodeling.SelectOutput<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Delay<Item> instantiate_dropOnConveyor1_xjal() {
    com.anylogic.libraries.processmodeling.Delay<Item> _result_xjal = new com.anylogic.libraries.processmodeling.Delay<Item>( getEngine(), this, null ) {
      @Override
      public double delayTime( Item agent ) {
        return _dropOnConveyor1_delayTime_xjal( this, agent );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTime() {
        return SECOND;
      }
      @Override
      public void onEnter( Item agent, double delayTime ) {
        _dropOnConveyor1_onEnter_xjal( this, agent, delayTime );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_dropOnConveyor1_xjal( final com.anylogic.libraries.processmodeling.Delay<Item> self, TableInput _t ) {
    self.type = self._type_DefaultValue_xjal();
    self.capacity = self._capacity_DefaultValue_xjal();
    self.maximumCapacity = self._maximumCapacity_DefaultValue_xjal();
    self.entityLocation = 
trajectoryToConveyor 
;
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
    self.restoreEntityLocationOnExit = self._restoreEntityLocationOnExit_DefaultValue_xjal();
    self.forceStatisticsCollection = self._forceStatisticsCollection_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_dropOnConveyor1_xjal( com.anylogic.libraries.processmodeling.Delay<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Delay<ItemBatch> instantiate_dropOnConveyor_xjal() {
    com.anylogic.libraries.processmodeling.Delay<ItemBatch> _result_xjal = new com.anylogic.libraries.processmodeling.Delay<ItemBatch>( getEngine(), this, null ) {
      @Override
      public double delayTime( ItemBatch agent ) {
        return _dropOnConveyor_delayTime_xjal( this, agent );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTime() {
        return SECOND;
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_dropOnConveyor_xjal( final com.anylogic.libraries.processmodeling.Delay<ItemBatch> self, TableInput _t ) {
    self.type = self._type_DefaultValue_xjal();
    self.capacity = self._capacity_DefaultValue_xjal();
    self.maximumCapacity = self._maximumCapacity_DefaultValue_xjal();
    self.entityLocation = 
trajectoryToConveyor 
;
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
    self.restoreEntityLocationOnExit = 
false 
;
    self.forceStatisticsCollection = self._forceStatisticsCollection_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_dropOnConveyor_xjal( com.anylogic.libraries.processmodeling.Delay<ItemBatch> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Seize<ItemBatch> instantiate_seizeRobot_xjal() {
    com.anylogic.libraries.processmodeling.Seize<ItemBatch> _result_xjal = new com.anylogic.libraries.processmodeling.Seize<ItemBatch>( getEngine(), this, null ) {
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool resourcePool( ItemBatch agent ) {
        return _seizeRobot_resourcePool_xjal( this, agent );
      }
      @Override
      public boolean attachResources( ItemBatch agent, Agent unit ) {
        return _seizeRobot_attachResources_xjal( this, agent, unit );
      }
      @Override
      public double priority( ItemBatch agent ) {
        return _seizeRobot_priority_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_seizeRobot_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, TableInput _t ) {
    self.seizeFromOnePool = 
true 
;
    self.seizePolicy = self._seizePolicy_DefaultValue_xjal();
    self.capacity = self._capacity_DefaultValue_xjal();
    self.maximumCapacity = 
true 
;
    self.destinationType = self._destinationType_DefaultValue_xjal();
    self.entityLocationQueue = self._entityLocationQueue_DefaultValue_xjal();
    self.terminatedTaskProcessing = self._terminatedTaskProcessing_DefaultValue_xjal();
    self.suspendResumeEntities = self._suspendResumeEntities_DefaultValue_xjal();
    self.customizeResourceChoice = self._customizeResourceChoice_DefaultValue_xjal();
    self.taskStartBlocksAreConnected = self._taskStartBlocksAreConnected_DefaultValue_xjal();
    self.taskStartBlocks = self._taskStartBlocks_DefaultValue_xjal();
    self.enableTimeout = self._enableTimeout_DefaultValue_xjal();
    self.enablePreemption = self._enablePreemption_DefaultValue_xjal();
    self.canceledUnitsBehavior = self._canceledUnitsBehavior_DefaultValue_xjal();
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
    self.restoreEntityLocationOnExit = self._restoreEntityLocationOnExit_DefaultValue_xjal();
    self.forceStatisticsCollection = self._forceStatisticsCollection_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_seizeRobot_xjal( com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Release<ItemBatch> instantiate_releaseRobot_xjal() {
    com.anylogic.libraries.processmodeling.Release<ItemBatch> _result_xjal = new com.anylogic.libraries.processmodeling.Release<ItemBatch>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_releaseRobot_xjal( final com.anylogic.libraries.processmodeling.Release<ItemBatch> self, TableInput _t ) {
    self.releaseMode = 
self.ALL_FROM_SEIZES 
;
    self.seizeBlocks = new com.anylogic.libraries.processmodeling.Seize[]
{ seizeRobot } 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_releaseRobot_xjal( com.anylogic.libraries.processmodeling.Release<ItemBatch> self, TableInput _t ) {
  }

  private Agent _batch_newBatch_xjal( final com.anylogic.libraries.processmodeling.Batch<Item, ItemBatch> self ) {
    Agent _value;
    _value = 
new ItemBatch( palletColor ) 
;
    return _value;
  }
  private int _dropoff_quantity_xjal( final com.anylogic.libraries.processmodeling.Dropoff<Pallet, Item> self, Pallet container ) {
    int _value;
    _value = 
nItemsToDrop 
;
    return _value;
  }
  private void _dropoff_onEnter_xjal( final com.anylogic.libraries.processmodeling.Dropoff<Pallet, Item> self, Pallet container ) {
    
palletColor = container.getPalletColor(); 
;
  }
  private com.anylogic.libraries.processmodeling.RestrictedAreaStart _raEnd_restrictedAreaStart_xjal( final com.anylogic.libraries.processmodeling.RestrictedAreaEnd<Item> self ) {
    com.anylogic.libraries.processmodeling.RestrictedAreaStart _value;
    _value = 
raStart 
;
    return _value;
  }
  private void _raEnd_onEnter_xjal( final com.anylogic.libraries.processmodeling.RestrictedAreaEnd<Item> self, Item agent ) {
    
agent.receive( "toConveyor" ); 
;
  }
  private void _waitForRobot_onExit_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, Item agent ) {
    
agent.pallet.nItems--;
if (self.size() == 0)
	hold.unblock(); 
;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool _seize_resourcePool_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Pallet agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool _value;
    _value = 
resource 
;
    return _value;
  }
  private com.anylogic.engine.TaskPreemptionPolicy _seize_taskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Pallet agent ) {
    com.anylogic.engine.TaskPreemptionPolicy _value;
    _value = 
self.PP_CONTINUE_WITHOUT_RESOURCE 
;
    return _value;
  }
  private void _seize_onSeizeUnit_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Pallet agent, Agent unit ) {
    
if (agent.carriedItemsType != food)
	set_trajectoryToConveyor( main.trajectoriesToConv.get( agent.carriedItemsType ) ); 
;
  }
  private boolean _release_movingGoHome_xjal( final com.anylogic.libraries.processmodeling.Release<Pallet> self, Pallet agent, Agent unit ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private boolean _singleInput_condition_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Item> self, Item agent ) {
    boolean _value;
    _value = 
capacity == 1 
;
    return _value;
  }
  private double _dropOnConveyor1_delayTime_xjal( final com.anylogic.libraries.processmodeling.Delay<Item> self, Item agent ) {
    double _value;
    _value = 
operationTime 
;
    return _value;
  }
  private void _dropOnConveyor1_onEnter_xjal( final com.anylogic.libraries.processmodeling.Delay<Item> self, Item agent, double delayTime ) {
    
agent.receive( "toConveyor" ); 
;
  }
  private double _dropOnConveyor_delayTime_xjal( final com.anylogic.libraries.processmodeling.Delay<ItemBatch> self, ItemBatch agent ) {
    double _value;
    _value = 
operationTime 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool _seizeRobot_resourcePool_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, ItemBatch agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool _value;
    _value = 
resource 
;
    return _value;
  }
  private boolean _seizeRobot_attachResources_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, ItemBatch agent, Agent unit ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private double _seizeRobot_priority_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, ItemBatch agent ) {
    double _value;
    _value = 
5 
;
    return _value;
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
  protected static final int _roundRectangle = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int _line = 2;
  @AnyLogicInternalCodegenAPI
  protected static final int _oval = 3;
  @AnyLogicInternalCodegenAPI
  protected static final int _oval1 = 4;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle = 5;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle1 = 6;
  @AnyLogicInternalCodegenAPI
  protected static final int _polyline = 7;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle2 = 8;
  @AnyLogicInternalCodegenAPI
  protected static final int _conveyorDropOffImg = 9;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 10;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return false;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline_pointsDX_xjal() {
    return new double[] { 0.0, -6.623, -13.247, -19.87, -19.87, -26.494, -13.247, -19.87,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline_pointsDY_xjal() {
    return new double[] { 0.0, 0.0, -13.03, 0.0, 13.03, 19.545, 19.545, 13.03,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll();
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean onShapeClick( int _shape, int index, double clickx, double clicky ){
    switch( _shape ){
      case _conveyorDropOffImg:
        if (true) {
          ShapeGroup self = this.conveyorDropOffImg;
          
return true; 
        }
        break;
      default: return super.onShapeClick( _shape, index, clickx, clicky );
 	}
 	return false;
  }
  
  protected ShapeRoundedRectangle roundRectangle;
  protected ShapeLine line;
  protected ShapeOval oval;
  protected ShapeOval oval1;
  protected ShapeRectangle rectangle;
  protected ShapeRectangle rectangle1;
  protected ShapePolyLine polyline;
  protected ShapeRectangle rectangle2;
  protected ShapeGroup conveyorDropOffImg;
  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    roundRectangle = new ShapeRoundedRectangle(
		true,-34.0, -29.0, 0.0, 
        dodgerBlue, white,
		60.0, 60.0,10.0,  
		2.0, LINE_STYLE_SOLID	 );

    line = new ShapeLine(
		SHAPE_DRAW_2D, true, -6.623, 6.515, 0.0, black, 
 		26.0,	0.0, 0.0, 2.0, 10.0, LINE_STYLE_SOLID );

    oval = new ShapeOval(
       SHAPE_DRAW_2D, true,-3.974, 8.47, 0.0, 0.0, 
       black, black,
	   1.3245, 1.3245, 10.0, 1.0, LINE_STYLE_SOLID );

    oval1 = new ShapeOval(
       SHAPE_DRAW_2D, true,17.221, 8.47, 0.0, 0.0, 
       black, black,
	   1.3245, 1.3245, 10.0, 1.0, LINE_STYLE_SOLID );

    rectangle = new ShapeRectangle(
       SHAPE_DRAW_2D, true,6.623, 0.0, 0.0, 0.0, 
            black, peru,
			6.623, 6.515, 10.0, 1.0, LINE_STYLE_SOLID );

    rectangle1 = new ShapeRectangle(
       SHAPE_DRAW_2D, true,-4.636, -10.424, 0.0, 0.0, 
            black, peru,
			6.623, 6.515, 10.0, 1.0, LINE_STYLE_SOLID );

    polyline = new ShapePolyLine(
		SHAPE_DRAW_2D, true, 0.0, -6.515, 0.0, black, null,
            8, _polyline_pointsDX_xjal(), _polyline_pointsDY_xjal(), _polyline_pointsDZ_xjal(), false, 10.0, 2.0, LINE_STYLE_SOLID );

    rectangle2 = new ShapeRectangle(
       SHAPE_DRAW_2D, true,-26.494, 13.03, 0.0, 0.0, 
            black, gray,
			13.247, 6.515, 10.0, 2.0, LINE_STYLE_SOLID );

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {				
    conveyorDropOffImg = new ShapeGroup( DropOffStation.this, SHAPE_DRAW_2D, true, 84.0, 79.0, 0.0, 0.0
	
	     , roundRectangle
	     , line
	     , oval
	     , oval1
	     , rectangle
	     , rectangle1
	     , polyline
	     , rectangle2 ) {

      @Override
      @AnyLogicInternalCodegenAPI
      public boolean onClick( double clickx, double clicky ) {
        return onShapeClick( _conveyorDropOffImg, 0, clickx, clicky );
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
Object > port = new Port< Object, Object >( this );
  public Port< 
Object 
, 
Object > portPallet = new Port< Object, Object >( this );
  public Port< 
Object 
, 
Object > portItem = new Port< Object, Object >( this );

  @AnyLogicInternalCodegenAPI
  public String getNameOf( Port<?, ?> _p ) {
    if( _p == this.port ) return "port";
    if( _p == this.portPallet ) return "portPallet";
    if( _p == this.portItem ) return "portItem";
    return super.getNameOf( _p ); 
  }


  /**
   * Constructor
   */
  public DropOffStation( Engine engine, Agent owner, AgentList<? extends DropOffStation> ownerPopulation ) {
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
    batch = instantiate_batch_xjal();
    unbatch = instantiate_unbatch_xjal();
    dropoff = instantiate_dropoff_xjal();
    raStart = instantiate_raStart_xjal();
    hold = instantiate_hold_xjal();
    raEnd = instantiate_raEnd_xjal();
    waitForRobot = instantiate_waitForRobot_xjal();
    seize = instantiate_seize_xjal();
    release = instantiate_release_xjal();
    singleInput = instantiate_singleInput_xjal();
    dropOnConveyor1 = instantiate_dropOnConveyor1_xjal();
    dropOnConveyor = instantiate_dropOnConveyor_xjal();
    seizeRobot = instantiate_seizeRobot_xjal();
    releaseRobot = instantiate_releaseRobot_xjal();
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
  public DropOffStation() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public DropOffStation( ResourcePool resource, int nItemsToDrop, int capacity, double operationTime, Path trajectoryToConveyor ) {
    markParametersAreSet();
    this.resource = resource;
    this.nItemsToDrop = nItemsToDrop;
    this.capacity = capacity;
    this.operationTime = operationTime;
    this.trajectoryToConveyor = trajectoryToConveyor;
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
    setupPlainVariables_DropOffStation_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( DropOffStation.this, true, 0, 0, 0, 0 , level );
    // Creating embedded object instances
    instantiatePopulations_xjal();
    icon = new ShapeModelElementsGroup( DropOffStation.this, getElementProperty( "warehouse_conveyor.DropOffStation.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS ) , conveyorDropOffImg );
    icon.setIconOffsets( 50.0, 50.0 );
    // Creating non-replicated embedded objects
    setupParameters_batch_xjal( batch, null );
    doBeforeCreate_batch_xjal( batch, null );
    batch.createAsEmbedded();
    setupParameters_unbatch_xjal( unbatch, null );
    doBeforeCreate_unbatch_xjal( unbatch, null );
    unbatch.createAsEmbedded();
    setupParameters_dropoff_xjal( dropoff, null );
    doBeforeCreate_dropoff_xjal( dropoff, null );
    dropoff.createAsEmbedded();
    setupParameters_raStart_xjal( raStart, null );
    doBeforeCreate_raStart_xjal( raStart, null );
    raStart.createAsEmbedded();
    setupParameters_hold_xjal( hold, null );
    doBeforeCreate_hold_xjal( hold, null );
    hold.createAsEmbedded();
    setupParameters_raEnd_xjal( raEnd, null );
    doBeforeCreate_raEnd_xjal( raEnd, null );
    raEnd.createAsEmbedded();
    setupParameters_waitForRobot_xjal( waitForRobot, null );
    doBeforeCreate_waitForRobot_xjal( waitForRobot, null );
    waitForRobot.createAsEmbedded();
    setupParameters_seize_xjal( seize, null );
    doBeforeCreate_seize_xjal( seize, null );
    seize.createAsEmbedded();
    setupParameters_release_xjal( release, null );
    doBeforeCreate_release_xjal( release, null );
    release.createAsEmbedded();
    setupParameters_singleInput_xjal( singleInput, null );
    doBeforeCreate_singleInput_xjal( singleInput, null );
    singleInput.createAsEmbedded();
    setupParameters_dropOnConveyor1_xjal( dropOnConveyor1, null );
    doBeforeCreate_dropOnConveyor1_xjal( dropOnConveyor1, null );
    dropOnConveyor1.createAsEmbedded();
    setupParameters_dropOnConveyor_xjal( dropOnConveyor, null );
    doBeforeCreate_dropOnConveyor_xjal( dropOnConveyor, null );
    dropOnConveyor.createAsEmbedded();
    setupParameters_seizeRobot_xjal( seizeRobot, null );
    doBeforeCreate_seizeRobot_xjal( seizeRobot, null );
    seizeRobot.createAsEmbedded();
    setupParameters_releaseRobot_xjal( releaseRobot, null );
    doBeforeCreate_releaseRobot_xjal( releaseRobot, null );
    releaseRobot.createAsEmbedded();
	 // Port connectors with non-replicated objects
    raStart.out.connect( batch.in ); // connector8
    raEnd.in.connect( unbatch.out ); // connector10
    dropoff.outDropoff.connect( waitForRobot.in ); // connector5
    seize.out.connect( dropoff.in ); // connector
    dropoff.out.connect( release.in ); // connector1
    release.out.connect( hold.in ); // connector2
    waitForRobot.out.connect( singleInput.in ); // connector3
    singleInput.outF.connect( raStart.in ); // connector6
    portItem.map( raEnd.out ); // connector9
    dropOnConveyor1.in.connect( singleInput.outT ); // connector11
    portItem.map( dropOnConveyor1.out ); // connector12
    port.map( seize.in ); // connector13
    portPallet.map( hold.out ); // connector14
    dropOnConveyor.in.connect( seizeRobot.out ); // connector7
    seizeRobot.in.connect( batch.out ); // connector15
    unbatch.in.connect( releaseRobot.out ); // connector4
    releaseRobot.in.connect( dropOnConveyor.out ); // connector16
    // Creating replicated embedded objects
    setupInitialConditions_xjal( DropOffStation.class );
    // Dynamic initialization of persistent elements
    _createPersistentElementsBS0_xjal();
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
    batch.startAsEmbedded();
    unbatch.startAsEmbedded();
    dropoff.startAsEmbedded();
    raStart.startAsEmbedded();
    hold.startAsEmbedded();
    raEnd.startAsEmbedded();
    waitForRobot.startAsEmbedded();
    seize.startAsEmbedded();
    release.startAsEmbedded();
    singleInput.startAsEmbedded();
    dropOnConveyor1.startAsEmbedded();
    dropOnConveyor.startAsEmbedded();
    seizeRobot.startAsEmbedded();
    releaseRobot.startAsEmbedded();
  }
 

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_DropOffStation_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_DropOffStation_xjal() {
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
    list.add( batch );
    list.add( unbatch );
    list.add( dropoff );
    list.add( raStart );
    list.add( hold );
    list.add( raEnd );
    list.add( waitForRobot );
    list.add( seize );
    list.add( release );
    list.add( singleInput );
    list.add( dropOnConveyor1 );
    list.add( dropOnConveyor );
    list.add( seizeRobot );
    list.add( releaseRobot );
    return list;
  }

  public AgentList<? extends DropOffStation> getPopulation() {
    return (AgentList<? extends DropOffStation>) super.getPopulation();
  }

  public List<? extends DropOffStation> agentsInRange( double distance ) {
    return (List<? extends DropOffStation>) super.agentsInRange( distance );
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    port.onDestroy();
    portPallet.onDestroy();
    portItem.onDestroy();
    batch.onDestroy();
    unbatch.onDestroy();
    dropoff.onDestroy();
    raStart.onDestroy();
    hold.onDestroy();
    raEnd.onDestroy();
    waitForRobot.onDestroy();
    seize.onDestroy();
    release.onDestroy();
    singleInput.onDestroy();
    dropOnConveyor1.onDestroy();
    dropOnConveyor.onDestroy();
    seizeRobot.onDestroy();
    releaseRobot.onDestroy();
    super.onDestroy();
  }

  @AnyLogicInternalCodegenAPI
  @Override
  public void doFinish() {
    super.doFinish();
    batch.doFinish();
    unbatch.doFinish();
    dropoff.doFinish();
    raStart.doFinish();
    hold.doFinish();
    raEnd.doFinish();
    waitForRobot.doFinish();
    seize.doFinish();
    release.doFinish();
    singleInput.doFinish();
    dropOnConveyor1.doFinish();
    dropOnConveyor.doFinish();
    seizeRobot.doFinish();
    releaseRobot.doFinish();
  }



}
