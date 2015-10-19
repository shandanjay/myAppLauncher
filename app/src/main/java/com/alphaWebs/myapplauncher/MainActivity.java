package com.alphaWebs.myapplauncher;

import android.app.*;
import android.content.Context;
import android.os.*;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initButtons();
    }

    private void initButtons(){

        Button app1 = (Button)findViewById(R.id.app1);
        app1.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Button b = (Button)view;
                        String btnText =  b.getText().toString();
                        Context context = getApplicationContext();

                        CharSequence text = (CharSequence) "This button will launch my app called "+btnText;
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                }

        );

        Button app2i = (Button)findViewById(R.id.app2i);
        app2i.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Button b = (Button)view;
                        String btnText =  b.getText().toString();
                        Context context = getApplicationContext();

                        CharSequence text = (CharSequence) "This button will launch my app called "+btnText;
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                }

        );

        Button app2ii = (Button)findViewById(R.id.app2ii);
        app2ii.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Button b = (Button)view;
                        String btnText =  b.getText().toString();
                        Context context = getApplicationContext();

                        CharSequence text = (CharSequence) "This button will launch my app called "+btnText;
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                }

        );

        Button app3 = (Button)findViewById(R.id.app3);
        app3.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Button b = (Button)view;
                        String btnText =  b.getText().toString();
                        Context context = getApplicationContext();

                        CharSequence text = (CharSequence) "This button will launch my app called "+btnText;
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                }

        );

        Button app4 = (Button)findViewById(R.id.app4);
        app4.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Button b = (Button)view;
                        String btnText =  b.getText().toString();
                        Context context = getApplicationContext();

                        CharSequence text = (CharSequence) "This button will launch my app called "+btnText;
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                }

        );

        Button app5 = (Button)findViewById(R.id.app5);
        app5.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Button b = (Button)view;
                        String btnText =  b.getText().toString();
                        Context context = getApplicationContext();

                        CharSequence text = (CharSequence) "This button will launch my app called "+btnText;
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                }

        );

    }


}
