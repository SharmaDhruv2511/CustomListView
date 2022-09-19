package com.example.customlistview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapter extends BaseAdapter {

    Activity context;
    String[] pname;
    String[] pprice;
    Integer[] pimage;

    public MyListAdapter(Activity context, String[] pname, String[] pprice, Integer[] pimage) {
        this.context = context;
        this.pname = pname;
        this.pprice = pprice;
        this.pimage = pimage;
    }


    @Override
    public int getCount() {
        return pname.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = context.getLayoutInflater();

        View rowView = inflater.inflate(R.layout.myrow,null,true);

        ImageView image = rowView.findViewById(R.id.pimage);
        TextView name = rowView.findViewById(R.id.pname);
        TextView price = rowView.findViewById(R.id.pprice);

        name.setText(pname[i]);
        price.setText(pprice[i]);
        image.setImageResource(pimage[i]);



        return rowView;
    }
}
