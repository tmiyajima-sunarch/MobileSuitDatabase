package jp.co.sunarch.mobilesuitDatabase.port.adapter.database.query.arms;

public class ArmsSqlCode {

	public static String SELECT_ARMS_LIST = """
			select
			arms_id
			, arms_name
			, detail 
			from
			Arms 
			order by
			arms_name
			, arms_id
			""";

}
