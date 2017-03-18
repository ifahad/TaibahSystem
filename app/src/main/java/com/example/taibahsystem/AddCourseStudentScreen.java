package com.example.taibahsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.taibahsystem.Classes.*;

public class AddCourseStudentScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_course_student);

        Button submitAdd =(Button) findViewById(R.id.SubmitAdd_Button);
        submitAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CourseRequestManger Add= new  CourseRequestManger(getApplicationContext());
                Add.ReqAddCourse();
            }
        });


    }
}

