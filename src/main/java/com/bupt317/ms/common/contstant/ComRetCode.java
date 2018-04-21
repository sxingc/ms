package com.bupt317.ms.common.contstant;

/**
 * Created by Chen on 2018/4/18.
 */
public class ComRetCode {
    /*接口返回属性*/
    public static final String RET_CODE = "retCode";
    public static final String RET_DESC = "retDesc";
    public static final String RET = "ret";

    /**
     * 200
     * 成功
     */
    public static final int SUCCESS = 200;
    public static final String SUCCESS_DESC = "操作成功";

    /**
     * 401
     * 参数（除用于安全外的其它参数）错误。
     */
    public static final int WRONG_PARAMETER = 401;
    public static final String WRONG_PARAMETER_DESC = "请求参数错误，请稍后重试";

    /**
     * 500  系统。
     */
    public static final int FAIL = 500;
    public static final String FAIL_DESC = "内部错误，请稍后再试！";


    public static String message(int value) {
        String msg = FAIL_DESC;
        switch (value) {
            case SUCCESS:
                msg = SUCCESS_DESC;
                break;

            case WRONG_PARAMETER:
                msg = WRONG_PARAMETER_DESC;
                break;

            case FAIL:
                msg = FAIL_DESC;
                break;

            default:
                msg = FAIL_DESC;
        }
        return msg;
    }


}
