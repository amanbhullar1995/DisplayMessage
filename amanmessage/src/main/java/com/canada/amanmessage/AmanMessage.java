package com.canada.amanmessage;

import android.content.Context;
import android.widget.Toast;

public class AmanMessage {
    public static void DisplayMessage(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
