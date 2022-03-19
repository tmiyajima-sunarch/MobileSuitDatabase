package jp.co.sunarch.mobilesuitDatabase.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MobileSuitEquipmentEntity {
	private String equipmentId;
	private String msId;
	private String armedId;
	private int numberEquipment;
}
