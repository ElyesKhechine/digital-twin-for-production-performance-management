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

public class Main extends Agent
{
  // Parameters

  public 
int  nInitialItemsPerType;

  /**
   * Returns default value for parameter <code>nInitialItemsPerType</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _nInitialItemsPerType_DefaultValue_xjal() {
    final Main self = this;
    return 
40 
;
  }

  public void set_nInitialItemsPerType( int value ) {
    if (value == this.nInitialItemsPerType) {
      return;
    }
    int _oldValue_xjal = this.nInitialItemsPerType;
    this.nInitialItemsPerType = value;
    onChange_nInitialItemsPerType_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter nInitialItemsPerType.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_nInitialItemsPerType()</code> method instead.
   */
  protected void onChange_nInitialItemsPerType() {
    onChange_nInitialItemsPerType_xjal( nInitialItemsPerType );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_nInitialItemsPerType_xjal( int oldValue ) {  
  }


  public 
int  minAvailability;

  /**
   * Returns default value for parameter <code>minAvailability</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _minAvailability_DefaultValue_xjal() {
    final Main self = this;
    return 
40 
;
  }

  public void set_minAvailability( int value ) {
    if (value == this.minAvailability) {
      return;
    }
    int _oldValue_xjal = this.minAvailability;
    this.minAvailability = value;
    onChange_minAvailability_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter minAvailability.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_minAvailability()</code> method instead.
   */
  protected void onChange_minAvailability() {
    onChange_minAvailability_xjal( minAvailability );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_minAvailability_xjal( int oldValue ) {  
  }


  public 
int  minItemsInOrder;

  /**
   * Returns default value for parameter <code>minItemsInOrder</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _minItemsInOrder_DefaultValue_xjal() {
    final Main self = this;
    return 
2 
;
  }

  public void set_minItemsInOrder( int value ) {
    if (value == this.minItemsInOrder) {
      return;
    }
    int _oldValue_xjal = this.minItemsInOrder;
    this.minItemsInOrder = value;
    onChange_minItemsInOrder_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter minItemsInOrder.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_minItemsInOrder()</code> method instead.
   */
  protected void onChange_minItemsInOrder() {
    onChange_minItemsInOrder_xjal( minItemsInOrder );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_minItemsInOrder_xjal( int oldValue ) {  
  }


  public 
int  maxItemsInOrder;

  /**
   * Returns default value for parameter <code>maxItemsInOrder</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _maxItemsInOrder_DefaultValue_xjal() {
    final Main self = this;
    return 
5 
;
  }

  public void set_maxItemsInOrder( int value ) {
    if (value == this.maxItemsInOrder) {
      return;
    }
    int _oldValue_xjal = this.maxItemsInOrder;
    this.maxItemsInOrder = value;
    onChange_maxItemsInOrder_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter maxItemsInOrder.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_maxItemsInOrder()</code> method instead.
   */
  protected void onChange_maxItemsInOrder() {
    onChange_maxItemsInOrder_xjal( maxItemsInOrder );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_maxItemsInOrder_xjal( int oldValue ) {  
  }


  public 
double  orderArrivalTime;

  /**
   * Returns default value for parameter <code>orderArrivalTime</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _orderArrivalTime_DefaultValue_xjal() {
    final Main self = this;
    return 
25 
;
  }

  public void set_orderArrivalTime( double value ) {
    if (value == this.orderArrivalTime) {
      return;
    }
    double _oldValue_xjal = this.orderArrivalTime;
    this.orderArrivalTime = value;
    onChange_orderArrivalTime_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter orderArrivalTime.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_orderArrivalTime()</code> method instead.
   */
  protected void onChange_orderArrivalTime() {
    onChange_orderArrivalTime_xjal( orderArrivalTime );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_orderArrivalTime_xjal( double oldValue ) {  
  }


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    nInitialItemsPerType = _nInitialItemsPerType_DefaultValue_xjal();
    minAvailability = _minAvailability_DefaultValue_xjal();
    minItemsInOrder = _minItemsInOrder_DefaultValue_xjal();
    maxItemsInOrder = _maxItemsInOrder_DefaultValue_xjal();
    orderArrivalTime = _orderArrivalTime_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "nInitialItemsPerType":
      if ( _callOnChange_xjal ) {
        set_nInitialItemsPerType( ((Number) _value_xjal).intValue() );
      } else {
        nInitialItemsPerType = ((Number) _value_xjal).intValue();
      }
      return true;
    case "minAvailability":
      if ( _callOnChange_xjal ) {
        set_minAvailability( ((Number) _value_xjal).intValue() );
      } else {
        minAvailability = ((Number) _value_xjal).intValue();
      }
      return true;
    case "minItemsInOrder":
      if ( _callOnChange_xjal ) {
        set_minItemsInOrder( ((Number) _value_xjal).intValue() );
      } else {
        minItemsInOrder = ((Number) _value_xjal).intValue();
      }
      return true;
    case "maxItemsInOrder":
      if ( _callOnChange_xjal ) {
        set_maxItemsInOrder( ((Number) _value_xjal).intValue() );
      } else {
        maxItemsInOrder = ((Number) _value_xjal).intValue();
      }
      return true;
    case "orderArrivalTime":
      if ( _callOnChange_xjal ) {
        set_orderArrivalTime( ((Number) _value_xjal).doubleValue() );
      } else {
        orderArrivalTime = ((Number) _value_xjal).doubleValue();
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
    case "nInitialItemsPerType": _result_xjal = nInitialItemsPerType; break;
    case "minAvailability": _result_xjal = minAvailability; break;
    case "minItemsInOrder": _result_xjal = minItemsInOrder; break;
    case "maxItemsInOrder": _result_xjal = maxItemsInOrder; break;
    case "orderArrivalTime": _result_xjal = orderArrivalTime; break;
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
      list.add( "nInitialItemsPerType" );
      list.add( "minAvailability" );
      list.add( "minItemsInOrder" );
      list.add( "maxItemsInOrder" );
      list.add( "orderArrivalTime" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
  }
  // Plain Variables

  public 
ViewArea 
 selectedViewArea;

  // Collection Variables
  public 
TreeMap <
ItemType , 
StorageUnit > storageUnits = new TreeMap<ItemType, StorageUnit>();
  public 
LinkedList <
ConveyorPath > packagingLines = new LinkedList<ConveyorPath>();
  public 
LinkedList <
ConveyorPath > exitLines = new LinkedList<ConveyorPath>();
  public 
TreeMap <
ItemType , 
Path > trajectoriesToConv = new TreeMap<ItemType, Path>();
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Main.class );
  
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

  public EventTimeout orderArrival = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _ordersStates_autoUpdateEvent_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _storedItemsStatesChart_autoUpdateEvent_xjal = new EventTimeout(this);

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( EventTimeout _e ) {
     if( _e == orderArrival ) return "orderArrival";
     if( _e == _ordersStates_autoUpdateEvent_xjal ) return "ordersStates auto update event";
     if( _e == _storedItemsStatesChart_autoUpdateEvent_xjal ) return "storedItemsStatesChart auto update event";
    return super.getNameOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public EventTimeout.Mode getModeOf( EventTimeout _e ) {
    if ( _e == orderArrival ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _ordersStates_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _storedItemsStatesChart_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    return super.getModeOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public double getFirstOccurrenceTime( EventTimeout _e ) {
    double _t;
    if ( _e == orderArrival ) {
      _t = 
2 
;
      _t = toModelTime( _t, SECOND );
      return _t;
    }
    if ( _e == _ordersStates_autoUpdateEvent_xjal ) {
      _t = 
0 
;
      _t = toModelTime( _t, SECOND );
      return _t;
    }
    if ( _e == _storedItemsStatesChart_autoUpdateEvent_xjal ) {
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
    if( _e == orderArrival) {
      _t = 
orderArrivalTime 
;
      _t = toModelTime( _t, SECOND );
      return _t;
    }
    if( _e == _ordersStates_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toModelTime( _t, MINUTE );
      return _t;
    }
    if( _e == _storedItemsStatesChart_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toModelTime( _t, MINUTE );
      return _t;
    }
    return super.evaluateTimeoutOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( EventTimeout _e ) {
    if ( _e == orderArrival ) {
      EventTimeout self = _e;

Order newOrder = add_orders();

if ( newOrder.unavailableItems.isEmpty() )
	cartonsEnter.take( new Carton( newOrder ) );
		
supplyCheck();

itemsPerOrder.add( newOrder.orderList.size() ); 
;
      return;
    }
    if ( _e == _ordersStates_autoUpdateEvent_xjal ) {
      ordersStates.updateData();
      return;
    }
    if ( _e == _storedItemsStatesChart_autoUpdateEvent_xjal ) {
      storedItemsStatesChart.updateData();
      return;
    }
    super.executeActionOf( _e );
  }

	

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _STATECHART_COUNT_xjal = 0;


  // Embedded Objects

  @AnyLogicInternalCodegenAPI
  private static final AgentAnimationSettings _storedItems_animationSettings_xjal = new AgentAnimationSettings(1000L, 1000000000L);
  @AnyLogicInternalCodegenAPI
  private static final AgentAnimationSettings _packager1_animationSettings_xjal = new AgentAnimationSettings(1000L, 1000000000L);
  @AnyLogicInternalCodegenAPI
  private static final AgentAnimationSettings _packager2_animationSettings_xjal = new AgentAnimationSettings(1000L, 1000000000L);
  @AnyLogicInternalCodegenAPI
  private static final AgentAnimationSettings _packager3_animationSettings_xjal = new AgentAnimationSettings(1000L, 1000000000L);
  public PalletSource foodPalletSource;
  public com.anylogic.libraries.material_handling.Convey<
Pallet 
> toRobot;
  public com.anylogic.libraries.material_handling.Convey<
Pallet 
> palletToExit;
  public com.anylogic.libraries.processmodeling.Sink<
Pallet 
> sink1;
  public DropOffStation robotDropOffStation;
  public com.anylogic.libraries.material_handling.Convey<
Item 
> toRack;
  public com.anylogic.libraries.processmodeling.ResourcePool<
PickupRobotArm 
> pickupRobot;
  public PalletSource dishPalletSource;
  public PalletSource beveragesPalletSource;
  public com.anylogic.libraries.material_handling.Convey<
Pallet 
> toWorker;
  public DropOffStation workerDropOffStation;
  public com.anylogic.libraries.processmodeling.ResourcePool<
Worker 
> worker;
  public com.anylogic.libraries.material_handling.ConveyorExit<
Pallet 
> emptyPalletExit;
  public com.anylogic.libraries.processmodeling.Sink<
Pallet 
> sink2;
  public com.anylogic.libraries.processmodeling.MoveTo<
Pallet 
> moveTo;
  public com.anylogic.libraries.processmodeling.ResourcePool<
SimpleASRS 
> asrs1;
  public com.anylogic.libraries.processmodeling.ResourcePool<
SimpleASRS 
> asrs2;
  public com.anylogic.libraries.processmodeling.ResourcePool<
SimpleASRS 
> asrs3;
  public com.anylogic.libraries.material_handling.ConveyorEnter<
Carton 
> conveyorEnter;
  public com.anylogic.libraries.processmodeling.SelectOutput<
Carton 
> orderIsFullfilled;
  public com.anylogic.libraries.material_handling.Convey<
Carton 
> toPackagingLines;
  public com.anylogic.libraries.material_handling.Convey<
Carton 
> toSorterScanner;
  public com.anylogic.libraries.material_handling.Convey<
Carton 
> toLoadZone;
  public com.anylogic.libraries.processmodeling.Sink<
Carton 
> ordersSentToClient;
  public com.anylogic.libraries.processmodeling.Queue<
Carton 
> queueToCartConv;
  public com.anylogic.libraries.processmodeling.RackStore<
Item 
> rackStore;
  public com.anylogic.libraries.processmodeling.Enter<
Item 
> enter;
  public com.anylogic.libraries.processmodeling.Exit<
Item 
> exit;
  public com.anylogic.libraries.processmodeling.Exit<
Item 
> atStore;
  public com.anylogic.libraries.processmodeling.Enter<
Carton 
> cartonsEnter;
  public PickingStation<
Carton 
> pickingStation;
  public com.anylogic.libraries.processmodeling.Exit<
Item 
> toStoringStation;
  public StorageUnit foodStorageUnit;
  public StorageUnit beverageStorageUnit;
  public StorageUnit dishStorageUnit;
  public com.anylogic.libraries.processmodeling.ResourcePool<
Worker 
> packager1;
  public com.anylogic.libraries.processmodeling.ResourcePool<
Worker 
> packager2;
  public com.anylogic.libraries.processmodeling.ResourcePool<
Worker 
> packager3;
  public com.anylogic.libraries.material_handling.Convey<
Carton 
> toPickingLine;
  public com.anylogic.libraries.material_handling.Convey<
Carton 
> conveytoWorkzone;
  public com.anylogic.libraries.processmodeling.SelectOutput5<
Carton 
> canEnterLine;
  public com.anylogic.libraries.material_handling.Convey<
Carton 
> convey;
  public com.anylogic.libraries.material_handling.TransporterFleet<
Forklift 
> forklifts;
  public com.anylogic.libraries.material_handling.MoveByTransporter<
Pallet 
> moveToDock;
  public com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<
Item 
> _turntable_controller_xjal;
  public com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<
Item 
> _foodMergePoint_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Item 
> _infeedLineFood_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Item 
> _infeedMergeConveyor_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<
Item 
> _turntable1_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<
Item 
> _turntable2_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Item 
> _mergeToFoodRack_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Item 
> _toFoodRack_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Item 
> _mergeToBeverageRack_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Item 
> _toDishRack_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<
Item 
> _turntable3_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Item 
> _toBeverageRack_controller_xjal;
  public com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<
Item 
> _beverageDishMergePoint_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Item 
> _beveragesAndDishesLine1_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Item 
> _beveragesAndDishesLine_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _foodPickInLine_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<
Carton 
> _transferTable6_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _conveyor18_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<
Carton 
> _labelingStation_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<
Carton 
> _invoiceStation_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _cartonInitialLine_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _foodPickOutLine_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _toBeveragePick_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<
Carton 
> _transferTable7_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<
Carton 
> _transferTable8_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _beveragePickInLine_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _conveyor22_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<
Carton 
> _transferTable9_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _beveragePickOutLine_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _toDishPick_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _dishPickInLine_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _conveyor26_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<
Carton 
> _transferTable10_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<
Carton 
> _transferTable11_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<
Carton 
> _checkOrderStation_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _conveyor28_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _dishPickOutLine_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _returnToPickingLine_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<
Carton 
> _transferTable13_controller_xjal;
  public com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<
Carton 
> _pickingLinesStart_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _toFoodPick_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _conveyor30_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<
Carton 
> _transferTable12_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _conveyor32_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<
Carton 
> _turntable4_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _conveyor34_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<
Carton 
> _turntable5_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _conveyor35_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<
Carton 
> _turntable6_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<
Carton 
> _station_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _packagingLine1_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<
Carton 
> _station1_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _packagingLine2_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<
Carton 
> _station2_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _packagingLine3_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _conveyor33_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _conveyor39_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<
Carton 
> _turntable7_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _conveyor40_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<
Carton 
> _turntable8_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<
Carton 
> _turntable9_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<
Carton 
> _shippingLabelingStation_controller_xjal;
  public com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<
Carton 
> _scanner_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _toSorter_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<
Carton 
> _transferTable14_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _conveyor43_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _exitLine1_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<
Carton 
> _transferTable15_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _conveyor45_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<
Carton 
> _transferTable16_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _exitLine2_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _conveyor47_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<
Carton 
> _transferTable17_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<
Carton 
> _transferTable18_controller_xjal;
  public com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<
Carton 
> _recirculationLine_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _conveyor49_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<
Carton 
> _transferTable1_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<
Carton 
> _transferTable_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _conveyor_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<
Carton 
> _transferTable5_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<
Carton 
> _transferTable4_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _conveyor3_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<
Carton 
> _transferTable19_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<
Carton 
> _transferTable20_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _conveyor4_controller_xjal;
  public com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<
Carton 
> _packageLinesEntryPoint_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Carton 
> _conveyor36_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTurnStationDescriptor<
Carton 
> _turnStation_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Pallet 
> _conveyor8_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Pallet 
> _conveyor2_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<
Pallet 
> _turntable11_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Pallet 
> _conveyor1_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Pallet 
> _conveyor10_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<
Pallet 
> _turntable12_controller_xjal;
  public com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<
Pallet 
> _exitPalletLinePoint_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Pallet 
> _exitPalletLine_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Pallet 
> _conveyor7_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<
Pallet 
> _transferTable2_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<
Pallet 
> _turntable13_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Pallet 
> _conveyor5_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Pallet 
> _workerPalletLine_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<
Pallet 
> _transferTable3_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Pallet 
> _dishPalletLinePickup_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Pallet 
> _beveragePalletLinePickup_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<
Pallet 
> _turntable10_controller_xjal;
  public com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<
Pallet 
> _foodUnloadingPoint_controller_xjal;
  public com.anylogic.libraries.material_handling.ConveyorPathDescriptor<
Pallet 
> _robotPalletLine_controller_xjal;

  public String getNameOf( Agent ao ) {
    if ( ao == foodPalletSource ) return "foodPalletSource";
    if ( ao == toRobot ) return "toRobot";
    if ( ao == palletToExit ) return "palletToExit";
    if ( ao == sink1 ) return "sink1";
    if ( ao == robotDropOffStation ) return "robotDropOffStation";
    if ( ao == toRack ) return "toRack";
    if ( ao == pickupRobot ) return "pickupRobot";
    if ( ao == dishPalletSource ) return "dishPalletSource";
    if ( ao == beveragesPalletSource ) return "beveragesPalletSource";
    if ( ao == toWorker ) return "toWorker";
    if ( ao == workerDropOffStation ) return "workerDropOffStation";
    if ( ao == worker ) return "worker";
    if ( ao == emptyPalletExit ) return "emptyPalletExit";
    if ( ao == sink2 ) return "sink2";
    if ( ao == moveTo ) return "moveTo";
    if ( ao == asrs1 ) return "asrs1";
    if ( ao == asrs2 ) return "asrs2";
    if ( ao == asrs3 ) return "asrs3";
    if ( ao == conveyorEnter ) return "conveyorEnter";
    if ( ao == orderIsFullfilled ) return "orderIsFullfilled";
    if ( ao == toPackagingLines ) return "toPackagingLines";
    if ( ao == toSorterScanner ) return "toSorterScanner";
    if ( ao == toLoadZone ) return "toLoadZone";
    if ( ao == ordersSentToClient ) return "ordersSentToClient";
    if ( ao == queueToCartConv ) return "queueToCartConv";
    if ( ao == rackStore ) return "rackStore";
    if ( ao == enter ) return "enter";
    if ( ao == exit ) return "exit";
    if ( ao == atStore ) return "atStore";
    if ( ao == cartonsEnter ) return "cartonsEnter";
    if ( ao == pickingStation ) return "pickingStation";
    if ( ao == toStoringStation ) return "toStoringStation";
    if ( ao == foodStorageUnit ) return "foodStorageUnit";
    if ( ao == beverageStorageUnit ) return "beverageStorageUnit";
    if ( ao == dishStorageUnit ) return "dishStorageUnit";
    if ( ao == packager1 ) return "packager1";
    if ( ao == packager2 ) return "packager2";
    if ( ao == packager3 ) return "packager3";
    if ( ao == toPickingLine ) return "toPickingLine";
    if ( ao == conveytoWorkzone ) return "conveytoWorkzone";
    if ( ao == canEnterLine ) return "canEnterLine";
    if ( ao == convey ) return "convey";
    if ( ao == forklifts ) return "forklifts";
    if ( ao == moveToDock ) return "moveToDock";
    if ( ao == _turntable_controller_xjal ) return "_turntable_controller_xjal";
    if ( ao == _foodMergePoint_controller_xjal ) return "_foodMergePoint_controller_xjal";
    if ( ao == _infeedLineFood_controller_xjal ) return "_infeedLineFood_controller_xjal";
    if ( ao == _infeedMergeConveyor_controller_xjal ) return "_infeedMergeConveyor_controller_xjal";
    if ( ao == _turntable1_controller_xjal ) return "_turntable1_controller_xjal";
    if ( ao == _turntable2_controller_xjal ) return "_turntable2_controller_xjal";
    if ( ao == _mergeToFoodRack_controller_xjal ) return "_mergeToFoodRack_controller_xjal";
    if ( ao == _toFoodRack_controller_xjal ) return "_toFoodRack_controller_xjal";
    if ( ao == _mergeToBeverageRack_controller_xjal ) return "_mergeToBeverageRack_controller_xjal";
    if ( ao == _toDishRack_controller_xjal ) return "_toDishRack_controller_xjal";
    if ( ao == _turntable3_controller_xjal ) return "_turntable3_controller_xjal";
    if ( ao == _toBeverageRack_controller_xjal ) return "_toBeverageRack_controller_xjal";
    if ( ao == _beverageDishMergePoint_controller_xjal ) return "_beverageDishMergePoint_controller_xjal";
    if ( ao == _beveragesAndDishesLine1_controller_xjal ) return "_beveragesAndDishesLine1_controller_xjal";
    if ( ao == _beveragesAndDishesLine_controller_xjal ) return "_beveragesAndDishesLine_controller_xjal";
    if ( ao == _foodPickInLine_controller_xjal ) return "_foodPickInLine_controller_xjal";
    if ( ao == _transferTable6_controller_xjal ) return "_transferTable6_controller_xjal";
    if ( ao == _conveyor18_controller_xjal ) return "_conveyor18_controller_xjal";
    if ( ao == _labelingStation_controller_xjal ) return "_labelingStation_controller_xjal";
    if ( ao == _invoiceStation_controller_xjal ) return "_invoiceStation_controller_xjal";
    if ( ao == _cartonInitialLine_controller_xjal ) return "_cartonInitialLine_controller_xjal";
    if ( ao == _foodPickOutLine_controller_xjal ) return "_foodPickOutLine_controller_xjal";
    if ( ao == _toBeveragePick_controller_xjal ) return "_toBeveragePick_controller_xjal";
    if ( ao == _transferTable7_controller_xjal ) return "_transferTable7_controller_xjal";
    if ( ao == _transferTable8_controller_xjal ) return "_transferTable8_controller_xjal";
    if ( ao == _beveragePickInLine_controller_xjal ) return "_beveragePickInLine_controller_xjal";
    if ( ao == _conveyor22_controller_xjal ) return "_conveyor22_controller_xjal";
    if ( ao == _transferTable9_controller_xjal ) return "_transferTable9_controller_xjal";
    if ( ao == _beveragePickOutLine_controller_xjal ) return "_beveragePickOutLine_controller_xjal";
    if ( ao == _toDishPick_controller_xjal ) return "_toDishPick_controller_xjal";
    if ( ao == _dishPickInLine_controller_xjal ) return "_dishPickInLine_controller_xjal";
    if ( ao == _conveyor26_controller_xjal ) return "_conveyor26_controller_xjal";
    if ( ao == _transferTable10_controller_xjal ) return "_transferTable10_controller_xjal";
    if ( ao == _transferTable11_controller_xjal ) return "_transferTable11_controller_xjal";
    if ( ao == _checkOrderStation_controller_xjal ) return "_checkOrderStation_controller_xjal";
    if ( ao == _conveyor28_controller_xjal ) return "_conveyor28_controller_xjal";
    if ( ao == _dishPickOutLine_controller_xjal ) return "_dishPickOutLine_controller_xjal";
    if ( ao == _returnToPickingLine_controller_xjal ) return "_returnToPickingLine_controller_xjal";
    if ( ao == _transferTable13_controller_xjal ) return "_transferTable13_controller_xjal";
    if ( ao == _pickingLinesStart_controller_xjal ) return "_pickingLinesStart_controller_xjal";
    if ( ao == _toFoodPick_controller_xjal ) return "_toFoodPick_controller_xjal";
    if ( ao == _conveyor30_controller_xjal ) return "_conveyor30_controller_xjal";
    if ( ao == _transferTable12_controller_xjal ) return "_transferTable12_controller_xjal";
    if ( ao == _conveyor32_controller_xjal ) return "_conveyor32_controller_xjal";
    if ( ao == _turntable4_controller_xjal ) return "_turntable4_controller_xjal";
    if ( ao == _conveyor34_controller_xjal ) return "_conveyor34_controller_xjal";
    if ( ao == _turntable5_controller_xjal ) return "_turntable5_controller_xjal";
    if ( ao == _conveyor35_controller_xjal ) return "_conveyor35_controller_xjal";
    if ( ao == _turntable6_controller_xjal ) return "_turntable6_controller_xjal";
    if ( ao == _station_controller_xjal ) return "_station_controller_xjal";
    if ( ao == _packagingLine1_controller_xjal ) return "_packagingLine1_controller_xjal";
    if ( ao == _station1_controller_xjal ) return "_station1_controller_xjal";
    if ( ao == _packagingLine2_controller_xjal ) return "_packagingLine2_controller_xjal";
    if ( ao == _station2_controller_xjal ) return "_station2_controller_xjal";
    if ( ao == _packagingLine3_controller_xjal ) return "_packagingLine3_controller_xjal";
    if ( ao == _conveyor33_controller_xjal ) return "_conveyor33_controller_xjal";
    if ( ao == _conveyor39_controller_xjal ) return "_conveyor39_controller_xjal";
    if ( ao == _turntable7_controller_xjal ) return "_turntable7_controller_xjal";
    if ( ao == _conveyor40_controller_xjal ) return "_conveyor40_controller_xjal";
    if ( ao == _turntable8_controller_xjal ) return "_turntable8_controller_xjal";
    if ( ao == _turntable9_controller_xjal ) return "_turntable9_controller_xjal";
    if ( ao == _shippingLabelingStation_controller_xjal ) return "_shippingLabelingStation_controller_xjal";
    if ( ao == _scanner_controller_xjal ) return "_scanner_controller_xjal";
    if ( ao == _toSorter_controller_xjal ) return "_toSorter_controller_xjal";
    if ( ao == _transferTable14_controller_xjal ) return "_transferTable14_controller_xjal";
    if ( ao == _conveyor43_controller_xjal ) return "_conveyor43_controller_xjal";
    if ( ao == _exitLine1_controller_xjal ) return "_exitLine1_controller_xjal";
    if ( ao == _transferTable15_controller_xjal ) return "_transferTable15_controller_xjal";
    if ( ao == _conveyor45_controller_xjal ) return "_conveyor45_controller_xjal";
    if ( ao == _transferTable16_controller_xjal ) return "_transferTable16_controller_xjal";
    if ( ao == _exitLine2_controller_xjal ) return "_exitLine2_controller_xjal";
    if ( ao == _conveyor47_controller_xjal ) return "_conveyor47_controller_xjal";
    if ( ao == _transferTable17_controller_xjal ) return "_transferTable17_controller_xjal";
    if ( ao == _transferTable18_controller_xjal ) return "_transferTable18_controller_xjal";
    if ( ao == _recirculationLine_controller_xjal ) return "_recirculationLine_controller_xjal";
    if ( ao == _conveyor49_controller_xjal ) return "_conveyor49_controller_xjal";
    if ( ao == _transferTable1_controller_xjal ) return "_transferTable1_controller_xjal";
    if ( ao == _transferTable_controller_xjal ) return "_transferTable_controller_xjal";
    if ( ao == _conveyor_controller_xjal ) return "_conveyor_controller_xjal";
    if ( ao == _transferTable5_controller_xjal ) return "_transferTable5_controller_xjal";
    if ( ao == _transferTable4_controller_xjal ) return "_transferTable4_controller_xjal";
    if ( ao == _conveyor3_controller_xjal ) return "_conveyor3_controller_xjal";
    if ( ao == _transferTable19_controller_xjal ) return "_transferTable19_controller_xjal";
    if ( ao == _transferTable20_controller_xjal ) return "_transferTable20_controller_xjal";
    if ( ao == _conveyor4_controller_xjal ) return "_conveyor4_controller_xjal";
    if ( ao == _packageLinesEntryPoint_controller_xjal ) return "_packageLinesEntryPoint_controller_xjal";
    if ( ao == _conveyor36_controller_xjal ) return "_conveyor36_controller_xjal";
    if ( ao == _turnStation_controller_xjal ) return "_turnStation_controller_xjal";
    if ( ao == _conveyor8_controller_xjal ) return "_conveyor8_controller_xjal";
    if ( ao == _conveyor2_controller_xjal ) return "_conveyor2_controller_xjal";
    if ( ao == _turntable11_controller_xjal ) return "_turntable11_controller_xjal";
    if ( ao == _conveyor1_controller_xjal ) return "_conveyor1_controller_xjal";
    if ( ao == _conveyor10_controller_xjal ) return "_conveyor10_controller_xjal";
    if ( ao == _turntable12_controller_xjal ) return "_turntable12_controller_xjal";
    if ( ao == _exitPalletLinePoint_controller_xjal ) return "_exitPalletLinePoint_controller_xjal";
    if ( ao == _exitPalletLine_controller_xjal ) return "_exitPalletLine_controller_xjal";
    if ( ao == _conveyor7_controller_xjal ) return "_conveyor7_controller_xjal";
    if ( ao == _transferTable2_controller_xjal ) return "_transferTable2_controller_xjal";
    if ( ao == _turntable13_controller_xjal ) return "_turntable13_controller_xjal";
    if ( ao == _conveyor5_controller_xjal ) return "_conveyor5_controller_xjal";
    if ( ao == _workerPalletLine_controller_xjal ) return "_workerPalletLine_controller_xjal";
    if ( ao == _transferTable3_controller_xjal ) return "_transferTable3_controller_xjal";
    if ( ao == _dishPalletLinePickup_controller_xjal ) return "_dishPalletLinePickup_controller_xjal";
    if ( ao == _beveragePalletLinePickup_controller_xjal ) return "_beveragePalletLinePickup_controller_xjal";
    if ( ao == _turntable10_controller_xjal ) return "_turntable10_controller_xjal";
    if ( ao == _foodUnloadingPoint_controller_xjal ) return "_foodUnloadingPoint_controller_xjal";
    if ( ao == _robotPalletLine_controller_xjal ) return "_robotPalletLine_controller_xjal";
    return super.getNameOf( ao );
  }

  public AgentAnimationSettings getAnimationSettingsOf( Agent ao ) {
    return super.getAnimationSettingsOf( ao );
  }

  public class _storedItems_Population extends AgentArrayList<Item> {
    _storedItems_Population( Agent owner ) {
      super( owner );
    }

    @AnyLogicInternalCodegenAPI
    public Item instantiateAgent( int index ) {
    	return instantiate_storedItems_xjal( index );
    }

    @AnyLogicInternalCodegenAPI
    public void callSetupParameters( Item agent, int index, TableInput tableInput ) {
      setupParameters_storedItems_xjal( agent, index, tableInput );
    }

    @AnyLogicInternalCodegenAPI
    public void callCreate( Item agent, int index, TableInput tableInput ) {
      doBeforeCreate_storedItems_xjal( agent, index, tableInput );
      agent.create();
    }

    @AnyLogicInternalCodegenAPI
    public boolean isPresentationEnabled() {
      return true;
    }


    public int availableFood() {
      return _storedItems_availableFood_xjal();
    }

    public int availableBeverage() {
      return _storedItems_availableBeverage_xjal();
    }

    public int availableDish() {
      return _storedItems_availableDish_xjal();
    }

    public int unreservedFood() {
      return _storedItems_unreservedFood_xjal();
    }

    public int unreservedBeverage() {
      return _storedItems_unreservedBeverage_xjal();
    }

    public int unreservedDish() {
      return _storedItems_unreservedDish_xjal();
    }

    public int reservedItems() {
      return _storedItems_reservedItems_xjal();
    }

    public int unreservedItems() {
      return _storedItems_unreservedItems_xjal();
    }
  }
  
  @AnyLogicCustomProposalType(value = AnyLogicCustomProposalType.Label.POPULATION, customText = "Item")
  public _storedItems_Population storedItems = new _storedItems_Population( this );
  public class _orders_Population extends AgentArrayList<Order> {
    _orders_Population( Agent owner ) {
      super( owner );
    }

    @AnyLogicInternalCodegenAPI
    public Order instantiateAgent( int index ) {
    	return instantiate_orders_xjal( index );
    }

    @AnyLogicInternalCodegenAPI
    public void callSetupParameters( Order agent, int index, TableInput tableInput ) {
      setupParameters_orders_xjal( agent, index, tableInput );
    }

    @AnyLogicInternalCodegenAPI
    public void callCreate( Order agent, int index, TableInput tableInput ) {
      doBeforeCreate_orders_xjal( agent, index, tableInput );
      agent.create();
    }

    @AnyLogicInternalCodegenAPI
    public boolean isPresentationEnabled() {
      return false;
    }


    public int waitingForPreorder() {
      return _orders_waitingForPreorder_xjal();
    }

    public int inProcess() {
      return _orders_inProcess_xjal();
    }
  }
  
  @AnyLogicCustomProposalType(value = AnyLogicCustomProposalType.Label.POPULATION, customText = "Order")
  public _orders_Population orders = new _orders_Population( this );
  public class _storingStations_Population extends AgentArrayList<Storing> {
    _storingStations_Population( Agent owner ) {
      super( owner );
    }

    @AnyLogicInternalCodegenAPI
    public Storing instantiateAgent( int index ) {
    	return instantiate_storingStations_xjal( index );
    }

    @AnyLogicInternalCodegenAPI
    public void callSetupParameters( Storing agent, int index, TableInput tableInput ) {
      setupParameters_storingStations_xjal( agent, index, tableInput );
    }

    @AnyLogicInternalCodegenAPI
    public void callCreate( Storing agent, int index, TableInput tableInput ) {
      doBeforeCreate_storingStations_xjal( agent, index, tableInput );
      agent.create();
    }

    @AnyLogicInternalCodegenAPI
    public boolean isPresentationEnabled() {
      return false;
    }

  }
  
  @AnyLogicCustomProposalType(value = AnyLogicCustomProposalType.Label.POPULATION, customText = "Storing")
  public _storingStations_Population storingStations = new _storingStations_Population( this );

  public String getNameOf( AgentList<?> aolist ) {
    if( aolist == storedItems ) return "storedItems";
    if( aolist == orders ) return "orders";
    if( aolist == storingStations ) return "storingStations";
    return super.getNameOf( aolist );
  }
  
  public AgentAnimationSettings getAnimationSettingsOf( AgentList<?> aolist ) {
    if( aolist == storedItems ) return _storedItems_animationSettings_xjal;
    return super.getAnimationSettingsOf( aolist );
  }

  /**
   * Returns the agent element at the specified position in storedItems
   * population.
   * @see com.anylogic.engine.AgentList#get(int)
   * @since 7.3.7
   */
  public Item storedItems(int index) {
    return storedItems.get( index );
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection storedItems<br>
   * @return newly created embedded object
   */
  public Item add_storedItems() {
    int index = storedItems.size();
    Item _result_xjal = instantiate_storedItems_xjal( index );
    storedItems.callSetupParameters( _result_xjal, index );
    storedItems.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection storedItems<br>
   * This method uses given parameter values to setup created embedded object<br>
   * Index of this new embedded object instance can be obtained through calling <code>storedItems.size()</code> method <strong>before</strong> this method is called
   * @param type
   * @return newly created embedded object
   */
  public Item add_storedItems( ItemType type ) {
    int index = storedItems.size();
    Item _result_xjal = instantiate_storedItems_xjal( index );
    // Setup parameters
    _result_xjal.markParametersAreSet();
    _result_xjal.type = type;
    // Finish embedded object creation
    storedItems.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method removes the given embedded object from the replicated embedded object collection storedItems<br>
   * The given object is destroyed, but not immediately in common case.
   * @param object the active object - element of replicated embedded object storedItems - which should be removed
   * @return <code>true</code> if object was removed successfully, <code>false</code> if it doesn't belong to storedItems
   */
  public boolean remove_storedItems( Item object ) {
    if( ! storedItems._remove( object ) ) {
      return false;
    }
    object.removeFromFlowchart();
    object.setDestroyed();
    return true;
  }
  /**
   * Returns the agent element at the specified position in orders
   * population.
   * @see com.anylogic.engine.AgentList#get(int)
   * @since 7.3.7
   */
  public Order orders(int index) {
    return orders.get( index );
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection orders<br>
   * @return newly created embedded object
   */
  public Order add_orders() {
    int index = orders.size();
    Order _result_xjal = instantiate_orders_xjal( index );
    orders.callSetupParameters( _result_xjal, index );
    orders.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method removes the given embedded object from the replicated embedded object collection orders<br>
   * The given object is destroyed, but not immediately in common case.
   * @param object the active object - element of replicated embedded object orders - which should be removed
   * @return <code>true</code> if object was removed successfully, <code>false</code> if it doesn't belong to orders
   */
  public boolean remove_orders( Order object ) {
    if( ! orders._remove( object ) ) {
      return false;
    }
    object.removeFromFlowchart();
    object.setDestroyed();
    return true;
  }
  /**
   * Returns the agent element at the specified position in storingStations
   * population.
   * @see com.anylogic.engine.AgentList#get(int)
   * @since 7.3.7
   */
  public Storing storingStations(int index) {
    return storingStations.get( index );
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection storingStations<br>
   * @return newly created embedded object
   */
  public Storing add_storingStations() {
    int index = storingStations.size();
    Storing _result_xjal = instantiate_storingStations_xjal( index );
    storingStations.callSetupParameters( _result_xjal, index );
    storingStations.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection storingStations<br>
   * This method uses given parameter values to setup created embedded object<br>
   * Index of this new embedded object instance can be obtained through calling <code>storingStations.size()</code> method <strong>before</strong> this method is called
   * @param rack
   * @param asrsResource
   * @return newly created embedded object
   */
  public Storing add_storingStations( PalletRack rack, ResourcePool asrsResource ) {
    int index = storingStations.size();
    Storing _result_xjal = instantiate_storingStations_xjal( index );
    // Setup parameters
    _result_xjal.markParametersAreSet();
    _result_xjal.rack = rack;
    _result_xjal.asrsResource = asrsResource;
    // Finish embedded object creation
    storingStations.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method removes the given embedded object from the replicated embedded object collection storingStations<br>
   * The given object is destroyed, but not immediately in common case.
   * @param object the active object - element of replicated embedded object storingStations - which should be removed
   * @return <code>true</code> if object was removed successfully, <code>false</code> if it doesn't belong to storingStations
   */
  public boolean remove_storingStations( Storing object ) {
    if( ! storingStations._remove( object ) ) {
      return false;
    }
    object.removeFromFlowchart();
    object.setDestroyed();
    return true;
  }

  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected PalletSource instantiate_foodPalletSource_xjal() {
    PalletSource _result_xjal = new PalletSource( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_foodPalletSource_xjal( final PalletSource self, TableInput _t ) {
    self.itemsType = 
food 
;
    self.holdingCapacity = self._holdingCapacity_DefaultValue_xjal();
    self.dock = 
foodProductsDock 
;
    self.forkliftFleet = 
forklifts 
;
    self.conveyor = 
robotPalletLine 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_foodPalletSource_xjal( PalletSource self, TableInput _t ) {
    self.setEnvironment( this );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.Convey<Pallet> instantiate_toRobot_xjal() {
    com.anylogic.libraries.material_handling.Convey<Pallet> _result_xjal = new com.anylogic.libraries.material_handling.Convey<Pallet>( getEngine(), this, null ) {
      @Override
      public PositionOnConveyor targetPositionOnConveyor( Pallet agent ) {
        return _toRobot_targetPositionOnConveyor_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_toRobot_xjal( final com.anylogic.libraries.material_handling.Convey<Pallet> self, TableInput _t ) {
    self.sourceType = 
self.SOURCE_CURRENT_POSITION 
;
    self.targetType = 
self.TARGET_POSITION_ON_CONVEYOR 
;
    self.routeIs = self._routeIs_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_toRobot_xjal( com.anylogic.libraries.material_handling.Convey<Pallet> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.Convey<Pallet> instantiate_palletToExit_xjal() {
    com.anylogic.libraries.material_handling.Convey<Pallet> _result_xjal = new com.anylogic.libraries.material_handling.Convey<Pallet>( getEngine(), this, null ) {
      @Override
      public ConveyorPath targetConveyor( Pallet agent ) {
        return _palletToExit_targetConveyor_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_palletToExit_xjal( final com.anylogic.libraries.material_handling.Convey<Pallet> self, TableInput _t ) {
    self.sourceType = 
self.SOURCE_CURRENT_POSITION 
;
    self.targetType = self._targetType_DefaultValue_xjal();
    self.routeIs = self._routeIs_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_palletToExit_xjal( com.anylogic.libraries.material_handling.Convey<Pallet> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Sink<Pallet> instantiate_sink1_xjal() {
    com.anylogic.libraries.processmodeling.Sink<Pallet> _result_xjal = new com.anylogic.libraries.processmodeling.Sink<Pallet>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_sink1_xjal( final com.anylogic.libraries.processmodeling.Sink<Pallet> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_sink1_xjal( com.anylogic.libraries.processmodeling.Sink<Pallet> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected DropOffStation instantiate_robotDropOffStation_xjal() {
    DropOffStation _result_xjal = new DropOffStation( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_robotDropOffStation_xjal( final DropOffStation self, TableInput _t ) {
    self.resource = 
pickupRobot 
;
    self.nItemsToDrop = 
30 
;
    self.capacity = 
10 
;
    self.operationTime = 
60 
;
    self.trajectoryToConveyor = 
robotTrajectory 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_robotDropOffStation_xjal( DropOffStation self, TableInput _t ) {
    self.setEnvironment( this );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.Convey<Item> instantiate_toRack_xjal() {
    com.anylogic.libraries.material_handling.Convey<Item> _result_xjal = new com.anylogic.libraries.material_handling.Convey<Item>( getEngine(), this, null ) {
      @Override
      public ConveyorPath sourceConveyor( Item agent ) {
        return _toRack_sourceConveyor_xjal( this, agent );
      }
      @Override
      public double sourceOffset( Item agent ) {
        return _toRack_sourceOffset_xjal( this, agent );
      }

      @AnyLogicInternalCodegenAPI
      public LengthUnits getUnitsForCodeOf_sourceOffset() {
        return METER;
      }
      @Override
      public ConveyorPath targetConveyor( Item agent ) {
        return _toRack_targetConveyor_xjal( this, agent );
      }
      @Override
      public double targetOffset( Item agent ) {
        return _toRack_targetOffset_xjal( this, agent );
      }

      @AnyLogicInternalCodegenAPI
      public LengthUnits getUnitsForCodeOf_targetOffset() {
        return METER;
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_toRack_xjal( final com.anylogic.libraries.material_handling.Convey<Item> self, TableInput _t ) {
    self.sourceType = 
self.SOURCE_CONVEYOR_OFFSET 
;
    self.targetType = 
self.TARGET_CONVEYOR_OFFSET 
;
    self.routeIs = self._routeIs_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_toRack_xjal( com.anylogic.libraries.material_handling.Convey<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.ResourcePool<PickupRobotArm> instantiate_pickupRobot_xjal() {
    com.anylogic.libraries.processmodeling.ResourcePool<PickupRobotArm> _result_xjal = new com.anylogic.libraries.processmodeling.ResourcePool<PickupRobotArm>( getEngine(), this, null ) {
      @Override
      public Agent newUnit(  ) {
        return _pickupRobot_newUnit_xjal( this );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_pickupRobot_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<PickupRobotArm> self, TableInput _t ) {
    self.type = self._type_DefaultValue_xjal();
    self.capacityDefinitionType = self._capacityDefinitionType_DefaultValue_xjal();
    self.capacity = self._capacity_DefaultValue_xjal();
    self.capacityBasedOnAttractors = self._capacityBasedOnAttractors_DefaultValue_xjal();
    self.capacitySchedule = self._capacitySchedule_DefaultValue_xjal();
    self.capacityScheduleOnOff = self._capacityScheduleOnOff_DefaultValue_xjal();
    self.shiftGroupSchedules = self._shiftGroupSchedules_DefaultValue_xjal();
    self.shiftGroupSizes = self._shiftGroupSizes_DefaultValue_xjal();
    self.shiftGroupsPlan = self._shiftGroupsPlan_DefaultValue_xjal();
    self.destroyExcessUnits = self._destroyExcessUnits_DefaultValue_xjal();
    self.speed = self._speed_DefaultValue_xjal();
    self.homeNodes = new INode[]
{ robotHome } 
;
    self.showDefaultAnimationStatic = self._showDefaultAnimationStatic_DefaultValue_xjal();
    self.downtimeSource = self._downtimeSource_DefaultValue_xjal();
    self.downtimeList = self._downtimeList_DefaultValue_xjal();
    self.enableMaintenance = self._enableMaintenance_DefaultValue_xjal();
    self.maintenanceType = self._maintenanceType_DefaultValue_xjal();
    self.enableFailuresRepairs = self._enableFailuresRepairs_DefaultValue_xjal();
    self.countBusyOnlyTimeToFailure = self._countBusyOnlyTimeToFailure_DefaultValue_xjal();
    self.repairType = self._repairType_DefaultValue_xjal();
    self.enableBreaks = self._enableBreaks_DefaultValue_xjal();
    self.breaksSchedule = self._breaksSchedule_DefaultValue_xjal();
    self.enableCustomTasks = self._enableCustomTasks_DefaultValue_xjal();
    self.customTasks = self._customTasks_DefaultValue_xjal();
    self.customizeRequestChoice = self._customizeRequestChoice_DefaultValue_xjal();
    self.addToCustomPopulation = self._addToCustomPopulation_DefaultValue_xjal();
    self.forceStatisticsCollection = self._forceStatisticsCollection_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_pickupRobot_xjal( com.anylogic.libraries.processmodeling.ResourcePool<PickupRobotArm> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected PalletSource instantiate_dishPalletSource_xjal() {
    PalletSource _result_xjal = new PalletSource( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_dishPalletSource_xjal( final PalletSource self, TableInput _t ) {
    self.itemsType = 
dish 
;
    self.holdingCapacity = 
20 
;
    self.dock = 
dishDock 
;
    self.forkliftFleet = 
forklifts 
;
    self.conveyor = 
workerPalletLine 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_dishPalletSource_xjal( PalletSource self, TableInput _t ) {
    self.setEnvironment( this );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected PalletSource instantiate_beveragesPalletSource_xjal() {
    PalletSource _result_xjal = new PalletSource( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_beveragesPalletSource_xjal( final PalletSource self, TableInput _t ) {
    self.itemsType = 
beverage 
;
    self.holdingCapacity = 
20 
;
    self.dock = 
beverageDock 
;
    self.forkliftFleet = 
forklifts 
;
    self.conveyor = 
workerPalletLine 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_beveragesPalletSource_xjal( PalletSource self, TableInput _t ) {
    self.setEnvironment( this );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.Convey<Pallet> instantiate_toWorker_xjal() {
    com.anylogic.libraries.material_handling.Convey<Pallet> _result_xjal = new com.anylogic.libraries.material_handling.Convey<Pallet>( getEngine(), this, null ) {
      @Override
      public ConveyorPath targetConveyor( Pallet agent ) {
        return _toWorker_targetConveyor_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_toWorker_xjal( final com.anylogic.libraries.material_handling.Convey<Pallet> self, TableInput _t ) {
    self.sourceType = 
self.SOURCE_CURRENT_POSITION 
;
    self.targetType = 
self.TARGET_CONVEYOR_OFFSET 
;
    self.routeIs = self._routeIs_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_toWorker_xjal( com.anylogic.libraries.material_handling.Convey<Pallet> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected DropOffStation instantiate_workerDropOffStation_xjal() {
    DropOffStation _result_xjal = new DropOffStation( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_workerDropOffStation_xjal( final DropOffStation self, TableInput _t ) {
    self.resource = 
worker 
;
    self.nItemsToDrop = 
30 
;
    self.capacity = 
1 
;
    self.operationTime = 
uniform( 5, 8 ) 
;
    self.trajectoryToConveyor = 
workerDishTrajectory 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_workerDropOffStation_xjal( DropOffStation self, TableInput _t ) {
    self.setEnvironment( this );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.ResourcePool<Worker> instantiate_worker_xjal() {
    com.anylogic.libraries.processmodeling.ResourcePool<Worker> _result_xjal = new com.anylogic.libraries.processmodeling.ResourcePool<Worker>( getEngine(), this, null ) {
      @Override
      public Agent newUnit(  ) {
        return _worker_newUnit_xjal( this );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_worker_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Worker> self, TableInput _t ) {
    self.type = self._type_DefaultValue_xjal();
    self.capacityDefinitionType = self._capacityDefinitionType_DefaultValue_xjal();
    self.capacity = self._capacity_DefaultValue_xjal();
    self.capacityBasedOnAttractors = self._capacityBasedOnAttractors_DefaultValue_xjal();
    self.capacitySchedule = self._capacitySchedule_DefaultValue_xjal();
    self.capacityScheduleOnOff = self._capacityScheduleOnOff_DefaultValue_xjal();
    self.shiftGroupSchedules = self._shiftGroupSchedules_DefaultValue_xjal();
    self.shiftGroupSizes = self._shiftGroupSizes_DefaultValue_xjal();
    self.shiftGroupsPlan = self._shiftGroupsPlan_DefaultValue_xjal();
    self.destroyExcessUnits = self._destroyExcessUnits_DefaultValue_xjal();
    self.speed = self._speed_DefaultValue_xjal();
    self.homeNodes = new INode[]
{ workerHome } 
;
    self.showDefaultAnimationStatic = self._showDefaultAnimationStatic_DefaultValue_xjal();
    self.downtimeSource = self._downtimeSource_DefaultValue_xjal();
    self.downtimeList = self._downtimeList_DefaultValue_xjal();
    self.enableMaintenance = self._enableMaintenance_DefaultValue_xjal();
    self.maintenanceType = self._maintenanceType_DefaultValue_xjal();
    self.enableFailuresRepairs = self._enableFailuresRepairs_DefaultValue_xjal();
    self.countBusyOnlyTimeToFailure = self._countBusyOnlyTimeToFailure_DefaultValue_xjal();
    self.repairType = self._repairType_DefaultValue_xjal();
    self.enableBreaks = self._enableBreaks_DefaultValue_xjal();
    self.breaksSchedule = self._breaksSchedule_DefaultValue_xjal();
    self.enableCustomTasks = self._enableCustomTasks_DefaultValue_xjal();
    self.customTasks = self._customTasks_DefaultValue_xjal();
    self.customizeRequestChoice = self._customizeRequestChoice_DefaultValue_xjal();
    self.addToCustomPopulation = self._addToCustomPopulation_DefaultValue_xjal();
    self.forceStatisticsCollection = self._forceStatisticsCollection_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_worker_xjal( com.anylogic.libraries.processmodeling.ResourcePool<Worker> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorExit<Pallet> instantiate_emptyPalletExit_xjal() {
    com.anylogic.libraries.material_handling.ConveyorExit<Pallet> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorExit<Pallet>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_emptyPalletExit_xjal( final com.anylogic.libraries.material_handling.ConveyorExit<Pallet> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_emptyPalletExit_xjal( com.anylogic.libraries.material_handling.ConveyorExit<Pallet> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Sink<Pallet> instantiate_sink2_xjal() {
    com.anylogic.libraries.processmodeling.Sink<Pallet> _result_xjal = new com.anylogic.libraries.processmodeling.Sink<Pallet>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_sink2_xjal( final com.anylogic.libraries.processmodeling.Sink<Pallet> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_sink2_xjal( com.anylogic.libraries.processmodeling.Sink<Pallet> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.MoveTo<Pallet> instantiate_moveTo_xjal() {
    com.anylogic.libraries.processmodeling.MoveTo<Pallet> _result_xjal = new com.anylogic.libraries.processmodeling.MoveTo<Pallet>( getEngine(), this, null ) {
      @Override
      public INode destinationNode( Pallet agent ) {
        return _moveTo_destinationNode_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_moveTo_xjal( final com.anylogic.libraries.processmodeling.MoveTo<Pallet> self, TableInput _t ) {
    self.mode = self._mode_DefaultValue_xjal();
    self.destinationType = self._destinationType_DefaultValue_xjal();
    self.destinationInNetwork = self._destinationInNetwork_DefaultValue_xjal();
    self.useOffsets = self._useOffsets_DefaultValue_xjal();
    self.straightMovement = self._straightMovement_DefaultValue_xjal();
    self.destinationUseRotation = self._destinationUseRotation_DefaultValue_xjal();
    self.restoreSpeedOnArrival = self._restoreSpeedOnArrival_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_moveTo_xjal( com.anylogic.libraries.processmodeling.MoveTo<Pallet> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.ResourcePool<SimpleASRS> instantiate_asrs1_xjal() {
    com.anylogic.libraries.processmodeling.ResourcePool<SimpleASRS> _result_xjal = new com.anylogic.libraries.processmodeling.ResourcePool<SimpleASRS>( getEngine(), this, null ) {
      @Override
      public Agent newUnit(  ) {
        return _asrs1_newUnit_xjal( this );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_asrs1_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<SimpleASRS> self, TableInput _t ) {
    self.type = self._type_DefaultValue_xjal();
    self.capacityDefinitionType = self._capacityDefinitionType_DefaultValue_xjal();
    self.capacity = self._capacity_DefaultValue_xjal();
    self.capacityBasedOnAttractors = self._capacityBasedOnAttractors_DefaultValue_xjal();
    self.capacitySchedule = self._capacitySchedule_DefaultValue_xjal();
    self.capacityScheduleOnOff = self._capacityScheduleOnOff_DefaultValue_xjal();
    self.shiftGroupSchedules = self._shiftGroupSchedules_DefaultValue_xjal();
    self.shiftGroupSizes = self._shiftGroupSizes_DefaultValue_xjal();
    self.shiftGroupsPlan = self._shiftGroupsPlan_DefaultValue_xjal();
    self.destroyExcessUnits = self._destroyExcessUnits_DefaultValue_xjal();
    self.speed = self._speed_DefaultValue_xjal();
    self.homeNodes = new INode[]
{ asrs1Home } 
;
    self.showDefaultAnimationStatic = self._showDefaultAnimationStatic_DefaultValue_xjal();
    self.downtimeSource = self._downtimeSource_DefaultValue_xjal();
    self.downtimeList = self._downtimeList_DefaultValue_xjal();
    self.enableMaintenance = self._enableMaintenance_DefaultValue_xjal();
    self.maintenanceType = self._maintenanceType_DefaultValue_xjal();
    self.enableFailuresRepairs = self._enableFailuresRepairs_DefaultValue_xjal();
    self.countBusyOnlyTimeToFailure = self._countBusyOnlyTimeToFailure_DefaultValue_xjal();
    self.repairType = self._repairType_DefaultValue_xjal();
    self.enableBreaks = self._enableBreaks_DefaultValue_xjal();
    self.breaksSchedule = self._breaksSchedule_DefaultValue_xjal();
    self.enableCustomTasks = self._enableCustomTasks_DefaultValue_xjal();
    self.customTasks = self._customTasks_DefaultValue_xjal();
    self.customizeRequestChoice = self._customizeRequestChoice_DefaultValue_xjal();
    self.addToCustomPopulation = self._addToCustomPopulation_DefaultValue_xjal();
    self.forceStatisticsCollection = self._forceStatisticsCollection_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_asrs1_xjal( com.anylogic.libraries.processmodeling.ResourcePool<SimpleASRS> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.ResourcePool<SimpleASRS> instantiate_asrs2_xjal() {
    com.anylogic.libraries.processmodeling.ResourcePool<SimpleASRS> _result_xjal = new com.anylogic.libraries.processmodeling.ResourcePool<SimpleASRS>( getEngine(), this, null ) {
      @Override
      public Agent newUnit(  ) {
        return _asrs2_newUnit_xjal( this );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_asrs2_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<SimpleASRS> self, TableInput _t ) {
    self.type = self._type_DefaultValue_xjal();
    self.capacityDefinitionType = self._capacityDefinitionType_DefaultValue_xjal();
    self.capacity = self._capacity_DefaultValue_xjal();
    self.capacityBasedOnAttractors = self._capacityBasedOnAttractors_DefaultValue_xjal();
    self.capacitySchedule = self._capacitySchedule_DefaultValue_xjal();
    self.capacityScheduleOnOff = self._capacityScheduleOnOff_DefaultValue_xjal();
    self.shiftGroupSchedules = self._shiftGroupSchedules_DefaultValue_xjal();
    self.shiftGroupSizes = self._shiftGroupSizes_DefaultValue_xjal();
    self.shiftGroupsPlan = self._shiftGroupsPlan_DefaultValue_xjal();
    self.destroyExcessUnits = self._destroyExcessUnits_DefaultValue_xjal();
    self.speed = self._speed_DefaultValue_xjal();
    self.homeNodes = new INode[]
{ asrs2Home } 
;
    self.showDefaultAnimationStatic = self._showDefaultAnimationStatic_DefaultValue_xjal();
    self.downtimeSource = self._downtimeSource_DefaultValue_xjal();
    self.downtimeList = self._downtimeList_DefaultValue_xjal();
    self.enableMaintenance = self._enableMaintenance_DefaultValue_xjal();
    self.maintenanceType = self._maintenanceType_DefaultValue_xjal();
    self.enableFailuresRepairs = self._enableFailuresRepairs_DefaultValue_xjal();
    self.countBusyOnlyTimeToFailure = self._countBusyOnlyTimeToFailure_DefaultValue_xjal();
    self.repairType = self._repairType_DefaultValue_xjal();
    self.enableBreaks = self._enableBreaks_DefaultValue_xjal();
    self.breaksSchedule = self._breaksSchedule_DefaultValue_xjal();
    self.enableCustomTasks = self._enableCustomTasks_DefaultValue_xjal();
    self.customTasks = self._customTasks_DefaultValue_xjal();
    self.customizeRequestChoice = self._customizeRequestChoice_DefaultValue_xjal();
    self.addToCustomPopulation = self._addToCustomPopulation_DefaultValue_xjal();
    self.forceStatisticsCollection = self._forceStatisticsCollection_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_asrs2_xjal( com.anylogic.libraries.processmodeling.ResourcePool<SimpleASRS> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.ResourcePool<SimpleASRS> instantiate_asrs3_xjal() {
    com.anylogic.libraries.processmodeling.ResourcePool<SimpleASRS> _result_xjal = new com.anylogic.libraries.processmodeling.ResourcePool<SimpleASRS>( getEngine(), this, null ) {
      @Override
      public Agent newUnit(  ) {
        return _asrs3_newUnit_xjal( this );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_asrs3_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<SimpleASRS> self, TableInput _t ) {
    self.type = self._type_DefaultValue_xjal();
    self.capacityDefinitionType = self._capacityDefinitionType_DefaultValue_xjal();
    self.capacity = self._capacity_DefaultValue_xjal();
    self.capacityBasedOnAttractors = self._capacityBasedOnAttractors_DefaultValue_xjal();
    self.capacitySchedule = self._capacitySchedule_DefaultValue_xjal();
    self.capacityScheduleOnOff = self._capacityScheduleOnOff_DefaultValue_xjal();
    self.shiftGroupSchedules = self._shiftGroupSchedules_DefaultValue_xjal();
    self.shiftGroupSizes = self._shiftGroupSizes_DefaultValue_xjal();
    self.shiftGroupsPlan = self._shiftGroupsPlan_DefaultValue_xjal();
    self.destroyExcessUnits = self._destroyExcessUnits_DefaultValue_xjal();
    self.speed = self._speed_DefaultValue_xjal();
    self.homeNodes = new INode[]
{ asrs3Home } 
;
    self.showDefaultAnimationStatic = self._showDefaultAnimationStatic_DefaultValue_xjal();
    self.downtimeSource = self._downtimeSource_DefaultValue_xjal();
    self.downtimeList = self._downtimeList_DefaultValue_xjal();
    self.enableMaintenance = self._enableMaintenance_DefaultValue_xjal();
    self.maintenanceType = self._maintenanceType_DefaultValue_xjal();
    self.enableFailuresRepairs = self._enableFailuresRepairs_DefaultValue_xjal();
    self.countBusyOnlyTimeToFailure = self._countBusyOnlyTimeToFailure_DefaultValue_xjal();
    self.repairType = self._repairType_DefaultValue_xjal();
    self.enableBreaks = self._enableBreaks_DefaultValue_xjal();
    self.breaksSchedule = self._breaksSchedule_DefaultValue_xjal();
    self.enableCustomTasks = self._enableCustomTasks_DefaultValue_xjal();
    self.customTasks = self._customTasks_DefaultValue_xjal();
    self.customizeRequestChoice = self._customizeRequestChoice_DefaultValue_xjal();
    self.addToCustomPopulation = self._addToCustomPopulation_DefaultValue_xjal();
    self.forceStatisticsCollection = self._forceStatisticsCollection_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_asrs3_xjal( com.anylogic.libraries.processmodeling.ResourcePool<SimpleASRS> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorEnter<Carton> instantiate_conveyorEnter_xjal() {
    com.anylogic.libraries.material_handling.ConveyorEnter<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorEnter<Carton>( getEngine(), this, null ) {
      @Override
      public ConveyorPath conveyor( Carton agent ) {
        return _conveyorEnter_conveyor_xjal( this, agent );
      }
      @Override
      public boolean changeOrientation( Carton agent ) {
        return _conveyorEnter_changeOrientation_xjal( this, agent );
      }
      @Override
      public AgentOrientation orientation( Carton agent ) {
        return _conveyorEnter_orientation_xjal( this, agent );
      }
      @Override
      public void onEnter( Carton agent ) {
        _conveyorEnter_onEnter_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_conveyorEnter_xjal( final com.anylogic.libraries.material_handling.ConveyorEnter<Carton> self, TableInput _t ) {
    self.positionType = 
self.CONVEYOR_OFFSET 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_conveyorEnter_xjal( com.anylogic.libraries.material_handling.ConveyorEnter<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.SelectOutput<Carton> instantiate_orderIsFullfilled_xjal() {
    com.anylogic.libraries.processmodeling.SelectOutput<Carton> _result_xjal = new com.anylogic.libraries.processmodeling.SelectOutput<Carton>( getEngine(), this, null ) {
      @Override
      public boolean condition( Carton agent ) {
        return _orderIsFullfilled_condition_xjal( this, agent );
      }
      @Override
      public void onExitTrue( Carton agent ) {
        _orderIsFullfilled_onExitTrue_xjal( this, agent );
      }
      @Override
      public void onExitFalse( Carton agent ) {
        _orderIsFullfilled_onExitFalse_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_orderIsFullfilled_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Carton> self, TableInput _t ) {
    self.conditionIsProbabilistic = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_orderIsFullfilled_xjal( com.anylogic.libraries.processmodeling.SelectOutput<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.Convey<Carton> instantiate_toPackagingLines_xjal() {
    com.anylogic.libraries.material_handling.Convey<Carton> _result_xjal = new com.anylogic.libraries.material_handling.Convey<Carton>( getEngine(), this, null ) {
      @Override
      public PositionOnConveyor targetPositionOnConveyor( Carton agent ) {
        return _toPackagingLines_targetPositionOnConveyor_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_toPackagingLines_xjal( final com.anylogic.libraries.material_handling.Convey<Carton> self, TableInput _t ) {
    self.sourceType = 
self.SOURCE_CURRENT_POSITION 
;
    self.targetType = 
self.TARGET_POSITION_ON_CONVEYOR 
;
    self.routeIs = self._routeIs_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_toPackagingLines_xjal( com.anylogic.libraries.material_handling.Convey<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.Convey<Carton> instantiate_toSorterScanner_xjal() {
    com.anylogic.libraries.material_handling.Convey<Carton> _result_xjal = new com.anylogic.libraries.material_handling.Convey<Carton>( getEngine(), this, null ) {
      @Override
      public PositionOnConveyor targetPositionOnConveyor( Carton agent ) {
        return _toSorterScanner_targetPositionOnConveyor_xjal( this, agent );
      }
      @Override
      public ConveyorPath[] conveyorsToInclude( Carton agent ) {
        return _toSorterScanner_conveyorsToInclude_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_toSorterScanner_xjal( final com.anylogic.libraries.material_handling.Convey<Carton> self, TableInput _t ) {
    self.sourceType = 
self.SOURCE_CURRENT_POSITION 
;
    self.targetType = 
self.TARGET_POSITION_ON_CONVEYOR 
;
    self.routeIs = self._routeIs_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_toSorterScanner_xjal( com.anylogic.libraries.material_handling.Convey<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.Convey<Carton> instantiate_toLoadZone_xjal() {
    com.anylogic.libraries.material_handling.Convey<Carton> _result_xjal = new com.anylogic.libraries.material_handling.Convey<Carton>( getEngine(), this, null ) {
      @Override
      public ConveyorPath targetConveyor( Carton agent ) {
        return _toLoadZone_targetConveyor_xjal( this, agent );
      }
      @Override
      public boolean removeFromConveyor( Carton agent ) {
        return _toLoadZone_removeFromConveyor_xjal( this, agent );
      }
      @Override
      public void onExit( Carton agent ) {
        _toLoadZone_onExit_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_toLoadZone_xjal( final com.anylogic.libraries.material_handling.Convey<Carton> self, TableInput _t ) {
    self.sourceType = 
self.SOURCE_CURRENT_POSITION 
;
    self.targetType = 
self.TARGET_CONVEYOR_OFFSET 
;
    self.routeIs = self._routeIs_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_toLoadZone_xjal( com.anylogic.libraries.material_handling.Convey<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Sink<Carton> instantiate_ordersSentToClient_xjal() {
    com.anylogic.libraries.processmodeling.Sink<Carton> _result_xjal = new com.anylogic.libraries.processmodeling.Sink<Carton>( getEngine(), this, null ) {
      @Override
      public void onEnter( Carton agent ) {
        _ordersSentToClient_onEnter_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_ordersSentToClient_xjal( final com.anylogic.libraries.processmodeling.Sink<Carton> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_ordersSentToClient_xjal( com.anylogic.libraries.processmodeling.Sink<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Queue<Carton> instantiate_queueToCartConv_xjal() {
    com.anylogic.libraries.processmodeling.Queue<Carton> _result_xjal = new com.anylogic.libraries.processmodeling.Queue<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_queueToCartConv_xjal( final com.anylogic.libraries.processmodeling.Queue<Carton> self, TableInput _t ) {
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
  private void doBeforeCreate_queueToCartConv_xjal( com.anylogic.libraries.processmodeling.Queue<Carton> self, TableInput _t ) {
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
      public void onExit( Item agent, com.anylogic.libraries.processmodeling.RackSystem rackSystem, PalletRack palletRack, int row, int position, int level ) {
        _rackStore_onExit_xjal( this, agent, rackSystem, palletRack, row, position, level );
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
    self.movementDestination = 
self.DEST_CELL_BASE 
;
    self.useDelay = self._useDelay_DefaultValue_xjal();
    self.entityLocationQueue = self._entityLocationQueue_DefaultValue_xjal();
    self.useResources = self._useResources_DefaultValue_xjal();
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
  protected com.anylogic.libraries.processmodeling.Enter<Item> instantiate_enter_xjal() {
    com.anylogic.libraries.processmodeling.Enter<Item> _result_xjal = new com.anylogic.libraries.processmodeling.Enter<Item>( getEngine(), this, null ) {
      @Override
      public INode locationNode( Item agent ) {
        return _enter_locationNode_xjal( this, agent );
      }
      @Override
      public double speed( Item agent ) {
        return _enter_speed_xjal( this, agent );
      }

      @AnyLogicInternalCodegenAPI
      public SpeedUnits getUnitsForCodeOf_speed() {
        return MPS;
      }
      @Override
      public AgentList population( Item agent ) {
        return _enter_population_xjal( this, agent );
      }
      @Override
      public void onEnter( Item agent ) {
        _enter_onEnter_xjal( this, agent );
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
self.LOCATION_NODE 
;
    self.locationXYZInNetwork = self._locationXYZInNetwork_DefaultValue_xjal();
    self.addToCustomPopulation = 
true 
;
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
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
  protected com.anylogic.libraries.processmodeling.Exit<Item> instantiate_exit_xjal() {
    com.anylogic.libraries.processmodeling.Exit<Item> _result_xjal = new com.anylogic.libraries.processmodeling.Exit<Item>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_exit_xjal( final com.anylogic.libraries.processmodeling.Exit<Item> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_exit_xjal( com.anylogic.libraries.processmodeling.Exit<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Exit<Item> instantiate_atStore_xjal() {
    com.anylogic.libraries.processmodeling.Exit<Item> _result_xjal = new com.anylogic.libraries.processmodeling.Exit<Item>( getEngine(), this, null ) {
      @Override
      public void onExit( Item agent ) {
        _atStore_onExit_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_atStore_xjal( final com.anylogic.libraries.processmodeling.Exit<Item> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_atStore_xjal( com.anylogic.libraries.processmodeling.Exit<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance and adds it to the end of replicated embedded object list<br>
   * <i>This method should not be called by user</i>
   */
  protected Item instantiate_storedItems_xjal( final int index ) {
    Item _result_xjal = new Item( getEngine(), this, storedItems );
    
    storedItems._add( _result_xjal );

    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_storedItems_xjal( final Item self, final int index, TableInput _t ) {
    self.type = self._type_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_storedItems_xjal( Item self, final int index, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
    self.setEnvironment( this );
    self.setXYZ( 0.0, 0.0, 1.0 );

    // Port connections
  }
  /**
   * Creates an embedded object instance and adds it to the end of replicated embedded object list<br>
   * <i>This method should not be called by user</i>
   */
  protected Order instantiate_orders_xjal( final int index ) {
    Order _result_xjal = new Order( getEngine(), this, orders );
    
    orders._add( _result_xjal );

    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_orders_xjal( final Order self, final int index, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_orders_xjal( Order self, final int index, TableInput _t ) {
    self.setEnvironment( this );

    // Port connections
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Enter<Carton> instantiate_cartonsEnter_xjal() {
    com.anylogic.libraries.processmodeling.Enter<Carton> _result_xjal = new com.anylogic.libraries.processmodeling.Enter<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_cartonsEnter_xjal( final com.anylogic.libraries.processmodeling.Enter<Carton> self, TableInput _t ) {
    self.locationType = self._locationType_DefaultValue_xjal();
    self.locationXYZInNetwork = self._locationXYZInNetwork_DefaultValue_xjal();
    self.addToCustomPopulation = self._addToCustomPopulation_DefaultValue_xjal();
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_cartonsEnter_xjal( com.anylogic.libraries.processmodeling.Enter<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected PickingStation<Carton> instantiate_pickingStation_xjal() {
    PickingStation<Carton> _result_xjal = new PickingStation<Carton>( getEngine(), this, null ) {
      @Override
      public PalletRack rack( Item item ) {
        return _pickingStation_rack_xjal( this, item );
      }
      @Override
      public PointNode pickingStation( Item item ) {
        return _pickingStation_pickingStation_xjal( this, item );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_pickingStation_xjal( final PickingStation<Carton> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_pickingStation_xjal( PickingStation<Carton> self, TableInput _t ) {
    self.setEnvironment( this );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Exit<Item> instantiate_toStoringStation_xjal() {
    com.anylogic.libraries.processmodeling.Exit<Item> _result_xjal = new com.anylogic.libraries.processmodeling.Exit<Item>( getEngine(), this, null ) {
      @Override
      public void onExit( Item agent ) {
        _toStoringStation_onExit_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_toStoringStation_xjal( final com.anylogic.libraries.processmodeling.Exit<Item> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_toStoringStation_xjal( com.anylogic.libraries.processmodeling.Exit<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance and adds it to the end of replicated embedded object list<br>
   * <i>This method should not be called by user</i>
   */
  protected Storing instantiate_storingStations_xjal( final int index ) {
    Storing _result_xjal = new Storing( getEngine(), this, storingStations );
    
    storingStations._add( _result_xjal );

    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_storingStations_xjal( final Storing self, final int index, TableInput _t ) {
    self.rack = 
getStorageUnit( ItemType.values()[ index ] ).rack 
;
    self.asrsResource = 
getStorageUnit( ItemType.values()[ index ] ).asrs 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_storingStations_xjal( Storing self, final int index, TableInput _t ) {
    self.setEnvironment( this );

    // Port connections
    // connector31:
    atStore.in.connect( self.out );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected StorageUnit instantiate_foodStorageUnit_xjal() {
    StorageUnit _result_xjal = new StorageUnit( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_foodStorageUnit_xjal( final StorageUnit self, TableInput _t ) {
    self.rack = 
foodRack 
;
    self.infeedingConveyor = 
toFoodRack 
;
    self.pickingInLine = 
foodPickInLine 
;
    self.pickupStation = 
foodPickupStation 
;
    self.asrs = 
asrs1 
;
    self.infeedingBlocker = 
foodMergePoint 
;
    self.pickupEntryLine = 
toFoodPick 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_foodStorageUnit_xjal( StorageUnit self, TableInput _t ) {
    self.setEnvironment( this );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected StorageUnit instantiate_beverageStorageUnit_xjal() {
    StorageUnit _result_xjal = new StorageUnit( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_beverageStorageUnit_xjal( final StorageUnit self, TableInput _t ) {
    self.rack = 
beverageRack 
;
    self.infeedingConveyor = 
toBeverageRack 
;
    self.pickingInLine = 
beveragePickInLine 
;
    self.pickupStation = 
beveragePickupStation 
;
    self.asrs = 
asrs2 
;
    self.infeedingBlocker = 
beverageDishMergePoint 
;
    self.pickupEntryLine = 
toBeveragePick 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_beverageStorageUnit_xjal( StorageUnit self, TableInput _t ) {
    self.setEnvironment( this );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected StorageUnit instantiate_dishStorageUnit_xjal() {
    StorageUnit _result_xjal = new StorageUnit( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_dishStorageUnit_xjal( final StorageUnit self, TableInput _t ) {
    self.rack = 
dishRack 
;
    self.infeedingConveyor = 
toDishRack 
;
    self.pickingInLine = 
dishPickInLine 
;
    self.pickupStation = 
dishPickupStation 
;
    self.asrs = 
asrs3 
;
    self.infeedingBlocker = 
beverageDishMergePoint 
;
    self.pickupEntryLine = 
toDishPick 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_dishStorageUnit_xjal( StorageUnit self, TableInput _t ) {
    self.setEnvironment( this );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.ResourcePool<Worker> instantiate_packager1_xjal() {
    com.anylogic.libraries.processmodeling.ResourcePool<Worker> _result_xjal = new com.anylogic.libraries.processmodeling.ResourcePool<Worker>( getEngine(), this, null ) {
      @Override
      public Agent newUnit(  ) {
        return _packager1_newUnit_xjal( this );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_packager1_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Worker> self, TableInput _t ) {
    self.type = self._type_DefaultValue_xjal();
    self.capacityDefinitionType = self._capacityDefinitionType_DefaultValue_xjal();
    self.capacity = self._capacity_DefaultValue_xjal();
    self.capacityBasedOnAttractors = self._capacityBasedOnAttractors_DefaultValue_xjal();
    self.capacitySchedule = self._capacitySchedule_DefaultValue_xjal();
    self.capacityScheduleOnOff = self._capacityScheduleOnOff_DefaultValue_xjal();
    self.shiftGroupSchedules = self._shiftGroupSchedules_DefaultValue_xjal();
    self.shiftGroupSizes = self._shiftGroupSizes_DefaultValue_xjal();
    self.shiftGroupsPlan = self._shiftGroupsPlan_DefaultValue_xjal();
    self.destroyExcessUnits = self._destroyExcessUnits_DefaultValue_xjal();
    self.speed = self._speed_DefaultValue_xjal();
    self.homeNodes = new INode[]
{ packager1Home } 
;
    self.showDefaultAnimationStatic = self._showDefaultAnimationStatic_DefaultValue_xjal();
    self.downtimeSource = self._downtimeSource_DefaultValue_xjal();
    self.downtimeList = self._downtimeList_DefaultValue_xjal();
    self.enableMaintenance = self._enableMaintenance_DefaultValue_xjal();
    self.maintenanceType = self._maintenanceType_DefaultValue_xjal();
    self.enableFailuresRepairs = self._enableFailuresRepairs_DefaultValue_xjal();
    self.countBusyOnlyTimeToFailure = self._countBusyOnlyTimeToFailure_DefaultValue_xjal();
    self.repairType = self._repairType_DefaultValue_xjal();
    self.enableBreaks = self._enableBreaks_DefaultValue_xjal();
    self.breaksSchedule = self._breaksSchedule_DefaultValue_xjal();
    self.enableCustomTasks = self._enableCustomTasks_DefaultValue_xjal();
    self.customTasks = self._customTasks_DefaultValue_xjal();
    self.customizeRequestChoice = self._customizeRequestChoice_DefaultValue_xjal();
    self.addToCustomPopulation = self._addToCustomPopulation_DefaultValue_xjal();
    self.forceStatisticsCollection = self._forceStatisticsCollection_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_packager1_xjal( com.anylogic.libraries.processmodeling.ResourcePool<Worker> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.ResourcePool<Worker> instantiate_packager2_xjal() {
    com.anylogic.libraries.processmodeling.ResourcePool<Worker> _result_xjal = new com.anylogic.libraries.processmodeling.ResourcePool<Worker>( getEngine(), this, null ) {
      @Override
      public Agent newUnit(  ) {
        return _packager2_newUnit_xjal( this );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_packager2_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Worker> self, TableInput _t ) {
    self.type = self._type_DefaultValue_xjal();
    self.capacityDefinitionType = self._capacityDefinitionType_DefaultValue_xjal();
    self.capacity = self._capacity_DefaultValue_xjal();
    self.capacityBasedOnAttractors = self._capacityBasedOnAttractors_DefaultValue_xjal();
    self.capacitySchedule = self._capacitySchedule_DefaultValue_xjal();
    self.capacityScheduleOnOff = self._capacityScheduleOnOff_DefaultValue_xjal();
    self.shiftGroupSchedules = self._shiftGroupSchedules_DefaultValue_xjal();
    self.shiftGroupSizes = self._shiftGroupSizes_DefaultValue_xjal();
    self.shiftGroupsPlan = self._shiftGroupsPlan_DefaultValue_xjal();
    self.destroyExcessUnits = self._destroyExcessUnits_DefaultValue_xjal();
    self.speed = self._speed_DefaultValue_xjal();
    self.homeNodes = new INode[]
{ packager2Home } 
;
    self.showDefaultAnimationStatic = self._showDefaultAnimationStatic_DefaultValue_xjal();
    self.downtimeSource = self._downtimeSource_DefaultValue_xjal();
    self.downtimeList = self._downtimeList_DefaultValue_xjal();
    self.enableMaintenance = self._enableMaintenance_DefaultValue_xjal();
    self.maintenanceType = self._maintenanceType_DefaultValue_xjal();
    self.enableFailuresRepairs = self._enableFailuresRepairs_DefaultValue_xjal();
    self.countBusyOnlyTimeToFailure = self._countBusyOnlyTimeToFailure_DefaultValue_xjal();
    self.repairType = self._repairType_DefaultValue_xjal();
    self.enableBreaks = self._enableBreaks_DefaultValue_xjal();
    self.breaksSchedule = self._breaksSchedule_DefaultValue_xjal();
    self.enableCustomTasks = self._enableCustomTasks_DefaultValue_xjal();
    self.customTasks = self._customTasks_DefaultValue_xjal();
    self.customizeRequestChoice = self._customizeRequestChoice_DefaultValue_xjal();
    self.addToCustomPopulation = self._addToCustomPopulation_DefaultValue_xjal();
    self.forceStatisticsCollection = self._forceStatisticsCollection_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_packager2_xjal( com.anylogic.libraries.processmodeling.ResourcePool<Worker> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.ResourcePool<Worker> instantiate_packager3_xjal() {
    com.anylogic.libraries.processmodeling.ResourcePool<Worker> _result_xjal = new com.anylogic.libraries.processmodeling.ResourcePool<Worker>( getEngine(), this, null ) {
      @Override
      public Agent newUnit(  ) {
        return _packager3_newUnit_xjal( this );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_packager3_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Worker> self, TableInput _t ) {
    self.type = self._type_DefaultValue_xjal();
    self.capacityDefinitionType = self._capacityDefinitionType_DefaultValue_xjal();
    self.capacity = self._capacity_DefaultValue_xjal();
    self.capacityBasedOnAttractors = self._capacityBasedOnAttractors_DefaultValue_xjal();
    self.capacitySchedule = self._capacitySchedule_DefaultValue_xjal();
    self.capacityScheduleOnOff = self._capacityScheduleOnOff_DefaultValue_xjal();
    self.shiftGroupSchedules = self._shiftGroupSchedules_DefaultValue_xjal();
    self.shiftGroupSizes = self._shiftGroupSizes_DefaultValue_xjal();
    self.shiftGroupsPlan = self._shiftGroupsPlan_DefaultValue_xjal();
    self.destroyExcessUnits = self._destroyExcessUnits_DefaultValue_xjal();
    self.speed = self._speed_DefaultValue_xjal();
    self.homeNodes = new INode[]
{ packager3Home } 
;
    self.showDefaultAnimationStatic = self._showDefaultAnimationStatic_DefaultValue_xjal();
    self.downtimeSource = self._downtimeSource_DefaultValue_xjal();
    self.downtimeList = self._downtimeList_DefaultValue_xjal();
    self.enableMaintenance = self._enableMaintenance_DefaultValue_xjal();
    self.maintenanceType = self._maintenanceType_DefaultValue_xjal();
    self.enableFailuresRepairs = self._enableFailuresRepairs_DefaultValue_xjal();
    self.countBusyOnlyTimeToFailure = self._countBusyOnlyTimeToFailure_DefaultValue_xjal();
    self.repairType = self._repairType_DefaultValue_xjal();
    self.enableBreaks = self._enableBreaks_DefaultValue_xjal();
    self.breaksSchedule = self._breaksSchedule_DefaultValue_xjal();
    self.enableCustomTasks = self._enableCustomTasks_DefaultValue_xjal();
    self.customTasks = self._customTasks_DefaultValue_xjal();
    self.customizeRequestChoice = self._customizeRequestChoice_DefaultValue_xjal();
    self.addToCustomPopulation = self._addToCustomPopulation_DefaultValue_xjal();
    self.forceStatisticsCollection = self._forceStatisticsCollection_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_packager3_xjal( com.anylogic.libraries.processmodeling.ResourcePool<Worker> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.Convey<Carton> instantiate_toPickingLine_xjal() {
    com.anylogic.libraries.material_handling.Convey<Carton> _result_xjal = new com.anylogic.libraries.material_handling.Convey<Carton>( getEngine(), this, null ) {
      @Override
      public ConveyorPath targetConveyor( Carton agent ) {
        return _toPickingLine_targetConveyor_xjal( this, agent );
      }
      @Override
      public void onEnter( Carton agent ) {
        _toPickingLine_onEnter_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_toPickingLine_xjal( final com.anylogic.libraries.material_handling.Convey<Carton> self, TableInput _t ) {
    self.sourceType = 
self.SOURCE_CURRENT_POSITION 
;
    self.targetType = self._targetType_DefaultValue_xjal();
    self.routeIs = self._routeIs_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_toPickingLine_xjal( com.anylogic.libraries.material_handling.Convey<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.Convey<Carton> instantiate_conveytoWorkzone_xjal() {
    com.anylogic.libraries.material_handling.Convey<Carton> _result_xjal = new com.anylogic.libraries.material_handling.Convey<Carton>( getEngine(), this, null ) {
      @Override
      public ConveyorPath targetConveyor( Carton agent ) {
        return _conveytoWorkzone_targetConveyor_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_conveytoWorkzone_xjal( final com.anylogic.libraries.material_handling.Convey<Carton> self, TableInput _t ) {
    self.sourceType = 
self.SOURCE_CURRENT_POSITION 
;
    self.targetType = self._targetType_DefaultValue_xjal();
    self.routeIs = self._routeIs_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_conveytoWorkzone_xjal( com.anylogic.libraries.material_handling.Convey<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.SelectOutput5<Carton> instantiate_canEnterLine_xjal() {
    com.anylogic.libraries.processmodeling.SelectOutput5<Carton> _result_xjal = new com.anylogic.libraries.processmodeling.SelectOutput5<Carton>( getEngine(), this, null ) {
      @Override
      public boolean condition1( Carton agent ) {
        return _canEnterLine_condition1_xjal( this, agent );
      }
      @Override
      public boolean condition2( Carton agent ) {
        return _canEnterLine_condition2_xjal( this, agent );
      }
      @Override
      public boolean condition3( Carton agent ) {
        return _canEnterLine_condition3_xjal( this, agent );
      }
      @Override
      public boolean condition4( Carton agent ) {
        return _canEnterLine_condition4_xjal( this, agent );
      }
      @Override
      public void onExit2( Carton agent ) {
        _canEnterLine_onExit2_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_canEnterLine_xjal( final com.anylogic.libraries.processmodeling.SelectOutput5<Carton> self, TableInput _t ) {
    self.type = 
self.TYPE_CONDITIONS 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_canEnterLine_xjal( com.anylogic.libraries.processmodeling.SelectOutput5<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.Convey<Carton> instantiate_convey_xjal() {
    com.anylogic.libraries.material_handling.Convey<Carton> _result_xjal = new com.anylogic.libraries.material_handling.Convey<Carton>( getEngine(), this, null ) {
      @Override
      public ConveyorPath targetConveyor( Carton agent ) {
        return _convey_targetConveyor_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_convey_xjal( final com.anylogic.libraries.material_handling.Convey<Carton> self, TableInput _t ) {
    self.sourceType = 
self.SOURCE_CURRENT_POSITION 
;
    self.targetType = self._targetType_DefaultValue_xjal();
    self.routeIs = self._routeIs_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_convey_xjal( com.anylogic.libraries.material_handling.Convey<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.TransporterFleet<Forklift> instantiate_forklifts_xjal() {
    com.anylogic.libraries.material_handling.TransporterFleet<Forklift> _result_xjal = new com.anylogic.libraries.material_handling.TransporterFleet<Forklift>( getEngine(), this, null ) {
      @Override
      public Agent newTransporter(  ) {
        return _forklifts_newTransporter_xjal( this );
      }
      @Override
      public boolean setDimensions( Forklift unit ) {
        return _forklifts_setDimensions_xjal( this, unit );
      }
      @Override
      public double height( Forklift unit ) {
        return _forklifts_height_xjal( this, unit );
      }

      @AnyLogicInternalCodegenAPI
      public LengthUnits getUnitsForCodeOf_height() {
        return METER;
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_forklifts_xjal( final com.anylogic.libraries.material_handling.TransporterFleet<Forklift> self, TableInput _t ) {
    self.navigationType = self._navigationType_DefaultValue_xjal();
    self.recognizeAllTransporters = self._recognizeAllTransporters_DefaultValue_xjal();
    self.capacityDefinitionType = self._capacityDefinitionType_DefaultValue_xjal();
    self.capacity = 
2 
;
    self.capacitySchedule = self._capacitySchedule_DefaultValue_xjal();
    self.homeNodes = new Node[]
{ forkliftsHome } 
;
    self.turnRadius = self._turnRadius_DefaultValue_xjal();
    self.minDistanceToObstacle = self._minDistanceToObstacle_DefaultValue_xjal();
    self.isSpeedLimitedNearObstacle = self._isSpeedLimitedNearObstacle_DefaultValue_xjal();
    self.delayToResumeMovement = self._delayToResumeMovement_DefaultValue_xjal();
    self.customRouting = self._customRouting_DefaultValue_xjal();
    self.addToCustomPopulation = self._addToCustomPopulation_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_forklifts_xjal( com.anylogic.libraries.material_handling.TransporterFleet<Forklift> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> instantiate_moveToDock_xjal() {
    com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> _result_xjal = new com.anylogic.libraries.material_handling.MoveByTransporter<Pallet>( getEngine(), this, null ) {
      @Override
      public Node destinationNode( Pallet agent, Agent unit ) {
        return _moveToDock_destinationNode_xjal( this, agent, unit );
      }
      @Override
      public com.anylogic.libraries.material_handling.TransporterFleet fleet( Pallet agent ) {
        return _moveToDock_fleet_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.material_handling.ReleaseTransporter.TransporterReleaseMovingPolicy releaseMovingPolicy( Agent unit ) {
        return _moveToDock_releaseMovingPolicy_xjal( this, unit );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_moveToDock_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, TableInput _t ) {
    self.destinationType = self._destinationType_DefaultValue_xjal();
    self.seizeTransporter = self._seizeTransporter_DefaultValue_xjal();
    self.seizeDestinationType = self._seizeDestinationType_DefaultValue_xjal();
    self.customizeTransporterChoice = self._customizeTransporterChoice_DefaultValue_xjal();
    self.dispatchingPolicy = self._dispatchingPolicy_DefaultValue_xjal();
    self.canceledDestinationType = self._canceledDestinationType_DefaultValue_xjal();
    self.releaseTransporter = self._releaseTransporter_DefaultValue_xjal();
    self.releaseDestinationType = self._releaseDestinationType_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_moveToDock_xjal( com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Item> instantiate__turntable_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Item> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Item>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__turntable_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Item> _self, TableInput _t ) {
    ConveyorTurntable<Item> self = turntable;
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.rotationSpeed = _self._rotationSpeed_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__turntable_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Item> instantiate__foodMergePoint_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Item> _result_xjal = new com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Item>( getEngine(), this, null ) {
      @Override
      public void onTrailingEdgeExit( Item agent ) {
        __foodMergePoint_controller_xjal_onTrailingEdgeExit_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__foodMergePoint_controller_xjal_xjal( final com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Item> _self, TableInput _t ) {
    PositionOnConveyor<Item> self = foodMergePoint;
    _self.initiallyBlocked = _self._initiallyBlocked_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__foodMergePoint_controller_xjal_xjal( com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> instantiate__infeedLineFood_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__infeedLineFood_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> _self, TableInput _t ) {
    ConveyorPath<Item> self = infeedLineFood;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__infeedLineFood_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> instantiate__infeedMergeConveyor_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__infeedMergeConveyor_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> _self, TableInput _t ) {
    ConveyorPath<Item> self = infeedMergeConveyor;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__infeedMergeConveyor_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Item> instantiate__turntable1_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Item> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Item>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__turntable1_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Item> _self, TableInput _t ) {
    ConveyorTurntable<Item> self = turntable1;
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.rotationSpeed = _self._rotationSpeed_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__turntable1_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Item> instantiate__turntable2_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Item> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Item>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__turntable2_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Item> _self, TableInput _t ) {
    ConveyorTurntable<Item> self = turntable2;
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.rotationSpeed = _self._rotationSpeed_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__turntable2_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> instantiate__mergeToFoodRack_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__mergeToFoodRack_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> _self, TableInput _t ) {
    ConveyorPath<Item> self = mergeToFoodRack;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__mergeToFoodRack_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> instantiate__toFoodRack_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__toFoodRack_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> _self, TableInput _t ) {
    ConveyorPath<Item> self = toFoodRack;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__toFoodRack_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> instantiate__mergeToBeverageRack_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__mergeToBeverageRack_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> _self, TableInput _t ) {
    ConveyorPath<Item> self = mergeToBeverageRack;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__mergeToBeverageRack_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> instantiate__toDishRack_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__toDishRack_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> _self, TableInput _t ) {
    ConveyorPath<Item> self = toDishRack;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__toDishRack_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Item> instantiate__turntable3_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Item> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Item>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__turntable3_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Item> _self, TableInput _t ) {
    ConveyorTurntable<Item> self = turntable3;
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.rotationSpeed = _self._rotationSpeed_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__turntable3_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> instantiate__toBeverageRack_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__toBeverageRack_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> _self, TableInput _t ) {
    ConveyorPath<Item> self = toBeverageRack;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__toBeverageRack_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Item> instantiate__beverageDishMergePoint_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Item> _result_xjal = new com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Item>( getEngine(), this, null ) {
      @Override
      public void onTrailingEdgeExit( Item agent ) {
        __beverageDishMergePoint_controller_xjal_onTrailingEdgeExit_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__beverageDishMergePoint_controller_xjal_xjal( final com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Item> _self, TableInput _t ) {
    PositionOnConveyor<Item> self = beverageDishMergePoint;
    _self.initiallyBlocked = _self._initiallyBlocked_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__beverageDishMergePoint_controller_xjal_xjal( com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> instantiate__beveragesAndDishesLine1_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__beveragesAndDishesLine1_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> _self, TableInput _t ) {
    ConveyorPath<Item> self = beveragesAndDishesLine1;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__beveragesAndDishesLine1_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> instantiate__beveragesAndDishesLine_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__beveragesAndDishesLine_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> _self, TableInput _t ) {
    ConveyorPath<Item> self = beveragesAndDishesLine;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__beveragesAndDishesLine_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__foodPickInLine_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__foodPickInLine_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = foodPickInLine;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__foodPickInLine_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> instantiate__transferTable6_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__transferTable6_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _self, TableInput _t ) {
    ConveyorTransferTable<Carton> self = transferTable6;
    _self.takeSpeedOfConnectedConveyors = _self._takeSpeedOfConnectedConveyors_DefaultValue_xjal();
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.switchingDelay = _self._switchingDelay_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__transferTable6_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__conveyor18_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__conveyor18_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = conveyor18;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__conveyor18_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> instantiate__labelingStation_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton>( getEngine(), this, null ) {
      @Override
      public double processTime( Carton agent, List<Carton> allAgents ) {
        return __labelingStation_controller_xjal_processTime_xjal( this, agent, allAgents );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_processTime() {
        return SECOND;
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__labelingStation_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> _self, TableInput _t ) {
    ConveyorSimpleStation<Carton> self = labelingStation;
    _self.delayType = _self._delayType_DefaultValue_xjal();
    _self.capacity = _self._capacity_DefaultValue_xjal();
    _self.processingMode = _self._processingMode_DefaultValue_xjal();
    _self.loadingMode = 
SIMPLE_STATION_LOADING_MODE_SIMULTANEOUS_WITH_UNLOADING 
;
    _self.useResources = _self._useResources_DefaultValue_xjal();
    _self.seizeFromOnePool = _self._seizeFromOnePool_DefaultValue_xjal();
    _self.resourceDestinationType = _self._resourceDestinationType_DefaultValue_xjal();
    _self.customizeResourceChoice = _self._customizeResourceChoice_DefaultValue_xjal();
    _self.taskMayPreemptOtherTasks = _self._taskMayPreemptOtherTasks_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__labelingStation_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> instantiate__invoiceStation_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton>( getEngine(), this, null ) {
      @Override
      public double processTime( Carton agent, List<Carton> allAgents ) {
        return __invoiceStation_controller_xjal_processTime_xjal( this, agent, allAgents );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_processTime() {
        return SECOND;
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__invoiceStation_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> _self, TableInput _t ) {
    ConveyorSimpleStation<Carton> self = invoiceStation;
    _self.delayType = _self._delayType_DefaultValue_xjal();
    _self.capacity = _self._capacity_DefaultValue_xjal();
    _self.processingMode = _self._processingMode_DefaultValue_xjal();
    _self.loadingMode = 
SIMPLE_STATION_LOADING_MODE_SIMULTANEOUS_WITH_UNLOADING 
;
    _self.useResources = _self._useResources_DefaultValue_xjal();
    _self.seizeFromOnePool = _self._seizeFromOnePool_DefaultValue_xjal();
    _self.resourceDestinationType = _self._resourceDestinationType_DefaultValue_xjal();
    _self.customizeResourceChoice = _self._customizeResourceChoice_DefaultValue_xjal();
    _self.taskMayPreemptOtherTasks = _self._taskMayPreemptOtherTasks_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__invoiceStation_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__cartonInitialLine_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__cartonInitialLine_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = cartonInitialLine;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__cartonInitialLine_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__foodPickOutLine_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__foodPickOutLine_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = foodPickOutLine;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__foodPickOutLine_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__toBeveragePick_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__toBeveragePick_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = toBeveragePick;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__toBeveragePick_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> instantiate__transferTable7_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__transferTable7_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _self, TableInput _t ) {
    ConveyorTransferTable<Carton> self = transferTable7;
    _self.takeSpeedOfConnectedConveyors = _self._takeSpeedOfConnectedConveyors_DefaultValue_xjal();
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.switchingDelay = _self._switchingDelay_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__transferTable7_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> instantiate__transferTable8_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__transferTable8_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _self, TableInput _t ) {
    ConveyorTransferTable<Carton> self = transferTable8;
    _self.takeSpeedOfConnectedConveyors = _self._takeSpeedOfConnectedConveyors_DefaultValue_xjal();
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.switchingDelay = _self._switchingDelay_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__transferTable8_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__beveragePickInLine_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__beveragePickInLine_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = beveragePickInLine;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__beveragePickInLine_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__conveyor22_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__conveyor22_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = conveyor22;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__conveyor22_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> instantiate__transferTable9_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__transferTable9_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _self, TableInput _t ) {
    ConveyorTransferTable<Carton> self = transferTable9;
    _self.takeSpeedOfConnectedConveyors = _self._takeSpeedOfConnectedConveyors_DefaultValue_xjal();
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.switchingDelay = _self._switchingDelay_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__transferTable9_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__beveragePickOutLine_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__beveragePickOutLine_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = beveragePickOutLine;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__beveragePickOutLine_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__toDishPick_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__toDishPick_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = toDishPick;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__toDishPick_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__dishPickInLine_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__dishPickInLine_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = dishPickInLine;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__dishPickInLine_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__conveyor26_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__conveyor26_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = conveyor26;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__conveyor26_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> instantiate__transferTable10_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__transferTable10_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _self, TableInput _t ) {
    ConveyorTransferTable<Carton> self = transferTable10;
    _self.takeSpeedOfConnectedConveyors = _self._takeSpeedOfConnectedConveyors_DefaultValue_xjal();
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.switchingDelay = _self._switchingDelay_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__transferTable10_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> instantiate__transferTable11_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__transferTable11_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _self, TableInput _t ) {
    ConveyorTransferTable<Carton> self = transferTable11;
    _self.takeSpeedOfConnectedConveyors = _self._takeSpeedOfConnectedConveyors_DefaultValue_xjal();
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.switchingDelay = _self._switchingDelay_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__transferTable11_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> instantiate__checkOrderStation_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton>( getEngine(), this, null ) {
      @Override
      public double processTime( Carton agent, List<Carton> allAgents ) {
        return __checkOrderStation_controller_xjal_processTime_xjal( this, agent, allAgents );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_processTime() {
        return SECOND;
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__checkOrderStation_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> _self, TableInput _t ) {
    ConveyorSimpleStation<Carton> self = checkOrderStation;
    _self.delayType = _self._delayType_DefaultValue_xjal();
    _self.capacity = _self._capacity_DefaultValue_xjal();
    _self.processingMode = _self._processingMode_DefaultValue_xjal();
    _self.loadingMode = 
SIMPLE_STATION_LOADING_MODE_SIMULTANEOUS_WITH_UNLOADING 
;
    _self.useResources = _self._useResources_DefaultValue_xjal();
    _self.seizeFromOnePool = _self._seizeFromOnePool_DefaultValue_xjal();
    _self.resourceDestinationType = _self._resourceDestinationType_DefaultValue_xjal();
    _self.customizeResourceChoice = _self._customizeResourceChoice_DefaultValue_xjal();
    _self.taskMayPreemptOtherTasks = _self._taskMayPreemptOtherTasks_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__checkOrderStation_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__conveyor28_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__conveyor28_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = conveyor28;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__conveyor28_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__dishPickOutLine_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__dishPickOutLine_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = dishPickOutLine;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__dishPickOutLine_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__returnToPickingLine_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__returnToPickingLine_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = returnToPickingLine;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__returnToPickingLine_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> instantiate__transferTable13_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__transferTable13_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _self, TableInput _t ) {
    ConveyorTransferTable<Carton> self = transferTable13;
    _self.takeSpeedOfConnectedConveyors = _self._takeSpeedOfConnectedConveyors_DefaultValue_xjal();
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.switchingDelay = _self._switchingDelay_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__transferTable13_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Carton> instantiate__pickingLinesStart_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__pickingLinesStart_controller_xjal_xjal( final com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Carton> _self, TableInput _t ) {
    PositionOnConveyor<Carton> self = pickingLinesStart;
    _self.initiallyBlocked = _self._initiallyBlocked_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__pickingLinesStart_controller_xjal_xjal( com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__toFoodPick_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__toFoodPick_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = toFoodPick;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__toFoodPick_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__conveyor30_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__conveyor30_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = conveyor30;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__conveyor30_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> instantiate__transferTable12_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__transferTable12_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _self, TableInput _t ) {
    ConveyorTransferTable<Carton> self = transferTable12;
    _self.takeSpeedOfConnectedConveyors = _self._takeSpeedOfConnectedConveyors_DefaultValue_xjal();
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.switchingDelay = _self._switchingDelay_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__transferTable12_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__conveyor32_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__conveyor32_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = conveyor32;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__conveyor32_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Carton> instantiate__turntable4_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__turntable4_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Carton> _self, TableInput _t ) {
    ConveyorTurntable<Carton> self = turntable4;
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.rotationSpeed = _self._rotationSpeed_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__turntable4_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__conveyor34_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__conveyor34_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = conveyor34;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__conveyor34_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Carton> instantiate__turntable5_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__turntable5_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Carton> _self, TableInput _t ) {
    ConveyorTurntable<Carton> self = turntable5;
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.rotationSpeed = _self._rotationSpeed_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__turntable5_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__conveyor35_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__conveyor35_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = conveyor35;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__conveyor35_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Carton> instantiate__turntable6_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__turntable6_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Carton> _self, TableInput _t ) {
    ConveyorTurntable<Carton> self = turntable6;
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.rotationSpeed = _self._rotationSpeed_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__turntable6_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> instantiate__station_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton>( getEngine(), this, null ) {
      @Override
      public double processTime( Carton agent, List<Carton> allAgents ) {
        return __station_controller_xjal_processTime_xjal( this, agent, allAgents );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_processTime() {
        return SECOND;
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool resourcePool( Carton agent, List<Carton> allAgents ) {
        return __station_controller_xjal_resourcePool_xjal( this, agent, allAgents );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__station_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> _self, TableInput _t ) {
    ConveyorSimpleStation<Carton> self = station;
    _self.delayType = _self._delayType_DefaultValue_xjal();
    _self.capacity = _self._capacity_DefaultValue_xjal();
    _self.processingMode = _self._processingMode_DefaultValue_xjal();
    _self.loadingMode = 
SIMPLE_STATION_LOADING_MODE_SIMULTANEOUS_WITH_UNLOADING 
;
    _self.useResources = 
true 
;
    _self.seizeFromOnePool = 
true 
;
    _self.resourceDestinationType = _self._resourceDestinationType_DefaultValue_xjal();
    _self.customizeResourceChoice = _self._customizeResourceChoice_DefaultValue_xjal();
    _self.taskMayPreemptOtherTasks = _self._taskMayPreemptOtherTasks_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__station_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__packagingLine1_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__packagingLine1_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = packagingLine1;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__packagingLine1_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> instantiate__station1_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton>( getEngine(), this, null ) {
      @Override
      public double processTime( Carton agent, List<Carton> allAgents ) {
        return __station1_controller_xjal_processTime_xjal( this, agent, allAgents );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_processTime() {
        return SECOND;
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool resourcePool( Carton agent, List<Carton> allAgents ) {
        return __station1_controller_xjal_resourcePool_xjal( this, agent, allAgents );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__station1_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> _self, TableInput _t ) {
    ConveyorSimpleStation<Carton> self = station1;
    _self.delayType = _self._delayType_DefaultValue_xjal();
    _self.capacity = _self._capacity_DefaultValue_xjal();
    _self.processingMode = _self._processingMode_DefaultValue_xjal();
    _self.loadingMode = 
SIMPLE_STATION_LOADING_MODE_SIMULTANEOUS_WITH_UNLOADING 
;
    _self.useResources = 
true 
;
    _self.seizeFromOnePool = 
true 
;
    _self.resourceDestinationType = _self._resourceDestinationType_DefaultValue_xjal();
    _self.customizeResourceChoice = _self._customizeResourceChoice_DefaultValue_xjal();
    _self.taskMayPreemptOtherTasks = _self._taskMayPreemptOtherTasks_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__station1_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__packagingLine2_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__packagingLine2_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = packagingLine2;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__packagingLine2_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> instantiate__station2_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton>( getEngine(), this, null ) {
      @Override
      public double processTime( Carton agent, List<Carton> allAgents ) {
        return __station2_controller_xjal_processTime_xjal( this, agent, allAgents );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_processTime() {
        return SECOND;
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool resourcePool( Carton agent, List<Carton> allAgents ) {
        return __station2_controller_xjal_resourcePool_xjal( this, agent, allAgents );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__station2_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> _self, TableInput _t ) {
    ConveyorSimpleStation<Carton> self = station2;
    _self.delayType = _self._delayType_DefaultValue_xjal();
    _self.capacity = _self._capacity_DefaultValue_xjal();
    _self.processingMode = _self._processingMode_DefaultValue_xjal();
    _self.loadingMode = 
SIMPLE_STATION_LOADING_MODE_SIMULTANEOUS_WITH_UNLOADING 
;
    _self.useResources = 
true 
;
    _self.seizeFromOnePool = 
true 
;
    _self.resourceDestinationType = _self._resourceDestinationType_DefaultValue_xjal();
    _self.customizeResourceChoice = _self._customizeResourceChoice_DefaultValue_xjal();
    _self.taskMayPreemptOtherTasks = _self._taskMayPreemptOtherTasks_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__station2_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__packagingLine3_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__packagingLine3_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = packagingLine3;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__packagingLine3_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__conveyor33_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__conveyor33_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = conveyor33;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__conveyor33_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__conveyor39_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__conveyor39_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = conveyor39;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__conveyor39_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Carton> instantiate__turntable7_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__turntable7_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Carton> _self, TableInput _t ) {
    ConveyorTurntable<Carton> self = turntable7;
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.rotationSpeed = _self._rotationSpeed_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__turntable7_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__conveyor40_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__conveyor40_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = conveyor40;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__conveyor40_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Carton> instantiate__turntable8_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__turntable8_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Carton> _self, TableInput _t ) {
    ConveyorTurntable<Carton> self = turntable8;
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.rotationSpeed = _self._rotationSpeed_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__turntable8_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Carton> instantiate__turntable9_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__turntable9_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Carton> _self, TableInput _t ) {
    ConveyorTurntable<Carton> self = turntable9;
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.rotationSpeed = _self._rotationSpeed_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__turntable9_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> instantiate__shippingLabelingStation_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton>( getEngine(), this, null ) {
      @Override
      public double processTime( Carton agent, List<Carton> allAgents ) {
        return __shippingLabelingStation_controller_xjal_processTime_xjal( this, agent, allAgents );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_processTime() {
        return SECOND;
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__shippingLabelingStation_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> _self, TableInput _t ) {
    ConveyorSimpleStation<Carton> self = shippingLabelingStation;
    _self.delayType = _self._delayType_DefaultValue_xjal();
    _self.capacity = _self._capacity_DefaultValue_xjal();
    _self.processingMode = _self._processingMode_DefaultValue_xjal();
    _self.loadingMode = 
SIMPLE_STATION_LOADING_MODE_SIMULTANEOUS_WITH_UNLOADING 
;
    _self.useResources = _self._useResources_DefaultValue_xjal();
    _self.seizeFromOnePool = _self._seizeFromOnePool_DefaultValue_xjal();
    _self.resourceDestinationType = _self._resourceDestinationType_DefaultValue_xjal();
    _self.customizeResourceChoice = _self._customizeResourceChoice_DefaultValue_xjal();
    _self.taskMayPreemptOtherTasks = _self._taskMayPreemptOtherTasks_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__shippingLabelingStation_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Carton> instantiate__scanner_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__scanner_controller_xjal_xjal( final com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Carton> _self, TableInput _t ) {
    PositionOnConveyor<Carton> self = scanner;
    _self.initiallyBlocked = _self._initiallyBlocked_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__scanner_controller_xjal_xjal( com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__toSorter_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__toSorter_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = toSorter;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__toSorter_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> instantiate__transferTable14_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__transferTable14_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _self, TableInput _t ) {
    ConveyorTransferTable<Carton> self = transferTable14;
    _self.takeSpeedOfConnectedConveyors = _self._takeSpeedOfConnectedConveyors_DefaultValue_xjal();
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.switchingDelay = _self._switchingDelay_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__transferTable14_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__conveyor43_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__conveyor43_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = conveyor43;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__conveyor43_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__exitLine1_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__exitLine1_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = exitLine1;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__exitLine1_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> instantiate__transferTable15_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__transferTable15_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _self, TableInput _t ) {
    ConveyorTransferTable<Carton> self = transferTable15;
    _self.takeSpeedOfConnectedConveyors = _self._takeSpeedOfConnectedConveyors_DefaultValue_xjal();
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.switchingDelay = _self._switchingDelay_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__transferTable15_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__conveyor45_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__conveyor45_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = conveyor45;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__conveyor45_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> instantiate__transferTable16_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__transferTable16_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _self, TableInput _t ) {
    ConveyorTransferTable<Carton> self = transferTable16;
    _self.takeSpeedOfConnectedConveyors = _self._takeSpeedOfConnectedConveyors_DefaultValue_xjal();
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.switchingDelay = _self._switchingDelay_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__transferTable16_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__exitLine2_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__exitLine2_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = exitLine2;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__exitLine2_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__conveyor47_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__conveyor47_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = conveyor47;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__conveyor47_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> instantiate__transferTable17_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__transferTable17_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _self, TableInput _t ) {
    ConveyorTransferTable<Carton> self = transferTable17;
    _self.takeSpeedOfConnectedConveyors = _self._takeSpeedOfConnectedConveyors_DefaultValue_xjal();
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.switchingDelay = _self._switchingDelay_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__transferTable17_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> instantiate__transferTable18_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__transferTable18_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _self, TableInput _t ) {
    ConveyorTransferTable<Carton> self = transferTable18;
    _self.takeSpeedOfConnectedConveyors = _self._takeSpeedOfConnectedConveyors_DefaultValue_xjal();
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.switchingDelay = _self._switchingDelay_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__transferTable18_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Carton> instantiate__recirculationLine_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__recirculationLine_controller_xjal_xjal( final com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Carton> _self, TableInput _t ) {
    PositionOnConveyor<Carton> self = recirculationLine;
    _self.initiallyBlocked = _self._initiallyBlocked_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__recirculationLine_controller_xjal_xjal( com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__conveyor49_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__conveyor49_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = conveyor49;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__conveyor49_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> instantiate__transferTable1_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__transferTable1_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _self, TableInput _t ) {
    ConveyorTransferTable<Carton> self = transferTable1;
    _self.takeSpeedOfConnectedConveyors = _self._takeSpeedOfConnectedConveyors_DefaultValue_xjal();
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.switchingDelay = _self._switchingDelay_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__transferTable1_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> instantiate__transferTable_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__transferTable_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _self, TableInput _t ) {
    ConveyorTransferTable<Carton> self = transferTable;
    _self.takeSpeedOfConnectedConveyors = _self._takeSpeedOfConnectedConveyors_DefaultValue_xjal();
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.switchingDelay = _self._switchingDelay_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__transferTable_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__conveyor_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__conveyor_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = conveyor;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__conveyor_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> instantiate__transferTable5_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__transferTable5_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _self, TableInput _t ) {
    ConveyorTransferTable<Carton> self = transferTable5;
    _self.takeSpeedOfConnectedConveyors = _self._takeSpeedOfConnectedConveyors_DefaultValue_xjal();
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.switchingDelay = _self._switchingDelay_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__transferTable5_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> instantiate__transferTable4_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__transferTable4_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _self, TableInput _t ) {
    ConveyorTransferTable<Carton> self = transferTable4;
    _self.takeSpeedOfConnectedConveyors = _self._takeSpeedOfConnectedConveyors_DefaultValue_xjal();
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.switchingDelay = _self._switchingDelay_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__transferTable4_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__conveyor3_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__conveyor3_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = conveyor3;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__conveyor3_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> instantiate__transferTable19_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__transferTable19_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _self, TableInput _t ) {
    ConveyorTransferTable<Carton> self = transferTable19;
    _self.takeSpeedOfConnectedConveyors = _self._takeSpeedOfConnectedConveyors_DefaultValue_xjal();
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.switchingDelay = _self._switchingDelay_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__transferTable19_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> instantiate__transferTable20_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__transferTable20_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> _self, TableInput _t ) {
    ConveyorTransferTable<Carton> self = transferTable20;
    _self.takeSpeedOfConnectedConveyors = _self._takeSpeedOfConnectedConveyors_DefaultValue_xjal();
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.switchingDelay = _self._switchingDelay_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__transferTable20_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__conveyor4_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__conveyor4_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = conveyor4;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__conveyor4_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Carton> instantiate__packageLinesEntryPoint_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__packageLinesEntryPoint_controller_xjal_xjal( final com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Carton> _self, TableInput _t ) {
    PositionOnConveyor<Carton> self = packageLinesEntryPoint;
    _self.initiallyBlocked = _self._initiallyBlocked_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__packageLinesEntryPoint_controller_xjal_xjal( com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> instantiate__conveyor36_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__conveyor36_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> _self, TableInput _t ) {
    ConveyorPath<Carton> self = conveyor36;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__conveyor36_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTurnStationDescriptor<Carton> instantiate__turnStation_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTurnStationDescriptor<Carton> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTurnStationDescriptor<Carton>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__turnStation_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTurnStationDescriptor<Carton> _self, TableInput _t ) {
    ConveyorTurnStation<Carton> self = turnStation;
    _self.mode = 
TURN_STATION_MODE_ORIENTATION 
;
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.rotationSpeed = _self._rotationSpeed_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__turnStation_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTurnStationDescriptor<Carton> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> instantiate__conveyor8_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__conveyor8_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> _self, TableInput _t ) {
    ConveyorPath<Pallet> self = conveyor8;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__conveyor8_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> instantiate__conveyor2_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__conveyor2_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> _self, TableInput _t ) {
    ConveyorPath<Pallet> self = conveyor2;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__conveyor2_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Pallet> instantiate__turntable11_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Pallet> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Pallet>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__turntable11_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Pallet> _self, TableInput _t ) {
    ConveyorTurntable<Pallet> self = turntable11;
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.rotationSpeed = _self._rotationSpeed_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__turntable11_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Pallet> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> instantiate__conveyor1_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__conveyor1_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> _self, TableInput _t ) {
    ConveyorPath<Pallet> self = conveyor1;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__conveyor1_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> instantiate__conveyor10_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__conveyor10_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> _self, TableInput _t ) {
    ConveyorPath<Pallet> self = conveyor10;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__conveyor10_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Pallet> instantiate__turntable12_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Pallet> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Pallet>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__turntable12_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Pallet> _self, TableInput _t ) {
    ConveyorTurntable<Pallet> self = turntable12;
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.rotationSpeed = _self._rotationSpeed_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__turntable12_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Pallet> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Pallet> instantiate__exitPalletLinePoint_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Pallet> _result_xjal = new com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Pallet>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__exitPalletLinePoint_controller_xjal_xjal( final com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Pallet> _self, TableInput _t ) {
    PositionOnConveyor<Pallet> self = exitPalletLinePoint;
    _self.initiallyBlocked = _self._initiallyBlocked_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__exitPalletLinePoint_controller_xjal_xjal( com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Pallet> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> instantiate__exitPalletLine_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__exitPalletLine_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> _self, TableInput _t ) {
    ConveyorPath<Pallet> self = exitPalletLine;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__exitPalletLine_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> instantiate__conveyor7_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__conveyor7_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> _self, TableInput _t ) {
    ConveyorPath<Pallet> self = conveyor7;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__conveyor7_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Pallet> instantiate__transferTable2_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Pallet> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Pallet>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__transferTable2_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Pallet> _self, TableInput _t ) {
    ConveyorTransferTable<Pallet> self = transferTable2;
    _self.takeSpeedOfConnectedConveyors = _self._takeSpeedOfConnectedConveyors_DefaultValue_xjal();
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.switchingDelay = _self._switchingDelay_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__transferTable2_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Pallet> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Pallet> instantiate__turntable13_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Pallet> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Pallet>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__turntable13_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Pallet> _self, TableInput _t ) {
    ConveyorTurntable<Pallet> self = turntable13;
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.rotationSpeed = _self._rotationSpeed_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__turntable13_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Pallet> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> instantiate__conveyor5_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__conveyor5_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> _self, TableInput _t ) {
    ConveyorPath<Pallet> self = conveyor5;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__conveyor5_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> instantiate__workerPalletLine_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__workerPalletLine_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> _self, TableInput _t ) {
    ConveyorPath<Pallet> self = workerPalletLine;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__workerPalletLine_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Pallet> instantiate__transferTable3_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Pallet> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Pallet>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__transferTable3_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Pallet> _self, TableInput _t ) {
    ConveyorTransferTable<Pallet> self = transferTable3;
    _self.takeSpeedOfConnectedConveyors = _self._takeSpeedOfConnectedConveyors_DefaultValue_xjal();
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.switchingDelay = _self._switchingDelay_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__transferTable3_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTransferTableDescriptor<Pallet> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> instantiate__dishPalletLinePickup_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__dishPalletLinePickup_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> _self, TableInput _t ) {
    ConveyorPath<Pallet> self = dishPalletLinePickup;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__dishPalletLinePickup_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> instantiate__beveragePalletLinePickup_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__beveragePalletLinePickup_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> _self, TableInput _t ) {
    ConveyorPath<Pallet> self = beveragePalletLinePickup;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__beveragePalletLinePickup_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Pallet> instantiate__turntable10_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Pallet> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Pallet>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__turntable10_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Pallet> _self, TableInput _t ) {
    ConveyorTurntable<Pallet> self = turntable10;
    _self.speed = _self._speed_DefaultValue_xjal();
    _self.rotationSpeed = _self._rotationSpeed_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__turntable10_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorTurntableDescriptor<Pallet> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Pallet> instantiate__foodUnloadingPoint_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Pallet> _result_xjal = new com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Pallet>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__foodUnloadingPoint_controller_xjal_xjal( final com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Pallet> _self, TableInput _t ) {
    PositionOnConveyor<Pallet> self = foodUnloadingPoint;
    _self.initiallyBlocked = _self._initiallyBlocked_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__foodUnloadingPoint_controller_xjal_xjal( com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Pallet> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> instantiate__robotPalletLine_controller_xjal_xjal() {
    com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> _result_xjal = new com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet>( getEngine(), this, null );
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters__robotPalletLine_controller_xjal_xjal( final com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> _self, TableInput _t ) {
    ConveyorPath<Pallet> self = robotPalletLine;
    _self.type = _self._type_DefaultValue_xjal();
    _self.reversible = _self._reversible_DefaultValue_xjal();
    _self.maxSpeed = _self._maxSpeed_DefaultValue_xjal();
    _self.initialSpeed = _self._initialSpeed_DefaultValue_xjal();
    _self.acceleration = _self._acceleration_DefaultValue_xjal();
    _self.deceleration = _self._deceleration_DefaultValue_xjal();
    _self.cellSize = _self._cellSize_DefaultValue_xjal();
    _self.gap = _self._gap_DefaultValue_xjal();
    _self.maximumPriority = _self._maximumPriority_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate__robotPalletLine_controller_xjal_xjal( com.anylogic.libraries.material_handling.ConveyorPathDescriptor<Pallet> self, TableInput _t ) {
  }

  private PositionOnConveyor _toRobot_targetPositionOnConveyor_xjal( final com.anylogic.libraries.material_handling.Convey<Pallet> self, Pallet agent ) {
    PositionOnConveyor _value;
    _value = 
foodUnloadingPoint 
;
    return _value;
  }
  private ConveyorPath _palletToExit_targetConveyor_xjal( final com.anylogic.libraries.material_handling.Convey<Pallet> self, Pallet agent ) {
    ConveyorPath _value;
    _value = 
exitPalletLine 
;
    return _value;
  }
  private ConveyorPath _toRack_sourceConveyor_xjal( final com.anylogic.libraries.material_handling.Convey<Item> self, Item agent ) {
    ConveyorPath _value;
    _value = 
agent.type == food ? infeedLineFood : beveragesAndDishesLine 
;
    return _value;
  }
  private double _toRack_sourceOffset_xjal( final com.anylogic.libraries.material_handling.Convey<Item> self, Item agent ) {
    double _value;
    _value = 
agent.type == dish ? 5.0 : 0.0 
;
    return _value;
  }
  private ConveyorPath _toRack_targetConveyor_xjal( final com.anylogic.libraries.material_handling.Convey<Item> self, Item agent ) {
    ConveyorPath _value;
    _value = 
getStorageConveyor( agent ); 
;
    return _value;
  }
  private double _toRack_targetOffset_xjal( final com.anylogic.libraries.material_handling.Convey<Item> self, Item agent ) {
    double _value;
    _value = 
0.0 
;
    return _value;
  }
  private Agent _pickupRobot_newUnit_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<PickupRobotArm> self ) {
    Agent _value;
    _value = 
new warehouse_conveyor.PickupRobotArm() 
;
    return _value;
  }
  private ConveyorPath _toWorker_targetConveyor_xjal( final com.anylogic.libraries.material_handling.Convey<Pallet> self, Pallet agent ) {
    ConveyorPath _value;
    _value = 
agent.carriedItemsType == dish ?
	dishPalletLinePickup :
	beveragePalletLinePickup 
;
    return _value;
  }
  private Agent _worker_newUnit_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Worker> self ) {
    Agent _value;
    _value = 
new warehouse_conveyor.Worker() 
;
    return _value;
  }
  private INode _moveTo_destinationNode_xjal( final com.anylogic.libraries.processmodeling.MoveTo<Pallet> self, Pallet agent ) {
    INode _value;
    _value = 
agent.carriedItemsType == dish ?
	emptyDishPalletStack :
	emptyBeveragePalletStack 
;
    return _value;
  }
  private Agent _asrs1_newUnit_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<SimpleASRS> self ) {
    Agent _value;
    _value = 
new warehouse_conveyor.SimpleASRS() 
;
    return _value;
  }
  private Agent _asrs2_newUnit_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<SimpleASRS> self ) {
    Agent _value;
    _value = 
new warehouse_conveyor.SimpleASRS() 
;
    return _value;
  }
  private Agent _asrs3_newUnit_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<SimpleASRS> self ) {
    Agent _value;
    _value = 
new warehouse_conveyor.SimpleASRS() 
;
    return _value;
  }
  private ConveyorPath _conveyorEnter_conveyor_xjal( final com.anylogic.libraries.material_handling.ConveyorEnter<Carton> self, Carton agent ) {
    ConveyorPath _value;
    _value = 
cartonInitialLine 
;
    return _value;
  }
  private boolean _conveyorEnter_changeOrientation_xjal( final com.anylogic.libraries.material_handling.ConveyorEnter<Carton> self, Carton agent ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private AgentOrientation _conveyorEnter_orientation_xjal( final com.anylogic.libraries.material_handling.ConveyorEnter<Carton> self, Carton agent ) {
    AgentOrientation _value;
    _value = 
AGENT_ORIENTATION_LEFT 
;
    return _value;
  }
  private void _conveyorEnter_onEnter_xjal( final com.anylogic.libraries.material_handling.ConveyorEnter<Carton> self, Carton agent ) {
    
agent.processingTimeStart = time( MINUTE ); 
;
  }
  private boolean _orderIsFullfilled_condition_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Carton> self, Carton agent ) {
    boolean _value;
    _value = 
agent.order.orderList.isEmpty() 
;
    return _value;
  }
  private void _orderIsFullfilled_onExitTrue_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Carton> self, Carton agent ) {
    
orderPickingTimeDistribution.add( time() - agent.pickingTimeStart ); 
;
  }
  private void _orderIsFullfilled_onExitFalse_xjal( final com.anylogic.libraries.processmodeling.SelectOutput<Carton> self, Carton agent ) {
    
agent.setNextItemType(); 
;
  }
  private PositionOnConveyor _toPackagingLines_targetPositionOnConveyor_xjal( final com.anylogic.libraries.material_handling.Convey<Carton> self, Carton agent ) {
    PositionOnConveyor _value;
    _value = 
packageLinesEntryPoint 
;
    return _value;
  }
  private PositionOnConveyor _toSorterScanner_targetPositionOnConveyor_xjal( final com.anylogic.libraries.material_handling.Convey<Carton> self, Carton agent ) {
    PositionOnConveyor _value;
    _value = 
scanner 
;
    return _value;
  }
  private ConveyorPath[] _toSorterScanner_conveyorsToInclude_xjal( final com.anylogic.libraries.material_handling.Convey<Carton> self, Carton agent ) {
    ConveyorPath[] _value;
    _value = new ConveyorPath[]
{ chooseLeastBusyPackagingLine() } 
;
    return _value;
  }
  private ConveyorPath _toLoadZone_targetConveyor_xjal( final com.anylogic.libraries.material_handling.Convey<Carton> self, Carton agent ) {
    ConveyorPath _value;
    _value = 
randomFrom(exitLines); 
;
    return _value;
  }
  private boolean _toLoadZone_removeFromConveyor_xjal( final com.anylogic.libraries.material_handling.Convey<Carton> self, Carton agent ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private void _toLoadZone_onExit_xjal( final com.anylogic.libraries.material_handling.Convey<Carton> self, Carton agent ) {
    
fullOrderProcessingTimeDistribution.add( time( MINUTE ) - agent.processingTimeStart ); 
;
  }
  private void _ordersSentToClient_onEnter_xjal( final com.anylogic.libraries.processmodeling.Sink<Carton> self, Carton agent ) {
    
agent.order.deleteSelf(); 
;
  }
  private PalletRackAccess<?> _rackStore_rackSystem_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, Item agent ) {
    PalletRackAccess<?> _value;
    _value = 
storageUnits.get( agent.type ).rack 
;
    return _value;
  }
  private void _rackStore_onExit_xjal( final com.anylogic.libraries.processmodeling.RackStore<Item> self, Item agent, com.anylogic.libraries.processmodeling.RackSystem rackSystem, PalletRack palletRack, int row, int position, int level ) {
    
agent.receive( "placedAtRack" ); 
;
  }
  private INode _enter_locationNode_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    INode _value;
    _value = 
rackEnd3 
;
    return _value;
  }
  private double _enter_speed_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    double _value;
    _value = 
1000000000 
;
    return _value;
  }
  private AgentList _enter_population_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    AgentList _value;
    _value = 
storedItems 
;
    return _value;
  }
  private void _enter_onEnter_xjal( final com.anylogic.libraries.processmodeling.Enter<Item> self, Item agent ) {
    
agent.receive( "toConveyor" );
agent.storage = getStorageUnit(agent.type); 
;
  }
  private void _atStore_onExit_xjal( final com.anylogic.libraries.processmodeling.Exit<Item> self, Item agent ) {
    
agent.storage.releaseIncomingFlow( agent.getLength( METER ) );
agent.receive( "placedAtRack" ); 
;
  }
  private PalletRack _pickingStation_rack_xjal( final PickingStation<Carton> self, Item item ) {
    PalletRack _value;
    _value = 
item.storage.rack 
;
    return _value;
  }
  private PointNode _pickingStation_pickingStation_xjal( final PickingStation<Carton> self, Item item ) {
    PointNode _value;
    _value = 
item.storage.pickupStation 
;
    return _value;
  }
  private void _toStoringStation_onExit_xjal( final com.anylogic.libraries.processmodeling.Exit<Item> self, Item agent ) {
    
storingStations.get( agent.type.ordinal() ).enter.take(agent) 
;
  }
  private Agent _packager1_newUnit_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Worker> self ) {
    Agent _value;
    _value = 
new warehouse_conveyor.Worker() 
;
    return _value;
  }
  private Agent _packager2_newUnit_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Worker> self ) {
    Agent _value;
    _value = 
new warehouse_conveyor.Worker() 
;
    return _value;
  }
  private Agent _packager3_newUnit_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Worker> self ) {
    Agent _value;
    _value = 
new warehouse_conveyor.Worker() 
;
    return _value;
  }
  private ConveyorPath _toPickingLine_targetConveyor_xjal( final com.anylogic.libraries.material_handling.Convey<Carton> self, Carton agent ) {
    ConveyorPath _value;
    _value = 
storageUnits.get( agent.currentTypeOfItemsToTake ).pickupEntryLine 
;
    return _value;
  }
  private void _toPickingLine_onEnter_xjal( final com.anylogic.libraries.material_handling.Convey<Carton> self, Carton agent ) {
    
if ( agent.pickingTimeStart == 0 )
	agent.pickingTimeStart = time(); 
;
  }
  private ConveyorPath _conveytoWorkzone_targetConveyor_xjal( final com.anylogic.libraries.material_handling.Convey<Carton> self, Carton agent ) {
    ConveyorPath _value;
    _value = 
storageUnits.get( agent.currentTypeOfItemsToTake ).pickingInLine 
;
    return _value;
  }
  private boolean _canEnterLine_condition1_xjal( final com.anylogic.libraries.processmodeling.SelectOutput5<Carton> self, Carton agent ) {
    boolean _value;
    _value = 
conveyorCanAcceptCarton( storageUnits.get( agent.currentTypeOfItemsToTake ).pickingInLine, agent) 
;
    return _value;
  }
  private boolean _canEnterLine_condition2_xjal( final com.anylogic.libraries.processmodeling.SelectOutput5<Carton> self, Carton agent ) {
    boolean _value;
    _value = 
agent.hasOtherItems() 
;
    return _value;
  }
  private boolean _canEnterLine_condition3_xjal( final com.anylogic.libraries.processmodeling.SelectOutput5<Carton> self, Carton agent ) {
    boolean _value;
    _value = 
!agent.hasOtherItems() 
;
    return _value;
  }
  private boolean _canEnterLine_condition4_xjal( final com.anylogic.libraries.processmodeling.SelectOutput5<Carton> self, Carton agent ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private void _canEnterLine_onExit2_xjal( final com.anylogic.libraries.processmodeling.SelectOutput5<Carton> self, Carton agent ) {
    
agent.setNextItemType(); 
;
  }
  private ConveyorPath _convey_targetConveyor_xjal( final com.anylogic.libraries.material_handling.Convey<Carton> self, Carton agent ) {
    ConveyorPath _value;
    _value = 
returnToPickingLine 
;
    return _value;
  }
  private Agent _forklifts_newTransporter_xjal( final com.anylogic.libraries.material_handling.TransporterFleet<Forklift> self ) {
    Agent _value;
    _value = 
new warehouse_conveyor.Forklift() 
;
    return _value;
  }
  private boolean _forklifts_setDimensions_xjal( final com.anylogic.libraries.material_handling.TransporterFleet<Forklift> self, Forklift unit ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private double _forklifts_height_xjal( final com.anylogic.libraries.material_handling.TransporterFleet<Forklift> self, Forklift unit ) {
    double _value;
    _value = 
0.2 
;
    return _value;
  }
  private Node _moveToDock_destinationNode_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    Node _value;
    _value = 
foodProductsDock 
;
    return _value;
  }
  private com.anylogic.libraries.material_handling.TransporterFleet _moveToDock_fleet_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent ) {
    com.anylogic.libraries.material_handling.TransporterFleet _value;
    _value = 
forklifts 
;
    return _value;
  }
  private com.anylogic.libraries.material_handling.ReleaseTransporter.TransporterReleaseMovingPolicy _moveToDock_releaseMovingPolicy_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Agent unit ) {
    com.anylogic.libraries.material_handling.ReleaseTransporter.TransporterReleaseMovingPolicy _value;
    _value = 
self.MP_RETURNS_TO_NEAREST_HOME 
;
    return _value;
  }
  private void __foodMergePoint_controller_xjal_onTrailingEdgeExit_xjal( final com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Item> _self, Item agent ) {
    PositionOnConveyor<Item> self = foodMergePoint;
    
blockItemFlow( agent.type ); 
;
  }
  private void __beverageDishMergePoint_controller_xjal_onTrailingEdgeExit_xjal( final com.anylogic.libraries.material_handling.PositionOnConveyorDescriptor<Item> _self, Item agent ) {
    PositionOnConveyor<Item> self = beverageDishMergePoint;
    
blockItemFlow( agent.type ); 
;
  }
  private double __labelingStation_controller_xjal_processTime_xjal( final com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> _self, Carton agent, List<Carton> allAgents ) {
    ConveyorSimpleStation<Carton> self = labelingStation;
    double _value;
    _value = 
uniform( 0.5, 1 ) 
;
    return _value;
  }
  private double __invoiceStation_controller_xjal_processTime_xjal( final com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> _self, Carton agent, List<Carton> allAgents ) {
    ConveyorSimpleStation<Carton> self = invoiceStation;
    double _value;
    _value = 
uniform(1,2) 
;
    return _value;
  }
  private double __checkOrderStation_controller_xjal_processTime_xjal( final com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> _self, Carton agent, List<Carton> allAgents ) {
    ConveyorSimpleStation<Carton> self = checkOrderStation;
    double _value;
    _value = 
uniform(1,2) 
;
    return _value;
  }
  private double __station_controller_xjal_processTime_xjal( final com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> _self, Carton agent, List<Carton> allAgents ) {
    ConveyorSimpleStation<Carton> self = station;
    double _value;
    _value = 
triangular( 50, 60, 80 ) 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool __station_controller_xjal_resourcePool_xjal( final com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> _self, Carton agent, List<Carton> allAgents ) {
    ConveyorSimpleStation<Carton> self = station;
    com.anylogic.libraries.processmodeling.ResourcePool _value;
    _value = 
packager3 
;
    return _value;
  }
  private double __station1_controller_xjal_processTime_xjal( final com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> _self, Carton agent, List<Carton> allAgents ) {
    ConveyorSimpleStation<Carton> self = station1;
    double _value;
    _value = 
triangular( 50, 60, 80 ) 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool __station1_controller_xjal_resourcePool_xjal( final com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> _self, Carton agent, List<Carton> allAgents ) {
    ConveyorSimpleStation<Carton> self = station1;
    com.anylogic.libraries.processmodeling.ResourcePool _value;
    _value = 
packager2 
;
    return _value;
  }
  private double __station2_controller_xjal_processTime_xjal( final com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> _self, Carton agent, List<Carton> allAgents ) {
    ConveyorSimpleStation<Carton> self = station2;
    double _value;
    _value = 
triangular( 50, 60, 80 ) 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool __station2_controller_xjal_resourcePool_xjal( final com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> _self, Carton agent, List<Carton> allAgents ) {
    ConveyorSimpleStation<Carton> self = station2;
    com.anylogic.libraries.processmodeling.ResourcePool _value;
    _value = 
packager1 
;
    return _value;
  }
  private double __shippingLabelingStation_controller_xjal_processTime_xjal( final com.anylogic.libraries.material_handling.ConveyorSimpleStationDescriptor<Carton> _self, Carton agent, List<Carton> allAgents ) {
    ConveyorSimpleStation<Carton> self = shippingLabelingStation;
    double _value;
    _value = 
1 
;
    return _value;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  private int _storedItems_availableFood_xjal() {
    int _value = 0;
    for ( Item item : storedItems ) {
      boolean _t = 
item.type == food &&
(item.inState(item.transported) || 
 item.inState(item.stored) || 
 item.inState(item.delivered)) 
;
      if ( _t ) {
        _value++;
      }
    }
    return _value;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  private int _storedItems_availableBeverage_xjal() {
    int _value = 0;
    for ( Item item : storedItems ) {
      boolean _t = 
item.type == beverage &&
(item.inState(item.transported) || 
 item.inState(item.stored) || 
 item.inState(item.delivered)) 
;
      if ( _t ) {
        _value++;
      }
    }
    return _value;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  private int _storedItems_availableDish_xjal() {
    int _value = 0;
    for ( Item item : storedItems ) {
      boolean _t = 
item.type == dish &&
(item.inState(item.transported) || 
 item.inState(item.stored) || 
 item.inState(item.delivered)) 
;
      if ( _t ) {
        _value++;
      }
    }
    return _value;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  private int _storedItems_unreservedFood_xjal() {
    int _value = 0;
    for ( Item item : storedItems ) {
      boolean _t = 
item.type == food && item.inState( item.stored ) 
;
      if ( _t ) {
        _value++;
      }
    }
    return _value;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  private int _storedItems_unreservedBeverage_xjal() {
    int _value = 0;
    for ( Item item : storedItems ) {
      boolean _t = 
item.type == beverage && item.inState( item.stored ) 
;
      if ( _t ) {
        _value++;
      }
    }
    return _value;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  private int _storedItems_unreservedDish_xjal() {
    int _value = 0;
    for ( Item item : storedItems ) {
      boolean _t = 
item.type == dish && item.inState( item.stored ) 
;
      if ( _t ) {
        _value++;
      }
    }
    return _value;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  private int _storedItems_reservedItems_xjal() {
    int _value = 0;
    for ( Item item : storedItems ) {
      boolean _t = 
item.inState( item.stored ) 
;
      if ( _t ) {
        _value++;
      }
    }
    return _value;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  private int _storedItems_unreservedItems_xjal() {
    int _value = 0;
    for ( Item item : storedItems ) {
      boolean _t = 
item.inState( item.ordered ) 
;
      if ( _t ) {
        _value++;
      }
    }
    return _value;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  private int _orders_waitingForPreorder_xjal() {
    int _value = 0;
    for ( Order item : orders ) {
      boolean _t = 
!item.unavailableItems.isEmpty() 
;
      if ( _t ) {
        _value++;
      }
    }
    return _value;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  private int _orders_inProcess_xjal() {
    int _value = 0;
    for ( Order item : orders ) {
      boolean _t = 
item.unavailableItems.isEmpty() 
;
      if ( _t ) {
        _value++;
      }
    }
    return _value;
  }
  // Functions

  
ConveyorPath 
 chooseLeastBusyPackagingLine(  ) { 

return sortAscending( packagingLines, 
		conv -> count( conv.getAgents(), item -> ( (Carton)item ).inState( ((Carton)item).opened ) ) 
		).get(0); 
  }

  
boolean 
 getNextPickStation( Carton agent ) { 

for ( ItemType itemType : ItemType.values() ) {
	if ( agent.order.orderList.containsKey( itemType ) && 
		conveyorCanAcceptCarton( storageUnits.get( itemType ).pickingInLine, agent ) ) {
		agent.currentTypeOfItemsToTake = itemType;
		return true;	
	}
}

return false; 
  }

  
boolean 
 conveyorCanAcceptCarton( ConveyorPath<?> path, Carton carton ) { 

double gap = path.getGap(METER);
double freeSpaceOnPath = path.length(METER) - sum( path.getAgents(), item -> ( (Carton)item ).getLength(METER) + gap ); 

return freeSpaceOnPath > carton.getLength(METER) + gap; 
  }

  void supplyCheck(  ) { 

if ( storedItems.availableFood() <= minAvailability )
	foodPalletSource.addItems.restart();
if ( storedItems.availableBeverage() <= minAvailability )
	beveragesPalletSource.addItems.restart();
if ( storedItems.availableDish() <= minAvailability )
	dishPalletSource.addItems.restart(); 
  }

  void navigate( ViewArea viewArea ) { 

selectedViewArea = viewArea;
viewArea.navigateTo();
groupMainMenu.setPos( viewArea.getX(), viewArea.getY() ); 
  }

  
StorageUnit 
 getStorageUnit( ItemType type ) { 

if ( storageUnits.isEmpty() ) {
	storageUnits.put( food, foodStorageUnit );
	storageUnits.put( beverage, beverageStorageUnit );
	storageUnits.put( dish, dishStorageUnit );
}

return storageUnits.get( type ); 
  }

  void blockItemFlow( ItemType itemType ) { 

ConveyorPath<?> conv = storageUnits.get(itemType).infeedingConveyor;
double occupancy =  getOccupancyOfConveyorNetwork( infeedMergeConveyor, conv, itemType );

if (  occupancy >= 0.75 * ( conv.length(METER) - 0.5 ) ) {
	storageUnits.get( itemType ).infeedingBlocker.block();
}
 
  }

  
double 
 getOccupancyOfConveyorNetwork( ConveyorPath<?> startConveyor, ConveyorPath<?> endConveyor, ItemType itemType ) { 

ConveyorPath<?> conv = endConveyor;
double occupancy = sum(filter(conv.getAgents(), item -> ((Item)item).type == itemType ),
					item -> item.getLength(METER) + startConveyor.getGap( METER ) );
do {
	conv = conv.getSource().getIncomingPaths().get(0);
	occupancy += sum(filter(conv.getAgents(), item -> ((Item)item).type == itemType ),
					item -> item.getLength(METER) + endConveyor.getGap( METER ) );
}
while  (conv != startConveyor );

return occupancy; 
  }

  
ConveyorPath<?> 
 getStorageConveyor( Item agent ) { 

agent.storage = getStorageUnit(agent.type);
return agent.storage.infeedingConveyor; 
  }

  
Order 
 checkPreOrders( ItemType type ) { 

for (Order preOrder : filter( orders, ord -> !ord.unavailableItems.isEmpty() &&
											 ord.unavailableItems.containsKey(type) ) ) {
	
	preOrder.fulfill(type);
	if ( preOrder.unavailableItems.isEmpty() ) {
		cartonsEnter.take( new Carton( preOrder ) );
		preorderWaitingTimeDistribution.add( time( MINUTE ) - preOrder.startPreorderWaitingTime );
	}
	
	return preOrder;
}

return null; 
  }

  
double 
 getNumberOfPreorderedItems( ItemType type ) { 

if ( orders.isEmpty() )
	return 0;

return sum( orders, 
		order -> ( (Order)order ).unavailableItems.getOrDefault( type, 0 ) );
 
  }

  
double 
 getNumberOfItemsInProcess( ItemType type ) { 

if ( orders.isEmpty() )
	return 0;

return sumWhere( orders, 
		order -> ( (Order)order ).orderList.getOrDefault( type, 0 ), 
		order -> ( (Order)order ).unavailableItems.isEmpty() ); 
  }
  // Analysis Data Elements
  public HistogramSmartData itemsPerOrder = new HistogramSmartData( 10, 
0.1 
, true, false, 0.1, 0.1 );
  
  public HistogramSmartData preorderWaitingTimeDistribution = new HistogramSmartData( 10, 
0.1 
, true, false, 0.1, 0.1 );
  
  public HistogramSmartData orderPickingTimeDistribution = new HistogramSmartData( 10, 
0.1 
, true, false, 0.1, 0.1 );
  
  public HistogramSmartData fullOrderProcessingTimeDistribution = new HistogramSmartData( 10, 
0.1 
, true, false, 0.1, 0.1 );
  
  public HistogramSmartData itemStoredTimeDistribution = new HistogramSmartData( 10, 
0.1 
, true, false, 0.1, 0.1 );
  
  // View areas
  public ViewArea view2D = new ViewArea( this, null, 0, 0, 1400, 700 );
  public ViewArea view3D = new ViewArea( this, null, 0, -700, 1400, 700 );
  public ViewArea viewLogic = new ViewArea( this, null, 0, 700, 1400, 700 );
  public ViewArea viewStatistics = new ViewArea( this, null, 1400, 700, 1400, 700 );
  public ViewArea _origin_VA = new ViewArea( this, "[Origin]", 0, 0, 1400.0, 700.0 );
  @AnyLogicInternalCodegenAPI
  public ViewArea _window3d_VA = new ViewArea( this, "[window3d]", 0.0, -660.0, 1400.0, 660.0 );
  @Override
  @AnyLogicInternalCodegenAPI
  public int getViewAreas(Map<String, ViewArea> _output) {
    if ( _output != null ) {
      _output.put( "view2D", this.view2D );
      _output.put( "view3D", this.view3D );
      _output.put( "viewLogic", this.viewLogic );
      _output.put( "viewStatistics", this.viewStatistics );
      _output.put( "_origin_VA", this._origin_VA );
      _output.put( "_window3d_VA", this._window3d_VA );
    }
    return 6 + super.getViewAreas( _output );
  }
  @AnyLogicInternalCodegenAPI
  protected static final Font _text_Font = new Font("SansSerif", 0, 10 );
  @AnyLogicInternalCodegenAPI
  protected static final Font _text1_Font = _text_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text2_Font = _text_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text3_Font = _text_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text4_Font = _text_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text5_Font = _text_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text6_Font = _text_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text7_Font = _text_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text8_Font = _text_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text29_Font = _text_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text30_Font = _text_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text31_Font = _text_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text85_Font = new Font("SansSerif", 0, 22 );
  @AnyLogicInternalCodegenAPI
  protected static final Font _text113_Font = _text85_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text114_Font = _text85_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text115_Font = _text85_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text116_Font = _text85_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text9_Font = new Font("SansSerif", 0, 12 );
  @AnyLogicInternalCodegenAPI
  protected static final Font _text10_Font = _text9_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text11_Font = _text9_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text12_Font = _text9_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text13_Font = _text9_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text14_Font = _text9_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text19_Font = _text9_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text25_Font = _text9_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text23_Font = _text9_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text21_Font = _text9_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text17_Font = _text9_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text27_Font = new Font("SansSerif", 0, 14 );
  @AnyLogicInternalCodegenAPI
  protected static final Font _text28_Font = _text27_Font;
  protected static final Color _rectangle5_Fill_Color = new Color( 0xFFE2E8ED, true );
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _table_4_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "material0", null ),
    new Pair<String, Color>( "material1", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _person2_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "Material__3__Surf", null ),
    new Pair<String, Color>( "Material__5__Surf", null ),
    new Pair<String, Color>( "Material__6__Surf", null ),
    new Pair<String, Color>( "Material__2__Surf", null ),
    new Pair<String, Color>( "Material__4__Surf", null ),
    new Pair<String, Color>( "Material__1__Surf", black ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _monitor_on2_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_material_27", null ),
    new Pair<String, Color>( "MA___LightGray_", null ),
    new Pair<String, Color>( "MA_material_4", null ),
    new Pair<String, Color>( "MA__96_96_96", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _computer_on2_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_material_4", null ),
    new Pair<String, Color>( "MA_black", null ),
    new Pair<String, Color>( "MA__96_96_96", null ),
    new Pair<String, Color>( "MA___LightGray_", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _table_3_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "material0", null ),
    new Pair<String, Color>( "material1", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _person1_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "Material__3__Surf", null ),
    new Pair<String, Color>( "Material__5__Surf", null ),
    new Pair<String, Color>( "Material__6__Surf", null ),
    new Pair<String, Color>( "Material__2__Surf", null ),
    new Pair<String, Color>( "Material__4__Surf", null ),
    new Pair<String, Color>( "Material__1__Surf", black ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _monitor_on1_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_material_27", null ),
    new Pair<String, Color>( "MA___LightGray_", null ),
    new Pair<String, Color>( "MA_material_4", null ),
    new Pair<String, Color>( "MA__96_96_96", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _computer_on1_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_material_4", null ),
    new Pair<String, Color>( "MA_black", null ),
    new Pair<String, Color>( "MA__96_96_96", null ),
    new Pair<String, Color>( "MA___LightGray_", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _table_2_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "material0", null ),
    new Pair<String, Color>( "material1", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _person_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "Material__3__Surf", null ),
    new Pair<String, Color>( "Material__5__Surf", null ),
    new Pair<String, Color>( "Material__6__Surf", null ),
    new Pair<String, Color>( "Material__2__Surf", null ),
    new Pair<String, Color>( "Material__4__Surf", null ),
    new Pair<String, Color>( "Material__1__Surf", black ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _monitor_on_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_material_27", null ),
    new Pair<String, Color>( "MA___LightGray_", null ),
    new Pair<String, Color>( "MA_material_4", null ),
    new Pair<String, Color>( "MA__96_96_96", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _computer_on_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_material_4", null ),
    new Pair<String, Color>( "MA_black", null ),
    new Pair<String, Color>( "MA__96_96_96", null ),
    new Pair<String, Color>( "MA___LightGray_", null ),
  };
  protected static final Color _rectangle117_Fill_Color = new Color( 0xFF81C3FF, true );
  protected static final Color _rectangle127_Fill_Color = new Color( 0xFF81C3FF, true );
  protected static final Color _rectangle128_Fill_Color = new Color( 0xFF81C3FF, true );
  protected static final Color _rectangle129_Fill_Color = new Color( 0xFF81C3FF, true );
  protected static final Color _rectangle130_Fill_Color = new Color( 0xFF81C3FF, true );
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _robot_1_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA___Beige_1", null ),
    new Pair<String, Color>( "MA__96_96_96", null ),
  };
  protected static final Color _line9_Line_Color = new Color( 0x4B800080, true );
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _table_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "material0", null ),
    new Pair<String, Color>( "material1", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _chair_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "material0", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _person_sitting_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_Shape_7", null ),
    new Pair<String, Color>( "MA_Shape_9", black ),
    new Pair<String, Color>( "MA_Shape_8", null ),
    new Pair<String, Color>( "MA_Shape2", white ),
    new Pair<String, Color>( "MA_Shape_10", black ),
    new Pair<String, Color>( "MA_Shape_003", white ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _computer_on3_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_material_4", null ),
    new Pair<String, Color>( "MA_black", null ),
    new Pair<String, Color>( "MA__96_96_96", null ),
    new Pair<String, Color>( "MA___LightGray_", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _monitor_on3_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_material_27", null ),
    new Pair<String, Color>( "MA___LightGray_", null ),
    new Pair<String, Color>( "MA_material_4", null ),
    new Pair<String, Color>( "MA__96_96_96", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _keyboard_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_material", null ),
    new Pair<String, Color>( "MA___LightGray_", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _phone_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA___LightGray_", null ),
    new Pair<String, Color>( "MA_material", null ),
    new Pair<String, Color>( "MA_material_27", null ),
    new Pair<String, Color>( "MA__96_96_96", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _monitor_on4_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_material_27", null ),
    new Pair<String, Color>( "MA___LightGray_", null ),
    new Pair<String, Color>( "MA_material_4", null ),
    new Pair<String, Color>( "MA__96_96_96", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _monitor_on5_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_material_27", null ),
    new Pair<String, Color>( "MA___LightGray_", null ),
    new Pair<String, Color>( "MA_material_4", null ),
    new Pair<String, Color>( "MA__96_96_96", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _table1_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "material0", null ),
    new Pair<String, Color>( "material1", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _chair1_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "material0", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _person_sitting1_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_Shape_7", null ),
    new Pair<String, Color>( "MA_Shape_9", black ),
    new Pair<String, Color>( "MA_Shape_8", null ),
    new Pair<String, Color>( "MA_Shape2", white ),
    new Pair<String, Color>( "MA_Shape_10", black ),
    new Pair<String, Color>( "MA_Shape_003", white ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _computer_on4_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_material_4", null ),
    new Pair<String, Color>( "MA_black", null ),
    new Pair<String, Color>( "MA__96_96_96", null ),
    new Pair<String, Color>( "MA___LightGray_", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _monitor_on6_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_material_27", null ),
    new Pair<String, Color>( "MA___LightGray_", null ),
    new Pair<String, Color>( "MA_material_4", null ),
    new Pair<String, Color>( "MA__96_96_96", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _keyboard1_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_material", null ),
    new Pair<String, Color>( "MA___LightGray_", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _phone1_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA___LightGray_", null ),
    new Pair<String, Color>( "MA_material", null ),
    new Pair<String, Color>( "MA_material_27", null ),
    new Pair<String, Color>( "MA__96_96_96", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _monitor_on7_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_material_27", null ),
    new Pair<String, Color>( "MA___LightGray_", null ),
    new Pair<String, Color>( "MA_material_4", null ),
    new Pair<String, Color>( "MA__96_96_96", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _monitor_on8_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_material_27", null ),
    new Pair<String, Color>( "MA___LightGray_", null ),
    new Pair<String, Color>( "MA_material_4", null ),
    new Pair<String, Color>( "MA__96_96_96", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _table2_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "material0", null ),
    new Pair<String, Color>( "material1", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _chair2_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "material0", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _person_sitting2_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_Shape_7", null ),
    new Pair<String, Color>( "MA_Shape_9", black ),
    new Pair<String, Color>( "MA_Shape_8", null ),
    new Pair<String, Color>( "MA_Shape2", white ),
    new Pair<String, Color>( "MA_Shape_10", black ),
    new Pair<String, Color>( "MA_Shape_003", white ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _computer_on5_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_material_4", null ),
    new Pair<String, Color>( "MA_black", null ),
    new Pair<String, Color>( "MA__96_96_96", null ),
    new Pair<String, Color>( "MA___LightGray_", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _monitor_on9_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_material_27", null ),
    new Pair<String, Color>( "MA___LightGray_", null ),
    new Pair<String, Color>( "MA_material_4", null ),
    new Pair<String, Color>( "MA__96_96_96", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _keyboard2_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_material", null ),
    new Pair<String, Color>( "MA___LightGray_", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _phone2_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA___LightGray_", null ),
    new Pair<String, Color>( "MA_material", null ),
    new Pair<String, Color>( "MA_material_27", null ),
    new Pair<String, Color>( "MA__96_96_96", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _monitor_on10_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_material_27", null ),
    new Pair<String, Color>( "MA___LightGray_", null ),
    new Pair<String, Color>( "MA_material_4", null ),
    new Pair<String, Color>( "MA__96_96_96", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _monitor_on11_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_material_27", null ),
    new Pair<String, Color>( "MA___LightGray_", null ),
    new Pair<String, Color>( "MA_material_4", null ),
    new Pair<String, Color>( "MA__96_96_96", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _table3_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "material0", null ),
    new Pair<String, Color>( "material1", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _chair3_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "material0", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _person_sitting3_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_Shape_7", null ),
    new Pair<String, Color>( "MA_Shape_9", black ),
    new Pair<String, Color>( "MA_Shape_8", null ),
    new Pair<String, Color>( "MA_Shape2", white ),
    new Pair<String, Color>( "MA_Shape_10", black ),
    new Pair<String, Color>( "MA_Shape_003", white ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _computer_on6_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_material_4", null ),
    new Pair<String, Color>( "MA_black", null ),
    new Pair<String, Color>( "MA__96_96_96", null ),
    new Pair<String, Color>( "MA___LightGray_", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _monitor_on12_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_material_27", null ),
    new Pair<String, Color>( "MA___LightGray_", null ),
    new Pair<String, Color>( "MA_material_4", null ),
    new Pair<String, Color>( "MA__96_96_96", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _keyboard3_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_material", null ),
    new Pair<String, Color>( "MA___LightGray_", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _phone3_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA___LightGray_", null ),
    new Pair<String, Color>( "MA_material", null ),
    new Pair<String, Color>( "MA_material_27", null ),
    new Pair<String, Color>( "MA__96_96_96", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _monitor_on13_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_material_27", null ),
    new Pair<String, Color>( "MA___LightGray_", null ),
    new Pair<String, Color>( "MA_material_4", null ),
    new Pair<String, Color>( "MA__96_96_96", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _monitor_on14_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_material_27", null ),
    new Pair<String, Color>( "MA___LightGray_", null ),
    new Pair<String, Color>( "MA_material_4", null ),
    new Pair<String, Color>( "MA__96_96_96", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _drying_chamber_closed_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "body", null ),
    new Pair<String, Color>( "door", null ),
    new Pair<String, Color>( "wires", null ),
    new Pair<String, Color>( "power_unit", null ),
    new Pair<String, Color>( "lcd", null ),
    new Pair<String, Color>( "button_2", null ),
    new Pair<String, Color>( "button_1", null ),
    new Pair<String, Color>( "panel", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _pasting_machine1_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "body", null ),
    new Pair<String, Color>( "conveyor_belt", null ),
    new Pair<String, Color>( "side_elements", null ),
    new Pair<String, Color>( "block", null ),
    new Pair<String, Color>( "pulverize", null ),
    new Pair<String, Color>( "roller", null ),
    new Pair<String, Color>( "main", null ),
    new Pair<String, Color>( "lcd", null ),
    new Pair<String, Color>( "button_2", null ),
    new Pair<String, Color>( "button_1", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _plate_enveloper1_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "panel_2", null ),
    new Pair<String, Color>( "panel_1", null ),
    new Pair<String, Color>( "reel", null ),
    new Pair<String, Color>( "conveyor", null ),
    new Pair<String, Color>( "top_frame", null ),
    new Pair<String, Color>( "computer_panel", null ),
    new Pair<String, Color>( "lcd", null ),
    new Pair<String, Color>( "roller", null ),
    new Pair<String, Color>( "button_2", null ),
    new Pair<String, Color>( "button_1", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _inline_scanner_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "sides", null ),
    new Pair<String, Color>( "conveyer", null ),
    new Pair<String, Color>( "camera", null ),
    new Pair<String, Color>( "structure", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _plate_enveloper2_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "panel_2", null ),
    new Pair<String, Color>( "panel_1", null ),
    new Pair<String, Color>( "reel", null ),
    new Pair<String, Color>( "conveyor", null ),
    new Pair<String, Color>( "top_frame", null ),
    new Pair<String, Color>( "computer_panel", null ),
    new Pair<String, Color>( "lcd", null ),
    new Pair<String, Color>( "roller", null ),
    new Pair<String, Color>( "button_2", null ),
    new Pair<String, Color>( "button_1", null ),
  };
  protected static final Color _storageTank_Line_Color = new Color( 0x40000000, true );
  protected static final Color _pipe_Line_Color = new Color( 0x40000000, true );
  @AnyLogicInternalCodegenAPI
  protected static final int _window3d = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int _itemStoringTimeHist = 2;
  @AnyLogicInternalCodegenAPI
  protected static final int _orderProcessingTimeHist = 3;
  @AnyLogicInternalCodegenAPI
  protected static final int _amountOfItemsPerOrder = 4;
  @AnyLogicInternalCodegenAPI
  protected static final int _ordersStates = 5;
  @AnyLogicInternalCodegenAPI
  protected static final int _storedItemsStatesChart = 6;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle5 = 7;
  @AnyLogicInternalCodegenAPI
  protected static final int _table_4 = 8;
  @AnyLogicInternalCodegenAPI
  protected static final int _person2 = 9;
  @AnyLogicInternalCodegenAPI
  protected static final int _monitor_on2 = 10;
  @AnyLogicInternalCodegenAPI
  protected static final int _computer_on2 = 11;
  @AnyLogicInternalCodegenAPI
  protected static final int _polyline6 = 12;
  @AnyLogicInternalCodegenAPI
  protected static final int _line4 = 13;
  @AnyLogicInternalCodegenAPI
  protected static final int _line5 = 14;
  @AnyLogicInternalCodegenAPI
  protected static final int _pickingWorkplace2 = 15;
  @AnyLogicInternalCodegenAPI
  protected static final int _table_3 = 16;
  @AnyLogicInternalCodegenAPI
  protected static final int _person1 = 17;
  @AnyLogicInternalCodegenAPI
  protected static final int _monitor_on1 = 18;
  @AnyLogicInternalCodegenAPI
  protected static final int _computer_on1 = 19;
  @AnyLogicInternalCodegenAPI
  protected static final int _polyline5 = 20;
  @AnyLogicInternalCodegenAPI
  protected static final int _line2 = 21;
  @AnyLogicInternalCodegenAPI
  protected static final int _line3 = 22;
  @AnyLogicInternalCodegenAPI
  protected static final int _pickingWorkplace1 = 23;
  @AnyLogicInternalCodegenAPI
  protected static final int _table_2 = 24;
  @AnyLogicInternalCodegenAPI
  protected static final int _person = 25;
  @AnyLogicInternalCodegenAPI
  protected static final int _monitor_on = 26;
  @AnyLogicInternalCodegenAPI
  protected static final int _computer_on = 27;
  @AnyLogicInternalCodegenAPI
  protected static final int _polyline4 = 28;
  @AnyLogicInternalCodegenAPI
  protected static final int _line = 29;
  @AnyLogicInternalCodegenAPI
  protected static final int _line1 = 30;
  @AnyLogicInternalCodegenAPI
  protected static final int _pickingWorkplace = 31;
  @AnyLogicInternalCodegenAPI
  protected static final int _camera = 32;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle4 = 33;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle = 34;
  @AnyLogicInternalCodegenAPI
  protected static final int _text = 35;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle1 = 36;
  @AnyLogicInternalCodegenAPI
  protected static final int _text1 = 37;
  @AnyLogicInternalCodegenAPI
  protected static final int _text2 = 38;
  @AnyLogicInternalCodegenAPI
  protected static final int _text3 = 39;
  @AnyLogicInternalCodegenAPI
  protected static final int _polyline = 40;
  @AnyLogicInternalCodegenAPI
  protected static final int _polyline1 = 41;
  @AnyLogicInternalCodegenAPI
  protected static final int _text4 = 42;
  @AnyLogicInternalCodegenAPI
  protected static final int _polyline2 = 43;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle2 = 44;
  @AnyLogicInternalCodegenAPI
  protected static final int _text5 = 45;
  @AnyLogicInternalCodegenAPI
  protected static final int _text6 = 46;
  @AnyLogicInternalCodegenAPI
  protected static final int _polyline3 = 47;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle3 = 48;
  @AnyLogicInternalCodegenAPI
  protected static final int _text7 = 49;
  @AnyLogicInternalCodegenAPI
  protected static final int _text8 = 50;
  @AnyLogicInternalCodegenAPI
  protected static final int _text29 = 51;
  @AnyLogicInternalCodegenAPI
  protected static final int _polyline8 = 52;
  @AnyLogicInternalCodegenAPI
  protected static final int _text30 = 53;
  @AnyLogicInternalCodegenAPI
  protected static final int _polyline9 = 54;
  @AnyLogicInternalCodegenAPI
  protected static final int _text31 = 55;
  @AnyLogicInternalCodegenAPI
  protected static final int _polyline10 = 56;
  @AnyLogicInternalCodegenAPI
  protected static final int _groupMarks = 57;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle116 = 58;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle117 = 59;
  @AnyLogicInternalCodegenAPI
  protected static final int _text85 = 60;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle127 = 61;
  @AnyLogicInternalCodegenAPI
  protected static final int _text113 = 62;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle128 = 63;
  @AnyLogicInternalCodegenAPI
  protected static final int _text114 = 64;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle129 = 65;
  @AnyLogicInternalCodegenAPI
  protected static final int _text115 = 66;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle130 = 67;
  @AnyLogicInternalCodegenAPI
  protected static final int _text116 = 68;
  @AnyLogicInternalCodegenAPI
  protected static final int _groupMainMenu = 69;
  @AnyLogicInternalCodegenAPI
  protected static final int _robot_1 = 70;
  @AnyLogicInternalCodegenAPI
  protected static final int _polyline7 = 71;
  @AnyLogicInternalCodegenAPI
  protected static final int _line6 = 72;
  @AnyLogicInternalCodegenAPI
  protected static final int _storedItems_presentation = 73;
  @AnyLogicInternalCodegenAPI
  protected static final int _text9 = 74;
  @AnyLogicInternalCodegenAPI
  protected static final int _text10 = 75;
  @AnyLogicInternalCodegenAPI
  protected static final int _text11 = 76;
  @AnyLogicInternalCodegenAPI
  protected static final int _text12 = 77;
  @AnyLogicInternalCodegenAPI
  protected static final int _text13 = 78;
  @AnyLogicInternalCodegenAPI
  protected static final int _line7 = 79;
  @AnyLogicInternalCodegenAPI
  protected static final int _robotUpperSegment = 80;
  @AnyLogicInternalCodegenAPI
  protected static final int _text14 = 81;
  @AnyLogicInternalCodegenAPI
  protected static final int _text19 = 82;
  @AnyLogicInternalCodegenAPI
  protected static final int _text25 = 83;
  @AnyLogicInternalCodegenAPI
  protected static final int _text23 = 84;
  @AnyLogicInternalCodegenAPI
  protected static final int _group = 85;
  @AnyLogicInternalCodegenAPI
  protected static final int _text21 = 86;
  @AnyLogicInternalCodegenAPI
  protected static final int _group2 = 87;
  @AnyLogicInternalCodegenAPI
  protected static final int _text17 = 88;
  @AnyLogicInternalCodegenAPI
  protected static final int _group5 = 89;
  @AnyLogicInternalCodegenAPI
  protected static final int _text27 = 90;
  @AnyLogicInternalCodegenAPI
  protected static final int _line8 = 91;
  @AnyLogicInternalCodegenAPI
  protected static final int _line9 = 92;
  @AnyLogicInternalCodegenAPI
  protected static final int _group6 = 93;
  @AnyLogicInternalCodegenAPI
  protected static final int _text28 = 94;
  @AnyLogicInternalCodegenAPI
  protected static final int _line10 = 95;
  @AnyLogicInternalCodegenAPI
  protected static final int _line11 = 96;
  @AnyLogicInternalCodegenAPI
  protected static final int _group7 = 97;
  @AnyLogicInternalCodegenAPI
  protected static final int _table = 98;
  @AnyLogicInternalCodegenAPI
  protected static final int _chair = 99;
  @AnyLogicInternalCodegenAPI
  protected static final int _person_sitting = 100;
  @AnyLogicInternalCodegenAPI
  protected static final int _computer_on3 = 101;
  @AnyLogicInternalCodegenAPI
  protected static final int _monitor_on3 = 102;
  @AnyLogicInternalCodegenAPI
  protected static final int _keyboard = 103;
  @AnyLogicInternalCodegenAPI
  protected static final int _phone = 104;
  @AnyLogicInternalCodegenAPI
  protected static final int _monitor_on4 = 105;
  @AnyLogicInternalCodegenAPI
  protected static final int _monitor_on5 = 106;
  @AnyLogicInternalCodegenAPI
  protected static final int _officeWorker = 107;
  @AnyLogicInternalCodegenAPI
  protected static final int _table1 = 108;
  @AnyLogicInternalCodegenAPI
  protected static final int _chair1 = 109;
  @AnyLogicInternalCodegenAPI
  protected static final int _person_sitting1 = 110;
  @AnyLogicInternalCodegenAPI
  protected static final int _computer_on4 = 111;
  @AnyLogicInternalCodegenAPI
  protected static final int _monitor_on6 = 112;
  @AnyLogicInternalCodegenAPI
  protected static final int _keyboard1 = 113;
  @AnyLogicInternalCodegenAPI
  protected static final int _phone1 = 114;
  @AnyLogicInternalCodegenAPI
  protected static final int _monitor_on7 = 115;
  @AnyLogicInternalCodegenAPI
  protected static final int _monitor_on8 = 116;
  @AnyLogicInternalCodegenAPI
  protected static final int _officeWorker1 = 117;
  @AnyLogicInternalCodegenAPI
  protected static final int _table2 = 118;
  @AnyLogicInternalCodegenAPI
  protected static final int _chair2 = 119;
  @AnyLogicInternalCodegenAPI
  protected static final int _person_sitting2 = 120;
  @AnyLogicInternalCodegenAPI
  protected static final int _computer_on5 = 121;
  @AnyLogicInternalCodegenAPI
  protected static final int _monitor_on9 = 122;
  @AnyLogicInternalCodegenAPI
  protected static final int _keyboard2 = 123;
  @AnyLogicInternalCodegenAPI
  protected static final int _phone2 = 124;
  @AnyLogicInternalCodegenAPI
  protected static final int _monitor_on10 = 125;
  @AnyLogicInternalCodegenAPI
  protected static final int _monitor_on11 = 126;
  @AnyLogicInternalCodegenAPI
  protected static final int _officeWorker2 = 127;
  @AnyLogicInternalCodegenAPI
  protected static final int _table3 = 128;
  @AnyLogicInternalCodegenAPI
  protected static final int _chair3 = 129;
  @AnyLogicInternalCodegenAPI
  protected static final int _person_sitting3 = 130;
  @AnyLogicInternalCodegenAPI
  protected static final int _computer_on6 = 131;
  @AnyLogicInternalCodegenAPI
  protected static final int _monitor_on12 = 132;
  @AnyLogicInternalCodegenAPI
  protected static final int _keyboard3 = 133;
  @AnyLogicInternalCodegenAPI
  protected static final int _phone3 = 134;
  @AnyLogicInternalCodegenAPI
  protected static final int _monitor_on13 = 135;
  @AnyLogicInternalCodegenAPI
  protected static final int _monitor_on14 = 136;
  @AnyLogicInternalCodegenAPI
  protected static final int _officeWorker3 = 137;
  @AnyLogicInternalCodegenAPI
  protected static final int _drying_chamber_closed = 138;
  @AnyLogicInternalCodegenAPI
  protected static final int _pasting_machine1 = 139;
  @AnyLogicInternalCodegenAPI
  protected static final int _plate_enveloper1 = 140;
  @AnyLogicInternalCodegenAPI
  protected static final int _inline_scanner = 141;
  @AnyLogicInternalCodegenAPI
  protected static final int _plate_enveloper2 = 142;
  @AnyLogicInternalCodegenAPI
  protected static final int _turntable = 143;
  @AnyLogicInternalCodegenAPI
  protected static final int _infeedLineFood = 144;
  @AnyLogicInternalCodegenAPI
  protected static final int _foodMergePoint = 145;
  @AnyLogicInternalCodegenAPI
  protected static final int _infeedMergeConveyor = 146;
  @AnyLogicInternalCodegenAPI
  protected static final int _turntable1 = 147;
  @AnyLogicInternalCodegenAPI
  protected static final int _turntable2 = 148;
  @AnyLogicInternalCodegenAPI
  protected static final int _mergeToFoodRack = 149;
  @AnyLogicInternalCodegenAPI
  protected static final int _toFoodRack = 150;
  @AnyLogicInternalCodegenAPI
  protected static final int _mergeToBeverageRack = 151;
  @AnyLogicInternalCodegenAPI
  protected static final int _toDishRack = 152;
  @AnyLogicInternalCodegenAPI
  protected static final int _turntable3 = 153;
  @AnyLogicInternalCodegenAPI
  protected static final int _toBeverageRack = 154;
  @AnyLogicInternalCodegenAPI
  protected static final int _beveragesAndDishesLine1 = 155;
  @AnyLogicInternalCodegenAPI
  protected static final int _beverageDishMergePoint = 156;
  @AnyLogicInternalCodegenAPI
  protected static final int _beveragesAndDishesLine = 157;
  @AnyLogicInternalCodegenAPI
  protected static final int _conveyorPointNode = 158;
  @AnyLogicInternalCodegenAPI
  protected static final int _foodPickInLine = 159;
  @AnyLogicInternalCodegenAPI
  protected static final int _transferTable6 = 160;
  @AnyLogicInternalCodegenAPI
  protected static final int _conveyor18 = 161;
  @AnyLogicInternalCodegenAPI
  protected static final int _cartonInitialLine = 162;
  @AnyLogicInternalCodegenAPI
  protected static final int _labelingStation = 163;
  @AnyLogicInternalCodegenAPI
  protected static final int _invoiceStation = 164;
  @AnyLogicInternalCodegenAPI
  protected static final int _foodPickOutLine = 165;
  @AnyLogicInternalCodegenAPI
  protected static final int _toBeveragePick = 166;
  @AnyLogicInternalCodegenAPI
  protected static final int _transferTable7 = 167;
  @AnyLogicInternalCodegenAPI
  protected static final int _transferTable8 = 168;
  @AnyLogicInternalCodegenAPI
  protected static final int _beveragePickInLine = 169;
  @AnyLogicInternalCodegenAPI
  protected static final int _conveyor22 = 170;
  @AnyLogicInternalCodegenAPI
  protected static final int _transferTable9 = 171;
  @AnyLogicInternalCodegenAPI
  protected static final int _beveragePickOutLine = 172;
  @AnyLogicInternalCodegenAPI
  protected static final int _toDishPick = 173;
  @AnyLogicInternalCodegenAPI
  protected static final int _dishPickInLine = 174;
  @AnyLogicInternalCodegenAPI
  protected static final int _conveyor26 = 175;
  @AnyLogicInternalCodegenAPI
  protected static final int _transferTable10 = 176;
  @AnyLogicInternalCodegenAPI
  protected static final int _transferTable11 = 177;
  @AnyLogicInternalCodegenAPI
  protected static final int _conveyor28 = 178;
  @AnyLogicInternalCodegenAPI
  protected static final int _checkOrderStation = 179;
  @AnyLogicInternalCodegenAPI
  protected static final int _dishPickOutLine = 180;
  @AnyLogicInternalCodegenAPI
  protected static final int _returnToPickingLine = 181;
  @AnyLogicInternalCodegenAPI
  protected static final int _transferTable13 = 182;
  @AnyLogicInternalCodegenAPI
  protected static final int _toFoodPick = 183;
  @AnyLogicInternalCodegenAPI
  protected static final int _pickingLinesStart = 184;
  @AnyLogicInternalCodegenAPI
  protected static final int _conveyor30 = 185;
  @AnyLogicInternalCodegenAPI
  protected static final int _transferTable12 = 186;
  @AnyLogicInternalCodegenAPI
  protected static final int _conveyor32 = 187;
  @AnyLogicInternalCodegenAPI
  protected static final int _turntable4 = 188;
  @AnyLogicInternalCodegenAPI
  protected static final int _conveyor34 = 189;
  @AnyLogicInternalCodegenAPI
  protected static final int _turntable5 = 190;
  @AnyLogicInternalCodegenAPI
  protected static final int _conveyor35 = 191;
  @AnyLogicInternalCodegenAPI
  protected static final int _turntable6 = 192;
  @AnyLogicInternalCodegenAPI
  protected static final int _packagingLine1 = 193;
  @AnyLogicInternalCodegenAPI
  protected static final int _station = 194;
  @AnyLogicInternalCodegenAPI
  protected static final int _packagingLine2 = 195;
  @AnyLogicInternalCodegenAPI
  protected static final int _station1 = 196;
  @AnyLogicInternalCodegenAPI
  protected static final int _packagingLine3 = 197;
  @AnyLogicInternalCodegenAPI
  protected static final int _station2 = 198;
  @AnyLogicInternalCodegenAPI
  protected static final int _conveyor33 = 199;
  @AnyLogicInternalCodegenAPI
  protected static final int _conveyor39 = 200;
  @AnyLogicInternalCodegenAPI
  protected static final int _turntable7 = 201;
  @AnyLogicInternalCodegenAPI
  protected static final int _conveyor40 = 202;
  @AnyLogicInternalCodegenAPI
  protected static final int _turntable8 = 203;
  @AnyLogicInternalCodegenAPI
  protected static final int _turntable9 = 204;
  @AnyLogicInternalCodegenAPI
  protected static final int _toSorter = 205;
  @AnyLogicInternalCodegenAPI
  protected static final int _shippingLabelingStation = 206;
  @AnyLogicInternalCodegenAPI
  protected static final int _scanner = 207;
  @AnyLogicInternalCodegenAPI
  protected static final int _transferTable14 = 208;
  @AnyLogicInternalCodegenAPI
  protected static final int _conveyor43 = 209;
  @AnyLogicInternalCodegenAPI
  protected static final int _exitLine1 = 210;
  @AnyLogicInternalCodegenAPI
  protected static final int _transferTable15 = 211;
  @AnyLogicInternalCodegenAPI
  protected static final int _conveyor45 = 212;
  @AnyLogicInternalCodegenAPI
  protected static final int _transferTable16 = 213;
  @AnyLogicInternalCodegenAPI
  protected static final int _exitLine2 = 214;
  @AnyLogicInternalCodegenAPI
  protected static final int _conveyor47 = 215;
  @AnyLogicInternalCodegenAPI
  protected static final int _transferTable17 = 216;
  @AnyLogicInternalCodegenAPI
  protected static final int _transferTable18 = 217;
  @AnyLogicInternalCodegenAPI
  protected static final int _conveyor49 = 218;
  @AnyLogicInternalCodegenAPI
  protected static final int _recirculationLine = 219;
  @AnyLogicInternalCodegenAPI
  protected static final int _transferTable1 = 220;
  @AnyLogicInternalCodegenAPI
  protected static final int _transferTable = 221;
  @AnyLogicInternalCodegenAPI
  protected static final int _conveyor = 222;
  @AnyLogicInternalCodegenAPI
  protected static final int _transferTable5 = 223;
  @AnyLogicInternalCodegenAPI
  protected static final int _transferTable4 = 224;
  @AnyLogicInternalCodegenAPI
  protected static final int _conveyor3 = 225;
  @AnyLogicInternalCodegenAPI
  protected static final int _transferTable19 = 226;
  @AnyLogicInternalCodegenAPI
  protected static final int _transferTable20 = 227;
  @AnyLogicInternalCodegenAPI
  protected static final int _conveyor4 = 228;
  @AnyLogicInternalCodegenAPI
  protected static final int _conveyor36 = 229;
  @AnyLogicInternalCodegenAPI
  protected static final int _packageLinesEntryPoint = 230;
  @AnyLogicInternalCodegenAPI
  protected static final int _turnStation = 231;
  @AnyLogicInternalCodegenAPI
  protected static final int _path3 = 232;
  @AnyLogicInternalCodegenAPI
  protected static final int _dishRack = 233;
  @AnyLogicInternalCodegenAPI
  protected static final int _asrs3Home = 234;
  @AnyLogicInternalCodegenAPI
  protected static final int _rackEnd3 = 235;
  @AnyLogicInternalCodegenAPI
  protected static final int _path2 = 236;
  @AnyLogicInternalCodegenAPI
  protected static final int _beverageRack = 237;
  @AnyLogicInternalCodegenAPI
  protected static final int _asrs2Home = 238;
  @AnyLogicInternalCodegenAPI
  protected static final int _rackEnd2 = 239;
  @AnyLogicInternalCodegenAPI
  protected static final int _foodRack = 240;
  @AnyLogicInternalCodegenAPI
  protected static final int _path = 241;
  @AnyLogicInternalCodegenAPI
  protected static final int _asrs1Home = 242;
  @AnyLogicInternalCodegenAPI
  protected static final int _rackEnd1 = 243;
  @AnyLogicInternalCodegenAPI
  protected static final int _path5 = 244;
  @AnyLogicInternalCodegenAPI
  protected static final int _point = 245;
  @AnyLogicInternalCodegenAPI
  protected static final int _path1 = 246;
  @AnyLogicInternalCodegenAPI
  protected static final int _path4 = 247;
  @AnyLogicInternalCodegenAPI
  protected static final int _path8 = 248;
  @AnyLogicInternalCodegenAPI
  protected static final int _path10 = 249;
  @AnyLogicInternalCodegenAPI
  protected static final int _point3 = 250;
  @AnyLogicInternalCodegenAPI
  protected static final int _attractor2 = 251;
  @AnyLogicInternalCodegenAPI
  protected static final int _attractor3 = 252;
  @AnyLogicInternalCodegenAPI
  protected static final int _forkliftsHome = 253;
  @AnyLogicInternalCodegenAPI
  protected static final int _robotUnloadLineStart = 254;
  @AnyLogicInternalCodegenAPI
  protected static final int _point1 = 255;
  @AnyLogicInternalCodegenAPI
  protected static final int _path13 = 256;
  @AnyLogicInternalCodegenAPI
  protected static final int _workerInfeedingLineStart = 257;
  @AnyLogicInternalCodegenAPI
  protected static final int _exitPalletConveyor = 258;
  @AnyLogicInternalCodegenAPI
  protected static final int _path6 = 259;
  @AnyLogicInternalCodegenAPI
  protected static final int _path7 = 260;
  @AnyLogicInternalCodegenAPI
  protected static final int _path9 = 261;
  @AnyLogicInternalCodegenAPI
  protected static final int _node = 262;
  @AnyLogicInternalCodegenAPI
  protected static final int _node1 = 263;
  @AnyLogicInternalCodegenAPI
  protected static final int _node2 = 264;
  @AnyLogicInternalCodegenAPI
  protected static final int _conveyor8 = 265;
  @AnyLogicInternalCodegenAPI
  protected static final int _conveyor2 = 266;
  @AnyLogicInternalCodegenAPI
  protected static final int _turntable11 = 267;
  @AnyLogicInternalCodegenAPI
  protected static final int _conveyor1 = 268;
  @AnyLogicInternalCodegenAPI
  protected static final int _conveyor10 = 269;
  @AnyLogicInternalCodegenAPI
  protected static final int _turntable12 = 270;
  @AnyLogicInternalCodegenAPI
  protected static final int _exitPalletLine = 271;
  @AnyLogicInternalCodegenAPI
  protected static final int _exitPalletLinePoint = 272;
  @AnyLogicInternalCodegenAPI
  protected static final int _conveyor7 = 273;
  @AnyLogicInternalCodegenAPI
  protected static final int _transferTable2 = 274;
  @AnyLogicInternalCodegenAPI
  protected static final int _turntable13 = 275;
  @AnyLogicInternalCodegenAPI
  protected static final int _conveyor5 = 276;
  @AnyLogicInternalCodegenAPI
  protected static final int _workerPalletLine = 277;
  @AnyLogicInternalCodegenAPI
  protected static final int _transferTable3 = 278;
  @AnyLogicInternalCodegenAPI
  protected static final int _dishPalletLinePickup = 279;
  @AnyLogicInternalCodegenAPI
  protected static final int _beveragePalletLinePickup = 280;
  @AnyLogicInternalCodegenAPI
  protected static final int _turntable10 = 281;
  @AnyLogicInternalCodegenAPI
  protected static final int _robotPalletLine = 282;
  @AnyLogicInternalCodegenAPI
  protected static final int _foodUnloadingPoint = 283;
  @AnyLogicInternalCodegenAPI
  protected static final int _emptyBeveragePalletStack = 284;
  @AnyLogicInternalCodegenAPI
  protected static final int _emptyDishPalletStack = 285;
  @AnyLogicInternalCodegenAPI
  protected static final int _workerHome = 286;
  @AnyLogicInternalCodegenAPI
  protected static final int _workerDishTrajectory = 287;
  @AnyLogicInternalCodegenAPI
  protected static final int _foodPickupStation = 288;
  @AnyLogicInternalCodegenAPI
  protected static final int _beveragePickupStation = 289;
  @AnyLogicInternalCodegenAPI
  protected static final int _dishPickupStation = 290;
  @AnyLogicInternalCodegenAPI
  protected static final int _packager1Home = 291;
  @AnyLogicInternalCodegenAPI
  protected static final int _packager2Home = 292;
  @AnyLogicInternalCodegenAPI
  protected static final int _packager3Home = 293;
  @AnyLogicInternalCodegenAPI
  protected static final int _robotTrajectory = 294;
  @AnyLogicInternalCodegenAPI
  protected static final int _robotHome = 295;
  @AnyLogicInternalCodegenAPI
  protected static final int _node3 = 296;
  @AnyLogicInternalCodegenAPI
  protected static final int _attractor4 = 297;
  @AnyLogicInternalCodegenAPI
  protected static final int _foodProductsDock = 298;
  @AnyLogicInternalCodegenAPI
  protected static final int _attractor1 = 299;
  @AnyLogicInternalCodegenAPI
  protected static final int _beverageDock = 300;
  @AnyLogicInternalCodegenAPI
  protected static final int _attractor = 301;
  @AnyLogicInternalCodegenAPI
  protected static final int _dishDock = 302;
  @AnyLogicInternalCodegenAPI
  protected static final int _workerBeverageTrajectory = 303;
  @AnyLogicInternalCodegenAPI
  protected static final int _storageTank = 304;
  @AnyLogicInternalCodegenAPI
  protected static final int _pipe = 305;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 306;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return true;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline6_pointsDX_xjal() {
    return new double[] { 0.0, 5.0, -8.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline6_pointsDY_xjal() {
    return new double[] { 0.0, -5.0, -11.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline6_pointsDZ_xjal() {
    return new double[] { 0.0, -1.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline5_pointsDX_xjal() {
    return new double[] { 0.0, 5.0, -8.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline5_pointsDY_xjal() {
    return new double[] { 0.0, -5.0, -11.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline5_pointsDZ_xjal() {
    return new double[] { 0.0, -1.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline4_pointsDX_xjal() {
    return new double[] { 0.0, 5.0, -8.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline4_pointsDY_xjal() {
    return new double[] { 0.0, -5.0, -11.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline4_pointsDZ_xjal() {
    return new double[] { 0.0, -1.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline_pointsDX_xjal() {
    return new double[] { 0.0, 60.0, 80.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline_pointsDY_xjal() {
    return new double[] { 0.0, 0.0, -30.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline1_pointsDX_xjal() {
    return new double[] { 0.0, 60.0, 80.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline1_pointsDY_xjal() {
    return new double[] { 0.0, 0.0, -30.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline1_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline2_pointsDX_xjal() {
    return new double[] { 0.0, 60.0, 40.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline2_pointsDY_xjal() {
    return new double[] { 0.0, 0.0, 20.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline2_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline3_pointsDX_xjal() {
    return new double[] { 0.0, 50.0, 170.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline3_pointsDY_xjal() {
    return new double[] { 0.0, 30.0, 30.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline3_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline8_pointsDX_xjal() {
    return new double[] { 0.0, 70.0, 120.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline8_pointsDY_xjal() {
    return new double[] { 0.0, 0.0, 20.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline8_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline9_pointsDX_xjal() {
    return new double[] { 0.0, 70.0, 170.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline9_pointsDY_xjal() {
    return new double[] { 0.0, 0.0, 40.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline9_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline10_pointsDX_xjal() {
    return new double[] { 0.0, 70.0, 230.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline10_pointsDY_xjal() {
    return new double[] { 0.0, 0.0, 70.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline10_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline7_pointsDX_xjal() {
    return new double[] { 0.0, 20.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline7_pointsDY_xjal() {
    return new double[] { 0.0, 10.0, 20.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline7_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_network_xjal() {
	  network.addAll(path3, dishRack, asrs3Home, rackEnd3);
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_network1_xjal() {
	  network1.addAll(path2, beverageRack, asrs2Home, rackEnd2);
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_network2_xjal() {
	  network2.addAll(foodRack, path, asrs1Home, rackEnd1);
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_network3_xjal() {
	  network3.addAll(path5, point, path1, path4, path8, path10, point3, forkliftsHome, robotUnloadLineStart, point1, path13, workerInfeedingLineStart, exitPalletConveyor, path6, path7, path9, node, node1, node2);
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_network4_xjal() {
	  network4.addAll(workerHome, workerDishTrajectory);
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_network5_xjal() {
	  network5.addAll(robotTrajectory, robotHome, node3);
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_network6_xjal() {
	  network6.addAll(workerBeverageTrajectory);
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll(rectangle5, pickingWorkplace2, pickingWorkplace1, pickingWorkplace, conveyorNetwork1, conveyorNetwork2, network, network1, network2, network3, conveyorNetwork, camera, emptyBeveragePalletStack, emptyDishPalletStack, network4, foodPickupStation, beveragePickupStation, dishPickupStation, groupMarks, groupMainMenu, robot_1, polyline7, line6, storedItems_presentation, packager1Home, packager2Home, packager3Home, text9, text10, text11, text12, text13, line7, network5, foodProductsDock, beverageDock, dishDock, robotUpperSegment, text14, text19, text25, group, group2, group5, group6, group7, officeWorker, officeWorker1, officeWorker2, officeWorker3, window3d, ordersStates, storedItemsStatesChart, network6, drying_chamber_closed, pasting_machine1, storageTank, pipe, plate_enveloper1, inline_scanner, plate_enveloper2);
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_conveyorNetwork1_xjal() {
	  conveyorNetwork1.addAll(turntable, infeedLineFood, foodMergePoint, infeedMergeConveyor, turntable1, turntable2, mergeToFoodRack, toFoodRack, mergeToBeverageRack, toDishRack, turntable3, toBeverageRack, beveragesAndDishesLine1, beverageDishMergePoint, beveragesAndDishesLine, conveyorPointNode);
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_conveyorNetwork2_xjal() {
	  conveyorNetwork2.addAll(foodPickInLine, transferTable6, conveyor18, cartonInitialLine, labelingStation, invoiceStation, foodPickOutLine, toBeveragePick, transferTable7, transferTable8, beveragePickInLine, conveyor22, transferTable9, beveragePickOutLine, toDishPick, dishPickInLine, conveyor26, transferTable10, transferTable11, conveyor28, checkOrderStation, dishPickOutLine, returnToPickingLine, transferTable13, toFoodPick, pickingLinesStart, conveyor30, transferTable12, conveyor32, turntable4, conveyor34, turntable5, conveyor35, turntable6, packagingLine1, station, packagingLine2, station1, packagingLine3, station2, conveyor33, conveyor39, turntable7, conveyor40, turntable8, turntable9, toSorter, shippingLabelingStation, scanner, transferTable14, conveyor43, exitLine1, transferTable15, conveyor45, transferTable16, exitLine2, conveyor47, transferTable17, transferTable18, conveyor49, recirculationLine, transferTable1, transferTable, conveyor, transferTable5, transferTable4, conveyor3, transferTable19, transferTable20, conveyor4, conveyor36, packageLinesEntryPoint, turnStation);
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_conveyorNetwork_xjal() {
	  conveyorNetwork.addAll(conveyor8, conveyor2, turntable11, conveyor1, conveyor10, turntable12, exitPalletLine, exitPalletLinePoint, conveyor7, transferTable2, turntable13, conveyor5, workerPalletLine, transferTable3, dishPalletLinePickup, beveragePalletLinePickup, turntable10, robotPalletLine, foodUnloadingPoint);
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _infeedLineFood_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentArc( 100.0, 300.0, 30.0, 100.0, 220.0, 30.0, 0.0, 3.098830228490688, 1.2499822675648344,
			1224.1622266430531, 300.0, 1124.1622266430531, -3.141592653589793, 0.026712465104130504,
			-618.8265048445217, 250.75751484546421, 719.4842380389301, -6.256472842075455, -0.06947489020323708 ),
       new MarkupSegmentArc( 100.0, 220.0, 30.0, 120.0, 200.0, 30.0, -0.04281237857498299, 4.71238898038469, 1.0000163248667493,
			119.1701690558884, 219.17877766430587, 19.187750982227794, -3.1844050321647757, 1.6352347203055586,
			120.0, 180.81287547738788, 19.187124522612137, -4.69076296544901, -0.021626014935680032 ),
       new MarkupSegmentLine( 120.0, 200.0, 30.0, 420.0, 200.0, 30.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _infeedMergeConveyor_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 440.0, 200.0, 30.0, 650.0, 200.0, 30.0 ),
       new MarkupSegmentArc( 650.0, 200.0, 30.0, 680.0, 180.0, 30.0, 1.5707963267948966, 3.7296174450915167, 0.9999975800087845,
			650.0, 168.0644930772741, 31.935506922725885, -4.71238898038469, -1.0880330062343277,
			706.5716834832255, 197.71530727106247, 31.935661490579392, -2.6588293330292245, 0.10526147094115477 ),
       new MarkupSegmentLine( 680.0, 180.0, 30.0, 685.5278640450005, 158.94427190999915, 30.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _mergeToFoodRack_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 699.9999320646771, 149.9253574604252, 30.0, 750.0339320646771, 149.1763574604252, 30.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _toFoodRack_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 768.321, 155.547, 30.0, 790.0, 170.0, 25.0 ),
       new MarkupSegmentArc( 790.0, 170.0, 25.0, 800.0, 190.0, 20.0, 2.15882111829662, 0.0, 1.0000024199970716,
			777.5195934404693, 188.71970989650978, 22.498624102390426, -0.982771535293173, 1.0112280756528866,
			822.4985152095768, 190.0, 22.498515209576812, -3.1131361132300843, -0.028456540359708706 ),
       new MarkupSegmentLine( 800.0, 190.0, 20.0, 800.0, 290.0, 0.0 ),
       new MarkupSegmentLine( 800.0, 290.0, 0.0, 800.0, 310.0, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _mergeToBeverageRack_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 770.0, 150.0, 30.0, 810.0, 150.0, 30.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _toDishRack_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 830.0, 150.0, 30.0, 900.0, 150.0, 30.0 ),
       new MarkupSegmentArc( 900.0, 150.0, 30.0, 920.0, 170.0, 25.0, 1.5707963267948966, 0.019201480578232788, 1.000015660367863,
			900.0, 130.37436564918886, 19.625634350811143, -4.71238898038469, -0.009645799153357225,
			900.3785980544314, 169.62319372138936, 19.625019675943282, -1.580442125948253, 1.5996436065264839 ),
       new MarkupSegmentLine( 920.0, 170.0, 25.0, 920.0, 188.0, 20.0 ),
       new MarkupSegmentLine( 920.0, 188.0, 20.0, 920.0, 290.0, 0.0 ),
       new MarkupSegmentLine( 920.0, 290.0, 0.0, 920.0, 310.0, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _toBeverageRack_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 828.321, 155.547, 30.0, 850.0, 170.0, 25.0 ),
       new MarkupSegmentArc( 850.0, 170.0, 25.0, 860.0, 190.0, 20.0, 2.15882111829662, 0.0, 0.9999999999999997,
			837.5195934925483, 188.71970981839513, 22.4986240085069, -0.9827715352931731, 1.0112280086252683,
			882.4986240085069, 190.0, 22.498624008506912, -3.1131361802576984, -0.028456473332094813 ),
       new MarkupSegmentLine( 860.0, 190.0, 20.0, 860.0, 290.0, 0.0 ),
       new MarkupSegmentLine( 860.0, 290.0, 0.0, 860.0, 310.0, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _beveragesAndDishesLine1_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 380.0, 550.0, 15.0, 290.01, 550.099, 15.0 ),
       new MarkupSegmentArc( 290.01, 550.099, 15.0, 270.01, 530.099, 20.0, 4.71238898038469, 3.141592653589793, 1.0,
			290.01, 570.099, 20.0, -1.5707963267948966, -0.0,
			290.01, 530.099, 20.0, -4.71238898038469, 1.5707963267948966 ),
       new MarkupSegmentLine( 270.01, 530.099, 20.0, 273.01, 250.099, 25.0 ),
       new MarkupSegmentLine( 273.01, 250.099, 25.0, 305.0, 235.0, 30.0 ),
       new MarkupSegmentLine( 305.0, 235.0, 30.0, 415.0, 230.0, 30.0 ),
       new MarkupSegmentLine( 415.0, 230.0, 30.0, 425.52786404500046, 208.9442719099992, 30.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _beveragesAndDishesLine_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 400.0, 400.0, 15.0, 400.0, 530.0, 15.0 ),
       new MarkupSegmentArc( 400.0, 530.0, 15.0, 380.0, 550.0, 15.0, 3.141592653589793, 1.5707963267948966, 1.0,
			420.0, 530.0, 20.0, -3.141592653589793, -0.0,
			380.0, 530.0, 20.0, -0.0, 1.5707963267948966 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _foodPickInLine_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 840.0, 546.25, 6.0, 840.0, 483.75, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _conveyor18_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 845.0, 550.0, 6.0, 855.0, 550.0, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _cartonInitialLine_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 500.0, 550.0, 6.0, 745.0, 550.0, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _foodPickOutLine_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 860.0, 485.0, 6.0, 860.0, 545.0, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _toBeveragePick_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 865.0, 550.0, 6.0, 895.0, 550.0, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _beveragePickInLine_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 900.0, 545.0, 6.0, 900.0, 485.0, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _conveyor22_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 905.0, 550.0, 6.0, 915.0, 550.0, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _beveragePickOutLine_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 920.0, 485.0, 6.0, 920.0, 545.0, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _toDishPick_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 925.0, 550.0, 6.0, 955.0, 550.0, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _dishPickInLine_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 960.0, 545.0, 6.0, 960.0, 485.0, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _conveyor26_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 965.0, 550.0, 6.0, 975.0, 550.0, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _conveyor28_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 985.0, 550.0, 6.0, 1095.0, 550.0, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _dishPickOutLine_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 980.0, 485.0, 6.0, 980.0, 545.0, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _returnToPickingLine_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 1100.0, 555.0, 6.0, 1100.0, 580.0, 6.0 ),
       new MarkupSegmentArc( 1100.0, 580.0, 6.0, 1080.0, 600.0, 6.0, 3.338948990677941, 1.5707963267948966, 1.000011863129633,
			1119.4024441605297, 583.879697380172, 19.786533075912757, -2.944236316501646, -0.10458951551586584,
			1080.0, 580.2139363761472, 19.7860636238528, -6.190418485607305, 1.4780295052226153 ),
       new MarkupSegmentLine( 1080.0, 600.0, 6.0, 770.0, 600.0, 6.0 ),
       new MarkupSegmentArc( 770.0, 600.0, 6.0, 750.0, 580.0, 6.0, 4.71238898038469, 3.141592653589793, 1.0,
			770.0, 620.0, 20.0, -1.5707963267948966, -0.0,
			770.0, 580.0, 20.0, -4.71238898038469, 1.5707963267948966 ),
       new MarkupSegmentLine( 750.0, 580.0, 6.0, 750.0, 555.0, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _toFoodPick_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 755.0, 550.0, 6.0, 836.25, 550.0, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _conveyor30_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 1105.0, 550.0, 6.0, 1136.25, 550.0, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _conveyor32_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 1144.673, 494.721, 6.0, 1104.759, 455.935, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _conveyor34_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 1093.805, 445.691, 6.0, 1057.452, 412.94399999999996, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _conveyor35_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 1044.468, 401.212, 6.0, 1030.0, 390.0, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _packagingLine1_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 1146.733, 490.549, 6.0, 1150.0, 290.0, 6.0 ),
       new MarkupSegmentArc( 1150.0, 290.0, 6.0, 1140.0, 270.0, 6.0, 0.004439970824217099, 2.214297435588181, 1.0000098567514224,
			1125.2203472718836, 289.8899783418872, 24.779896974993655, -6.278745336355387, -0.9339600971975358,
			1154.8676450901878, 250.17647321308272, 24.779408483646566, -4.071112779963128, 0.002224908371722886 ),
       new MarkupSegmentLine( 1140.0, 270.0, 6.0, 1108.0, 255.99999999999997, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _packagingLine2_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 1099.958, 440.725, 6.0, 1100.0, 290.0, 6.0 ),
       new MarkupSegmentArc( 1100.0, 290.0, 6.0, 1090.0, 270.0, 6.0, 3.199999890772798E-4, 2.214297435588181, 1.0000000511999987,
			1075.015991363992, 289.99200511723654, 24.984009915189258, -6.282865307190309, -0.9277752435833808,
			1104.9904044140962, 250.0127941145385, 24.984007356826897, -4.069047897183896, 1.6002559249148906E-4 ),
       new MarkupSegmentLine( 1090.0, 270.0, 6.0, 1058.0, 256.0, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _packagingLine3_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 1049.572, 398.194, 6.0, 1050.0, 290.0, 6.0 ),
       new MarkupSegmentArc( 1050.0, 290.0, 6.0, 1040.0, 270.0, 6.0, 0.004839962207229709, 2.2142974355881804, 1.0000117127314059,
			1025.2400371975912, 289.88016178003636, 24.76025280920263, -6.278345344972377, -0.9345610106687211,
			1054.8558036794068, 250.1922617607908, 24.75967279901152, -4.071313702051305, 0.0024258304598996183 ),
       new MarkupSegmentLine( 1040.0, 270.0, 6.0, 1007.9999999999999, 256.0, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _conveyor33_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 1185.0, 250.0, 6.0, 1110.0, 250.0, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _conveyor39_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 1090.0, 250.0, 6.0, 1060.0, 250.0, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _conveyor40_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 1040.0, 250.0, 6.0, 1010.0, 250.0, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _toSorter_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 990.0, 250.0, 6.0, 970.0, 250.0, 6.0 ),
       new MarkupSegmentArc( 970.0, 250.0, 6.0, 950.0, 230.0, 6.0, 4.71238898038469, 3.141592653589793, 1.0,
			970.0, 270.0, 20.0, -1.5707963267948966, -0.0,
			970.0, 230.0, 20.0, -4.71238898038469, 1.5707963267948966 ),
       new MarkupSegmentLine( 950.0, 230.0, 6.0, 950.0, 70.0, 6.0 ),
       new MarkupSegmentArc( 950.0, 70.0, 6.0, 970.0, 50.0, 6.0, 0.0, 4.71238898038469, 1.0,
			930.0, 70.0, 20.0, -0.0, -0.0,
			970.0, 70.0, 20.0, -3.141592653589793, 1.5707963267948966 ),
       new MarkupSegmentLine( 970.0, 50.0, 6.0, 1240.0, 50.0, 6.0 ),
       new MarkupSegmentArc( 1240.0, 50.0, 6.0, 1270.0, 80.0, 6.0, 1.5707963267948966, 0.0, 1.0,
			1240.0, 20.0, 30.0, -4.71238898038469, -0.0,
			1240.0, 80.0, 30.0, -1.5707963267948966, 1.5707963267948966 ),
       new MarkupSegmentLine( 1270.0, 80.0, 6.0, 1270.0, 145.0, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _conveyor43_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 1270.0, 155.0, 6.0, 1270.0, 245.0, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _exitLine1_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 1275.0, 150.0, 6.0, 1380.0, 150.0, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _conveyor45_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 1270.0, 255.0, 6.0, 1270.0, 345.0, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _exitLine2_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 1275.0, 250.0, 6.0, 1380.0, 250.0, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _conveyor47_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 1270.0, 355.0, 6.0, 1270.0, 445.0, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _conveyor49_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 1270.0, 455.0, 6.0, 1270.0, 550.0, 6.0 ),
       new MarkupSegmentArc( 1270.0, 550.0, 6.0, 1250.0, 550.0, 6.0, 3.141592653589793, 3.141592653589793, 1.0,
			1280.0, 550.0, 10.0, -3.141592653589793, -0.0,
			1260.0, 550.0, 10.0, -0.0, 3.141592653589793 ),
       new MarkupSegmentLine( 1250.0, 550.0, 6.0, 1250.0, 270.0, 6.0 ),
       new MarkupSegmentArc( 1250.0, 270.0, 6.0, 1230.0, 250.0, 6.0, -0.21071618032607597, 1.5707963267948966, 0.9999985999990202,
			1269.3176812301917, 265.86811653157145, 19.75462652413293, -3.352308833915868, 0.11218595561168346,
			1230.0, 269.75468183724206, 19.75468183724207, -0.09853022471439167, -1.472266102080505 ),
       new MarkupSegmentLine( 1230.0, 250.0, 6.0, 1195.0, 250.0, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _conveyor_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 845.0, 480.0, 6.0, 855.0, 480.0, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _conveyor3_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 905.0, 480.0, 6.0, 915.0, 480.0, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _conveyor4_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 965.0, 480.0, 6.0, 975.0, 480.0, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _conveyor36_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 1143.75, 550.0, 6.0, 1170.0, 550.0, 6.0 ),
       new MarkupSegmentArc( 1170.0, 550.0, 6.0, 1180.0, 530.0, 6.0, 1.5707963267948966, 2.289648903772182, 1.0000024280088429,
			1170.0, 561.4858499971562, 11.48584999715617, -1.5707963267948966, 0.10625914571407481,
			1172.436356424466, 538.6437702867091, 11.485794221868577, -4.6061298346706145, -2.5289992223265827 ),
       new MarkupSegmentLine( 1180.0, 530.0, 6.0, 1155.3029999999999, 505.303, 6.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _path3_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 920.0, 320.0, 0.0, 920.0, 470.0, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _path2_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 860.0, 320.0, 0.0, 860.0, 470.0, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _path_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 800.0, 320.0, 0.0, 800.0, 470.0, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _path5_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 120.0, 600.0, 0.0, 210.0, 600.0, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _path1_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 60.0, 600.0, 0.0, 80.0, 600.0, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _path4_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 100.0, 580.0, 0.0, 100.0, 550.0, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _path8_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 230.0, 580.0, 0.0, 230.0, 550.0, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _path10_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 300.0, 580.0, 0.0, 300.0, 550.0, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private Attractor[] _forkliftsHome_attractors_xjal() {
    return new Attractor[] {
        attractor2, attractor3, 
    };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _path13_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 250.0, 600.0, 0.0, 280.0, 600.0, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _path6_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 100.0, 620.0, 0.0, 100.0, 650.0, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _path7_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 230.0, 620.0, 0.0, 230.0, 650.0, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _path9_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 300.0, 620.0, 0.0, 300.0, 650.0, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _conveyor8_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 285.0, 350.0, 1.0, 245.0, 350.0, 1.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _conveyor2_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 169.19, 364.978, 1.0, 170.0, 540.0, 1.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _conveyor1_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 115.0, 350.0, 1.0, 155.0, 350.0, 1.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _conveyor10_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 185.0, 350.0, 1.0, 215.0, 350.0, 1.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _exitPalletLine_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 230.78838249684145, 364.97926743998767, 1.0, 230.00038249684144, 540.0002674399876, 1.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _conveyor7_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 300.0, 392.5, 1.0, 300.0, 365.0, 1.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _conveyor5_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 300.0, 432.5, 1.0, 300.0, 407.5, 1.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _workerPalletLine_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 300.0, 540.0, 1.0, 300.0, 447.5, 1.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _dishPalletLinePickup_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 307.5, 440.0, 1.0, 390.0, 440.0, 1.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _beveragePalletLinePickup_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 305.0, 400.0, 1.0, 390.0, 400.0, 1.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _robotPalletLine_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 100.0, 540.0, 1.0, 100.0, 365.0, 1.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _workerDishTrajectory_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 380.0, 420.0, 2.0, 400.0, 430.0, 7.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _robotTrajectory_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 100.0, 400.0, 30.0, 100.0, 400.0, 40.0 ),
       new MarkupSegmentLine( 100.0, 400.0, 40.0, 100.0, 300.0, 40.0 ),
       new MarkupSegmentLine( 100.0, 300.0, 40.0, 100.0, 300.0, 30.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  private Attractor[] _foodProductsDock_attractors_xjal() {
    return new Attractor[] {
        attractor4, 
    };
  }
  @AnyLogicInternalCodegenAPI
  private Attractor[] _beverageDock_attractors_xjal() {
    return new Attractor[] {
        attractor1, 
    };
  }
  @AnyLogicInternalCodegenAPI
  private Attractor[] _dishDock_attractors_xjal() {
    return new Attractor[] {
        attractor, 
    };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _workerBeverageTrajectory_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 390.0, 410.0, 2.0, 400.0, 400.0, 4.0 ), };
  }
	@AnyLogicInternalCodegenAPI
	private static MarkupSegment[] _pipe_segments_xjal() {
	  return new MarkupSegment[] {      
		new MarkupSegmentLine
		(
			100.0, 120.0, 30.0,
			100.0, 150.0, 30.0
		),	      
		new MarkupSegmentLine
		(
			100.0, 150.0, 30.0,
			130.0, 160.0, 30.0
		),	      
		new MarkupSegmentLine
		(
			130.0, 160.0, 30.0,
			130.0, 195.0, 30.0
		),				
	};
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean onShapeClick( int _shape, int index, double clickx, double clicky ){
    switch( _shape ){
      case _rectangle127:
        if (true) {
          ShapeRectangle self = this.rectangle127;
          
navigate( view3D ); 
        }
        break;
      case _rectangle128:
        if (true) {
          ShapeRectangle self = this.rectangle128;
          
navigate( view2D ); 
        }
        break;
      case _rectangle129:
        if (true) {
          ShapeRectangle self = this.rectangle129;
          
navigate( viewLogic ); 
        }
        break;
      case _rectangle130:
        if (true) {
          ShapeRectangle self = this.rectangle130;
          
navigate( viewStatistics); 
        }
        break;
      default: return super.onShapeClick( _shape, index, clickx, clicky );
 	}
 	return false;
  }
  
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double _ordersStates_DataItem0Value() {
    return 
count(orders, order -> order.unavailableItems.isEmpty()) 
;
  }
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double _ordersStates_DataItem1Value() {
    return 
count(orders, order -> !order.unavailableItems.isEmpty()) 
;
  }
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double _storedItemsStatesChart_DataItem0Value() {
    return 
storedItems.unreservedItems() 
;
  }
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double _storedItemsStatesChart_DataItem1Value() {
    return 
storedItems.reservedItems() 
;
  }
  protected ShapeWindow3D window3d;
  protected Histogram itemStoringTimeHist;
  protected Histogram orderProcessingTimeHist;
  protected Histogram amountOfItemsPerOrder;
  protected BarChart ordersStates;
  protected BarChart storedItemsStatesChart;
  protected ShapeRectangle rectangle5;
  protected Shape3DObject table_4;
  protected Shape3DObject person2;
  protected Shape3DObject monitor_on2;
  protected Shape3DObject computer_on2;
  protected ShapePolyLine polyline6;
  protected ShapeLine line4;
  protected ShapeLine line5;
  protected ShapeGroup pickingWorkplace2;
  protected Shape3DObject table_3;
  protected Shape3DObject person1;
  protected Shape3DObject monitor_on1;
  protected Shape3DObject computer_on1;
  protected ShapePolyLine polyline5;
  protected ShapeLine line2;
  protected ShapeLine line3;
  protected ShapeGroup pickingWorkplace1;
  protected Shape3DObject table_2;
  protected Shape3DObject person;
  protected Shape3DObject monitor_on;
  protected Shape3DObject computer_on;
  protected ShapePolyLine polyline4;
  protected ShapeLine line;
  protected ShapeLine line1;
  protected ShapeGroup pickingWorkplace;
  protected Camera3D camera;
  protected ShapeRectangle rectangle4;
  protected ShapeRectangle rectangle;
  protected ShapeText text;
  protected ShapeRectangle rectangle1;
  protected ShapeText text1;
  protected ShapeText text2;
  protected ShapeText text3;
  protected ShapePolyLine polyline;
  protected ShapePolyLine polyline1;
  protected ShapeText text4;
  protected ShapePolyLine polyline2;
  protected ShapeRectangle rectangle2;
  protected ShapeText text5;
  protected ShapeText text6;
  protected ShapePolyLine polyline3;
  protected ShapeRectangle rectangle3;
  protected ShapeText text7;
  protected ShapeText text8;
  protected ShapeText text29;
  protected ShapePolyLine polyline8;
  protected ShapeText text30;
  protected ShapePolyLine polyline9;
  protected ShapeText text31;
  protected ShapePolyLine polyline10;
  protected ShapeGroup groupMarks;
  protected ShapeRectangle rectangle116;
  protected ShapeRectangle rectangle117;
  protected ShapeText text85;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _rectangle127_SetDynamicParams_xjal( ShapeRectangle shape ) {
    shape.setFillColor(
selectedViewArea == view3D ? 
	dodgerBlue :
	new Color(129, 195, 255) 
);
  }
  
  protected ShapeRectangle rectangle127;
  protected ShapeText text113;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _rectangle128_SetDynamicParams_xjal( ShapeRectangle shape ) {
    shape.setFillColor(
selectedViewArea == view2D ? 
	dodgerBlue :
	new Color(129, 195, 255) 
);
  }
  
  protected ShapeRectangle rectangle128;
  protected ShapeText text114;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _rectangle129_SetDynamicParams_xjal( ShapeRectangle shape ) {
    shape.setFillColor(
selectedViewArea == viewLogic ? 
	dodgerBlue :
	new Color(129, 195, 255) 
);
  }
  
  protected ShapeRectangle rectangle129;
  protected ShapeText text115;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _rectangle130_SetDynamicParams_xjal( ShapeRectangle shape ) {
    shape.setFillColor(
selectedViewArea == viewStatistics ? 
	dodgerBlue :
	new Color(129, 195, 255) 
);
  }
  
  protected ShapeRectangle rectangle130;
  protected ShapeText text116;
  protected ShapeGroup groupMainMenu;
  protected Shape3DObject robot_1;
  protected ShapePolyLine polyline7;
  protected ShapeLine line6;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  protected ShapeEmbeddedObjectPresentation _storedItems_presentation_createShapeWithStaticProperties_xjal( final Agent _a, final int _index ) {
    ShapeEmbeddedObjectPresentation shape = new ShapeEmbeddedObjectPresentation( Main.this, SHAPE_DRAW_2D3D, true, 0.0, 0.0, 1.0, 0.0,
		false, true, _a );

    return shape;
  }

  protected ShapeAgentPopulationGroup storedItems_presentation;
  protected ShapeText text9;
  protected ShapeText text10;
  protected ShapeText text11;
  protected ShapeText text12;
  protected ShapeText text13;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _line7_SetDynamicParams_xjal( ShapeLine shape ) {
    shape.setZ(
pickupRobot.iterator().next().getZ() + 4 
);
    shape.setDx(
pickupRobot.iterator().next().getX() - 125 
);
    shape.setDy(
pickupRobot.iterator().next().getY() - 382 
);
    shape.setDz(
0 
);
  }
  
  protected ShapeLine line7;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _robotUpperSegment_SetDynamicParams_xjal( ShapeOval shape ) {
    shape.setZHeight(
pickupRobot.iterator().next().getZ() - 20 
);
  }
  
  protected ShapeOval robotUpperSegment;
  protected ShapeText text14;
  protected ShapeText text19;
  protected ShapeText text25;
  protected ShapeText text23;
  protected ShapeGroup group;
  protected ShapeText text21;
  protected ShapeGroup group2;
  protected ShapeText text17;
  protected ShapeGroup group5;
  protected ShapeText text27;
  protected ShapeLine line8;
  protected ShapeLine line9;
  protected ShapeGroup group6;
  protected ShapeText text28;
  protected ShapeLine line10;
  protected ShapeLine line11;
  protected ShapeGroup group7;
  protected Shape3DObject table;
  protected Shape3DObject chair;
  protected Shape3DObject person_sitting;
  protected Shape3DObject computer_on3;
  protected Shape3DObject monitor_on3;
  protected Shape3DObject keyboard;
  protected Shape3DObject phone;
  protected Shape3DObject monitor_on4;
  protected Shape3DObject monitor_on5;
  protected ShapeGroup officeWorker;
  protected Shape3DObject table1;
  protected Shape3DObject chair1;
  protected Shape3DObject person_sitting1;
  protected Shape3DObject computer_on4;
  protected Shape3DObject monitor_on6;
  protected Shape3DObject keyboard1;
  protected Shape3DObject phone1;
  protected Shape3DObject monitor_on7;
  protected Shape3DObject monitor_on8;
  protected ShapeGroup officeWorker1;
  protected Shape3DObject table2;
  protected Shape3DObject chair2;
  protected Shape3DObject person_sitting2;
  protected Shape3DObject computer_on5;
  protected Shape3DObject monitor_on9;
  protected Shape3DObject keyboard2;
  protected Shape3DObject phone2;
  protected Shape3DObject monitor_on10;
  protected Shape3DObject monitor_on11;
  protected ShapeGroup officeWorker2;
  protected Shape3DObject table3;
  protected Shape3DObject chair3;
  protected Shape3DObject person_sitting3;
  protected Shape3DObject computer_on6;
  protected Shape3DObject monitor_on12;
  protected Shape3DObject keyboard3;
  protected Shape3DObject phone3;
  protected Shape3DObject monitor_on13;
  protected Shape3DObject monitor_on14;
  protected ShapeGroup officeWorker3;
  protected Shape3DObject drying_chamber_closed;
  protected Shape3DObject pasting_machine1;
  protected Shape3DObject plate_enveloper1;
  protected Shape3DObject inline_scanner;
  protected Shape3DObject plate_enveloper2;
  protected ConveyorTurntable<Item> turntable;
  protected ConveyorPath<Item> infeedLineFood;
  protected PositionOnConveyor<Item> foodMergePoint;
  protected ConveyorPath<Item> infeedMergeConveyor;
  protected ConveyorTurntable<Item> turntable1;
  protected ConveyorTurntable<Item> turntable2;
  protected ConveyorPath<Item> mergeToFoodRack;
  protected ConveyorPath<Item> toFoodRack;
  protected ConveyorPath<Item> mergeToBeverageRack;
  protected ConveyorPath<Item> toDishRack;
  protected ConveyorTurntable<Item> turntable3;
  protected ConveyorPath<Item> toBeverageRack;
  protected ConveyorPath<Item> beveragesAndDishesLine1;
  protected PositionOnConveyor<Item> beverageDishMergePoint;
  protected ConveyorPath<Item> beveragesAndDishesLine;
  protected ConveyorPointNode conveyorPointNode;
  protected ConveyorPath<Carton> foodPickInLine;
  protected ConveyorTransferTable<Carton> transferTable6;
  protected ConveyorPath<Carton> conveyor18;
  protected ConveyorPath<Carton> cartonInitialLine;
  protected ConveyorSimpleStation<Carton> labelingStation;
  protected ConveyorSimpleStation<Carton> invoiceStation;
  protected ConveyorPath<Carton> foodPickOutLine;
  protected ConveyorPath<Carton> toBeveragePick;
  protected ConveyorTransferTable<Carton> transferTable7;
  protected ConveyorTransferTable<Carton> transferTable8;
  protected ConveyorPath<Carton> beveragePickInLine;
  protected ConveyorPath<Carton> conveyor22;
  protected ConveyorTransferTable<Carton> transferTable9;
  protected ConveyorPath<Carton> beveragePickOutLine;
  protected ConveyorPath<Carton> toDishPick;
  protected ConveyorPath<Carton> dishPickInLine;
  protected ConveyorPath<Carton> conveyor26;
  protected ConveyorTransferTable<Carton> transferTable10;
  protected ConveyorTransferTable<Carton> transferTable11;
  protected ConveyorPath<Carton> conveyor28;
  protected ConveyorSimpleStation<Carton> checkOrderStation;
  protected ConveyorPath<Carton> dishPickOutLine;
  protected ConveyorPath<Carton> returnToPickingLine;
  protected ConveyorTransferTable<Carton> transferTable13;
  protected ConveyorPath<Carton> toFoodPick;
  protected PositionOnConveyor<Carton> pickingLinesStart;
  protected ConveyorPath<Carton> conveyor30;
  protected ConveyorTransferTable<Carton> transferTable12;
  protected ConveyorPath<Carton> conveyor32;
  protected ConveyorTurntable<Carton> turntable4;
  protected ConveyorPath<Carton> conveyor34;
  protected ConveyorTurntable<Carton> turntable5;
  protected ConveyorPath<Carton> conveyor35;
  protected ConveyorTurntable<Carton> turntable6;
  protected ConveyorPath<Carton> packagingLine1;
  protected ConveyorSimpleStation<Carton> station;
  protected ConveyorPath<Carton> packagingLine2;
  protected ConveyorSimpleStation<Carton> station1;
  protected ConveyorPath<Carton> packagingLine3;
  protected ConveyorSimpleStation<Carton> station2;
  protected ConveyorPath<Carton> conveyor33;
  protected ConveyorPath<Carton> conveyor39;
  protected ConveyorTurntable<Carton> turntable7;
  protected ConveyorPath<Carton> conveyor40;
  protected ConveyorTurntable<Carton> turntable8;
  protected ConveyorTurntable<Carton> turntable9;
  protected ConveyorPath<Carton> toSorter;
  protected ConveyorSimpleStation<Carton> shippingLabelingStation;
  protected PositionOnConveyor<Carton> scanner;
  protected ConveyorTransferTable<Carton> transferTable14;
  protected ConveyorPath<Carton> conveyor43;
  protected ConveyorPath<Carton> exitLine1;
  protected ConveyorTransferTable<Carton> transferTable15;
  protected ConveyorPath<Carton> conveyor45;
  protected ConveyorTransferTable<Carton> transferTable16;
  protected ConveyorPath<Carton> exitLine2;
  protected ConveyorPath<Carton> conveyor47;
  protected ConveyorTransferTable<Carton> transferTable17;
  protected ConveyorTransferTable<Carton> transferTable18;
  protected ConveyorPath<Carton> conveyor49;
  protected PositionOnConveyor<Carton> recirculationLine;
  protected ConveyorTransferTable<Carton> transferTable1;
  protected ConveyorTransferTable<Carton> transferTable;
  protected ConveyorPath<Carton> conveyor;
  protected ConveyorTransferTable<Carton> transferTable5;
  protected ConveyorTransferTable<Carton> transferTable4;
  protected ConveyorPath<Carton> conveyor3;
  protected ConveyorTransferTable<Carton> transferTable19;
  protected ConveyorTransferTable<Carton> transferTable20;
  protected ConveyorPath<Carton> conveyor4;
  protected ConveyorPath<Carton> conveyor36;
  protected PositionOnConveyor<Carton> packageLinesEntryPoint;
  protected ConveyorTurnStation<Carton> turnStation;
  protected Path path3;
  protected PalletRack dishRack;
  protected PointNode asrs3Home;
  protected PointNode rackEnd3;
  protected Path path2;
  protected PalletRack beverageRack;
  protected PointNode asrs2Home;
  protected PointNode rackEnd2;
  protected PalletRack foodRack;
  protected Path path;
  protected PointNode asrs1Home;
  protected PointNode rackEnd1;
  protected Path path5;
  protected PointNode point;
  protected Path path1;
  protected Path path4;
  protected Path path8;
  protected Path path10;
  protected PointNode point3;
  protected Attractor attractor2;
  protected Attractor attractor3;
  protected RectangularNode<Agent> forkliftsHome;
  protected PointNode robotUnloadLineStart;
  protected PointNode point1;
  protected Path path13;
  protected PointNode workerInfeedingLineStart;
  protected PointNode exitPalletConveyor;
  protected Path path6;
  protected Path path7;
  protected Path path9;
  protected PointNode node;
  protected PointNode node1;
  protected PointNode node2;
  protected ConveyorPath<Pallet> conveyor8;
  protected ConveyorPath<Pallet> conveyor2;
  protected ConveyorTurntable<Pallet> turntable11;
  protected ConveyorPath<Pallet> conveyor1;
  protected ConveyorPath<Pallet> conveyor10;
  protected ConveyorTurntable<Pallet> turntable12;
  protected ConveyorPath<Pallet> exitPalletLine;
  protected PositionOnConveyor<Pallet> exitPalletLinePoint;
  protected ConveyorPath<Pallet> conveyor7;
  protected ConveyorTransferTable<Pallet> transferTable2;
  protected ConveyorTurntable<Pallet> turntable13;
  protected ConveyorPath<Pallet> conveyor5;
  protected ConveyorPath<Pallet> workerPalletLine;
  protected ConveyorTransferTable<Pallet> transferTable3;
  protected ConveyorPath<Pallet> dishPalletLinePickup;
  protected ConveyorPath<Pallet> beveragePalletLinePickup;
  protected ConveyorTurntable<Pallet> turntable10;
  protected ConveyorPath<Pallet> robotPalletLine;
  protected PositionOnConveyor<Pallet> foodUnloadingPoint;
  protected RectangularNode<Agent> emptyBeveragePalletStack;
  protected RectangularNode<Agent> emptyDishPalletStack;
  protected PointNode workerHome;
  protected Path workerDishTrajectory;
  protected PointNode foodPickupStation;
  protected PointNode beveragePickupStation;
  protected PointNode dishPickupStation;
  protected PointNode packager1Home;
  protected PointNode packager2Home;
  protected PointNode packager3Home;
  protected Path robotTrajectory;
  protected PointNode robotHome;
  protected PointNode node3;
  protected Attractor attractor4;
  protected RectangularNode<Agent> foodProductsDock;
  protected Attractor attractor1;
  protected RectangularNode<Agent> beverageDock;
  protected Attractor attractor;
  protected RectangularNode<Agent> dishDock;
  protected Path workerBeverageTrajectory;
  protected StorageTank storageTank;
  protected Pipe pipe;
  protected com.anylogic.engine.markup.Network network;
  protected com.anylogic.engine.markup.Network network1;
  protected com.anylogic.engine.markup.Network network2;
  protected com.anylogic.engine.markup.Network network3;
  protected com.anylogic.engine.markup.Network network4;
  protected com.anylogic.engine.markup.Network network5;
  protected com.anylogic.engine.markup.Network network6;

  private INetwork[] _getNetworks_xjal;

  @Override
  public INetwork[] getNetworks() {
    return _getNetworks_xjal;
  }

  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  protected com.anylogic.engine.markup.ConveyorNetwork conveyorNetwork1;
  protected com.anylogic.engine.markup.ConveyorNetwork conveyorNetwork2;
  protected com.anylogic.engine.markup.ConveyorNetwork conveyorNetwork;

  private com.anylogic.engine.markup.ConveyorNetwork[] _getConveyorNetworks_xjal;

  @Override
  public com.anylogic.engine.markup.ConveyorNetwork[] getConveyorNetworks() {
    return _getConveyorNetworks_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    camera = new Camera3D( 1026.6, 699.05, 212.72, 0.5703736048780691, -2.2092377991323553 );

    window3d = new ShapeWindow3D( Main.this, false, 0.0, -660.0, 1400.0, 660.0, WINDOW_3D_NAVIGATION_FULL, 2000.0 );

    rectangle5 = new ShapeRectangle(
       SHAPE_DRAW_2D3D, true,0.0, 0.0, -2.0, 0.0, 
            null, _rectangle5_Fill_Color,
			1400.0, 700.0, 1.0, 1.0, LINE_STYLE_SOLID );

    table_4 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, -11.0, 0.0, 0.0, 0.0,
			0.75, true, "/warehouse_conveyor/",
			"3d/table_2.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -15.0, -5.0,
			29.0, 10.0, null, _table_4_customColors_xjal );

    person2 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, -10.0, 10.0, 0.0, 4.71238898038469,
			1.0, true, "/warehouse_conveyor/",
			"3d/person.dae", OBJECT_3D_YZX_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -5.0, -4.0,
			7.0, 7.0, 1512393225296L, _person2_customColors_xjal );

    monitor_on2 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, 6.0, 2.0, 12.0, 0.7853981633974483,
			1.25, true, "/warehouse_conveyor/",
			"3d/monitor_on.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -5.0, -1.0,
			10.0, 2.0, null, _monitor_on2_customColors_xjal );

    computer_on2 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, -1.0, 0.0, 7.0, 0.0,
			1.0, true, "/warehouse_conveyor/",
			"3d/computer_on.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -1.0, -3.0,
			3.0, 5.0, null, _computer_on2_customColors_xjal );

    polyline6 = new ShapePolyLine(
		SHAPE_DRAW_2D3D, true, 6.0, 2.0, 14.0, gray, null,
            3, _polyline6_pointsDX_xjal(), _polyline6_pointsDY_xjal(), _polyline6_pointsDZ_xjal(), false, 1.0, 1.0, LINE_STYLE_SOLID );

    line4 = new ShapeLine(
		SHAPE_DRAW_2D3D, true, -20.0, -9.0, 0.0, gray, 
 		5.0,	0.0, 0.0, 1.0, 40.0, LINE_STYLE_SOLID );

    line5 = new ShapeLine(
		SHAPE_DRAW_2D3D, true, 0.0, -9.0, 0.0, gray, 
 		-5.0,	0.0, 0.0, 1.0, 40.0, LINE_STYLE_SOLID );

    table_3 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, -11.0, 0.0, 0.0, 0.0,
			0.75, true, "/warehouse_conveyor/",
			"3d/table_2.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -15.0, -5.0,
			29.0, 10.0, null, _table_3_customColors_xjal );

    person1 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, -10.0, 10.0, 0.0, 4.71238898038469,
			1.0, true, "/warehouse_conveyor/",
			"3d/person.dae", OBJECT_3D_YZX_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -5.0, -4.0,
			7.0, 7.0, 1512393178707L, _person1_customColors_xjal );

    monitor_on1 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, 6.0, 2.0, 12.0, 0.7853981633974483,
			1.25, true, "/warehouse_conveyor/",
			"3d/monitor_on.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -5.0, -1.0,
			10.0, 2.0, null, _monitor_on1_customColors_xjal );

    computer_on1 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, -1.0, 0.0, 7.0, 0.0,
			1.0, true, "/warehouse_conveyor/",
			"3d/computer_on.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -1.0, -3.0,
			3.0, 5.0, null, _computer_on1_customColors_xjal );

    polyline5 = new ShapePolyLine(
		SHAPE_DRAW_2D3D, true, 6.0, 2.0, 14.0, gray, null,
            3, _polyline5_pointsDX_xjal(), _polyline5_pointsDY_xjal(), _polyline5_pointsDZ_xjal(), false, 1.0, 1.0, LINE_STYLE_SOLID );

    line2 = new ShapeLine(
		SHAPE_DRAW_2D3D, true, -20.0, -9.0, 0.0, gray, 
 		5.0,	0.0, 0.0, 1.0, 40.0, LINE_STYLE_SOLID );

    line3 = new ShapeLine(
		SHAPE_DRAW_2D3D, true, 0.0, -9.0, 0.0, gray, 
 		-5.0,	0.0, 0.0, 1.0, 40.0, LINE_STYLE_SOLID );

    table_2 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, -11.0, 0.0, 0.0, 0.0,
			0.75, true, "/warehouse_conveyor/",
			"3d/table_2.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -15.0, -5.0,
			29.0, 10.0, null, _table_2_customColors_xjal );

    person = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, -10.0, 10.0, 0.0, 4.71238898038469,
			1.0, true, "/warehouse_conveyor/",
			"3d/person.dae", OBJECT_3D_YZX_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -5.0, -4.0,
			7.0, 7.0, 1512388189181L, _person_customColors_xjal );

    monitor_on = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, 6.0, 2.0, 12.0, 0.7853981633974483,
			1.25, true, "/warehouse_conveyor/",
			"3d/monitor_on.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -5.0, -1.0,
			10.0, 2.0, null, _monitor_on_customColors_xjal );

    computer_on = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, -1.0, 0.0, 7.0, 0.0,
			1.0, true, "/warehouse_conveyor/",
			"3d/computer_on.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -1.0, -3.0,
			3.0, 5.0, null, _computer_on_customColors_xjal );

    polyline4 = new ShapePolyLine(
		SHAPE_DRAW_2D3D, true, 6.0, 2.0, 14.0, gray, null,
            3, _polyline4_pointsDX_xjal(), _polyline4_pointsDY_xjal(), _polyline4_pointsDZ_xjal(), false, 1.0, 1.0, LINE_STYLE_SOLID );

    line = new ShapeLine(
		SHAPE_DRAW_2D3D, true, -20.0, -9.0, 0.0, gray, 
 		5.0,	0.0, 0.0, 1.0, 40.0, LINE_STYLE_SOLID );

    line1 = new ShapeLine(
		SHAPE_DRAW_2D3D, true, 0.0, -9.0, 0.0, gray, 
 		-5.0,	0.0, 0.0, 1.0, 40.0, LINE_STYLE_SOLID );

    rectangle4 = new ShapeRectangle(
       SHAPE_DRAW_2D3D, true,10.0, 130.0, 0.0, 0.0, 
            red, null,
			250.0, 70.0, 0.0, 2.0, LINE_STYLE_DOTTED );

    rectangle = new ShapeRectangle(
       SHAPE_DRAW_2D3D, true,-660.0, -30.0, 0.0, 0.0, 
            gray, null,
			340.0, 240.0, 0.0, 2.0, LINE_STYLE_DOTTED );

    text = new ShapeText(
        SHAPE_DRAW_2D3D, true,-410.0, -20.0, 0.0, 0.0, 
        black,"Pallet conveyor",
        _text_Font, ALIGNMENT_LEFT );

    rectangle1 = new ShapeRectangle(
       SHAPE_DRAW_2D3D, true,-660.0, -240.0, 0.0, 0.0, 
            purple, null,
			860.0, 200.0, 0.0, 2.0, LINE_STYLE_DOTTED );

    text1 = new ShapeText(
        SHAPE_DRAW_2D3D, true,-650.0, -230.0, 0.0, 0.0, 
        purple,"Infeeding conveyor",
        _text1_Font, ALIGNMENT_LEFT );

    text2 = new ShapeText(
        SHAPE_DRAW_2D3D, true,-200.0, 240.0, 0.0, 0.0, 
        black,"Labeling",
        _text2_Font, ALIGNMENT_LEFT );

    text3 = new ShapeText(
        SHAPE_DRAW_2D3D, true,-120.0, 240.0, 0.0, 0.0, 
        black,"Invoice put",
        _text3_Font, ALIGNMENT_LEFT );

    polyline = new ShapePolyLine(
		SHAPE_DRAW_2D3D, true, -210.0, 260.0, 0.0, black, null,
            3, _polyline_pointsDX_xjal(), _polyline_pointsDY_xjal(), _polyline_pointsDZ_xjal(), false, 0.0, 1.0, LINE_STYLE_SOLID );

    polyline1 = new ShapePolyLine(
		SHAPE_DRAW_2D3D, true, -120.0, 260.0, 0.0, black, null,
            3, _polyline1_pointsDX_xjal(), _polyline1_pointsDY_xjal(), _polyline1_pointsDZ_xjal(), false, 0.0, 1.0, LINE_STYLE_SOLID );

    text4 = new ShapeText(
        SHAPE_DRAW_2D3D, true,280.0, 160.0, 0.0, 0.0, 
        black,"Order check",
        _text4_Font, ALIGNMENT_LEFT );

    polyline2 = new ShapePolyLine(
		SHAPE_DRAW_2D3D, true, 280.0, 180.0, 0.0, black, null,
            3, _polyline2_pointsDX_xjal(), _polyline2_pointsDY_xjal(), _polyline2_pointsDZ_xjal(), false, 0.0, 1.0, LINE_STYLE_SOLID );

    rectangle2 = new ShapeRectangle(
       SHAPE_DRAW_2D3D, true,270.0, -50.0, 0.0, 0.0, 
            green, null,
			220.0, 200.0, 0.0, 2.0, LINE_STYLE_DOTTED );

    text5 = new ShapeText(
        SHAPE_DRAW_2D3D, true,430.0, -40.0, 0.0, 0.0, 
        green,"Packaging\r\nlines",
        _text5_Font, ALIGNMENT_LEFT );

    text6 = new ShapeText(
        SHAPE_DRAW_2D3D, true,300.0, -160.0, 0.0, 0.0, 
        black,"Adding shipping label",
        _text6_Font, ALIGNMENT_LEFT );

    polyline3 = new ShapePolyLine(
		SHAPE_DRAW_2D3D, true, 240.0, -170.0, 0.0, black, null,
            3, _polyline3_pointsDX_xjal(), _polyline3_pointsDY_xjal(), _polyline3_pointsDZ_xjal(), false, 0.0, 1.0, LINE_STYLE_SOLID );

    rectangle3 = new ShapeRectangle(
       SHAPE_DRAW_2D3D, true,500.0, -270.0, 0.0, 0.0, 
            brown, null,
			160.0, 420.0, 0.0, 2.0, LINE_STYLE_DOTTED );

    text7 = new ShapeText(
        SHAPE_DRAW_2D3D, true,620.0, -260.0, 0.0, 0.0, 
        brown,"Sorter",
        _text7_Font, ALIGNMENT_LEFT );

    text8 = new ShapeText(
        SHAPE_DRAW_2D3D, true,20.0, 140.0, 0.0, 0.0, 
        red,"Order picking \r\nlines",
        _text8_Font, ALIGNMENT_LEFT );

    text29 = new ShapeText(
        SHAPE_DRAW_2D3D, true,-60.0, -50.0, 0.0, 0.0, 
        black,"foodRack",
        _text29_Font, ALIGNMENT_LEFT );

    polyline8 = new ShapePolyLine(
		SHAPE_DRAW_2D3D, true, -60.0, -30.0, 0.0, black, null,
            3, _polyline8_pointsDX_xjal(), _polyline8_pointsDY_xjal(), _polyline8_pointsDZ_xjal(), false, 0.0, 1.0, LINE_STYLE_SOLID );

    text30 = new ShapeText(
        SHAPE_DRAW_2D3D, true,-60.0, -10.0, 0.0, 0.0, 
        black,"beverageRack",
        _text30_Font, ALIGNMENT_LEFT );

    polyline9 = new ShapePolyLine(
		SHAPE_DRAW_2D3D, true, -60.0, 10.0, 0.0, black, null,
            3, _polyline9_pointsDX_xjal(), _polyline9_pointsDY_xjal(), _polyline9_pointsDZ_xjal(), false, 0.0, 1.0, LINE_STYLE_SOLID );

    text31 = new ShapeText(
        SHAPE_DRAW_2D3D, true,-60.0, 30.0, 0.0, 0.0, 
        black,"dishRack",
        _text31_Font, ALIGNMENT_LEFT );

    polyline10 = new ShapePolyLine(
		SHAPE_DRAW_2D3D, true, -60.0, 50.0, 0.0, black, null,
            3, _polyline10_pointsDX_xjal(), _polyline10_pointsDY_xjal(), _polyline10_pointsDZ_xjal(), false, 0.0, 1.0, LINE_STYLE_SOLID );

    rectangle116 = new ShapeRectangle(
       SHAPE_DRAW_2D, true,0.0, 0.0, 0.0, 0.0, 
            null, dodgerBlue,
			240.0, 40.0, 10.0, 1.0, LINE_STYLE_SOLID );

    rectangle117 = new ShapeRectangle(
       SHAPE_DRAW_2D, true,560.0, 0.0, 0.0, 0.0, 
            null, _rectangle117_Fill_Color,
			840.0, 40.0, 10.0, 1.0, LINE_STYLE_SOLID );

    text85 = new ShapeText(
        SHAPE_DRAW_2D, true,20.0, 8.0, 0.0, 0.0, 
        white,"Biscuits factory",
        _text85_Font, ALIGNMENT_LEFT );

    rectangle127 = new ShapeRectangle(
       SHAPE_DRAW_2D, true,240.0, 0.0, 0.0, 0.0, 
            null, _rectangle127_Fill_Color,
			60.0, 40.0, 10.0, 1.0, LINE_STYLE_SOLID ) {
      @Override
      public void updateDynamicProperties() {
        _rectangle127_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }

      @Override
      @AnyLogicInternalCodegenAPI
      public boolean onClick( double clickx, double clicky ) {
        return onShapeClick( _rectangle127, 0, clickx, clicky );
      }
    };

    text113 = new ShapeText(
        SHAPE_DRAW_2D, true,255.0, 8.0, 0.0, 0.0, 
        white,"3D",
        _text113_Font, ALIGNMENT_LEFT );

    rectangle128 = new ShapeRectangle(
       SHAPE_DRAW_2D, true,300.0, 0.0, 0.0, 0.0, 
            null, _rectangle128_Fill_Color,
			60.0, 40.0, 10.0, 1.0, LINE_STYLE_SOLID ) {
      @Override
      public void updateDynamicProperties() {
        _rectangle128_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }

      @Override
      @AnyLogicInternalCodegenAPI
      public boolean onClick( double clickx, double clicky ) {
        return onShapeClick( _rectangle128, 0, clickx, clicky );
      }
    };

    text114 = new ShapeText(
        SHAPE_DRAW_2D, true,315.0, 8.0, 0.0, 0.0, 
        white,"2D",
        _text114_Font, ALIGNMENT_LEFT );

    rectangle129 = new ShapeRectangle(
       SHAPE_DRAW_2D, true,360.0, 0.0, 0.0, 0.0, 
            null, _rectangle129_Fill_Color,
			80.0, 40.0, 10.0, 1.0, LINE_STYLE_SOLID ) {
      @Override
      public void updateDynamicProperties() {
        _rectangle129_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }

      @Override
      @AnyLogicInternalCodegenAPI
      public boolean onClick( double clickx, double clicky ) {
        return onShapeClick( _rectangle129, 0, clickx, clicky );
      }
    };

    text115 = new ShapeText(
        SHAPE_DRAW_2D, true,375.0, 8.0, 0.0, 0.0, 
        white,"Logic",
        _text115_Font, ALIGNMENT_LEFT );

    rectangle130 = new ShapeRectangle(
       SHAPE_DRAW_2D, true,440.0, 0.0, 0.0, 0.0, 
            null, _rectangle130_Fill_Color,
			120.0, 40.0, 10.0, 1.0, LINE_STYLE_SOLID ) {
      @Override
      public void updateDynamicProperties() {
        _rectangle130_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }

      @Override
      @AnyLogicInternalCodegenAPI
      public boolean onClick( double clickx, double clicky ) {
        return onShapeClick( _rectangle130, 0, clickx, clicky );
      }
    };

    text116 = new ShapeText(
        SHAPE_DRAW_2D, true,455.0, 8.0, 0.0, 0.0, 
        white,"Statistics",
        _text116_Font, ALIGNMENT_LEFT );

    robot_1 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, 134.0, 384.0, 0.0, 3.141592653589793,
			2.0, true, "/warehouse_conveyor/",
			"3d/robot_1.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -10.0, -2.0,
			20.0, 5.0, null, _robot_1_customColors_xjal );

    polyline7 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, 730.0, 920.0, 0.0, black, null,
            3, _polyline7_pointsDX_xjal(), _polyline7_pointsDY_xjal(), _polyline7_pointsDZ_xjal(), false, 10.0, 1.0, LINE_STYLE_SOLID );

    line6 = new ShapeLine(
		SHAPE_DRAW_2D, true, 710.0, 930.0, 0.0, black, 
 		40.0,	0.0, 0.0, 1.0, 10.0, LINE_STYLE_SOLID );

    text9 = new ShapeText(
        SHAPE_DRAW_2D, true,-360.0, 1140.0, 0.0, 0.0, 
        dodgerBlue,"Animation auxiliary elements",
        _text9_Font, ALIGNMENT_LEFT );

    text10 = new ShapeText(
        SHAPE_DRAW_2D, true,-610.0, 1190.0, 0.0, 0.0, 
        dodgerBlue,"Warehouse layout elements",
        _text10_Font, ALIGNMENT_LEFT );

    text11 = new ShapeText(
        SHAPE_DRAW_2D, true,-610.0, 790.0, 0.0, 0.0, 
        dodgerBlue,"Product flow management elements",
        _text11_Font, ALIGNMENT_LEFT );

    text12 = new ShapeText(
        SHAPE_DRAW_2D, true,-360.0, 790.0, 0.0, 0.0, 
        dodgerBlue,"Order flow management elements",
        _text12_Font, ALIGNMENT_LEFT );

    text13 = new ShapeText(
        SHAPE_DRAW_2D, true,-860.0, 790.0, 0.0, 0.0, 
        dodgerBlue,"Input parameters",
        _text13_Font, ALIGNMENT_LEFT );

    line7 = new ShapeLine(
		SHAPE_DRAW_2D3D, true, 125.20000000000005, 382.19999999999993, 25.0, sandyBrown, 
 		-25.199999999999996,	17.800000000000004, 0.0, 1.0, 2.0, LINE_STYLE_SOLID ) {
      @Override
      public void updateDynamicProperties() {
        _line7_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    robotUpperSegment = new ShapeOval(
       SHAPE_DRAW_2D3D, true,125.167, 382.167, 26.0, 0.0, 
       null, sandyBrown,
	   1.0, 1.0, 10.0, 1.0, LINE_STYLE_SOLID ) {
      @Override
      public void updateDynamicProperties() {
        _robotUpperSegment_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    text14 = new ShapeText(
        SHAPE_DRAW_2D, true,1830.0, 1100.0, 0.0, 0.0, 
        black,"Orders",
        _text14_Font, ALIGNMENT_LEFT );

    text19 = new ShapeText(
        SHAPE_DRAW_2D, true,-860.0, 1040.0, 0.0, 0.0, 
        dodgerBlue,"Statistics elements",
        _text19_Font, ALIGNMENT_LEFT );

    text25 = new ShapeText(
        SHAPE_DRAW_2D, true,1540.0, 1100.0, 0.0, 0.0, 
        black,"Stored items",
        _text25_Font, ALIGNMENT_LEFT );

    text23 = new ShapeText(
        SHAPE_DRAW_2D, true,-100.0, -100.0, 0.0, 0.0, 
        black,"Goods storing time distribution, min",
        _text23_Font, ALIGNMENT_LEFT );

    text21 = new ShapeText(
        SHAPE_DRAW_2D, true,-120.0, -100.0, 0.0, 0.0, 
        black,"Full order processing time distribution, min",
        _text21_Font, ALIGNMENT_LEFT );

    text17 = new ShapeText(
        SHAPE_DRAW_2D, true,-90.0, -100.0, 0.0, 0.0, 
        black,"Amount of goods per order",
        _text17_Font, ALIGNMENT_LEFT );

    text27 = new ShapeText(
        SHAPE_DRAW_2D, true,-660.0, -10.0, 0.0, 0.0, 
        black,"Orders statistics",
        _text27_Font, ALIGNMENT_LEFT );

    line8 = new ShapeLine(
		SHAPE_DRAW_2D, true, -660.0, 10.0, 0.0, black, 
 		1320.0,	0.0, 0.0, 1.0, 10.0, LINE_STYLE_SOLID );

    line9 = new ShapeLine(
		SHAPE_DRAW_2D, true, -660.0, 13.0, 0.0, _line9_Line_Color, 
 		1320.0,	0.0, 0.0, 5.0, 10.0, LINE_STYLE_SOLID );

    text28 = new ShapeText(
        SHAPE_DRAW_2D, true,-660.0, -10.0, 0.0, 0.0, 
        black,"Goods statistics",
        _text28_Font, ALIGNMENT_LEFT );

    line10 = new ShapeLine(
		SHAPE_DRAW_2D, true, -660.0, 10.0, 0.0, black, 
 		1320.0,	0.0, 0.0, 1.0, 10.0, LINE_STYLE_SOLID );

    line11 = new ShapeLine(
		SHAPE_DRAW_2D, true, -660.0, 13.0, 0.0, lightSteelBlue, 
 		1320.0,	0.0, 0.0, 5.0, 10.0, LINE_STYLE_SOLID );

    table = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, -0.019, 1.549, -1.0, 3.141592653589793,
			1.0, false, "/warehouse_conveyor/",
			"3d/table.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -14.0, -5.0,
			28.0, 10.0, null, _table_customColors_xjal );

    chair = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, -0.108, -6.14, -1.0, 0.0,
			1.0, false, "/warehouse_conveyor/",
			"3d/chair.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -4.0, -4.0,
			7.0, 7.0, null, _chair_customColors_xjal );

    person_sitting = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, 0.035, -2.792, -1.0, 1.5707963267948966,
			1.0, false, "/warehouse_conveyor/",
			"3d/person_sitting.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -6.0, -4.0,
			12.0, 7.0, 1529058483280L, _person_sitting_customColors_xjal );

    computer_on3 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, -10.799, 1.314, 10.5, 3.141592653589793,
			1.0, false, "/warehouse_conveyor/",
			"3d/computer_on.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -1.0, -3.0,
			3.0, 5.0, null, _computer_on3_customColors_xjal );

    monitor_on3 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, -0.066, 5.214, 10.5, 3.141592653589793,
			1.0, false, "/warehouse_conveyor/",
			"3d/monitor_on.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -4.0, -1.0,
			8.0, 2.0, null, _monitor_on3_customColors_xjal );

    keyboard = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, 0.0, 0.0, 10.5, 3.141592653589793,
			0.75, false, "/warehouse_conveyor/",
			"3d/keyboard.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -3.0, -1.0,
			5.0, 2.0, null, _keyboard_customColors_xjal );

    phone = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, 11.173, -1.078, 10.5, 3.141592653589793,
			0.75, false, "/warehouse_conveyor/",
			"3d/phone.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -1.0, -1.0,
			2.0, 1.0, null, _phone_customColors_xjal );

    monitor_on4 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, -7.495, 2.121, 10.5, 3.9269908169872414,
			1.0, false, "/warehouse_conveyor/",
			"3d/monitor_on.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -4.0, -1.0,
			8.0, 2.0, null, _monitor_on4_customColors_xjal );

    monitor_on5 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, 7.708, 2.884, 10.5, 2.5185098975749303,
			1.0, false, "/warehouse_conveyor/",
			"3d/monitor_on.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -4.0, -1.0,
			8.0, 2.0, null, _monitor_on5_customColors_xjal );

    table1 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, -0.019, 1.549, -1.0, 3.141592653589793,
			1.0, false, "/warehouse_conveyor/",
			"3d/table.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -14.0, -5.0,
			28.0, 10.0, null, _table1_customColors_xjal );

    chair1 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, -0.108, -6.14, -1.0, 0.0,
			1.0, false, "/warehouse_conveyor/",
			"3d/chair.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -4.0, -4.0,
			7.0, 7.0, null, _chair1_customColors_xjal );

    person_sitting1 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, 0.035, -2.792, -1.0, 1.5707963267948966,
			1.0, false, "/warehouse_conveyor/",
			"3d/person_sitting.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -6.0, -4.0,
			12.0, 7.0, 1529065214835L, _person_sitting1_customColors_xjal );

    computer_on4 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, -10.799, 1.314, 10.5, 3.141592653589793,
			1.0, false, "/warehouse_conveyor/",
			"3d/computer_on.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -1.0, -3.0,
			3.0, 5.0, null, _computer_on4_customColors_xjal );

    monitor_on6 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, -0.066, 5.214, 10.5, 3.141592653589793,
			1.0, false, "/warehouse_conveyor/",
			"3d/monitor_on.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -4.0, -1.0,
			8.0, 2.0, null, _monitor_on6_customColors_xjal );

    keyboard1 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, 0.0, 0.0, 10.5, 3.141592653589793,
			0.75, false, "/warehouse_conveyor/",
			"3d/keyboard.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -3.0, -1.0,
			5.0, 2.0, null, _keyboard1_customColors_xjal );

    phone1 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, 11.173, -1.078, 10.5, 3.141592653589793,
			0.75, false, "/warehouse_conveyor/",
			"3d/phone.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -1.0, -1.0,
			2.0, 1.0, null, _phone1_customColors_xjal );

    monitor_on7 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, -7.495, 2.121, 10.5, 3.9269908169872414,
			1.0, false, "/warehouse_conveyor/",
			"3d/monitor_on.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -4.0, -1.0,
			8.0, 2.0, null, _monitor_on7_customColors_xjal );

    monitor_on8 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, 7.708, 2.884, 10.5, 2.5185098975749303,
			1.0, false, "/warehouse_conveyor/",
			"3d/monitor_on.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -4.0, -1.0,
			8.0, 2.0, null, _monitor_on8_customColors_xjal );

  }
  
  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP1_xjal() {
    table2 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, -0.019, 1.549, -1.0, 3.141592653589793,
			1.0, false, "/warehouse_conveyor/",
			"3d/table.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -14.0, -5.0,
			28.0, 10.0, null, _table2_customColors_xjal );

    chair2 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, -0.108, -6.14, -1.0, 0.0,
			1.0, false, "/warehouse_conveyor/",
			"3d/chair.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -4.0, -4.0,
			7.0, 7.0, null, _chair2_customColors_xjal );

    person_sitting2 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, 0.035, -2.792, -1.0, 1.5707963267948966,
			1.0, false, "/warehouse_conveyor/",
			"3d/person_sitting.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -6.0, -4.0,
			12.0, 7.0, 1529065239143L, _person_sitting2_customColors_xjal );

    computer_on5 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, -10.799, 1.314, 10.5, 3.141592653589793,
			1.0, false, "/warehouse_conveyor/",
			"3d/computer_on.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -1.0, -3.0,
			3.0, 5.0, null, _computer_on5_customColors_xjal );

    monitor_on9 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, -0.066, 5.214, 10.5, 3.141592653589793,
			1.0, false, "/warehouse_conveyor/",
			"3d/monitor_on.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -4.0, -1.0,
			8.0, 2.0, null, _monitor_on9_customColors_xjal );

    keyboard2 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, 0.0, 0.0, 10.5, 3.141592653589793,
			0.75, false, "/warehouse_conveyor/",
			"3d/keyboard.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -3.0, -1.0,
			5.0, 2.0, null, _keyboard2_customColors_xjal );

    phone2 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, 11.173, -1.078, 10.5, 3.141592653589793,
			0.75, false, "/warehouse_conveyor/",
			"3d/phone.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -1.0, -1.0,
			2.0, 1.0, null, _phone2_customColors_xjal );

    monitor_on10 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, -7.495, 2.121, 10.5, 3.9269908169872414,
			1.0, false, "/warehouse_conveyor/",
			"3d/monitor_on.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -4.0, -1.0,
			8.0, 2.0, null, _monitor_on10_customColors_xjal );

    monitor_on11 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, 7.708, 2.884, 10.5, 2.5185098975749303,
			1.0, false, "/warehouse_conveyor/",
			"3d/monitor_on.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -4.0, -1.0,
			8.0, 2.0, null, _monitor_on11_customColors_xjal );

    table3 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, -0.019, 1.549, -1.0, 3.141592653589793,
			1.0, false, "/warehouse_conveyor/",
			"3d/table.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -14.0, -5.0,
			28.0, 10.0, null, _table3_customColors_xjal );

    chair3 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, -0.108, -6.14, -1.0, 0.0,
			1.0, false, "/warehouse_conveyor/",
			"3d/chair.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -4.0, -4.0,
			7.0, 7.0, null, _chair3_customColors_xjal );

    person_sitting3 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, 0.035, -2.792, -1.0, 1.5707963267948966,
			1.0, false, "/warehouse_conveyor/",
			"3d/person_sitting.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -6.0, -4.0,
			12.0, 7.0, 1529065269390L, _person_sitting3_customColors_xjal );

    computer_on6 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, -10.799, 1.314, 10.5, 3.141592653589793,
			1.0, false, "/warehouse_conveyor/",
			"3d/computer_on.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -1.0, -3.0,
			3.0, 5.0, null, _computer_on6_customColors_xjal );

    monitor_on12 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, -0.066, 5.214, 10.5, 3.141592653589793,
			1.0, false, "/warehouse_conveyor/",
			"3d/monitor_on.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -4.0, -1.0,
			8.0, 2.0, null, _monitor_on12_customColors_xjal );

    keyboard3 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, 0.0, 0.0, 10.5, 3.141592653589793,
			0.75, false, "/warehouse_conveyor/",
			"3d/keyboard.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -3.0, -1.0,
			5.0, 2.0, null, _keyboard3_customColors_xjal );

    phone3 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, 11.173, -1.078, 10.5, 3.141592653589793,
			0.75, false, "/warehouse_conveyor/",
			"3d/phone.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -1.0, -1.0,
			2.0, 1.0, null, _phone3_customColors_xjal );

    monitor_on13 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, -7.495, 2.121, 10.5, 3.9269908169872414,
			1.0, false, "/warehouse_conveyor/",
			"3d/monitor_on.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -4.0, -1.0,
			8.0, 2.0, null, _monitor_on13_customColors_xjal );

    monitor_on14 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, 7.708, 2.884, 10.5, 2.5185098975749303,
			1.0, false, "/warehouse_conveyor/",
			"3d/monitor_on.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -4.0, -1.0,
			8.0, 2.0, null, _monitor_on14_customColors_xjal );

    drying_chamber_closed = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, 480.0, 200.0, 0.0, 0.0,
			1.0, true, "/warehouse_conveyor/",
			"3d/drying_chamber_closed.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -13.0, -25.0,
			26.0, 49.0, null, _drying_chamber_closed_customColors_xjal );

    pasting_machine1 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, 270.0, 200.0, 30.0, 0.0,
			1.0, true, "/warehouse_conveyor/",
			"3d/pasting_machine.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -17.0, -5.0,
			32.0, 9.0, null, _pasting_machine1_customColors_xjal );

    plate_enveloper1 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, 380.0, 200.0, 30.0, 0.0,
			1.0, true, "/warehouse_conveyor/",
			"3d/plate_enveloper.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -21.0, -6.0,
			41.0, 12.0, null, _plate_enveloper1_customColors_xjal );

    inline_scanner = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, 430.0, 200.0, 30.0, 0.0,
			1.0, true, "/warehouse_conveyor/",
			"3d/inline_scanner.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -10.0, -7.0,
			19.0, 14.0, null, _inline_scanner_customColors_xjal );

    plate_enveloper2 = new Shape3DObject(
		Main.this, SHAPE_DRAW_2D3D, true, 170.0, 200.0, 30.0, 0.0,
			1.0, true, "/warehouse_conveyor/",
			"3d/plate_enveloper.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -21.0, -6.0,
			41.0, 12.0, null, _plate_enveloper2_customColors_xjal );

    path3 = new Path( this, SHAPE_DRAW_2D3D, true, true, false, 10, false, 10, PATH_DASHEDLINE, dodgerBlue, 2.0, _path3_segments_xjal() );

    dishRack = new PalletRack(this, SHAPE_DRAW_2D3D, true, true, 950.0, 320.0, 0.0, 150.0, 20.0, 20.0, 10.0, 1.5707963267948966, PALLET_RACK_SINGLE_AISLE_RIGHT, PALLET_RACK_NO_DIRECTION,
            20.0, 20.0, 15.0, 10, 5, 1, lavender, dodgerBlue, 2 );

    path2 = new Path( this, SHAPE_DRAW_2D3D, true, true, false, 10, false, 10, PATH_DASHEDLINE, dodgerBlue, 2.0, _path2_segments_xjal() );

    beverageRack = new PalletRack(this, SHAPE_DRAW_2D3D, true, true, 890.0, 320.0, 0.0, 150.0, 20.0, 20.0, 10.0, 1.5707963267948966, PALLET_RACK_SINGLE_AISLE_RIGHT, PALLET_RACK_NO_DIRECTION,
            20.0, 20.0, 15.0, 10, 5, 1, lavender, dodgerBlue, 2 );

    foodRack = new PalletRack(this, SHAPE_DRAW_2D3D, true, true, 830.0, 320.0, 0.0, 150.0, 20.0, 20.0, 10.0, 1.5707963267948966, PALLET_RACK_SINGLE_AISLE_RIGHT, PALLET_RACK_NO_DIRECTION,
            20.0, 20.0, 15.0, 10, 5, 1, lavender, dodgerBlue, 2 );

    path = new Path( this, SHAPE_DRAW_2D3D, true, true, false, 10, false, 10, PATH_DASHEDLINE, dodgerBlue, 2.0, _path_segments_xjal() );

    path5 = new Path( this, SHAPE_DRAW_2D3D, true, true, false, 10, false, 10, PATH_DASHEDLINE, dodgerBlue, 2.0, _path5_segments_xjal() );

    path1 = new Path( this, SHAPE_DRAW_2D3D, true, true, false, 10, false, 10, PATH_DASHEDLINE, dodgerBlue, 2.0, _path1_segments_xjal() );

    path4 = new Path( this, SHAPE_DRAW_2D3D, true, true, false, 10, false, 10, PATH_DASHEDLINE, dodgerBlue, 2.0, _path4_segments_xjal() );

    path8 = new Path( this, SHAPE_DRAW_2D3D, true, true, false, 10, false, 10, PATH_DASHEDLINE, dodgerBlue, 2.0, _path8_segments_xjal() );

    path10 = new Path( this, SHAPE_DRAW_2D3D, true, true, false, 10, false, 10, PATH_DASHEDLINE, dodgerBlue, 2.0, _path10_segments_xjal() );

    attractor2 = new Attractor( 20.0, 30.0, 0.0 );

    attractor3 = new Attractor( 20.0, 80.0, 0.0 );

    path13 = new Path( this, SHAPE_DRAW_2D3D, true, true, false, 10, false, 10, PATH_DASHEDLINE, dodgerBlue, 2.0, _path13_segments_xjal() );

    path6 = new Path( this, SHAPE_DRAW_2D3D, true, true, false, 10, false, 10, PATH_DASHEDLINE, dodgerBlue, 1.0, _path6_segments_xjal() );

    path7 = new Path( this, SHAPE_DRAW_2D3D, true, true, false, 10, false, 10, PATH_DASHEDLINE, dodgerBlue, 1.0, _path7_segments_xjal() );

    path9 = new Path( this, SHAPE_DRAW_2D3D, true, true, false, 10, false, 10, PATH_DASHEDLINE, dodgerBlue, 1.0, _path9_segments_xjal() );

    workerDishTrajectory = new Path( this, SHAPE_DRAW_2D, true, true, false, 10, false, 10, PATH_DASHEDLINE, dodgerBlue, 2.0, _workerDishTrajectory_segments_xjal() );

    robotTrajectory = new Path( this, SHAPE_DRAW_2D, true, true, false, 10, false, 10, PATH_DASHEDLINE, dodgerBlue, 2.0, _robotTrajectory_segments_xjal() );

    attractor4 = new Attractor( 30.0, 10.0, 1.5707963267948966 );

    attractor1 = new Attractor( 30.0, 10.255999999999972, 1.5707963267948966 );

    attractor = new Attractor( 30.0, 10.0, 1.5707963267948966 );

    workerBeverageTrajectory = new Path( this, SHAPE_DRAW_2D, true, true, false, 10, false, 10, PATH_DASHEDLINE, dodgerBlue, 2.0, _workerBeverageTrajectory_segments_xjal() );

	storageTank = new StorageTank
	(
			this, SHAPE_DRAW_2D3D, true,
			100.0, 90.0, 0.0,
			70.0, 100.0, _storageTank_Line_Color
			 );

	pipe = new Pipe
	(
			this, SHAPE_DRAW_2D3D, true, 8.0, _pipe_Line_Color, 
			_pipe_segments_xjal()
			 );

    asrs3Home = new PointNode(this, SHAPE_DRAW_2D3D, true, 920.0, 320.0, 0.0, 1.0, dodgerBlue, false, 10.0, new PathEnd[] { new PathEnd(path3, PathEndType.BEGIN)} );

    rackEnd3 = new PointNode(this, SHAPE_DRAW_2D3D, true, 920.0, 470.0, 0.0, 1.0, dodgerBlue, false, 10.0, new PathEnd[] { new PathEnd(path3, PathEndType.END)} );

    asrs2Home = new PointNode(this, SHAPE_DRAW_2D3D, true, 860.0, 320.0, 0.0, 1.0, dodgerBlue, false, 10.0, new PathEnd[] { new PathEnd(path2, PathEndType.BEGIN)} );

    rackEnd2 = new PointNode(this, SHAPE_DRAW_2D3D, true, 860.0, 470.0, 0.0, 1.0, dodgerBlue, false, 10.0, new PathEnd[] { new PathEnd(path2, PathEndType.END)} );

    asrs1Home = new PointNode(this, SHAPE_DRAW_2D3D, true, 800.0, 320.0, 0.0, 1.0, dodgerBlue, false, 10.0, new PathEnd[] { new PathEnd(path, PathEndType.BEGIN)} );

    rackEnd1 = new PointNode(this, SHAPE_DRAW_2D3D, true, 800.0, 470.0, 0.0, 1.0, dodgerBlue, false, 10.0, new PathEnd[] { new PathEnd(path, PathEndType.END)} );

    point = new PointNode(this, SHAPE_DRAW_2D3D, true, 100.0, 600.0, 0.0, 20.0, dodgerBlue, false, 10.0, new PathEnd[] { new PathEnd(path1, PathEndType.END), new PathEnd(path5, PathEndType.BEGIN), new PathEnd(path4, PathEndType.BEGIN), new PathEnd(path6, PathEndType.BEGIN)}, 
			new PathConnector(path1, path5, true, 
   new MarkupSegmentLine( 80.0, 600.0, 0.0, 120.0, 600.0, 0.0)), 
			new PathConnector(path1, path4, true, 
   new MarkupSegmentArc( 80.0, 600.0, 0.0, 100.0, 580.0, 0.0, 1.5707963267948966, 3.141592653589793, 1.0,
		80.0, 580.0, 20.0, -4.71238898038469, -1.5707963267948966,
		120.0, 580.0, 20.0, -3.141592653589793, -0.0 )), 
			new PathConnector(path1, path6, true, 
   new MarkupSegmentArc( 80.0, 600.0, 0.0, 100.0, 620.0, 0.0, 1.5707963267948966, 0.0, 1.0,
		80.0, 580.0, 20.0, -4.71238898038469, -0.0,
		80.0, 620.0, 20.0, -1.5707963267948966, 1.5707963267948966 )), 
			new PathConnector(path5, path4, true, 
   new MarkupSegmentArc( 120.0, 600.0, 0.0, 100.0, 580.0, 0.0, 4.71238898038469, 3.141592653589793, 1.0,
		120.0, 620.0, 20.0, -1.5707963267948966, -0.0,
		120.0, 580.0, 20.0, -4.71238898038469, 1.5707963267948966 )), 
			new PathConnector(path5, path6, true, 
   new MarkupSegmentArc( 120.0, 600.0, 0.0, 100.0, 620.0, 0.0, 4.71238898038469, 0.0, 1.0,
		120.0, 620.0, 20.0, -1.5707963267948966, -1.5707963267948966,
		80.0, 620.0, 20.0, -0.0, -0.0 )), 
			new PathConnector(path4, path6, true, 
   new MarkupSegmentLine( 100.0, 580.0, 0.0, 100.0, 620.0, 0.0)) );

    point3 = new PointNode(this, SHAPE_DRAW_2D3D, true, 300.0, 600.0, 0.0, 20.0, dodgerBlue, false, 10.0, new PathEnd[] { new PathEnd(path13, PathEndType.END), new PathEnd(path10, PathEndType.BEGIN), new PathEnd(path9, PathEndType.BEGIN)}, 
			new PathConnector(path13, path10, true, 
   new MarkupSegmentArc( 280.0, 600.0, 0.0, 300.0, 580.0, 0.0, 1.5707963267948966, 3.141592653589793, 1.0,
		280.0, 580.0, 20.0, -4.71238898038469, -1.5707963267948966,
		320.0, 580.0, 20.0, -3.141592653589793, -0.0 )), 
			new PathConnector(path13, path9, true, 
   new MarkupSegmentArc( 280.0, 600.0, 0.0, 300.0, 620.0, 0.0, 1.5707963267948966, 0.0, 1.0,
		280.0, 580.0, 20.0, -4.71238898038469, -0.0,
		280.0, 620.0, 20.0, -1.5707963267948966, 1.5707963267948966 )), 
			new PathConnector(path10, path9, true, 
   new MarkupSegmentLine( 300.0, 580.0, 0.0, 300.0, 620.0, 0.0)) );

    forkliftsHome = new RectangularNode<Agent>( this, SHAPE_DRAW_2D3D, true,
    null, 10.0, 550.0, 0.0, 50.0, 100.0, 0.0,
            null, dodgerBlue, 2.0, LINE_STYLE_DASHED, POSITION_CHOICE_BY_ATTRACTORS, new PathEnd[] { new PathEnd(path1, PathEndType.BEGIN)}, _forkliftsHome_attractors_xjal() );

    robotUnloadLineStart = new PointNode(this, SHAPE_DRAW_2D3D, true, 100.0, 550.0, 0.0, 1.0, dodgerBlue, false, 10.0, new PathEnd[] { new PathEnd(path4, PathEndType.END)} );

    point1 = new PointNode(this, SHAPE_DRAW_2D3D, true, 230.0, 600.0, 0.0, 20.0, dodgerBlue, false, 10.0, new PathEnd[] { new PathEnd(path5, PathEndType.END), new PathEnd(path8, PathEndType.BEGIN), new PathEnd(path13, PathEndType.BEGIN), new PathEnd(path7, PathEndType.BEGIN)}, 
			new PathConnector(path5, path8, true, 
   new MarkupSegmentArc( 210.0, 600.0, 0.0, 230.0, 580.0, 0.0, 1.5707963267948966, 3.141592653589793, 1.0,
		210.0, 580.0, 20.0, -4.71238898038469, -1.5707963267948966,
		250.0, 580.0, 20.0, -3.141592653589793, -0.0 )), 
			new PathConnector(path5, path13, true, 
   new MarkupSegmentLine( 210.0, 600.0, 0.0, 250.0, 600.0, 0.0)), 
			new PathConnector(path5, path7, true, 
   new MarkupSegmentArc( 210.0, 600.0, 0.0, 230.0, 620.0, 0.0, 1.5707963267948966, 0.0, 1.0,
		210.0, 580.0, 20.0, -4.71238898038469, -0.0,
		210.0, 620.0, 20.0, -1.5707963267948966, 1.5707963267948966 )), 
			new PathConnector(path8, path13, true, 
   new MarkupSegmentArc( 230.0, 580.0, 0.0, 250.0, 600.0, 0.0, 3.141592653589793, 4.71238898038469, 1.0,
		250.0, 580.0, 20.0, -3.141592653589793, -1.5707963267948966,
		250.0, 620.0, 20.0, -1.5707963267948966, -0.0 )), 
			new PathConnector(path8, path7, true, 
   new MarkupSegmentLine( 230.0, 580.0, 0.0, 230.0, 620.0, 0.0)), 
			new PathConnector(path13, path7, true, 
   new MarkupSegmentArc( 250.0, 600.0, 0.0, 230.0, 620.0, 0.0, 4.71238898038469, 0.0, 1.0,
		250.0, 620.0, 20.0, -1.5707963267948966, -1.5707963267948966,
		210.0, 620.0, 20.0, -0.0, -0.0 )) );

    workerInfeedingLineStart = new PointNode(this, SHAPE_DRAW_2D3D, true, 300.0, 550.0, 0.0, 1.0, dodgerBlue, false, 10.0, new PathEnd[] { new PathEnd(path10, PathEndType.END)} );

    exitPalletConveyor = new PointNode(this, SHAPE_DRAW_2D3D, true, 230.0, 550.0, 0.0, 1.0, dodgerBlue, false, 10.0, new PathEnd[] { new PathEnd(path8, PathEndType.END)} );

    node = new PointNode(this, SHAPE_DRAW_2D3D, true, 100.0, 650.0, 0.0, 0.0, dodgerBlue, false, 10.0, new PathEnd[] { new PathEnd(path6, PathEndType.END)} );

    node1 = new PointNode(this, SHAPE_DRAW_2D3D, true, 230.0, 650.0, 0.0, 0.0, dodgerBlue, false, 10.0, new PathEnd[] { new PathEnd(path7, PathEndType.END)} );

    node2 = new PointNode(this, SHAPE_DRAW_2D3D, true, 300.0, 650.0, 0.0, 0.0, dodgerBlue, false, 10.0, new PathEnd[] { new PathEnd(path9, PathEndType.END)} );

    emptyBeveragePalletStack = new RectangularNode<Agent>( this, SHAPE_DRAW_2D3D, true,
    null, 350.0, 350.0, 0.0, 40.0, 30.0, 0.0,
            null, dodgerBlue, 2.0, LINE_STYLE_DASHED, POSITION_CHOICE_RANDOM, new PathEnd[] {} );

    emptyBeveragePalletStack.setVisible( false );
    emptyDishPalletStack = new RectangularNode<Agent>( this, SHAPE_DRAW_2D3D, true,
    null, 350.0, 460.0, 0.0, 40.0, 30.0, 0.0,
            null, dodgerBlue, 2.0, LINE_STYLE_DASHED, POSITION_CHOICE_RANDOM, new PathEnd[] {} );

    emptyDishPalletStack.setVisible( false );
    workerHome = new PointNode(this, SHAPE_DRAW_2D3D, true, 380.0, 420.0, 0.0, 1.0, dodgerBlue, false, 10.0, new PathEnd[] { new PathEnd(workerDishTrajectory, PathEndType.BEGIN)} );

    foodPickupStation = new PointNode(this, SHAPE_DRAW_2D3D, true, 820.0, 480.0, 7.0, 1.0, dodgerBlue, false, 10.0, new PathEnd[] {} );

    foodPickupStation.setVisible( false );
    beveragePickupStation = new PointNode(this, SHAPE_DRAW_2D3D, true, 880.0, 480.0, 7.0, 1.0, dodgerBlue, false, 10.0, new PathEnd[] {} );

    beveragePickupStation.setVisible( false );
    dishPickupStation = new PointNode(this, SHAPE_DRAW_2D3D, true, 940.0, 480.0, 7.0, 1.0, dodgerBlue, false, 10.0, new PathEnd[] {} );

    dishPickupStation.setVisible( false );
    packager1Home = new PointNode(this, SHAPE_DRAW_2D, true, 1040.0, 310.0, 0.0, 1.0, dodgerBlue, false, 10.0, new PathEnd[] {} );

    packager1Home.setVisible( false );
    packager2Home = new PointNode(this, SHAPE_DRAW_2D3D, true, 1090.0, 360.0, 0.0, 1.0, dodgerBlue, false, 10.0, new PathEnd[] {} );

    packager2Home.setVisible( false );
    packager3Home = new PointNode(this, SHAPE_DRAW_2D3D, true, 1140.0, 410.0, 0.0, 1.0, dodgerBlue, false, 10.0, new PathEnd[] {} );

    packager3Home.setVisible( false );
    robotHome = new PointNode(this, SHAPE_DRAW_2D3D, true, 100.0, 400.0, 20.0, 0.0, dodgerBlue, false, 10.0, new PathEnd[] { new PathEnd(robotTrajectory, PathEndType.BEGIN)} );

    node3 = new PointNode(this, SHAPE_DRAW_2D3D, true, 100.0, 300.0, 0.0, 0.0, dodgerBlue, false, 10.0, new PathEnd[] { new PathEnd(robotTrajectory, PathEndType.END)} );

    foodProductsDock = new RectangularNode<Agent>( this, SHAPE_DRAW_2D, true,
    null, 70.0, 660.0, 0.0, 60.0, 29.767, 0.0,
            null, dodgerBlue, 2.0, LINE_STYLE_DASHED, POSITION_CHOICE_BY_ATTRACTORS, new PathEnd[] {}, _foodProductsDock_attractors_xjal() );

    beverageDock = new RectangularNode<Agent>( this, SHAPE_DRAW_2D, true,
    null, 200.0, 659.744, 0.0, 60.0, 29.767, 0.0,
            null, dodgerBlue, 2.0, LINE_STYLE_DASHED, POSITION_CHOICE_BY_ATTRACTORS, new PathEnd[] {}, _beverageDock_attractors_xjal() );

    dishDock = new RectangularNode<Agent>( this, SHAPE_DRAW_2D, true,
    null, 270.0, 660.0, 0.0, 60.0, 29.767, 0.0,
            null, dodgerBlue, 2.0, LINE_STYLE_DASHED, POSITION_CHOICE_BY_ATTRACTORS, new PathEnd[] {}, _dishDock_attractors_xjal() );

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {
    HistogramData _item;
    List<HistogramData> _items = new ArrayList<HistogramData>( 1 );
    _item = 
itemStoredTimeDistribution 
;
    _items.add( _item ); 
    List<String> _titles = new ArrayList<String>( 1 );
    _titles.add( "Item storing time distribtion, min" );
    List<Histogram.Appearance> _appearances = new ArrayList<Histogram.Appearance>( 1 );
    _appearances.add( new Histogram.Appearance( deepPink, chocolate, lightSeaGreen, slateBlue, 2, gold ) );
    itemStoringTimeHist = new Histogram(
		    Main.this, true, -120.0, -80.0, 
			230.0, 180.0,
            null, null,
            50.0, 30.0,
			150.0, 120.0, white, black, black,
            30.0, Chart.NONE,
            Chart.GRID_DEFAULT, Chart.GRID_DEFAULT,
            darkGray, darkGray, 
            true, false, true, 0.8,
            _items, _titles, _appearances );

    }
    {
    HistogramData _item;
    List<HistogramData> _items = new ArrayList<HistogramData>( 1 );
    _item = 
fullOrderProcessingTimeDistribution 
;
    _items.add( _item ); 
    List<String> _titles = new ArrayList<String>( 1 );
    _titles.add( "Full order processing time distribtion, min" );
    List<Histogram.Appearance> _appearances = new ArrayList<Histogram.Appearance>( 1 );
    _appearances.add( new Histogram.Appearance( deepPink, chocolate, darkOrchid, slateBlue, 2, darkOrange ) );
    orderProcessingTimeHist = new Histogram(
		    Main.this, true, -120.0, -80.0, 
			230.0, 180.0,
            null, null,
            50.0, 30.0,
			150.0, 120.0, white, black, black,
            30.0, Chart.NONE,
            Chart.GRID_DEFAULT, Chart.GRID_DEFAULT,
            darkGray, darkGray, 
            true, false, true, 0.8,
            _items, _titles, _appearances );

    }
    {
    HistogramData _item;
    List<HistogramData> _items = new ArrayList<HistogramData>( 1 );
    _item = 
itemsPerOrder 
;
    _items.add( _item ); 
    List<String> _titles = new ArrayList<String>( 1 );
    _titles.add( "Items per order" );
    List<Histogram.Appearance> _appearances = new ArrayList<Histogram.Appearance>( 1 );
    _appearances.add( new Histogram.Appearance( deepSkyBlue, slateGray, dodgerBlue, deepPink, 1, yellowGreen ) );
    amountOfItemsPerOrder = new Histogram(
		    Main.this, true, -120.0, -100.0, 
			230.0, 200.0,
            null, null,
            50.0, 50.0,
			150.0, 120.0, white, black, black,
            30.0, Chart.NONE,
            Chart.GRID_DEFAULT, Chart.GRID_DEFAULT,
            darkGray, darkGray, 
            true, false, false, 0.8,
            _items, _titles, _appearances );

    }
    {
    List<DataItem> _items = new ArrayList<DataItem>( 2 );
    _items.add( new DataItem() {
      @Override
      public void update() {
        setValue( _ordersStates_DataItem0Value() );
      }
    });
    _items.add( new DataItem() {
      @Override
      public void update() {
        setValue( _ordersStates_DataItem1Value() );
      }
    });
    List<String> _titles = new ArrayList<String>( 2 );
    _titles.add( "in process" );
    _titles.add( "wait for preorder" );
    List<Color> _colors = new ArrayList<Color>( 2 );
    _colors.add( darkOrchid );
    _colors.add( dodgerBlue );
    ordersStates = new BarChart(
		    Main.this, true, 1730.0, 1110.0, 
			210.0, 270.0,
            null, null,
            50.0, 30.0,
			130.0, 140.0, white, black, black,
            70.0, Chart.SOUTH,
            Chart.NORTH, Chart.SCALE_AUTO,
            0, 0, 0.8,
            Chart.GRID_DEFAULT,
            darkGray, darkGray, _items, _titles, _colors );

    }
    {
    List<DataItem> _items = new ArrayList<DataItem>( 2 );
    _items.add( new DataItem() {
      @Override
      public void update() {
        setValue( _storedItemsStatesChart_DataItem0Value() );
      }
    });
    _items.add( new DataItem() {
      @Override
      public void update() {
        setValue( _storedItemsStatesChart_DataItem1Value() );
      }
    });
    List<String> _titles = new ArrayList<String>( 2 );
    _titles.add( "unreserved items" );
    _titles.add( "reserved goods" );
    List<Color> _colors = new ArrayList<Color>( 2 );
    _colors.add( lightSteelBlue );
    _colors.add( sandyBrown );
    storedItemsStatesChart = new BarChart(
		    Main.this, true, 1470.0, 1100.0, 
			210.0, 270.0,
            null, null,
            50.0, 30.0,
			130.0, 140.0, white, black, black,
            70.0, Chart.SOUTH,
            Chart.NORTH, Chart.SCALE_AUTO,
            0, 0, 0.8,
            Chart.GRID_DEFAULT,
            darkGray, darkGray, _items, _titles, _colors );

    }
    {				
    pickingWorkplace2 = new ShapeGroup( Main.this, SHAPE_DRAW_2D3D, true, 950.0, 480.0, 0.0, 0.0
	
	     , table_4
	     , person2
	     , monitor_on2
	     , computer_on2
	     , polyline6
	     , line4
	     , line5 );

    }
    {				
    pickingWorkplace1 = new ShapeGroup( Main.this, SHAPE_DRAW_2D3D, true, 890.0, 480.0, 0.0, 0.0
	
	     , table_3
	     , person1
	     , monitor_on1
	     , computer_on1
	     , polyline5
	     , line2
	     , line3 );

    }
    {				
    pickingWorkplace = new ShapeGroup( Main.this, SHAPE_DRAW_2D3D, true, 830.0, 480.0, 0.0, 0.0
	
	     , table_2
	     , person
	     , monitor_on
	     , computer_on
	     , polyline4
	     , line
	     , line1 );

    }
    {				
    groupMarks = new ShapeGroup( Main.this, SHAPE_DRAW_2D3D, true, 730.0, 340.0, 0.0, 0.0
	
	     , rectangle4
	     , rectangle
	     , text
	     , rectangle1
	     , text1
	     , text2
	     , text3
	     , polyline
	     , polyline1
	     , text4
	     , polyline2
	     , rectangle2
	     , text5
	     , text6
	     , polyline3
	     , rectangle3
	     , text7
	     , text8
	     , text29
	     , polyline8
	     , text30
	     , polyline9
	     , text31
	     , polyline10 );

    }
    groupMarks.setVisible( false );
    {				
    groupMainMenu = new ShapeGroup( Main.this, SHAPE_DRAW_2D, true, 0.0, 0.0, 0.0, 0.0
	
	     , rectangle116
	     , rectangle117
	     , text85
	     , rectangle127
	     , text113
	     , rectangle128
	     , text114
	     , rectangle129
	     , text115
	     , rectangle130
	     , text116 );

    }
    storedItems_presentation = new ShapeAgentPopulationGroup(this, SHAPE_DRAW_2D3D, true, storedItems) {
    
      @Override
      public ShapeEmbeddedObjectPresentation createShapeWithStaticProperties_xjal( final Agent _a, int index ) {
        ShapeEmbeddedObjectPresentation _e = _storedItems_presentation_createShapeWithStaticProperties_xjal( _a, index );
        return _e;
      }
    };
    {				
    group = new ShapeGroup( Main.this, SHAPE_DRAW_2D, true, 2170.0, 1200.0, 0.0, 0.0
	
	     , text23
	     , itemStoringTimeHist );

    }
    {				
    group2 = new ShapeGroup( Main.this, SHAPE_DRAW_2D, true, 1590.0, 900.0, 0.0, 0.0
	
	     , text21
	     , orderProcessingTimeHist );

    }
    {				
    group5 = new ShapeGroup( Main.this, SHAPE_DRAW_2D, true, 1970.0, 900.0, 0.0, 0.0
	
	     , text17
	     , amountOfItemsPerOrder );

    }
    {				
    group6 = new ShapeGroup( Main.this, SHAPE_DRAW_2D, true, 2090.0, 770.0, 0.0, 0.0
	
	     , text27
	     , line8
	     , line9 );

    }
    {				
    group7 = new ShapeGroup( Main.this, SHAPE_DRAW_2D, true, 2100.0, 1070.0, 0.0, 0.0
	
	     , text28
	     , line10
	     , line11 );

    }
    {				
    officeWorker = new ShapeGroup( Main.this, SHAPE_DRAW_2D3D, true, 490.0, 345.0, 0.0, 2.356194490192345
	
	     , table
	     , chair
	     , person_sitting
	     , computer_on3
	     , monitor_on3
	     , keyboard
	     , phone
	     , monitor_on4
	     , monitor_on5 );

    }
    {				
    officeWorker1 = new ShapeGroup( Main.this, SHAPE_DRAW_2D3D, true, 660.0, 480.0, 0.0, 5.235987755982989
	
	     , table1
	     , chair1
	     , person_sitting1
	     , computer_on4
	     , monitor_on6
	     , keyboard1
	     , phone1
	     , monitor_on7
	     , monitor_on8 );

    }
    {				
    officeWorker2 = new ShapeGroup( Main.this, SHAPE_DRAW_2D3D, true, 620.0, 340.0, 0.0, 3.9269908169872414
	
	     , table2
	     , chair2
	     , person_sitting2
	     , computer_on5
	     , monitor_on9
	     , keyboard2
	     , phone2
	     , monitor_on10
	     , monitor_on11 );

    }
    {				
    officeWorker3 = new ShapeGroup( Main.this, SHAPE_DRAW_2D3D, true, 1210.0, 490.0, 0.0, 2.356194490192345
	
	     , table3
	     , chair3
	     , person_sitting3
	     , computer_on6
	     , monitor_on12
	     , keyboard3
	     , phone3
	     , monitor_on13
	     , monitor_on14 );

    }
    {
    infeedLineFood = new ConveyorPath<Item>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _infeedLineFood_controller_xjal, _infeedLineFood_segments_xjal() );

    }
    {
    foodMergePoint = new PositionOnConveyor<Item>( infeedLineFood, SHAPE_DRAW_2D3D, true, 501.8066503435133,
        _foodMergePoint_controller_xjal );

    }
    foodMergePoint.setVisible( false );
    {
    infeedMergeConveyor = new ConveyorPath<Item>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _infeedMergeConveyor_controller_xjal, _infeedMergeConveyor_segments_xjal() );

    }
    {
    mergeToFoodRack = new ConveyorPath<Item>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _mergeToFoodRack_controller_xjal, _mergeToFoodRack_segments_xjal() );

    }
    {
    toFoodRack = new ConveyorPath<Item>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _toFoodRack_controller_xjal, _toFoodRack_segments_xjal() );

    }
    {
    mergeToBeverageRack = new ConveyorPath<Item>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _mergeToBeverageRack_controller_xjal, _mergeToBeverageRack_segments_xjal() );

    }
    {
    toDishRack = new ConveyorPath<Item>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _toDishRack_controller_xjal, _toDishRack_segments_xjal() );

    }
    {
    toBeverageRack = new ConveyorPath<Item>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _toBeverageRack_controller_xjal, _toBeverageRack_segments_xjal() );

    }
    {
    beveragesAndDishesLine1 = new ConveyorPath<Item>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, false, 0.0, _beveragesAndDishesLine1_controller_xjal, _beveragesAndDishesLine1_segments_xjal() );

    }
    {
    beverageDishMergePoint = new PositionOnConveyor<Item>( beveragesAndDishesLine1, SHAPE_DRAW_2D3D, true, 620.0,
        _beverageDishMergePoint_controller_xjal );

    }
    beverageDishMergePoint.setVisible( false );
    {
    beveragesAndDishesLine = new ConveyorPath<Item>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _beveragesAndDishesLine_controller_xjal, _beveragesAndDishesLine_segments_xjal() );

    }
    {
    foodPickInLine = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _foodPickInLine_controller_xjal, _foodPickInLine_segments_xjal() );

    }
    {
    conveyor18 = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _conveyor18_controller_xjal, _conveyor18_segments_xjal() );

    }
    {
    cartonInitialLine = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _cartonInitialLine_controller_xjal, _cartonInitialLine_segments_xjal() );

    }
    {
    labelingStation = new ConveyorSimpleStation<Carton>( cartonInitialLine, SHAPE_DRAW_2D3D, true, 110.0, 1.0,
        gray, black, _labelingStation_controller_xjal );

    }
    {
    invoiceStation = new ConveyorSimpleStation<Carton>( cartonInitialLine, SHAPE_DRAW_2D3D, true, 200.0, 1.0,
        gray, black, _invoiceStation_controller_xjal );

    }
    {
    foodPickOutLine = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _foodPickOutLine_controller_xjal, _foodPickOutLine_segments_xjal() );

    }
    {
    toBeveragePick = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _toBeveragePick_controller_xjal, _toBeveragePick_segments_xjal() );

    }
    {
    beveragePickInLine = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _beveragePickInLine_controller_xjal, _beveragePickInLine_segments_xjal() );

    }
    {
    conveyor22 = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, false, 0.0, _conveyor22_controller_xjal, _conveyor22_segments_xjal() );

    }
    {
    beveragePickOutLine = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _beveragePickOutLine_controller_xjal, _beveragePickOutLine_segments_xjal() );

    }
    {
    toDishPick = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _toDishPick_controller_xjal, _toDishPick_segments_xjal() );

    }
    {
    dishPickInLine = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _dishPickInLine_controller_xjal, _dishPickInLine_segments_xjal() );

    }
    {
    conveyor26 = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _conveyor26_controller_xjal, _conveyor26_segments_xjal() );

    }
    {
    conveyor28 = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _conveyor28_controller_xjal, _conveyor28_segments_xjal() );

    }
    {
    checkOrderStation = new ConveyorSimpleStation<Carton>( conveyor28, SHAPE_DRAW_2D3D, true, 70.0, 1.0,
        gray, black, _checkOrderStation_controller_xjal );

    }
    {
    dishPickOutLine = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _dishPickOutLine_controller_xjal, _dishPickOutLine_segments_xjal() );

    }
    {
    returnToPickingLine = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _returnToPickingLine_controller_xjal, _returnToPickingLine_segments_xjal() );

    }
    {
    toFoodPick = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _toFoodPick_controller_xjal, _toFoodPick_segments_xjal() );

    }
    {
    pickingLinesStart = new PositionOnConveyor<Carton>( toFoodPick, SHAPE_DRAW_2D3D, true, 55.0,
        _pickingLinesStart_controller_xjal );

    }
    pickingLinesStart.setVisible( false );
    {
    conveyor30 = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _conveyor30_controller_xjal, _conveyor30_segments_xjal() );

    }
    {
    conveyor32 = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _conveyor32_controller_xjal, _conveyor32_segments_xjal() );

    }
    {
    conveyor34 = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _conveyor34_controller_xjal, _conveyor34_segments_xjal() );

    }
    {
    conveyor35 = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _conveyor35_controller_xjal, _conveyor35_segments_xjal() );

    }
    {
    packagingLine1 = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _packagingLine1_controller_xjal, _packagingLine1_segments_xjal() );

    }
    {
    station = new ConveyorSimpleStation<Carton>( packagingLine1, SHAPE_DRAW_2D3D, true, 80.0, 1.0,
        gray, black, _station_controller_xjal );

    }
    {
    packagingLine2 = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, false, 0.0, _packagingLine2_controller_xjal, _packagingLine2_segments_xjal() );

    }
    {
    station1 = new ConveyorSimpleStation<Carton>( packagingLine2, SHAPE_DRAW_2D3D, true, 80.0, 1.0,
        gray, black, _station1_controller_xjal );

    }
    {
    packagingLine3 = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _packagingLine3_controller_xjal, _packagingLine3_segments_xjal() );

    }
    {
    station2 = new ConveyorSimpleStation<Carton>( packagingLine3, SHAPE_DRAW_2D3D, true, 90.0, 1.0,
        gray, black, _station2_controller_xjal );

    }
    {
    conveyor33 = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _conveyor33_controller_xjal, _conveyor33_segments_xjal() );

    }
    {
    conveyor39 = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _conveyor39_controller_xjal, _conveyor39_segments_xjal() );

    }
    {
    conveyor40 = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _conveyor40_controller_xjal, _conveyor40_segments_xjal() );

    }
    {
    toSorter = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, false, 0.0, _toSorter_controller_xjal, _toSorter_segments_xjal() );

    }
    {
    shippingLabelingStation = new ConveyorSimpleStation<Carton>( toSorter, SHAPE_DRAW_2D3D, true, 130.0, 2.0,
        gray, black, _shippingLabelingStation_controller_xjal );

    }
    {
    scanner = new PositionOnConveyor<Carton>( toSorter, SHAPE_DRAW_2D3D, true, 559.9557428756427,
        _scanner_controller_xjal );

    }
    {
    conveyor43 = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _conveyor43_controller_xjal, _conveyor43_segments_xjal() );

    }
    {
    exitLine1 = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _exitLine1_controller_xjal, _exitLine1_segments_xjal() );

    }
    {
    conveyor45 = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _conveyor45_controller_xjal, _conveyor45_segments_xjal() );

    }
    {
    exitLine2 = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _exitLine2_controller_xjal, _exitLine2_segments_xjal() );

    }
    {
    conveyor47 = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _conveyor47_controller_xjal, _conveyor47_segments_xjal() );

    }
    {
    conveyor49 = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _conveyor49_controller_xjal, _conveyor49_segments_xjal() );

    }
    {
    recirculationLine = new PositionOnConveyor<Carton>( conveyor49, SHAPE_DRAW_2D3D, true, 467.7162666166166,
        _recirculationLine_controller_xjal );

    }
    {
    conveyor = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _conveyor_controller_xjal, _conveyor_segments_xjal() );

    }
    {
    conveyor3 = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _conveyor3_controller_xjal, _conveyor3_segments_xjal() );

    }
    {
    conveyor4 = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _conveyor4_controller_xjal, _conveyor4_segments_xjal() );

    }
    {
    conveyor36 = new ConveyorPath<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1.0, gray, true, 0.0, _conveyor36_controller_xjal, _conveyor36_segments_xjal() );

    }
    {
    packageLinesEntryPoint = new PositionOnConveyor<Carton>( conveyor36, SHAPE_DRAW_2D3D, true, 88.33784641680124,
        _packageLinesEntryPoint_controller_xjal );

    }
    packageLinesEntryPoint.setVisible( false );
    {
    conveyor8 = new ConveyorPath<Pallet>( this, SHAPE_DRAW_2D3D, true, true, 1.0, silver, false, 0.0, _conveyor8_controller_xjal, _conveyor8_segments_xjal() );

    }
    {
    conveyor2 = new ConveyorPath<Pallet>( this, SHAPE_DRAW_2D3D, true, true, 1.0, silver, false, 0.0, _conveyor2_controller_xjal, _conveyor2_segments_xjal() );

    }
    {
    conveyor1 = new ConveyorPath<Pallet>( this, SHAPE_DRAW_2D3D, true, true, 1.0, silver, false, 0.0, _conveyor1_controller_xjal, _conveyor1_segments_xjal() );

    }
    {
    conveyor10 = new ConveyorPath<Pallet>( this, SHAPE_DRAW_2D3D, true, true, 1.0, silver, false, 0.0, _conveyor10_controller_xjal, _conveyor10_segments_xjal() );

    }
    {
    exitPalletLine = new ConveyorPath<Pallet>( this, SHAPE_DRAW_2D3D, true, true, 1.0, silver, false, 0.0, _exitPalletLine_controller_xjal, _exitPalletLine_segments_xjal() );

    }
    {
    exitPalletLinePoint = new PositionOnConveyor<Pallet>( exitPalletLine, SHAPE_DRAW_2D3D, true, 175.0225081886825,
        _exitPalletLinePoint_controller_xjal );

    }
    exitPalletLinePoint.setVisible( false );
    {
    conveyor7 = new ConveyorPath<Pallet>( this, SHAPE_DRAW_2D3D, true, true, 1.0, silver, false, 0.0, _conveyor7_controller_xjal, _conveyor7_segments_xjal() );

    }
    {
    conveyor5 = new ConveyorPath<Pallet>( this, SHAPE_DRAW_2D3D, true, true, 1.0, silver, false, 0.0, _conveyor5_controller_xjal, _conveyor5_segments_xjal() );

    }
    {
    workerPalletLine = new ConveyorPath<Pallet>( this, SHAPE_DRAW_2D3D, true, true, 1.0, silver, false, 0.0, _workerPalletLine_controller_xjal, _workerPalletLine_segments_xjal() );

    }
    {
    dishPalletLinePickup = new ConveyorPath<Pallet>( this, SHAPE_DRAW_2D3D, true, true, 1.0, silver, false, 0.0, _dishPalletLinePickup_controller_xjal, _dishPalletLinePickup_segments_xjal() );

    }
    {
    beveragePalletLinePickup = new ConveyorPath<Pallet>( this, SHAPE_DRAW_2D3D, true, true, 1.0, silver, false, 0.0, _beveragePalletLinePickup_controller_xjal, _beveragePalletLinePickup_segments_xjal() );

    }
    {
    robotPalletLine = new ConveyorPath<Pallet>( this, SHAPE_DRAW_2D3D, true, true, 1.0, silver, false, 0.0, _robotPalletLine_controller_xjal, _robotPalletLine_segments_xjal() );

    }
    {
    foodUnloadingPoint = new PositionOnConveyor<Pallet>( robotPalletLine, SHAPE_DRAW_2D3D, true, 133.0,
        _foodUnloadingPoint_controller_xjal );

    }
    foodUnloadingPoint.setVisible( false );
    {
    turntable = new ConveyorTurntable<Item>( this, SHAPE_DRAW_2D3D, true, true, 430.0, 200.0, 30.0, gray, black, _turntable_controller_xjal, new PathEnd[] { new PathEnd(infeedLineFood, PathEndType.END), new PathEnd(beveragesAndDishesLine1, PathEndType.END), new PathEnd(infeedMergeConveyor, PathEndType.BEGIN)} );

    }
    {
    turntable1 = new ConveyorTurntable<Item>( this, SHAPE_DRAW_2D3D, true, true, 690.0, 150.0, 30.0, gray, black, _turntable1_controller_xjal, new PathEnd[] { new PathEnd(infeedMergeConveyor, PathEndType.END), new PathEnd(mergeToFoodRack, PathEndType.BEGIN)} );

    }
    {
    turntable2 = new ConveyorTurntable<Item>( this, SHAPE_DRAW_2D3D, true, true, 760.0, 150.0, 30.0, gray, black, _turntable2_controller_xjal, new PathEnd[] { new PathEnd(mergeToFoodRack, PathEndType.END), new PathEnd(toFoodRack, PathEndType.BEGIN), new PathEnd(mergeToBeverageRack, PathEndType.BEGIN)} );

    }
    {
    turntable3 = new ConveyorTurntable<Item>( this, SHAPE_DRAW_2D3D, true, true, 820.0, 150.0, 30.0, gray, black, _turntable3_controller_xjal, new PathEnd[] { new PathEnd(mergeToBeverageRack, PathEndType.END), new PathEnd(toDishRack, PathEndType.BEGIN), new PathEnd(toBeverageRack, PathEndType.BEGIN)} );

    }
    {
    conveyorPointNode = new ConveyorPointNode( this, SHAPE_DRAW_2D3D, true, 380.0, 550.0, 0.0, new PathEnd[] { new PathEnd(beveragesAndDishesLine, PathEndType.END), new PathEnd(beveragesAndDishesLine1, PathEndType.BEGIN)} );

    }
    {
    transferTable6 = new ConveyorTransferTable<Carton>( this, SHAPE_DRAW_2D3D, true, true, 840.0, 550.0, 6.0, gray, black, _transferTable6_controller_xjal, new PathEnd[] { new PathEnd(toFoodPick, PathEndType.END), new PathEnd(foodPickInLine, PathEndType.BEGIN), new PathEnd(conveyor18, PathEndType.BEGIN)} );

    }
    {
    transferTable7 = new ConveyorTransferTable<Carton>( this, SHAPE_DRAW_2D3D, true, true, 860.0, 550.0, 6.0, gray, black, _transferTable7_controller_xjal, new PathEnd[] { new PathEnd(conveyor18, PathEndType.END), new PathEnd(foodPickOutLine, PathEndType.END), new PathEnd(toBeveragePick, PathEndType.BEGIN)} );

    }
    {
    transferTable8 = new ConveyorTransferTable<Carton>( this, SHAPE_DRAW_2D3D, true, true, 900.0, 550.0, 6.0, gray, black, _transferTable8_controller_xjal, new PathEnd[] { new PathEnd(toBeveragePick, PathEndType.END), new PathEnd(beveragePickInLine, PathEndType.BEGIN), new PathEnd(conveyor22, PathEndType.BEGIN)} );

    }
  }
  
  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP1_xjal() {
    {
    transferTable9 = new ConveyorTransferTable<Carton>( this, SHAPE_DRAW_2D3D, true, true, 920.0, 550.0, 6.0, gray, black, _transferTable9_controller_xjal, new PathEnd[] { new PathEnd(conveyor22, PathEndType.END), new PathEnd(beveragePickOutLine, PathEndType.END), new PathEnd(toDishPick, PathEndType.BEGIN)} );

    }
    {
    transferTable10 = new ConveyorTransferTable<Carton>( this, SHAPE_DRAW_2D3D, true, true, 960.0, 550.0, 6.0, gray, black, _transferTable10_controller_xjal, new PathEnd[] { new PathEnd(toDishPick, PathEndType.END), new PathEnd(dishPickInLine, PathEndType.BEGIN), new PathEnd(conveyor26, PathEndType.BEGIN)} );

    }
    {
    transferTable11 = new ConveyorTransferTable<Carton>( this, SHAPE_DRAW_2D3D, true, true, 980.0, 550.0, 6.0, gray, black, _transferTable11_controller_xjal, new PathEnd[] { new PathEnd(conveyor26, PathEndType.END), new PathEnd(dishPickOutLine, PathEndType.END), new PathEnd(conveyor28, PathEndType.BEGIN)} );

    }
    {
    transferTable13 = new ConveyorTransferTable<Carton>( this, SHAPE_DRAW_2D3D, true, true, 750.0, 550.0, 6.0, gray, black, _transferTable13_controller_xjal, new PathEnd[] { new PathEnd(cartonInitialLine, PathEndType.END), new PathEnd(returnToPickingLine, PathEndType.END), new PathEnd(toFoodPick, PathEndType.BEGIN)} );

    }
    {
    transferTable12 = new ConveyorTransferTable<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1100.0, 550.0, 6.0, gray, black, _transferTable12_controller_xjal, new PathEnd[] { new PathEnd(conveyor28, PathEndType.END), new PathEnd(returnToPickingLine, PathEndType.BEGIN), new PathEnd(conveyor30, PathEndType.BEGIN)} );

    }
    {
    turntable4 = new ConveyorTurntable<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1150.0, 500.0, 6.0, gray, black, _turntable4_controller_xjal, new PathEnd[] { new PathEnd(conveyor36, PathEndType.END), new PathEnd(conveyor32, PathEndType.BEGIN), new PathEnd(packagingLine1, PathEndType.BEGIN)} );

    }
    {
    turntable5 = new ConveyorTurntable<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1099.38, 450.708, 6.0, gray, black, _turntable5_controller_xjal, new PathEnd[] { new PathEnd(conveyor32, PathEndType.END), new PathEnd(conveyor34, PathEndType.BEGIN), new PathEnd(packagingLine2, PathEndType.BEGIN)} );

    }
    {
    turntable6 = new ConveyorTurntable<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1051.88, 407.924, 6.0, gray, black, _turntable6_controller_xjal, new PathEnd[] { new PathEnd(conveyor34, PathEndType.END), new PathEnd(conveyor35, PathEndType.BEGIN), new PathEnd(packagingLine3, PathEndType.BEGIN)} );

    }
    {
    turntable7 = new ConveyorTurntable<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1100.0, 250.0, 6.0, gray, black, _turntable7_controller_xjal, new PathEnd[] { new PathEnd(packagingLine1, PathEndType.END), new PathEnd(conveyor33, PathEndType.END), new PathEnd(conveyor39, PathEndType.BEGIN)} );

    }
    {
    turntable8 = new ConveyorTurntable<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1050.0, 250.0, 6.0, gray, black, _turntable8_controller_xjal, new PathEnd[] { new PathEnd(packagingLine2, PathEndType.END), new PathEnd(conveyor39, PathEndType.END), new PathEnd(conveyor40, PathEndType.BEGIN)} );

    }
    {
    turntable9 = new ConveyorTurntable<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1000.0, 250.0, 6.0, gray, black, _turntable9_controller_xjal, new PathEnd[] { new PathEnd(packagingLine3, PathEndType.END), new PathEnd(conveyor40, PathEndType.END), new PathEnd(toSorter, PathEndType.BEGIN)} );

    }
    {
    transferTable14 = new ConveyorTransferTable<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1190.0, 250.0, 6.0, gray, black, _transferTable14_controller_xjal, new PathEnd[] { new PathEnd(conveyor49, PathEndType.END), new PathEnd(conveyor33, PathEndType.BEGIN)} );

    }
    {
    transferTable15 = new ConveyorTransferTable<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1270.0, 150.0, 6.0, gray, black, _transferTable15_controller_xjal, new PathEnd[] { new PathEnd(toSorter, PathEndType.END), new PathEnd(conveyor43, PathEndType.BEGIN), new PathEnd(exitLine1, PathEndType.BEGIN)} );

    }
    {
    transferTable16 = new ConveyorTransferTable<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1270.0, 250.0, 6.0, gray, black, _transferTable16_controller_xjal, new PathEnd[] { new PathEnd(conveyor43, PathEndType.END), new PathEnd(conveyor45, PathEndType.BEGIN), new PathEnd(exitLine2, PathEndType.BEGIN)} );

    }
    {
    transferTable17 = new ConveyorTransferTable<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1270.0, 350.0, 6.0, gray, black, _transferTable17_controller_xjal, new PathEnd[] { new PathEnd(conveyor45, PathEndType.END), new PathEnd(conveyor47, PathEndType.BEGIN)} );

    }
    {
    transferTable18 = new ConveyorTransferTable<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1270.0, 450.0, 6.0, gray, black, _transferTable18_controller_xjal, new PathEnd[] { new PathEnd(conveyor47, PathEndType.END), new PathEnd(conveyor49, PathEndType.BEGIN)} );

    }
    {
    transferTable1 = new ConveyorTransferTable<Carton>( this, SHAPE_DRAW_2D3D, true, true, 860.0, 480.0, 6.0, gray, black, _transferTable1_controller_xjal, new PathEnd[] { new PathEnd(conveyor, PathEndType.END), new PathEnd(foodPickOutLine, PathEndType.BEGIN)} );

    }
    {
    transferTable = new ConveyorTransferTable<Carton>( this, SHAPE_DRAW_2D3D, true, true, 840.0, 480.0, 6.0, gray, black, _transferTable_controller_xjal, new PathEnd[] { new PathEnd(foodPickInLine, PathEndType.END), new PathEnd(conveyor, PathEndType.BEGIN)} );

    }
    {
    transferTable5 = new ConveyorTransferTable<Carton>( this, SHAPE_DRAW_2D3D, true, true, 920.0, 480.0, 6.0, gray, black, _transferTable5_controller_xjal, new PathEnd[] { new PathEnd(conveyor3, PathEndType.END), new PathEnd(beveragePickOutLine, PathEndType.BEGIN)} );

    }
    {
    transferTable4 = new ConveyorTransferTable<Carton>( this, SHAPE_DRAW_2D3D, true, true, 900.0, 480.0, 6.0, gray, black, _transferTable4_controller_xjal, new PathEnd[] { new PathEnd(beveragePickInLine, PathEndType.END), new PathEnd(conveyor3, PathEndType.BEGIN)} );

    }
    {
    transferTable19 = new ConveyorTransferTable<Carton>( this, SHAPE_DRAW_2D3D, true, true, 960.0, 480.0, 6.0, gray, black, _transferTable19_controller_xjal, new PathEnd[] { new PathEnd(dishPickInLine, PathEndType.END), new PathEnd(conveyor4, PathEndType.BEGIN)} );

    }
    {
    transferTable20 = new ConveyorTransferTable<Carton>( this, SHAPE_DRAW_2D3D, true, true, 980.0, 480.0, 6.0, gray, black, _transferTable20_controller_xjal, new PathEnd[] { new PathEnd(conveyor4, PathEndType.END), new PathEnd(dishPickOutLine, PathEndType.BEGIN)} );

    }
    {
    turnStation = new ConveyorTurnStation<Carton>( this, SHAPE_DRAW_2D3D, true, true, 1140.0, 550.0, 6.0, gray, black, _turnStation_controller_xjal, new PathEnd[] { new PathEnd(conveyor30, PathEndType.END), new PathEnd(conveyor36, PathEndType.BEGIN)} );

    }
    {
    turntable11 = new ConveyorTurntable<Pallet>( this, SHAPE_DRAW_2D3D, true, true, 170.0, 350.0, 1.0, gray, black, _turntable11_controller_xjal, new PathEnd[] { new PathEnd(conveyor1, PathEndType.END), new PathEnd(conveyor2, PathEndType.BEGIN), new PathEnd(conveyor10, PathEndType.BEGIN)} );

    }
    {
    turntable12 = new ConveyorTurntable<Pallet>( this, SHAPE_DRAW_2D3D, true, true, 230.0, 350.0, 1.0, gray, black, _turntable12_controller_xjal, new PathEnd[] { new PathEnd(conveyor8, PathEndType.END), new PathEnd(conveyor10, PathEndType.END), new PathEnd(exitPalletLine, PathEndType.BEGIN)} );

    }
    {
    transferTable2 = new ConveyorTransferTable<Pallet>( this, SHAPE_DRAW_2D3D, true, true, 300.0, 440.0, 1.0, gray, black, _transferTable2_controller_xjal, new PathEnd[] { new PathEnd(workerPalletLine, PathEndType.END), new PathEnd(conveyor5, PathEndType.BEGIN), new PathEnd(dishPalletLinePickup, PathEndType.BEGIN)} );

    }
    {
    turntable13 = new ConveyorTurntable<Pallet>( this, SHAPE_DRAW_2D3D, true, true, 300.0, 350.0, 1.0, gray, black, _turntable13_controller_xjal, new PathEnd[] { new PathEnd(conveyor7, PathEndType.END), new PathEnd(conveyor8, PathEndType.BEGIN)} );

    }
    {
    transferTable3 = new ConveyorTransferTable<Pallet>( this, SHAPE_DRAW_2D3D, true, true, 300.0, 400.0, 1.0, gray, black, _transferTable3_controller_xjal, new PathEnd[] { new PathEnd(conveyor5, PathEndType.END), new PathEnd(conveyor7, PathEndType.BEGIN), new PathEnd(beveragePalletLinePickup, PathEndType.BEGIN)} );

    }
    {
    turntable10 = new ConveyorTurntable<Pallet>( this, SHAPE_DRAW_2D3D, true, true, 100.0, 350.0, 1.0, gray, black, _turntable10_controller_xjal, new PathEnd[] { new PathEnd(robotPalletLine, PathEndType.END), new PathEnd(conveyor1, PathEndType.BEGIN)} );

    }
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBS0_xjal() {
  }


  // Static initialization of persistent elements
  private void instantiatePersistentElements_xjal() {
    network = new com.anylogic.engine.markup.Network(this, "network", SHAPE_DRAW_2D3D, 0.0, true, true);  			
    network1 = new com.anylogic.engine.markup.Network(this, "network1", SHAPE_DRAW_2D3D, 0.0, true, true);  			
    network2 = new com.anylogic.engine.markup.Network(this, "network2", SHAPE_DRAW_2D3D, 0.0, true, true);  			
    network3 = new com.anylogic.engine.markup.Network(this, "network3", SHAPE_DRAW_2D3D, 0.0, true, true);  			
    network4 = new com.anylogic.engine.markup.Network(this, "network4", SHAPE_DRAW_2D3D, 0.0, true, true);  			
    network5 = new com.anylogic.engine.markup.Network(this, "network5", SHAPE_DRAW_2D3D, 0.0, true, false);  			
    network6 = new com.anylogic.engine.markup.Network(this, "network6", SHAPE_DRAW_2D, 0.0, true, true);  			
	_getNetworks_xjal = new INetwork[] { 
      network,
      network1,
      network2,
      network3,
      network4,
      network5,
      network6 };
    level = new com.anylogic.engine.markup.Level(this, "level", SHAPE_DRAW_2D3D, 0.0, true, true);  			
	_getLevels_xjal = new com.anylogic.engine.markup.Level[] { 
      level };
    conveyorNetwork1 = new com.anylogic.engine.markup.ConveyorNetwork(this, "conveyorNetwork1", SHAPE_DRAW_2D3D, 0.0, true, true);  			
    conveyorNetwork2 = new com.anylogic.engine.markup.ConveyorNetwork(this, "conveyorNetwork2", SHAPE_DRAW_2D3D, 0.0, true, true);  			
    conveyorNetwork = new com.anylogic.engine.markup.ConveyorNetwork(this, "conveyorNetwork", SHAPE_DRAW_2D3D, 0.0, true, true);  			
	_getConveyorNetworks_xjal = new com.anylogic.engine.markup.ConveyorNetwork[] { 
      conveyorNetwork1,
      conveyorNetwork2,
      conveyorNetwork };
    _createPersistentElementsBP0_xjal();
    _createPersistentElementsBP1_xjal();
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public int getCameras3D(Map<String, Camera3D> _output) {
    if ( _output != null ) {
      _output.put( "camera", this.camera );
    }
    return 1 + super.getCameras3D( _output );
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
  public Main( Engine engine, Agent owner, AgentList<? extends Main> ownerPopulation ) {
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
    foodPalletSource = instantiate_foodPalletSource_xjal();
    toRobot = instantiate_toRobot_xjal();
    palletToExit = instantiate_palletToExit_xjal();
    sink1 = instantiate_sink1_xjal();
    robotDropOffStation = instantiate_robotDropOffStation_xjal();
    toRack = instantiate_toRack_xjal();
    pickupRobot = instantiate_pickupRobot_xjal();
    dishPalletSource = instantiate_dishPalletSource_xjal();
    beveragesPalletSource = instantiate_beveragesPalletSource_xjal();
    toWorker = instantiate_toWorker_xjal();
    workerDropOffStation = instantiate_workerDropOffStation_xjal();
    worker = instantiate_worker_xjal();
    emptyPalletExit = instantiate_emptyPalletExit_xjal();
    sink2 = instantiate_sink2_xjal();
    moveTo = instantiate_moveTo_xjal();
    asrs1 = instantiate_asrs1_xjal();
    asrs2 = instantiate_asrs2_xjal();
    asrs3 = instantiate_asrs3_xjal();
    conveyorEnter = instantiate_conveyorEnter_xjal();
    orderIsFullfilled = instantiate_orderIsFullfilled_xjal();
    toPackagingLines = instantiate_toPackagingLines_xjal();
    toSorterScanner = instantiate_toSorterScanner_xjal();
    toLoadZone = instantiate_toLoadZone_xjal();
    ordersSentToClient = instantiate_ordersSentToClient_xjal();
    queueToCartConv = instantiate_queueToCartConv_xjal();
    rackStore = instantiate_rackStore_xjal();
    enter = instantiate_enter_xjal();
    exit = instantiate_exit_xjal();
    atStore = instantiate_atStore_xjal();
    cartonsEnter = instantiate_cartonsEnter_xjal();
    pickingStation = instantiate_pickingStation_xjal();
    toStoringStation = instantiate_toStoringStation_xjal();
    foodStorageUnit = instantiate_foodStorageUnit_xjal();
    beverageStorageUnit = instantiate_beverageStorageUnit_xjal();
    dishStorageUnit = instantiate_dishStorageUnit_xjal();
    packager1 = instantiate_packager1_xjal();
    packager2 = instantiate_packager2_xjal();
    packager3 = instantiate_packager3_xjal();
    toPickingLine = instantiate_toPickingLine_xjal();
    conveytoWorkzone = instantiate_conveytoWorkzone_xjal();
    canEnterLine = instantiate_canEnterLine_xjal();
    convey = instantiate_convey_xjal();
    forklifts = instantiate_forklifts_xjal();
    moveToDock = instantiate_moveToDock_xjal();
    _turntable_controller_xjal = instantiate__turntable_controller_xjal_xjal();
    _foodMergePoint_controller_xjal = instantiate__foodMergePoint_controller_xjal_xjal();
    _infeedLineFood_controller_xjal = instantiate__infeedLineFood_controller_xjal_xjal();
    _infeedMergeConveyor_controller_xjal = instantiate__infeedMergeConveyor_controller_xjal_xjal();
    _turntable1_controller_xjal = instantiate__turntable1_controller_xjal_xjal();
    _turntable2_controller_xjal = instantiate__turntable2_controller_xjal_xjal();
    _mergeToFoodRack_controller_xjal = instantiate__mergeToFoodRack_controller_xjal_xjal();
    _toFoodRack_controller_xjal = instantiate__toFoodRack_controller_xjal_xjal();
    _mergeToBeverageRack_controller_xjal = instantiate__mergeToBeverageRack_controller_xjal_xjal();
    _toDishRack_controller_xjal = instantiate__toDishRack_controller_xjal_xjal();
    _turntable3_controller_xjal = instantiate__turntable3_controller_xjal_xjal();
    _toBeverageRack_controller_xjal = instantiate__toBeverageRack_controller_xjal_xjal();
    _beverageDishMergePoint_controller_xjal = instantiate__beverageDishMergePoint_controller_xjal_xjal();
    _beveragesAndDishesLine1_controller_xjal = instantiate__beveragesAndDishesLine1_controller_xjal_xjal();
    _beveragesAndDishesLine_controller_xjal = instantiate__beveragesAndDishesLine_controller_xjal_xjal();
    _foodPickInLine_controller_xjal = instantiate__foodPickInLine_controller_xjal_xjal();
    _transferTable6_controller_xjal = instantiate__transferTable6_controller_xjal_xjal();
    _conveyor18_controller_xjal = instantiate__conveyor18_controller_xjal_xjal();
    _labelingStation_controller_xjal = instantiate__labelingStation_controller_xjal_xjal();
    _invoiceStation_controller_xjal = instantiate__invoiceStation_controller_xjal_xjal();
    _cartonInitialLine_controller_xjal = instantiate__cartonInitialLine_controller_xjal_xjal();
    _foodPickOutLine_controller_xjal = instantiate__foodPickOutLine_controller_xjal_xjal();
    _toBeveragePick_controller_xjal = instantiate__toBeveragePick_controller_xjal_xjal();
    _transferTable7_controller_xjal = instantiate__transferTable7_controller_xjal_xjal();
    _transferTable8_controller_xjal = instantiate__transferTable8_controller_xjal_xjal();
    _beveragePickInLine_controller_xjal = instantiate__beveragePickInLine_controller_xjal_xjal();
    _conveyor22_controller_xjal = instantiate__conveyor22_controller_xjal_xjal();
    _transferTable9_controller_xjal = instantiate__transferTable9_controller_xjal_xjal();
    _beveragePickOutLine_controller_xjal = instantiate__beveragePickOutLine_controller_xjal_xjal();
    _toDishPick_controller_xjal = instantiate__toDishPick_controller_xjal_xjal();
    _dishPickInLine_controller_xjal = instantiate__dishPickInLine_controller_xjal_xjal();
    _conveyor26_controller_xjal = instantiate__conveyor26_controller_xjal_xjal();
    _transferTable10_controller_xjal = instantiate__transferTable10_controller_xjal_xjal();
    _transferTable11_controller_xjal = instantiate__transferTable11_controller_xjal_xjal();
    _checkOrderStation_controller_xjal = instantiate__checkOrderStation_controller_xjal_xjal();
    _conveyor28_controller_xjal = instantiate__conveyor28_controller_xjal_xjal();
    _dishPickOutLine_controller_xjal = instantiate__dishPickOutLine_controller_xjal_xjal();
    _returnToPickingLine_controller_xjal = instantiate__returnToPickingLine_controller_xjal_xjal();
    _transferTable13_controller_xjal = instantiate__transferTable13_controller_xjal_xjal();
    _pickingLinesStart_controller_xjal = instantiate__pickingLinesStart_controller_xjal_xjal();
    _toFoodPick_controller_xjal = instantiate__toFoodPick_controller_xjal_xjal();
    _conveyor30_controller_xjal = instantiate__conveyor30_controller_xjal_xjal();
    _transferTable12_controller_xjal = instantiate__transferTable12_controller_xjal_xjal();
    _conveyor32_controller_xjal = instantiate__conveyor32_controller_xjal_xjal();
    _turntable4_controller_xjal = instantiate__turntable4_controller_xjal_xjal();
    _conveyor34_controller_xjal = instantiate__conveyor34_controller_xjal_xjal();
    _turntable5_controller_xjal = instantiate__turntable5_controller_xjal_xjal();
    _conveyor35_controller_xjal = instantiate__conveyor35_controller_xjal_xjal();
    _turntable6_controller_xjal = instantiate__turntable6_controller_xjal_xjal();
    _station_controller_xjal = instantiate__station_controller_xjal_xjal();
    _packagingLine1_controller_xjal = instantiate__packagingLine1_controller_xjal_xjal();
    _station1_controller_xjal = instantiate__station1_controller_xjal_xjal();
    _packagingLine2_controller_xjal = instantiate__packagingLine2_controller_xjal_xjal();
    _station2_controller_xjal = instantiate__station2_controller_xjal_xjal();
    _packagingLine3_controller_xjal = instantiate__packagingLine3_controller_xjal_xjal();
    _conveyor33_controller_xjal = instantiate__conveyor33_controller_xjal_xjal();
    _conveyor39_controller_xjal = instantiate__conveyor39_controller_xjal_xjal();
    _turntable7_controller_xjal = instantiate__turntable7_controller_xjal_xjal();
    _conveyor40_controller_xjal = instantiate__conveyor40_controller_xjal_xjal();
    _turntable8_controller_xjal = instantiate__turntable8_controller_xjal_xjal();
    _turntable9_controller_xjal = instantiate__turntable9_controller_xjal_xjal();
    _shippingLabelingStation_controller_xjal = instantiate__shippingLabelingStation_controller_xjal_xjal();
    _scanner_controller_xjal = instantiate__scanner_controller_xjal_xjal();
    _toSorter_controller_xjal = instantiate__toSorter_controller_xjal_xjal();
    _transferTable14_controller_xjal = instantiate__transferTable14_controller_xjal_xjal();
    _conveyor43_controller_xjal = instantiate__conveyor43_controller_xjal_xjal();
    _exitLine1_controller_xjal = instantiate__exitLine1_controller_xjal_xjal();
    _transferTable15_controller_xjal = instantiate__transferTable15_controller_xjal_xjal();
    _conveyor45_controller_xjal = instantiate__conveyor45_controller_xjal_xjal();
    _transferTable16_controller_xjal = instantiate__transferTable16_controller_xjal_xjal();
    _exitLine2_controller_xjal = instantiate__exitLine2_controller_xjal_xjal();
    _conveyor47_controller_xjal = instantiate__conveyor47_controller_xjal_xjal();
    _transferTable17_controller_xjal = instantiate__transferTable17_controller_xjal_xjal();
    _transferTable18_controller_xjal = instantiate__transferTable18_controller_xjal_xjal();
    _recirculationLine_controller_xjal = instantiate__recirculationLine_controller_xjal_xjal();
    _conveyor49_controller_xjal = instantiate__conveyor49_controller_xjal_xjal();
    _transferTable1_controller_xjal = instantiate__transferTable1_controller_xjal_xjal();
    _transferTable_controller_xjal = instantiate__transferTable_controller_xjal_xjal();
    _conveyor_controller_xjal = instantiate__conveyor_controller_xjal_xjal();
    _transferTable5_controller_xjal = instantiate__transferTable5_controller_xjal_xjal();
    _transferTable4_controller_xjal = instantiate__transferTable4_controller_xjal_xjal();
    _conveyor3_controller_xjal = instantiate__conveyor3_controller_xjal_xjal();
    _transferTable19_controller_xjal = instantiate__transferTable19_controller_xjal_xjal();
    _transferTable20_controller_xjal = instantiate__transferTable20_controller_xjal_xjal();
    _conveyor4_controller_xjal = instantiate__conveyor4_controller_xjal_xjal();
    _packageLinesEntryPoint_controller_xjal = instantiate__packageLinesEntryPoint_controller_xjal_xjal();
    _conveyor36_controller_xjal = instantiate__conveyor36_controller_xjal_xjal();
    _turnStation_controller_xjal = instantiate__turnStation_controller_xjal_xjal();
    _conveyor8_controller_xjal = instantiate__conveyor8_controller_xjal_xjal();
    _conveyor2_controller_xjal = instantiate__conveyor2_controller_xjal_xjal();
    _turntable11_controller_xjal = instantiate__turntable11_controller_xjal_xjal();
    _conveyor1_controller_xjal = instantiate__conveyor1_controller_xjal_xjal();
    _conveyor10_controller_xjal = instantiate__conveyor10_controller_xjal_xjal();
    _turntable12_controller_xjal = instantiate__turntable12_controller_xjal_xjal();
    _exitPalletLinePoint_controller_xjal = instantiate__exitPalletLinePoint_controller_xjal_xjal();
    _exitPalletLine_controller_xjal = instantiate__exitPalletLine_controller_xjal_xjal();
    _conveyor7_controller_xjal = instantiate__conveyor7_controller_xjal_xjal();
    _transferTable2_controller_xjal = instantiate__transferTable2_controller_xjal_xjal();
    _turntable13_controller_xjal = instantiate__turntable13_controller_xjal_xjal();
    _conveyor5_controller_xjal = instantiate__conveyor5_controller_xjal_xjal();
    _workerPalletLine_controller_xjal = instantiate__workerPalletLine_controller_xjal_xjal();
    _transferTable3_controller_xjal = instantiate__transferTable3_controller_xjal_xjal();
    _dishPalletLinePickup_controller_xjal = instantiate__dishPalletLinePickup_controller_xjal_xjal();
    _beveragePalletLinePickup_controller_xjal = instantiate__beveragePalletLinePickup_controller_xjal_xjal();
    _turntable10_controller_xjal = instantiate__turntable10_controller_xjal_xjal();
    _foodUnloadingPoint_controller_xjal = instantiate__foodUnloadingPoint_controller_xjal_xjal();
    _robotPalletLine_controller_xjal = instantiate__robotPalletLine_controller_xjal_xjal();
	instantiatePersistentElements_xjal();
    setupReferences_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void setupReferences_xjal() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Main() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Main( int nInitialItemsPerType, int minAvailability, int minItemsInOrder, int maxItemsInOrder, double orderArrivalTime ) {
    markParametersAreSet();
    this.nInitialItemsPerType = nInitialItemsPerType;
    this.minAvailability = minAvailability;
    this.minItemsInOrder = minItemsInOrder;
    this.maxItemsInOrder = maxItemsInOrder;
    this.orderArrivalTime = orderArrivalTime;
  }
  
  /**
   * Creating embedded object instances
   */
  @AnyLogicInternalCodegenAPI
  private void instantiatePopulations_xjal() {
    {
      int _cnt = 
3 
;
      for ( int i = storingStations.size(); i < _cnt; i++ ) {
        instantiate_storingStations_xjal( i );
      }
    }
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Creating embedded object instances
    instantiatePopulations_xjal();
    // Assigning initial values for plain variables
    setupPlainVariables_Main_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
    _createPersistentElementsAP1_xjal();
	_initialize_network_xjal();
	_initialize_network1_xjal();
	_initialize_network2_xjal();
	_initialize_network3_xjal();
	_initialize_network4_xjal();
	_initialize_network5_xjal();
	_initialize_network6_xjal();
	_initialize_level_xjal();
	_initialize_conveyorNetwork1_xjal();
	_initialize_conveyorNetwork2_xjal();
	_initialize_conveyorNetwork_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( Main.this, true, 0, 0, 0, 0 , level, 
      // default light
      new Light3D.Daylight( null, false, true ) );
    window3d.setCamera( camera, false );
    addAll( packagingLines, new ConveyorPath[] 
{ packagingLine1, packagingLine2, packagingLine3 } 
    );
    addAll( exitLines, new ConveyorPath[] 
{ exitLine1, exitLine2} 
    );
    // Creating embedded object instances
    instantiatePopulations_xjal();
    icon = new ShapeModelElementsGroup( Main.this, getElementProperty( "warehouse_conveyor.Main.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
    // Environments setup
    {
      double _x_xjal = 
500 
;
      double _y_xjal = 
500 
;
      double _z_xjal = 
0 
;
      setupSpace( _x_xjal, _y_xjal, _z_xjal );
    }
    disableSteps();
    setNetworkUserDefined();
    setLayoutType( LAYOUT_USER_DEFINED );
    // Creating non-replicated embedded objects
    setupParameters_foodPalletSource_xjal( foodPalletSource, null );
    doBeforeCreate_foodPalletSource_xjal( foodPalletSource, null );
    foodPalletSource.createAsEmbedded();
    setupParameters_toRobot_xjal( toRobot, null );
    doBeforeCreate_toRobot_xjal( toRobot, null );
    toRobot.createAsEmbedded();
    setupParameters_palletToExit_xjal( palletToExit, null );
    doBeforeCreate_palletToExit_xjal( palletToExit, null );
    palletToExit.createAsEmbedded();
    setupParameters_sink1_xjal( sink1, null );
    doBeforeCreate_sink1_xjal( sink1, null );
    sink1.createAsEmbedded();
    setupParameters_robotDropOffStation_xjal( robotDropOffStation, null );
    doBeforeCreate_robotDropOffStation_xjal( robotDropOffStation, null );
    robotDropOffStation.createAsEmbedded();
    setupParameters_toRack_xjal( toRack, null );
    doBeforeCreate_toRack_xjal( toRack, null );
    toRack.createAsEmbedded();
    setupParameters_pickupRobot_xjal( pickupRobot, null );
    doBeforeCreate_pickupRobot_xjal( pickupRobot, null );
    pickupRobot.createAsEmbedded();
    setupParameters_dishPalletSource_xjal( dishPalletSource, null );
    doBeforeCreate_dishPalletSource_xjal( dishPalletSource, null );
    dishPalletSource.createAsEmbedded();
    setupParameters_beveragesPalletSource_xjal( beveragesPalletSource, null );
    doBeforeCreate_beveragesPalletSource_xjal( beveragesPalletSource, null );
    beveragesPalletSource.createAsEmbedded();
    setupParameters_toWorker_xjal( toWorker, null );
    doBeforeCreate_toWorker_xjal( toWorker, null );
    toWorker.createAsEmbedded();
    setupParameters_workerDropOffStation_xjal( workerDropOffStation, null );
    doBeforeCreate_workerDropOffStation_xjal( workerDropOffStation, null );
    workerDropOffStation.createAsEmbedded();
    setupParameters_worker_xjal( worker, null );
    doBeforeCreate_worker_xjal( worker, null );
    worker.createAsEmbedded();
    setupParameters_emptyPalletExit_xjal( emptyPalletExit, null );
    doBeforeCreate_emptyPalletExit_xjal( emptyPalletExit, null );
    emptyPalletExit.createAsEmbedded();
    setupParameters_sink2_xjal( sink2, null );
    doBeforeCreate_sink2_xjal( sink2, null );
    sink2.createAsEmbedded();
    setupParameters_moveTo_xjal( moveTo, null );
    doBeforeCreate_moveTo_xjal( moveTo, null );
    moveTo.createAsEmbedded();
    setupParameters_asrs1_xjal( asrs1, null );
    doBeforeCreate_asrs1_xjal( asrs1, null );
    asrs1.createAsEmbedded();
    setupParameters_asrs2_xjal( asrs2, null );
    doBeforeCreate_asrs2_xjal( asrs2, null );
    asrs2.createAsEmbedded();
    setupParameters_asrs3_xjal( asrs3, null );
    doBeforeCreate_asrs3_xjal( asrs3, null );
    asrs3.createAsEmbedded();
    setupParameters_conveyorEnter_xjal( conveyorEnter, null );
    doBeforeCreate_conveyorEnter_xjal( conveyorEnter, null );
    conveyorEnter.createAsEmbedded();
    setupParameters_orderIsFullfilled_xjal( orderIsFullfilled, null );
    doBeforeCreate_orderIsFullfilled_xjal( orderIsFullfilled, null );
    orderIsFullfilled.createAsEmbedded();
    setupParameters_toPackagingLines_xjal( toPackagingLines, null );
    doBeforeCreate_toPackagingLines_xjal( toPackagingLines, null );
    toPackagingLines.createAsEmbedded();
    setupParameters_toSorterScanner_xjal( toSorterScanner, null );
    doBeforeCreate_toSorterScanner_xjal( toSorterScanner, null );
    toSorterScanner.createAsEmbedded();
    setupParameters_toLoadZone_xjal( toLoadZone, null );
    doBeforeCreate_toLoadZone_xjal( toLoadZone, null );
    toLoadZone.createAsEmbedded();
    setupParameters_ordersSentToClient_xjal( ordersSentToClient, null );
    doBeforeCreate_ordersSentToClient_xjal( ordersSentToClient, null );
    ordersSentToClient.createAsEmbedded();
    setupParameters_queueToCartConv_xjal( queueToCartConv, null );
    doBeforeCreate_queueToCartConv_xjal( queueToCartConv, null );
    queueToCartConv.createAsEmbedded();
    setupParameters_rackStore_xjal( rackStore, null );
    doBeforeCreate_rackStore_xjal( rackStore, null );
    rackStore.createAsEmbedded();
    setupParameters_enter_xjal( enter, null );
    doBeforeCreate_enter_xjal( enter, null );
    enter.createAsEmbedded();
    setupParameters_exit_xjal( exit, null );
    doBeforeCreate_exit_xjal( exit, null );
    exit.createAsEmbedded();
    setupParameters_atStore_xjal( atStore, null );
    doBeforeCreate_atStore_xjal( atStore, null );
    atStore.createAsEmbedded();
    setupParameters_cartonsEnter_xjal( cartonsEnter, null );
    doBeforeCreate_cartonsEnter_xjal( cartonsEnter, null );
    cartonsEnter.createAsEmbedded();
    setupParameters_pickingStation_xjal( pickingStation, null );
    doBeforeCreate_pickingStation_xjal( pickingStation, null );
    pickingStation.createAsEmbedded();
    setupParameters_toStoringStation_xjal( toStoringStation, null );
    doBeforeCreate_toStoringStation_xjal( toStoringStation, null );
    toStoringStation.createAsEmbedded();
    setupParameters_foodStorageUnit_xjal( foodStorageUnit, null );
    doBeforeCreate_foodStorageUnit_xjal( foodStorageUnit, null );
    foodStorageUnit.createAsEmbedded();
    setupParameters_beverageStorageUnit_xjal( beverageStorageUnit, null );
    doBeforeCreate_beverageStorageUnit_xjal( beverageStorageUnit, null );
    beverageStorageUnit.createAsEmbedded();
    setupParameters_dishStorageUnit_xjal( dishStorageUnit, null );
    doBeforeCreate_dishStorageUnit_xjal( dishStorageUnit, null );
    dishStorageUnit.createAsEmbedded();
    setupParameters_packager1_xjal( packager1, null );
    doBeforeCreate_packager1_xjal( packager1, null );
    packager1.createAsEmbedded();
    setupParameters_packager2_xjal( packager2, null );
    doBeforeCreate_packager2_xjal( packager2, null );
    packager2.createAsEmbedded();
    setupParameters_packager3_xjal( packager3, null );
    doBeforeCreate_packager3_xjal( packager3, null );
    packager3.createAsEmbedded();
    setupParameters_toPickingLine_xjal( toPickingLine, null );
    doBeforeCreate_toPickingLine_xjal( toPickingLine, null );
    toPickingLine.createAsEmbedded();
    setupParameters_conveytoWorkzone_xjal( conveytoWorkzone, null );
    doBeforeCreate_conveytoWorkzone_xjal( conveytoWorkzone, null );
    conveytoWorkzone.createAsEmbedded();
    setupParameters_canEnterLine_xjal( canEnterLine, null );
    doBeforeCreate_canEnterLine_xjal( canEnterLine, null );
    canEnterLine.createAsEmbedded();
    setupParameters_convey_xjal( convey, null );
    doBeforeCreate_convey_xjal( convey, null );
    convey.createAsEmbedded();
    setupParameters_forklifts_xjal( forklifts, null );
    doBeforeCreate_forklifts_xjal( forklifts, null );
    forklifts.createAsEmbedded();
    setupParameters_moveToDock_xjal( moveToDock, null );
    doBeforeCreate_moveToDock_xjal( moveToDock, null );
    moveToDock.createAsEmbedded();
    setupParameters__turntable_controller_xjal_xjal( _turntable_controller_xjal, null );
    doBeforeCreate__turntable_controller_xjal_xjal( _turntable_controller_xjal, null );
    _turntable_controller_xjal.createAsEmbedded();
    setupParameters__foodMergePoint_controller_xjal_xjal( _foodMergePoint_controller_xjal, null );
    doBeforeCreate__foodMergePoint_controller_xjal_xjal( _foodMergePoint_controller_xjal, null );
    _foodMergePoint_controller_xjal.createAsEmbedded();
    setupParameters__infeedLineFood_controller_xjal_xjal( _infeedLineFood_controller_xjal, null );
    doBeforeCreate__infeedLineFood_controller_xjal_xjal( _infeedLineFood_controller_xjal, null );
    _infeedLineFood_controller_xjal.createAsEmbedded();
    setupParameters__infeedMergeConveyor_controller_xjal_xjal( _infeedMergeConveyor_controller_xjal, null );
    doBeforeCreate__infeedMergeConveyor_controller_xjal_xjal( _infeedMergeConveyor_controller_xjal, null );
    _infeedMergeConveyor_controller_xjal.createAsEmbedded();
    setupParameters__turntable1_controller_xjal_xjal( _turntable1_controller_xjal, null );
    doBeforeCreate__turntable1_controller_xjal_xjal( _turntable1_controller_xjal, null );
    _turntable1_controller_xjal.createAsEmbedded();
    setupParameters__turntable2_controller_xjal_xjal( _turntable2_controller_xjal, null );
    doBeforeCreate__turntable2_controller_xjal_xjal( _turntable2_controller_xjal, null );
    _turntable2_controller_xjal.createAsEmbedded();
    setupParameters__mergeToFoodRack_controller_xjal_xjal( _mergeToFoodRack_controller_xjal, null );
    doBeforeCreate__mergeToFoodRack_controller_xjal_xjal( _mergeToFoodRack_controller_xjal, null );
    _mergeToFoodRack_controller_xjal.createAsEmbedded();
    setupParameters__toFoodRack_controller_xjal_xjal( _toFoodRack_controller_xjal, null );
    doBeforeCreate__toFoodRack_controller_xjal_xjal( _toFoodRack_controller_xjal, null );
    _toFoodRack_controller_xjal.createAsEmbedded();
    setupParameters__mergeToBeverageRack_controller_xjal_xjal( _mergeToBeverageRack_controller_xjal, null );
    doBeforeCreate__mergeToBeverageRack_controller_xjal_xjal( _mergeToBeverageRack_controller_xjal, null );
    _mergeToBeverageRack_controller_xjal.createAsEmbedded();
    setupParameters__toDishRack_controller_xjal_xjal( _toDishRack_controller_xjal, null );
    doBeforeCreate__toDishRack_controller_xjal_xjal( _toDishRack_controller_xjal, null );
    _toDishRack_controller_xjal.createAsEmbedded();
    setupParameters__turntable3_controller_xjal_xjal( _turntable3_controller_xjal, null );
    doBeforeCreate__turntable3_controller_xjal_xjal( _turntable3_controller_xjal, null );
    _turntable3_controller_xjal.createAsEmbedded();
    setupParameters__toBeverageRack_controller_xjal_xjal( _toBeverageRack_controller_xjal, null );
    doBeforeCreate__toBeverageRack_controller_xjal_xjal( _toBeverageRack_controller_xjal, null );
    _toBeverageRack_controller_xjal.createAsEmbedded();
    setupParameters__beverageDishMergePoint_controller_xjal_xjal( _beverageDishMergePoint_controller_xjal, null );
    doBeforeCreate__beverageDishMergePoint_controller_xjal_xjal( _beverageDishMergePoint_controller_xjal, null );
    _beverageDishMergePoint_controller_xjal.createAsEmbedded();
    setupParameters__beveragesAndDishesLine1_controller_xjal_xjal( _beveragesAndDishesLine1_controller_xjal, null );
    doBeforeCreate__beveragesAndDishesLine1_controller_xjal_xjal( _beveragesAndDishesLine1_controller_xjal, null );
    _beveragesAndDishesLine1_controller_xjal.createAsEmbedded();
    setupParameters__beveragesAndDishesLine_controller_xjal_xjal( _beveragesAndDishesLine_controller_xjal, null );
    doBeforeCreate__beveragesAndDishesLine_controller_xjal_xjal( _beveragesAndDishesLine_controller_xjal, null );
    _beveragesAndDishesLine_controller_xjal.createAsEmbedded();
    setupParameters__foodPickInLine_controller_xjal_xjal( _foodPickInLine_controller_xjal, null );
    doBeforeCreate__foodPickInLine_controller_xjal_xjal( _foodPickInLine_controller_xjal, null );
    _foodPickInLine_controller_xjal.createAsEmbedded();
    setupParameters__transferTable6_controller_xjal_xjal( _transferTable6_controller_xjal, null );
    doBeforeCreate__transferTable6_controller_xjal_xjal( _transferTable6_controller_xjal, null );
    _transferTable6_controller_xjal.createAsEmbedded();
    setupParameters__conveyor18_controller_xjal_xjal( _conveyor18_controller_xjal, null );
    doBeforeCreate__conveyor18_controller_xjal_xjal( _conveyor18_controller_xjal, null );
    _conveyor18_controller_xjal.createAsEmbedded();
    setupParameters__labelingStation_controller_xjal_xjal( _labelingStation_controller_xjal, null );
    doBeforeCreate__labelingStation_controller_xjal_xjal( _labelingStation_controller_xjal, null );
    _labelingStation_controller_xjal.createAsEmbedded();
    setupParameters__invoiceStation_controller_xjal_xjal( _invoiceStation_controller_xjal, null );
    doBeforeCreate__invoiceStation_controller_xjal_xjal( _invoiceStation_controller_xjal, null );
    _invoiceStation_controller_xjal.createAsEmbedded();
    setupParameters__cartonInitialLine_controller_xjal_xjal( _cartonInitialLine_controller_xjal, null );
    doBeforeCreate__cartonInitialLine_controller_xjal_xjal( _cartonInitialLine_controller_xjal, null );
    _cartonInitialLine_controller_xjal.createAsEmbedded();
    setupParameters__foodPickOutLine_controller_xjal_xjal( _foodPickOutLine_controller_xjal, null );
    doBeforeCreate__foodPickOutLine_controller_xjal_xjal( _foodPickOutLine_controller_xjal, null );
    _foodPickOutLine_controller_xjal.createAsEmbedded();
    setupParameters__toBeveragePick_controller_xjal_xjal( _toBeveragePick_controller_xjal, null );
    doBeforeCreate__toBeveragePick_controller_xjal_xjal( _toBeveragePick_controller_xjal, null );
    _toBeveragePick_controller_xjal.createAsEmbedded();
    setupParameters__transferTable7_controller_xjal_xjal( _transferTable7_controller_xjal, null );
    doBeforeCreate__transferTable7_controller_xjal_xjal( _transferTable7_controller_xjal, null );
    _transferTable7_controller_xjal.createAsEmbedded();
    setupParameters__transferTable8_controller_xjal_xjal( _transferTable8_controller_xjal, null );
    doBeforeCreate__transferTable8_controller_xjal_xjal( _transferTable8_controller_xjal, null );
    _transferTable8_controller_xjal.createAsEmbedded();
    setupParameters__beveragePickInLine_controller_xjal_xjal( _beveragePickInLine_controller_xjal, null );
    doBeforeCreate__beveragePickInLine_controller_xjal_xjal( _beveragePickInLine_controller_xjal, null );
    _beveragePickInLine_controller_xjal.createAsEmbedded();
    setupParameters__conveyor22_controller_xjal_xjal( _conveyor22_controller_xjal, null );
    doBeforeCreate__conveyor22_controller_xjal_xjal( _conveyor22_controller_xjal, null );
    _conveyor22_controller_xjal.createAsEmbedded();
    setupParameters__transferTable9_controller_xjal_xjal( _transferTable9_controller_xjal, null );
    doBeforeCreate__transferTable9_controller_xjal_xjal( _transferTable9_controller_xjal, null );
    _transferTable9_controller_xjal.createAsEmbedded();
    setupParameters__beveragePickOutLine_controller_xjal_xjal( _beveragePickOutLine_controller_xjal, null );
    doBeforeCreate__beveragePickOutLine_controller_xjal_xjal( _beveragePickOutLine_controller_xjal, null );
    _beveragePickOutLine_controller_xjal.createAsEmbedded();
    setupParameters__toDishPick_controller_xjal_xjal( _toDishPick_controller_xjal, null );
    doBeforeCreate__toDishPick_controller_xjal_xjal( _toDishPick_controller_xjal, null );
    _toDishPick_controller_xjal.createAsEmbedded();
    setupParameters__dishPickInLine_controller_xjal_xjal( _dishPickInLine_controller_xjal, null );
    doBeforeCreate__dishPickInLine_controller_xjal_xjal( _dishPickInLine_controller_xjal, null );
    _dishPickInLine_controller_xjal.createAsEmbedded();
    setupParameters__conveyor26_controller_xjal_xjal( _conveyor26_controller_xjal, null );
    doBeforeCreate__conveyor26_controller_xjal_xjal( _conveyor26_controller_xjal, null );
    _conveyor26_controller_xjal.createAsEmbedded();
    setupParameters__transferTable10_controller_xjal_xjal( _transferTable10_controller_xjal, null );
    doBeforeCreate__transferTable10_controller_xjal_xjal( _transferTable10_controller_xjal, null );
    _transferTable10_controller_xjal.createAsEmbedded();
    setupParameters__transferTable11_controller_xjal_xjal( _transferTable11_controller_xjal, null );
    doBeforeCreate__transferTable11_controller_xjal_xjal( _transferTable11_controller_xjal, null );
    _transferTable11_controller_xjal.createAsEmbedded();
    setupParameters__checkOrderStation_controller_xjal_xjal( _checkOrderStation_controller_xjal, null );
    doBeforeCreate__checkOrderStation_controller_xjal_xjal( _checkOrderStation_controller_xjal, null );
    _checkOrderStation_controller_xjal.createAsEmbedded();
    setupParameters__conveyor28_controller_xjal_xjal( _conveyor28_controller_xjal, null );
    doBeforeCreate__conveyor28_controller_xjal_xjal( _conveyor28_controller_xjal, null );
    _conveyor28_controller_xjal.createAsEmbedded();
    setupParameters__dishPickOutLine_controller_xjal_xjal( _dishPickOutLine_controller_xjal, null );
    doBeforeCreate__dishPickOutLine_controller_xjal_xjal( _dishPickOutLine_controller_xjal, null );
    _dishPickOutLine_controller_xjal.createAsEmbedded();
    setupParameters__returnToPickingLine_controller_xjal_xjal( _returnToPickingLine_controller_xjal, null );
    doBeforeCreate__returnToPickingLine_controller_xjal_xjal( _returnToPickingLine_controller_xjal, null );
    _returnToPickingLine_controller_xjal.createAsEmbedded();
    setupParameters__transferTable13_controller_xjal_xjal( _transferTable13_controller_xjal, null );
    doBeforeCreate__transferTable13_controller_xjal_xjal( _transferTable13_controller_xjal, null );
    _transferTable13_controller_xjal.createAsEmbedded();
    setupParameters__pickingLinesStart_controller_xjal_xjal( _pickingLinesStart_controller_xjal, null );
    doBeforeCreate__pickingLinesStart_controller_xjal_xjal( _pickingLinesStart_controller_xjal, null );
    _pickingLinesStart_controller_xjal.createAsEmbedded();
    setupParameters__toFoodPick_controller_xjal_xjal( _toFoodPick_controller_xjal, null );
    doBeforeCreate__toFoodPick_controller_xjal_xjal( _toFoodPick_controller_xjal, null );
    _toFoodPick_controller_xjal.createAsEmbedded();
    setupParameters__conveyor30_controller_xjal_xjal( _conveyor30_controller_xjal, null );
    doBeforeCreate__conveyor30_controller_xjal_xjal( _conveyor30_controller_xjal, null );
    _conveyor30_controller_xjal.createAsEmbedded();
    setupParameters__transferTable12_controller_xjal_xjal( _transferTable12_controller_xjal, null );
    doBeforeCreate__transferTable12_controller_xjal_xjal( _transferTable12_controller_xjal, null );
    _transferTable12_controller_xjal.createAsEmbedded();
    setupParameters__conveyor32_controller_xjal_xjal( _conveyor32_controller_xjal, null );
    doBeforeCreate__conveyor32_controller_xjal_xjal( _conveyor32_controller_xjal, null );
    _conveyor32_controller_xjal.createAsEmbedded();
    setupParameters__turntable4_controller_xjal_xjal( _turntable4_controller_xjal, null );
    doBeforeCreate__turntable4_controller_xjal_xjal( _turntable4_controller_xjal, null );
    _turntable4_controller_xjal.createAsEmbedded();
    setupParameters__conveyor34_controller_xjal_xjal( _conveyor34_controller_xjal, null );
    doBeforeCreate__conveyor34_controller_xjal_xjal( _conveyor34_controller_xjal, null );
    _conveyor34_controller_xjal.createAsEmbedded();
    setupParameters__turntable5_controller_xjal_xjal( _turntable5_controller_xjal, null );
    doBeforeCreate__turntable5_controller_xjal_xjal( _turntable5_controller_xjal, null );
    _turntable5_controller_xjal.createAsEmbedded();
    setupParameters__conveyor35_controller_xjal_xjal( _conveyor35_controller_xjal, null );
    doBeforeCreate__conveyor35_controller_xjal_xjal( _conveyor35_controller_xjal, null );
    _conveyor35_controller_xjal.createAsEmbedded();
    setupParameters__turntable6_controller_xjal_xjal( _turntable6_controller_xjal, null );
    doBeforeCreate__turntable6_controller_xjal_xjal( _turntable6_controller_xjal, null );
    _turntable6_controller_xjal.createAsEmbedded();
    setupParameters__station_controller_xjal_xjal( _station_controller_xjal, null );
    doBeforeCreate__station_controller_xjal_xjal( _station_controller_xjal, null );
    _station_controller_xjal.createAsEmbedded();
    setupParameters__packagingLine1_controller_xjal_xjal( _packagingLine1_controller_xjal, null );
    doBeforeCreate__packagingLine1_controller_xjal_xjal( _packagingLine1_controller_xjal, null );
    _packagingLine1_controller_xjal.createAsEmbedded();
    setupParameters__station1_controller_xjal_xjal( _station1_controller_xjal, null );
    doBeforeCreate__station1_controller_xjal_xjal( _station1_controller_xjal, null );
    _station1_controller_xjal.createAsEmbedded();
    setupParameters__packagingLine2_controller_xjal_xjal( _packagingLine2_controller_xjal, null );
    doBeforeCreate__packagingLine2_controller_xjal_xjal( _packagingLine2_controller_xjal, null );
    _packagingLine2_controller_xjal.createAsEmbedded();
    setupParameters__station2_controller_xjal_xjal( _station2_controller_xjal, null );
    doBeforeCreate__station2_controller_xjal_xjal( _station2_controller_xjal, null );
    _station2_controller_xjal.createAsEmbedded();
    setupParameters__packagingLine3_controller_xjal_xjal( _packagingLine3_controller_xjal, null );
    doBeforeCreate__packagingLine3_controller_xjal_xjal( _packagingLine3_controller_xjal, null );
    _packagingLine3_controller_xjal.createAsEmbedded();
    setupParameters__conveyor33_controller_xjal_xjal( _conveyor33_controller_xjal, null );
    doBeforeCreate__conveyor33_controller_xjal_xjal( _conveyor33_controller_xjal, null );
    _conveyor33_controller_xjal.createAsEmbedded();
    setupParameters__conveyor39_controller_xjal_xjal( _conveyor39_controller_xjal, null );
    doBeforeCreate__conveyor39_controller_xjal_xjal( _conveyor39_controller_xjal, null );
    _conveyor39_controller_xjal.createAsEmbedded();
    setupParameters__turntable7_controller_xjal_xjal( _turntable7_controller_xjal, null );
    doBeforeCreate__turntable7_controller_xjal_xjal( _turntable7_controller_xjal, null );
    _turntable7_controller_xjal.createAsEmbedded();
    setupParameters__conveyor40_controller_xjal_xjal( _conveyor40_controller_xjal, null );
    doBeforeCreate__conveyor40_controller_xjal_xjal( _conveyor40_controller_xjal, null );
    _conveyor40_controller_xjal.createAsEmbedded();
    setupParameters__turntable8_controller_xjal_xjal( _turntable8_controller_xjal, null );
    doBeforeCreate__turntable8_controller_xjal_xjal( _turntable8_controller_xjal, null );
    _turntable8_controller_xjal.createAsEmbedded();
    setupParameters__turntable9_controller_xjal_xjal( _turntable9_controller_xjal, null );
    doBeforeCreate__turntable9_controller_xjal_xjal( _turntable9_controller_xjal, null );
    _turntable9_controller_xjal.createAsEmbedded();
    setupParameters__shippingLabelingStation_controller_xjal_xjal( _shippingLabelingStation_controller_xjal, null );
    doBeforeCreate__shippingLabelingStation_controller_xjal_xjal( _shippingLabelingStation_controller_xjal, null );
    _shippingLabelingStation_controller_xjal.createAsEmbedded();
    setupParameters__scanner_controller_xjal_xjal( _scanner_controller_xjal, null );
    doBeforeCreate__scanner_controller_xjal_xjal( _scanner_controller_xjal, null );
    _scanner_controller_xjal.createAsEmbedded();
    setupParameters__toSorter_controller_xjal_xjal( _toSorter_controller_xjal, null );
    doBeforeCreate__toSorter_controller_xjal_xjal( _toSorter_controller_xjal, null );
    _toSorter_controller_xjal.createAsEmbedded();
    setupParameters__transferTable14_controller_xjal_xjal( _transferTable14_controller_xjal, null );
    doBeforeCreate__transferTable14_controller_xjal_xjal( _transferTable14_controller_xjal, null );
    _transferTable14_controller_xjal.createAsEmbedded();
    setupParameters__conveyor43_controller_xjal_xjal( _conveyor43_controller_xjal, null );
    doBeforeCreate__conveyor43_controller_xjal_xjal( _conveyor43_controller_xjal, null );
    _conveyor43_controller_xjal.createAsEmbedded();
    setupParameters__exitLine1_controller_xjal_xjal( _exitLine1_controller_xjal, null );
    doBeforeCreate__exitLine1_controller_xjal_xjal( _exitLine1_controller_xjal, null );
    _exitLine1_controller_xjal.createAsEmbedded();
    setupParameters__transferTable15_controller_xjal_xjal( _transferTable15_controller_xjal, null );
    doBeforeCreate__transferTable15_controller_xjal_xjal( _transferTable15_controller_xjal, null );
    _transferTable15_controller_xjal.createAsEmbedded();
    setupParameters__conveyor45_controller_xjal_xjal( _conveyor45_controller_xjal, null );
    doBeforeCreate__conveyor45_controller_xjal_xjal( _conveyor45_controller_xjal, null );
    _conveyor45_controller_xjal.createAsEmbedded();
    setupParameters__transferTable16_controller_xjal_xjal( _transferTable16_controller_xjal, null );
    doBeforeCreate__transferTable16_controller_xjal_xjal( _transferTable16_controller_xjal, null );
    _transferTable16_controller_xjal.createAsEmbedded();
    setupParameters__exitLine2_controller_xjal_xjal( _exitLine2_controller_xjal, null );
    doBeforeCreate__exitLine2_controller_xjal_xjal( _exitLine2_controller_xjal, null );
    _exitLine2_controller_xjal.createAsEmbedded();
    setupParameters__conveyor47_controller_xjal_xjal( _conveyor47_controller_xjal, null );
    doBeforeCreate__conveyor47_controller_xjal_xjal( _conveyor47_controller_xjal, null );
    _conveyor47_controller_xjal.createAsEmbedded();
    setupParameters__transferTable17_controller_xjal_xjal( _transferTable17_controller_xjal, null );
    doBeforeCreate__transferTable17_controller_xjal_xjal( _transferTable17_controller_xjal, null );
    _transferTable17_controller_xjal.createAsEmbedded();
    setupParameters__transferTable18_controller_xjal_xjal( _transferTable18_controller_xjal, null );
    doBeforeCreate__transferTable18_controller_xjal_xjal( _transferTable18_controller_xjal, null );
    _transferTable18_controller_xjal.createAsEmbedded();
    setupParameters__recirculationLine_controller_xjal_xjal( _recirculationLine_controller_xjal, null );
    doBeforeCreate__recirculationLine_controller_xjal_xjal( _recirculationLine_controller_xjal, null );
    _recirculationLine_controller_xjal.createAsEmbedded();
    setupParameters__conveyor49_controller_xjal_xjal( _conveyor49_controller_xjal, null );
    doBeforeCreate__conveyor49_controller_xjal_xjal( _conveyor49_controller_xjal, null );
    _conveyor49_controller_xjal.createAsEmbedded();
    setupParameters__transferTable1_controller_xjal_xjal( _transferTable1_controller_xjal, null );
    doBeforeCreate__transferTable1_controller_xjal_xjal( _transferTable1_controller_xjal, null );
    _transferTable1_controller_xjal.createAsEmbedded();
    setupParameters__transferTable_controller_xjal_xjal( _transferTable_controller_xjal, null );
    doBeforeCreate__transferTable_controller_xjal_xjal( _transferTable_controller_xjal, null );
    _transferTable_controller_xjal.createAsEmbedded();
    setupParameters__conveyor_controller_xjal_xjal( _conveyor_controller_xjal, null );
    doBeforeCreate__conveyor_controller_xjal_xjal( _conveyor_controller_xjal, null );
    _conveyor_controller_xjal.createAsEmbedded();
    setupParameters__transferTable5_controller_xjal_xjal( _transferTable5_controller_xjal, null );
    doBeforeCreate__transferTable5_controller_xjal_xjal( _transferTable5_controller_xjal, null );
    _transferTable5_controller_xjal.createAsEmbedded();
    setupParameters__transferTable4_controller_xjal_xjal( _transferTable4_controller_xjal, null );
    doBeforeCreate__transferTable4_controller_xjal_xjal( _transferTable4_controller_xjal, null );
    _transferTable4_controller_xjal.createAsEmbedded();
    setupParameters__conveyor3_controller_xjal_xjal( _conveyor3_controller_xjal, null );
    doBeforeCreate__conveyor3_controller_xjal_xjal( _conveyor3_controller_xjal, null );
    _conveyor3_controller_xjal.createAsEmbedded();
    setupParameters__transferTable19_controller_xjal_xjal( _transferTable19_controller_xjal, null );
    doBeforeCreate__transferTable19_controller_xjal_xjal( _transferTable19_controller_xjal, null );
    _transferTable19_controller_xjal.createAsEmbedded();
    setupParameters__transferTable20_controller_xjal_xjal( _transferTable20_controller_xjal, null );
    doBeforeCreate__transferTable20_controller_xjal_xjal( _transferTable20_controller_xjal, null );
    _transferTable20_controller_xjal.createAsEmbedded();
    setupParameters__conveyor4_controller_xjal_xjal( _conveyor4_controller_xjal, null );
    doBeforeCreate__conveyor4_controller_xjal_xjal( _conveyor4_controller_xjal, null );
    _conveyor4_controller_xjal.createAsEmbedded();
    setupParameters__packageLinesEntryPoint_controller_xjal_xjal( _packageLinesEntryPoint_controller_xjal, null );
    doBeforeCreate__packageLinesEntryPoint_controller_xjal_xjal( _packageLinesEntryPoint_controller_xjal, null );
    _packageLinesEntryPoint_controller_xjal.createAsEmbedded();
    setupParameters__conveyor36_controller_xjal_xjal( _conveyor36_controller_xjal, null );
    doBeforeCreate__conveyor36_controller_xjal_xjal( _conveyor36_controller_xjal, null );
    _conveyor36_controller_xjal.createAsEmbedded();
    setupParameters__turnStation_controller_xjal_xjal( _turnStation_controller_xjal, null );
    doBeforeCreate__turnStation_controller_xjal_xjal( _turnStation_controller_xjal, null );
    _turnStation_controller_xjal.createAsEmbedded();
    setupParameters__conveyor8_controller_xjal_xjal( _conveyor8_controller_xjal, null );
    doBeforeCreate__conveyor8_controller_xjal_xjal( _conveyor8_controller_xjal, null );
    _conveyor8_controller_xjal.createAsEmbedded();
    setupParameters__conveyor2_controller_xjal_xjal( _conveyor2_controller_xjal, null );
    doBeforeCreate__conveyor2_controller_xjal_xjal( _conveyor2_controller_xjal, null );
    _conveyor2_controller_xjal.createAsEmbedded();
    setupParameters__turntable11_controller_xjal_xjal( _turntable11_controller_xjal, null );
    doBeforeCreate__turntable11_controller_xjal_xjal( _turntable11_controller_xjal, null );
    _turntable11_controller_xjal.createAsEmbedded();
    setupParameters__conveyor1_controller_xjal_xjal( _conveyor1_controller_xjal, null );
    doBeforeCreate__conveyor1_controller_xjal_xjal( _conveyor1_controller_xjal, null );
    _conveyor1_controller_xjal.createAsEmbedded();
    setupParameters__conveyor10_controller_xjal_xjal( _conveyor10_controller_xjal, null );
    doBeforeCreate__conveyor10_controller_xjal_xjal( _conveyor10_controller_xjal, null );
    _conveyor10_controller_xjal.createAsEmbedded();
    setupParameters__turntable12_controller_xjal_xjal( _turntable12_controller_xjal, null );
    doBeforeCreate__turntable12_controller_xjal_xjal( _turntable12_controller_xjal, null );
    _turntable12_controller_xjal.createAsEmbedded();
    setupParameters__exitPalletLinePoint_controller_xjal_xjal( _exitPalletLinePoint_controller_xjal, null );
    doBeforeCreate__exitPalletLinePoint_controller_xjal_xjal( _exitPalletLinePoint_controller_xjal, null );
    _exitPalletLinePoint_controller_xjal.createAsEmbedded();
    setupParameters__exitPalletLine_controller_xjal_xjal( _exitPalletLine_controller_xjal, null );
    doBeforeCreate__exitPalletLine_controller_xjal_xjal( _exitPalletLine_controller_xjal, null );
    _exitPalletLine_controller_xjal.createAsEmbedded();
    setupParameters__conveyor7_controller_xjal_xjal( _conveyor7_controller_xjal, null );
    doBeforeCreate__conveyor7_controller_xjal_xjal( _conveyor7_controller_xjal, null );
    _conveyor7_controller_xjal.createAsEmbedded();
    setupParameters__transferTable2_controller_xjal_xjal( _transferTable2_controller_xjal, null );
    doBeforeCreate__transferTable2_controller_xjal_xjal( _transferTable2_controller_xjal, null );
    _transferTable2_controller_xjal.createAsEmbedded();
    setupParameters__turntable13_controller_xjal_xjal( _turntable13_controller_xjal, null );
    doBeforeCreate__turntable13_controller_xjal_xjal( _turntable13_controller_xjal, null );
    _turntable13_controller_xjal.createAsEmbedded();
    setupParameters__conveyor5_controller_xjal_xjal( _conveyor5_controller_xjal, null );
    doBeforeCreate__conveyor5_controller_xjal_xjal( _conveyor5_controller_xjal, null );
    _conveyor5_controller_xjal.createAsEmbedded();
    setupParameters__workerPalletLine_controller_xjal_xjal( _workerPalletLine_controller_xjal, null );
    doBeforeCreate__workerPalletLine_controller_xjal_xjal( _workerPalletLine_controller_xjal, null );
    _workerPalletLine_controller_xjal.createAsEmbedded();
    setupParameters__transferTable3_controller_xjal_xjal( _transferTable3_controller_xjal, null );
    doBeforeCreate__transferTable3_controller_xjal_xjal( _transferTable3_controller_xjal, null );
    _transferTable3_controller_xjal.createAsEmbedded();
    setupParameters__dishPalletLinePickup_controller_xjal_xjal( _dishPalletLinePickup_controller_xjal, null );
    doBeforeCreate__dishPalletLinePickup_controller_xjal_xjal( _dishPalletLinePickup_controller_xjal, null );
    _dishPalletLinePickup_controller_xjal.createAsEmbedded();
    setupParameters__beveragePalletLinePickup_controller_xjal_xjal( _beveragePalletLinePickup_controller_xjal, null );
    doBeforeCreate__beveragePalletLinePickup_controller_xjal_xjal( _beveragePalletLinePickup_controller_xjal, null );
    _beveragePalletLinePickup_controller_xjal.createAsEmbedded();
    setupParameters__turntable10_controller_xjal_xjal( _turntable10_controller_xjal, null );
    doBeforeCreate__turntable10_controller_xjal_xjal( _turntable10_controller_xjal, null );
    _turntable10_controller_xjal.createAsEmbedded();
    setupParameters__foodUnloadingPoint_controller_xjal_xjal( _foodUnloadingPoint_controller_xjal, null );
    doBeforeCreate__foodUnloadingPoint_controller_xjal_xjal( _foodUnloadingPoint_controller_xjal, null );
    _foodUnloadingPoint_controller_xjal.createAsEmbedded();
    setupParameters__robotPalletLine_controller_xjal_xjal( _robotPalletLine_controller_xjal, null );
    doBeforeCreate__robotPalletLine_controller_xjal_xjal( _robotPalletLine_controller_xjal, null );
    _robotPalletLine_controller_xjal.createAsEmbedded();
	 // Port connectors with non-replicated objects
    toRobot.in.connect( foodPalletSource.port ); // connector
    robotDropOffStation.port.connect( toRobot.out ); // connector3
    robotDropOffStation.portPallet.connect( palletToExit.in ); // connector4
    toRack.in.connect( robotDropOffStation.portItem ); // connector5
    beveragesPalletSource.port.connect( toWorker.in ); // connector8
    toWorker.out.connect( workerDropOffStation.port ); // connector9
    emptyPalletExit.in.connect( workerDropOffStation.portPallet ); // connector10
    sink2.in.connect( moveTo.out ); // connector13
    moveTo.in.connect( emptyPalletExit.out ); // connector15
    workerDropOffStation.portItem.connect( toRack.in ); // connector11
    toStoringStation.in.connect( toRack.out ); // connector16
    toPackagingLines.in.connect( orderIsFullfilled.outT ); // connector23
    toLoadZone.in.connect( toSorterScanner.out ); // connector27
    ordersSentToClient.in.connect( toLoadZone.out ); // connector28
    conveyorEnter.in.connect( queueToCartConv.out ); // connector19
    queueToCartConv.in.connect( cartonsEnter.out ); // connector29
    toPickingLine.in.connect( conveyorEnter.out ); // connector22
    rackStore.in.connect( enter.out ); // connector35
    exit.in.connect( rackStore.out ); // connector36
    canEnterLine.in.connect( toPickingLine.out ); // connector20
    toPickingLine.in.connect( orderIsFullfilled.outF ); // connector37
    canEnterLine.out2.connect( toPickingLine.in ); // connector38
    conveytoWorkzone.out.connect( pickingStation.in ); // connector40
    pickingStation.out.connect( orderIsFullfilled.in ); // connector21
    canEnterLine.out1.connect( conveytoWorkzone.in ); // connector41
    convey.in.connect( canEnterLine.out3 ); // connector25
    convey.out.connect( toPickingLine.in ); // connector42
    moveToDock.in.connect( palletToExit.out ); // connector6
    moveToDock.out.connect( sink1.in ); // connector1
    toSorterScanner.in.connect( toPackagingLines.out ); // connector2
    dishPalletSource.port.connect( toWorker.in ); // connector7
    // Creating replicated embedded objects
    storedItems.setEnvironment( this );
    for ( int i = 0; i < storedItems.size(); i++ ) {
      Item _a = storedItems.get(i); 
      setupParameters_storedItems_xjal( _a, i, null );
      doBeforeCreate_storedItems_xjal( _a, i, null );
      _a.createAsEmbedded();
    }
    orders.setEnvironment( this );
    for ( int i = 0; i < orders.size(); i++ ) {
      Order _a = orders.get(i); 
      setupParameters_orders_xjal( _a, i, null );
      doBeforeCreate_orders_xjal( _a, i, null );
      _a.createAsEmbedded();
    }
    storingStations.setEnvironment( this );
    for ( int i = 0; i < storingStations.size(); i++ ) {
      Storing _a = storingStations.get(i); 
      setupParameters_storingStations_xjal( _a, i, null );
      doBeforeCreate_storingStations_xjal( _a, i, null );
      _a.createAsEmbedded();
    }
    setupInitialConditions_xjal( Main.class );
    // Dynamic initialization of persistent elements
    _createPersistentElementsBS0_xjal();
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
    orderArrival.start();
    _ordersStates_autoUpdateEvent_xjal.start();
    _storedItemsStatesChart_autoUpdateEvent_xjal.start();
    for (Agent embeddedObject : storedItems) {
      embeddedObject.startAsEmbedded();
    }
    for (Agent embeddedObject : orders) {
      embeddedObject.startAsEmbedded();
    }
    for (Agent embeddedObject : storingStations) {
      embeddedObject.startAsEmbedded();
    }
    foodPalletSource.startAsEmbedded();
    toRobot.startAsEmbedded();
    palletToExit.startAsEmbedded();
    sink1.startAsEmbedded();
    robotDropOffStation.startAsEmbedded();
    toRack.startAsEmbedded();
    pickupRobot.startAsEmbedded();
    dishPalletSource.startAsEmbedded();
    beveragesPalletSource.startAsEmbedded();
    toWorker.startAsEmbedded();
    workerDropOffStation.startAsEmbedded();
    worker.startAsEmbedded();
    emptyPalletExit.startAsEmbedded();
    sink2.startAsEmbedded();
    moveTo.startAsEmbedded();
    asrs1.startAsEmbedded();
    asrs2.startAsEmbedded();
    asrs3.startAsEmbedded();
    conveyorEnter.startAsEmbedded();
    orderIsFullfilled.startAsEmbedded();
    toPackagingLines.startAsEmbedded();
    toSorterScanner.startAsEmbedded();
    toLoadZone.startAsEmbedded();
    ordersSentToClient.startAsEmbedded();
    queueToCartConv.startAsEmbedded();
    rackStore.startAsEmbedded();
    enter.startAsEmbedded();
    exit.startAsEmbedded();
    atStore.startAsEmbedded();
    cartonsEnter.startAsEmbedded();
    pickingStation.startAsEmbedded();
    toStoringStation.startAsEmbedded();
    foodStorageUnit.startAsEmbedded();
    beverageStorageUnit.startAsEmbedded();
    dishStorageUnit.startAsEmbedded();
    packager1.startAsEmbedded();
    packager2.startAsEmbedded();
    packager3.startAsEmbedded();
    toPickingLine.startAsEmbedded();
    conveytoWorkzone.startAsEmbedded();
    canEnterLine.startAsEmbedded();
    convey.startAsEmbedded();
    forklifts.startAsEmbedded();
    moveToDock.startAsEmbedded();
    _turntable_controller_xjal.startAsEmbedded();
    _foodMergePoint_controller_xjal.startAsEmbedded();
    _infeedLineFood_controller_xjal.startAsEmbedded();
    _infeedMergeConveyor_controller_xjal.startAsEmbedded();
    _turntable1_controller_xjal.startAsEmbedded();
    _turntable2_controller_xjal.startAsEmbedded();
    _mergeToFoodRack_controller_xjal.startAsEmbedded();
    _toFoodRack_controller_xjal.startAsEmbedded();
    _mergeToBeverageRack_controller_xjal.startAsEmbedded();
    _toDishRack_controller_xjal.startAsEmbedded();
    _turntable3_controller_xjal.startAsEmbedded();
    _toBeverageRack_controller_xjal.startAsEmbedded();
    _beverageDishMergePoint_controller_xjal.startAsEmbedded();
    _beveragesAndDishesLine1_controller_xjal.startAsEmbedded();
    _beveragesAndDishesLine_controller_xjal.startAsEmbedded();
    _foodPickInLine_controller_xjal.startAsEmbedded();
    _transferTable6_controller_xjal.startAsEmbedded();
    _conveyor18_controller_xjal.startAsEmbedded();
    _labelingStation_controller_xjal.startAsEmbedded();
    _invoiceStation_controller_xjal.startAsEmbedded();
    _cartonInitialLine_controller_xjal.startAsEmbedded();
    _foodPickOutLine_controller_xjal.startAsEmbedded();
    _toBeveragePick_controller_xjal.startAsEmbedded();
    _transferTable7_controller_xjal.startAsEmbedded();
    _transferTable8_controller_xjal.startAsEmbedded();
    _beveragePickInLine_controller_xjal.startAsEmbedded();
    _conveyor22_controller_xjal.startAsEmbedded();
    _transferTable9_controller_xjal.startAsEmbedded();
    _beveragePickOutLine_controller_xjal.startAsEmbedded();
    _toDishPick_controller_xjal.startAsEmbedded();
    _dishPickInLine_controller_xjal.startAsEmbedded();
    _conveyor26_controller_xjal.startAsEmbedded();
    _transferTable10_controller_xjal.startAsEmbedded();
    _transferTable11_controller_xjal.startAsEmbedded();
    _checkOrderStation_controller_xjal.startAsEmbedded();
    _conveyor28_controller_xjal.startAsEmbedded();
    _dishPickOutLine_controller_xjal.startAsEmbedded();
    _returnToPickingLine_controller_xjal.startAsEmbedded();
    _transferTable13_controller_xjal.startAsEmbedded();
    _pickingLinesStart_controller_xjal.startAsEmbedded();
    _toFoodPick_controller_xjal.startAsEmbedded();
    _conveyor30_controller_xjal.startAsEmbedded();
    _transferTable12_controller_xjal.startAsEmbedded();
    _conveyor32_controller_xjal.startAsEmbedded();
    _turntable4_controller_xjal.startAsEmbedded();
    _conveyor34_controller_xjal.startAsEmbedded();
    _turntable5_controller_xjal.startAsEmbedded();
    _conveyor35_controller_xjal.startAsEmbedded();
    _turntable6_controller_xjal.startAsEmbedded();
    _station_controller_xjal.startAsEmbedded();
    _packagingLine1_controller_xjal.startAsEmbedded();
    _station1_controller_xjal.startAsEmbedded();
    _packagingLine2_controller_xjal.startAsEmbedded();
    _station2_controller_xjal.startAsEmbedded();
    _packagingLine3_controller_xjal.startAsEmbedded();
    _conveyor33_controller_xjal.startAsEmbedded();
    _conveyor39_controller_xjal.startAsEmbedded();
    _turntable7_controller_xjal.startAsEmbedded();
    _conveyor40_controller_xjal.startAsEmbedded();
    _turntable8_controller_xjal.startAsEmbedded();
    _turntable9_controller_xjal.startAsEmbedded();
    _shippingLabelingStation_controller_xjal.startAsEmbedded();
    _scanner_controller_xjal.startAsEmbedded();
    _toSorter_controller_xjal.startAsEmbedded();
    _transferTable14_controller_xjal.startAsEmbedded();
    _conveyor43_controller_xjal.startAsEmbedded();
    _exitLine1_controller_xjal.startAsEmbedded();
    _transferTable15_controller_xjal.startAsEmbedded();
    _conveyor45_controller_xjal.startAsEmbedded();
    _transferTable16_controller_xjal.startAsEmbedded();
    _exitLine2_controller_xjal.startAsEmbedded();
    _conveyor47_controller_xjal.startAsEmbedded();
    _transferTable17_controller_xjal.startAsEmbedded();
    _transferTable18_controller_xjal.startAsEmbedded();
    _recirculationLine_controller_xjal.startAsEmbedded();
    _conveyor49_controller_xjal.startAsEmbedded();
    _transferTable1_controller_xjal.startAsEmbedded();
    _transferTable_controller_xjal.startAsEmbedded();
    _conveyor_controller_xjal.startAsEmbedded();
    _transferTable5_controller_xjal.startAsEmbedded();
    _transferTable4_controller_xjal.startAsEmbedded();
    _conveyor3_controller_xjal.startAsEmbedded();
    _transferTable19_controller_xjal.startAsEmbedded();
    _transferTable20_controller_xjal.startAsEmbedded();
    _conveyor4_controller_xjal.startAsEmbedded();
    _packageLinesEntryPoint_controller_xjal.startAsEmbedded();
    _conveyor36_controller_xjal.startAsEmbedded();
    _turnStation_controller_xjal.startAsEmbedded();
    _conveyor8_controller_xjal.startAsEmbedded();
    _conveyor2_controller_xjal.startAsEmbedded();
    _turntable11_controller_xjal.startAsEmbedded();
    _conveyor1_controller_xjal.startAsEmbedded();
    _conveyor10_controller_xjal.startAsEmbedded();
    _turntable12_controller_xjal.startAsEmbedded();
    _exitPalletLinePoint_controller_xjal.startAsEmbedded();
    _exitPalletLine_controller_xjal.startAsEmbedded();
    _conveyor7_controller_xjal.startAsEmbedded();
    _transferTable2_controller_xjal.startAsEmbedded();
    _turntable13_controller_xjal.startAsEmbedded();
    _conveyor5_controller_xjal.startAsEmbedded();
    _workerPalletLine_controller_xjal.startAsEmbedded();
    _transferTable3_controller_xjal.startAsEmbedded();
    _dishPalletLinePickup_controller_xjal.startAsEmbedded();
    _beveragePalletLinePickup_controller_xjal.startAsEmbedded();
    _turntable10_controller_xjal.startAsEmbedded();
    _foodUnloadingPoint_controller_xjal.startAsEmbedded();
    _robotPalletLine_controller_xjal.startAsEmbedded();
  }
 
  @AnyLogicInternalCodegenAPI
  public void onStartup() {
    super.onStartup();
    
trajectoriesToConv.put( food, robotTrajectory );
trajectoriesToConv.put( beverage, workerBeverageTrajectory );
trajectoriesToConv.put( dish, workerDishTrajectory );

for ( ItemType type : ItemType.values() )
	for (int i = 0; i < nInitialItemsPerType; i++ )
		enter.take( new Item( type ) );

navigate( view3D ); 
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_Main_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Main_xjal() {
    selectedViewArea = 
view2D 
;
  }

  // User API -----------------------------------------------------
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
    list.add( foodPalletSource );
    list.add( toRobot );
    list.add( palletToExit );
    list.add( sink1 );
    list.add( robotDropOffStation );
    list.add( toRack );
    list.add( pickupRobot );
    list.add( dishPalletSource );
    list.add( beveragesPalletSource );
    list.add( toWorker );
    list.add( workerDropOffStation );
    list.add( worker );
    list.add( emptyPalletExit );
    list.add( sink2 );
    list.add( moveTo );
    list.add( asrs1 );
    list.add( asrs2 );
    list.add( asrs3 );
    list.add( conveyorEnter );
    list.add( orderIsFullfilled );
    list.add( toPackagingLines );
    list.add( toSorterScanner );
    list.add( toLoadZone );
    list.add( ordersSentToClient );
    list.add( queueToCartConv );
    list.add( rackStore );
    list.add( enter );
    list.add( exit );
    list.add( atStore );
    list.add( storedItems );
    list.add( orders );
    list.add( cartonsEnter );
    list.add( pickingStation );
    list.add( toStoringStation );
    list.add( storingStations );
    list.add( foodStorageUnit );
    list.add( beverageStorageUnit );
    list.add( dishStorageUnit );
    list.add( packager1 );
    list.add( packager2 );
    list.add( packager3 );
    list.add( toPickingLine );
    list.add( conveytoWorkzone );
    list.add( canEnterLine );
    list.add( convey );
    list.add( forklifts );
    list.add( moveToDock );
    list.add( _turntable_controller_xjal );
    list.add( _foodMergePoint_controller_xjal );
    list.add( _infeedLineFood_controller_xjal );
    list.add( _infeedMergeConveyor_controller_xjal );
    list.add( _turntable1_controller_xjal );
    list.add( _turntable2_controller_xjal );
    list.add( _mergeToFoodRack_controller_xjal );
    list.add( _toFoodRack_controller_xjal );
    list.add( _mergeToBeverageRack_controller_xjal );
    list.add( _toDishRack_controller_xjal );
    list.add( _turntable3_controller_xjal );
    list.add( _toBeverageRack_controller_xjal );
    list.add( _beverageDishMergePoint_controller_xjal );
    list.add( _beveragesAndDishesLine1_controller_xjal );
    list.add( _beveragesAndDishesLine_controller_xjal );
    list.add( _foodPickInLine_controller_xjal );
    list.add( _transferTable6_controller_xjal );
    list.add( _conveyor18_controller_xjal );
    list.add( _labelingStation_controller_xjal );
    list.add( _invoiceStation_controller_xjal );
    list.add( _cartonInitialLine_controller_xjal );
    list.add( _foodPickOutLine_controller_xjal );
    list.add( _toBeveragePick_controller_xjal );
    list.add( _transferTable7_controller_xjal );
    list.add( _transferTable8_controller_xjal );
    list.add( _beveragePickInLine_controller_xjal );
    list.add( _conveyor22_controller_xjal );
    list.add( _transferTable9_controller_xjal );
    list.add( _beveragePickOutLine_controller_xjal );
    list.add( _toDishPick_controller_xjal );
    list.add( _dishPickInLine_controller_xjal );
    list.add( _conveyor26_controller_xjal );
    list.add( _transferTable10_controller_xjal );
    list.add( _transferTable11_controller_xjal );
    list.add( _checkOrderStation_controller_xjal );
    list.add( _conveyor28_controller_xjal );
    list.add( _dishPickOutLine_controller_xjal );
    list.add( _returnToPickingLine_controller_xjal );
    list.add( _transferTable13_controller_xjal );
    list.add( _pickingLinesStart_controller_xjal );
    list.add( _toFoodPick_controller_xjal );
    list.add( _conveyor30_controller_xjal );
    list.add( _transferTable12_controller_xjal );
    list.add( _conveyor32_controller_xjal );
    list.add( _turntable4_controller_xjal );
    list.add( _conveyor34_controller_xjal );
    list.add( _turntable5_controller_xjal );
    list.add( _conveyor35_controller_xjal );
    list.add( _turntable6_controller_xjal );
    list.add( _station_controller_xjal );
    list.add( _packagingLine1_controller_xjal );
    list.add( _station1_controller_xjal );
    list.add( _packagingLine2_controller_xjal );
    list.add( _station2_controller_xjal );
    list.add( _packagingLine3_controller_xjal );
    list.add( _conveyor33_controller_xjal );
    list.add( _conveyor39_controller_xjal );
    list.add( _turntable7_controller_xjal );
    list.add( _conveyor40_controller_xjal );
    list.add( _turntable8_controller_xjal );
    list.add( _turntable9_controller_xjal );
    list.add( _shippingLabelingStation_controller_xjal );
    list.add( _scanner_controller_xjal );
    list.add( _toSorter_controller_xjal );
    list.add( _transferTable14_controller_xjal );
    list.add( _conveyor43_controller_xjal );
    list.add( _exitLine1_controller_xjal );
    list.add( _transferTable15_controller_xjal );
    list.add( _conveyor45_controller_xjal );
    list.add( _transferTable16_controller_xjal );
    list.add( _exitLine2_controller_xjal );
    list.add( _conveyor47_controller_xjal );
    list.add( _transferTable17_controller_xjal );
    list.add( _transferTable18_controller_xjal );
    list.add( _recirculationLine_controller_xjal );
    list.add( _conveyor49_controller_xjal );
    list.add( _transferTable1_controller_xjal );
    list.add( _transferTable_controller_xjal );
    list.add( _conveyor_controller_xjal );
    list.add( _transferTable5_controller_xjal );
    list.add( _transferTable4_controller_xjal );
    list.add( _conveyor3_controller_xjal );
    list.add( _transferTable19_controller_xjal );
    list.add( _transferTable20_controller_xjal );
    list.add( _conveyor4_controller_xjal );
    list.add( _packageLinesEntryPoint_controller_xjal );
    list.add( _conveyor36_controller_xjal );
    list.add( _turnStation_controller_xjal );
    list.add( _conveyor8_controller_xjal );
    list.add( _conveyor2_controller_xjal );
    list.add( _turntable11_controller_xjal );
    list.add( _conveyor1_controller_xjal );
    list.add( _conveyor10_controller_xjal );
    list.add( _turntable12_controller_xjal );
    list.add( _exitPalletLinePoint_controller_xjal );
    list.add( _exitPalletLine_controller_xjal );
    list.add( _conveyor7_controller_xjal );
    list.add( _transferTable2_controller_xjal );
    list.add( _turntable13_controller_xjal );
    list.add( _conveyor5_controller_xjal );
    list.add( _workerPalletLine_controller_xjal );
    list.add( _transferTable3_controller_xjal );
    list.add( _dishPalletLinePickup_controller_xjal );
    list.add( _beveragePalletLinePickup_controller_xjal );
    list.add( _turntable10_controller_xjal );
    list.add( _foodUnloadingPoint_controller_xjal );
    list.add( _robotPalletLine_controller_xjal );
    return list;
  }

  public AgentList<? extends Main> getPopulation() {
    return (AgentList<? extends Main>) super.getPopulation();
  }

  public List<? extends Main> agentsInRange( double distance ) {
    return (List<? extends Main>) super.agentsInRange( distance );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean isLoggingToDB(EventOriginator _e) {
    if ( _e == _ordersStates_autoUpdateEvent_xjal ) return false;
    if ( _e == _storedItemsStatesChart_autoUpdateEvent_xjal ) return false;
    return super.isLoggingToDB( _e );
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    orderArrival.onDestroy();
    _ordersStates_autoUpdateEvent_xjal.onDestroy();
    _storedItemsStatesChart_autoUpdateEvent_xjal.onDestroy();
    foodPalletSource.onDestroy();
    toRobot.onDestroy();
    palletToExit.onDestroy();
    sink1.onDestroy();
    robotDropOffStation.onDestroy();
    toRack.onDestroy();
    pickupRobot.onDestroy();
    dishPalletSource.onDestroy();
    beveragesPalletSource.onDestroy();
    toWorker.onDestroy();
    workerDropOffStation.onDestroy();
    worker.onDestroy();
    emptyPalletExit.onDestroy();
    sink2.onDestroy();
    moveTo.onDestroy();
    asrs1.onDestroy();
    asrs2.onDestroy();
    asrs3.onDestroy();
    conveyorEnter.onDestroy();
    orderIsFullfilled.onDestroy();
    toPackagingLines.onDestroy();
    toSorterScanner.onDestroy();
    toLoadZone.onDestroy();
    ordersSentToClient.onDestroy();
    queueToCartConv.onDestroy();
    rackStore.onDestroy();
    enter.onDestroy();
    exit.onDestroy();
    atStore.onDestroy();
    for (Agent _item : storedItems) {
      _item.onDestroy();
    }
    for (Agent _item : orders) {
      _item.onDestroy();
    }
    cartonsEnter.onDestroy();
    pickingStation.onDestroy();
    toStoringStation.onDestroy();
    for (Agent _item : storingStations) {
      _item.onDestroy();
    }
    foodStorageUnit.onDestroy();
    beverageStorageUnit.onDestroy();
    dishStorageUnit.onDestroy();
    packager1.onDestroy();
    packager2.onDestroy();
    packager3.onDestroy();
    toPickingLine.onDestroy();
    conveytoWorkzone.onDestroy();
    canEnterLine.onDestroy();
    convey.onDestroy();
    forklifts.onDestroy();
    moveToDock.onDestroy();
    _turntable_controller_xjal.onDestroy();
    _foodMergePoint_controller_xjal.onDestroy();
    _infeedLineFood_controller_xjal.onDestroy();
    _infeedMergeConveyor_controller_xjal.onDestroy();
    _turntable1_controller_xjal.onDestroy();
    _turntable2_controller_xjal.onDestroy();
    _mergeToFoodRack_controller_xjal.onDestroy();
    _toFoodRack_controller_xjal.onDestroy();
    _mergeToBeverageRack_controller_xjal.onDestroy();
    _toDishRack_controller_xjal.onDestroy();
    _turntable3_controller_xjal.onDestroy();
    _toBeverageRack_controller_xjal.onDestroy();
    _beverageDishMergePoint_controller_xjal.onDestroy();
    _beveragesAndDishesLine1_controller_xjal.onDestroy();
    _beveragesAndDishesLine_controller_xjal.onDestroy();
    _foodPickInLine_controller_xjal.onDestroy();
    _transferTable6_controller_xjal.onDestroy();
    _conveyor18_controller_xjal.onDestroy();
    _labelingStation_controller_xjal.onDestroy();
    _invoiceStation_controller_xjal.onDestroy();
    _cartonInitialLine_controller_xjal.onDestroy();
    _foodPickOutLine_controller_xjal.onDestroy();
    _toBeveragePick_controller_xjal.onDestroy();
    _transferTable7_controller_xjal.onDestroy();
    _transferTable8_controller_xjal.onDestroy();
    _beveragePickInLine_controller_xjal.onDestroy();
    _conveyor22_controller_xjal.onDestroy();
    _transferTable9_controller_xjal.onDestroy();
    _beveragePickOutLine_controller_xjal.onDestroy();
    _toDishPick_controller_xjal.onDestroy();
    _dishPickInLine_controller_xjal.onDestroy();
    _conveyor26_controller_xjal.onDestroy();
    _transferTable10_controller_xjal.onDestroy();
    _transferTable11_controller_xjal.onDestroy();
    _checkOrderStation_controller_xjal.onDestroy();
    _conveyor28_controller_xjal.onDestroy();
    _dishPickOutLine_controller_xjal.onDestroy();
    _returnToPickingLine_controller_xjal.onDestroy();
    _transferTable13_controller_xjal.onDestroy();
    _pickingLinesStart_controller_xjal.onDestroy();
    _toFoodPick_controller_xjal.onDestroy();
    _conveyor30_controller_xjal.onDestroy();
    _transferTable12_controller_xjal.onDestroy();
    _conveyor32_controller_xjal.onDestroy();
    _turntable4_controller_xjal.onDestroy();
    _conveyor34_controller_xjal.onDestroy();
    _turntable5_controller_xjal.onDestroy();
    _conveyor35_controller_xjal.onDestroy();
    _turntable6_controller_xjal.onDestroy();
    _station_controller_xjal.onDestroy();
    _packagingLine1_controller_xjal.onDestroy();
    _station1_controller_xjal.onDestroy();
    _packagingLine2_controller_xjal.onDestroy();
    _station2_controller_xjal.onDestroy();
    _packagingLine3_controller_xjal.onDestroy();
    _conveyor33_controller_xjal.onDestroy();
    _conveyor39_controller_xjal.onDestroy();
    _turntable7_controller_xjal.onDestroy();
    _conveyor40_controller_xjal.onDestroy();
    _turntable8_controller_xjal.onDestroy();
    _turntable9_controller_xjal.onDestroy();
    _shippingLabelingStation_controller_xjal.onDestroy();
    _scanner_controller_xjal.onDestroy();
    _toSorter_controller_xjal.onDestroy();
    _transferTable14_controller_xjal.onDestroy();
    _conveyor43_controller_xjal.onDestroy();
    _exitLine1_controller_xjal.onDestroy();
    _transferTable15_controller_xjal.onDestroy();
    _conveyor45_controller_xjal.onDestroy();
    _transferTable16_controller_xjal.onDestroy();
    _exitLine2_controller_xjal.onDestroy();
    _conveyor47_controller_xjal.onDestroy();
    _transferTable17_controller_xjal.onDestroy();
    _transferTable18_controller_xjal.onDestroy();
    _recirculationLine_controller_xjal.onDestroy();
    _conveyor49_controller_xjal.onDestroy();
    _transferTable1_controller_xjal.onDestroy();
    _transferTable_controller_xjal.onDestroy();
    _conveyor_controller_xjal.onDestroy();
    _transferTable5_controller_xjal.onDestroy();
    _transferTable4_controller_xjal.onDestroy();
    _conveyor3_controller_xjal.onDestroy();
    _transferTable19_controller_xjal.onDestroy();
    _transferTable20_controller_xjal.onDestroy();
    _conveyor4_controller_xjal.onDestroy();
    _packageLinesEntryPoint_controller_xjal.onDestroy();
    _conveyor36_controller_xjal.onDestroy();
    _turnStation_controller_xjal.onDestroy();
    _conveyor8_controller_xjal.onDestroy();
    _conveyor2_controller_xjal.onDestroy();
    _turntable11_controller_xjal.onDestroy();
    _conveyor1_controller_xjal.onDestroy();
    _conveyor10_controller_xjal.onDestroy();
    _turntable12_controller_xjal.onDestroy();
    _exitPalletLinePoint_controller_xjal.onDestroy();
    _exitPalletLine_controller_xjal.onDestroy();
    _conveyor7_controller_xjal.onDestroy();
    _transferTable2_controller_xjal.onDestroy();
    _turntable13_controller_xjal.onDestroy();
    _conveyor5_controller_xjal.onDestroy();
    _workerPalletLine_controller_xjal.onDestroy();
    _transferTable3_controller_xjal.onDestroy();
    _dishPalletLinePickup_controller_xjal.onDestroy();
    _beveragePalletLinePickup_controller_xjal.onDestroy();
    _turntable10_controller_xjal.onDestroy();
    _foodUnloadingPoint_controller_xjal.onDestroy();
    _robotPalletLine_controller_xjal.onDestroy();
  // Analysis Data Elements
    itemsPerOrder.destroyUpdater_xjal();
    preorderWaitingTimeDistribution.destroyUpdater_xjal();
    orderPickingTimeDistribution.destroyUpdater_xjal();
    fullOrderProcessingTimeDistribution.destroyUpdater_xjal();
    itemStoredTimeDistribution.destroyUpdater_xjal();
    logToDB( itemsPerOrder, "itemsPerOrder" );
    logToDB( preorderWaitingTimeDistribution, "preorderWaitingTimeDistribution" );
    logToDB( orderPickingTimeDistribution, "orderPickingTimeDistribution" );
    logToDB( fullOrderProcessingTimeDistribution, "fullOrderProcessingTimeDistribution" );
    logToDB( itemStoredTimeDistribution, "itemStoredTimeDistribution" );
    super.onDestroy();
  }

  @AnyLogicInternalCodegenAPI
  @Override
  public void doFinish() {
    super.doFinish();
    foodPalletSource.doFinish();
    toRobot.doFinish();
    palletToExit.doFinish();
    sink1.doFinish();
    robotDropOffStation.doFinish();
    toRack.doFinish();
    pickupRobot.doFinish();
    dishPalletSource.doFinish();
    beveragesPalletSource.doFinish();
    toWorker.doFinish();
    workerDropOffStation.doFinish();
    worker.doFinish();
    emptyPalletExit.doFinish();
    sink2.doFinish();
    moveTo.doFinish();
    asrs1.doFinish();
    asrs2.doFinish();
    asrs3.doFinish();
    conveyorEnter.doFinish();
    orderIsFullfilled.doFinish();
    toPackagingLines.doFinish();
    toSorterScanner.doFinish();
    toLoadZone.doFinish();
    ordersSentToClient.doFinish();
    queueToCartConv.doFinish();
    rackStore.doFinish();
    enter.doFinish();
    exit.doFinish();
    atStore.doFinish();
    for (Agent _item : storedItems) {
      _item.doFinish();
    }
    for (Agent _item : orders) {
      _item.doFinish();
    }
    cartonsEnter.doFinish();
    pickingStation.doFinish();
    toStoringStation.doFinish();
    for (Agent _item : storingStations) {
      _item.doFinish();
    }
    foodStorageUnit.doFinish();
    beverageStorageUnit.doFinish();
    dishStorageUnit.doFinish();
    packager1.doFinish();
    packager2.doFinish();
    packager3.doFinish();
    toPickingLine.doFinish();
    conveytoWorkzone.doFinish();
    canEnterLine.doFinish();
    convey.doFinish();
    forklifts.doFinish();
    moveToDock.doFinish();
    _turntable_controller_xjal.doFinish();
    _foodMergePoint_controller_xjal.doFinish();
    _infeedLineFood_controller_xjal.doFinish();
    _infeedMergeConveyor_controller_xjal.doFinish();
    _turntable1_controller_xjal.doFinish();
    _turntable2_controller_xjal.doFinish();
    _mergeToFoodRack_controller_xjal.doFinish();
    _toFoodRack_controller_xjal.doFinish();
    _mergeToBeverageRack_controller_xjal.doFinish();
    _toDishRack_controller_xjal.doFinish();
    _turntable3_controller_xjal.doFinish();
    _toBeverageRack_controller_xjal.doFinish();
    _beverageDishMergePoint_controller_xjal.doFinish();
    _beveragesAndDishesLine1_controller_xjal.doFinish();
    _beveragesAndDishesLine_controller_xjal.doFinish();
    _foodPickInLine_controller_xjal.doFinish();
    _transferTable6_controller_xjal.doFinish();
    _conveyor18_controller_xjal.doFinish();
    _labelingStation_controller_xjal.doFinish();
    _invoiceStation_controller_xjal.doFinish();
    _cartonInitialLine_controller_xjal.doFinish();
    _foodPickOutLine_controller_xjal.doFinish();
    _toBeveragePick_controller_xjal.doFinish();
    _transferTable7_controller_xjal.doFinish();
    _transferTable8_controller_xjal.doFinish();
    _beveragePickInLine_controller_xjal.doFinish();
    _conveyor22_controller_xjal.doFinish();
    _transferTable9_controller_xjal.doFinish();
    _beveragePickOutLine_controller_xjal.doFinish();
    _toDishPick_controller_xjal.doFinish();
    _dishPickInLine_controller_xjal.doFinish();
    _conveyor26_controller_xjal.doFinish();
    _transferTable10_controller_xjal.doFinish();
    _transferTable11_controller_xjal.doFinish();
    _checkOrderStation_controller_xjal.doFinish();
    _conveyor28_controller_xjal.doFinish();
    _dishPickOutLine_controller_xjal.doFinish();
    _returnToPickingLine_controller_xjal.doFinish();
    _transferTable13_controller_xjal.doFinish();
    _pickingLinesStart_controller_xjal.doFinish();
    _toFoodPick_controller_xjal.doFinish();
    _conveyor30_controller_xjal.doFinish();
    _transferTable12_controller_xjal.doFinish();
    _conveyor32_controller_xjal.doFinish();
    _turntable4_controller_xjal.doFinish();
    _conveyor34_controller_xjal.doFinish();
    _turntable5_controller_xjal.doFinish();
    _conveyor35_controller_xjal.doFinish();
    _turntable6_controller_xjal.doFinish();
    _station_controller_xjal.doFinish();
    _packagingLine1_controller_xjal.doFinish();
    _station1_controller_xjal.doFinish();
    _packagingLine2_controller_xjal.doFinish();
    _station2_controller_xjal.doFinish();
    _packagingLine3_controller_xjal.doFinish();
    _conveyor33_controller_xjal.doFinish();
    _conveyor39_controller_xjal.doFinish();
    _turntable7_controller_xjal.doFinish();
    _conveyor40_controller_xjal.doFinish();
    _turntable8_controller_xjal.doFinish();
    _turntable9_controller_xjal.doFinish();
    _shippingLabelingStation_controller_xjal.doFinish();
    _scanner_controller_xjal.doFinish();
    _toSorter_controller_xjal.doFinish();
    _transferTable14_controller_xjal.doFinish();
    _conveyor43_controller_xjal.doFinish();
    _exitLine1_controller_xjal.doFinish();
    _transferTable15_controller_xjal.doFinish();
    _conveyor45_controller_xjal.doFinish();
    _transferTable16_controller_xjal.doFinish();
    _exitLine2_controller_xjal.doFinish();
    _conveyor47_controller_xjal.doFinish();
    _transferTable17_controller_xjal.doFinish();
    _transferTable18_controller_xjal.doFinish();
    _recirculationLine_controller_xjal.doFinish();
    _conveyor49_controller_xjal.doFinish();
    _transferTable1_controller_xjal.doFinish();
    _transferTable_controller_xjal.doFinish();
    _conveyor_controller_xjal.doFinish();
    _transferTable5_controller_xjal.doFinish();
    _transferTable4_controller_xjal.doFinish();
    _conveyor3_controller_xjal.doFinish();
    _transferTable19_controller_xjal.doFinish();
    _transferTable20_controller_xjal.doFinish();
    _conveyor4_controller_xjal.doFinish();
    _packageLinesEntryPoint_controller_xjal.doFinish();
    _conveyor36_controller_xjal.doFinish();
    _turnStation_controller_xjal.doFinish();
    _conveyor8_controller_xjal.doFinish();
    _conveyor2_controller_xjal.doFinish();
    _turntable11_controller_xjal.doFinish();
    _conveyor1_controller_xjal.doFinish();
    _conveyor10_controller_xjal.doFinish();
    _turntable12_controller_xjal.doFinish();
    _exitPalletLinePoint_controller_xjal.doFinish();
    _exitPalletLine_controller_xjal.doFinish();
    _conveyor7_controller_xjal.doFinish();
    _transferTable2_controller_xjal.doFinish();
    _turntable13_controller_xjal.doFinish();
    _conveyor5_controller_xjal.doFinish();
    _workerPalletLine_controller_xjal.doFinish();
    _transferTable3_controller_xjal.doFinish();
    _dishPalletLinePickup_controller_xjal.doFinish();
    _beveragePalletLinePickup_controller_xjal.doFinish();
    _turntable10_controller_xjal.doFinish();
    _foodUnloadingPoint_controller_xjal.doFinish();
    _robotPalletLine_controller_xjal.doFinish();
  }



}
