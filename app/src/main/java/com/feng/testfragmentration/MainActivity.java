package com.feng.testfragmentration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Package Name: com.feng.testfragmentration
 *
 * @author ysr
 * @Email yfeng1023@gmail.com
 * @Description: TODO
 * @Create Date: 2018/5/11
 */
public class MainActivity extends AppCompatActivity {
    private Button btnScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnScreen = findViewById(R.id.btnScreen);
        btnScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
