package guo.backgroundpictrans;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView iv = (ImageView) this.findViewById(R.id.iv);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.trans_anim);
        iv.startAnimation(animation);
    }
}
