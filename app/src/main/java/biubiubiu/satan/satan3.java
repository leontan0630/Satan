package biubiubiu.satan;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.CountDownTimer;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class satan3 extends AppCompatActivity implements SensorEventListener {

    boolean o1 = false;
    boolean o2 = false;
    boolean o3 = false;

    Sensor acc;
    SensorManager sm;
    TextView x;
    TextView y;
    TextView z;
    TextView u;
    TextView v;
    TextView text1;
    TextView text2;
    EditText e;
    Button b;
    Button bb;
    Button bbb;
    Button bbbb;
    Button bbbbb;
    float t1;
    float t2;
    String str;
    String mon;
    String day;
    String yer;

    final long start = 60000;
    final long interval = 500;
    long rest = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.satan3);
        sm = (SensorManager)getSystemService(SENSOR_SERVICE);
        acc = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sm.registerListener(this, acc, SensorManager.SENSOR_DELAY_NORMAL);

        x = (TextView)findViewById(R.id.exp);
        y = (TextView)findViewById(R.id.c1);
        z = (TextView)findViewById(R.id.c2);
        u = (TextView)findViewById(R.id.br1);
        v = (TextView)findViewById(R.id.br2);
        e = (EditText)findViewById((R.id.bd1));
        b = (Button)findViewById(R.id.b1);
        text1 = (TextView)findViewById(R.id.t1);
        text2 = (TextView)findViewById(R.id.t2);
        MalibuCountDownTimer countDownTimer = new MalibuCountDownTimer(start, interval);
        countDownTimer.start();

                b = (Button)findViewById(R.id.b1);
        b.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                final float m = t1;
                final float n = t2;

                String first = Float.toString(m);
                String s;

                String s1 = e.getText().toString();

                String s;
                s = (String)y.getText();
                String[] st = s.split(" ");
                str = st[1];

                try{
                    String[] st1 = s1.split("/");
                    mon = st1[0];
                    day = st1[1];
                    yer = st1[2];
                    int mm = Integer.parseInt(mon);
                    int dd = Integer.parseInt(day);
                    // int yy = Integer.parseInt(yer);
                   //System.out.println(".."+str);
                    System.out.println(mon);
                    System.out.println(day);
                    System.out.println(yer);

                    if((1 <= mm && mm <= 12) && (1 <= dd && dd <= 31)) {
                        System.out.println(s1);
                        if (o1 == false && o2 == false && o3 == false) {
                            // System.out.println("yes");
                            if (str.equals(mon)) {

                                z.setText(mon + "/##/##");
                                o1 = true;
                            }
                            else{
                                z.setText(str + "/##/##");
                            }

                        } else if (o1 == true && o2 == false && o3 == false) {
                            if (str.equals(day)) {

                                z.setText(mon + "/" + day + "/##");
                                o2 = true;
                            }
                            else{
                                z.setText(mon + "/" + str + "/##");
                            }
                        } else if (o1 == true && o2 == true && o3 == false) {
                            if (str.equals(yer)) {

                                z.setText(mon + "/" + day + "/" + yer);
                                o3 = true;
                            }
                            else{
                                z.setText(mon + "/" + day + "/" + str);
                            }
                        }
                    }
                    else{
                        e.setText("Please enter your birth day",TextView.BufferType.EDITABLE);
                    }
                }
                catch (Exception ex){
                    e.setText("Please enter your birth day",TextView.BufferType.EDITABLE);
                }
               /* final float m = t1;
                final float n = t2;

                String first = Float.toString(m);

>>>>>>> origin/master


                String second = Float.toString(n);


                if(o1 == false && o2 == false && o3 == false){
                    y.setText("MONTH: " + Character.toString(first.replace("-","").charAt(0))+ Character.toString(second.replace("-","").charAt(0)));
                }
                else if(o1 == true && o2 == false && o3 == false){
                    y.setText("DAY: " + Character.toString(first.replace("-","").charAt(0))+ Character.toString(second.replace("-","").charAt(0)));
                }
                else if(o1 == true && o2 == true && o3 == false){
                    y.setText("YEAR: " + Character.toString(first.replace("-","").charAt(0))+ Character.toString(second.replace("-","").charAt(0)));
                }


               // System.out.println(first.replace("-","").charAt(0));

                //System.out.println(second.replace("-","").charAt(0));
               // y.setText(second.replace(".",""));


               // z.setText(Character.toString(second.replace("-","").charAt(0)));

<<<<<<< HEAD
               // s1 = (String)x.getText();
                s = (String)y.getText();
                String[] st = s.split(" ");
                str = st[1];
                System.out.println(str);
=======
               // s1 = (String)x.getText();*/
              /*  String s;
                s = (String)y.getText();
                String[] st = s.split(" ");
                str = st[1];
                System.out.println(str);*/

            }
        });

        bb = (Button)findViewById(R.id.b2);
        bb.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
               // final float m = t1;
              /*  final float m = t1;
>>>>>>> origin/master
                final float n = t2;

                String first = Float.toString(m);
                String s;


                String second = Float.toString(n);


                if(o1 == false && o2 == false && o3 == false){
                    y.setText("MONTH: " + Character.toString(first.replace("-","").charAt(0))+ Character.toString(second.replace("-","").charAt(0)));
                }
                else if(o1 == true && o2 == false && o3 == false){
                    y.setText("DAY: " + Character.toString(first.replace("-","").charAt(0))+ Character.toString(second.replace("-","").charAt(0)));
                }
                else if(o1 == true && o2 == true && o3 == false){
                    y.setText("YEAR: " + Character.toString(first.replace("-","").charAt(0))+ Character.toString(second.replace("-","").charAt(0)));
                }


                // System.out.println(first.replace("-","").charAt(0));

                //System.out.println(second.replace("-","").charAt(0));
                // y.setText(second.replace(".",""));


                // z.setText(Character.toString(second.replace("-","").charAt(0)));

                // s1 = (String)x.getText();
                s = (String)y.getText();
                String[] st = s.split(" ");
                str = st[1];
                System.out.println(str);
<<<<<<< HEAD

                String s1 = e.getText().toString();
                System.out.println(s);

                try{
=======
                */
               // String s1 = e.getText().toString();
               // System.out.println(s);


              /*  try{
>>>>>>> origin/master
                    String[] st1 = s1.split("/");
                    mon = st1[0];
                    day = st1[1];
                    yer = st1[2];
<<<<<<< HEAD
                    System.out.println(".."+str);
                    System.out.println(mon);
                    System.out.println(day);
                    System.out.println(yer);

                    if(o1 == false && o2 == false && o3 == false){
                       // System.out.println("yes");
                        if(str.equals(mon)){

                            z.setText(mon+"/##/##");
                            o1 = true;
                        }
                    }
                    else if(o1 == true && o2 == false && o3 == false){
                        if(str.equals(day)){

                            z.setText(mon+ "/" + day + "/##");
                            o2 = true;
                        }
                    }
                    else if(o1 == true && o2 == true && o3 == false){
                        if(str.equals(yer)){

                            z.setText(mon+ "/" + day + "/" + yer);
                            o3 = true;
                        }
=======
                    int mm = Integer.parseInt(mon);
                    int dd = Integer.parseInt(day);
                   // int yy = Integer.parseInt(yer);
                   /* System.out.println(".."+str);
                    System.out.println(mon);
                    System.out.println(day);
                    System.out.println(yer);*/
                  /*  if((1 <= mm && mm <= 12) && (1 <= dd && dd <= 31)) {

                        if (o1 == false && o2 == false && o3 == false) {
                            // System.out.println("yes");
                            if (str.equals(mon)) {

                                z.setText(mon + "/##/##");
                                o1 = true;
                            }
                        } else if (o1 == true && o2 == false && o3 == false) {
                            if (str.equals(day)) {

                                z.setText(mon + "/" + day + "/##");
                                o2 = true;
                            }
                        } else if (o1 == true && o2 == true && o3 == false) {
                            if (str.equals(yer)) {

                                z.setText(mon + "/" + day + "/" + yer);
                                o3 = true;
                            }
                        }
                    }
                    else{
                        e.setText("Please enter your birth day",TextView.BufferType.EDITABLE);
>>>>>>> origin/master
                    }
                }
                catch (Exception ex){
                    e.setText("Please enter your birth day",TextView.BufferType.EDITABLE);
<<<<<<< HEAD
                }
            }
        });

        bbb = (Button)findViewById(R.id.finish);
=======
                }*/

                if(o1 == true && o2 == true && o3 == true){
                    z.setText("CORRECT");
                }
                else{
                    z.setText("TRY AGAIN");
                }

            }
        });

        bbb = (Button)findViewById(R.id.b3);
        bbb.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(o1 == true && o2 == true && o3 == true) {
                    Intent i = new Intent(satan3.this, satan2.class);
                    startActivity(i);
                }
            }
        });

        bbbb = (Button)findViewById(R.id.back);
        bbbb = (Button)findViewById(R.id.b4);
        bbbb.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent i = new Intent(satan3.this, satan2.class);
                startActivity(i);

            }
        });

        bbbbb = (Button)findViewById(R.id.b5);
        bbbbb.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent i = new Intent(satan3.this, MainActivity.class);
                startActivity(i);

            }
        });
    }


    @Override
    public void onSensorChanged(SensorEvent event) {
        t1 = event.values[0];
        t2 = event.values[1];
        //final float m = t1;
        //final float n = t2;

        String first = Float.toString(t1);
        String s;


        String second = Float.toString(t2);


        if(o1 == false && o2 == false && o3 == false){
            y.setText("MONTH: " + Character.toString(first.replace("-","").charAt(0))+ Character.toString(second.replace("-","").charAt(0)));
        }
        else if(o1 == true && o2 == false && o3 == false){
            y.setText("DAY: " + Character.toString(first.replace("-","").charAt(0))+ Character.toString(second.replace("-","").charAt(0)));
        }
        else if(o1 == true && o2 == true && o3 == false){
            y.setText("YEAR: " + Character.toString(first.replace("-","").charAt(0))+ Character.toString(second.replace("-","").charAt(0)));
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
    public class MalibuCountDownTimer extends CountDownTimer
    {

        public MalibuCountDownTimer(long start, long interval)
        {
            super(start, interval);
        }

        @Override
        public void onFinish()
        {
            Intent i = new Intent(satan3.this, MainActivity.class);
            startActivity(i);
        }

        @Override
        public void onTick(long millisUntilFinished)
        {
            text1.setText("TIME REMAIN: " + millisUntilFinished);
            rest = start - millisUntilFinished;
            text2.setText("TIME ELAPSED: " + String.valueOf(rest));
        }
    }
}