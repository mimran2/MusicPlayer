package com.example.manol_000.musicplayer;

/**
 * Created by manol_000 on 11/1/2016.
 */

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.widget.Toast;

public class MyReceiver1 extends BroadcastReceiver {
    public MyReceiver1() {
    }

    @Override
    public void onReceive(Context arg0, Intent arg1) {

        Toast.makeText(arg0, "Mahnoor Imran Static Receiver", Toast.LENGTH_LONG).show();
        Vibrator vibrator = (Vibrator) arg0.getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(2000);
//        CharSequence intentData = arg1.getCharSequenceExtra("message");
//        Toast.makeText(arg0, "\"\""+intentData, Toast.LENGTH_LONG).show();
//        Vibrator vibrator = (Vibrator) arg0.getSystemService(Context.VIBRATOR_SERVICE);
//        vibrator.vibrate(1000);
    }

}

