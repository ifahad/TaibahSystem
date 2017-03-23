package com.example.taibahsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;

import com.example.taibahsystem.Classes.*;

import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.POST;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

/*
    public interface ConnectionUtilityAPI{

        @GET("getrequest.php")
        Call<ResultModel> getRequests();

    }

    // Building Retrofit and get connection
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("")
            .addConverterFactory(GsonConverter.create())
            .build();

    // Link retrofit into API
    ConnectionUtilityAPI cuApi = retrofit.create(ConnectionUtilityAPI.class);

    // Calling the method getRequest() and catch Call name of connection
    Call<ResultModel> connection = cuApi.getRequests();

    connection.enqueue()



    // Mapping for Json
    public class ResultModel{

        private List<Request> requests;

        public List<Request> getRequests(){
            return requests;
        }

        public void setRequests(List<Request> requests){
            this.requests = requests;
        }
    }
*/

    // Model for the data. In this case it's General Data Model for the Requests
    public class Request{

        int number;
        int studentID;
        String type;
        String status;

        public int getNumber(){
            return number;
        }

        public void setNumber(int number){
            this.number = number;
        }

        public int getStudentID(){
            return studentID;
        }

        public void setStudentID(int studentID){
            this.studentID = studentID;
        }

        public String getType(){
            return type;
        }

        public void setType(){
            this.type = type;
        }

        public String getStatus(){
            return status;
        }

        public void setStatus(){
            this.status = status;
        }

    }
}
