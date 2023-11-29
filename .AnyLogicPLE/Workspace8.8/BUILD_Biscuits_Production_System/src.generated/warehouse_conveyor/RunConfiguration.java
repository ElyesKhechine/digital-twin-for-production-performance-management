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

import static com.anylogic.engine.Utilities.*;
import java.util.Optional;
import java.io.File;

public class RunConfiguration implements IRunConfiguration<Main> {
	/**
	 * Constructor
	 */
	public RunConfiguration() {
	}

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

		engine.setSimultaneousEventsSelectionMode(Engine.EVENT_SELECTION_LIFO);

		engine.setStartTime( 0.0 );
		engine.setTimeUnit( SECOND );
		engine.setStartDate( toDate( 2017, NOVEMBER, 24, 0, 0, 0 ) );
		engine.setStopTime( 15000.0 );
	}

	@Override
    public Main createRootAgent(Engine engine) {
    	return new Main( engine, null, null );
    }
	
	@Override
	@AnyLogicInternalCodegenAPI
	public void setupRootParameters( final Main root, boolean callOnChangeActions,
			IRunValueAccessor parameterSource ) {

		if (callOnChangeActions) {
			root.set_nInitialItemsPerType( root._nInitialItemsPerType_DefaultValue_xjal() );
			root.set_minAvailability( parameterSource.getValue("Reorder level", int.class, null).orElseGet(() -> root._minAvailability_DefaultValue_xjal()) );
			root.set_minItemsInOrder( parameterSource.getValue("Min goods per order", int.class, null).orElseGet(() -> root._minItemsInOrder_DefaultValue_xjal()) );
			root.set_maxItemsInOrder( parameterSource.getValue("Max items goods per order", int.class, null).orElseGet(() -> root._maxItemsInOrder_DefaultValue_xjal()) );
			root.set_orderArrivalTime( parameterSource.getValue("Order arrival time, sec", double.class, null).orElseGet(() -> root._orderArrivalTime_DefaultValue_xjal()) );
		} else {
			root.nInitialItemsPerType = root._nInitialItemsPerType_DefaultValue_xjal();
			root.minAvailability = parameterSource.getValue("Reorder level", int.class, null).orElseGet(() -> root._minAvailability_DefaultValue_xjal());
			root.minItemsInOrder = parameterSource.getValue("Min goods per order", int.class, null).orElseGet(() -> root._minItemsInOrder_DefaultValue_xjal());
			root.maxItemsInOrder = parameterSource.getValue("Max items goods per order", int.class, null).orElseGet(() -> root._maxItemsInOrder_DefaultValue_xjal());
			root.orderArrivalTime = parameterSource.getValue("Order arrival time, sec", double.class, null).orElseGet(() -> root._orderArrivalTime_DefaultValue_xjal());
		}
	}
	
	@Override
	@AnyLogicInternalAPI
	public void getOutputValues(Main root, IRunOutputsConsumer outputsConsumer) {
		outputsConsumer.storeOutput( "Orders|in process", root.ordersStates.get( 0 ).getValue() );
		outputsConsumer.storeOutput( "Orders|wait for preorder", root.ordersStates.get( 1 ).getValue() );
		outputsConsumer.storeOutput( "Stored goods|unreserved items", root.storedItemsStatesChart.get( 0 ).getValue() );
		outputsConsumer.storeOutput( "Stored goods|reserved goods", root.storedItemsStatesChart.get( 1 ).getValue() );
		outputsConsumer.storeOutput( "Amount of goods per order|Items per order", root.amountOfItemsPerOrder.get( 0 ) );
		outputsConsumer.storeOutput( "Goods storing time distribution, min|Item storing time distribtion, min", root.itemStoringTimeHist.get( 0 ) );
		outputsConsumer.storeOutput( "Full order processing time distribution, min|Full order processing time distribtion, min", root.orderProcessingTimeHist.get( 0 ) );
	}

	@Override
	@AnyLogicInternalAPI
	public void setup( IExperimentHost host ) {
		host.setSpeed( 1.0 );
		host.setZoomAndPanningEnabled( false );
		host.setDeveloperPanelEnabled( true );
		host.setDeveloperPanelVisibleOnStart( false );
	}

}
