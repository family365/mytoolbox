package cn.creditease.toolbox.datasource;

public class DataSourceHolder {
	private static final ThreadLocal<String> dataSourceKeys = new ThreadLocal<String>();
	
	public static void setDataSource(String key) {
		dataSourceKeys.set(key);
	}
	
	public static String getDataSource() {
		return dataSourceKeys.get();
	}
}
