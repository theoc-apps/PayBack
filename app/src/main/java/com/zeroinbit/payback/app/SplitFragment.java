package com.zeroinbit.payback.app;



import android.app.DialogFragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;


public class SplitFragment extends DialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_split, container, false);

        getDialog().setTitle("Spliting The Bill");
        //Spinner type_of_transaction;
        //Spinner split_amount;
        System.out.println("Amount: " + MainActivity.PlaceholderFragment.getAmount_total().getText().toString());

        return rootView;
    }


}
