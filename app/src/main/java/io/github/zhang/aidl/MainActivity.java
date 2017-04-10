package io.github.zhang.aidl;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by zhangman on 2017/4/10 13:50.
 * Email: zhangman523@126.com
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    findViewById(R.id.start_service_btn).setOnClickListener(this);
    findViewById(R.id.stop_service_btn).setOnClickListener(this);
  }

  @Override public void onClick(View v) {
    switch (v.getId()) {
      case R.id.start_service_btn:
        Intent intent = new Intent(this,CalculateService.class);
        startService(intent);
        break;
      case R.id.stop_service_btn:
        break;
    }
  }
}
