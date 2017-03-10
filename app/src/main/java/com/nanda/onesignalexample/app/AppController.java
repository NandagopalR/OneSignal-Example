package com.nanda.onesignalexample.app;

import android.app.Application;
import android.content.Context;
import com.nanda.onesignalexample.notificationhandler.MyNotificationOpenHandler;
import com.nanda.onesignalexample.notificationhandler.MyNotificationReceiveHandler;
import com.onesignal.OneSignal;

/**
 * Created by nandagopal on 3/9/17.
 */
public class AppController extends Application {

  private static Context context;

  public static Context getContext() {
    return context;
  }

  @Override public void onCreate() {
    super.onCreate();

    context = getApplicationContext();

    OneSignal.startInit(this)
        .setNotificationOpenedHandler(new MyNotificationOpenHandler())
        .setNotificationReceivedHandler(new MyNotificationReceiveHandler())
        .init();

    // Logging set to help debug issues, remove before releasing your app.
    OneSignal.setLogLevel(OneSignal.LOG_LEVEL.DEBUG, OneSignal.LOG_LEVEL.WARN);

    OneSignal.syncHashedEmail("gopal300491@gmail.com");
  }
}
