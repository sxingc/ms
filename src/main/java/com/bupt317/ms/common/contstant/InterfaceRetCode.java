package com.bupt317.ms.common.contstant;

import java.util.Map;

public class InterfaceRetCode {

	public static void setAppCodeDesc(Map resultMap, int key) {
		String desc = ComRetCode.message(key);
		if (desc == null) {
			desc = "This value has no definition.";
		}
		resultMap.put("retCode", String.valueOf(key));
		resultMap.put("retDesc", desc);
	}

}
