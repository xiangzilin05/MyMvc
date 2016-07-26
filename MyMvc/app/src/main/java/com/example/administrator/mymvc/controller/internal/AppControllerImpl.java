package com.example.administrator.mymvc.controller.internal;

import com.example.administrator.mymvc.controller.AppController;
import com.shipdream.lib.android.mvc.controller.internal.BaseControllerImpl;
import com.shipdream.lib.android.mvc.manager.NavigationManager;

import javax.inject.Inject;

/**
 * Created by Administrator on 2016/7/26.
 */
public class AppControllerImpl extends BaseControllerImpl implements AppController {
    @Inject
    private NavigationManager navigationManager;

    @Override
    public void print() {

    }

    @Override
    public void startApp(Object sender) {
        navigationManager.navigate(sender).to("LocationA");
    }

    @Override
    public Class modelType() {
        return null;
    }
}
