package com.example.catherine.osgbtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import freemap.data.Point;
import freemap.proj.OSGBProjection;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Point p = new Point(-0.72, 51.05);
        OSGBProjection proj = new OSGBProjection();
        Point p2 = proj.project(p);
        Point p3 = proj.unproject(p2);

        TextView tv1 = (TextView)findViewById(R.id.tv1);
        TextView tv2 = (TextView)findViewById(R.id.tv2);
        TextView tv3 = (TextView)findViewById(R.id.tv3);
        TextView tv4 = (TextView)findViewById(R.id.tv4);

        tv1.setText(String.valueOf(p2.x));
        tv2.setText(String.valueOf(p2.y));
        tv3.setText(String.valueOf(p3.x));
        tv4.setText(String.valueOf(p3.y));

    }
}
