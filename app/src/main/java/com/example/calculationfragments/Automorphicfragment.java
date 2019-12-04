package com.example.calculationfragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Automorphicfragment extends Fragment implements View.OnClickListener {

private EditText etnum;
private TextView tvautmorphic;
private Button btncheck;

    public Automorphicfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_automorphicfragment, container, false);
        etnum=view.findViewById(R.id.etnum);
        btncheck=view.findViewById(R.id.btncheck);
        tvautmorphic=view.findViewById(R.id.tvautomorphic);

        btncheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    return  view;
    }


    @Override
    public void onClick(View v) {

        int a,square,counter=1;
        int n=Integer.parseInt(etnum.getText().toString());

        a=n;
        square=n*n;
        while (n!=0)
        {
            counter=counter*10;
            n=n/10;
        }
if(square%counter==a){

tvautmorphic.setText("it is automorphic");

}
else{
    tvautmorphic.setText("it is not automorphic");
        }

    }
}
