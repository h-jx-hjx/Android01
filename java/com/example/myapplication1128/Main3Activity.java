package com.example.myapplication1128;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Main3Activity extends AppCompatActivity {
    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mBtnTextView = (Button)findViewById(R.id.btn_textview);
        mBtnTextView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //跳转到TextView
//wo
            }
        });
        mBtnTextView = (Button)findViewById(R.id.btn_button);
        mBtnTextView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //跳转到Buttoon
               Intent intent = new Intent(Main3Activity.this, ButtonActivity.class);
                startActivity(intent);
            }
        });
        mBtnEditText = (Button)findViewById(R.id.btn_edittext);
        mBtnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到EditText
               Intent intent = new Intent(Main3Activity.this, EditTextActivity.class);
                startActivity(intent);

            }
        });

    }
}


