package com.vb.aptiquiz;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Vaibhav on 3/12/16.
 */
public class ResultFragment extends Fragment implements View.OnClickListener{

    Button b[] = new Button[30];
    int c[] = new int[30];

    final static String KEY_CORRECT = "correct";

    public ResultFragment(){
        //Empty Constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_buttons,container,false);

        b[0] = (Button) view.findViewById(R.id.button1);

        b[1] = (Button) view.findViewById(R.id.button2);

        b[2] = (Button) view.findViewById(R.id.button3);

        b[3] = (Button) view.findViewById(R.id.button4);

        b[4] = (Button) view.findViewById(R.id.button5);

        b[5] = (Button) view.findViewById(R.id.button6);

        b[6] = (Button) view.findViewById(R.id.button7);

        b[7] = (Button) view.findViewById(R.id.button8);

        b[8] = (Button) view.findViewById(R.id.button9);

        b[9] = (Button) view.findViewById(R.id.button10);

        b[10] = (Button) view.findViewById(R.id.button11);

        b[11] = (Button) view.findViewById(R.id.button12);

        b[12] = (Button) view.findViewById(R.id.button13);

        b[13] = (Button) view.findViewById(R.id.button14);

        b[14] = (Button) view.findViewById(R.id.button15);

        b[15] = (Button) view.findViewById(R.id.button16);

        b[16] = (Button) view.findViewById(R.id.button17);

        b[17] = (Button) view.findViewById(R.id.button18);

        b[18] = (Button) view.findViewById(R.id.button19);

        b[19] = (Button) view.findViewById(R.id.button20);

        b[20] = (Button) view.findViewById(R.id.button21);

        b[21] = (Button) view.findViewById(R.id.button22);

        b[22] = (Button) view.findViewById(R.id.button23);

        b[23] = (Button) view.findViewById(R.id.button24);

        b[24] = (Button) view.findViewById(R.id.button25);

        b[25] = (Button) view.findViewById(R.id.button26);

        b[26] = (Button) view.findViewById(R.id.button27);

        b[27] = (Button) view.findViewById(R.id.button28);

        b[28] = (Button) view.findViewById(R.id.button29);

        b[29] = (Button) view.findViewById(R.id.button30);

        colorButtons();

        return view;
    }
    void colorButtons(){
        c=getArguments().getIntArray(KEY_CORRECT);
        for (int i = 0; i < 30; i++) {
            b[i].setOnClickListener(this);
            if (c[i] == 1) {
                b[i].setBackgroundColor(Color.GREEN);
            } else if (c[i] == -1) {
                b[i].setBackgroundColor(Color.RED);
            } else {
                b[i].setBackgroundColor(getResources().getColor(R.color.alternate));
            }
        }
    }

    @Override
    public void onClick(View v) {

        for (int i=0;i<b.length;i++){
            if(v==b[i]){
                ((Result)getActivity()).buttonClicked(i);
            }
        }
    }
}
