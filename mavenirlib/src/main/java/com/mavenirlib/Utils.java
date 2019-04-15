package com.mavenirlib;

import android.content.Context;
import android.widget.Toast;

public class Utils {
    public static void sayHello(Context context,String text){
        Toast.makeText(context,""+text,Toast.LENGTH_LONG).show();
    }
}
