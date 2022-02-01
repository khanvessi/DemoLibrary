package com.example.demolib;

import android.content.Context;
import android.widget.Toast;

public class Toaster {

    public static void simpleToast(Context context, String msg){

        Toast.makeText(context, "Helllo", Toast.LENGTH_LONG).show();
    }
}
