package com.nanda.onesignalexample.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.nanda.onesignalexample.R;
import com.nanda.onesignalexample.base.BaseActivity;

/**
 * Created by nandagopal on 3/10/17.
 */

public class AnotherActivity extends BaseActivity {

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_another);
  }
}
