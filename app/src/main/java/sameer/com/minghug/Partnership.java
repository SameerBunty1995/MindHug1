package sameer.com.minghug;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Partnership extends AppCompatActivity {
    Button contact_us;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_partnership );
        contact_us=findViewById( R.id.contact_us );
        contact_us.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent( Partnership.this, Connect.class);
                startActivity(homeIntent);
                finish();
            }
        } );
    }
}
