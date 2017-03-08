package com.example.dadriaunna01.inclassassignment06_dadriaunnaw;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String name;

    private TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayText = (TextView) findViewById(R.id.display_text);
        name = "" ;
    }


    public void addStudent(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, RequestCodes.ADD_STUDENT);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == RequestCodes.ADD_STUDENT && resultCode == RESULT_OK) {
            Student a = (Student) data.getSerializableExtra(Keys.STUDENT);
            name = name + a.toString();
            displayText.setText(name);
        }
    }
}


