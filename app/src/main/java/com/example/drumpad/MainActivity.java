package com.example.drumpad;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
MediaPlayer m1,m2,m3,m4,m5,m6,m7,m8;
int[] magic = {R.drawable.magic};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m1=MediaPlayer.create(MainActivity.this,R.raw.ye);
        m2=MediaPlayer.create(MainActivity.this,R.raw.lol);
        m3=MediaPlayer.create(MainActivity.this,R.raw.sadv);
        m4=MediaPlayer.create(MainActivity.this,R.raw.thug);
        m5=MediaPlayer.create(MainActivity.this,R.raw.ve);
        m6=MediaPlayer.create(MainActivity.this,R.raw.fly);
        m7=MediaPlayer.create(MainActivity.this,R.raw.ex8);
        m8=MediaPlayer.create(MainActivity.this,R.raw.ptd);




    }
    @SuppressLint("Resource")
    @Override
    public void onClick(View v) {
        int id=v.getId();
        int ran=(int) Math.round(Math.random()*magic.length-1);
        v.setBackgroundResource(magic[ran]);
        switch(id)
        {
            case R.id.one:
                findViewById(v.getId()).setBackgroundResource(magic[ran]);
                Toast.makeText(MainActivity.this,"two"+ran ,Toast.LENGTH_SHORT).show();
                m1.start();
                break;
            case R.id.two:
                findViewById(v.getId()).setBackgroundResource(magic[ran]);
                Toast.makeText(MainActivity.this,"two" ,Toast.LENGTH_SHORT).show();
                m2.start();
                break;
            case R.id.three:
                findViewById(v.getId()).setBackgroundResource(magic[ran]);
                Toast.makeText(MainActivity.this,"three",Toast.LENGTH_SHORT).show();
                m3.start();
                break;
            case R.id.four:
                findViewById(v.getId()).setBackgroundResource(magic[ran]);
                Toast.makeText(MainActivity.this,"four",Toast.LENGTH_SHORT).show();
                m4.start();
                break;
            case R.id.five:
                findViewById(v.getId()).setBackgroundResource(magic[ran]);
                Toast.makeText(MainActivity.this,"five",Toast.LENGTH_SHORT).show();
                m5.start();
                break;
            case R.id.six:
                findViewById(v.getId()).setBackgroundResource(magic[ran]);
                Toast.makeText(MainActivity.this,"six",Toast.LENGTH_SHORT).show();
                m6.start();
                break;
            case R.id.seven:
                findViewById(v.getId()).setBackgroundResource(magic[ran]);
                Toast.makeText(MainActivity.this,"seven",Toast.LENGTH_SHORT).show();
                m7.start();
                break;
            case R.id.eight:
                findViewById(v.getId()).setBackgroundResource(magic[ran]);
                Toast.makeText(MainActivity.this,"eight",Toast.LENGTH_SHORT).show();
                m8.start();
                break;

        }
    }
}
