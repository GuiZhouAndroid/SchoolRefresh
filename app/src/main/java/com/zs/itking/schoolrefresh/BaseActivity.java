package com.zs.itking.schoolrefresh;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * created by on 2021/8/16
 * 描述：
 *
 * @author ZSAndroid
 * @create 2021-08-16-1:30
 */
public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    public void setTheme(){
        //设置主题
        StatusBarUtils.setThemeColor(BaseActivity.this, R.color.teal_700);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

}
