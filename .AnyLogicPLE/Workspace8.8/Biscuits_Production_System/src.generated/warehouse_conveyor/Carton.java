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

 

public class Carton extends Agent
        implements IMaterialItem
{
  // Parameters

 
  public 
Order  order;

  /**
   * Returns default value for parameter <code>order</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public Order _order_DefaultValue_xjal() {
    final Carton self = this;
    return 
 
;
  }

  public void set_order( Order value ) {
    if (value == this.order) {
      return;
    }
    Order _oldValue_xjal = this.order;
    this.order = value;
    onChange_order_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter order.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_order()</code> method instead.
   */
  protected void onChange_order() {
    onChange_order_xjal( order );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_order_xjal( Order oldValue ) {

 
;  
  }


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    order = _order_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "order":
      if ( _callOnChange_xjal ) {
        set_order( (Order) _value_xjal );
      } else {
        order = (Order) _value_xjal;
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
    case "order": _result_xjal = order; break;
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
      list.add( "order" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
  }
  // Plain Variables

 
  public 
int 
 amountOfCurrentTypeReady;
 
  public 
ItemType 
 currentTypeOfItemsToTake;
 
  public 
double 
 processingTimeStart;
 
  public 
double 
 pickingTimeStart;
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Carton.class );
  
  @AnyLogicInternalCodegenAPI
  @Override
  public Map<String, IElementDescriptor> getElementDesciptors() {
    return elementDesciptors_xjal;
  }
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Scale scale = new Scale( 20.0 );

  @Override
  public Scale getScale() {
    return scale;
  }



	

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _STATECHART_COUNT_xjal = 1;


  // Statecharts
  public Statechart<carton_state> carton = new Statechart<>( this, (short)1 );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( Statechart _s ) {
    if(_s == this.carton) return "carton";
    return super.getNameOf( _s );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public int getIdOf( Statechart _s ) {
    if(_s == this.carton) return 0;
    return super.getIdOf( _s );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( Statechart _s ) {
    if( _s == this.carton ) {
       Statechart<carton_state> self = this.carton;
       
 
;
      enterState( opened, true );
      return;
    }
    super.executeActionOf( _s );
  }

   // States of all statecharts
   
  public enum carton_state implements IStatechartState<Carton, carton_state> {
    opened,
    sealed;

    @AnyLogicInternalCodegenAPI
    private Collection<carton_state> _simpleStatesDeep_xjal;

    @AnyLogicInternalCodegenAPI
    private Set<carton_state> _fullState_xjal;

    @AnyLogicInternalCodegenAPI
    private Set<carton_state> _statesInside_xjal;

    @Override
    @AnyLogicInternalCodegenAPI
    public Collection<carton_state> getSimpleStatesDeep() {
      Collection<carton_state> result = _simpleStatesDeep_xjal;
      if (result == null) {
        _simpleStatesDeep_xjal = result = calculateAllSimpleStatesDeep();
      }
      return result;
    }
    
    @Override
    public Set<carton_state> getFullState() {
      Set<carton_state> result = _fullState_xjal;
      if (result == null) {
        _fullState_xjal = result = calculateFullState();
      }
      return result;
    }
    
    @Override
    @AnyLogicInternalCodegenAPI
    public Set<carton_state> getStatesInside() {
      Set<carton_state> result = _statesInside_xjal;
      if (result == null) {
        _statesInside_xjal = result = calculateStatesInside();
      }
      return result;
    }

    @Override
    @AnyLogicInternalCodegenAPI
    public Statechart<carton_state> getStatechart( Carton _a ) {
      return _a.carton;
    }
  }
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final carton_state opened = carton_state.opened;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final carton_state sealed = carton_state.sealed;


  @AnyLogicInternalCodegenAPI
  private void enterState( carton_state self, boolean _destination ) {
    switch( self ) {
      case opened:
  	    logToDBEnterState(carton, self);
        // (Simple state (not composite))
        carton.setActiveState_xjal( opened );
        {
 
;}
        transition.start();
        return;
      case sealed:
  	    logToDBEnterState(carton, self);
        // (Simple state (not composite))
        carton.setActiveState_xjal( sealed );
        {
 
;}
        return;
      default:
        return;
    }
  }

  @AnyLogicInternalCodegenAPI
  private void exitState( carton_state self, Transition _t, boolean _source ) {
    switch( self ) {
      case opened: 
  	    logToDBExitState(carton, self);
  	    logToDB(carton, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != transition) transition.cancel();
        {
 
;}
        return;
      case sealed: 
  	    logToDBExitState(carton, self);
  	    logToDB(carton, _t, self);
      // (Simple state (not composite))
        {
 
;}
        return;
      default:
        return;
    }
  }

  @AnyLogicInternalCodegenAPI
  private void exitInnerStates( carton_state _destination ) {
    carton_state _state = carton.getActiveSimpleState();
    while( _state != _destination ) {
			exitState( _state, null, false );
			_state = _state.getContainerState();
		}
	}
  



  public TransitionMessage transition = new TransitionMessage( this );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( TransitionMessage _t ) {
    if ( _t == transition ) return "transition";
    return super.getNameOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public Statechart getStatechartOf( TransitionMessage _t ) { 
    if ( _t == transition ) return carton;
    return super.getStatechartOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean testGuardOf( TransitionMessage _t ) {
    if ( _t == transition ) return 
 
;
    return super.testGuardOf(  _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( TransitionMessage self, Object _msg ) {
    if ( self == transition ) {
      exitState( opened, self, true );
      {
        String msg = (String) _msg;
 
;}
          enterState( sealed, true );
      return;
    }
    super.executeActionOf( self, _msg );
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public boolean testMessageOf( TransitionMessage _t, Object _msg ) {
    if ( _t == transition ) {
      if ( !(_msg instanceof String) )
        return false;
      
String 
msg = (String) _msg;
      Object _g = 
"packed" 
;
      return msg.equals( _g );
    }
    return super.testMessageOf( _t, _msg );
  }
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

 
  void setNextItemType(  ) { 

switch ( currentTypeOfItemsToTake ) {
	case food :
		if ( order.orderList.containsKey(beverage ) )
			currentTypeOfItemsToTake = beverage;
		else if (order.orderList.containsKey(dish))
			currentTypeOfItemsToTake = dish;
		break;
	case beverage :
		if ( order.orderList.containsKey( dish ) )
			currentTypeOfItemsToTake = dish;
		else if (order.orderList.containsKey( food ) )
			currentTypeOfItemsToTake = food;
		break;
	case dish :
		if ( order.orderList.containsKey( food ) )
			currentTypeOfItemsToTake = food;
		else if ( order.orderList.containsKey( beverage ) )
			currentTypeOfItemsToTake = beverage;
		break;			
} 
  }

 
  
int 
 getAmountOfItems(  ) { 

if ( currentTypeOfItemsToTake == null )
	return 0;

return order.orderList.get( currentTypeOfItemsToTake ); 
  }

 
  void itemsAreTaken(  ) { 

order.orderList.remove( currentTypeOfItemsToTake);
if ( !order.orderList.isEmpty() )
	setNextItemType();
else
	currentTypeOfItemsToTake = null; 
  }

 
  public 
String 
 toString(  ) { 

return "carton #" + getId() + " order #" + order.getId(); 
  }

 
  
boolean 
 hasOtherItems(  ) { 

return findFirst( order.orderList.keySet(), itemType -> itemType != currentTypeOfItemsToTake ) != null; 
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
  protected static final Pair<String, Color>[] _box_2_open_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_material_27", yellow ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _box_2_closed_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "MA_material_27", yellow ),
    new Pair<String, Color>( "MA_material_28", yellow ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final int _box_2_open = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int _box_2_closed = 2;
  @AnyLogicInternalCodegenAPI
  protected static final int _polyline1 = 3;
  @AnyLogicInternalCodegenAPI
  protected static final int _polyline2 = 4;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle = 5;
  @AnyLogicInternalCodegenAPI
  protected static final int _polyline = 6;
  @AnyLogicInternalCodegenAPI
  protected static final int _polyline3 = 7;
  @AnyLogicInternalCodegenAPI
  protected static final int _cartonOpened2D = 8;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle1 = 9;
  @AnyLogicInternalCodegenAPI
  protected static final int _line = 10;
  @AnyLogicInternalCodegenAPI
  protected static final int _cartonClosed2D = 11;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 12;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return true;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline1_pointsDX_xjal() {
    return new double[] { 0.0, 2.727, 2.727, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline1_pointsDY_xjal() {
    return new double[] { 0.0, 0.0, 5.217, 5.217,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline1_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline2_pointsDX_xjal() {
    return new double[] { 0.0, 2.727, 8.182, 10.909,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline2_pointsDY_xjal() {
    return new double[] { 0.0, 2.609, 2.609, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline2_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline_pointsDX_xjal() {
    return new double[] { 0.0, 2.727, 8.182, 10.909,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline_pointsDY_xjal() {
    return new double[] { 0.0, -2.609, -2.609, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline3_pointsDX_xjal() {
    return new double[] { 0.0, -2.727, -2.727, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline3_pointsDY_xjal() {
    return new double[] { 0.0, 0.0, 5.217, 5.217,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _polyline3_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll(box_2_open, box_2_closed, cartonOpened2D, cartonClosed2D);
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean onShapeClick( int _shape, int index, double clickx, double clicky ){
    switch( _shape ){
      case _box_2_open:
        if (true) {
          Shape3DObject self = this.box_2_open;
          
 
        }
        break;
      case _box_2_closed:
        if (true) {
          Shape3DObject self = this.box_2_closed;
          
 
        }
        break;
      case _polyline1:
        if (true) {
          ShapePolyLine self = this.polyline1;
          
 
        }
        break;
      case _polyline2:
        if (true) {
          ShapePolyLine self = this.polyline2;
          
 
        }
        break;
      case _rectangle:
        if (true) {
          ShapeRectangle self = this.rectangle;
          
 
        }
        break;
      case _polyline:
        if (true) {
          ShapePolyLine self = this.polyline;
          
 
        }
        break;
      case _polyline3:
        if (true) {
          ShapePolyLine self = this.polyline3;
          
 
        }
        break;
      case _cartonOpened2D:
        if (true) {
          ShapeGroup self = this.cartonOpened2D;
          
 
        }
        break;
      case _rectangle1:
        if (true) {
          ShapeRectangle self = this.rectangle1;
          
 
        }
        break;
      case _line:
        if (true) {
          ShapeLine self = this.line;
          
 
        }
        break;
      case _cartonClosed2D:
        if (true) {
          ShapeGroup self = this.cartonClosed2D;
          
 
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
      case _cartonOpened2D:
          
 
        break;
      case _cartonClosed2D:
          
 
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
  private void _box_2_open_SetDynamicParams_xjal( Shape3DObject shape ) {
    boolean _visible = 
carton.getState() == opened 
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
  
  protected Shape3DObject box_2_open;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _box_2_closed_SetDynamicParams_xjal( Shape3DObject shape ) {
    boolean _visible = 
carton.getState() == sealed 
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
  
  protected Shape3DObject box_2_closed;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _polyline1_SetDynamicParams_xjal( ShapePolyLine shape ) {
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
  
  protected ShapePolyLine polyline1;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _polyline2_SetDynamicParams_xjal( ShapePolyLine shape ) {
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
  
  protected ShapePolyLine polyline2;
  
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
  private void _polyline3_SetDynamicParams_xjal( ShapePolyLine shape ) {
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
  
  protected ShapePolyLine polyline3;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _cartonOpened2D_SetDynamicParams_xjal( ShapeGroup shape ) {
    boolean _visible = 
carton.getState() == opened 
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
  
  protected ShapeGroup cartonOpened2D;
  
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
  private void _cartonClosed2D_SetDynamicParams_xjal( ShapeGroup shape ) {
    boolean _visible = 
carton.getState() == sealed 
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
  
  protected ShapeGroup cartonClosed2D;
  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    box_2_open = new Shape3DObject(
		Carton.this, SHAPE_DRAW_3D, true, 0.0, 0.0, 0.0, 0.0,
			1.0, false, "/warehouse_conveyor/",
			"3d/box_2_open.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, 0.0, 0.0,
			1.0, 1.0, 1511972309646L, _box_2_open_customColors_xjal ) {
      @Override
      public void updateDynamicProperties() {
        _box_2_open_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    box_2_closed = new Shape3DObject(
		Carton.this, SHAPE_DRAW_3D, true, 0.0, 0.0, 0.0, 0.0,
			1.0, false, "/warehouse_conveyor/",
			"3d/box_2_closed.dae", OBJECT_3D_XYZ_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, 0.0, 0.0,
			1.0, 1.0, 1512030406670L, _box_2_closed_customColors_xjal ) {
      @Override
      public void updateDynamicProperties() {
        _box_2_closed_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    polyline1 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, 5.455, -2.609, 0.0, black, gold,
            4, _polyline1_pointsDX_xjal(), _polyline1_pointsDY_xjal(), _polyline1_pointsDZ_xjal(), false, 10.0, 0.5, LINE_STYLE_SOLID ) {
      @Override
      public void updateDynamicProperties() {
        _polyline1_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    polyline2 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -5.455, 2.609, 0.0, black, gold,
            4, _polyline2_pointsDX_xjal(), _polyline2_pointsDY_xjal(), _polyline2_pointsDZ_xjal(), false, 10.0, 0.5, LINE_STYLE_SOLID ) {
      @Override
      public void updateDynamicProperties() {
        _polyline2_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    rectangle = new ShapeRectangle(
       SHAPE_DRAW_2D, true,-5.455, -2.609, 0.0, 0.0, 
            black, goldenRod,
			10.909, 5.217, 10.0, 0.5, LINE_STYLE_SOLID ) {
      @Override
      public void updateDynamicProperties() {
        _rectangle_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    polyline = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -5.455, -2.609, 0.0, black, gold,
            4, _polyline_pointsDX_xjal(), _polyline_pointsDY_xjal(), _polyline_pointsDZ_xjal(), false, 10.0, 0.5, LINE_STYLE_SOLID ) {
      @Override
      public void updateDynamicProperties() {
        _polyline_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    polyline3 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -5.455, -2.609, 0.0, black, gold,
            4, _polyline3_pointsDX_xjal(), _polyline3_pointsDY_xjal(), _polyline3_pointsDZ_xjal(), false, 10.0, 0.5, LINE_STYLE_SOLID ) {
      @Override
      public void updateDynamicProperties() {
        _polyline3_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    rectangle1 = new ShapeRectangle(
       SHAPE_DRAW_2D, true,-8.0, -5.0, 0.0, 0.0, 
            black, gold,
			16.069, 10.0, 10.0, 1.0, LINE_STYLE_SOLID ) {
      @Override
      public void updateDynamicProperties() {
        _rectangle1_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    line = new ShapeLine(
		SHAPE_DRAW_2D, true, -8.0, 0.0, 0.0, peru, 
 		16.0,	0.0, 0.0, 2.0, 10.0, LINE_STYLE_SOLID ) {
      @Override
      public void updateDynamicProperties() {
        _line_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {				
    cartonOpened2D = new ShapeGroup( Carton.this, SHAPE_DRAW_2D, true, 0.0, 0.0, 0.0, 0.0
	
	     , polyline1
	     , polyline2
	     , rectangle
	     , polyline
	     , polyline3 ) {
      @Override
      public void updateDynamicProperties() {
        _cartonOpened2D_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }

      @Override
      @AnyLogicInternalCodegenAPI
      public void onDraw() {
        onShapeGroupDraw( _cartonOpened2D, 0 );
      }
    };

    }
    {				
    cartonClosed2D = new ShapeGroup( Carton.this, SHAPE_DRAW_2D, true, 0.0, 0.0, 0.0, 0.0
	
	     , rectangle1
	     , line ) {
      @Override
      public void updateDynamicProperties() {
        _cartonClosed2D_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }

      @Override
      @AnyLogicInternalCodegenAPI
      public void onDraw() {
        onShapeGroupDraw( _cartonClosed2D, 0 );
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
  public Carton( Engine engine, Agent owner, AgentList<? extends Carton> ownerPopulation ) {
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
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Carton() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Carton( Order order ) {
    markParametersAreSet();
    this.order = order;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Assigning initial values for plain variables
    setupPlainVariables_Carton_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( Carton.this, true, 0, 0, 0, 0 , level );
    icon = new ShapeModelElementsGroup( Carton.this, getElementProperty( "warehouse_conveyor.Carton.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
	 // Port connectors with non-replicated objects
    // Creating replicated embedded objects
    setupInitialConditions_xjal( Carton.class );
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
0.7 
;
	  _e.setLength( _length, METER );
	  double _width;
      _width = 
0.5 
;
	  _e.setWidth( _width, METER );
	  double _height;
      _height = 
0.5 
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
    carton.start();
  }
 
  @AnyLogicInternalCodegenAPI
  public void onStartup() {
    super.onStartup();
    
for ( ItemType itemType : ItemType.values() ) {
	if ( order.orderList.containsKey( itemType ) ) {
		currentTypeOfItemsToTake = itemType;
		break;
	}
} 
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_Carton_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Carton_xjal() {
    amountOfCurrentTypeReady = 
 
;
    currentTypeOfItemsToTake = 
null 
;
    processingTimeStart = 
0 
;
    pickingTimeStart = 
0 
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
  @Override
  @AnyLogicInternalCodegenAPI
  public void onReceive( Object _msg_xjal, Agent _sender_xjal ) {
    super.onReceive( _msg_xjal, _sender_xjal );
    
Object  msg = (Object) _msg_xjal;
    Agent sender = _sender_xjal;
    
 
    carton.fireEvent( _msg_xjal );
  }



  @AnyLogicInternalCodegenAPI
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal) {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if ( _underAgents_xjal ) {
      _animator_xjal.drawLink( this, connections, true, true );
    }
  }

  public AgentList<? extends Carton> getPopulation() {
    return (AgentList<? extends Carton>) super.getPopulation();
  }

  public List<? extends Carton> agentsInRange( double distance ) {
    return (List<? extends Carton>) super.agentsInRange( distance );
  }

  // Reaction on changes -------------------------------------
  public void onChange() {
    super.onChange();
    carton.onChange();
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    carton.onDestroy();
    // On destroy code
    
 
    super.onDestroy();
  }

  // Additional class code

 
  // End of additional class code


	public AgentOrientation getOrientationOnConveyor() {
		return ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).getOrientationOnConveyor();
	}
	
	public void setOrientationOnConveyor(AgentOrientation orientation) {
		ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).setOrientationOnConveyor(orientation);
	}
	
	public boolean canChangeOrientationOnConveyor(AgentOrientation orientation) {
		return ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).canChangeOrientationOnConveyor(orientation);
	}
	
	public ConveyorPath getLeadingEdgeConveyor() {
		return ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).getLeadingEdgeConveyor();
	}
	
	public ConveyorPath getTrailingEdgeConveyor() {
		return ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).getTrailingEdgeConveyor();
	}
	
	public List<ConveyorPath> getConveyors() {
		return ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).getConveyors();
	}
	
	public double getLeadingEdgeOffset(LengthUnits units) {
		return ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).getLeadingEdgeOffset(units);
	}
	
	public double getTrailingEdgeOffset(LengthUnits units) {
		return ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).getTrailingEdgeOffset(units);
	}
	
	public Position getLeadingEdgePosition() {
		return ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).getLeadingEdgePosition();
	}
	
	public Position getTrailingEdgePosition() {
		return ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).getTrailingEdgePosition();
	}
	
	public void conveyTo() {
		ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).conveyTo();
	}
	
	public void conveyTo(ConveyorPath conveyor, double offset, LengthUnits units, ConveyorPath[] conveyorsToAvoid) {
		ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).conveyTo(conveyor, offset, units, conveyorsToAvoid);
	}
	
	public void conveyTo(PositionOnConveyor positionOnConveyor, ConveyorPath[] conveyorsToAvoid) {
		ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).conveyTo(positionOnConveyor, conveyorsToAvoid);
	}
	
	public void conveyTo(ConveyorSimpleStation simpleStation, ConveyorPath[] conveyorsToAvoid) {
		ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).conveyTo(simpleStation, conveyorsToAvoid);
	}
	
	public void conveyTo(ConveyorCustomStation customStation, ConveyorPath[] conveyorsToAvoid) {
		ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).conveyTo(customStation, conveyorsToAvoid);
	}
	
	public Agent getTransporter() {
		return ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).getTransporter();
	}

    public double getConveyingSpeed(SpeedUnits units) {
  		return ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).getConveyingSpeed(units);
  	}

  	public double getConveyingSpeed() {
  		return ext(com.anylogic.libraries.material_handling.MaterialItemExtension.class).getConveyingSpeed();
  	}
	
}
