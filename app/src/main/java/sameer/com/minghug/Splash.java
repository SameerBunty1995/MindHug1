package sameer.com.minghug;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {
    private ImageView imageView1;
    //    private TextView tv;
    private static int SPLASH_TIMEOUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash ); imageView1 = (ImageView) findViewById(R.id.imageView1);
//        tv = (TextView) findViewById(R.id.tv);
        Animation myanimatoin = AnimationUtils.loadAnimation(this,R.anim.welcome_animation);
        imageView1.startAnimation(myanimatoin) ;
//        tv.startAnimation(myanimatoin);
        new Handler().postDelayed( new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent( Splash.this, Login.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIMEOUT);

    }
}
