package cn.creditease.toolbox.common;

public interface EntityVersion<IDClass extends java.io.Serializable> extends Entity<IDClass> {

	/**
	 * Speicify the version of the record.
	 * @param version
	 */
	public void setVersion(Long version);
	
	/**
	 * Get current version of the record.
	 * @return version
	 */
	public Long getVersion();
}
