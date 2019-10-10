package cn.campusapp.rtmprecorder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private static final String STREAM_URL = "rtmp://10.10.5.119/live/livestream";

//    @OnClick(R.id.record_btn)
//    void onRecordClick(){
//        startActivity(RecordActivity.makeIntent(STREAM_URL));
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        ButterKnife.bind(this);
        setContentView(R.layout.activity_main);
        findViewById(R.id.record_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,RecordActivity.class);
                intent.putExtra("stream_url",STREAM_URL);
                startActivity(intent);
//                startActivity(RecordActivity.makeIntent(STREAM_URL));
            }
        });
    }


    protected String getUrl(){
        return STREAM_URL;
    }
}
