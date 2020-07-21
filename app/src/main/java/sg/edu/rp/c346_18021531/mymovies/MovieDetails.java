package sg.edu.rp.c346_18021531.mymovies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieDetails extends AppCompatActivity {
    ImageView ivRating;
    TextView tvtitle,tvyear, tvgenre, tvWatchOn, tvTheatre, tvDes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);
        ivRating = findViewById(R.id.imageView);
        tvtitle = findViewById(R.id.textViewTitle);
        tvyear = findViewById(R.id.textViewYear);
        tvgenre = findViewById(R.id.textViewGenre);
        tvWatchOn = findViewById(R.id.textViewWatchOn);
        tvTheatre = findViewById(R.id.textViewIntheatre);
        tvDes = findViewById(R.id.textViewdes);

        Intent i = getIntent();
        String title = i.getStringExtra("title");
        String year = i.getStringExtra("year");
        String rated = i.getStringExtra("rated");
        String genre = i.getStringExtra("genre");
        String Watch = i.getStringExtra("watchDate");
        String theatre = i.getStringExtra("theatre");
        String des = i.getStringExtra("des");

           if (title.equalsIgnoreCase("The Avengers")){
               ivRating.setImageResource(R.drawable.rating_pg13);
           }else{
               ivRating.setImageResource(R.drawable.rating_pg);
           }
           tvtitle.setText(title);
           tvyear.setText(year);
           tvgenre.setText(genre);
           tvDes.setText(des);
           tvWatchOn.setText(Watch);
           tvTheatre.setText(theatre);

    }
}