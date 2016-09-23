package webmyne.com.actiontimechanged;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar calendar = Calendar.getInstance();

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR,calendar.get(Calendar.HOUR));
        cal.set(Calendar.MINUTE,calendar.get(Calendar.MINUTE));
        cal.set(Calendar.SECOND,0);

        Intent intent = new Intent(getBaseContext(), MyReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(
                getBaseContext(), 123, intent, 0);
        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(),1*60*1000, pendingIntent);


//        IntentFilter filter = new IntentFilter();
//        filter.setPriority(1);
//        filter.addAction(Intent.ACTION_TIME_TICK);
//        filter.addAction(Intent.ACTION_TIME_CHANGED);
//
//        registerReceiver(new MyReceiver(), filter);
    }

}
