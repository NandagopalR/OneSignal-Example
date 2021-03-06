package com.nanda.onesignalexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import com.onesignal.OneSignal;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    OneSignal.idsAvailable(new OneSignal.IdsAvailableHandler() {
      @Override public void idsAvailable(String userId, String registrationId) {
        String text = "OneSignal UserID:\n" + userId + "\n\n";

        if (registrationId != null) {
          text += "Google Registration Id:\n" + registrationId;
        } else {
          text += "Google Registration Id:\nCould not subscribe for push";
        }

        TextView textView = (TextView) findViewById(R.id.one_signal_view);
        textView.setText(text);
      }
    });
  }
}
