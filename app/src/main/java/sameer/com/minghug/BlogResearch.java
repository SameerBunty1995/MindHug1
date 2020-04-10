package sameer.com.minghug;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class BlogResearch extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_blog_research );
    }
    public  void browser1(View view){
        Intent BlogResearchIntent  = new Intent( Intent.ACTION_VIEW, Uri.parse( "https://medium.com/mymindhug" ) );
        startActivity( BlogResearchIntent );
        finish();
    }
}
