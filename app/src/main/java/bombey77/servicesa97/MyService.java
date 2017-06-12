package bombey77.servicesa97;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by Ромашка on 08.06.2017.
 */

public class MyService extends Service {

    private static final String LOG = "myLogs";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(LOG, "onCreate");
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.d(LOG, "onBind");
        return new Binder();
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.d(LOG, "onUnbind");
        //если возвращать true, то срабатывает метод onRebind, а то не будет так работать
        return true;
        //return super.onUnbind(intent);
    }

    @Override
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        Log.d(LOG, "onRebind");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(LOG, "onDestroy");
    }
}
