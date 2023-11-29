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
    return 
 
;
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

 
;  
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
    return 
 
;
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

 
;  
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
    return 
 
;
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

 
;
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
    return 
 
;
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

 
;  
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
    return 
 
;
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

 
;
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
      // Additional class code

 
      // End of additional class code
      @Override
      public Agent newBatch(  ) {
        return _batch_newBatch_xjal( this );
      }
      @Override
      public boolean changeDimensions( ItemBatch agent ) {
        return _batch_changeDimensions_xjal( this, agent );
      }
      @Override
      public double length( ItemBatch agent ) {
        return _batch_length_xjal( this, agent );
      }
      @Override
      public double width( ItemBatch agent ) {
        return _batch_width_xjal( this, agent );
      }
      @Override
      public double height( ItemBatch agent ) {
        return _batch_height_xjal( this, agent );
      }
      @Override
      public double locationX( ItemBatch agent ) {
        return _batch_locationX_xjal( this, agent );
      }
      @Override
      public double locationY( ItemBatch agent ) {
        return _batch_locationY_xjal( this, agent );
      }
      @Override
      public double locationZ( ItemBatch agent ) {
        return _batch_locationZ_xjal( this, agent );
      }
      @Override
      public double locationLatitude( ItemBatch agent ) {
        return _batch_locationLatitude_xjal( this, agent );
      }
      @Override
      public double locationLongitude( ItemBatch agent ) {
        return _batch_locationLongitude_xjal( this, agent );
      }
      @Override
      public String locationGeoPlaceName( ItemBatch agent ) {
        return _batch_locationGeoPlaceName_xjal( this, agent );
      }
      @Override
      public INetwork locationNetwork( ItemBatch agent ) {
        return _batch_locationNetwork_xjal( this, agent );
      }
      @Override
      public Level locationLevel( ItemBatch agent ) {
        return _batch_locationLevel_xjal( this, agent );
      }
      @Override
      public INode locationNode( ItemBatch agent ) {
        return _batch_locationNode_xjal( this, agent );
      }
      @Override
      public Attractor locationAttractor( ItemBatch agent ) {
        return _batch_locationAttractor_xjal( this, agent );
      }
      @Override
      public double speed( ItemBatch agent ) {
        return _batch_speed_xjal( this, agent );
      }
      @Override
      public AgentList population( ItemBatch batch ) {
        return _batch_population_xjal( this, batch );
      }
      @Override
      public void onEnter( Item agent ) {
        _batch_onEnter_xjal( this, agent );
      }
      @Override
      public void onAdd( Item agent, ItemBatch batch ) {
        _batch_onAdd_xjal( this, agent, batch );
      }
      @Override
      public void onExit( ItemBatch batch ) {
        _batch_onExit_xjal( this, batch );
      }
      @Override
      public void onRemove( Item agent ) {
        _batch_onRemove_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_batch_xjal( final com.anylogic.libraries.processmodeling.Batch<Item, ItemBatch> self, TableInput _t ) {
    self.batchSize = 
10 
;
    self.permanent = 
false 
;
    self.entityLocation = 
 
;
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
  private void doBeforeCreate_batch_xjal( com.anylogic.libraries.processmodeling.Batch<Item, ItemBatch> self, TableInput _t ) {
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
  protected com.anylogic.libraries.processmodeling.Unbatch<ItemBatch, Item> instantiate_unbatch_xjal() {
    com.anylogic.libraries.processmodeling.Unbatch<ItemBatch, Item> _result_xjal = new com.anylogic.libraries.processmodeling.Unbatch<ItemBatch, Item>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public double locationX( Item agent ) {
        return _unbatch_locationX_xjal( this, agent );
      }
      @Override
      public double locationY( Item agent ) {
        return _unbatch_locationY_xjal( this, agent );
      }
      @Override
      public double locationZ( Item agent ) {
        return _unbatch_locationZ_xjal( this, agent );
      }
      @Override
      public double locationLatitude( Item agent ) {
        return _unbatch_locationLatitude_xjal( this, agent );
      }
      @Override
      public double locationLongitude( Item agent ) {
        return _unbatch_locationLongitude_xjal( this, agent );
      }
      @Override
      public String locationGeoPlaceName( Item agent ) {
        return _unbatch_locationGeoPlaceName_xjal( this, agent );
      }
      @Override
      public INetwork locationNetwork( Item agent ) {
        return _unbatch_locationNetwork_xjal( this, agent );
      }
      @Override
      public Level locationLevel( Item agent ) {
        return _unbatch_locationLevel_xjal( this, agent );
      }
      @Override
      public INode locationNode( Item agent ) {
        return _unbatch_locationNode_xjal( this, agent );
      }
      @Override
      public Attractor locationAttractor( Item agent ) {
        return _unbatch_locationAttractor_xjal( this, agent );
      }
      @Override
      public void onEnter( ItemBatch batch ) {
        _unbatch_onEnter_xjal( this, batch );
      }
      @Override
      public void onExit( ItemBatch batch, Item agent ) {
        _unbatch_onExit_xjal( this, batch, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_unbatch_xjal( final com.anylogic.libraries.processmodeling.Unbatch<ItemBatch, Item> self, TableInput _t ) {
    self.sameAsBatchLocation = 
true 
;
    self.locationType = 
self.LOCATION_NODE 
;
    self.locationXYZInNetwork = 
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
  private void doBeforeCreate_unbatch_xjal( com.anylogic.libraries.processmodeling.Unbatch<ItemBatch, Item> self, TableInput _t ) {
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
  protected com.anylogic.libraries.processmodeling.Dropoff<Pallet, Item> instantiate_dropoff_xjal() {
    com.anylogic.libraries.processmodeling.Dropoff<Pallet, Item> _result_xjal = new com.anylogic.libraries.processmodeling.Dropoff<Pallet, Item>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public boolean condition( Pallet container, Item agent ) {
        return _dropoff_condition_xjal( this, container, agent );
      }
      @Override
      public int quantity( Pallet container ) {
        return _dropoff_quantity_xjal( this, container );
      }
      @Override
      public void onEnter( Pallet container ) {
        _dropoff_onEnter_xjal( this, container );
      }
      @Override
      public void onDropoff( Pallet container, Item agent ) {
        _dropoff_onDropoff_xjal( this, container, agent );
      }
      @Override
      public void onExit( Pallet container ) {
        _dropoff_onExit_xjal( this, container );
      }
      @Override
      public void onDropoffExit( Pallet container, Item agent ) {
        _dropoff_onDropoffExit_xjal( this, container, agent );
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
    self.pushProtocol = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_dropoff_xjal( com.anylogic.libraries.processmodeling.Dropoff<Pallet, Item> self, TableInput _t ) {
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
  protected com.anylogic.libraries.processmodeling.RestrictedAreaStart<Item> instantiate_raStart_xjal() {
    com.anylogic.libraries.processmodeling.RestrictedAreaStart<Item> _result_xjal = new com.anylogic.libraries.processmodeling.RestrictedAreaStart<Item>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public void onEnter( Item agent ) {
        _raStart_onEnter_xjal( this, agent );
      }
	};
    
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
  protected com.anylogic.libraries.processmodeling.Hold<Pallet> instantiate_hold_xjal() {
    com.anylogic.libraries.processmodeling.Hold<Pallet> _result_xjal = new com.anylogic.libraries.processmodeling.Hold<Pallet>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public boolean condition( Pallet agent ) {
        return _hold_condition_xjal( this, agent );
      }
      @Override
      public void onEnter( Pallet agent ) {
        _hold_onEnter_xjal( this, agent );
      }
	};
    
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
    self.nEntitiesForSelfBlock = 
1 
;
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
  protected com.anylogic.libraries.processmodeling.RestrictedAreaEnd<Item> instantiate_raEnd_xjal() {
    com.anylogic.libraries.processmodeling.RestrictedAreaEnd<Item> _result_xjal = new com.anylogic.libraries.processmodeling.RestrictedAreaEnd<Item>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
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
  protected com.anylogic.libraries.processmodeling.Queue<Item> instantiate_waitForRobot_xjal() {
    com.anylogic.libraries.processmodeling.Queue<Item> _result_xjal = new com.anylogic.libraries.processmodeling.Queue<Item>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public double priority( Item agent ) {
        return _waitForRobot_priority_xjal( this, agent );
      }
      @Override
      public boolean comparison( Item agent1, Item agent2 ) {
        return _waitForRobot_comparison_xjal( this, agent1, agent2 );
      }
      @Override
      public double timeout( Item agent ) {
        return _waitForRobot_timeout_xjal( this, agent );
      }
      @Override
      public void onEnter( Item agent ) {
        _waitForRobot_onEnter_xjal( this, agent );
      }
      @Override
      public void onAtExit( Item agent ) {
        _waitForRobot_onAtExit_xjal( this, agent );
      }
      @Override
      public void onExit( Item agent ) {
        _waitForRobot_onExit_xjal( this, agent );
      }
      @Override
      public void onExitTimeout( Item agent ) {
        _waitForRobot_onExitTimeout_xjal( this, agent );
      }
      @Override
      public void onExitPreempted( Item agent ) {
        _waitForRobot_onExitPreempted_xjal( this, agent );
      }
      @Override
      public void onRemove( Item agent ) {
        _waitForRobot_onRemove_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_waitForRobot_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, TableInput _t ) {
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
false 
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
  private void doBeforeCreate_waitForRobot_xjal( com.anylogic.libraries.processmodeling.Queue<Item> self, TableInput _t ) {
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
  protected com.anylogic.libraries.processmodeling.Seize<Pallet> instantiate_seize_xjal() {
    com.anylogic.libraries.processmodeling.Seize<Pallet> _result_xjal = new com.anylogic.libraries.processmodeling.Seize<Pallet>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool[][] resourceSets( Pallet agent ) {
        return _seize_resourceSets_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool resourcePool( Pallet agent ) {
        return _seize_resourcePool_xjal( this, agent );
      }
      @Override
      public int resourceQuantity( Pallet agent ) {
        return _seize_resourceQuantity_xjal( this, agent );
      }
      @Override
      public boolean sendResources( Pallet agent, Agent unit ) {
        return _seize_sendResources_xjal( this, agent, unit );
      }
      @Override
      public INode destinationNode( Pallet agent, Agent unit ) {
        return _seize_destinationNode_xjal( this, agent, unit );
      }
      @Override
      public Attractor destinationAttractor( Pallet agent, Agent unit ) {
        return _seize_destinationAttractor_xjal( this, agent, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool destinationResource( Pallet agent, Agent unit ) {
        return _seize_destinationResource_xjal( this, agent, unit );
      }
      @Override
      public double destinationX( Pallet agent, Agent unit ) {
        return _seize_destinationX_xjal( this, agent, unit );
      }
      @Override
      public double destinationY( Pallet agent, Agent unit ) {
        return _seize_destinationY_xjal( this, agent, unit );
      }
      @Override
      public double destinationZ( Pallet agent, Agent unit ) {
        return _seize_destinationZ_xjal( this, agent, unit );
      }
      @Override
      public boolean attachResources( Pallet agent, Agent unit ) {
        return _seize_attachResources_xjal( this, agent, unit );
      }
      @Override
      public double priority( Pallet agent ) {
        return _seize_priority_xjal( this, agent );
      }
      @Override
      public boolean taskMayPreemptOtherTasks( Pallet agent ) {
        return _seize_taskMayPreemptOtherTasks_xjal( this, agent );
      }
      @Override
      public com.anylogic.engine.TaskPreemptionPolicy taskPreemptionPolicy( Pallet agent ) {
        return _seize_taskPreemptionPolicy_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.Enter terminatedTasksEnter( Pallet agent, Agent unit ) {
        return _seize_terminatedTasksEnter_xjal( this, agent, unit );
      }
      @Override
      public boolean resourceChoiceCondition( Pallet agent, Agent unit, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
        return _seize_resourceChoiceCondition_xjal( this, agent, unit, pool );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceSelectionMode resourceSelectionMode( Pallet agent, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
        return _seize_resourceSelectionMode_xjal( this, agent, pool );
      }
      @Override
      public double resourceRating( Agent unit, Pallet agent ) {
        return _seize_resourceRating_xjal( this, unit, agent );
      }
      @Override
      public boolean resourceComparison( Agent unit1, Agent unit2, Pallet agent ) {
        return _seize_resourceComparison_xjal( this, unit1, unit2, agent );
      }
      @Override
      public double timeout( Pallet agent ) {
        return _seize_timeout_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.Release canceledUnitsRelease( Pallet agent, Agent unit ) {
        return _seize_canceledUnitsRelease_xjal( this, agent, unit );
      }
      @Override
      public void onEnter( Pallet agent ) {
        _seize_onEnter_xjal( this, agent );
      }
      @Override
      public void onExitTimeout( Pallet agent ) {
        _seize_onExitTimeout_xjal( this, agent );
      }
      @Override
      public void onExitPreempted( Pallet agent ) {
        _seize_onExitPreempted_xjal( this, agent );
      }
      @Override
      public void onSeizeUnit( Pallet agent, Agent unit ) {
        _seize_onSeizeUnit_xjal( this, agent, unit );
      }
      @Override
      public void onPrepareUnit( Pallet agent, Agent unit ) {
        _seize_onPrepareUnit_xjal( this, agent, unit );
      }
      @Override
      public void onExit( Pallet agent ) {
        _seize_onExit_xjal( this, agent );
      }
      @Override
      public void onRemove( Pallet agent ) {
        _seize_onRemove_xjal( this, agent );
      }
      @Override
      public void onTaskTerminated( Pallet agent, Agent unit ) {
        _seize_onTaskTerminated_xjal( this, agent, unit );
      }
      @Override
      public void onTaskSuspended( Pallet agent, Agent unit ) {
        _seize_onTaskSuspended_xjal( this, agent, unit );
      }
      @Override
      public void onTaskResumed( Pallet agent, Agent unit ) {
        _seize_onTaskResumed_xjal( this, agent, unit );
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
    self.seizePolicy = 
self.SEIZE_WHOLE_SET 
;
    self.capacity = 
1 
;
    self.maximumCapacity = 
false 
;
    self.destinationType = 
self.DEST_ENTITY 
;
    self.entityLocationQueue = 
 
;
    self.terminatedTaskProcessing = 
self.TERMINATED_DO_NOTHING 
;
    self.suspendResumeEntities = 
true 
;
    self.customizeResourceChoice = 
false 
;
    self.taskStartBlocksAreConnected = 
true 
;
    self.taskStartBlocks = 
 
;
    self.enableTimeout = 
false 
;
    self.enablePreemption = 
false 
;
    self.canceledUnitsBehavior = 
self.CANCELED_UNITS_STAY_WHERE_THEY_ARE 
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
  private void doBeforeCreate_seize_xjal( com.anylogic.libraries.processmodeling.Seize<Pallet> self, TableInput _t ) {
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
  protected com.anylogic.libraries.processmodeling.Release<Pallet> instantiate_release_xjal() {
    com.anylogic.libraries.processmodeling.Release<Pallet> _result_xjal = new com.anylogic.libraries.processmodeling.Release<Pallet>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool resourcePool( Pallet agent ) {
        return _release_resourcePool_xjal( this, agent );
      }
      @Override
      public int quantity( Pallet agent ) {
        return _release_quantity_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool[] resources( Pallet agent ) {
        return _release_resources_xjal( this, agent );
      }
      @Override
      public boolean movingGoHome( Pallet agent, Agent unit ) {
        return _release_movingGoHome_xjal( this, agent, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.WrapUpPolicy wrapUpTaskPolicyType( Pallet agent, Agent unit ) {
        return _release_wrapUpTaskPolicyType_xjal( this, agent, unit );
      }
      @Override
      public double wrapUpTaskPriority( Pallet agent, Agent unit ) {
        return _release_wrapUpTaskPriority_xjal( this, agent, unit );
      }
      @Override
      public boolean wrapUpTaskMayPreemptOtherTasks( Pallet agent, Agent unit ) {
        return _release_wrapUpTaskMayPreemptOtherTasks_xjal( this, agent, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy wrapUpTaskPreemptionPolicy( Pallet agent, Agent unit ) {
        return _release_wrapUpTaskPreemptionPolicy_xjal( this, agent, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceUsageState wrapUpUsageState( Pallet agent, Agent unit ) {
        return _release_wrapUpUsageState_xjal( this, agent, unit );
      }
      @Override
      public void onEnter( Pallet agent ) {
        _release_onEnter_xjal( this, agent );
      }
      @Override
      public void onReleaseUnit( Pallet agent, Agent unit ) {
        _release_onReleaseUnit_xjal( this, agent, unit );
      }
      @Override
      public void onExit( Pallet agent ) {
        _release_onExit_xjal( this, agent );
      }
      @Override
      public void onWrapUpTerminated( Agent unit, Pallet agent ) {
        _release_onWrapUpTerminated_xjal( this, unit, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_release_xjal( final com.anylogic.libraries.processmodeling.Release<Pallet> self, TableInput _t ) {
    self.releaseMode = 
self.ALL 
;
    self.seizeBlocks = 
{} 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_release_xjal( com.anylogic.libraries.processmodeling.Release<Pallet> self, TableInput _t ) {
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
  protected com.anylogic.libraries.processmodeling.SelectOutput<Item> instantiate_singleInput_xjal() {
    com.anylogic.libraries.processmodeling.SelectOutput<Item> _result_xjal = new com.anylogic.libraries.processmodeling.SelectOutput<Item>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public boolean condition( Item agent ) {
        return _singleInput_condition_xjal( this, agent );
      }
      @Override
      public double probability( Item agent ) {
        return _singleInput_probability_xjal( this, agent );
      }
      @Override
      public void onEnter( Item agent ) {
        _singleInput_onEnter_xjal( this, agent );
      }
      @Override
      public void onExitTrue( Item agent ) {
        _singleInput_onExitTrue_xjal( this, agent );
      }
      @Override
      public void onExitFalse( Item agent ) {
        _singleInput_onExitFalse_xjal( this, agent );
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
  protected com.anylogic.libraries.processmodeling.Delay<Item> instantiate_dropOnConveyor1_xjal() {
    com.anylogic.libraries.processmodeling.Delay<Item> _result_xjal = new com.anylogic.libraries.processmodeling.Delay<Item>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
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
      @Override
      public void onAtExit( Item agent ) {
        _dropOnConveyor1_onAtExit_xjal( this, agent );
      }
      @Override
      public void onExit( Item agent ) {
        _dropOnConveyor1_onExit_xjal( this, agent );
      }
      @Override
      public void onRemove( Item agent ) {
        _dropOnConveyor1_onRemove_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_dropOnConveyor1_xjal( final com.anylogic.libraries.processmodeling.Delay<Item> self, TableInput _t ) {
    self.type = 
self.TIMEOUT 
;
    self.capacity = 
1 
;
    self.maximumCapacity = 
false 
;
    self.entityLocation = 
trajectoryToConveyor 
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
  private void doBeforeCreate_dropOnConveyor1_xjal( com.anylogic.libraries.processmodeling.Delay<Item> self, TableInput _t ) {
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
  protected com.anylogic.libraries.processmodeling.Delay<ItemBatch> instantiate_dropOnConveyor_xjal() {
    com.anylogic.libraries.processmodeling.Delay<ItemBatch> _result_xjal = new com.anylogic.libraries.processmodeling.Delay<ItemBatch>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public double delayTime( ItemBatch agent ) {
        return _dropOnConveyor_delayTime_xjal( this, agent );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTime() {
        return SECOND;
      }
      @Override
      public void onEnter( ItemBatch agent, double delayTime ) {
        _dropOnConveyor_onEnter_xjal( this, agent, delayTime );
      }
      @Override
      public void onAtExit( ItemBatch agent ) {
        _dropOnConveyor_onAtExit_xjal( this, agent );
      }
      @Override
      public void onExit( ItemBatch agent ) {
        _dropOnConveyor_onExit_xjal( this, agent );
      }
      @Override
      public void onRemove( ItemBatch agent ) {
        _dropOnConveyor_onRemove_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_dropOnConveyor_xjal( final com.anylogic.libraries.processmodeling.Delay<ItemBatch> self, TableInput _t ) {
    self.type = 
self.TIMEOUT 
;
    self.capacity = 
1 
;
    self.maximumCapacity = 
false 
;
    self.entityLocation = 
trajectoryToConveyor 
;
    self.pushProtocol = 
false 
;
    self.restoreEntityLocationOnExit = 
false 
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
  private void doBeforeCreate_dropOnConveyor_xjal( com.anylogic.libraries.processmodeling.Delay<ItemBatch> self, TableInput _t ) {
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
  protected com.anylogic.libraries.processmodeling.Seize<ItemBatch> instantiate_seizeRobot_xjal() {
    com.anylogic.libraries.processmodeling.Seize<ItemBatch> _result_xjal = new com.anylogic.libraries.processmodeling.Seize<ItemBatch>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool[][] resourceSets( ItemBatch agent ) {
        return _seizeRobot_resourceSets_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool resourcePool( ItemBatch agent ) {
        return _seizeRobot_resourcePool_xjal( this, agent );
      }
      @Override
      public int resourceQuantity( ItemBatch agent ) {
        return _seizeRobot_resourceQuantity_xjal( this, agent );
      }
      @Override
      public boolean sendResources( ItemBatch agent, Agent unit ) {
        return _seizeRobot_sendResources_xjal( this, agent, unit );
      }
      @Override
      public INode destinationNode( ItemBatch agent, Agent unit ) {
        return _seizeRobot_destinationNode_xjal( this, agent, unit );
      }
      @Override
      public Attractor destinationAttractor( ItemBatch agent, Agent unit ) {
        return _seizeRobot_destinationAttractor_xjal( this, agent, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool destinationResource( ItemBatch agent, Agent unit ) {
        return _seizeRobot_destinationResource_xjal( this, agent, unit );
      }
      @Override
      public double destinationX( ItemBatch agent, Agent unit ) {
        return _seizeRobot_destinationX_xjal( this, agent, unit );
      }
      @Override
      public double destinationY( ItemBatch agent, Agent unit ) {
        return _seizeRobot_destinationY_xjal( this, agent, unit );
      }
      @Override
      public double destinationZ( ItemBatch agent, Agent unit ) {
        return _seizeRobot_destinationZ_xjal( this, agent, unit );
      }
      @Override
      public boolean attachResources( ItemBatch agent, Agent unit ) {
        return _seizeRobot_attachResources_xjal( this, agent, unit );
      }
      @Override
      public double priority( ItemBatch agent ) {
        return _seizeRobot_priority_xjal( this, agent );
      }
      @Override
      public boolean taskMayPreemptOtherTasks( ItemBatch agent ) {
        return _seizeRobot_taskMayPreemptOtherTasks_xjal( this, agent );
      }
      @Override
      public com.anylogic.engine.TaskPreemptionPolicy taskPreemptionPolicy( ItemBatch agent ) {
        return _seizeRobot_taskPreemptionPolicy_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.Enter terminatedTasksEnter( ItemBatch agent, Agent unit ) {
        return _seizeRobot_terminatedTasksEnter_xjal( this, agent, unit );
      }
      @Override
      public boolean resourceChoiceCondition( ItemBatch agent, Agent unit, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
        return _seizeRobot_resourceChoiceCondition_xjal( this, agent, unit, pool );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceSelectionMode resourceSelectionMode( ItemBatch agent, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
        return _seizeRobot_resourceSelectionMode_xjal( this, agent, pool );
      }
      @Override
      public double resourceRating( Agent unit, ItemBatch agent ) {
        return _seizeRobot_resourceRating_xjal( this, unit, agent );
      }
      @Override
      public boolean resourceComparison( Agent unit1, Agent unit2, ItemBatch agent ) {
        return _seizeRobot_resourceComparison_xjal( this, unit1, unit2, agent );
      }
      @Override
      public double timeout( ItemBatch agent ) {
        return _seizeRobot_timeout_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.Release canceledUnitsRelease( ItemBatch agent, Agent unit ) {
        return _seizeRobot_canceledUnitsRelease_xjal( this, agent, unit );
      }
      @Override
      public void onEnter( ItemBatch agent ) {
        _seizeRobot_onEnter_xjal( this, agent );
      }
      @Override
      public void onExitTimeout( ItemBatch agent ) {
        _seizeRobot_onExitTimeout_xjal( this, agent );
      }
      @Override
      public void onExitPreempted( ItemBatch agent ) {
        _seizeRobot_onExitPreempted_xjal( this, agent );
      }
      @Override
      public void onSeizeUnit( ItemBatch agent, Agent unit ) {
        _seizeRobot_onSeizeUnit_xjal( this, agent, unit );
      }
      @Override
      public void onPrepareUnit( ItemBatch agent, Agent unit ) {
        _seizeRobot_onPrepareUnit_xjal( this, agent, unit );
      }
      @Override
      public void onExit( ItemBatch agent ) {
        _seizeRobot_onExit_xjal( this, agent );
      }
      @Override
      public void onRemove( ItemBatch agent ) {
        _seizeRobot_onRemove_xjal( this, agent );
      }
      @Override
      public void onTaskTerminated( ItemBatch agent, Agent unit ) {
        _seizeRobot_onTaskTerminated_xjal( this, agent, unit );
      }
      @Override
      public void onTaskSuspended( ItemBatch agent, Agent unit ) {
        _seizeRobot_onTaskSuspended_xjal( this, agent, unit );
      }
      @Override
      public void onTaskResumed( ItemBatch agent, Agent unit ) {
        _seizeRobot_onTaskResumed_xjal( this, agent, unit );
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
    self.seizePolicy = 
self.SEIZE_WHOLE_SET 
;
    self.capacity = 
100 
;
    self.maximumCapacity = 
true 
;
    self.destinationType = 
self.DEST_ENTITY 
;
    self.entityLocationQueue = 
 
;
    self.terminatedTaskProcessing = 
self.TERMINATED_SEND_TO_ENTER_BLOCK 
;
    self.suspendResumeEntities = 
true 
;
    self.customizeResourceChoice = 
false 
;
    self.taskStartBlocksAreConnected = 
true 
;
    self.taskStartBlocks = 
 
;
    self.enableTimeout = 
false 
;
    self.enablePreemption = 
false 
;
    self.canceledUnitsBehavior = 
self.CANCELED_UNITS_STAY_WHERE_THEY_ARE 
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
  private void doBeforeCreate_seizeRobot_xjal( com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, TableInput _t ) {
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
  protected com.anylogic.libraries.processmodeling.Release<ItemBatch> instantiate_releaseRobot_xjal() {
    com.anylogic.libraries.processmodeling.Release<ItemBatch> _result_xjal = new com.anylogic.libraries.processmodeling.Release<ItemBatch>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool resourcePool( ItemBatch agent ) {
        return _releaseRobot_resourcePool_xjal( this, agent );
      }
      @Override
      public int quantity( ItemBatch agent ) {
        return _releaseRobot_quantity_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool[] resources( ItemBatch agent ) {
        return _releaseRobot_resources_xjal( this, agent );
      }
      @Override
      public boolean movingGoHome( ItemBatch agent, Agent unit ) {
        return _releaseRobot_movingGoHome_xjal( this, agent, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.WrapUpPolicy wrapUpTaskPolicyType( ItemBatch agent, Agent unit ) {
        return _releaseRobot_wrapUpTaskPolicyType_xjal( this, agent, unit );
      }
      @Override
      public double wrapUpTaskPriority( ItemBatch agent, Agent unit ) {
        return _releaseRobot_wrapUpTaskPriority_xjal( this, agent, unit );
      }
      @Override
      public boolean wrapUpTaskMayPreemptOtherTasks( ItemBatch agent, Agent unit ) {
        return _releaseRobot_wrapUpTaskMayPreemptOtherTasks_xjal( this, agent, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy wrapUpTaskPreemptionPolicy( ItemBatch agent, Agent unit ) {
        return _releaseRobot_wrapUpTaskPreemptionPolicy_xjal( this, agent, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceUsageState wrapUpUsageState( ItemBatch agent, Agent unit ) {
        return _releaseRobot_wrapUpUsageState_xjal( this, agent, unit );
      }
      @Override
      public void onEnter( ItemBatch agent ) {
        _releaseRobot_onEnter_xjal( this, agent );
      }
      @Override
      public void onReleaseUnit( ItemBatch agent, Agent unit ) {
        _releaseRobot_onReleaseUnit_xjal( this, agent, unit );
      }
      @Override
      public void onExit( ItemBatch agent ) {
        _releaseRobot_onExit_xjal( this, agent );
      }
      @Override
      public void onWrapUpTerminated( Agent unit, ItemBatch agent ) {
        _releaseRobot_onWrapUpTerminated_xjal( this, unit, agent );
      }
	};
    
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

  private Agent _batch_newBatch_xjal( final com.anylogic.libraries.processmodeling.Batch<Item, ItemBatch> self ) {
    Agent _value;
    _value = 
new ItemBatch( palletColor ) 
;
    return _value;
  }
  private boolean _batch_changeDimensions_xjal( final com.anylogic.libraries.processmodeling.Batch<Item, ItemBatch> self, ItemBatch agent ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _batch_length_xjal( final com.anylogic.libraries.processmodeling.Batch<Item, ItemBatch> self, ItemBatch agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private double _batch_width_xjal( final com.anylogic.libraries.processmodeling.Batch<Item, ItemBatch> self, ItemBatch agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private double _batch_height_xjal( final com.anylogic.libraries.processmodeling.Batch<Item, ItemBatch> self, ItemBatch agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private double _batch_locationX_xjal( final com.anylogic.libraries.processmodeling.Batch<Item, ItemBatch> self, ItemBatch agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _batch_locationY_xjal( final com.anylogic.libraries.processmodeling.Batch<Item, ItemBatch> self, ItemBatch agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _batch_locationZ_xjal( final com.anylogic.libraries.processmodeling.Batch<Item, ItemBatch> self, ItemBatch agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _batch_locationLatitude_xjal( final com.anylogic.libraries.processmodeling.Batch<Item, ItemBatch> self, ItemBatch agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _batch_locationLongitude_xjal( final com.anylogic.libraries.processmodeling.Batch<Item, ItemBatch> self, ItemBatch agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private String _batch_locationGeoPlaceName_xjal( final com.anylogic.libraries.processmodeling.Batch<Item, ItemBatch> self, ItemBatch agent ) {
    String _value;
    _value = 
 
;
    return _value;
  }
  private INetwork _batch_locationNetwork_xjal( final com.anylogic.libraries.processmodeling.Batch<Item, ItemBatch> self, ItemBatch agent ) {
    INetwork _value;
    _value = 
 
;
    return _value;
  }
  private Level _batch_locationLevel_xjal( final com.anylogic.libraries.processmodeling.Batch<Item, ItemBatch> self, ItemBatch agent ) {
    Level _value;
    _value = 
 
;
    return _value;
  }
  private INode _batch_locationNode_xjal( final com.anylogic.libraries.processmodeling.Batch<Item, ItemBatch> self, ItemBatch agent ) {
    INode _value;
    _value = 
 
;
    return _value;
  }
  private Attractor _batch_locationAttractor_xjal( final com.anylogic.libraries.processmodeling.Batch<Item, ItemBatch> self, ItemBatch agent ) {
    Attractor _value;
    _value = 
 
;
    return _value;
  }
  private double _batch_speed_xjal( final com.anylogic.libraries.processmodeling.Batch<Item, ItemBatch> self, ItemBatch agent ) {
    double _value;
    _value = 
10 
;
    return _value;
  }
  private AgentList _batch_population_xjal( final com.anylogic.libraries.processmodeling.Batch<Item, ItemBatch> self, ItemBatch batch ) {
    AgentList _value;
    _value = 
 
;
    return _value;
  }
  private void _batch_onEnter_xjal( final com.anylogic.libraries.processmodeling.Batch<Item, ItemBatch> self, Item agent ) {
    
 
;
  }
  private void _batch_onAdd_xjal( final com.anylogic.libraries.processmodeling.Batch<Item, ItemBatch> self, Item agent, ItemBatch batch ) {
    
 
;
  }
  private void _batch_onExit_xjal( final com.anylogic.libraries.processmodeling.Batch<Item, ItemBatch> self, ItemBatch batch ) {
    
 
;
  }
  private void _batch_onRemove_xjal( final com.anylogic.libraries.processmodeling.Batch<Item, ItemBatch> self, Item agent ) {
    
 
;
  }
  private double _unbatch_locationX_xjal( final com.anylogic.libraries.processmodeling.Unbatch<ItemBatch, Item> self, Item agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _unbatch_locationY_xjal( final com.anylogic.libraries.processmodeling.Unbatch<ItemBatch, Item> self, Item agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _unbatch_locationZ_xjal( final com.anylogic.libraries.processmodeling.Unbatch<ItemBatch, Item> self, Item agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _unbatch_locationLatitude_xjal( final com.anylogic.libraries.processmodeling.Unbatch<ItemBatch, Item> self, Item agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _unbatch_locationLongitude_xjal( final com.anylogic.libraries.processmodeling.Unbatch<ItemBatch, Item> self, Item agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private String _unbatch_locationGeoPlaceName_xjal( final com.anylogic.libraries.processmodeling.Unbatch<ItemBatch, Item> self, Item agent ) {
    String _value;
    _value = 
 
;
    return _value;
  }
  private INetwork _unbatch_locationNetwork_xjal( final com.anylogic.libraries.processmodeling.Unbatch<ItemBatch, Item> self, Item agent ) {
    INetwork _value;
    _value = 
 
;
    return _value;
  }
  private Level _unbatch_locationLevel_xjal( final com.anylogic.libraries.processmodeling.Unbatch<ItemBatch, Item> self, Item agent ) {
    Level _value;
    _value = 
 
;
    return _value;
  }
  private INode _unbatch_locationNode_xjal( final com.anylogic.libraries.processmodeling.Unbatch<ItemBatch, Item> self, Item agent ) {
    INode _value;
    _value = 
 
;
    return _value;
  }
  private Attractor _unbatch_locationAttractor_xjal( final com.anylogic.libraries.processmodeling.Unbatch<ItemBatch, Item> self, Item agent ) {
    Attractor _value;
    _value = 
 
;
    return _value;
  }
  private void _unbatch_onEnter_xjal( final com.anylogic.libraries.processmodeling.Unbatch<ItemBatch, Item> self, ItemBatch batch ) {
    
 
;
  }
  private void _unbatch_onExit_xjal( final com.anylogic.libraries.processmodeling.Unbatch<ItemBatch, Item> self, ItemBatch batch, Item agent ) {
    
 
;
  }
  private boolean _dropoff_condition_xjal( final com.anylogic.libraries.processmodeling.Dropoff<Pallet, Item> self, Pallet container, Item agent ) {
    boolean _value;
    _value = 
true 
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
  private void _dropoff_onDropoff_xjal( final com.anylogic.libraries.processmodeling.Dropoff<Pallet, Item> self, Pallet container, Item agent ) {
    
 
;
  }
  private void _dropoff_onExit_xjal( final com.anylogic.libraries.processmodeling.Dropoff<Pallet, Item> self, Pallet container ) {
    
 
;
  }
  private void _dropoff_onDropoffExit_xjal( final com.anylogic.libraries.processmodeling.Dropoff<Pallet, Item> self, Pallet container, Item agent ) {
    
 
;
  }
  private void _raStart_onEnter_xjal( final com.anylogic.libraries.processmodeling.RestrictedAreaStart<Item> self, Item agent ) {
    
 
;
  }
  private boolean _hold_condition_xjal( final com.anylogic.libraries.processmodeling.Hold<Pallet> self, Pallet agent ) {
    boolean _value;
    _value = 
 
;
    return _value;
  }
  private void _hold_onEnter_xjal( final com.anylogic.libraries.processmodeling.Hold<Pallet> self, Pallet agent ) {
    
 
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
  private double _waitForRobot_priority_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, Item agent ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _waitForRobot_comparison_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, Item agent1, Item agent2 ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _waitForRobot_timeout_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, Item agent ) {
    double _value;
    _value = 
100 
;
    return _value;
  }
  private void _waitForRobot_onEnter_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, Item agent ) {
    
 
;
  }
  private void _waitForRobot_onAtExit_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, Item agent ) {
    
 
;
  }
  private void _waitForRobot_onExit_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, Item agent ) {
    
agent.pallet.nItems--;
if (self.size() == 0)
	hold.unblock(); 
;
  }
  private void _waitForRobot_onExitTimeout_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, Item agent ) {
    
 
;
  }
  private void _waitForRobot_onExitPreempted_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, Item agent ) {
    
 
;
  }
  private void _waitForRobot_onRemove_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, Item agent ) {
    
 
;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool[][] _seize_resourceSets_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Pallet agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool[][] _value;
    _value = 
{{}} 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool _seize_resourcePool_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Pallet agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool _value;
    _value = 
resource 
;
    return _value;
  }
  private int _seize_resourceQuantity_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Pallet agent ) {
    int _value;
    _value = 
1 
;
    return _value;
  }
  private boolean _seize_sendResources_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Pallet agent, Agent unit ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private INode _seize_destinationNode_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Pallet agent, Agent unit ) {
    INode _value;
    _value = 
 
;
    return _value;
  }
  private Attractor _seize_destinationAttractor_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Pallet agent, Agent unit ) {
    Attractor _value;
    _value = 
 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool _seize_destinationResource_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Pallet agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourcePool _value;
    _value = 
 
;
    return _value;
  }
  private double _seize_destinationX_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Pallet agent, Agent unit ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _seize_destinationY_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Pallet agent, Agent unit ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _seize_destinationZ_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Pallet agent, Agent unit ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private boolean _seize_attachResources_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Pallet agent, Agent unit ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _seize_priority_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Pallet agent ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _seize_taskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Pallet agent ) {
    boolean _value;
    _value = 
true 
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
  private com.anylogic.libraries.processmodeling.Enter _seize_terminatedTasksEnter_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Pallet agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.Enter _value;
    _value = 
 
;
    return _value;
  }
  private boolean _seize_resourceChoiceCondition_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Pallet agent, Agent unit, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceSelectionMode _seize_resourceSelectionMode_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Pallet agent, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
    com.anylogic.libraries.processmodeling.ResourceSelectionMode _value;
    _value = 
self.RESOURCE_SELECTION_SOME_UNIT 
;
    return _value;
  }
  private double _seize_resourceRating_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Agent unit, Pallet agent ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _seize_resourceComparison_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Agent unit1, Agent unit2, Pallet agent ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _seize_timeout_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Pallet agent ) {
    double _value;
    _value = 
100 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.Release _seize_canceledUnitsRelease_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Pallet agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.Release _value;
    _value = 
 
;
    return _value;
  }
  private void _seize_onEnter_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Pallet agent ) {
    
 
;
  }
  private void _seize_onExitTimeout_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Pallet agent ) {
    
 
;
  }
  private void _seize_onExitPreempted_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Pallet agent ) {
    
 
;
  }
  private void _seize_onSeizeUnit_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Pallet agent, Agent unit ) {
    
if (agent.carriedItemsType != food)
	set_trajectoryToConveyor( main.trajectoriesToConv.get( agent.carriedItemsType ) ); 
;
  }
  private void _seize_onPrepareUnit_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Pallet agent, Agent unit ) {
    
 
;
  }
  private void _seize_onExit_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Pallet agent ) {
    
 
;
  }
  private void _seize_onRemove_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Pallet agent ) {
    
 
;
  }
  private void _seize_onTaskTerminated_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Pallet agent, Agent unit ) {
    
 
;
  }
  private void _seize_onTaskSuspended_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Pallet agent, Agent unit ) {
    
 
;
  }
  private void _seize_onTaskResumed_xjal( final com.anylogic.libraries.processmodeling.Seize<Pallet> self, Pallet agent, Agent unit ) {
    
 
;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool _release_resourcePool_xjal( final com.anylogic.libraries.processmodeling.Release<Pallet> self, Pallet agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool _value;
    _value = 
 
;
    return _value;
  }
  private int _release_quantity_xjal( final com.anylogic.libraries.processmodeling.Release<Pallet> self, Pallet agent ) {
    int _value;
    _value = 
1 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool[] _release_resources_xjal( final com.anylogic.libraries.processmodeling.Release<Pallet> self, Pallet agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool[] _value;
    _value = 
{} 
;
    return _value;
  }
  private boolean _release_movingGoHome_xjal( final com.anylogic.libraries.processmodeling.Release<Pallet> self, Pallet agent, Agent unit ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.WrapUpPolicy _release_wrapUpTaskPolicyType_xjal( final com.anylogic.libraries.processmodeling.Release<Pallet> self, Pallet agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.WrapUpPolicy _value;
    _value = 
self.WRAP_UP_ALWAYS 
;
    return _value;
  }
  private double _release_wrapUpTaskPriority_xjal( final com.anylogic.libraries.processmodeling.Release<Pallet> self, Pallet agent, Agent unit ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _release_wrapUpTaskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.Release<Pallet> self, Pallet agent, Agent unit ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _release_wrapUpTaskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.Release<Pallet> self, Pallet agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _value;
    _value = 
self.PP_NO_PREEMPTION 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceUsageState _release_wrapUpUsageState_xjal( final com.anylogic.libraries.processmodeling.Release<Pallet> self, Pallet agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourceUsageState _value;
    _value = 
self.USAGE_BUSY 
;
    return _value;
  }
  private void _release_onEnter_xjal( final com.anylogic.libraries.processmodeling.Release<Pallet> self, Pallet agent ) {
    
 
;
  }
  private void _release_onReleaseUnit_xjal( final com.anylogic.libraries.processmodeling.Release<Pallet> self, Pallet agent, Agent unit ) {
    
 
;
  }
  private void _release_onExit_xjal( final com.anylogic.libraries.processmodeling.Release<Pallet> self, Pallet agent ) {
    
 
;
  }
  private void _release_onWrapUpTerminated_xjal( final com.anylogic.libraries.processmodeling.Release<Pallet> self, Agent unit, Pallet agent ) {
    
 
;
  }
  private boolean _singleInput_condition_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Item> self, Item agent ) {
    boolean _value;
    _value = 
capacity == 1 
;
    return _value;
  }
  private double _singleInput_probability_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Item> self, Item agent ) {
    double _value;
    _value = 
0.5 
;
    return _value;
  }
  private void _singleInput_onEnter_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Item> self, Item agent ) {
    
 
;
  }
  private void _singleInput_onExitTrue_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Item> self, Item agent ) {
    
 
;
  }
  private void _singleInput_onExitFalse_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Item> self, Item agent ) {
    
 
;
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
  private void _dropOnConveyor1_onAtExit_xjal( final com.anylogic.libraries.processmodeling.Delay<Item> self, Item agent ) {
    
 
;
  }
  private void _dropOnConveyor1_onExit_xjal( final com.anylogic.libraries.processmodeling.Delay<Item> self, Item agent ) {
    
 
;
  }
  private void _dropOnConveyor1_onRemove_xjal( final com.anylogic.libraries.processmodeling.Delay<Item> self, Item agent ) {
    
 
;
  }
  private double _dropOnConveyor_delayTime_xjal( final com.anylogic.libraries.processmodeling.Delay<ItemBatch> self, ItemBatch agent ) {
    double _value;
    _value = 
operationTime 
;
    return _value;
  }
  private void _dropOnConveyor_onEnter_xjal( final com.anylogic.libraries.processmodeling.Delay<ItemBatch> self, ItemBatch agent, double delayTime ) {
    
 
;
  }
  private void _dropOnConveyor_onAtExit_xjal( final com.anylogic.libraries.processmodeling.Delay<ItemBatch> self, ItemBatch agent ) {
    
 
;
  }
  private void _dropOnConveyor_onExit_xjal( final com.anylogic.libraries.processmodeling.Delay<ItemBatch> self, ItemBatch agent ) {
    
 
;
  }
  private void _dropOnConveyor_onRemove_xjal( final com.anylogic.libraries.processmodeling.Delay<ItemBatch> self, ItemBatch agent ) {
    
 
;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool[][] _seizeRobot_resourceSets_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, ItemBatch agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool[][] _value;
    _value = 
{{}} 
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
  private int _seizeRobot_resourceQuantity_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, ItemBatch agent ) {
    int _value;
    _value = 
1 
;
    return _value;
  }
  private boolean _seizeRobot_sendResources_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, ItemBatch agent, Agent unit ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private INode _seizeRobot_destinationNode_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, ItemBatch agent, Agent unit ) {
    INode _value;
    _value = 
 
;
    return _value;
  }
  private Attractor _seizeRobot_destinationAttractor_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, ItemBatch agent, Agent unit ) {
    Attractor _value;
    _value = 
 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool _seizeRobot_destinationResource_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, ItemBatch agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourcePool _value;
    _value = 
 
;
    return _value;
  }
  private double _seizeRobot_destinationX_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, ItemBatch agent, Agent unit ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _seizeRobot_destinationY_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, ItemBatch agent, Agent unit ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _seizeRobot_destinationZ_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, ItemBatch agent, Agent unit ) {
    double _value;
    _value = 
 
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
  private boolean _seizeRobot_taskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, ItemBatch agent ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.engine.TaskPreemptionPolicy _seizeRobot_taskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, ItemBatch agent ) {
    com.anylogic.engine.TaskPreemptionPolicy _value;
    _value = 
self.PP_NO_PREEMPTION 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.Enter _seizeRobot_terminatedTasksEnter_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, ItemBatch agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.Enter _value;
    _value = 
 
;
    return _value;
  }
  private boolean _seizeRobot_resourceChoiceCondition_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, ItemBatch agent, Agent unit, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceSelectionMode _seizeRobot_resourceSelectionMode_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, ItemBatch agent, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
    com.anylogic.libraries.processmodeling.ResourceSelectionMode _value;
    _value = 
self.RESOURCE_SELECTION_SOME_UNIT 
;
    return _value;
  }
  private double _seizeRobot_resourceRating_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, Agent unit, ItemBatch agent ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _seizeRobot_resourceComparison_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, Agent unit1, Agent unit2, ItemBatch agent ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _seizeRobot_timeout_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, ItemBatch agent ) {
    double _value;
    _value = 
100 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.Release _seizeRobot_canceledUnitsRelease_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, ItemBatch agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.Release _value;
    _value = 
 
;
    return _value;
  }
  private void _seizeRobot_onEnter_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, ItemBatch agent ) {
    
 
;
  }
  private void _seizeRobot_onExitTimeout_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, ItemBatch agent ) {
    
 
;
  }
  private void _seizeRobot_onExitPreempted_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, ItemBatch agent ) {
    
 
;
  }
  private void _seizeRobot_onSeizeUnit_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, ItemBatch agent, Agent unit ) {
    
 
;
  }
  private void _seizeRobot_onPrepareUnit_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, ItemBatch agent, Agent unit ) {
    
 
;
  }
  private void _seizeRobot_onExit_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, ItemBatch agent ) {
    
 
;
  }
  private void _seizeRobot_onRemove_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, ItemBatch agent ) {
    
 
;
  }
  private void _seizeRobot_onTaskTerminated_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, ItemBatch agent, Agent unit ) {
    
 
;
  }
  private void _seizeRobot_onTaskSuspended_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, ItemBatch agent, Agent unit ) {
    
 
;
  }
  private void _seizeRobot_onTaskResumed_xjal( final com.anylogic.libraries.processmodeling.Seize<ItemBatch> self, ItemBatch agent, Agent unit ) {
    
 
;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool _releaseRobot_resourcePool_xjal( final com.anylogic.libraries.processmodeling.Release<ItemBatch> self, ItemBatch agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool _value;
    _value = 
 
;
    return _value;
  }
  private int _releaseRobot_quantity_xjal( final com.anylogic.libraries.processmodeling.Release<ItemBatch> self, ItemBatch agent ) {
    int _value;
    _value = 
1 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool[] _releaseRobot_resources_xjal( final com.anylogic.libraries.processmodeling.Release<ItemBatch> self, ItemBatch agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool[] _value;
    _value = 
{} 
;
    return _value;
  }
  private boolean _releaseRobot_movingGoHome_xjal( final com.anylogic.libraries.processmodeling.Release<ItemBatch> self, ItemBatch agent, Agent unit ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.WrapUpPolicy _releaseRobot_wrapUpTaskPolicyType_xjal( final com.anylogic.libraries.processmodeling.Release<ItemBatch> self, ItemBatch agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.WrapUpPolicy _value;
    _value = 
self.WRAP_UP_ALWAYS 
;
    return _value;
  }
  private double _releaseRobot_wrapUpTaskPriority_xjal( final com.anylogic.libraries.processmodeling.Release<ItemBatch> self, ItemBatch agent, Agent unit ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _releaseRobot_wrapUpTaskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.Release<ItemBatch> self, ItemBatch agent, Agent unit ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _releaseRobot_wrapUpTaskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.Release<ItemBatch> self, ItemBatch agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _value;
    _value = 
self.PP_NO_PREEMPTION 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceUsageState _releaseRobot_wrapUpUsageState_xjal( final com.anylogic.libraries.processmodeling.Release<ItemBatch> self, ItemBatch agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourceUsageState _value;
    _value = 
self.USAGE_BUSY 
;
    return _value;
  }
  private void _releaseRobot_onEnter_xjal( final com.anylogic.libraries.processmodeling.Release<ItemBatch> self, ItemBatch agent ) {
    
 
;
  }
  private void _releaseRobot_onReleaseUnit_xjal( final com.anylogic.libraries.processmodeling.Release<ItemBatch> self, ItemBatch agent, Agent unit ) {
    
 
;
  }
  private void _releaseRobot_onExit_xjal( final com.anylogic.libraries.processmodeling.Release<ItemBatch> self, ItemBatch agent ) {
    
 
;
  }
  private void _releaseRobot_onWrapUpTerminated_xjal( final com.anylogic.libraries.processmodeling.Release<ItemBatch> self, Agent unit, ItemBatch agent ) {
    
 
;
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
      case _roundRectangle:
        if (true) {
          ShapeRoundedRectangle self = this.roundRectangle;
          
 
        }
        break;
      case _line:
        if (true) {
          ShapeLine self = this.line;
          
 
        }
        break;
      case _oval:
        if (true) {
          ShapeOval self = this.oval;
          
 
        }
        break;
      case _oval1:
        if (true) {
          ShapeOval self = this.oval1;
          
 
        }
        break;
      case _rectangle:
        if (true) {
          ShapeRectangle self = this.rectangle;
          
 
        }
        break;
      case _rectangle1:
        if (true) {
          ShapeRectangle self = this.rectangle1;
          
 
        }
        break;
      case _polyline:
        if (true) {
          ShapePolyLine self = this.polyline;
          
 
        }
        break;
      case _rectangle2:
        if (true) {
          ShapeRectangle self = this.rectangle2;
          
 
        }
        break;
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
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void onShapeGroupDraw( int _shape, int index ) {
    switch( _shape ) {
      case _conveyorDropOffImg:
          
 
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
  private void _line_SetDynamicParams_xjal( ShapeLine shape ) {
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
    shape.setDx(
 
);
    shape.setDy(
 
);
    shape.setDz(
 
);
    shape.setZHeight(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setScaleZ(
 
);
    shape.setRotation(
 
);
    shape.setColor(
 
);
    shape.setLineWidth(
 
);
    shape.setLineStyle(
 
);
 	}
  }
  
  protected ShapeLine line;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _oval_SetDynamicParams_xjal( ShapeOval shape ) {
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
    shape.setRotation(
 
);
    shape.setLineColor(
 
);
    shape.setFillColor(
 
);
    shape.setRadius(
 
);
    shape.setZHeight(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setScaleZ(
 
);
    shape.setLineWidth(
 
);
    shape.setLineStyle(
 
);
 	}
  }
  
  protected ShapeOval oval;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _oval1_SetDynamicParams_xjal( ShapeOval shape ) {
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
    shape.setRotation(
 
);
    shape.setLineColor(
 
);
    shape.setFillColor(
 
);
    shape.setRadius(
 
);
    shape.setZHeight(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setScaleZ(
 
);
    shape.setLineWidth(
 
);
    shape.setLineStyle(
 
);
 	}
  }
  
  protected ShapeOval oval1;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _rectangle_SetDynamicParams_xjal( ShapeRectangle shape ) {
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
    shape.setWidth(
 
);
    shape.setHeight(
 
);
    shape.setZHeight(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setScaleZ(
 
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
  
  protected ShapeRectangle rectangle;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _rectangle1_SetDynamicParams_xjal( ShapeRectangle shape ) {
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
    shape.setWidth(
 
);
    shape.setHeight(
 
);
    shape.setZHeight(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setScaleZ(
 
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
  
  protected ShapeRectangle rectangle1;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _polyline_SetDynamicParams_xjal( ShapePolyLine shape ) {
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
    shape.setZHeight(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setScaleZ(
 
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
    shape.setNPoints(
 
);
    for (int indexPt = 0; indexPt < shape.getNPoints(); indexPt++) {
      shape.setPointDx( indexPt, 
 
);
     }
    for (int indexPt = 0; indexPt < shape.getNPoints(); indexPt++) {
      shape.setPointDy( indexPt, 
 
);
    }
    for (int indexPt = 0; indexPt < shape.getNPoints(); indexPt++) {
      shape.setPointDz( indexPt, 
 
);
    }
 	}
  }
  
  protected ShapePolyLine polyline;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _rectangle2_SetDynamicParams_xjal( ShapeRectangle shape ) {
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
    shape.setWidth(
 
);
    shape.setHeight(
 
);
    shape.setZHeight(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setScaleZ(
 
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
  
  protected ShapeRectangle rectangle2;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _conveyorDropOffImg_SetDynamicParams_xjal( ShapeGroup shape ) {
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
		2.0, LINE_STYLE_SOLID	 ) {
      @Override
      public void updateDynamicProperties() {
        _roundRectangle_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    line = new ShapeLine(
		SHAPE_DRAW_2D, true, -6.623, 6.515, 0.0, black, 
 		26.0,	0.0, 0.0, 2.0, 10.0, LINE_STYLE_SOLID ) {
      @Override
      public void updateDynamicProperties() {
        _line_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    oval = new ShapeOval(
       SHAPE_DRAW_2D, true,-3.974, 8.47, 0.0, 0.0, 
       black, black,
	   1.3245, 1.3245, 10.0, 1.0, LINE_STYLE_SOLID ) {
      @Override
      public void updateDynamicProperties() {
        _oval_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    oval1 = new ShapeOval(
       SHAPE_DRAW_2D, true,17.221, 8.47, 0.0, 0.0, 
       black, black,
	   1.3245, 1.3245, 10.0, 1.0, LINE_STYLE_SOLID ) {
      @Override
      public void updateDynamicProperties() {
        _oval1_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    rectangle = new ShapeRectangle(
       SHAPE_DRAW_2D, true,6.623, 0.0, 0.0, 0.0, 
            black, peru,
			6.623, 6.515, 10.0, 1.0, LINE_STYLE_SOLID ) {
      @Override
      public void updateDynamicProperties() {
        _rectangle_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    rectangle1 = new ShapeRectangle(
       SHAPE_DRAW_2D, true,-4.636, -10.424, 0.0, 0.0, 
            black, peru,
			6.623, 6.515, 10.0, 1.0, LINE_STYLE_SOLID ) {
      @Override
      public void updateDynamicProperties() {
        _rectangle1_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    polyline = new ShapePolyLine(
		SHAPE_DRAW_2D, true, 0.0, -6.515, 0.0, black, null,
            8, _polyline_pointsDX_xjal(), _polyline_pointsDY_xjal(), _polyline_pointsDZ_xjal(), false, 10.0, 2.0, LINE_STYLE_SOLID ) {
      @Override
      public void updateDynamicProperties() {
        _polyline_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    rectangle2 = new ShapeRectangle(
       SHAPE_DRAW_2D, true,-26.494, 13.03, 0.0, 0.0, 
            black, gray,
			13.247, 6.515, 10.0, 2.0, LINE_STYLE_SOLID ) {
      @Override
      public void updateDynamicProperties() {
        _rectangle2_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

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
      public void updateDynamicProperties() {
        _conveyorDropOffImg_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }

      @Override
      @AnyLogicInternalCodegenAPI
      public boolean onClick( double clickx, double clicky ) {
        return onShapeClick( _conveyorDropOffImg, 0, clickx, clicky );
      }

      @Override
      @AnyLogicInternalCodegenAPI
      public void onDraw() {
        onShapeGroupDraw( _conveyorDropOffImg, 0 );
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

  @AnyLogicInternalCodegenAPI
  public boolean executeOnSendActionOf( Port<?, ?> _p, Object _msg ) {
    if( _p == this.port ) {
      Port< Object, Object > self = this.port;
      Object msg = (Object) _msg;

 
    }
    if( _p == this.portPallet ) {
      Port< Object, Object > self = this.portPallet;
      Object msg = (Object) _msg;

 
    }
    if( _p == this.portItem ) {
      Port< Object, Object > self = this.portItem;
      Object msg = (Object) _msg;

 
    }
    return super.executeOnSendActionOf( _p, _msg );
  }

  @AnyLogicInternalCodegenAPI
  public boolean executeOnReceiveActionOf( Port<?, ?> _p, Object _msg ) {
    if( _p == this.port ) {
      Port< Object, Object > self = this.port;
      Object msg = (Object) _msg;
      
 
    }
    if( _p == this.portPallet ) {
      Port< Object, Object > self = this.portPallet;
      Object msg = (Object) _msg;
      
 
    }
    if( _p == this.portItem ) {
      Port< Object, Object > self = this.portItem;
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
    setupPlainVariables_DropOffStation_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_DropOffStation_xjal() {
    palletColor = 
 
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
    // On destroy code
    
 
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

  // Additional class code

 
  // End of additional class code


}
