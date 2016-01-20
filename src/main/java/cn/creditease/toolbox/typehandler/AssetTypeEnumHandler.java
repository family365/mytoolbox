package cn.creditease.toolbox.typehandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import cn.creditease.toolbox.enums.AssetTypeEnum;

public class AssetTypeEnumHandler extends BaseTypeHandler<AssetTypeEnum> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i,
			AssetTypeEnum parameter, JdbcType jdbcType) throws SQLException {
		Integer assetTypeCode = parameter.getCode();
		ps.setInt(i, assetTypeCode);
	}

	@Override
	public AssetTypeEnum getNullableResult(ResultSet rs, String columnName)
			throws SQLException {
		Integer assetTypeCode = rs.getInt(columnName);
		return AssetTypeEnum.toEnum(assetTypeCode);
	}

	@Override
	public AssetTypeEnum getNullableResult(ResultSet rs, int columnIndex)
			throws SQLException {
		Integer assetTypeCode = rs.getInt(columnIndex);
		return AssetTypeEnum.toEnum(assetTypeCode);
	}

	@Override
	public AssetTypeEnum getNullableResult(CallableStatement cs, int columnIndex)
			throws SQLException {
		Integer assetTypeCode = cs.getInt(columnIndex);
		return AssetTypeEnum.toEnum(assetTypeCode);
	}

}
