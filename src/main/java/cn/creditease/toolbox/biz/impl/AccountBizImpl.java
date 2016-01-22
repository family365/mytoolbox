package cn.creditease.toolbox.biz.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import cn.creditease.toolbox.biz.AccountBiz;
import cn.creditease.toolbox.dto.AccountQueryRequestDto;
import cn.creditease.toolbox.dto.AccountQueryResponseDto;
import cn.creditease.toolbox.entity.Account;
import cn.creditease.toolbox.enums.AssetTypeEnum;
import cn.creditease.toolbox.service.AccountService;

@Component
public class AccountBizImpl implements AccountBiz {

	@Autowired
	private AccountService accountService;
	
	@Override
	public AccountQueryResponseDto queryAccount(AccountQueryRequestDto request) {
		AccountQueryResponseDto response = new AccountQueryResponseDto();
		
		String assetTypes = request.getAssetType();
		List<AssetTypeEnum> selectedAssetList = null;
		if (!StringUtils.isEmpty(assetTypes)) {
			selectedAssetList = new ArrayList<AssetTypeEnum>();
			String[] strArray = assetTypes.split(",");
			for (String each : strArray) {
				AssetTypeEnum instance = AssetTypeEnum.toEnum(Integer.valueOf(each));
				selectedAssetList.add(instance);
			}
		}
		
		List<Account> accountList = accountService.queryAccount(request.getMerchantCode(), request.getUserId(), selectedAssetList);
		response.setMerchantCode(request.getMerchantCode());
		response.setUserId(request.getUserId());
		response.setAssetTypeList(selectedAssetList);
		response.setAccountList(accountList);
		return response;
	}

}
