package com.example.ex_xuxiaopeng002.myapplication.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;

import com.example.ex_xuxiaopeng002.myapplication.R;
import com.example.ex_xuxiaopeng002.myapplication.activity.login.GestureLoginActivity;
import com.example.ex_xuxiaopeng002.myapplication.activity.login.SetGestureActivity;
import com.example.ex_xuxiaopeng002.myapplication.util.SpUtil;

public class WelcomeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               String gesture = (String) SpUtil.mCommonSp().get("Gesture", "");
                if (TextUtils.isEmpty(gesture)) {
                    startActivity(new Intent(WelcomeActivity.this, SetGestureActivity.class));
                }else {
                    startActivity(new Intent(WelcomeActivity.this, GestureLoginActivity.class));
                }
                finish();
            }
        }, 1000);
    }
}
