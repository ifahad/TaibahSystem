package com.example.taibahsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.taibahsystem.Classes.*;

public class DeleteCourseStudentScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_course_student_screen);

        Button submitDelete =(Button) findViewById(R.id.SubmitDelete_Button);
        submitDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CourseRequestManger Delete= new  CourseRequestManger(getApplicationContext());
                Delete.ReqDeleCourse();
            }
        });
    }
}
