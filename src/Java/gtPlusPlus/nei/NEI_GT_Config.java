package gtPlusPlus.nei;

import codechicken.nei.api.IConfigureNEI;
import gregtech.api.util.CustomRecipeMap;

public class NEI_GT_Config
implements IConfigureNEI {
	public static boolean sIsAdded = true;

	@Override
	public void loadConfig() {
		sIsAdded = false;
		for (final CustomRecipeMap tMap : gregtech.api.util.CustomRecipeMap.sMappings) {
			if (tMap.mNEIAllowed) {
				new GT_NEI_DefaultHandler(tMap);
			}
		}
		sIsAdded = true;
	}

	@Override
	public String getName() {
		return "GT++ NEI Plugin";
	}

	@Override
	public String getVersion() {
		return "(1.01)";
	}
}
