package cn.creditease.toolbox.entity;

import cn.creditease.toolbox.common.Entity;
import cn.creditease.toolbox.common.Money;
import cn.creditease.toolbox.enums.AccountCategoryEnum;
import cn.creditease.toolbox.enums.AssetTypeEnum;

public class Account implements Entity<Long>{
    private Long id;
    private String bizCode;
    private String merchantCode;
    private String accountName;
    private AssetTypeEnum assetType;
    private AccountCategoryEnum accountCategory;
    private Money balance;
    private Money validBalance;
    private Money frozenBalance;
    private String userId;
    private String curId;
	
	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id=id;
		
	}

	public String getBizCode() {
		return bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getMerchantCode() {
		return merchantCode;
	}

	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public AssetTypeEnum getAssetType() {
		return assetType;
	}

	public void setAssetType(AssetTypeEnum assetType) {
		this.assetType = assetType;
	}

	public AccountCategoryEnum getAccountCategory() {
		return accountCategory;
	}

	public void setAccountCategory(AccountCategoryEnum accountCategory) {
		this.accountCategory = accountCategory;
	}

	public Money getBalance() {
		return balance;
	}

	public void setBalance(Money balance) {
		this.balance = balance;
	}

	public Money getValidBalance() {
		return validBalance;
	}

	public void setValidBalance(Money validBalance) {
		this.validBalance = validBalance;
	}

	public Money getFrozenBalance() {
		return frozenBalance;
	}

	public void setFrozenBalance(Money frozenBalance) {
		this.frozenBalance = frozenBalance;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCurId() {
		return curId;
	}

	public void setCurId(String curId) {
		this.curId = curId;
	}
	
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{\"id\":\"").append(id)
                .append("\",\"bizCode\":\"").append(bizCode).append("\",\"merchantCode\":\"").append(merchantCode)
                .append("\",\"accountName\":\"").append(accountName).append("\",\"assetType\":\"").append(assetType)
                .append("\",\"accountCategory\":\"").append(accountCategory).append("\",\"accountDesc\":\"")
                .append(balance).append("\",\"validBalance\":\"")
                .append(validBalance).append("\",\"frozenBalance\":\"").append(frozenBalance)
                .append("\",\"userId\":\"").append(userId)
                .append("\",\"curId\":\"").append(curId)
                .append("\"} ");
        return builder.toString();
    }

}
