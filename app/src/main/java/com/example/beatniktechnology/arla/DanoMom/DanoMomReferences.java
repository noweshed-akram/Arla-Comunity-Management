package com.example.beatniktechnology.arla.DanoMom;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.beatniktechnology.arla.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DanoMomReferences extends Fragment {

    static DanoMomReferences instance;
    private  TextView textViewOne, textViewTwo, textViewThree, textViewFour, textViewFive, textViewSix, textViewSeven, textViewEight, textViewNine;


    public DanoMomReferences() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dano_mom_references, container, false);

        textViewOne = view.findViewById(R.id.textOne);

        textViewOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.fantaproject.org/sites/default/files/download/Bangladesh-Nutrition-Profile-Mar2014.pdf"));
                startActivity(intent);
            } });

        textViewTwo = view.findViewById(R.id.textViewTwo);

        textViewTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.searo.who.int/entity/health_situation_trends/countryprofile_ban.pdf?ua=1"));
                startActivity(intent);
            } });

        textViewThree = view.findViewById(R.id.textViewThree);

        textViewThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.healtheries.co.nz/articles/detail/rdi-tables-for-pregnancy"));
                startActivity(intent);
            } });

        textViewFour = view.findViewById(R.id.textViewFour);

        textViewFour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.whattoexpect.com/pregnancy/fetal-development/fetal-brain-nervous-system/"));
                startActivity(intent);
            } });


        textViewFive = view.findViewById(R.id.textViewFive);

        textViewFive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.healthline.com/nutrition/13-foods-to-eat-when-pregnant"));
                startActivity(intent);
            } });


        textViewSix = view.findViewById(R.id.textViewSix);

        textViewSix.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://americanpregnancy.org/first-year-of-life/whats-in-breastmilk/"));
                startActivity(intent);
            } });

        textViewSeven = view.findViewById(R.id.textViewSeven);

        textViewSeven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.healthline.com/health/parenting/lactation-boosting-recipes#3"));
                startActivity(intent);
            } });

        textViewEight = view.findViewById(R.id.textViewEight);

        textViewEight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://bmjopen.bmj.com/content/7/8/e015393"));
                startActivity(intent);
            } });

        textViewNine = view.findViewById(R.id.textViewNine);

        textViewNine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://bmjopen.bmj.com/content/7/8/e015393"));
                startActivity(intent);
            } });

        return view;

    }


    public static DanoMomReferences getInstance() {
        if (instance == null)
            instance = new DanoMomReferences();
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
