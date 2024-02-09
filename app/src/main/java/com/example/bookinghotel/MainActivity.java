package com.example.bookinghotel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvRoom;
    private UserAdapter mUserAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.booking);

        rcvRoom = findViewById(R.id.ds_ctbb);
        mUserAdapter = new UserAdapter(this);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        rcvRoom.setLayoutManager(gridLayoutManager);

        mUserAdapter.setData(getListRoom());
        rcvRoom.setAdapter(mUserAdapter);

    }
    private List<User> getListRoom(){
        List<User> list=new ArrayList<>();
        list.add(new User(R.drawable.room2,"Phong 1","100.000"));
        list.add(new User(R.drawable.room3,"Phong 3","110.000"));
        list.add(new User(R.drawable.room4,"Phong 4","120.000"));
        list.add(new User(R.drawable.room5,"Phong 5","130.000"));

        return list;

    }

}