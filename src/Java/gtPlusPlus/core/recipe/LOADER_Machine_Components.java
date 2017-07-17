package gtPlusPlus.core.recipe;

import gtPlusPlus.core.lib.CORE;
import gtPlusPlus.core.recipe.common.CI;
import gtPlusPlus.core.util.item.ItemUtils;
import gtPlusPlus.xmod.gregtech.api.enums.GregtechItemList;

public class LOADER_Machine_Components {

	public static void initialise(){

		if (!CORE.GTNH){					
			if(CORE.MAIN_GREGTECH_5U_EXPERIMENTAL_FORK){
				registerGTExperimentalComponents();
			}
			else {
				registerGTStandardComponents();
			}
		}
		else {
			registerGTNHComponents();
		}
	}

	private static void registerGTExperimentalComponents(){
		//Machine Components
		CI.electricMotor_LuV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32606, 1);
		CI.electricMotor_ZPM = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32607, 1);
		CI.electricMotor_UV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32608, 1);
		CI.electricPump_LuV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32620, 1);
		CI.electricPump_ZPM = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32621, 1);
		CI.electricPump_UV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32622, 1);
		CI.electricPiston_LuV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32645, 1);
		CI.electricPiston_ZPM = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32646, 1);
		CI.electricPiston_UV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32647, 1);
		CI.robotArm_LuV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32655, 1);
		CI.robotArm_ZPM = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32656, 1);
		CI.robotArm_UV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32657, 1);
		CI.conveyorModule_LuV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32636, 1);
		CI.conveyorModule_ZPM = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32637, 1);
		CI.conveyorModule_UV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32638, 1);
		CI.emitter_LuV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32685, 1);
		CI.emitter_ZPM = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32686, 1);
		CI.emitter_UV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32687, 1);
		CI.fieldGenerator_LuV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32675, 1);
		CI.fieldGenerator_ZPM = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32676, 1);
		CI.fieldGenerator_UV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32677, 1);
		CI.sensor_LuV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32695, 1);
		CI.sensor_ZPM = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32696, 1);
		CI.sensor_UV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32697, 1);

		registerComponent_ULV();
		registerComponent_MAX();
	}

	private static void registerGTStandardComponents(){
		CI.electricMotor_LuV = GregtechItemList.Electric_Motor_LuV.get(1);
		CI.electricMotor_ZPM = GregtechItemList.Electric_Motor_ZPM.get(1);
		CI.electricMotor_UV = GregtechItemList.Electric_Motor_UV.get(1);
		CI.electricMotor_MAX = GregtechItemList.Electric_Motor_MAX.get(1);
		CI.electricPump_LuV = GregtechItemList.Electric_Pump_LuV.get(1);
		CI.electricPump_ZPM = GregtechItemList.Electric_Pump_ZPM.get(1);
		CI.electricPump_UV = GregtechItemList.Electric_Pump_UV.get(1);
		CI.electricPump_MAX = GregtechItemList.Electric_Pump_MAX.get(1);
		CI.electricPiston_LuV = GregtechItemList.Electric_Piston_LuV.get(1);
		CI.electricPiston_ZPM = GregtechItemList.Electric_Piston_ZPM.get(1);
		CI.electricPiston_UV = GregtechItemList.Electric_Piston_UV.get(1);
		CI.electricPiston_MAX = GregtechItemList.Electric_Piston_MAX.get(1);
		CI.robotArm_LuV = GregtechItemList.Robot_Arm_LuV.get(1);
		CI.robotArm_ZPM = GregtechItemList.Robot_Arm_ZPM.get(1);
		CI.robotArm_UV = GregtechItemList.Robot_Arm_UV.get(1);
		CI.robotArm_MAX = GregtechItemList.Robot_Arm_MAX.get(1);
		CI.conveyorModule_LuV = GregtechItemList.Conveyor_Module_LuV.get(1);
		CI.conveyorModule_ZPM = GregtechItemList.Conveyor_Module_ZPM.get(1);
		CI.conveyorModule_UV = GregtechItemList.Conveyor_Module_UV.get(1);
		CI.conveyorModule_MAX = GregtechItemList.Conveyor_Module_MAX.get(1);
		CI.emitter_LuV = GregtechItemList.Emitter_LuV.get(1);
		CI.emitter_ZPM = GregtechItemList.Emitter_ZPM.get(1);
		CI.emitter_UV = GregtechItemList.Emitter_UV.get(1);
		CI.emitter_MAX = GregtechItemList.Emitter_MAX.get(1);
		CI.fieldGenerator_LuV = GregtechItemList.Field_Generator_LuV.get(1);
		CI.fieldGenerator_ZPM = GregtechItemList.Field_Generator_ZPM.get(1);
		CI.fieldGenerator_UV = GregtechItemList.Field_Generator_UV.get(1);
		CI.fieldGenerator_MAX = GregtechItemList.Field_Generator_MAX.get(1);
		CI.sensor_LuV = GregtechItemList.Sensor_LuV.get(1);
		CI.sensor_ZPM = GregtechItemList.Sensor_ZPM.get(1);
		CI.sensor_UV = GregtechItemList.Sensor_UV.get(1);
		CI.sensor_MAX = GregtechItemList.Sensor_MAX.get(1);

		registerComponent_ULV();
	}

	private static void registerGTNHComponents(){
		//Machine Components
		CI.electricMotor_LuV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32606, 1);
		CI.electricMotor_ZPM = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32607, 1);
		CI.electricMotor_UV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32608, 1);

		CI.electricPump_LuV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32615, 1);
		CI.electricPump_ZPM = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32616, 1);
		CI.electricPump_UV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32617, 1);

		CI.electricPiston_LuV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32645, 1);
		CI.electricPiston_ZPM = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32646, 1);
		CI.electricPiston_UV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32647, 1);

		CI.robotArm_LuV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32655, 1);
		CI.robotArm_ZPM = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32656, 1);
		CI.robotArm_UV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32657, 1);

		CI.conveyorModule_LuV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32635, 1);
		CI.conveyorModule_ZPM = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32636, 1);
		CI.conveyorModule_UV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32637, 1);

		CI.emitter_LuV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32685, 1);
		CI.emitter_ZPM = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32686, 1);
		CI.emitter_UV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32687, 1);

		CI.fieldGenerator_LuV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32675, 1);
		CI.fieldGenerator_ZPM = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32676, 1);
		CI.fieldGenerator_UV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32677, 1);

		CI.sensor_LuV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32695, 1);
		CI.sensor_ZPM = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32696, 1);
		CI.sensor_UV = ItemUtils.simpleMetaStack("gregtech:gt.metaitem.01", 32697, 1);

		registerComponent_ULV();
		registerComponent_MAX();
	}

	private static boolean registerComponent_ULV(){

		CI.electricMotor_ULV = GregtechItemList.Electric_Motor_ULV.get(1);
		CI.electricPump_ULV = GregtechItemList.Electric_Pump_ULV.get(1);
		CI.electricPiston_ULV = GregtechItemList.Electric_Piston_ULV.get(1);
		CI.robotArm_ULV = GregtechItemList.Robot_Arm_ULV.get(1);
		CI.conveyorModule_ULV = GregtechItemList.Conveyor_Module_ULV.get(1);
		CI.emitter_ULV = GregtechItemList.Emitter_ULV.get(1);
		CI.fieldGenerator_ULV = GregtechItemList.Field_Generator_ULV.get(1);
		CI.sensor_ULV = GregtechItemList.Sensor_ULV.get(1);
		return true;
	}

	private static boolean registerComponent_MAX(){
		//Max Tier Components Blood Never added... Useless, lol.
		CI.electricMotor_MAX = GregtechItemList.Electric_Motor_MAX.get(1);
		CI.electricPump_MAX = GregtechItemList.Electric_Pump_MAX.get(1);
		CI.electricPiston_MAX = GregtechItemList.Electric_Piston_MAX.get(1);
		CI.robotArm_MAX = GregtechItemList.Robot_Arm_MAX.get(1);
		CI.conveyorModule_MAX = GregtechItemList.Conveyor_Module_MAX.get(1);
		CI.emitter_MAX = GregtechItemList.Emitter_MAX.get(1);
		CI.fieldGenerator_MAX = GregtechItemList.Field_Generator_MAX.get(1);
		CI.sensor_MAX = GregtechItemList.Sensor_MAX.get(1);
		return true;
	}

}