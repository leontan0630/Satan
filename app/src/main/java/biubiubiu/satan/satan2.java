package biubiubiu.satan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import java.util.Random;


public class satan2 extends AppCompatActivity {
    Button b;
    Button b2;
    Button b3;
    int x = 0;
    float y = 0;
    boolean a = false;
    TextView tv;
    TextView tv6;
    TextView tv7;
    TextView tv3;
    TextView temp;
    TextView tv11;
    EditText eT;
    Button b19;
    Button b20;
    Button b24;
    Button back;
    int i = 0;
    boolean be;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.satan2);
        b =(Button)findViewById(R.id.b1);
        tv = (TextView)findViewById(R.id.textView);
        tv3 = (TextView)findViewById(R.id.textView3);
        tv6 = (TextView)findViewById(R.id.textView6);
        tv7 = (TextView)findViewById(R.id.textView7);
        eT = (EditText) findViewById(R.id.editText2) ;
        b3 = (Button)findViewById(R.id.button18);
        b19 = (Button)findViewById(R.id.button19);
        tv11 = (TextView)findViewById(R.id.textView11);
        b20 = (Button)findViewById(R.id.button20);
        b24 = (Button)findViewById(R.id.button24);
        back=(Button)findViewById(R.id.back);
        b24.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(satan2.this, satan1.class);
                startActivity(i);
            }

        });
        b19.setOnClickListener( new View.OnClickListener(){public void onClick(View view) {
            if(eT.getText().length()!=10){
                tv11.setText("Must be 10 characters long.");
            }else{
                a = true;
                eT.setEnabled(false);
                tv11.setText("");
            }
        }
        });
        b20.setOnClickListener(  new View.OnClickListener(){public void onClick(View view) {

                String checkC = (String)tv.getText()+(String)tv6.getText()+(String)tv7.getText();
                try {   if (tv11.getText().equals(checkC)&&!tv11.getText().equals("")) {
                    be = true;
                    Intent i = new Intent(satan2.this, satan1.class);
                    startActivity(i);
                } else {
                    tv11.setText("Must Enter Correct Combination");
                }
            }catch(Exception e){
                tv11.setText("Must be 10 characters long.");
            }
        }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                if(!a){
                    tv11.setText("Must comfirm your number");
                }
                else if(eT.getText().length()==10){
                    tv11.setText("");
                    if(temp.getText()!= "") {
                        i = i + 1;
                    }
                    if(i ==3){
                        i = 0;
                    }
                    switch(i){
                        case 0:
                            temp = (TextView)findViewById(R.id.textView);
                            break;
                        case 1:
                            temp = (TextView)findViewById(R.id.textView6);
                            break;
                        case 2:
                            temp = (TextView)findViewById(R.id.textView7);
                            break;

                    }
                }else{
                    tv11.setText("Must be 10 characters long.");

                }
            }
        });

        switch(i){
            case 0:
                temp = (TextView)findViewById(R.id.textView);
                break;
            case 1:
                temp = (TextView)findViewById(R.id.textView6);
                break;
            case 2:
                temp = (TextView)findViewById(R.id.textView7);
                break;
        }
        b.setOnClickListener(
                new View.OnClickListener(){public void onClick(View view) {
                    try {
                        if(!a){
                            tv11.setText("Must comfirm your number");
                        }
                        else{
                            tv11.setText("");
                        temp.setText(String.valueOf(String.valueOf(Integer.parseInt((String) temp.getText()) + 1)));}
                    }catch(Exception e){

                        if(eT.getText().length()==10){
                            tv11.setText("press NEXT FIRST");
                        }else if(temp.getText()==""){
                            tv11.setText("Must be 10 characters long.");
                        }
                    }
                }
                }
        );
        b2 = (Button)findViewById(R.id.b2);
        b2.setOnClickListener( new View.OnClickListener(){
            public void onClick(View view) {
                if(!a){
                    tv11.setText("Must comfirm your number");
                }
                else if(eT.getText().length()==10){
                    temp.setText(String.valueOf(x));
                    tv11.setText("");
                }else{
                    tv11.setText("Must be 10 characters long.");
                }
            }
        });
        back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent i = new Intent(satan2.this, satan3.class);
                startActivity(i);
            }
        });

        Thread t = new Thread() {

            @Override
            public void run() {

                try {
                    while (!isInterrupted()) {
                        Thread.sleep(500);

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Random random = new Random();
                                int That = 0;
                                if(i == 2){
                                    That = random.nextInt(8999)+1000;}
                                else{
                                    That = random.nextInt(899)+100;
                                }
                                x = That;
                                tv3.setText(String.valueOf(That));
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

