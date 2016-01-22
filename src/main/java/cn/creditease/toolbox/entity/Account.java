package cn.creditease.toolbox.entity;

import java.math.BigDecimal;

import cn.creditease.toolbox.common.Entity;
import cn.creditease.toolbox.common.Money;
import cn.creditease.toolbox.enums.AccountCategoryEnum;
import cn.creditease.toolbox.enums.AssetTypeEnum;

public class Account implements Entity<Long>{
    private Long id;
    private String merchantCode;
    private String userId;
    private AssetTypeEnum assetType;
    private AccountCategoryEnum accountCategory;
    private BigDecimal balance;
    private BigDecimal validBalance;
    private BigDecimal frozenBalance;
	
	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id=id;
		
	}

	public String getMerchantCode() {
		return merchantCode;
	}

	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
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

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public BigDecimal getValidBalance() {
		return validBalance;
	}

	public void setValidBalance(BigDecimal validBalance) {
		this.validBalance = validBalance;
	}

	public BigDecimal getFrozenBalance() {
		return frozenBalance;
	}

	public void setFrozenBalance(BigDecimal frozenBalance) {
		this.frozenBalance = frozenBalance;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{\"id\":\"").append(id)
                .append("\",\"merchantCode\":\"").append(merchantCode)
                .append("\",\"assetType\":\"").append(assetType)
                .append("\",\"accountCategory\":\"").append(accountCategory).append("\",\"accountDesc\":\"")
                .append(balance).append("\",\"validBalance\":\"")
                .append(validBalance).append("\",\"frozenBalance\":\"").append(frozenBalance)
                .append("\",\"userId\":\"").append(userId)
                .append("\"} ");
        return builder.toString();
    }

}
