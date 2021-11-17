package com.example.ch07_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout baseLayout;
    Button btn1;

    ImageView iv1;
    EditText edt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main2);

        baseLayout = findViewById(R.id.baseLayout);
        btn1 = findViewById(R.id.btn1);

        iv1 = findViewById(R.id.iv1);
        edt1 = findViewById(R.id.edt1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //방법1. xml로 인플레이터 - 추천
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu2, menu);

        //방법2. only Java (인플레이터 안씀!) - 비추
//        menu.add(0,1,0, "빨강");
//        menu.add(0,2,0, "초록");
//        menu.add(0,3,0, "파랑");
//
//        SubMenu sMenu = menu.addSubMenu("버튼변경");
//        sMenu.add(0,4,0, "45도 회전");
//        sMenu.add(0,5,0, "2배 확대");

        return super.onCreateOptionsMenu(menu);
    }

    float fAngle = 0.0f;
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        int id = item.getItemId();

        switch (id)
        {
            case R.id.item0:

                String str1 = edt1.getText().toString();
//                fAngle = fAngle + Float.parseFloat(str1);
                fAngle += Float.parseFloat(str1);

                iv1.setRotation(fAngle);
                break;
            case R.id.item1:
//            case 1:
//                baseLayout.setBackgroundColor(Color.RED);

                iv1.setImageResource(R.drawable.jeju2);
                item.setChecked(true);

                break;
            case R.id.item2:
//            case 2:
//                baseLayout.setBackgroundColor(Color.GREEN);
                iv1.setImageResource(R.drawable.jeju4);
                item.setChecked(true);

                break;
            case R.id.item3:
//            case 3:
//                baseLayout.setBackgroundColor(Color.BLUE);
                iv1.setImageResource(R.drawable.jeju12);
                item.setChecked(true);

                break;
//            case R.id.item4:
//            case 4:
//                btn1.setRotation(45.0f);
//
//                break;
////            case R.id.item5:
//            case 5:
//                btn1.setScaleX(2);

//                break;
        }


        return super.onOptionsItemSelected(item);
    }
}