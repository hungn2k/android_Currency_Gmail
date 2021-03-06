package com.example.gmail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Item> emailList = new ArrayList<>();
    EmailAdapter emailAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        getEmailList();
        emailAdapter = new EmailAdapter(emailList, MainActivity.this);
        recyclerView.setAdapter(emailAdapter);
    }

    public void getEmailList() {
        emailList.add(new Item("Edurila.com", "$19 Only(First 10 spots - " +
                "Bestselling...\nAre you looking to Learn Web Designin...", "12:34 PM"));
        emailList.add(new Item("Chris Abad", "Help make Campaign Monitor better\n" +
                "Let us know your thoughts! No Images...", "11:22 AM"));
        emailList.add(new Item("Tuto.com", "8h de formation gratuite et les nouvea...\n" +
                "Photoshop, SEO, Blender, CSS, WordPre...", "11:04 AM"));
        emailList.add(new Item("support", "Société Ovh: suivi de vos services - hp...\n" +
                "SAS OVH - http://www.ovh.com 2 rue K...", "10:26 AM"));
        emailList.add(new Item("Matt from Ionic", "The New Ionic Creator Is Here!\n" +
                "Announcing the all-new Creator, build...", "10:11 AM"));



    }
}