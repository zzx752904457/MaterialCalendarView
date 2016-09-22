package githubzzx752904457.com.materialcalendarview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.tv1)
    void intent1() {
        Intent intent = new Intent(this, DecoratedActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.tv2)
    void intent2() {
        Intent intent = new Intent(this, DynamicSettersActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.tv3)
    void intent3() {
        Intent intent = new Intent(this, DialogsActivity.class);
        startActivity(intent);
    }
}
