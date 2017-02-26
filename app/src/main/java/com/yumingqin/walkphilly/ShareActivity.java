
package com.yumingqin.walkphilly;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.net.Uri;
import android.widget.TextView;

/**
 * Created by eherzog on 2/25/2017.
 */

public class ShareActivity extends Activity {
    TextView description;
    TextView name;
    TextView dist;


    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        description = (TextView) findViewById(R.id.textView3);
        description.setText(MainActivity.points.get(MapsActivity.onThisLoc + 1).getDescription());
        System.out.println(MainActivity.points.get(MapsActivity.onThisLoc + 1).getDescription());
        description.setTextColor(Color.WHITE);
        description.setVisibility(View.VISIBLE);

        dist = (TextView) findViewById(R.id.textView5);
        dist.setText("I just walked " + Math.round (MapsActivity.totalDist * 10000.0) / 10000.0
        + " miles in Philadelphia!");
        dist.setTextColor(Color.WHITE);
        dist.setVisibility(View.VISIBLE);

        name = (TextView) findViewById(R.id.textView4);
        name.setText(MainActivity.points.get(MapsActivity.onThisLoc + 1).getName());
        name.setTextColor(Color.WHITE);
        name.setVisibility(View.VISIBLE);

        final Button facebook = (Button) findViewById(R.id.button6);
        facebook.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //open Facebook website
                String url = "http://www.facebook.com";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });


        final Button instagram = (Button) findViewById(R.id.button4);
        instagram.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //open Facebook website
                String url = "http://www.instagram.com";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });


        final Button twitter = (Button) findViewById(R.id.button5);
        twitter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //open Facebook website
                String url = "http://www.twitter.com";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });


        final Button continueTour = (Button) findViewById(R.id.button2);
        continueTour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goBack();
            }

        });


    }

    private void goBack(){
        Intent i = new Intent(this, PathMapsActivity.class);
        startActivity(i);
    }


}
