package cn.creditease.toolbox.service;

import java.util.List;

import cn.creditease.toolbox.entity.Account;
import cn.creditease.toolbox.enums.AssetTypeEnum;

public interface AccountService {
	List<Account> queryAccount(String merchantcode, String userId, List<AssetTypeEnum> selectedAssetTypes);
}
