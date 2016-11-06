package biubiubiu.satan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView u;
    TextView v;
    TextView a;
    TextView d;
    TextView c;
    EditText i;
    EditText j;
    EditText k;

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
        i = (EditText)findViewById(R.id.editText);
        j = (EditText)findViewById(R.id.editText2);
        k = (EditText)findViewById(R.id.editText3);
        b = (Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, satan3.class);
                startActivity(i);
                String s1 = i.getText().toString();
                String s2 = j.getText().toString();
                String s3 = k.getText().toString();
                System.out.println("i= " + s1);
                System.out.println("j= " + s2);
                System.out.println("k= " + s3);
                if(!s1.isEmpty()&& !s2.isEmpty() && !s3.isEmpty() && !s1.equals("Enter your first name") && !s2.equals("Enter your last name") && !s3.equals("Enter your first e-mail address")){
                    Intent i = new Intent(MainActivity.this, satan3.class);
                    startActivity(i);
                }
                else if(s1.isEmpty()){
                    i.setText("Enter your first name");

                }
                else if(s2.isEmpty()){
                    j.setText("Enter your last name");

                }
                else if(s3.isEmpty()){

                    k.setText("Enter your e-mail address");
                }
            }
        });
    }
}
