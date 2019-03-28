package com.example.adrian.czysieoplaca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.text.TextUtils;


public class activity2 extends AppCompatActivity {
    private EditText editor1,editor2,editor3;;
    private Button check;
    public TextView text;

    int czydziescidniowy=30;
    int miesiac=0;
    int iledni=0;
    int rok=0;
    int dzien=0;
    int ilezostalo=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);


        editor1 = (EditText) findViewById(R.id.ed1);
        editor2 = (EditText) findViewById(R.id.ed2);
        editor3 = (EditText) findViewById(R.id.ed3);
        text = (TextView) findViewById(R.id.text1);
        check = (Button) findViewById(R.id.button1);


        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                dzien = Integer.parseInt(editor2.getText().toString());
                miesiac = Integer.parseInt(editor1.getText().toString());
                rok = Integer.parseInt(editor3.getText().toString());





                if(dzien>31 || dzien<0 || miesiac>12 ||miesiac<0 || rok<0)
                {
                    text.setText("nieprawidlowa data");
                }
                else {

                    if (miesiac == 1) {
                        iledni = 31;
                        ilezostalo = iledni - dzien;


                    } else if (miesiac == 2) {
                        if (rok % 4 == 0) {
                            iledni = 29;
                            ilezostalo = iledni - dzien;


                        } else {
                            iledni = 28;
                            ilezostalo = iledni - dzien;
                        }

                    } else if (miesiac == 3) {

                        iledni = 31;
                        ilezostalo = iledni - dzien;

                    } else if (miesiac == 4) {
                        iledni = 30;
                        ilezostalo = iledni - dzien;
                    } else if (miesiac == 5) {
                        iledni = 31;
                        ilezostalo = iledni - dzien;
                    } else if (miesiac == 6) {
                        iledni = 30;
                        ilezostalo = iledni - dzien;
                    } else if (miesiac == 7) {
                        iledni = 31;
                        ilezostalo = iledni - dzien;
                    } else if (miesiac == 8) {
                        iledni = 31;
                        ilezostalo = iledni - dzien;
                    } else if (miesiac == 9) {
                        iledni = 30;
                        ilezostalo = iledni - dzien;
                    } else if (miesiac == 10) {
                        iledni = 31;
                        ilezostalo = iledni - dzien;
                    } else if (miesiac == 11) {
                        iledni = 30;
                        ilezostalo = iledni - dzien;
                    } else if (miesiac == 12) {
                        iledni = 31;
                        ilezostalo = iledni - dzien;
                    }


                    if (czydziescidniowy > ilezostalo + 1) {

                        text.setText("no kurwa oczywiscie ze na 30 dnii");
                    } else if (czydziescidniowy < ilezostalo + 1) {

                        text.setText("miesieczny bierz dzbanie");
                    } else if (czydziescidniowy == ilezostalo + 1) {

                        text.setText("to bez roznicy");
                    }
                }

            }
        });

    }

}
