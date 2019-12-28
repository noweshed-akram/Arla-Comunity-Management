package com.example.beatniktechnology.arla.Fragments;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;


import com.example.beatniktechnology.arla.R;
import com.example.beatniktechnology.arla.WheyCaseinFragments.WheyCaseinOne;
import com.example.beatniktechnology.arla.WheyCaseinFragments.WheyCaseinTwo;
import com.example.beatniktechnology.arla.WheyCaseinFragments.WheyCaseinViewPagerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class WheyCasein extends Fragment {

    static WheyCasein instance;
//    LinearLayout wheyCaseinFirstLY;
//    Button wheyCaseinCloseBT;


    public WheyCasein() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_whey_casein, container, false);

        //getActivity().setTitle("Whey Casein");

//        TabLayout tabLayout;
        ViewPager viewPager;

//        viewPager = view.findViewById(R.id.wheyCaseinViewPager);
//        tabLayout =  view.findViewById(R.id.wheyCaseinTabLayout);
//        tabLayout.setupWithViewPager(viewPager);

//        WheyCaseinViewPagerAdapter adapter = new WheyCaseinViewPagerAdapter(getChildFragmentManager());
//        adapter.addFragment(WheyCaseinOne.getInstance(), "Whey Casein One");
//        adapter.addFragment(WheyCaseinTwo.getInstance(), "Whey Casein Two");

//        viewPager.setSaveFromParentEnabled(false);
//
//        viewPager.setAdapter(adapter);

//        wheyCaseinFirstLY = view.findViewById(R.id.wheyCaseinFirstLY);
//        wheyCaseinCloseBT = view.findViewById(R.id.wheyCaseinCloseBT);
//
//        wheyCaseinFirstLY.setVisibility(LinearLayout.VISIBLE);
//        wheyCaseinCloseBT.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                wheyCaseinFirstLY.setVisibility(LinearLayout.GONE);
//
//            }
//        });

        return view;
    }

    public static WheyCasein getInstance() {
        if (instance == null)
            instance = new WheyCasein();
        return instance;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            // Refresh your fragment here
            getFragmentManager().beginTransaction().detach(this).attach(this).commit();
        }
    }

}
