package biubiubiu.satan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by Al on 2016/11/5.
 */

public class satan1 extends AppCompatActivity {
    TextView num1,num2,num3,num4,num5,num6,num7,num8,num9;
    TextView temp;
    Button b1,b2,b3,b4;
    EditText input1;
    String input2;
    int n=0;
    int num = 0;
    String fin = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.satan1);
        final EditText input1=(EditText)findViewById(R.id.editText);
        num1=(TextView)findViewById(R.id.textView1);
        num2=(TextView)findViewById(R.id.textView2);
        num3=(TextView)findViewById(R.id.textView3);
        num4=(TextView)findViewById(R.id.textView4);
        num5=(TextView)findViewById(R.id.textView5);
        num6=(TextView)findViewById(R.id.textView6);
        num7=(TextView)findViewById(R.id.textView7);
        num8=(TextView)findViewById(R.id.textView8);
        temp=(TextView)findViewById(R.id.textView1);
        num9=(TextView)findViewById(R.id.textView9);
        b1=(Button)findViewById(R.id.set);
        b2=(Button)findViewById(R.id.reset);
        b3=(Button)findViewById(R.id.finish);
        b4=(Button)findViewById(R.id.back);

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(input1.length()==8){
                    input1.setEnabled(false);
                }
                if(num==0){
                    num=num+2;
                }
               else{
                    num=num+1;
                }
                fin=fin+String.valueOf(n);
                //System.out.println(fin);
                    switch (num) {
                        case 1:
                            temp = (TextView) findViewById(R.id.textView1);
                            break;
                        case 2:
                            temp = (TextView) findViewById(R.id.textView2);
                            break;
                        case 3:
                            temp = (TextView) findViewById(R.id.textView3);
                            break;
                        case 4:
                            temp = (TextView) findViewById(R.id.textView4);
                            break;
                        case 5:
                            temp = (TextView) findViewById(R.id.textView5);
                            break;
                        case 6:
                            temp = (TextView) findViewById(R.id.textView6);
                            break;
                        case 7:
                            temp = (TextView) findViewById(R.id.textView7);
                            break;
                        case 8:
                            temp = (TextView) findViewById(R.id.textView8);
                            break;
                    }


            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                fin="";
                temp = (TextView) findViewById(R.id.textView1);
                temp.setText("");
                num8.setText("");
                num=0;
                num1.setText("");
                num2.setText("");
                num3.setText("");
                num4.setText("");
                num5.setText("");
                num6.setText("");
                num7.setText("");

            }
        });
        b3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                input2=input1.getText().toString();
                if(input2.equals(fin)&& !input2.equals("")){
                    num9.setText("WINNER OF THE HACKATHAON");
                }
                else{
                    num9.setText("TRY AGAIN LOVE!");
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(satan1.this, satan2.class);
                startActivity(i);
            }
        });

        Thread t = new Thread() {

            @Override
            public void run() {
                try {
                    while (!isInterrupted()) {
                        Thread.sleep(10);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                // update TextView here!
                                    Random r = new Random();
                                    n=r.nextInt(10);
                                    if(num<=8){
                                        temp.setText(String.valueOf(n));
                                    }


                            }
                    });
                }
                } catch (InterruptedException e) {
                }
            }
        };

        t.start();
    }
}


