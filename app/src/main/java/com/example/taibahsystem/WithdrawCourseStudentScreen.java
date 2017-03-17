package com.example.taibahsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.taibahsystem.Classes.*;

public class WithdrawCourseStudentScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withdraw_course_student_screen);

        Button submitWithdraw =(Button) findViewById(R.id.SubmitWithdraw_Button);
        submitWithdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CourseRequestManger Withdraw= new  CourseRequestManger(getApplicationContext());
                Withdraw.ReqWithdCourse();
            }
        });
    }
}
