package cn.creditease.toolbox.common;

import java.io.Serializable;

public interface Entity<T extends Serializable> extends Serializable {
	public T getId();
	
	public void setId(T id);
}
