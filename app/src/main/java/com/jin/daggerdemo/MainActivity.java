package com.jin.daggerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {
    private final String TAG = "MainActivity";

    @BindView(R.id.tv1)
    TextView mTv1;
    @BindView(R.id.tv2)
    TextView mTv2;
    @BindView(R.id.btn)
    Button mBtn;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        mTv1.setText(mUserInfo.getName());
        mUserInfo2.setName("aaaaaaaaaa");
        mTv2.setText(mUserInfo2.getName());

        mBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, OtherActivity.class)));
    }
}
