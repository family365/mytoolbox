package cn.creditease.toolbox.dto;

import java.io.Serializable;
import java.util.List;

import cn.creditease.toolbox.entity.Account;
import cn.creditease.toolbox.enums.AssetTypeEnum;

public class AccountQueryResponseDto implements Serializable {
	private String merchantCode;
	private String userId;
	private List<AssetTypeEnum> assetTypeList;
	private List<Account> accountList;

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

	public List<AssetTypeEnum> getAssetTypeList() {
		return assetTypeList;
	}

	public void setAssetTypeList(List<AssetTypeEnum> assetTypeList) {
		this.assetTypeList = assetTypeList;
	}

	public List<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{").append("\"merchantCode\":").append(merchantCode)
				.append(",").append("\"userId\":").append(userId).append(",")
				.append("\"assetType\":[");

		if (assetTypeList != null) {
			int index = 0;
			for (AssetTypeEnum each : assetTypeList) {
				if (index > 0) {
					builder.append(", ").append(each.getDesc());
				} else {
					builder.append(each.getDesc());
				}

				index++;
			}
		}

		builder.append("], ").append("\"account\":[");
		if (accountList != null) {
			int index = 0;
			for (Account each : accountList) {
				if (index > 0) {
					builder.append(", ").append(each.toString());
				} else {
					builder.append(each.toString());
				}
			}
		}

		builder.append("]");
		builder.append("}");

		return builder.toString();
	}
}
