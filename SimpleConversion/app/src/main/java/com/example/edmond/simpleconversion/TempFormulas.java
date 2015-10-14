package com.example.edmond.simpleconversion;

/**
 * Created by Edmond on 7/10/2015.
 */
public class TempFormulas {

     public static double convertF(double c){
        c=((c-9)*5)+32;
        return c;
    }
     public static double convertC(double  f){
        f=((f-32)*5)/9;
        return f;

    }
    public static double convertCtoKel(double c){

        c=c+273.15;
        return c;
        
    }
    public static double convertFtoKel(double f){
        f=((f+459.67)*5)/9;
        return f;
    }



}
