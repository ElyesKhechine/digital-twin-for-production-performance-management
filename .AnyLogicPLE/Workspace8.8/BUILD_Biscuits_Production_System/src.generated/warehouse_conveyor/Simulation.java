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



public class Simulation extends ExperimentSimulation<Main> {
  @AnyLogicInternalCodegenAPI
  public static String[] COMMAND_LINE_ARGUMENTS_xjal = new String[0];
  {
    setCommandLineArguments_xjal( COMMAND_LINE_ARGUMENTS_xjal );
  }
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Simulation.class );
  
  @AnyLogicInternalCodegenAPI
  @Override
  public Map<String, IElementDescriptor> getElementDesciptors() {
    return elementDesciptors_xjal;
  }
  // Plain Variables
  public 
int 
 minItemsPerOrder = 
3 ;
  public 
int 
 maxItemsPerOrder = 
5 ;
  public 
double 
 orderInterArrivalTime = 
28 ;
  public 
int 
 reorderLevel = 
40 ;
  public 
int 
 initialNumberOfGoodsOfEachType = 
40 ;

  // View areas
  @AnyLogicInternalCodegenAPI
  protected static final Font _text85_Font = new Font("SansSerif", 0, 22 );
  @AnyLogicInternalCodegenAPI
  protected static final Font _text_Font = new Font("SansSerif", 0, 12 );
  @AnyLogicInternalCodegenAPI
  protected static final Font _text1_Font = _text_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text2_Font = _text_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text3_Font = _text_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text4_Font = _text_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text5_Font = new Font("SansSerif", 0, 10 );
  @AnyLogicInternalCodegenAPI
  protected static final Font _text6_Font = _text5_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text7_Font = _text5_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text8_Font = _text5_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text9_Font = _text5_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text10_Font = _text5_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text11_Font = _text5_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text12_Font = _text5_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text13_Font = _text5_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text14_Font = _text5_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text15_Font = _text5_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text16_Font = _text5_Font;
  @AnyLogicInternalCodegenAPI
  protected static final Font _text17_Font = new Font("SansSerif", 0, 16 );
  protected static final Color _rectangle117_Fill_Color = new Color( 0xFF81C3FF, true );
  @AnyLogicInternalCodegenAPI
  protected static final int _slider = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int _slider1 = 2;
  @AnyLogicInternalCodegenAPI
  protected static final int _slider2 = 3;
  @AnyLogicInternalCodegenAPI
  protected static final int _slider3 = 4;
  @AnyLogicInternalCodegenAPI
  protected static final int _image = 5;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle116 = 6;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle117 = 7;
  @AnyLogicInternalCodegenAPI
  protected static final int _text85 = 8;
  @AnyLogicInternalCodegenAPI
  protected static final int _groupMainMenu = 9;
  @AnyLogicInternalCodegenAPI
  protected static final int _text = 10;
  @AnyLogicInternalCodegenAPI
  protected static final int _image1 = 11;
  @AnyLogicInternalCodegenAPI
  protected static final int _text1 = 12;
  @AnyLogicInternalCodegenAPI
  protected static final int _text2 = 13;
  @AnyLogicInternalCodegenAPI
  protected static final int _text3 = 14;
  @AnyLogicInternalCodegenAPI
  protected static final int _text4 = 15;
  @AnyLogicInternalCodegenAPI
  protected static final int _text5 = 16;
  @AnyLogicInternalCodegenAPI
  protected static final int _text6 = 17;
  @AnyLogicInternalCodegenAPI
  protected static final int _text7 = 18;
  @AnyLogicInternalCodegenAPI
  protected static final int _text8 = 19;
  @AnyLogicInternalCodegenAPI
  protected static final int _text9 = 20;
  @AnyLogicInternalCodegenAPI
  protected static final int _text10 = 21;
  @AnyLogicInternalCodegenAPI
  protected static final int _text11 = 22;
  @AnyLogicInternalCodegenAPI
  protected static final int _text12 = 23;
  @AnyLogicInternalCodegenAPI
  protected static final int _text13 = 24;
  @AnyLogicInternalCodegenAPI
  protected static final int _text14 = 25;
  @AnyLogicInternalCodegenAPI
  protected static final int _text15 = 26;
  @AnyLogicInternalCodegenAPI
  protected static final int _text16 = 27;
  @AnyLogicInternalCodegenAPI
  protected static final int _roundRectangle = 28;
  @AnyLogicInternalCodegenAPI
  protected static final int _rectangle = 29;
  @AnyLogicInternalCodegenAPI
  protected static final int _text17 = 30;
  @AnyLogicInternalCodegenAPI
  protected static final int _group = 31;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 32;


  @Override
  @AnyLogicInternalCodegenAPI
  public boolean onShapeClick( int _shape, int index, double clickx, double clicky ){
    switch( _shape ){
      case _image1:
        if (true) {
          ShapeImage self = this.image1;
          
getExperimentHost().openWebSite("https://www.anylogic.com"); 
        }
        break;
      default: return super.onShapeClick( _shape, index, clickx, clicky );
 	}
 	return false;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void executeShapeControlAction( int _shape, int index, double value ) {
    switch( _shape ) {
      case _slider:
        minItemsPerOrder = (int) value;
        break;
      case _slider1:
        maxItemsPerOrder = (int) value;
        break;
      case _slider2:
        reorderLevel = (int) value;
        break;
      case _slider3:
        orderInterArrivalTime = value;
        break;
      default:
        super.executeShapeControlAction( _shape, index, value );
        break;
    }
  }
        
  @Override
  @AnyLogicInternalCodegenAPI
  public double getShapeControlDefaultValueDouble( int _shape, int index ) {
    switch(_shape) {
      case _slider: return 
minItemsPerOrder 
;
      case _slider1: return 
maxItemsPerOrder 
;
      case _slider2: return 
reorderLevel 
;
      case _slider3: return 
orderInterArrivalTime 
;
      default: return super.getShapeControlDefaultValueDouble( _shape, index );
    }
  }

  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _slider_SetDynamicParams_xjal( ShapeSlider shape ) {
    {
      @AnyLogicInternalCodegenAPI
      double _min = 
1 ;
      @AnyLogicInternalCodegenAPI
      double _max = 
3 ;
      shape.setRange( _min, _max );
    }
  }
  
  protected ShapeSlider slider;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _slider1_SetDynamicParams_xjal( ShapeSlider shape ) {
    {
      @AnyLogicInternalCodegenAPI
      double _min = 
3 ;
      @AnyLogicInternalCodegenAPI
      double _max = 
5 ;
      shape.setRange( _min, _max );
    }
  }
  
  protected ShapeSlider slider1;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _slider2_SetDynamicParams_xjal( ShapeSlider shape ) {
    {
      @AnyLogicInternalCodegenAPI
      double _min = 
20 ;
      @AnyLogicInternalCodegenAPI
      double _max = 
45 ;
      shape.setRange( _min, _max );
    }
  }
  
  protected ShapeSlider slider2;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _slider3_SetDynamicParams_xjal( ShapeSlider shape ) {
    {
      @AnyLogicInternalCodegenAPI
      double _min = 
25 ;
      @AnyLogicInternalCodegenAPI
      double _max = 
45 ;
      shape.setRange( _min, _max );
    }
  }
  
  protected ShapeSlider slider3;
  protected ShapeImage image;
  protected ShapeRectangle rectangle116;
  protected ShapeRectangle rectangle117;
  protected ShapeText text85;
  protected ShapeGroup groupMainMenu;
  protected ShapeText text;
  protected ShapeImage image1;
  protected ShapeText text1;
  protected ShapeText text2;
  protected ShapeText text3;
  protected ShapeText text4;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text5_SetDynamicParams_xjal( ShapeText shape ) {
    shape.setText(
slider.getMin() 
);
  }
  
  protected ShapeText text5;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text6_SetDynamicParams_xjal( ShapeText shape ) {
    shape.setText(
slider.getMax() 
);
  }
  
  protected ShapeText text6;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text7_SetDynamicParams_xjal( ShapeText shape ) {
    shape.setText(
slider.getValue() 
);
  }
  
  protected ShapeText text7;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text8_SetDynamicParams_xjal( ShapeText shape ) {
    shape.setText(
slider1.getMin() 
);
  }
  
  protected ShapeText text8;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text9_SetDynamicParams_xjal( ShapeText shape ) {
    shape.setText(
slider1.getMax() 
);
  }
  
  protected ShapeText text9;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text10_SetDynamicParams_xjal( ShapeText shape ) {
    shape.setText(
slider1.getValue() 
);
  }
  
  protected ShapeText text10;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text11_SetDynamicParams_xjal( ShapeText shape ) {
    shape.setText(
slider2.getMin() 
);
  }
  
  protected ShapeText text11;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text12_SetDynamicParams_xjal( ShapeText shape ) {
    shape.setText(
slider2.getMax() 
);
  }
  
  protected ShapeText text12;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text13_SetDynamicParams_xjal( ShapeText shape ) {
    shape.setText(
slider2.getValue() 
);
  }
  
  protected ShapeText text13;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text14_SetDynamicParams_xjal( ShapeText shape ) {
    shape.setText(
slider3.getMin() 
);
  }
  
  protected ShapeText text14;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text15_SetDynamicParams_xjal( ShapeText shape ) {
    shape.setText(
slider3.getMax() 
);
  }
  
  protected ShapeText text15;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _text16_SetDynamicParams_xjal( ShapeText shape ) {
    shape.setText(
slider3.getValue() 
);
  }
  
  protected ShapeText text16;
  protected ShapeRoundedRectangle roundRectangle;
  protected ShapeRectangle rectangle;
  protected ShapeText text17;
  protected ShapeGroup group;
  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    slider = new ShapeSlider(
		    Simulation.this, true, 939.0, 100.0, 
			100.0, 30.0,
            true, false,
            1
            , 3
            , 0
            , ShapeControl.TYPE_INT ) {
      @Override
      public void updateDynamicProperties() {
        _slider_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }

      @Override
      @AnyLogicInternalCodegenAPI
      public void action() {
        executeShapeControlAction( _slider, 0, value );
      }

      @Override
      public void setValueToDefault() {
		setValue( limit( getMin(), getShapeControlDefaultValueDouble( _slider, 0 ), getMax() ) );
      }
    };

    slider1 = new ShapeSlider(
		    Simulation.this, true, 939.0, 150.0, 
			100.0, 30.0,
            true, false,
            3
            , 5
            , 0
            , ShapeControl.TYPE_INT ) {
      @Override
      public void updateDynamicProperties() {
        _slider1_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }

      @Override
      @AnyLogicInternalCodegenAPI
      public void action() {
        executeShapeControlAction( _slider1, 0, value );
      }

      @Override
      public void setValueToDefault() {
		setValue( limit( getMin(), getShapeControlDefaultValueDouble( _slider1, 0 ), getMax() ) );
      }
    };

    slider2 = new ShapeSlider(
		    Simulation.this, true, 1239.0, 153.0, 
			100.0, 30.0,
            true, false,
            20
            , 45
            , 0
            , ShapeControl.TYPE_INT ) {
      @Override
      public void updateDynamicProperties() {
        _slider2_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }

      @Override
      @AnyLogicInternalCodegenAPI
      public void action() {
        executeShapeControlAction( _slider2, 0, value );
      }

      @Override
      public void setValueToDefault() {
		setValue( limit( getMin(), getShapeControlDefaultValueDouble( _slider2, 0 ), getMax() ) );
      }
    };

    slider3 = new ShapeSlider(
		    Simulation.this, true, 1239.0, 100.0, 
			100.0, 30.0,
            true, false,
            25
            , 45
            , 0
            , ShapeControl.TYPE_DOUBLE ) {
      @Override
      public void updateDynamicProperties() {
        _slider3_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }

      @Override
      @AnyLogicInternalCodegenAPI
      public void action() {
        executeShapeControlAction( _slider3, 0, value );
      }

      @Override
      public void setValueToDefault() {
		setValue( limit( getMin(), getShapeControlDefaultValueDouble( _slider3, 0 ), getMax() ) );
      }
    };

    image = new ShapeImage(
		Simulation.this, SHAPE_DRAW_2D, true, 0.0, 50.0, 0.0, 0.0, 
			1402.0, 661.0, "/warehouse_conveyor/", 
			new String[]{"warehouse conveyor.jpg",}	 );

    rectangle116 = new ShapeRectangle(
       SHAPE_DRAW_2D, true,0.0, 0.0, 0.0, 0.0, 
            null, dodgerBlue,
			240.0, 50.0, 10.0, 1.0, LINE_STYLE_SOLID );

    rectangle117 = new ShapeRectangle(
       SHAPE_DRAW_2D, true,240.0, 0.0, 0.0, 0.0, 
            null, _rectangle117_Fill_Color,
			1160.0, 50.0, 10.0, 1.0, LINE_STYLE_SOLID );

    text85 = new ShapeText(
        SHAPE_DRAW_2D, true,19.0, 13.0, 0.0, 0.0, 
        white,"Warehouse Conveyor",
        _text85_Font, ALIGNMENT_LEFT );

    text = new ShapeText(
        SHAPE_DRAW_2D, true,40.0, 470.0, 0.0, 0.0, 
        black,"This is a simplified model of a warehouse with a conveyor system. \r\nPallets with food, drinks, and dishes arrive at docks for delivery \r\nonto the pallet conveyor system. These goods are then taken from the pallets \r\nby either robots or workers and placed on infeeding conveyors that take them to racks. \r\n\r\nThe third conveyor network simulates order picking and simple sorting systems. \r\nCartons are delivered to order picking lines where operators put the ordered goods \r\ninside boxes. If there are other goods that need to be added to the order, \r\nthen the carton is conveyed to the next picking line. \r\nOtherwise the carton is moved to the packing line and then to a sortation system.\r\n\r\nThe model is built with the Material Handling Library and focuses on the simulation of conveying goods \r\nand simple inline operations.",
        _text_Font, ALIGNMENT_LEFT );

    image1 = new ShapeImage(
		Simulation.this, SHAPE_DRAW_2D, true, 1180.0, 620.0, 0.0, 0.0, 
			200.0, 75.0, "/warehouse_conveyor/", 
			new String[]{"AnyLogic model logo dark.png",}	 ) {

      @Override
      @AnyLogicInternalCodegenAPI
      public boolean onClick( double clickx, double clicky ) {
        return onShapeClick( _image1, 0, clickx, clicky );
      }
    };

    text1 = new ShapeText(
        SHAPE_DRAW_2D, true,818.0, 107.0, 0.0, 0.0, 
        black,"Min goods per order",
        _text1_Font, ALIGNMENT_LEFT );

    text2 = new ShapeText(
        SHAPE_DRAW_2D, true,819.0, 156.0, 0.0, 0.0, 
        black,"Max goods per order",
        _text2_Font, ALIGNMENT_LEFT );

    text3 = new ShapeText(
        SHAPE_DRAW_2D, true,1144.0, 161.0, 0.0, 0.0, 
        black,"Reorder level",
        _text3_Font, ALIGNMENT_LEFT );

    text4 = new ShapeText(
        SHAPE_DRAW_2D, true,1076.0, 106.0, 0.0, 0.0, 
        black,"Order interarrival time, sec",
        _text4_Font, ALIGNMENT_LEFT );

    text5 = new ShapeText(
        SHAPE_DRAW_2D, true,939.0, 124.0, 0.0, 0.0, 
        black,"min",
        _text5_Font, ALIGNMENT_LEFT ) {
      @Override
      public void updateDynamicProperties() {
        _text5_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    text6 = new ShapeText(
        SHAPE_DRAW_2D, true,1039.0, 124.0, 0.0, 0.0, 
        black,"max",
        _text6_Font, ALIGNMENT_RIGHT ) {
      @Override
      public void updateDynamicProperties() {
        _text6_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    text7 = new ShapeText(
        SHAPE_DRAW_2D, true,989.0, 124.0, 0.0, 0.0, 
        black,"value",
        _text7_Font, ALIGNMENT_CENTER ) {
      @Override
      public void updateDynamicProperties() {
        _text7_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    text8 = new ShapeText(
        SHAPE_DRAW_2D, true,939.0, 175.0, 0.0, 0.0, 
        black,"min",
        _text8_Font, ALIGNMENT_LEFT ) {
      @Override
      public void updateDynamicProperties() {
        _text8_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    text9 = new ShapeText(
        SHAPE_DRAW_2D, true,1039.0, 175.0, 0.0, 0.0, 
        black,"max",
        _text9_Font, ALIGNMENT_RIGHT ) {
      @Override
      public void updateDynamicProperties() {
        _text9_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    text10 = new ShapeText(
        SHAPE_DRAW_2D, true,989.0, 175.0, 0.0, 0.0, 
        black,"value",
        _text10_Font, ALIGNMENT_CENTER ) {
      @Override
      public void updateDynamicProperties() {
        _text10_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    text11 = new ShapeText(
        SHAPE_DRAW_2D, true,1238.0, 177.0, 0.0, 0.0, 
        black,"min",
        _text11_Font, ALIGNMENT_LEFT ) {
      @Override
      public void updateDynamicProperties() {
        _text11_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    text12 = new ShapeText(
        SHAPE_DRAW_2D, true,1338.0, 177.0, 0.0, 0.0, 
        black,"max",
        _text12_Font, ALIGNMENT_RIGHT ) {
      @Override
      public void updateDynamicProperties() {
        _text12_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    text13 = new ShapeText(
        SHAPE_DRAW_2D, true,1288.0, 177.0, 0.0, 0.0, 
        black,"value",
        _text13_Font, ALIGNMENT_CENTER ) {
      @Override
      public void updateDynamicProperties() {
        _text13_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    text14 = new ShapeText(
        SHAPE_DRAW_2D, true,1239.0, 122.0, 0.0, 0.0, 
        black,"min",
        _text14_Font, ALIGNMENT_LEFT ) {
      @Override
      public void updateDynamicProperties() {
        _text14_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    text15 = new ShapeText(
        SHAPE_DRAW_2D, true,1339.0, 122.0, 0.0, 0.0, 
        black,"max",
        _text15_Font, ALIGNMENT_RIGHT ) {
      @Override
      public void updateDynamicProperties() {
        _text15_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    text16 = new ShapeText(
        SHAPE_DRAW_2D, true,1289.0, 122.0, 0.0, 0.0, 
        black,"value",
        _text16_Font, ALIGNMENT_CENTER ) {
      @Override
      public void updateDynamicProperties() {
        _text16_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    roundRectangle = new ShapeRoundedRectangle(
		true,-290.0, -66.0, 0.0, 
        dodgerBlue, null,
		570.0, 136.0,10.0,  
		1.0, LINE_STYLE_SOLID	 );

    rectangle = new ShapeRectangle(
       SHAPE_DRAW_2D, true,-52.0, -80.0, 0.0, 0.0, 
            null, silver,
			77.0, 30.0, 10.0, 1.0, LINE_STYLE_SOLID );

    text17 = new ShapeText(
        SHAPE_DRAW_2D, true,-42.0, -75.0, 0.0, 0.0, 
        black,"Settings",
        _text17_Font, ALIGNMENT_LEFT );

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {				
    groupMainMenu = new ShapeGroup( Simulation.this, SHAPE_DRAW_2D, true, 0.0, 0.0, 0.0, 0.0
	
	     , rectangle116
	     , rectangle117
	     , text85 );

    }
    {				
    group = new ShapeGroup( Simulation.this, SHAPE_DRAW_2D, true, 1090.0, 140.0, 0.0, 0.0
	
	     , roundRectangle
	     , rectangle
	     , text17 );

    }
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBS0_xjal() {
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
  public int getWindowWidth() {
    return 1400;
  }

  @Override
  public int getWindowHeight() {
    return 700;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void onDestroy_xjal() {
    super.onDestroy_xjal();
  }


  @Override
  @AnyLogicInternalCodegenAPI
  public void initDefaultRandomNumberGenerator(Engine _e) {
    _e.getDefaultRandomGenerator().setSeed( 1 );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public Main createRoot( Engine engine ) {
    // Create the root object
    return new Main( engine, null, null );
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void setupRootParameters( final Main self, boolean callOnChangeActions ) {
    final Main root = self; // for compatibility
    int nInitialItemsPerType_xjal;
    nInitialItemsPerType_xjal = 
initialNumberOfGoodsOfEachType 
;
    if (callOnChangeActions) {
      self.set_nInitialItemsPerType( nInitialItemsPerType_xjal );
    } else {
      self.nInitialItemsPerType = nInitialItemsPerType_xjal;
    }
    int minAvailability_xjal;
    minAvailability_xjal = 
reorderLevel 
;
    if (callOnChangeActions) {
      self.set_minAvailability( minAvailability_xjal );
    } else {
      self.minAvailability = minAvailability_xjal;
    }
    int minItemsInOrder_xjal;
    minItemsInOrder_xjal = 
minItemsPerOrder 
;
    if (callOnChangeActions) {
      self.set_minItemsInOrder( minItemsInOrder_xjal );
    } else {
      self.minItemsInOrder = minItemsInOrder_xjal;
    }
    int maxItemsInOrder_xjal;
    maxItemsInOrder_xjal = 
maxItemsPerOrder 
;
    if (callOnChangeActions) {
      self.set_maxItemsInOrder( maxItemsInOrder_xjal );
    } else {
      self.maxItemsInOrder = maxItemsInOrder_xjal;
    }
    double orderArrivalTime_xjal;
    orderArrivalTime_xjal = 
orderInterArrivalTime 
;
    if (callOnChangeActions) {
      self.set_orderArrivalTime( orderArrivalTime_xjal );
    } else {
      self.orderArrivalTime = orderArrivalTime_xjal;
    }
  }
  

  /**
   * Engine setup
   */
  @Override
  @AnyLogicInternalCodegenAPI
  public void setupEngine(Engine engine) {
    engine.setATOL( 1.0E-5 );
    engine.setRTOL( 1.0E-5 );
    engine.setTTOL( 1.0E-5 );
    engine.setHTOL( 0.001 );
    engine.setSolverODE( Engine.SOLVER_ODE_EULER );
    engine.setSolverNAE( Engine.SOLVER_NAE_MODIFIED_NEWTON );
    engine.setSolverDAE( Engine.SOLVER_DAE_RK45_NEWTON );
    engine.setVMethods( 427029 );
    engine.setSimultaneousEventsSelectionMode( Engine.EVENT_SELECTION_LIFO );

    engine.setStartTime( 0.0 );
    engine.setTimeUnit( SECOND );
    engine.setStartDate( toDate( 2017, NOVEMBER, 24, 0, 0, 0 ) );
    engine.setRealTimeMode( true );
    engine.setRealTimeScale( 25.0 );
  }

  /**
   * Experiment setup
   */
  @Override
  @AnyLogicInternalCodegenAPI
  public void setup( IExperimentHost _e ) {
    setName( "Warehouse Conveyor : Simulation" );

    // Static initialization of persistent elements
    _createPersistentElementsBP0_xjal();

    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
    presentation = new ShapeTopLevelPresentationGroup( Simulation.this, true, 0, 0, 0, 0 , image, groupMainMenu, text, image1, text1, text2, text3, text4, text5, text6, text7, text8, text9, text10, text11, text12, text13, text14, text15, text16, group, slider, slider1, slider2, slider3 );
    // Dynamic initialization of persistent elements
    _createPersistentElementsBS0_xjal();
    icon = new ShapeModelElementsGroup( Simulation.this, getElementProperty( "warehouse_conveyor.Simulation.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    _e.setZoomAndPanningEnabled( false );
    _e.setDeveloperPanelEnabled( true );
    _e.setDeveloperPanelVisibleOnStart( false );
    slider.setValueToDefault();
    slider1.setValueToDefault();
    slider2.setValueToDefault();
    slider3.setValueToDefault();
  }

}
