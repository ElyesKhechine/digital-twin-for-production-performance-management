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

 

public class PalletSource extends Agent
{
  // Parameters

 
  public 
ItemType  itemsType;

  /**
   * Returns default value for parameter <code>itemsType</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public ItemType _itemsType_DefaultValue_xjal() {
    final PalletSource self = this;
    return 
 
;
  }

  public void set_itemsType( ItemType value ) {
    if (value == this.itemsType) {
      return;
    }
    ItemType _oldValue_xjal = this.itemsType;
    this.itemsType = value;
    onChange_itemsType_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter itemsType.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_itemsType()</code> method instead.
   */
  protected void onChange_itemsType() {
    onChange_itemsType_xjal( itemsType );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_itemsType_xjal( ItemType oldValue ) {

 
;  
  }


 
  public 
int  holdingCapacity;

  /**
   * Returns default value for parameter <code>holdingCapacity</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _holdingCapacity_DefaultValue_xjal() {
    final PalletSource self = this;
    return 
100 
;
  }

  public void set_holdingCapacity( int value ) {
    if (value == this.holdingCapacity) {
      return;
    }
    int _oldValue_xjal = this.holdingCapacity;
    this.holdingCapacity = value;
    onChange_holdingCapacity_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter holdingCapacity.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_holdingCapacity()</code> method instead.
   */
  protected void onChange_holdingCapacity() {
    onChange_holdingCapacity_xjal( holdingCapacity );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_holdingCapacity_xjal( int oldValue ) {

 
;  
  }


 
  public 
RectangularNode<?>  dock;

  /**
   * Returns default value for parameter <code>dock</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public RectangularNode<?> _dock_DefaultValue_xjal() {
    final PalletSource self = this;
    return 
 
;
  }

  public void set_dock( RectangularNode<?> value ) {
    if (value == this.dock) {
      return;
    }
    RectangularNode<?> _oldValue_xjal = this.dock;
    this.dock = value;
    onChange_dock_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter dock.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_dock()</code> method instead.
   */
  protected void onChange_dock() {
    onChange_dock_xjal( dock );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_dock_xjal( RectangularNode<?> oldValue ) {

 
;  
  }


 
  public 
TransporterFleet  forkliftFleet;

  /**
   * Returns default value for parameter <code>forkliftFleet</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public TransporterFleet _forkliftFleet_DefaultValue_xjal() {
    final PalletSource self = this;
    return 
 
;
  }

  public void set_forkliftFleet( TransporterFleet value ) {
    if (value == this.forkliftFleet) {
      return;
    }
    TransporterFleet _oldValue_xjal = this.forkliftFleet;
    this.forkliftFleet = value;
    onChange_forkliftFleet_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter forkliftFleet.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_forkliftFleet()</code> method instead.
   */
  protected void onChange_forkliftFleet() {
    onChange_forkliftFleet_xjal( forkliftFleet );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_forkliftFleet_xjal( TransporterFleet oldValue ) {

 
;  
  }


 
  public 
ConveyorPath  conveyor;

  /**
   * Returns default value for parameter <code>conveyor</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public ConveyorPath _conveyor_DefaultValue_xjal() {
    final PalletSource self = this;
    return 
 
;
  }

  public void set_conveyor( ConveyorPath value ) {
    if (value == this.conveyor) {
      return;
    }
    ConveyorPath _oldValue_xjal = this.conveyor;
    this.conveyor = value;
    onChange_conveyor_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter conveyor.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_conveyor()</code> method instead.
   */
  protected void onChange_conveyor() {
    onChange_conveyor_xjal( conveyor );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_conveyor_xjal( ConveyorPath oldValue ) {

 
;  
  }


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    itemsType = _itemsType_DefaultValue_xjal();
    holdingCapacity = _holdingCapacity_DefaultValue_xjal();
    dock = _dock_DefaultValue_xjal();
    forkliftFleet = _forkliftFleet_DefaultValue_xjal();
    conveyor = _conveyor_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "itemsType":
      if ( _callOnChange_xjal ) {
        set_itemsType( (ItemType) _value_xjal );
      } else {
        itemsType = (ItemType) _value_xjal;
      }
      return true;
    case "holdingCapacity":
      if ( _callOnChange_xjal ) {
        set_holdingCapacity( ((Number) _value_xjal).intValue() );
      } else {
        holdingCapacity = ((Number) _value_xjal).intValue();
      }
      return true;
    case "dock":
      if ( _callOnChange_xjal ) {
        set_dock( (RectangularNode<?>) _value_xjal );
      } else {
        dock = (RectangularNode<?>) _value_xjal;
      }
      return true;
    case "forkliftFleet":
      if ( _callOnChange_xjal ) {
        set_forkliftFleet( (TransporterFleet) _value_xjal );
      } else {
        forkliftFleet = (TransporterFleet) _value_xjal;
      }
      return true;
    case "conveyor":
      if ( _callOnChange_xjal ) {
        set_conveyor( (ConveyorPath) _value_xjal );
      } else {
        conveyor = (ConveyorPath) _value_xjal;
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
    case "itemsType": _result_xjal = itemsType; break;
    case "holdingCapacity": _result_xjal = holdingCapacity; break;
    case "dock": _result_xjal = dock; break;
    case "forkliftFleet": _result_xjal = forkliftFleet; break;
    case "conveyor": _result_xjal = conveyor; break;
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
      list.add( "itemsType" );
      list.add( "holdingCapacity" );
      list.add( "dock" );
      list.add( "forkliftFleet" );
      list.add( "conveyor" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
  }
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( PalletSource.class );
  
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


  // Events

  public EventTimeout addItems = new EventTimeout(this);

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( EventTimeout _e ) {
     if( _e == addItems ) return "addItems";
    return super.getNameOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public EventTimeout.Mode getModeOf( EventTimeout _e ) {
    if ( _e == addItems ) return EVENT_TIMEOUT_MODE_USER;
    return super.getModeOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public double getFirstOccurrenceTime( EventTimeout _e ) {
    double _t;
    if ( _e == addItems ) {
      _t = 
0 
;
      _t = toModelTime( _t, SECOND );
      return _t;
    }
    return super.getFirstOccurrenceTime( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public double evaluateTimeoutOf( EventTimeout _e ) {
    double _t;
    if( _e == addItems) {
      _t = 
0 
;
      _t = toModelTime( _t, SECOND );
      return _t;
    }
    return super.evaluateTimeoutOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( EventTimeout _e ) {
    if ( _e == addItems ) {
      EventTimeout self = _e;

sourceItems.inject( holdingCapacity ); 
;
      return;
    }
    super.executeActionOf( _e );
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

 
  public com.anylogic.libraries.processmodeling.Source<
Pallet 
> sourcePallet;
 
  public com.anylogic.libraries.processmodeling.Source<
Item 
> sourceItems;
 
  public com.anylogic.libraries.processmodeling.Queue<
Item 
> queue;
 
  public com.anylogic.libraries.processmodeling.Pickup<
Pallet 
, 
Item 
> pickup;
 
  public com.anylogic.libraries.material_handling.MoveByTransporter<
Pallet 
> toConveyor;

  public String getNameOf( Agent ao ) {
    if ( ao == sourcePallet ) return "sourcePallet";
    if ( ao == sourceItems ) return "sourceItems";
    if ( ao == queue ) return "queue";
    if ( ao == pickup ) return "pickup";
    if ( ao == toConveyor ) return "toConveyor";
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
  protected com.anylogic.libraries.processmodeling.Source<Pallet> instantiate_sourcePallet_xjal() {
    com.anylogic.libraries.processmodeling.Source<Pallet> _result_xjal = new com.anylogic.libraries.processmodeling.Source<Pallet>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public double interarrivalTime(  ) {
        return _sourcePallet_interarrivalTime_xjal( this );
      }
      @Override
      public double rateExpression( double baseRate ) {
        return _sourcePallet_rateExpression_xjal( this, baseRate );
      }
      @Override
      public Date arrivalDate(  ) {
        return _sourcePallet_arrivalDate_xjal( this );
      }
      @Override
      public int entitiesPerArrival(  ) {
        return _sourcePallet_entitiesPerArrival_xjal( this );
      }
      @Override
      public double locationX( Pallet agent ) {
        return _sourcePallet_locationX_xjal( this, agent );
      }
      @Override
      public double locationY( Pallet agent ) {
        return _sourcePallet_locationY_xjal( this, agent );
      }
      @Override
      public double locationZ( Pallet agent ) {
        return _sourcePallet_locationZ_xjal( this, agent );
      }
      @Override
      public double locationLatitude( Pallet agent ) {
        return _sourcePallet_locationLatitude_xjal( this, agent );
      }
      @Override
      public double locationLongitude( Pallet agent ) {
        return _sourcePallet_locationLongitude_xjal( this, agent );
      }
      @Override
      public String locationGeoPlaceName( Pallet agent ) {
        return _sourcePallet_locationGeoPlaceName_xjal( this, agent );
      }
      @Override
      public INetwork locationNetwork( Pallet agent ) {
        return _sourcePallet_locationNetwork_xjal( this, agent );
      }
      @Override
      public Level locationLevel( Pallet agent ) {
        return _sourcePallet_locationLevel_xjal( this, agent );
      }
      @Override
      public INode locationNode( Pallet agent ) {
        return _sourcePallet_locationNode_xjal( this, agent );
      }
      @Override
      public Attractor locationAttractor( Pallet agent ) {
        return _sourcePallet_locationAttractor_xjal( this, agent );
      }
      @Override
      public double speed( Pallet agent ) {
        return _sourcePallet_speed_xjal( this, agent );
      }
      @Override
      public Agent newEntity(  ) {
        return _sourcePallet_newEntity_xjal( this );
      }
      @Override
      public boolean changeDimensions( Pallet agent ) {
        return _sourcePallet_changeDimensions_xjal( this, agent );
      }
      @Override
      public double length( Pallet agent ) {
        return _sourcePallet_length_xjal( this, agent );
      }
      @Override
      public double width( Pallet agent ) {
        return _sourcePallet_width_xjal( this, agent );
      }
      @Override
      public double height( Pallet agent ) {
        return _sourcePallet_height_xjal( this, agent );
      }
      @Override
      public AgentList population( Pallet agent ) {
        return _sourcePallet_population_xjal( this, agent );
      }
      @Override
      public void onBeforeArrival(  ) {
        _sourcePallet_onBeforeArrival_xjal( this );
      }
      @Override
      public void onAtExit( Pallet agent ) {
        _sourcePallet_onAtExit_xjal( this, agent );
      }
      @Override
      public void onExit( Pallet agent ) {
        _sourcePallet_onExit_xjal( this, agent );
      }
      @Override
      public void onDiscard( Pallet agent ) {
        _sourcePallet_onDiscard_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_sourcePallet_xjal( final com.anylogic.libraries.processmodeling.Source<Pallet> self, TableInput _t ) {
    self.arrivalType = 
self.MANUAL 
;
    self.rate = 
1 
;
    self.firstArrivalMode = 
self.AFTER_TIMEOUT 
;
    self.firstArrivalTime = 
 
;
    self.rateSchedule = 
 
;
    self.modifyRate = 
false 
;
    self.arrivalSchedule = 
 
;
    self.setAgentParametersFromDB = 
false 
;
    self.databaseTable = 
 
;
    self.multipleEntitiesPerArrival = 
true 
;
    self.limitArrivals = 
true 
;
    self.maxArrivals = 
1 
;
    self.locationType = 
self.LOCATION_NODE 
;
    self.locationXYZInNetwork = 
false 
;
    self.enableCustomStartTime = 
false 
;
    self.startTime = 
 
;
    self.addToCustomPopulation = 
false 
;
    self.pushProtocol = 
true 
;
    self.discardHangingEntities = 
true 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_sourcePallet_xjal( com.anylogic.libraries.processmodeling.Source<Pallet> self, TableInput _t ) {
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
  protected com.anylogic.libraries.processmodeling.Source<Item> instantiate_sourceItems_xjal() {
    com.anylogic.libraries.processmodeling.Source<Item> _result_xjal = new com.anylogic.libraries.processmodeling.Source<Item>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code

      @AnyLogicInternalCodegenAPI
      public RateUnits getUnitsForCodeOf_rate() {
        return PER_SECOND;
      }
      @Override
      public double interarrivalTime(  ) {
        return _sourceItems_interarrivalTime_xjal( this );
      }
      @Override
      public double rateExpression( double baseRate ) {
        return _sourceItems_rateExpression_xjal( this, baseRate );
      }
      @Override
      public Date arrivalDate(  ) {
        return _sourceItems_arrivalDate_xjal( this );
      }
      @Override
      public int entitiesPerArrival(  ) {
        return _sourceItems_entitiesPerArrival_xjal( this );
      }
      @Override
      public double locationX( Item agent ) {
        return _sourceItems_locationX_xjal( this, agent );
      }
      @Override
      public double locationY( Item agent ) {
        return _sourceItems_locationY_xjal( this, agent );
      }
      @Override
      public double locationZ( Item agent ) {
        return _sourceItems_locationZ_xjal( this, agent );
      }
      @Override
      public double locationLatitude( Item agent ) {
        return _sourceItems_locationLatitude_xjal( this, agent );
      }
      @Override
      public double locationLongitude( Item agent ) {
        return _sourceItems_locationLongitude_xjal( this, agent );
      }
      @Override
      public String locationGeoPlaceName( Item agent ) {
        return _sourceItems_locationGeoPlaceName_xjal( this, agent );
      }
      @Override
      public INetwork locationNetwork( Item agent ) {
        return _sourceItems_locationNetwork_xjal( this, agent );
      }
      @Override
      public Level locationLevel( Item agent ) {
        return _sourceItems_locationLevel_xjal( this, agent );
      }
      @Override
      public INode locationNode( Item agent ) {
        return _sourceItems_locationNode_xjal( this, agent );
      }
      @Override
      public Attractor locationAttractor( Item agent ) {
        return _sourceItems_locationAttractor_xjal( this, agent );
      }
      @Override
      public double speed( Item agent ) {
        return _sourceItems_speed_xjal( this, agent );
      }
      @Override
      public Agent newEntity(  ) {
        return _sourceItems_newEntity_xjal( this );
      }
      @Override
      public boolean changeDimensions( Item agent ) {
        return _sourceItems_changeDimensions_xjal( this, agent );
      }
      @Override
      public double length( Item agent ) {
        return _sourceItems_length_xjal( this, agent );
      }
      @Override
      public double width( Item agent ) {
        return _sourceItems_width_xjal( this, agent );
      }
      @Override
      public double height( Item agent ) {
        return _sourceItems_height_xjal( this, agent );
      }
      @Override
      public AgentList population( Item agent ) {
        return _sourceItems_population_xjal( this, agent );
      }
      @Override
      public void onBeforeArrival(  ) {
        _sourceItems_onBeforeArrival_xjal( this );
      }
      @Override
      public void onAtExit( Item agent ) {
        _sourceItems_onAtExit_xjal( this, agent );
      }
      @Override
      public void onExit( Item agent ) {
        _sourceItems_onExit_xjal( this, agent );
      }
      @Override
      public void onDiscard( Item agent ) {
        _sourceItems_onDiscard_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_sourceItems_xjal( final com.anylogic.libraries.processmodeling.Source<Item> self, TableInput _t ) {
    self.arrivalType = 
self.MANUAL 
;
    self.rate = 
1 
;
    self.firstArrivalMode = 
self.AFTER_TIMEOUT 
;
    self.firstArrivalTime = 
 
;
    self.rateSchedule = 
 
;
    self.modifyRate = 
false 
;
    self.arrivalSchedule = 
 
;
    self.setAgentParametersFromDB = 
false 
;
    self.databaseTable = 
 
;
    self.multipleEntitiesPerArrival = 
true 
;
    self.limitArrivals = 
true 
;
    self.maxArrivals = 
1 
;
    self.locationType = 
self.LOCATION_NOT_SPECIFIED 
;
    self.locationXYZInNetwork = 
false 
;
    self.enableCustomStartTime = 
false 
;
    self.startTime = 
 
;
    self.addToCustomPopulation = 
true 
;
    self.pushProtocol = 
true 
;
    self.discardHangingEntities = 
true 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_sourceItems_xjal( com.anylogic.libraries.processmodeling.Source<Item> self, TableInput _t ) {
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
  protected com.anylogic.libraries.processmodeling.Pickup<Pallet, Item> instantiate_pickup_xjal() {
    com.anylogic.libraries.processmodeling.Pickup<Pallet, Item> _result_xjal = new com.anylogic.libraries.processmodeling.Pickup<Pallet, Item>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public boolean condition( Pallet container, Item agent ) {
        return _pickup_condition_xjal( this, container, agent );
      }
      @Override
      public int quantity( Pallet container ) {
        return _pickup_quantity_xjal( this, container );
      }
      @Override
      public com.anylogic.libraries.processmodeling.Queue queue( Pallet container ) {
        return _pickup_queue_xjal( this, container );
      }
      @Override
      public void onEnter( Pallet container ) {
        _pickup_onEnter_xjal( this, container );
      }
      @Override
      public void onPickup( Pallet container, Item agent ) {
        _pickup_onPickup_xjal( this, container, agent );
      }
      @Override
      public void onExit( Pallet container ) {
        _pickup_onExit_xjal( this, container );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_pickup_xjal( final com.anylogic.libraries.processmodeling.Pickup<Pallet, Item> self, TableInput _t ) {
    self.pickupType = 
self.QUANTITY 
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
  private void doBeforeCreate_pickup_xjal( com.anylogic.libraries.processmodeling.Pickup<Pallet, Item> self, TableInput _t ) {
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
  protected com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> instantiate_toConveyor_xjal() {
    com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> _result_xjal = new com.anylogic.libraries.material_handling.MoveByTransporter<Pallet>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public Path destinationPath( Pallet agent, Agent unit ) {
        return _toConveyor_destinationPath_xjal( this, agent, unit );
      }
      @Override
      public boolean destinationPathOffsetFromBeginning( Pallet agent, Agent unit ) {
        return _toConveyor_destinationPathOffsetFromBeginning_xjal( this, agent, unit );
      }
      @Override
      public double destinationPathOffset( Pallet agent, Agent unit ) {
        return _toConveyor_destinationPathOffset_xjal( this, agent, unit );
      }
      @Override
      public Attractor destinationAttractor( Pallet agent, Agent unit ) {
        return _toConveyor_destinationAttractor_xjal( this, agent, unit );
      }
      @Override
      public Node destinationNode( Pallet agent, Agent unit ) {
        return _toConveyor_destinationNode_xjal( this, agent, unit );
      }
      @Override
      public ConveyorPath destinationConveyor( Pallet agent, Agent unit ) {
        return _toConveyor_destinationConveyor_xjal( this, agent, unit );
      }
      @Override
      public boolean destinationConveyorOffsetFromBeginning( Pallet agent, Agent unit ) {
        return _toConveyor_destinationConveyorOffsetFromBeginning_xjal( this, agent, unit );
      }
      @Override
      public double destinationConveyorOffset( Pallet agent, Agent unit ) {
        return _toConveyor_destinationConveyorOffset_xjal( this, agent, unit );
      }
      @Override
      public PositionOnConveyor destinationPositionOnConveyor( Pallet agent, Agent unit ) {
        return _toConveyor_destinationPositionOnConveyor_xjal( this, agent, unit );
      }
      @Override
      public ConveyorStation destinationConveyorStation( Pallet agent, Agent unit ) {
        return _toConveyor_destinationConveyorStation_xjal( this, agent, unit );
      }
      @Override
      public boolean changeOrientation( Pallet agent ) {
        return _toConveyor_changeOrientation_xjal( this, agent );
      }
      @Override
      public AgentOrientation orientation( Pallet agent ) {
        return _toConveyor_orientation_xjal( this, agent );
      }
      @Override
      public double destinationX( Pallet agent, Agent unit ) {
        return _toConveyor_destinationX_xjal( this, agent, unit );
      }
      @Override
      public double destinationY( Pallet agent, Agent unit ) {
        return _toConveyor_destinationY_xjal( this, agent, unit );
      }
      @Override
      public double destinationZ( Pallet agent, Agent unit ) {
        return _toConveyor_destinationZ_xjal( this, agent, unit );
      }
      @Override
      public boolean destinationInNetwork( Pallet agent, Agent unit ) {
        return _toConveyor_destinationInNetwork_xjal( this, agent, unit );
      }
      @Override
      public INetwork destinationNetwork( Pallet agent, Agent unit ) {
        return _toConveyor_destinationNetwork_xjal( this, agent, unit );
      }
      @Override
      public Level destinationLevel( Pallet agent, Agent unit ) {
        return _toConveyor_destinationLevel_xjal( this, agent, unit );
      }
      @Override
      public com.anylogic.libraries.material_handling.TransporterFleet fleet( Pallet agent ) {
        return _toConveyor_fleet_xjal( this, agent );
      }
      @Override
      public double loadingTime( Pallet agent ) {
        return _toConveyor_loadingTime_xjal( this, agent );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_loadingTime() {
        return SECOND;
      }
      @Override
      public Path seizeDestinationPath( Pallet agent, Agent unit ) {
        return _toConveyor_seizeDestinationPath_xjal( this, agent, unit );
      }
      @Override
      public boolean seizeDestinationPathOffsetFromBeginning( Pallet agent, Agent unit ) {
        return _toConveyor_seizeDestinationPathOffsetFromBeginning_xjal( this, agent, unit );
      }
      @Override
      public double seizeDestinationPathOffset( Pallet agent, Agent unit ) {
        return _toConveyor_seizeDestinationPathOffset_xjal( this, agent, unit );
      }
      @Override
      public Attractor seizeDestinationAttractor( Pallet agent, Agent unit ) {
        return _toConveyor_seizeDestinationAttractor_xjal( this, agent, unit );
      }
      @Override
      public Node seizeDestinationNode( Pallet agent, Agent unit ) {
        return _toConveyor_seizeDestinationNode_xjal( this, agent, unit );
      }
      @Override
      public ConveyorPath seizeDestinationConveyor( Pallet agent, Agent unit ) {
        return _toConveyor_seizeDestinationConveyor_xjal( this, agent, unit );
      }
      @Override
      public boolean seizeDestinationConveyorOffsetFromBeginning( Pallet agent, Agent unit ) {
        return _toConveyor_seizeDestinationConveyorOffsetFromBeginning_xjal( this, agent, unit );
      }
      @Override
      public double seizeDestinationConveyorOffset( Pallet agent, Agent unit ) {
        return _toConveyor_seizeDestinationConveyorOffset_xjal( this, agent, unit );
      }
      @Override
      public PositionOnConveyor seizeDestinationPositionOnConveyor( Pallet agent, Agent unit ) {
        return _toConveyor_seizeDestinationPositionOnConveyor_xjal( this, agent, unit );
      }
      @Override
      public ConveyorStation seizeDestinationConveyorStation( Pallet agent, Agent unit ) {
        return _toConveyor_seizeDestinationConveyorStation_xjal( this, agent, unit );
      }
      @Override
      public double seizeDestinationX( Pallet agent, Agent unit ) {
        return _toConveyor_seizeDestinationX_xjal( this, agent, unit );
      }
      @Override
      public double seizeDestinationY( Pallet agent, Agent unit ) {
        return _toConveyor_seizeDestinationY_xjal( this, agent, unit );
      }
      @Override
      public double seizeDestinationZ( Pallet agent, Agent unit ) {
        return _toConveyor_seizeDestinationZ_xjal( this, agent, unit );
      }
      @Override
      public boolean seizeDestinationInNetwork( Pallet agent, Agent unit ) {
        return _toConveyor_seizeDestinationInNetwork_xjal( this, agent, unit );
      }
      @Override
      public INetwork seizeDestinationNetwork( Pallet agent, Agent unit ) {
        return _toConveyor_seizeDestinationNetwork_xjal( this, agent, unit );
      }
      @Override
      public Level seizeDestinationLevel( Pallet agent, Agent unit ) {
        return _toConveyor_seizeDestinationLevel_xjal( this, agent, unit );
      }
      @Override
      public double priority( Pallet agent ) {
        return _toConveyor_priority_xjal( this, agent );
      }
      @Override
      public boolean taskMayPreemptOtherTasks( Pallet agent ) {
        return _toConveyor_taskMayPreemptOtherTasks_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.material_handling.SeizeTransporter.TransporterTaskPreemptionPolicy taskPreemptionPolicy( Pallet agent ) {
        return _toConveyor_taskPreemptionPolicy_xjal( this, agent );
      }
      @Override
      public boolean transporterChoiceCondition( Pallet agent, Agent unit, TransporterFleet<?> fleet ) {
        return _toConveyor_transporterChoiceCondition_xjal( this, agent, unit, fleet );
      }
      @Override
      public boolean transporterComparison( Agent unit1, Agent unit2, Pallet agent ) {
        return _toConveyor_transporterComparison_xjal( this, unit1, unit2, agent );
      }
      @Override
      public double transporterRating( Agent unit, Pallet agent ) {
        return _toConveyor_transporterRating_xjal( this, unit, agent );
      }
      @Override
      public com.anylogic.libraries.material_handling.ReleaseTransporter.TransporterReleaseMovingPolicy canceledMovingPolicy( Agent unit ) {
        return _toConveyor_canceledMovingPolicy_xjal( this, unit );
      }
      @Override
      public Path canceledDestinationPath( Agent unit ) {
        return _toConveyor_canceledDestinationPath_xjal( this, unit );
      }
      @Override
      public boolean canceledDestinationPathOffsetFromBeginning( Agent unit ) {
        return _toConveyor_canceledDestinationPathOffsetFromBeginning_xjal( this, unit );
      }
      @Override
      public double canceledDestinationPathOffset( Agent unit ) {
        return _toConveyor_canceledDestinationPathOffset_xjal( this, unit );
      }
      @Override
      public Attractor canceledDestinationAttractor( Agent unit ) {
        return _toConveyor_canceledDestinationAttractor_xjal( this, unit );
      }
      @Override
      public Node canceledDestinationNode( Agent unit ) {
        return _toConveyor_canceledDestinationNode_xjal( this, unit );
      }
      @Override
      public ConveyorPath canceledDestinationConveyor( Agent unit ) {
        return _toConveyor_canceledDestinationConveyor_xjal( this, unit );
      }
      @Override
      public boolean canceledDestinationConveyorOffsetFromBeginning( Agent unit ) {
        return _toConveyor_canceledDestinationConveyorOffsetFromBeginning_xjal( this, unit );
      }
      @Override
      public double canceledDestinationConveyorOffset( Agent unit ) {
        return _toConveyor_canceledDestinationConveyorOffset_xjal( this, unit );
      }
      @Override
      public PositionOnConveyor canceledDestinationPositionOnConveyor( Agent unit ) {
        return _toConveyor_canceledDestinationPositionOnConveyor_xjal( this, unit );
      }
      @Override
      public ConveyorStation canceledDestinationConveyorStation( Agent unit ) {
        return _toConveyor_canceledDestinationConveyorStation_xjal( this, unit );
      }
      @Override
      public double canceledDestinationX( Agent unit ) {
        return _toConveyor_canceledDestinationX_xjal( this, unit );
      }
      @Override
      public double canceledDestinationY( Agent unit ) {
        return _toConveyor_canceledDestinationY_xjal( this, unit );
      }
      @Override
      public double canceledDestinationZ( Agent unit ) {
        return _toConveyor_canceledDestinationZ_xjal( this, unit );
      }
      @Override
      public boolean canceledDestinationInNetwork( Agent unit ) {
        return _toConveyor_canceledDestinationInNetwork_xjal( this, unit );
      }
      @Override
      public INetwork canceledDestinationNetwork( Agent unit ) {
        return _toConveyor_canceledDestinationNetwork_xjal( this, unit );
      }
      @Override
      public Level canceledDestinationLevel( Agent unit ) {
        return _toConveyor_canceledDestinationLevel_xjal( this, unit );
      }
      @Override
      public double unloadingTime( Pallet agent ) {
        return _toConveyor_unloadingTime_xjal( this, agent );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_unloadingTime() {
        return SECOND;
      }
      @Override
      public com.anylogic.libraries.material_handling.ReleaseTransporter.TransporterReleaseMovingPolicy releaseMovingPolicy( Agent unit ) {
        return _toConveyor_releaseMovingPolicy_xjal( this, unit );
      }
      @Override
      public Path releaseDestinationPath( Agent unit ) {
        return _toConveyor_releaseDestinationPath_xjal( this, unit );
      }
      @Override
      public boolean releaseDestinationPathOffsetFromBeginning( Agent unit ) {
        return _toConveyor_releaseDestinationPathOffsetFromBeginning_xjal( this, unit );
      }
      @Override
      public double releaseDestinationPathOffset( Agent unit ) {
        return _toConveyor_releaseDestinationPathOffset_xjal( this, unit );
      }
      @Override
      public Attractor releaseDestinationAttractor( Agent unit ) {
        return _toConveyor_releaseDestinationAttractor_xjal( this, unit );
      }
      @Override
      public Node releaseDestinationNode( Agent unit ) {
        return _toConveyor_releaseDestinationNode_xjal( this, unit );
      }
      @Override
      public ConveyorPath releaseDestinationConveyor( Agent unit ) {
        return _toConveyor_releaseDestinationConveyor_xjal( this, unit );
      }
      @Override
      public boolean releaseDestinationConveyorOffsetFromBeginning( Agent unit ) {
        return _toConveyor_releaseDestinationConveyorOffsetFromBeginning_xjal( this, unit );
      }
      @Override
      public double releaseDestinationConveyorOffset( Agent unit ) {
        return _toConveyor_releaseDestinationConveyorOffset_xjal( this, unit );
      }
      @Override
      public PositionOnConveyor releaseDestinationPositionOnConveyor( Agent unit ) {
        return _toConveyor_releaseDestinationPositionOnConveyor_xjal( this, unit );
      }
      @Override
      public ConveyorStation releaseDestinationConveyorStation( Agent unit ) {
        return _toConveyor_releaseDestinationConveyorStation_xjal( this, unit );
      }
      @Override
      public double releaseDestinationX( Agent unit ) {
        return _toConveyor_releaseDestinationX_xjal( this, unit );
      }
      @Override
      public double releaseDestinationY( Agent unit ) {
        return _toConveyor_releaseDestinationY_xjal( this, unit );
      }
      @Override
      public double releaseDestinationZ( Agent unit ) {
        return _toConveyor_releaseDestinationZ_xjal( this, unit );
      }
      @Override
      public boolean releaseDestinationInNetwork( Agent unit ) {
        return _toConveyor_releaseDestinationInNetwork_xjal( this, unit );
      }
      @Override
      public INetwork releaseDestinationNetwork( Agent unit ) {
        return _toConveyor_releaseDestinationNetwork_xjal( this, unit );
      }
      @Override
      public Level releaseDestinationLevel( Agent unit ) {
        return _toConveyor_releaseDestinationLevel_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.material_handling.ReleaseTransporter.TransporterReleaseReturnPolicy releaseReturnPolicy( Agent unit ) {
        return _toConveyor_releaseReturnPolicy_xjal( this, unit );
      }
      @Override
      public void onEnter( Pallet agent ) {
        _toConveyor_onEnter_xjal( this, agent );
      }
      @Override
      public void onAtExit( Pallet agent ) {
        _toConveyor_onAtExit_xjal( this, agent );
      }
      @Override
      public void onExit( Pallet agent ) {
        _toConveyor_onExit_xjal( this, agent );
      }
      @Override
      public void onRemove( Pallet agent ) {
        _toConveyor_onRemove_xjal( this, agent );
      }
      @Override
      public void onSeizeTransporter( Pallet agent, Agent unit ) {
        _toConveyor_onSeizeTransporter_xjal( this, agent, unit );
      }
      @Override
      public void onLoadingStarted( Pallet agent, Agent unit ) {
        _toConveyor_onLoadingStarted_xjal( this, agent, unit );
      }
      @Override
      public void onLoadingFinished( Pallet agent, Agent unit ) {
        _toConveyor_onLoadingFinished_xjal( this, agent, unit );
      }
      @Override
      public void onTaskSuspended( Pallet agent, Agent unit ) {
        _toConveyor_onTaskSuspended_xjal( this, agent, unit );
      }
      @Override
      public void onTaskResumed( Pallet agent, Agent unit ) {
        _toConveyor_onTaskResumed_xjal( this, agent, unit );
      }
      @Override
      public void onReleaseTransporter( Pallet agent, Agent unit ) {
        _toConveyor_onReleaseTransporter_xjal( this, agent, unit );
      }
      @Override
      public void onUnloadingStarted( Pallet agent, Agent unit ) {
        _toConveyor_onUnloadingStarted_xjal( this, agent, unit );
      }
      @Override
      public void onUnloadingFinished( Pallet agent, Agent unit ) {
        _toConveyor_onUnloadingFinished_xjal( this, agent, unit );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_toConveyor_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, TableInput _t ) {
    self.destinationType = 
self.DEST_CONVEYOR 
;
    self.seizeTransporter = 
true 
;
    self.seizeDestinationType = 
self.PICKUP_AGENT 
;
    self.customizeTransporterChoice = 
false 
;
    self.dispatchingPolicy = 
self.DISPATCHING_POLICY_NEAREST 
;
    self.canceledDestinationType = 
self.CANCELED_NODE 
;
    self.releaseTransporter = 
true 
;
    self.releaseDestinationType = 
self.RELEASE_NODE 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_toConveyor_xjal( com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, TableInput _t ) {
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

  private double _sourcePallet_interarrivalTime_xjal( final com.anylogic.libraries.processmodeling.Source<Pallet> self ) {
    double _value;
    _value = 
exponential( 1 ) 
;
    return _value;
  }
  private double _sourcePallet_rateExpression_xjal( final com.anylogic.libraries.processmodeling.Source<Pallet> self, double baseRate ) {
    double _value;
    _value = 
baseRate 
;
    return _value;
  }
  private Date _sourcePallet_arrivalDate_xjal( final com.anylogic.libraries.processmodeling.Source<Pallet> self ) {
    Date _value;
    _value = 
null 
;
    return _value;
  }
  private int _sourcePallet_entitiesPerArrival_xjal( final com.anylogic.libraries.processmodeling.Source<Pallet> self ) {
    int _value;
    _value = 
100 
;
    return _value;
  }
  private double _sourcePallet_locationX_xjal( final com.anylogic.libraries.processmodeling.Source<Pallet> self, Pallet agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _sourcePallet_locationY_xjal( final com.anylogic.libraries.processmodeling.Source<Pallet> self, Pallet agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _sourcePallet_locationZ_xjal( final com.anylogic.libraries.processmodeling.Source<Pallet> self, Pallet agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _sourcePallet_locationLatitude_xjal( final com.anylogic.libraries.processmodeling.Source<Pallet> self, Pallet agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _sourcePallet_locationLongitude_xjal( final com.anylogic.libraries.processmodeling.Source<Pallet> self, Pallet agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private String _sourcePallet_locationGeoPlaceName_xjal( final com.anylogic.libraries.processmodeling.Source<Pallet> self, Pallet agent ) {
    String _value;
    _value = 
 
;
    return _value;
  }
  private INetwork _sourcePallet_locationNetwork_xjal( final com.anylogic.libraries.processmodeling.Source<Pallet> self, Pallet agent ) {
    INetwork _value;
    _value = 
 
;
    return _value;
  }
  private Level _sourcePallet_locationLevel_xjal( final com.anylogic.libraries.processmodeling.Source<Pallet> self, Pallet agent ) {
    Level _value;
    _value = 
 
;
    return _value;
  }
  private INode _sourcePallet_locationNode_xjal( final com.anylogic.libraries.processmodeling.Source<Pallet> self, Pallet agent ) {
    INode _value;
    _value = 
dock 
;
    return _value;
  }
  private Attractor _sourcePallet_locationAttractor_xjal( final com.anylogic.libraries.processmodeling.Source<Pallet> self, Pallet agent ) {
    Attractor _value;
    _value = 
 
;
    return _value;
  }
  private double _sourcePallet_speed_xjal( final com.anylogic.libraries.processmodeling.Source<Pallet> self, Pallet agent ) {
    double _value;
    _value = 
10 
;
    return _value;
  }
  private Agent _sourcePallet_newEntity_xjal( final com.anylogic.libraries.processmodeling.Source<Pallet> self ) {
    Agent _value;
    _value = 
new Pallet( holdingCapacity, itemsType ) 
;
    return _value;
  }
  private boolean _sourcePallet_changeDimensions_xjal( final com.anylogic.libraries.processmodeling.Source<Pallet> self, Pallet agent ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _sourcePallet_length_xjal( final com.anylogic.libraries.processmodeling.Source<Pallet> self, Pallet agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private double _sourcePallet_width_xjal( final com.anylogic.libraries.processmodeling.Source<Pallet> self, Pallet agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private double _sourcePallet_height_xjal( final com.anylogic.libraries.processmodeling.Source<Pallet> self, Pallet agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private AgentList _sourcePallet_population_xjal( final com.anylogic.libraries.processmodeling.Source<Pallet> self, Pallet agent ) {
    AgentList _value;
    _value = 
 
;
    return _value;
  }
  private void _sourcePallet_onBeforeArrival_xjal( final com.anylogic.libraries.processmodeling.Source<Pallet> self ) {
    
 
;
  }
  private void _sourcePallet_onAtExit_xjal( final com.anylogic.libraries.processmodeling.Source<Pallet> self, Pallet agent ) {
    
 
;
  }
  private void _sourcePallet_onExit_xjal( final com.anylogic.libraries.processmodeling.Source<Pallet> self, Pallet agent ) {
    
 
;
  }
  private void _sourcePallet_onDiscard_xjal( final com.anylogic.libraries.processmodeling.Source<Pallet> self, Pallet agent ) {
    
 
;
  }
  private double _sourceItems_interarrivalTime_xjal( final com.anylogic.libraries.processmodeling.Source<Item> self ) {
    double _value;
    _value = 
exponential( 1 ) 
;
    return _value;
  }
  private double _sourceItems_rateExpression_xjal( final com.anylogic.libraries.processmodeling.Source<Item> self, double baseRate ) {
    double _value;
    _value = 
baseRate 
;
    return _value;
  }
  private Date _sourceItems_arrivalDate_xjal( final com.anylogic.libraries.processmodeling.Source<Item> self ) {
    Date _value;
    _value = 
null 
;
    return _value;
  }
  private int _sourceItems_entitiesPerArrival_xjal( final com.anylogic.libraries.processmodeling.Source<Item> self ) {
    int _value;
    _value = 
holdingCapacity 
;
    return _value;
  }
  private double _sourceItems_locationX_xjal( final com.anylogic.libraries.processmodeling.Source<Item> self, Item agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _sourceItems_locationY_xjal( final com.anylogic.libraries.processmodeling.Source<Item> self, Item agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _sourceItems_locationZ_xjal( final com.anylogic.libraries.processmodeling.Source<Item> self, Item agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _sourceItems_locationLatitude_xjal( final com.anylogic.libraries.processmodeling.Source<Item> self, Item agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _sourceItems_locationLongitude_xjal( final com.anylogic.libraries.processmodeling.Source<Item> self, Item agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private String _sourceItems_locationGeoPlaceName_xjal( final com.anylogic.libraries.processmodeling.Source<Item> self, Item agent ) {
    String _value;
    _value = 
 
;
    return _value;
  }
  private INetwork _sourceItems_locationNetwork_xjal( final com.anylogic.libraries.processmodeling.Source<Item> self, Item agent ) {
    INetwork _value;
    _value = 
 
;
    return _value;
  }
  private Level _sourceItems_locationLevel_xjal( final com.anylogic.libraries.processmodeling.Source<Item> self, Item agent ) {
    Level _value;
    _value = 
 
;
    return _value;
  }
  private INode _sourceItems_locationNode_xjal( final com.anylogic.libraries.processmodeling.Source<Item> self, Item agent ) {
    INode _value;
    _value = 
 
;
    return _value;
  }
  private Attractor _sourceItems_locationAttractor_xjal( final com.anylogic.libraries.processmodeling.Source<Item> self, Item agent ) {
    Attractor _value;
    _value = 
 
;
    return _value;
  }
  private double _sourceItems_speed_xjal( final com.anylogic.libraries.processmodeling.Source<Item> self, Item agent ) {
    double _value;
    _value = 
10 
;
    return _value;
  }
  private Agent _sourceItems_newEntity_xjal( final com.anylogic.libraries.processmodeling.Source<Item> self ) {
    Agent _value;
    _value = 
new Item( itemsType ) 
;
    return _value;
  }
  private boolean _sourceItems_changeDimensions_xjal( final com.anylogic.libraries.processmodeling.Source<Item> self, Item agent ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _sourceItems_length_xjal( final com.anylogic.libraries.processmodeling.Source<Item> self, Item agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private double _sourceItems_width_xjal( final com.anylogic.libraries.processmodeling.Source<Item> self, Item agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private double _sourceItems_height_xjal( final com.anylogic.libraries.processmodeling.Source<Item> self, Item agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private AgentList _sourceItems_population_xjal( final com.anylogic.libraries.processmodeling.Source<Item> self, Item agent ) {
    AgentList _value;
    _value = 
main.storedItems 
;
    return _value;
  }
  private void _sourceItems_onBeforeArrival_xjal( final com.anylogic.libraries.processmodeling.Source<Item> self ) {
    
 
;
  }
  private void _sourceItems_onAtExit_xjal( final com.anylogic.libraries.processmodeling.Source<Item> self, Item agent ) {
    
 
;
  }
  private void _sourceItems_onExit_xjal( final com.anylogic.libraries.processmodeling.Source<Item> self, Item agent ) {
    
 
;
  }
  private void _sourceItems_onDiscard_xjal( final com.anylogic.libraries.processmodeling.Source<Item> self, Item agent ) {
    
 
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
    
if (self.size() >= holdingCapacity)
	sourcePallet.inject(1); 
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
  private boolean _pickup_condition_xjal( final com.anylogic.libraries.processmodeling.Pickup<Pallet, Item> self, Pallet container, Item agent ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private int _pickup_quantity_xjal( final com.anylogic.libraries.processmodeling.Pickup<Pallet, Item> self, Pallet container ) {
    int _value;
    _value = 
holdingCapacity 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.Queue _pickup_queue_xjal( final com.anylogic.libraries.processmodeling.Pickup<Pallet, Item> self, Pallet container ) {
    com.anylogic.libraries.processmodeling.Queue _value;
    _value = 
 
;
    return _value;
  }
  private void _pickup_onEnter_xjal( final com.anylogic.libraries.processmodeling.Pickup<Pallet, Item> self, Pallet container ) {
    
 
;
  }
  private void _pickup_onPickup_xjal( final com.anylogic.libraries.processmodeling.Pickup<Pallet, Item> self, Pallet container, Item agent ) {
    
agent.pallet = container; 
;
  }
  private void _pickup_onExit_xjal( final com.anylogic.libraries.processmodeling.Pickup<Pallet, Item> self, Pallet container ) {
    
 
;
  }
  private Path _toConveyor_destinationPath_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    Path _value;
    _value = 
 
;
    return _value;
  }
  private boolean _toConveyor_destinationPathOffsetFromBeginning_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private double _toConveyor_destinationPathOffset_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private Attractor _toConveyor_destinationAttractor_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    Attractor _value;
    _value = 
 
;
    return _value;
  }
  private Node _toConveyor_destinationNode_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    Node _value;
    _value = 
 
;
    return _value;
  }
  private ConveyorPath _toConveyor_destinationConveyor_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    ConveyorPath _value;
    _value = 
conveyor 
;
    return _value;
  }
  private boolean _toConveyor_destinationConveyorOffsetFromBeginning_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private double _toConveyor_destinationConveyorOffset_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private PositionOnConveyor _toConveyor_destinationPositionOnConveyor_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    PositionOnConveyor _value;
    _value = 
 
;
    return _value;
  }
  private ConveyorStation _toConveyor_destinationConveyorStation_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    ConveyorStation _value;
    _value = 
 
;
    return _value;
  }
  private boolean _toConveyor_changeOrientation_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private AgentOrientation _toConveyor_orientation_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent ) {
    AgentOrientation _value;
    _value = 
AGENT_ORIENTATION_FRONT 
;
    return _value;
  }
  private double _toConveyor_destinationX_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _toConveyor_destinationY_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _toConveyor_destinationZ_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private boolean _toConveyor_destinationInNetwork_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private INetwork _toConveyor_destinationNetwork_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    INetwork _value;
    _value = 
 
;
    return _value;
  }
  private Level _toConveyor_destinationLevel_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    Level _value;
    _value = 
 
;
    return _value;
  }
  private com.anylogic.libraries.material_handling.TransporterFleet _toConveyor_fleet_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent ) {
    com.anylogic.libraries.material_handling.TransporterFleet _value;
    _value = 
forkliftFleet 
;
    return _value;
  }
  private double _toConveyor_loadingTime_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent ) {
    double _value;
    _value = 
triangular( 15, 20, 30 ) 
;
    return _value;
  }
  private Path _toConveyor_seizeDestinationPath_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    Path _value;
    _value = 
 
;
    return _value;
  }
  private boolean _toConveyor_seizeDestinationPathOffsetFromBeginning_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _toConveyor_seizeDestinationPathOffset_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private Attractor _toConveyor_seizeDestinationAttractor_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    Attractor _value;
    _value = 
 
;
    return _value;
  }
  private Node _toConveyor_seizeDestinationNode_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    Node _value;
    _value = 
 
;
    return _value;
  }
  private ConveyorPath _toConveyor_seizeDestinationConveyor_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    ConveyorPath _value;
    _value = 
 
;
    return _value;
  }
  private boolean _toConveyor_seizeDestinationConveyorOffsetFromBeginning_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _toConveyor_seizeDestinationConveyorOffset_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private PositionOnConveyor _toConveyor_seizeDestinationPositionOnConveyor_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    PositionOnConveyor _value;
    _value = 
 
;
    return _value;
  }
  private ConveyorStation _toConveyor_seizeDestinationConveyorStation_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    ConveyorStation _value;
    _value = 
 
;
    return _value;
  }
  private double _toConveyor_seizeDestinationX_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _toConveyor_seizeDestinationY_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _toConveyor_seizeDestinationZ_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private boolean _toConveyor_seizeDestinationInNetwork_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private INetwork _toConveyor_seizeDestinationNetwork_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    INetwork _value;
    _value = 
 
;
    return _value;
  }
  private Level _toConveyor_seizeDestinationLevel_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    Level _value;
    _value = 
 
;
    return _value;
  }
  private double _toConveyor_priority_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _toConveyor_taskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.libraries.material_handling.SeizeTransporter.TransporterTaskPreemptionPolicy _toConveyor_taskPreemptionPolicy_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent ) {
    com.anylogic.libraries.material_handling.SeizeTransporter.TransporterTaskPreemptionPolicy _value;
    _value = 
self.PP_NO_PREEMPTION 
;
    return _value;
  }
  private boolean _toConveyor_transporterChoiceCondition_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit, TransporterFleet<?> fleet ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private boolean _toConveyor_transporterComparison_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit1, Agent unit2, Pallet agent ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _toConveyor_transporterRating_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit, Pallet agent ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private com.anylogic.libraries.material_handling.ReleaseTransporter.TransporterReleaseMovingPolicy _toConveyor_canceledMovingPolicy_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    com.anylogic.libraries.material_handling.ReleaseTransporter.TransporterReleaseMovingPolicy _value;
    _value = 
self.MP_RETURNS_TO_HOME 
;
    return _value;
  }
  private Path _toConveyor_canceledDestinationPath_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    Path _value;
    _value = 
 
;
    return _value;
  }
  private boolean _toConveyor_canceledDestinationPathOffsetFromBeginning_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private double _toConveyor_canceledDestinationPathOffset_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private Attractor _toConveyor_canceledDestinationAttractor_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    Attractor _value;
    _value = 
 
;
    return _value;
  }
  private Node _toConveyor_canceledDestinationNode_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    Node _value;
    _value = 
 
;
    return _value;
  }
  private ConveyorPath _toConveyor_canceledDestinationConveyor_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    ConveyorPath _value;
    _value = 
 
;
    return _value;
  }
  private boolean _toConveyor_canceledDestinationConveyorOffsetFromBeginning_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private double _toConveyor_canceledDestinationConveyorOffset_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private PositionOnConveyor _toConveyor_canceledDestinationPositionOnConveyor_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    PositionOnConveyor _value;
    _value = 
 
;
    return _value;
  }
  private ConveyorStation _toConveyor_canceledDestinationConveyorStation_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    ConveyorStation _value;
    _value = 
 
;
    return _value;
  }
  private double _toConveyor_canceledDestinationX_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _toConveyor_canceledDestinationY_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _toConveyor_canceledDestinationZ_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private boolean _toConveyor_canceledDestinationInNetwork_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private INetwork _toConveyor_canceledDestinationNetwork_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    INetwork _value;
    _value = 
 
;
    return _value;
  }
  private Level _toConveyor_canceledDestinationLevel_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    Level _value;
    _value = 
 
;
    return _value;
  }
  private double _toConveyor_unloadingTime_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent ) {
    double _value;
    _value = 
triangular( 15, 20, 30 ) 
;
    return _value;
  }
  private com.anylogic.libraries.material_handling.ReleaseTransporter.TransporterReleaseMovingPolicy _toConveyor_releaseMovingPolicy_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    com.anylogic.libraries.material_handling.ReleaseTransporter.TransporterReleaseMovingPolicy _value;
    _value = 
self.MP_RETURNS_TO_NEAREST_HOME 
;
    return _value;
  }
  private Path _toConveyor_releaseDestinationPath_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    Path _value;
    _value = 
 
;
    return _value;
  }
  private boolean _toConveyor_releaseDestinationPathOffsetFromBeginning_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private double _toConveyor_releaseDestinationPathOffset_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private Attractor _toConveyor_releaseDestinationAttractor_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    Attractor _value;
    _value = 
 
;
    return _value;
  }
  private Node _toConveyor_releaseDestinationNode_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    Node _value;
    _value = 
 
;
    return _value;
  }
  private ConveyorPath _toConveyor_releaseDestinationConveyor_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    ConveyorPath _value;
    _value = 
 
;
    return _value;
  }
  private boolean _toConveyor_releaseDestinationConveyorOffsetFromBeginning_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private double _toConveyor_releaseDestinationConveyorOffset_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private PositionOnConveyor _toConveyor_releaseDestinationPositionOnConveyor_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    PositionOnConveyor _value;
    _value = 
 
;
    return _value;
  }
  private ConveyorStation _toConveyor_releaseDestinationConveyorStation_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    ConveyorStation _value;
    _value = 
 
;
    return _value;
  }
  private double _toConveyor_releaseDestinationX_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _toConveyor_releaseDestinationY_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _toConveyor_releaseDestinationZ_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private boolean _toConveyor_releaseDestinationInNetwork_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private INetwork _toConveyor_releaseDestinationNetwork_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    INetwork _value;
    _value = 
 
;
    return _value;
  }
  private Level _toConveyor_releaseDestinationLevel_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    Level _value;
    _value = 
 
;
    return _value;
  }
  private com.anylogic.libraries.material_handling.ReleaseTransporter.TransporterReleaseReturnPolicy _toConveyor_releaseReturnPolicy_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    com.anylogic.libraries.material_handling.ReleaseTransporter.TransporterReleaseReturnPolicy _value;
    _value = 
self.RP_IF_NO_OTHER_TASKS 
;
    return _value;
  }
  private void _toConveyor_onEnter_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent ) {
    
 
;
  }
  private void _toConveyor_onAtExit_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent ) {
    
 
;
  }
  private void _toConveyor_onExit_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent ) {
    
 
;
  }
  private void _toConveyor_onRemove_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent ) {
    
 
;
  }
  private void _toConveyor_onSeizeTransporter_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    
 
;
  }
  private void _toConveyor_onLoadingStarted_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    
 
;
  }
  private void _toConveyor_onLoadingFinished_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    
 
;
  }
  private void _toConveyor_onTaskSuspended_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    
 
;
  }
  private void _toConveyor_onTaskResumed_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    
 
;
  }
  private void _toConveyor_onReleaseTransporter_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    
 
;
  }
  private void _toConveyor_onUnloadingStarted_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    
 
;
  }
  private void _toConveyor_onUnloadingFinished_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    
 
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
  protected static final Color _shapeBox_Fill_Color = new Color( 0xFFE8B90F, true );
  protected static final Color __ps2_Fill_Color = new Color( 0x18000000, true );
  protected static final Color __ps3_Fill_Color = new Color( 0x50FFFFFF, true );
  protected static final Color __ps4_Line_Color = new Color( 0xFF4A3500, true );
  protected static final Color __ps5_Line_Color = new Color( 0xFF9F7E0A, true );
  protected static final Color __ps6_Line_Color = new Color( 0xFF9F7E0A, true );
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _pallet_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "Material_Surf", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final int _roundRectangle = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int _shapeBox = 2;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps2 = 3;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps3 = 4;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps4 = 5;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps5 = 6;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps6 = 7;
  @AnyLogicInternalCodegenAPI
  protected static final int _box = 8;
  @AnyLogicInternalCodegenAPI
  protected static final int _pallet = 9;
  @AnyLogicInternalCodegenAPI
  protected static final int _group = 10;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 11;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return false;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _shapeBox_pointsDX_xjal() {
    return new double[] { 0.0, 7.826, 7.826, 0.0, -7.826, -7.826,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _shapeBox_pointsDY_xjal() {
    return new double[] { 0.0, -3.913, -11.739, -15.652, -11.739, -3.913,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _shapeBox_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps2_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, 7.826, 7.826,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps2_pointsDY_xjal() {
    return new double[] { 0.0, -7.826, -11.739, -3.913,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps2_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps3_pointsDX_xjal() {
    return new double[] { 0.0, 7.826, 0.0, -7.826,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps3_pointsDY_xjal() {
    return new double[] { 0.0, -3.913, -7.826, -3.913,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps3_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps4_pointsDX_xjal() {
    return new double[] { 0.0, 7.826, 7.826, 0.0, -7.826, -7.826,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps4_pointsDY_xjal() {
    return new double[] { 0.0, -3.913, -11.739, -15.652, -11.739, -3.913,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps4_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
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
      case _shapeBox:
        if (true) {
          ShapePolyLine self = this.shapeBox;
          
 
        }
        break;
      case __ps2:
        if (true) {
          ShapePolyLine self = this._ps2;
          
 
        }
        break;
      case __ps3:
        if (true) {
          ShapePolyLine self = this._ps3;
          
 
        }
        break;
      case __ps4:
        if (true) {
          ShapePolyLine self = this._ps4;
          
 
        }
        break;
      case __ps5:
        if (true) {
          ShapeLine self = this._ps5;
          
 
        }
        break;
      case __ps6:
        if (true) {
          ShapeLine self = this._ps6;
          
 
        }
        break;
      case _box:
        if (true) {
          ShapeGroup self = this.box;
          
 
        }
        break;
      case _pallet:
        if (true) {
          Shape3DObject self = this.pallet;
          
 
        }
        break;
      case _group:
        if (true) {
          ShapeGroup self = this.group;
          
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
      case _box:
          
 
        break;
      case _group:
          
 
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
  private void _shapeBox_SetDynamicParams_xjal( ShapePolyLine shape ) {
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
  
  protected ShapePolyLine shapeBox;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void __ps2_SetDynamicParams_xjal( ShapePolyLine shape ) {
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
  
  protected ShapePolyLine _ps2;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void __ps3_SetDynamicParams_xjal( ShapePolyLine shape ) {
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
  
  protected ShapePolyLine _ps3;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void __ps4_SetDynamicParams_xjal( ShapePolyLine shape ) {
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
  
  protected ShapePolyLine _ps4;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void __ps5_SetDynamicParams_xjal( ShapeLine shape ) {
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
  
  protected ShapeLine _ps5;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void __ps6_SetDynamicParams_xjal( ShapeLine shape ) {
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
  
  protected ShapeLine _ps6;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _box_SetDynamicParams_xjal( ShapeGroup shape ) {
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
  
  protected ShapeGroup box;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _pallet_SetDynamicParams_xjal( Shape3DObject shape ) {
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
    shape.setScale(
 
);
    shape.setRotation(
 
);
 	}
  }
  
  protected Shape3DObject pallet;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _group_SetDynamicParams_xjal( ShapeGroup shape ) {
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
  
  protected ShapeGroup group;
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

    shapeBox = new ShapePolyLine(
		SHAPE_DRAW_2D, true, 0.0, 7.826, 0.0, null, _shapeBox_Fill_Color,
            6, _shapeBox_pointsDX_xjal(), _shapeBox_pointsDY_xjal(), _shapeBox_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID ) {
      @Override
      public void updateDynamicProperties() {
        _shapeBox_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    _ps2 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, 0.0, 7.826, 0.0, null, __ps2_Fill_Color,
            4, __ps2_pointsDX_xjal(), __ps2_pointsDY_xjal(), __ps2_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID ) {
      @Override
      public void updateDynamicProperties() {
        __ps2_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    _ps3 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, 0.0, 0.0, 0.0, null, __ps3_Fill_Color,
            4, __ps3_pointsDX_xjal(), __ps3_pointsDY_xjal(), __ps3_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID ) {
      @Override
      public void updateDynamicProperties() {
        __ps3_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    _ps4 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, 0.0, 7.826, 0.0, __ps4_Line_Color, null,
            6, __ps4_pointsDX_xjal(), __ps4_pointsDY_xjal(), __ps4_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID ) {
      @Override
      public void updateDynamicProperties() {
        __ps4_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    _ps5 = new ShapeLine(
		SHAPE_DRAW_2D, true, -3.913, -5.87, 0.0, __ps5_Line_Color, 
 		7.0,	3.0, 0.0, 1.0, 10.0, LINE_STYLE_SOLID ) {
      @Override
      public void updateDynamicProperties() {
        __ps5_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    _ps6 = new ShapeLine(
		SHAPE_DRAW_2D, true, 7.826, -3.913, 0.0, __ps6_Line_Color, 
 		-8.0,	3.0, 0.0, 1.0, 10.0, LINE_STYLE_SOLID ) {
      @Override
      public void updateDynamicProperties() {
        __ps6_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    pallet = new Shape3DObject(
		PalletSource.this, SHAPE_DRAW_2D, true, 0.0, 18.0, 0.0, 0.0,
			3.0, true, "/warehouse_conveyor/",
			"3d/pallet.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, 0.0, 0.0,
			1.0, 1.0, null, _pallet_customColors_xjal ) {
      @Override
      public void updateDynamicProperties() {
        _pallet_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {				
    box = new ShapeGroup( PalletSource.this, SHAPE_DRAW_2D, true, 0.0, -5.0, 0.0, 0.0
	
	     , shapeBox
	     , _ps2
	     , _ps3
	     , _ps4
	     , _ps5
	     , _ps6 ) {
      @Override
      public void updateDynamicProperties() {
        _box_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }

      @Override
      @AnyLogicInternalCodegenAPI
      public void onDraw() {
        onShapeGroupDraw( _box, 0 );
      }
    };

    }
    {				
    group = new ShapeGroup( PalletSource.this, SHAPE_DRAW_2D, true, 90.0, 100.0, 0.0, 0.0
	
	     , roundRectangle
	     , box
	     , pallet ) {
      @Override
      public void updateDynamicProperties() {
        _group_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }

      @Override
      @AnyLogicInternalCodegenAPI
      public boolean onClick( double clickx, double clicky ) {
        return onShapeClick( _group, 0, clickx, clicky );
      }

      @Override
      @AnyLogicInternalCodegenAPI
      public void onDraw() {
        onShapeGroupDraw( _group, 0 );
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

  @AnyLogicInternalCodegenAPI
  public String getNameOf( Port<?, ?> _p ) {
    if( _p == this.port ) return "port";
    return super.getNameOf( _p ); 
  }

  @AnyLogicInternalCodegenAPI
  public boolean executeOnSendActionOf( Port<?, ?> _p, Object _msg ) {
    if( _p == this.port ) {
      Port< Object, Object > self = this.port;
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
  public PalletSource( Engine engine, Agent owner, AgentList<? extends PalletSource> ownerPopulation ) {
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
    sourcePallet = instantiate_sourcePallet_xjal();
    sourceItems = instantiate_sourceItems_xjal();
    queue = instantiate_queue_xjal();
    pickup = instantiate_pickup_xjal();
    toConveyor = instantiate_toConveyor_xjal();
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
  public PalletSource() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public PalletSource( ItemType itemsType, int holdingCapacity, RectangularNode<?> dock, TransporterFleet forkliftFleet, ConveyorPath conveyor ) {
    markParametersAreSet();
    this.itemsType = itemsType;
    this.holdingCapacity = holdingCapacity;
    this.dock = dock;
    this.forkliftFleet = forkliftFleet;
    this.conveyor = conveyor;
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
    setupPlainVariables_PalletSource_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( PalletSource.this, true, 0, 0, 0, 0 , level );
    // Creating embedded object instances
    instantiatePopulations_xjal();
    icon = new ShapeModelElementsGroup( PalletSource.this, getElementProperty( "warehouse_conveyor.PalletSource.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS ) , group );
    icon.setIconOffsets( 60.0, 70.0 );
    // Creating non-replicated embedded objects
    setupParameters_sourcePallet_xjal( sourcePallet, null );
    doBeforeCreate_sourcePallet_xjal( sourcePallet, null );
    sourcePallet.createAsEmbedded();
    setupParameters_sourceItems_xjal( sourceItems, null );
    doBeforeCreate_sourceItems_xjal( sourceItems, null );
    sourceItems.createAsEmbedded();
    setupParameters_queue_xjal( queue, null );
    doBeforeCreate_queue_xjal( queue, null );
    queue.createAsEmbedded();
    setupParameters_pickup_xjal( pickup, null );
    doBeforeCreate_pickup_xjal( pickup, null );
    pickup.createAsEmbedded();
    setupParameters_toConveyor_xjal( toConveyor, null );
    doBeforeCreate_toConveyor_xjal( toConveyor, null );
    toConveyor.createAsEmbedded();
	 // Port connectors with non-replicated objects
    queue.in.connect( sourceItems.out ); // connector20
    pickup.in.connect( sourcePallet.out ); // connector1
    queue.out.connect( pickup.inPickup ); // connector22
    port.map( toConveyor.out ); // connector
    pickup.out.connect( toConveyor.in ); // connector6
    // Creating replicated embedded objects
    setupInitialConditions_xjal( PalletSource.class );
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
    addItems.start();
    sourcePallet.startAsEmbedded();
    sourceItems.startAsEmbedded();
    queue.startAsEmbedded();
    pickup.startAsEmbedded();
    toConveyor.startAsEmbedded();
  }
 
  @AnyLogicInternalCodegenAPI
  public void onStartup() {
    super.onStartup();
    
addItems.restart(); 
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_PalletSource_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_PalletSource_xjal() {
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
    list.add( sourcePallet );
    list.add( sourceItems );
    list.add( queue );
    list.add( pickup );
    list.add( toConveyor );
    return list;
  }

  public AgentList<? extends PalletSource> getPopulation() {
    return (AgentList<? extends PalletSource>) super.getPopulation();
  }

  public List<? extends PalletSource> agentsInRange( double distance ) {
    return (List<? extends PalletSource>) super.agentsInRange( distance );
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    addItems.onDestroy();
    port.onDestroy();
    sourcePallet.onDestroy();
    sourceItems.onDestroy();
    queue.onDestroy();
    pickup.onDestroy();
    toConveyor.onDestroy();
    // On destroy code
    
 
    super.onDestroy();
  }

  @AnyLogicInternalCodegenAPI
  @Override
  public void doFinish() {
    super.doFinish();
    sourcePallet.doFinish();
    sourceItems.doFinish();
    queue.doFinish();
    pickup.doFinish();
    toConveyor.doFinish();
  }

  // Additional class code

 
  // End of additional class code


}
