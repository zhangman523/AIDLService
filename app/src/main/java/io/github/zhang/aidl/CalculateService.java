package io.github.zhang.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

/**
 * Created by zhangman on 2017/4/10 10:43.
 * Email: zhangman523@126.com
 */

public class CalculateService extends Service {
  private CalculateBinder mBinder;

  @Override public void onCreate() {
    super.onCreate();
    mBinder = new CalculateBinder();
  }

  @Nullable @Override public IBinder onBind(Intent intent) {
    return mBinder;
  }

  public class CalculateBinder extends ICalculateInterface.Stub {

    @Override
    public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble,
        String aString) throws RemoteException {

    }

    @Override public int add(int i, int j) throws RemoteException {
      return i + j;
    }

    @Override public int sub(int i, int j) throws RemoteException {
      return i - j;
    }
  }
}
