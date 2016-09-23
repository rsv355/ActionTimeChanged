package webmyne.com.actiontimechanged;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends WakefulBroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Log.e("###RCVD","Recived");
        Toast.makeText(context, "Recived", Toast.LENGTH_SHORT).show();
    }
}
