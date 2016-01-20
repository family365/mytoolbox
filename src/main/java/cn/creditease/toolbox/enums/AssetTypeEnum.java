package cn.creditease.toolbox.enums;

public enum AssetTypeEnum {
    BALANCE_ASSET(1, "余额资产"),
    POINT_ASSET(3, "积分资产")
    ;

    private final Integer code;
    private final String desc;

    private AssetTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static AssetTypeEnum toEnum(Integer code) {
        for (AssetTypeEnum type : AssetTypeEnum.values()) {
            if (type.getCode().equals(code)) {
                return type;
            }
        }
        return null;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
