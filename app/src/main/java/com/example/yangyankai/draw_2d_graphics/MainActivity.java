package com.example.yangyankai.draw_2d_graphics;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        LinearLayout layout=(LinearLayout) findViewById(R.id.root);
        final DrawView view=new DrawView(this);
        view.setMinimumHeight(1500);
        view.setMinimumWidth(1300);
        //通知view组件重绘
        view.invalidate();
        layout.addView(view);

    }
}
