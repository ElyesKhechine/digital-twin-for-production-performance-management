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
    return null;
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
    return null;
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
    return null;
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
    return null;
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
      @Override
      public INode locationNode( Pallet agent ) {
        return _sourcePallet_locationNode_xjal( this, agent );
      }
      @Override
      public Agent newEntity(  ) {
        return _sourcePallet_newEntity_xjal( this );
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
    self.rate = self._rate_DefaultValue_xjal();
    self.firstArrivalMode = self._firstArrivalMode_DefaultValue_xjal();
    self.firstArrivalTime = self._firstArrivalTime_DefaultValue_xjal();
    self.rateSchedule = self._rateSchedule_DefaultValue_xjal();
    self.modifyRate = self._modifyRate_DefaultValue_xjal();
    self.arrivalSchedule = self._arrivalSchedule_DefaultValue_xjal();
    self.setAgentParametersFromDB = self._setAgentParametersFromDB_DefaultValue_xjal();
    self.databaseTable = self._databaseTable_DefaultValue_xjal();
    self.multipleEntitiesPerArrival = self._multipleEntitiesPerArrival_DefaultValue_xjal();
    self.limitArrivals = self._limitArrivals_DefaultValue_xjal();
    self.maxArrivals = self._maxArrivals_DefaultValue_xjal();
    self.locationType = 
self.LOCATION_NODE 
;
    self.locationXYZInNetwork = self._locationXYZInNetwork_DefaultValue_xjal();
    self.enableCustomStartTime = self._enableCustomStartTime_DefaultValue_xjal();
    self.startTime = self._startTime_DefaultValue_xjal();
    self.addToCustomPopulation = self._addToCustomPopulation_DefaultValue_xjal();
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
    self.discardHangingEntities = self._discardHangingEntities_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_sourcePallet_xjal( com.anylogic.libraries.processmodeling.Source<Pallet> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Source<Item> instantiate_sourceItems_xjal() {
    com.anylogic.libraries.processmodeling.Source<Item> _result_xjal = new com.anylogic.libraries.processmodeling.Source<Item>( getEngine(), this, null ) {
      @Override
      public Agent newEntity(  ) {
        return _sourceItems_newEntity_xjal( this );
      }
      @Override
      public AgentList population( Item agent ) {
        return _sourceItems_population_xjal( this, agent );
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
    self.rate = self._rate_DefaultValue_xjal();
    self.firstArrivalMode = self._firstArrivalMode_DefaultValue_xjal();
    self.firstArrivalTime = self._firstArrivalTime_DefaultValue_xjal();
    self.rateSchedule = self._rateSchedule_DefaultValue_xjal();
    self.modifyRate = self._modifyRate_DefaultValue_xjal();
    self.arrivalSchedule = self._arrivalSchedule_DefaultValue_xjal();
    self.setAgentParametersFromDB = self._setAgentParametersFromDB_DefaultValue_xjal();
    self.databaseTable = self._databaseTable_DefaultValue_xjal();
    self.multipleEntitiesPerArrival = self._multipleEntitiesPerArrival_DefaultValue_xjal();
    self.limitArrivals = self._limitArrivals_DefaultValue_xjal();
    self.maxArrivals = self._maxArrivals_DefaultValue_xjal();
    self.locationType = self._locationType_DefaultValue_xjal();
    self.locationXYZInNetwork = self._locationXYZInNetwork_DefaultValue_xjal();
    self.enableCustomStartTime = self._enableCustomStartTime_DefaultValue_xjal();
    self.startTime = self._startTime_DefaultValue_xjal();
    self.addToCustomPopulation = 
true 
;
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
    self.discardHangingEntities = self._discardHangingEntities_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_sourceItems_xjal( com.anylogic.libraries.processmodeling.Source<Item> self, TableInput _t ) {
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
  private void doBeforeCreate_queue_xjal( com.anylogic.libraries.processmodeling.Queue<Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Pickup<Pallet, Item> instantiate_pickup_xjal() {
    com.anylogic.libraries.processmodeling.Pickup<Pallet, Item> _result_xjal = new com.anylogic.libraries.processmodeling.Pickup<Pallet, Item>( getEngine(), this, null ) {
      @Override
      public int quantity( Pallet container ) {
        return _pickup_quantity_xjal( this, container );
      }
      @Override
      public void onPickup( Pallet container, Item agent ) {
        _pickup_onPickup_xjal( this, container, agent );
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
    self.queueIsConnectedToPort = self._queueIsConnectedToPort_DefaultValue_xjal();
    self.pushProtocol = self._pushProtocol_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_pickup_xjal( com.anylogic.libraries.processmodeling.Pickup<Pallet, Item> self, TableInput _t ) {
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> instantiate_toConveyor_xjal() {
    com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> _result_xjal = new com.anylogic.libraries.material_handling.MoveByTransporter<Pallet>( getEngine(), this, null ) {
      @Override
      public ConveyorPath destinationConveyor( Pallet agent, Agent unit ) {
        return _toConveyor_destinationConveyor_xjal( this, agent, unit );
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
  private void doBeforeCreate_toConveyor_xjal( com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, TableInput _t ) {
  }

  private INode _sourcePallet_locationNode_xjal( final com.anylogic.libraries.processmodeling.Source<Pallet> self, Pallet agent ) {
    INode _value;
    _value = 
dock 
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
  private Agent _sourceItems_newEntity_xjal( final com.anylogic.libraries.processmodeling.Source<Item> self ) {
    Agent _value;
    _value = 
new Item( itemsType ) 
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
  private void _queue_onEnter_xjal( final com.anylogic.libraries.processmodeling.Queue<Item> self, Item agent ) {
    
if (self.size() >= holdingCapacity)
	sourcePallet.inject(1); 
;
  }
  private int _pickup_quantity_xjal( final com.anylogic.libraries.processmodeling.Pickup<Pallet, Item> self, Pallet container ) {
    int _value;
    _value = 
holdingCapacity 
;
    return _value;
  }
  private void _pickup_onPickup_xjal( final com.anylogic.libraries.processmodeling.Pickup<Pallet, Item> self, Pallet container, Item agent ) {
    
agent.pallet = container; 
;
  }
  private ConveyorPath _toConveyor_destinationConveyor_xjal( final com.anylogic.libraries.material_handling.MoveByTransporter<Pallet> self, Pallet agent, Agent unit ) {
    ConveyorPath _value;
    _value = 
conveyor 
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
  
  protected ShapeRoundedRectangle roundRectangle;
  protected ShapePolyLine shapeBox;
  protected ShapePolyLine _ps2;
  protected ShapePolyLine _ps3;
  protected ShapePolyLine _ps4;
  protected ShapeLine _ps5;
  protected ShapeLine _ps6;
  protected ShapeGroup box;
  protected Shape3DObject pallet;
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
		2.0, LINE_STYLE_SOLID	 );

    shapeBox = new ShapePolyLine(
		SHAPE_DRAW_2D, true, 0.0, 7.826, 0.0, null, _shapeBox_Fill_Color,
            6, _shapeBox_pointsDX_xjal(), _shapeBox_pointsDY_xjal(), _shapeBox_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps2 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, 0.0, 7.826, 0.0, null, __ps2_Fill_Color,
            4, __ps2_pointsDX_xjal(), __ps2_pointsDY_xjal(), __ps2_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps3 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, 0.0, 0.0, 0.0, null, __ps3_Fill_Color,
            4, __ps3_pointsDX_xjal(), __ps3_pointsDY_xjal(), __ps3_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps4 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, 0.0, 7.826, 0.0, __ps4_Line_Color, null,
            6, __ps4_pointsDX_xjal(), __ps4_pointsDY_xjal(), __ps4_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps5 = new ShapeLine(
		SHAPE_DRAW_2D, true, -3.913, -5.87, 0.0, __ps5_Line_Color, 
 		7.0,	3.0, 0.0, 1.0, 10.0, LINE_STYLE_SOLID );

    _ps6 = new ShapeLine(
		SHAPE_DRAW_2D, true, 7.826, -3.913, 0.0, __ps6_Line_Color, 
 		-8.0,	3.0, 0.0, 1.0, 10.0, LINE_STYLE_SOLID );

    pallet = new Shape3DObject(
		PalletSource.this, SHAPE_DRAW_2D, true, 0.0, 18.0, 0.0, 0.0,
			3.0, true, "/warehouse_conveyor/",
			"3d/pallet.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -18.0, -7.0,
			36.0, 7.0, null, _pallet_customColors_xjal );

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
	     , _ps6 );

    }
    {				
    group = new ShapeGroup( PalletSource.this, SHAPE_DRAW_2D, true, 90.0, 100.0, 0.0, 0.0
	
	     , roundRectangle
	     , box
	     , pallet ) {

      @Override
      @AnyLogicInternalCodegenAPI
      public boolean onClick( double clickx, double clicky ) {
        return onShapeClick( _group, 0, clickx, clicky );
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



}
