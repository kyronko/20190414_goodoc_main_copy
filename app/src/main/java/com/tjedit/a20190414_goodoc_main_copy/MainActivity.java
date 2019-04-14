package com.tjedit.a20190414_goodoc_main_copy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText TextId;
    Button TextIdBtn;
    TextView welcomeMsgTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextId = findViewById(R.id.TextId);
        TextIdBtn = findViewById(R.id.TextIdBtn);
        welcomeMsgTxt =findViewById(R.id.welcomeMsgTxt);

        TextIdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String TxtID = TextId.getText().toString();


//                Toast.makeText(MainActivity.this, TxtID, Toast.LENGTH_SHORT).show();
                String toastMessage = String.format("[%s]을 검색합니다.",TxtID);
               Toast.makeText(MainActivity.this, toastMessage, Toast.LENGTH_SHORT).show();


            }
        });

        String loginUserId = getIntent().getStringExtra("사용자아이디");
        Log.d("로그인사용자",loginUserId);

        String welcomeMsgTxt = String.format("%s 님 환영합니다.",loginUserId);



    }
}
