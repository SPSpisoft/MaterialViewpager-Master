package com.spisoft.materialviewpager_master.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;

import com.github.spisoft.materialviewpager.MaterialViewPagerHelper;
import com.spisoft.materialviewpager_master.R;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by florentchampigny on 24/04/15.
 */
public class ScrollFragment extends Fragment {

    @BindView(R.id.scrollView)
    NestedScrollView mScrollView;

    public static ScrollFragment newInstance() {
        return new ScrollFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_scroll, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        MaterialViewPagerHelper.registerScrollView(getActivity(), mScrollView);
    }
}
