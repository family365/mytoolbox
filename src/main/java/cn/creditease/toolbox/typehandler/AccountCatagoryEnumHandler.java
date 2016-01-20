package cn.creditease.toolbox.typehandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import cn.creditease.toolbox.enums.AccountCategoryEnum;

public class AccountCatagoryEnumHandler extends BaseTypeHandler<AccountCategoryEnum> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i,
			AccountCategoryEnum parameter, JdbcType jdbcType)
			throws SQLException {
		Integer categoryCode = parameter.getCode();
		ps.setInt(i, categoryCode);
	}

	@Override
	public AccountCategoryEnum getNullableResult(ResultSet rs, String columnName)
			throws SQLException {
		Integer categoryCode = rs.getInt(columnName);
		return AccountCategoryEnum.toEnum(categoryCode);
	}

	@Override
	public AccountCategoryEnum getNullableResult(ResultSet rs, int columnIndex)
			throws SQLException {
		Integer categoryCode = rs.getInt(columnIndex);
		return AccountCategoryEnum.toEnum(categoryCode);
	}

	@Override
	public AccountCategoryEnum getNullableResult(CallableStatement cs,
			int columnIndex) throws SQLException {
		Integer categoryCode = cs.getInt(columnIndex);
		return AccountCategoryEnum.toEnum(categoryCode);
	}

}
