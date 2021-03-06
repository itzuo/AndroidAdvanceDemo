package com.ldlywt.base;

import android.app.Application;

/**
 * <pre>
 *     author : wutao
 *     e-mail : ldlywt@163.com
 *     time   : 2018/08/12
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class BaseApp extends Application {

    public static boolean isLogin = true;

    private static BaseApp sMBaseApp = null;

    @Override
    public void onCreate() {
        super.onCreate();
        sMBaseApp = this;
    }

    public static BaseApp getApp() {
        return sMBaseApp;
    }
}
