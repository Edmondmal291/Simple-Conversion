package com.example.edmond.simpleconversion;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



public class SimpleConversionActivity extends Activity {
    // member variables
    EditText mEditText;
    TextView mTextView;
    double num;
//    Intent callIntent;1


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // set the user interface layout for this Activity
        setContentView(R.layout.activity_simple_conversion);
        // Initialize  member variables
        mEditText = (EditText) findViewById(R.id.edit_Text);
        mTextView = (TextView) findViewById(R.id.text_view);
        /*Uri number= Uri.parse("tel:2053171420");
         callIntent=new Intent(Intent.ACTION_DIAL,number);*/
    }


    public void convertC(View v){
        num =Double.parseDouble(mEditText.getText().toString());
        num= TempFormulas.convertC(num);
        String sNum =String.valueOf(num);
        mTextView.setText(sNum);

    }
    public void convertF(View v){
        double num =Double.parseDouble(mEditText.getText().toString());
        num= TempFormulas.convertF(num);
        String sNum =String.valueOf(num);
        mTextView.setText(sNum);

    }

    public void convertCtoKel(View v){
        num =Double.parseDouble(mEditText.getText().toString());
        num= TempFormulas.convertCtoKel(num);
        String sNum =String.valueOf(num);
        mTextView.setText(sNum);

    }

    public void convertFtoKel(View v){
        num =Double.parseDouble(mEditText.getText().toString());
        num= TempFormulas.convertFtoKel(num);
        String sNum =String.valueOf(num);
        mTextView.setText(sNum);
    }
    /*public void callMe(View v){

        startActivity(callIntent);
    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_simple_conversion, menu);
        return true;
    }


}
