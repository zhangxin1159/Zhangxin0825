package com.example.lenovo.zhangxin0825;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      editText   = findViewById(R.id.edittext);


      editText.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              
          }
      });
    }
}
