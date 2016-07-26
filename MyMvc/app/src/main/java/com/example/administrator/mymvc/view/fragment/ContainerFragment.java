package com.example.administrator.mymvc.view.fragment;

import com.example.administrator.mymvc.controller.AppController;
import com.shipdream.lib.android.mvc.view.MvcActivity;

import javax.inject.Inject;

/**
 * Created by Administrator on 2016/7/26.
 */
public class ContainerFragment extends MvcActivity.DelegateFragment {

    @Inject
    private AppController appController;

    @Override
    protected void onStartUp() {
        appController.startApp(this);
    }
}
