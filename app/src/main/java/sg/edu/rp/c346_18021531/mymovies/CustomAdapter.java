package sg.edu.rp.c346_18021531.mymovies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Movie> movieList;

    public CustomAdapter(Context context, int resource, ArrayList<Movie> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        movieList = objects;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);


        // Obtain the UI components and do the necessary binding
        TextView tvtitle= rowView.findViewById(R.id.textViewTitle);
        TextView tvYear = rowView.findViewById(R.id.textViewYear);
        TextView tvgenre = rowView.findViewById(R.id.textViewGenre);
        ImageView ivRating = rowView.findViewById(R.id.imageView);
        // Obtain the Android Version information based on the position
        Movie currentItem = movieList.get(position);

        // Set values to the TextView to display the corresponding information
        tvtitle.setText(currentItem.getTitle());
        tvYear.setText(currentItem.getYear());
        tvgenre.setText(currentItem.getGenre());

        if  (currentItem.getRated().equalsIgnoreCase("pg13")){
            ivRating.setImageResource(R.drawable.rating_pg13);
        }else {
            ivRating.setImageResource(R.drawable.rating_pg);
        }




        return rowView;
    }

}
