package jp.co.sunarch.mobilesuitDatabase.port.adapter.web.model.result.mobilesuit;

import java.util.List;

import jp.co.sunarch.mobilesuitDatabase.port.adapter.web.model.result.equipment.EquipmentArmsResult;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class MobileSuitDetailResult {
	private String msId;
	private String modelNumber;
	private String msName;
	private String msUrl;
	private String headHeight;
	private String overallHeight;
	private String weight;
	private String totalWeight;
	private String powerSource;
	private String material;
	private String effectiveSensorRadius;
	private String generatorOutput;
	private String totalThrustersOutput;
	private String msOverview;
	private String action;
	private String insertDate;
	private String updateDate;
	private String version;
	
	private List<EquipmentArmsResult> equipmentArmsResultList;

}
