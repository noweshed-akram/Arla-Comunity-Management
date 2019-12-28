package com.example.beatniktechnology.arla.Fragments;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.example.beatniktechnology.arla.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Articles extends Fragment {

    static Articles instance;
    LinearLayout articleFirstPartLY;
    Button articleCloseBT;
    Button articleShowBT;
    TextView textOne;
    TextView textViewOne, textViewTwo, textViewThree, textViewFour, textViewFive, textViewSix, textViewSeven, textViewEight, textViewNine;


    public Articles() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        //getActivity().setTitle("Article");
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_articles, container, false);

//        articleFirstPartLY = view.findViewById(R.id.articleFirstPartLY);
//        articleCloseBT = view.findViewById(R.id.articleCloseBT);
//        articleShowBT = view.findViewById(R.id.articleShowBT);

//        articleFirstPartLY.setVisibility(LinearLayout.VISIBLE);
//        articleShowBT.setVisibility(View.GONE);
//        articleCloseBT.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                articleFirstPartLY.setVisibility(LinearLayout.GONE);
//                articleShowBT.setVisibility(View.VISIBLE);
//            }
//        });
//
//        articleShowBT.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                articleFirstPartLY.setVisibility(LinearLayout.VISIBLE);
//                articleShowBT.setVisibility(View.GONE);
//            }
//        });


//        textOne = view.findViewById(R.id.textOne);
//        String text = textOne.getText().toString();
//        textOne.setMovementMethod(LinkMovementMethod.getInstance());

        textViewOne = view.findViewById(R.id.textOne);

        textViewOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.usaid.gov/what-we-do/global-health/nutrition/countries/bangladesh-nutrition-profile"));
                startActivity(intent);
            } });

        textViewTwo = view.findViewById(R.id.textViewTwo);

        textViewTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://data.unicef.org/topic/nutrition/malnutrition/"));
                startActivity(intent);
            } });

        textViewThree = view.findViewById(R.id.textViewThree);

        textViewThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://data.unicef.org/topic/nutrition/infant-and-young-child-feeding/"));
                startActivity(intent);
            } });

        textViewFour = view.findViewById(R.id.textViewFour);

        textViewFour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.verywellfamily.com/breast-milk-definition-stages-431549"));
                startActivity(intent);
            } });


        textViewFive = view.findViewById(R.id.textViewFive);

        textViewFive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.stopuncs.org/Content/DataGraph/Cost%20estimates%20of%20C-sections%20in%20Bangladesh_for%20website%20PDF.pdf"));
                startActivity(intent);
            } });


        textViewSix = view.findViewById(R.id.textViewSix);

        textViewSix.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.vbac.com/how-does-a-cesarean-affect-the-baby/"));
                startActivity(intent);
            } });

        textViewSeven = view.findViewById(R.id.textViewSeven);

        textViewSeven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.jimmunol.org/content/jimmunol/early/2014/06/19/jimmunol.1400085.full.pdf"));
                startActivity(intent);
            } });

        return view;
    }

    public static Articles getInstance() {
        if (instance == null)
            instance = new Articles();
        return instance;
    }

}
