package com.tjedit.a20190414_goodoc_main_copy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    //      ID : tjeit , PW : qwer1234 가 입력된상태로
//    로그인 버튼을 누르면 => 메인으로 이동
//    만약 로그인정보가 틀리면, 토스트로 "로그인에 실패했습니다. ID/PW를 확인해주세요."
    EditText userIdEdt;
    EditText userPwEdt;
    Button LoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userIdEdt = findViewById(R.id.userIdEdt);
        userPwEdt = findViewById(R.id.userPwEdt);
        LoginBtn = findViewById(R.id.LoginBtn);

        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userid = userIdEdt.getText().toString();
                String userPw = userPwEdt.getText().toString();

                if (userid.equals("tjeit") && userPw.equals("qwer1234")) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(LoginActivity.this, "로그인에 실패하였습니다.\n ID / PW를 확인해주세요.", Toast.LENGTH_SHORT).show();

                }
            }
        });


    }
}

