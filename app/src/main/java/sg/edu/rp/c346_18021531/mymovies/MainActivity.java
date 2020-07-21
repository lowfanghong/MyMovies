package sg.edu.rp.c346_18021531.mymovies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lvMovie;
    ArrayList<Movie> alMovielist;
    ArrayAdapter<Movie> CaMovie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMovie =findViewById(R.id.listviewMovies);

        alMovielist = new ArrayList<>();
        Calendar date1 = Calendar.getInstance();
        date1.set(2014,11,15);
        Calendar date2 = Calendar.getInstance();
        date2.set(2015,5,15);

        Movie item1 = new Movie("The Avengers","2012",
                "pg13","- Action | Sci-Fi",date1,"Golden Village - Bishan",
                "Nick Fury of S.H.I.E.L.D. assembles a team of " +
                        "superheroes to save the planet from Loki and his army.");
        alMovielist.add(item1);
        Movie item2 = new Movie("Planes","2013","pg","- Animation | Comedy",
                date2,"Cathay - AMK Hub","A crop-dusting plane with " +
                "a fear of heights " +
                "lives his dream of " +
                "competing in a famous around-the-world aerial race.");
        alMovielist.add(item2);

        CaMovie = new CustomAdapter(this,R.layout.row,alMovielist);
        lvMovie.setAdapter(CaMovie);

         lvMovie.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 Intent movieintent =  new Intent(MainActivity.this,
                         MovieDetails.class);
               Movie currentMovie = alMovielist.get(position);
               movieintent.putExtra("title",currentMovie.getTitle());
                 movieintent.putExtra("year",currentMovie.getYear());
                 movieintent.putExtra("rated",currentMovie.getRated());
                 movieintent.putExtra("genre",currentMovie.getGenre());
                 movieintent.putExtra("watchDate",currentMovie.getWatched_on());
                 movieintent.putExtra("theatre",currentMovie.getIn_theatre());
                 movieintent.putExtra("des",currentMovie.getDescription());
                 startActivity(movieintent);
             }
         });

    }

}