package cn.creditease.toolbox.biz;

import cn.creditease.toolbox.dto.AccountQueryRequestDto;
import cn.creditease.toolbox.dto.AccountQueryResponseDto;

public interface AccountBiz {
	AccountQueryResponseDto queryAccount(AccountQueryRequestDto request);
}
