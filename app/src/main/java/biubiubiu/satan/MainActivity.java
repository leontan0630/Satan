package biubiubiu.satan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView u;
    TextView v;
    TextView a;
    TextView d;
    TextView c;

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        u = (TextView)findViewById(R.id.textView2);
        v = (TextView)findViewById(R.id.textView3);
        a = (TextView)findViewById(R.id.textView4);
        d = (TextView)findViewById(R.id.textView10);
        c = (TextView)findViewById(R.id.textView11);


        b = (Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, satan3.class);
                startActivity(i);
            }
        });
    }
}
