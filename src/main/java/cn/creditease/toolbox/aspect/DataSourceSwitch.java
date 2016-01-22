package cn.creditease.toolbox.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import cn.creditease.toolbox.datasource.DataSourceHolder;

@Component
@Aspect
public class DataSourceSwitch {
	private static final String AccountDB = "accountDB";
	private static final String PointDB = "pointDB";
	private static final String TradeDB = "tradeDB";
	
	@Before("execution(* cn.creditease.toolbox.account.dao..*.*(..))")
	public void setAccountDataSource() {
		DataSourceHolder.setDataSource(AccountDB);
	}
}
