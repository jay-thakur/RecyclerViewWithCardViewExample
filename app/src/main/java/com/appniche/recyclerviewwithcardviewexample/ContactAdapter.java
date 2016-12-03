package com.appniche.recyclerviewwithcardviewexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by JayPrakash on 03-12-2016.
 */

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {

    List<Person> person;

    public ContactAdapter(List<Person> person) {
        this.person = person;
    }

    @Override
    public ContactAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_row, parent, false);
        //view.setOnClickListener(MainActivity);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ContactAdapter.ViewHolder holder, int position) {
        holder.name.setText(person.get(position).getName());
        holder.city.setText(person.get(position).getCity());
    }

    @Override
    public int getItemCount() {
        return person.size();
    }

    // Create new views (invoked by the layout manager)
    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView name;
        TextView city;

        public ViewHolder(View itemView) {
            super(itemView);

            this.name = (TextView) itemView.findViewById(R.id.nameTV);
            city = (TextView) itemView.findViewById(R.id.cityTV);
        }
    }
}
