package com.dy.pushapp.base;

import android.os.Bundle;

import com.dy.fastframework.activity.BaseActivity;
import com.umeng.message.PushAgent;

public abstract class MyBaseActivity extends BaseActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PushAgent.getInstance(this).onAppStart();
    }
}
