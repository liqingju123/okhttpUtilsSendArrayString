package com.li.qingju.okhttputilsparameters;

import com.zhy.http.okhttp.builder.PostFileBuilder;
import com.zhy.http.okhttp.builder.PostFormBuilder;
import com.zhy.http.okhttp.request.PostFormRequest;
import com.zhy.http.okhttp.request.RequestCall;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by liqingju on 16/8/30.
 */
public class PostArrayStringBuilder extends PostFormBuilder {

    public PostArrayStringBuilder(Map<String, String> params) {
        this.params = params;
    }

    @Override
    public RequestCall build() {
        return new PostArrayFormRequest(url, tag, params, headers).build();
    }


}
