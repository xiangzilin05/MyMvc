package com.example.administrator.mymvc.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.example.administrator.mymvc.R;
import com.example.administrator.mymvc.view.fragment.ContainerFragment;
import com.example.administrator.mymvc.view.fragment.LocationA;
import com.shipdream.lib.android.mvc.view.MvcActivity;
import com.shipdream.lib.android.mvc.view.MvcFragment;

public class MainActivity extends MvcActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected Class<? extends MvcFragment> mapNavigationFragment(String locationId) {
        switch (locationId){
            case "LocationA":
                return LocationA.class;
//            case "LocationB":
//                return LocationB.class;
            default:
                return null;
        }
    }

    @Override
    protected Class<? extends DelegateFragment> getDelegateFragmentClass() {
        return ContainerFragment.class;
    }


}
