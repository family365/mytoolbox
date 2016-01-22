package cn.creditease.toolbox.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.creditease.toolbox.biz.AccountBiz;
import cn.creditease.toolbox.common.ResponseDto;
import cn.creditease.toolbox.dto.AccountQueryRequestDto;
import cn.creditease.toolbox.dto.AccountQueryResponseDto;

@Controller
@RequestMapping("/account")
public class AccountController {
	private static final Logger logger = LoggerFactory.getLogger(AccountController.class);
	
	@Autowired
	private AccountBiz accountBiz;
	
	@RequestMapping(value = "/1.do", method = RequestMethod.GET)
	@ResponseBody
	public String queryAccount() {
		System.out.println("ouot");
		return "response";
	}
	
	@RequestMapping(value = "/query.do", method = RequestMethod.GET)
	@ResponseBody
	public ResponseDto<AccountQueryResponseDto> queryAccount(AccountQueryRequestDto request) {
		logger.info(request.toString());
		ResponseDto<AccountQueryResponseDto> response = new ResponseDto<AccountQueryResponseDto>();
		try {
			checkParameter(request);
			AccountQueryResponseDto data = accountBiz.queryAccount(request);
			if (data.getAccountList() == null || data.getAccountList().size() < 1) {
				response.error("No matched result found");
			} else {
				response.succ(data);
			}
		} catch(Exception ex) {
			response.error(ex.getMessage());
		}
		
		return response;
	}
	
	private void checkParameter(AccountQueryRequestDto request) {
		if (StringUtils.isEmpty(request.getMerchantCode())) {
			throw new RuntimeException("merchantCode is required");
		}
		
		if (StringUtils.isEmpty(request.getUserId())) {
			throw new RuntimeException("userId is required");
		}
	}

}
