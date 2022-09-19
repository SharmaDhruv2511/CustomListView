package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String pname[] = {"BMW","Audi","Lamborgini","Honda","TATA","Rolce Royce","Jaquar",
            "BMW","Audi","Lamborgini","Honda","TATA","Rolce Royce","Jaquar",
            "BMW","Audi","Lamborgini","Honda","TATA","Rolce Royce","Jaquar",
            "BMW","Audi","Lamborgini","Honda","TATA","Rolce Royce","Jaquar"};

    String pprice[] = {"1,60,000 INR","1,60,000 INR","1,60,000 INR","1,60,000 INR",
            "1,60,000 INR","1,60,000 INR","1,60,000 INR",
            "1,60,000 INR","1,60,000 INR","1,60,000 INR","1,60,000 INR",
            "1,60,000 INR","1,60,000 INR","1,60,000 INR",
            "1,60,000 INR","1,60,000 INR","1,60,000 INR","1,60,000 INR",
            "1,60,000 INR","1,60,000 INR","1,60,000 INR",
            "1,60,000 INR","1,60,000 INR","1,60,000 INR","1,60,000 INR",
            "1,60,000 INR","1,60,000 INR","1,60,000 INR"};

    Integer pimage[] = {R.drawable.bmq,R.drawable.audi,R.drawable.lambo,R.drawable.honda,
    R.drawable.tata,R.drawable.rr,R.drawable.jaguar,
            R.drawable.bmq,R.drawable.audi,R.drawable.lambo,R.drawable.honda,
            R.drawable.tata,R.drawable.rr,R.drawable.jaguar,
            R.drawable.bmq,R.drawable.audi,R.drawable.lambo,R.drawable.honda,
            R.drawable.tata,R.drawable.rr,R.drawable.jaguar,
            R.drawable.bmq,R.drawable.audi,R.drawable.lambo,R.drawable.honda,
            R.drawable.tata,R.drawable.rr,R.drawable.jaguar};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);

        MyListAdapter myListAdapter = new MyListAdapter(this,pname,pprice,pimage);

        listView.setAdapter(myListAdapter);

    }
}