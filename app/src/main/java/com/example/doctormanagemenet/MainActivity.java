package com.example.doctormanagemenet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView mTextViewResult;
    private RequestQueue mQueue;
    public RVAdapter adapter;
    ArrayList<DoctorModel> doctorlist;
    RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recview);
        mQueue = Volley.newRequestQueue(this);
        doctorlist=new ArrayList<>();
        adapter=new RVAdapter(this,doctorlist);
        LinearLayoutManager manager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);




    }

    @Override
    protected void onStart() {
        super.onStart();
        jsonParse();
    }

    private void jsonParse() {
        String url = "https://topseba.com/api/our-doctors";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray jsonArray = response.getJSONArray("doctors");
                         for (int i = 0; i < jsonArray.length(); i++) {
                            JSONObject doctorobj = jsonArray.getJSONObject(i);
                            DoctorModel newdoctor = new DoctorModel();
                            newdoctor.setSpecialist(doctorobj.getString("specialist"));
                            newdoctor.setFee(doctorobj.getString("fee"));
                            User user = new User();
                            user.setFullName(doctorobj.getJSONObject("user").getString("full_name"));
                            user.setPhone(doctorobj.getJSONObject("user").getString("phone"));

                            JSONObject a = doctorobj.getJSONObject("user").getJSONArray("media").getJSONObject(0);

                            user.setMedia(a.getString("original_url"));

                            newdoctor.setUser(user);
                             doctorlist.add(newdoctor);




                             //Log.d(TAG, "onResponse: "+doctor.getString("specialist"));
                             //Log.d(TAG, "onResponse: "+doctor.getJSONObject("department"));
                             //Log.d(TAG, "onResponse: "+doctor.getJSONObject("user").getString("first_name"));



                                /*String specialist = doctor.getString("specialist");
                                double fee = doctor.getDouble("fee");
                                String experience = doctor.getString("experience");
                                int doctor_department_id = doctor.getInt("doctor_department_id");
                                mTextViewResult.append(String.valueOf(doctor_department_id) + ", " +specialist + ", " + String.valueOf(fee) + ", " + experience + "\n\n");
                                */
                         }
                         adapter.notifyDataSetChanged();




                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });
        mQueue.add(request);
    }
}