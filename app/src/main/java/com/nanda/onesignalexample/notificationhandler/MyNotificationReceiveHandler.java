package com.nanda.onesignalexample.notificationhandler;

import android.util.Log;
import com.onesignal.OSNotification;
import com.onesignal.OneSignal;
import org.json.JSONObject;

/**
 * Created by nandagopal on 3/10/17.
 */
public class MyNotificationReceiveHandler implements OneSignal.NotificationReceivedHandler {
  @Override public void notificationReceived(OSNotification notification) {
    JSONObject data = notification.payload.additionalData;
    String customKey;

    if (data != null) {
      customKey = data.optString("customkey", null);
      if (customKey != null) Log.e("OneSignalExample", "customkey set with value: " + customKey);
    }
  }
}