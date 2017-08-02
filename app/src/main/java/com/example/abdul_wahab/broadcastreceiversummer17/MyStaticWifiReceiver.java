package com.example.abdul_wahab.broadcastreceiversummer17;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyStaticWifiReceiver extends BroadcastReceiver {
    private static final String TAG = "MTAG";

    public MyStaticWifiReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        Log.d(TAG, "onReceive: wifi state changed ");
        
    }
}
