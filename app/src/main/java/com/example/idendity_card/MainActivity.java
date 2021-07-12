package com.example.idendity_card;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Person> personList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        buildRecyclerViewData();
        setRecyclerViewAdapter();
    }

    private void setRecyclerViewAdapter() {
        PersonAdapter personAdapter = new PersonAdapter(personList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(personAdapter);
    }

    private void buildRecyclerViewData() {
        personList.add(new Person(R.drawable.billgates,"Microsoft", "72", "Business"));
        personList.add(new Person(R.drawable.elonmusk,"Tesla", "48", "Business"));
        personList.add(new Person(R.drawable.jackdorsey,"Twitter", "40", "Business"));
        personList.add(new Person(R.drawable.jeffbezos,"Amazon", "49", "Business"));
        personList.add(new Person(R.drawable.joebiden,"USA", "82", "Politics"));
        personList.add(new Person(R.drawable.lionelmessi,"Barcelona", "34", "Football"));
        personList.add(new Person(R.drawable.markzuckerberg,"Facebook", "36", "Business"));
        personList.add(new Person(R.drawable.narendramodi,"India", "70", "Politics"));
        personList.add(new Person(R.drawable.richardbranson,"Virgin Mobile", "52", "Business"));
        personList.add(new Person(R.drawable.sachin,"India", "52", "Cricket"));
    }
}