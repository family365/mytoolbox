package cn.creditease.toolbox.dto;

import java.io.Serializable;

public class AccountQueryRequestDto implements Serializable {
	private String merchantCode;
	private String userId;
	private String assetTypes;
	
	public String getMerchantCode() {
		return merchantCode;
	}
	
	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getAssetTypes() {
		return assetTypes;
	}
	
	public void setAssetTypes(String assetTypes) {
		this.assetTypes = assetTypes;
	}
}
