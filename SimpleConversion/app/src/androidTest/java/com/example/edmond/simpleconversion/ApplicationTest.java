package com.example.edmond.simpleconversion;

import com.robotium.solo.Solo;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

import java.util.Random;


/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ActivityInstrumentationTestCase2<SimpleConversionActivity>{

    Solo solo;
    public ApplicationTest() {
        super(SimpleConversionActivity.class);
    }

    public void setUp()throws Exception{
        solo = new Solo(getInstrumentation(), getActivity());
    }

    public void test()throws Exception{
        Random rnum=new Random();
        String num;
        int numOfTest=50;
        int i=0;
         while(i<numOfTest) {
             num=Integer.toString(rnum.nextInt(34));
             solo.enterText(0, num);
             //solo.typeText(R.id.edit_Text,"32");
             solo.clickOnButton("Celsius-Fahrenheit");
             solo.clickOnButton("Celsius-Kelvin");
             solo.clearEditText(0);
             solo.enterText(0, num);
             solo.clickOnButton("Fahrenheit-Celsius");
             solo.clickOnButton("Fahrenheit-Kelvin");
             solo.clearEditText(0);
             i++;
         }


    }


}
