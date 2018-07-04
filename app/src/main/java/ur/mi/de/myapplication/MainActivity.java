package ur.mi.de.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //Init stage

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int fünf = 5;
        int zehn = fünf * 2;

        int zwanzig = zehn * 2;
        int vierzig = zwanzig * 2;
    }
}
