package com.example.taibahsystem.Classes;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Manee44 on 14/03/17.
 */

public class CourseRequestManger {
    private Context context;

    public  CourseRequestManger (Context context){
        this.context = context;
    }


    public void ReqAddCourse() {

        Toast.makeText(context, "To Be Done1", Toast.LENGTH_LONG).show();


    };


    public  void ReqDeleCourse(){
        Toast.makeText(context,"To Be Done2", Toast.LENGTH_LONG).show();

    };



    public void ReqWithdCourse(){
        Toast.makeText(context,"To Be Done3", Toast.LENGTH_LONG).show();

    };

}
