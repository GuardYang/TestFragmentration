package com.feng.testfragmentration.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.feng.testfragmentration.R;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Package Name: com.feng.testfragmentration.fragment
 *
 * @author ysr
 * @Email yfeng1023@gmail.com
 * @Description: TODO
 * @Create Date: 2018年05月11日 12:54
 */
public class ShopFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shop, container, false);
        initView(view, savedInstanceState);
        return view;
    }

    private void initView(View view, Bundle savedInstanceState) {
//        if (findChildFragment(MenuListFragment.class) == null) {
//            ArrayList<String> listMenus = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.array_menu)));
//            MenuListFragment menuListFragment = MenuListFragment.newInstance(listMenus);
//            loadRootFragment(R.id.fl_list_container, menuListFragment);
//            // false:  不加入回退栈;  false: 不显示动画
//            loadRootFragment(R.id.fl_content_container, ContentFragment.newInstance(listMenus.get(0)), false, false);
//        }
    }
}
