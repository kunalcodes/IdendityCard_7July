package com.example.idendity_card;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

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
        PersonAdapter personAdapter = new PersonAdapter(personList, this);
        GridLayoutManager linearLayoutManager = new GridLayoutManager(this, 2,
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(personAdapter);
    }

    private void buildRecyclerViewData() {
        personList.add(new Person(R.drawable.billgates, "Microsoft", "72", "Business"));
        personList.add(new Person(R.drawable.elonmusk, "Tesla", "48", "Business"));
        personList.add(new Person(R.drawable.jackdorsey, "Twitter", "40", "Business"));
        personList.add(new Person(R.drawable.jeffbezos, "Amazon", "49", "Business"));
        personList.add(new Person(R.drawable.joebiden, "USA", "82", "Politics"));
        personList.add(new Person(R.drawable.lionelmessi, "Barcelona", "34", "Football"));
        personList.add(new Person(R.drawable.markzuckerberg, "Facebook", "36", "Business"));
        personList.add(new Person(R.drawable.narendramodi, "India", "70", "Politics"));
        personList.add(new Person(R.drawable.richardbranson, "Virgin Mobile", "52", "Business"));
        personList.add(new Person(R.drawable.sachin, "India", "52", "Cricket"));
    }

    @Override
    public void onItemClicked(int position, Person person) {
        AlertDialog alertDialog = new AlertDialog.Builder(this).setTitle("Person Details")
                .setMessage("Company: " + person.getCompany() + "\n"
                            + "Age: " + person.getAge() + "\n"
                            + "Profession: "+ person.getProfession())
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                }).show();
    }
}