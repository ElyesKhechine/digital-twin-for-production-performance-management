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

public class Forklift extends Agent
        implements ITransporter
{
  // Parameters
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Forklift.class );
  
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
  protected static final Pair<String, Color>[] _forklift_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "Material__2__Surf", null ),
    new Pair<String, Color>( "Material__1__Surf", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final Pair<String, Color>[] _sittingWorker_customColors_xjal = new Pair[] {
    new Pair<String, Color>( "Material__5__Surf", null ),
    new Pair<String, Color>( "Material__9__Surf", null ),
    new Pair<String, Color>( "Material__7__Surf", null ),
    new Pair<String, Color>( "Material__6__Surf", null ),
    new Pair<String, Color>( "Material__2__Surf", null ),
    new Pair<String, Color>( "Material__3__Surf", null ),
    new Pair<String, Color>( "Material__8__Surf", null ),
    new Pair<String, Color>( "Material__4__Surf", null ),
  };
  @AnyLogicInternalCodegenAPI
  protected static final int _forklift = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int _sittingWorker = 2;
  @AnyLogicInternalCodegenAPI
  protected static final int _forkliftWithWorker = 3;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 4;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return true;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll(forkliftWithWorker);
  }

  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _forklift_SetDynamicParams_xjal( Shape3DObject shape ) {
    shape.setX(
-getScale().pixelsPerUnit(METER) 
);
  }
  
  protected Shape3DObject forklift;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _sittingWorker_SetDynamicParams_xjal( Shape3DObject shape ) {
    shape.setX(
-1.5 * getScale().pixelsPerUnit(METER) 
);
    shape.setZ(
0.8 * getScale().pixelsPerUnit(METER) 
);
  }
  
  protected Shape3DObject sittingWorker;
  protected ShapeGroup forkliftWithWorker;
  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    forklift = new Shape3DObject(
		Forklift.this, SHAPE_DRAW_2D3D, true, -10.0, 0.0, 0.0, 0.0,
			1.0, false, "/warehouse_conveyor/",
			"3d/forklift.dae", OBJECT_3D_YZX_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -11.0, -6.0,
			21.0, 11.0, null, _forklift_customColors_xjal ) {
      @Override
      public void updateDynamicProperties() {
        _forklift_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    sittingWorker = new Shape3DObject(
		Forklift.this, SHAPE_DRAW_2D3D, true, -15.0, 0.0, 8.0, 0.0,
			1.0, false, "/warehouse_conveyor/",
			"3d/sittingworker.dae", OBJECT_3D_YZX_AXIS_ORDER, OBJECT_3D_INTERNAL_LIGHTING_OFF, false, -2.0, -4.0,
			9.0, 7.0, null, _sittingWorker_customColors_xjal ) {
      @Override
      public void updateDynamicProperties() {
        _sittingWorker_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {				
    forkliftWithWorker = new ShapeGroup( Forklift.this, SHAPE_DRAW_2D3D, true, 10.0, 0.0, 0.0, 0.0
	
	     , forklift
	     , sittingWorker );

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

	


  /**
   * Constructor
   */
  public Forklift( Engine engine, Agent owner, AgentList<? extends Forklift> ownerPopulation ) {
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
  public Forklift() {
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Assigning initial values for plain variables
    setupPlainVariables_Forklift_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( Forklift.this, true, 0, 0, 0, 0 , level );
    icon = new ShapeModelElementsGroup( Forklift.this, getElementProperty( "warehouse_conveyor.Forklift.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
	 // Port connectors with non-replicated objects
    // Creating replicated embedded objects
    setupInitialConditions_xjal( Forklift.class );
    // Dynamic initialization of persistent elements
    _createPersistentElementsBS0_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void setupExt_xjal(AgentExtension _ext) {
    // Agent properties setup
    if ( _ext instanceof ExtEntity && tryExt(ExtEntity.class) == null ) {
      ExtEntity _e = (ExtEntity) _ext;
      double _length;
      _length = 
2 
;
	  _e.setLength( _length, METER );
	  double _width;
      _width = 
1.1 
;
	  _e.setWidth( _width, METER );
	  double _height;
      _height = 
1.5 
;
	  _e.setHeight( _height, METER );
    }
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
  }
 
  @AnyLogicInternalCodegenAPI
  public void onStartup() {
    super.onStartup();
    
setCargoPosition( 1, 0, 0, METER ); 
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_Forklift_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Forklift_xjal() {
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

  public AgentList<? extends Forklift> getPopulation() {
    return (AgentList<? extends Forklift>) super.getPopulation();
  }

  public List<? extends Forklift> agentsInRange( double distance ) {
    return (List<? extends Forklift>) super.agentsInRange( distance );
  }



	public double getHomeX() {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).getHomeX();
	}
	
	public double getHomeY() {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).getHomeY();
	}
	
	public double getHomeZ() {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).getHomeZ();
	}
	
	public INode getHomeLocation() {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).getHomeLocation();
	}
	
	public double getHomeRotation() {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).getHomeRotation();
	}
	
	public void setHomeLocation(INode home) {
		ext(com.anylogic.libraries.material_handling.TransporterExtension.class).setHomeLocation(home);
	}
	
	public void setHomePosition(double x, double y) {
		ext(com.anylogic.libraries.material_handling.TransporterExtension.class).setHomePosition(x, y);
	}
	
	public void setHomePosition(double x, double y, double z) {
		ext(com.anylogic.libraries.material_handling.TransporterExtension.class).setHomePosition(x, y, z);
	}
	
	public boolean isAttached() {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).isAttached();
	}
	
	public void setAttached(boolean attached) {
		ext(com.anylogic.libraries.material_handling.TransporterExtension.class).setAttached(attached);
	}
	
	public boolean isReserved() {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).isReserved();
	}
	
	public Agent getReservedBy() {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).getReservedBy();
	}
	
	public Agent getServicedEntity() {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).getServicedEntity();
	}
	
	public ResourceType getResourceType() {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).getResourceType();
	}
	
	public ResourceUnitTask currentTask() {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).currentTask();
	}
	
	public ResourceTaskType currentTaskType() {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).currentTaskType();
	}
	
	public void addTask(ResourceUnitTask task) {
		ext(com.anylogic.libraries.material_handling.TransporterExtension.class).addTask(task);
	}
	
	public void removeTask(ResourceUnitTask task) {
		ext(com.anylogic.libraries.material_handling.TransporterExtension.class).removeTask(task);
	}
	
	public double getUtilization() {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).getUtilization();
	}
	
	public void resetStats() {
		ext(com.anylogic.libraries.material_handling.TransporterExtension.class).resetStats();
	}
	
	public double timeInState(ResourceUsageState state) {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).timeInState(state);
	}
	
	public double timeInState(ResourceUsageState state, TimeUnits units) {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).timeInState(state, units);
	}
	
	public double timeInState(TransporterState state, TimeUnits units) {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).timeInState(state, units);
	}
	
	public double timeInState(TransporterState state) {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).timeInState(state);
	}
	
	public boolean isBusy() {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).isBusy();
	}
	
	public boolean isIdle() {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).isIdle();
	}
	
	public ResourcePool resourcePool() {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).resourcePool();
	}
	
	public com.anylogic.libraries.material_handling.TransporterFleet getFleet() {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).getFleet();
	}
	
	public com.anylogic.libraries.material_handling.TransporterState getState() {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).getState();
	}
	
	public com.anylogic.libraries.material_handling.ILocation getCurrentLocation() {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).getCurrentLocation();
	}
		
	public double getMaximumSpeed(SpeedUnits units) {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).getMaximumSpeed(units);
	}
	
	public void setMaximumSpeed(double speed, SpeedUnits units) {
		ext(com.anylogic.libraries.material_handling.TransporterExtension.class).setMaximumSpeed(speed, units);
	}
	
	public double getMaximumSpeedOnCurvedSegment(SpeedUnits units) {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).getMaximumSpeedOnCurvedSegment(units);
	}
	
	public void setMaximumSpeedOnCurvedSegment(double speed, SpeedUnits units) {
		ext(com.anylogic.libraries.material_handling.TransporterExtension.class).setMaximumSpeedOnCurvedSegment(speed, units);
	}
	
	public double getAcceleration(AccelerationUnits units) {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).getAcceleration(units);
	}
	
	public void setAcceleration(double acceleration, AccelerationUnits units) {
		ext(com.anylogic.libraries.material_handling.TransporterExtension.class).setAcceleration(acceleration, units);
	}
	
	public double getDeceleration(AccelerationUnits units) {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).getDeceleration(units);
	}
	
	public void setDeceleration(double deceleration, AccelerationUnits units) {
		ext(com.anylogic.libraries.material_handling.TransporterExtension.class).setDeceleration(deceleration, units);
	}
	
	public Position getCargoPosition() {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).getCargoPosition();
	}
	
	public void setCargoPosition(double dx, double dy, double dz, LengthUnits units) {
		ext(com.anylogic.libraries.material_handling.TransporterExtension.class).setCargoPosition(dx, dy, dz, units);
	}
	
	public void setCargoPosition(double dx, double dy, double dz, LengthUnits units, double rotation, double verticalRotation) {
		ext(com.anylogic.libraries.material_handling.TransporterExtension.class).setCargoPosition(dx, dy, dz, units, rotation, verticalRotation);
	}
	
	public void resetCargoPosition() {
		ext(com.anylogic.libraries.material_handling.TransporterExtension.class).resetCargoPosition();
	}
	
	public void recalculateRoute() {
		ext(com.anylogic.libraries.material_handling.TransporterExtension.class).recalculateRoute();
	}
	
	public void recalculateRoute(double x, double y, double z) {
		ext(com.anylogic.libraries.material_handling.TransporterExtension.class).recalculateRoute(x, y, z);
	}
	
	public void recalculateRoute(Level level, double x, double y, double z) {
		ext(com.anylogic.libraries.material_handling.TransporterExtension.class).recalculateRoute(level, x, y, z);
	}
	
	public void recalculateRoute(Node node) {
		ext(com.anylogic.libraries.material_handling.TransporterExtension.class).recalculateRoute(node);
	}
	
	public void recalculateRoute(Attractor attractor) {
		ext(com.anylogic.libraries.material_handling.TransporterExtension.class).recalculateRoute(attractor);
	}
	
	public void recalculateRoute(Path path, double offset, LengthUnits units) {
		ext(com.anylogic.libraries.material_handling.TransporterExtension.class).recalculateRoute(path, offset, units);
	}
	
	public void recalculateRoute(ConveyorPath conveyor, double offset, LengthUnits units) {
		ext(com.anylogic.libraries.material_handling.TransporterExtension.class).recalculateRoute(conveyor, offset, units);
	}
	
	public void recalculateRoute(PositionOnConveyor positionOnConveyor) {
		ext(com.anylogic.libraries.material_handling.TransporterExtension.class).recalculateRoute(positionOnConveyor);
	}
	
	public void recalculateRoute(ConveyorStation station) {
		ext(com.anylogic.libraries.material_handling.TransporterExtension.class).recalculateRoute(station);
	}
	
	public RouteData getRouteData() {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).getRouteData();
	}
	
	public double getDistanceTravelled(LengthUnits units) {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).getDistanceTravelled(units);
	}
	
	public void resetDistanceTravelled() {
		ext(com.anylogic.libraries.material_handling.TransporterExtension.class).resetDistanceTravelled();
	}
	
	public void ignoreCollisions(boolean ignore) {
		ext(com.anylogic.libraries.material_handling.TransporterExtension.class).ignoreCollisions(ignore);
	}
	
	public void ignoreCollisionsFor(double time, TimeUnits units) {
		ext(com.anylogic.libraries.material_handling.TransporterExtension.class).ignoreCollisionsFor(time, units);
	}
	
	@AnyLogicInternalAPI
	public double totalDowntime() {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).totalDowntime();
	}
	
	@AnyLogicInternalAPI
	public double totalRepairTime() {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).totalRepairTime();
	}

	@AnyLogicInternalAPI
	public double totalMaintenanceTime(){
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).totalMaintenanceTime();
	}

	@AnyLogicInternalAPI
	public double totalBreaksTime() {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).totalBreaksTime();
	}

	@AnyLogicInternalAPI
	public double totalCustomTasksTime() {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).totalCustomTasksTime();
	}

	@AnyLogicInternalAPI
	public double totalDowntime(TimeUnits units) {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).totalDowntime(units);
	}

	@AnyLogicInternalAPI
	public double totalRepairTime(TimeUnits units) {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).totalRepairTime(units);
	}
	
	@AnyLogicInternalAPI
	public double totalMaintenanceTime(TimeUnits units) {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).totalMaintenanceTime(units);
	}

	@AnyLogicInternalAPI
	public double totalBreaksTime(TimeUnits units) {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).totalBreaksTime(units);
	}

	@AnyLogicInternalAPI
	public double totalCustomTasksTime(TimeUnits units) {
		return ext(com.anylogic.libraries.material_handling.TransporterExtension.class).totalCustomTasksTime(units);
	}
	
}
