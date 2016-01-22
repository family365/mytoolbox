package cn.creditease.toolbox.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.creditease.toolbox.account.dao.AccountDao;
import cn.creditease.toolbox.entity.Account;
import cn.creditease.toolbox.enums.AssetTypeEnum;
import cn.creditease.toolbox.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountDao accountDao;
	
	@Override
	public List<Account> queryAccount(String merchantcode, String userId, List<AssetTypeEnum> selectedAssetTypes) {
		return accountDao.queryAccount(merchantcode, userId, selectedAssetTypes);
	}

}
