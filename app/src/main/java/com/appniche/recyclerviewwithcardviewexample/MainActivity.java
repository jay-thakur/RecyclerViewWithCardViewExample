package com.appniche.recyclerviewwithcardviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    static View.OnLongClickListener myOnClickListener;

    List<Person> personList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myOnClickListener = new MyOnClickListener();

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);
        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        //call person data
        personData();

        //set personal data to adapter
        mAdapter = new ContactAdapter(personList);
        mRecyclerView.setAdapter(mAdapter);
    }

    private class MyOnClickListener implements View.OnLongClickListener{

        @Override
        public boolean onLongClick(View view) {

            removeAt(view);

            return false;
        }
    }

    public void removeAt(View view) {
        int selectedItemPosition = mRecyclerView.getChildAdapterPosition(view);
        personList.remove(selectedItemPosition);
        mAdapter.notifyItemRemoved(selectedItemPosition);
    }

    //initialize person data
    public void personData(){
        personList = new ArrayList<>();
        personList.add(new Person("Ramesh Kumar", "Gopalganj"));
        personList.add(new Person("Jay Prakash Thakur", "Gopalganj"));
        personList.add(new Person("Ramesh", "Bangalore"));
        personList.add(new Person("Jay", "Bangalore"));
        personList.add(new Person("Jay Thakur", "Mumbai"));
        personList.add(new Person("Dilip Shukla", "Gopalganj"));
        personList.add(new Person("Vikesh Kumar", "Patna"));
        personList.add(new Person("Raj Patel", "Bhopal"));

    }
}
