package cn.creditease.toolbox.account.dao;

import java.util.List;

import cn.creditease.toolbox.common.GenericDao;
import cn.creditease.toolbox.entity.Account;
import cn.creditease.toolbox.enums.AssetTypeEnum;

public interface AccountDao extends GenericDao<Account>{
	List<Account> queryAccount(String merchantcode, String userId, List<AssetTypeEnum> selectedAssetTypes);
}
