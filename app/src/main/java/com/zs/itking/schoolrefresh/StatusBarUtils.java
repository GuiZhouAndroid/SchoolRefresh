package com.zs.itking.schoolrefresh;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.ColorStateList;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.scwang.smartrefresh.layout.api.RefreshLayout;

/**
 * created by on 2021/8/16
 * 描述：顶部状态栏+底部导航栏——纯色
 *
 * @author ZSAndroid
 * @create 2021-08-16-1:27
 */
public class StatusBarUtils {

    /**
     * Activity
     *
     * @param activity
     * @param colorResId
     */
    public static void setWindowStatusBarColor(Activity activity, int colorResId) {
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                Window window = activity.getWindow();
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                window.setStatusBarColor(activity.getResources().getColor(colorResId));
                //底部导航栏
                window.setNavigationBarColor(activity.getResources().getColor(colorResId));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 对话框
     *
     * @param dialog
     * @param colorResId
     */
    public static void setWindowStatusBarColor(Dialog dialog, int colorResId) {
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                Window window = dialog.getWindow();
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                window.setStatusBarColor(dialog.getContext().getResources().getColor(colorResId));

                //底部导航栏
                //window.setNavigationBarColor(activity.getResources().getColor(colorResId));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 下拉刷新动画主题
     *
     * @param activity
     * @param colorPrimary
     * @param colorPrimaryDark
     * @param toolbar
     * @param collapsingToolbarLayout
     * @param appBarLayout
     * @param refreshLayout
     * @param floatingActionButton
     */
    public static void setThemeColor(Activity activity, int colorPrimary, int colorPrimaryDark, Toolbar toolbar, CollapsingToolbarLayout collapsingToolbarLayout, AppBarLayout appBarLayout, RefreshLayout refreshLayout, FloatingActionButton floatingActionButton) {
        try {
            toolbar.setBackgroundResource(colorPrimary);
            appBarLayout.setBackgroundResource(colorPrimary);
            collapsingToolbarLayout.setContentScrimResource(colorPrimary);
            refreshLayout.setPrimaryColorsId(colorPrimary, android.R.color.white);
            floatingActionButton.setBackgroundColor(ContextCompat.getColor(activity, colorPrimaryDark));
            floatingActionButton.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(activity, colorPrimaryDark)));
            if (Build.VERSION.SDK_INT >= 21) {
                activity.getWindow().setStatusBarColor(ContextCompat.getColor(activity, colorPrimaryDark));
                Window window = activity.getWindow();
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                window.setStatusBarColor(activity.getResources().getColor(colorPrimary));
                //底部导航栏
                window.setNavigationBarColor(activity.getResources().getColor(colorPrimary));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setThemeColor(Activity activity, int colorPrimary){
        if (Build.VERSION.SDK_INT >= 21) {
            activity.getWindow().setStatusBarColor(ContextCompat.getColor(activity, colorPrimary));
            Window window = activity.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(activity.getResources().getColor(colorPrimary));
            //底部导航栏
            window.setNavigationBarColor(activity.getResources().getColor(colorPrimary));
        }
    }
}
