package sg.edu.rp.c346_18021531.mymovies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

        Movie item1 = new Movie("The Avengers",2012,"pg13","Action | Sci-Fi",);
        alContactlist.add(item1);
        Contact item2 = new Contact("Ken",65,97442437,'M');
        alContactlist.add(item2);

        CaContact = new CustomAdapter(this,R.layout.row,alContactlist);
        lvContact.setAdapter(CaContact);
    }
}