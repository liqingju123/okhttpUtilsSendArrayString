package com.li.qingju.okhttputilsparameters;

import com.zhy.http.okhttp.OkHttpUtils;

import java.util.Map;

import okhttp3.OkHttpClient;

/**
 * Created by liqingju on 16/8/30.
 */
public class OkHttpUtilsByArray extends OkHttpUtils {
    public OkHttpUtilsByArray(OkHttpClient okHttpClient) {
        super(okHttpClient);
    }

    public static PostArrayStringBuilder postArrayString(Map<String, String> params) {
        return new PostArrayStringBuilder(params);
    }

}
