package cn.creditease.toolbox.dto;

import java.io.Serializable;

public class AccountQueryRequestDto implements Serializable {
	private String merchantCode;
	private String userId;
	private String assetType;
	
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
	
	public String getAssetType() {
		return assetType;
	}
	
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}
	
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("{").append("\"merchantCode\":").append(merchantCode)
					.append(", \"userId\":").append(userId)
					.append(",\"assetType\":").append(assetType)
					.append("}");
		return stringBuilder.toString();
	}
}
