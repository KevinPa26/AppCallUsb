package com.example.appcallusb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class MyBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getBooleanExtra("connected",false)){
            Uri tel = Uri.parse("tel:2664687890");
            context.startActivity(new Intent(Intent.ACTION_CALL, tel));
        }
    }
}
