package sameer.com.minghug;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.firebase.client.Firebase;
import com.google.firebase.auth.FirebaseAuth;

public class MainPage extends AppCompatActivity implements View.OnClickListener {
    private CardView partnership, therapists, blog, event, connect;
    FirebaseAuth mAuth;

    //partnership
//therapists
//blog
//event
//connect
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main_page );

        partnership = (CardView) findViewById( R.id.cv1 );
        therapists = (CardView) findViewById( R.id.cv3 );
        blog = (CardView) findViewById( R.id.cv4 );
        event = (CardView) findViewById( R.id.cv5);
        connect = (CardView) findViewById( R.id.cv6 );


        partnership.setOnClickListener( this );
        therapists.setOnClickListener( this );
        blog.setOnClickListener( this );
        event.setOnClickListener( this );
        connect.setOnClickListener( this );


        mAuth = FirebaseAuth.getInstance();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate( R.menu.activity_main_menu, menu );
        return super.onCreateOptionsMenu( menu );
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.sign_out:
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(this, Login.class));
                finish();
                break;
            case R.id.contact_us:
                startActivity(new Intent(this, Connect.class));
                finish();
        }
        return true;
    }

//        if (item.getItemId() == R.id.Sign_Out) ;
//        {
//            FirebaseAuth.getInstance().signOut();
//            finish();
//            startActivity(new Intent(this, Login.class));
//            break;
//
//        }
//        if (item.getItemId() == R.id.contact_us) ;
//        {
//            Intent intent = new Intent( getApplicationContext(), Connect.class );
//            startActivity( intent );
//
//        }
//        return super.onOptionsItemSelected( item );
//    }

    // @Override
    //    public boolean onOptionsItemSelected(MenuItem item) {
    //
    //        switch (item.getItemId()){
    //            case R.id.menuLogout:
    //                FirebaseAuth.getInstance().signOut();
    //                finish();
    //                startActivity(new Intent(this, LoginActivity.class));
    //                break;
    //            case  R.id.Settings:
    //                FirebaseAuth.getInstance().getFirebaseAuthSettings();
    //                finish();
    //                startActivity(new Intent(this, SettingsActivity.class));
    //                break;
    //            case R.id.my_account:
    //
    //                Intent intent = new Intent(this, MyAccountActivity.class);
    //                if(usertype.equals("admin"))intent.putExtra("admin", "admin");
    //                startActivity(intent);
    //        }
    //        return true;
    //    }

    @Override
    public void onClick(View v) {

        Intent i;
        switch (v.getId()) {
            case R.id.cv1:
                i = new Intent( this, Partnership.class );
                startActivity( i );
                break;
            case R.id.cv3:
                i = new Intent( this, Therapists.class );
                startActivity( i );
                break;
            case R.id.cv4:
                i = new Intent( this, BlogResearch.class );
                startActivity( i );
                break;
            case R.id.cv5:
                i = new Intent( this, Events.class );
                startActivity( i );
                break;
            case R.id.cv6:
                i = new Intent( this, Connect.class );
                startActivity( i );
                break;
            default:
                break;

        }

    }
}

