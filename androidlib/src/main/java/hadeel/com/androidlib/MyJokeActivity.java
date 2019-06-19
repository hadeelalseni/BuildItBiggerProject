package hadeel.com.androidlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class MyJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_joke);

        Intent intent = getIntent();
        //String joke = intent.getStringExtra("joke");
        String joke = intent.getStringExtra("joke_GCE");
        System.out.println("joke in MyJokeActivity.java: \n"+joke);

        TextView joke_tv = (TextView) findViewById(R.id.joke_tv);
        joke_tv.setText(joke);

    }
}
