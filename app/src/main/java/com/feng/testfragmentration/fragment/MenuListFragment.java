package com.feng.testfragmentration.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.feng.testfragmentration.R;

/**
 * Package Name: com.feng.testfragmentration.fragment
 *
 * @author ysr
 * @Email yfeng1023@gmail.com
 * @Description: 菜单栏目
 * @Create Date: 2018年05月11日 14:01
 */
public class MenuListFragment extends Fragment {
    private RecyclerView mRecy;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_menu, container, false);
        initView(view);
        return view;
    }
    private void initView(View view) {
        mRecy = (RecyclerView) view.findViewById(R.id.recy);
    }


}
