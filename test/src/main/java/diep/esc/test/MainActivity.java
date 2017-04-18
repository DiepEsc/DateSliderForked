package diep.esc.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.googlecode.android.widgets.DateSlider.AlternativeDateSlider;
import com.googlecode.android.widgets.DateSlider.DateSlider;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View view = findViewById(R.id.hello);
        view.setClickable(true);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DateSlider slider = new AlternativeDateSlider(MainActivity.this,
                        new DateSlider.OnDateSetListener() {
                            @Override
                            public void onDateSet(DateSlider view, Calendar selectedDate) {

                            }
                        }, Calendar.getInstance());
                slider.show();
            }
        });
    }
}
