package cn.creditease.toolbox.account.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.creditease.toolbox.account.dao.AccountDao;
import cn.creditease.toolbox.common.DefaultGenericDao;
import cn.creditease.toolbox.entity.Account;
import cn.creditease.toolbox.enums.AssetTypeEnum;

@Repository
public class AccountDaoImpl extends DefaultGenericDao<Account> implements AccountDao {
	private static final String QueryAccount = "queryAccount";
	private static final String UpdateBalance = "updateBalance";
	
	@Override
	public List<Account> queryAccount(String merchantcode, String userId,
			List<AssetTypeEnum> selectedAssetTypes) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("merchantCode", merchantcode);
		param.put("userId", userId);
		param.put("selectedAssetTypes", selectedAssetTypes);
		return super.query(QueryAccount, param);
	}
	
}
