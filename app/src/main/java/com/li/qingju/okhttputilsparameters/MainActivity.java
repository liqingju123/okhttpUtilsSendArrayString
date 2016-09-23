package com.li.qingju.okhttputilsparameters;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.zhy.http.okhttp.callback.Callback;

import java.util.HashMap;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Map<String,String> paramsMap = new HashMap<>();
        //传递一个数组,数组一定要 加 [1] [2] [3]  进行区分
        paramsMap.put("key[0]","value[0]");
        paramsMap.put("key[1]","value[1]");
        paramsMap.put("key[2]","value[2]");
        paramsMap.put("key[3]","value[3]");
        paramsMap.put("key[4]","value[4]");
        //正常的单个参数传递
        paramsMap.put("other_key", "other_value");
//        send();
        //跟以前的使用没有任何区别
        OkHttpUtilsByArray.postArrayString(paramsMap);  //正常的网络请求了


    }



}
