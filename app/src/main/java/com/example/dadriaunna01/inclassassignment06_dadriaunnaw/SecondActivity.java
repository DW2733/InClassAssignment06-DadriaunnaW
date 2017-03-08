package com.example.dadriaunna01.inclassassignment06_dadriaunnaw;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private EditText studentName;
    private EditText grade;
    private CheckBox honors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        studentName = (EditText) findViewById(R.id.student_name);
        grade = (EditText) findViewById(R.id.grade);
        honors = (CheckBox) findViewById(R.id.honors);
    }

    public void addToList(View view) {

        String name = studentName.getText().toString();
        int percentage = Integer.parseInt(grade.getText().toString());
        boolean honorsStudent = honors.isChecked();

        Student a = new Student(name, percentage, honorsStudent);


        Intent data = new Intent();
        data.putExtra(Keys.STUDENT, a);
        setResult(RESULT_OK, data);
        finish();


    }
}
