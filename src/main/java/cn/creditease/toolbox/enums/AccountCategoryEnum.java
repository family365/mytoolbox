package cn.creditease.toolbox.enums;

public enum AccountCategoryEnum {
    USER_ACCOUNT(1, "用户"),
    MERCHANT_ACCOUNT(2, "商户");
    
    private Integer code;
    private String desc;

    private AccountCategoryEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static AccountCategoryEnum toEnum(Integer code) {
        for (AccountCategoryEnum category : AccountCategoryEnum.values()) {
            if (category.getCode().equals(code)) {
                return category;
            }
        }
        return null;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
