package afeka.com.exe1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MediumActivity extends AppCompatActivity {


    int[] names= {R.drawable.cupcake, R.drawable.ice_cream, R.drawable.jelly, R.drawable.kitkat,
                  R.drawable.lollipop, R.drawable.donut, R.drawable.eclair,R.drawable.froyo};
    int rows = 4;
    int sec = 45;
    int[] imgArr = new int[rows*rows];
    Random rand = new Random();
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16;
    boolean oneTileOpen = false;
    Button tmpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium);

        Intent intent = getIntent();
        String name = intent.getStringExtra(GameActivity.EXT_NAME);
        TextView nameView = (TextView) findViewById(R.id.name);
        nameView.setText("name:" + name + " row:" + rows + " time: " + sec);

        buildTable(rows);

        btn1 = (Button)findViewById(R.id.b1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn1.setBackgroundResource(imgArr[0]);
                if(!oneTileOpen)
                    tmpBtn = btn1;
                else
                    checkButton(btn1);
            }
        });
        btn2 = (Button)findViewById(R.id.b2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn2.setBackgroundResource(imgArr[1]);
                if(!oneTileOpen)
                    tmpBtn = btn2;
                else
                    checkButton(btn2);
            }
        });
        btn3 = (Button)findViewById(R.id.b3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn3.setBackgroundResource(imgArr[2]);
                if(!oneTileOpen)
                    tmpBtn = btn3;
                else
                    checkButton(btn3);
            }
        });
        btn4 = (Button)findViewById(R.id.b4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn4.setBackgroundResource(imgArr[3]);
                if(!oneTileOpen)
                    tmpBtn = btn4;
                else
                    checkButton(btn4);
            }
        });
        btn5 = (Button)findViewById(R.id.b5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn5.setBackgroundResource(imgArr[4 ]);
                if(!oneTileOpen)
                    tmpBtn = btn5;
                else
                    checkButton(btn5);
            }
        });
        btn6 = (Button)findViewById(R.id.b6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn6.setBackgroundResource(imgArr[5 ]);
                if(!oneTileOpen)
                    tmpBtn = btn6;
                else
                    checkButton(btn6);
            }
        });
        btn7 = (Button)findViewById(R.id.b7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn7.setBackgroundResource(imgArr[6]);
                if(!oneTileOpen)
                    tmpBtn = btn7;
                else
                    checkButton(btn7);
            }
        });
        btn8 = (Button)findViewById(R.id.b8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn8.setBackgroundResource(imgArr[7]);
                if(!oneTileOpen)
                    tmpBtn = btn8;
                else
                    checkButton(btn8);
            }
        });
        btn9 = (Button)findViewById(R.id.b9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn9.setBackgroundResource(imgArr[8]);
                if(!oneTileOpen)
                    tmpBtn = btn9;
                else
                    checkButton(btn9);
            }
        });
        btn10 = (Button)findViewById(R.id.b10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn10.setBackgroundResource(imgArr[9]);
                if(!oneTileOpen)
                    tmpBtn = btn10;
                else
                    checkButton(btn10);
            }
        });
        btn11 = (Button)findViewById(R.id.b11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn11.setBackgroundResource(imgArr[10]);
                if(!oneTileOpen)
                    tmpBtn = btn11;
                else
                    checkButton(btn11);
            }
        });
        btn12 = (Button)findViewById(R.id.b12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn12.setBackgroundResource(imgArr[11]);
                if(!oneTileOpen)
                    tmpBtn = btn12;
                else
                    checkButton(btn12);
            }
        });
        btn13 = (Button)findViewById(R.id.b13);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn13.setBackgroundResource(imgArr[12]);
                if(!oneTileOpen)
                    tmpBtn = btn13;
                else
                    checkButton(btn13);
            }
        });
        btn14 = (Button)findViewById(R.id.b14);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn14.setBackgroundResource(imgArr[13]);
                if(!oneTileOpen)
                    tmpBtn = btn14;
                else
                    checkButton(btn14);
            }
        });
        btn15 = (Button)findViewById(R.id.b15);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn15.setBackgroundResource(imgArr[14]);
                if(!oneTileOpen)
                    tmpBtn = btn15;
                else
                    checkButton(btn15);
            }
        });
        btn16 = (Button)findViewById(R.id.b16);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn16.setBackgroundResource(imgArr[15]);
                if(!oneTileOpen)
                    tmpBtn = btn16;
                else
                    checkButton(btn16);
            }
        });
    }
    public void checkButton(Button tmp){

        if (tmp.getBackground() != tmpBtn.getBackground()){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {

                }
            }, 2000);
            Button nttn = new Button(this);
            nttn.setId(tmpBtn.getId());
            nttn.setBackgroundColor(808080);

            nttn.setId(tmp.getId());
            nttn.setBackgroundColor(808080);
            oneTileOpen = false;
        }
    }
    //timer
           /* new CountDownTimer(1000*time, 1000) {
            TextView timerView = (TextView) findViewById(R.id.timer);
            public void onTick(long millisUntilFinished) {
                timerView.setText("seconds remaining: " + millisUntilFinished /1000);
            }

            public void onFinish() {
                timerView.setText("done!");
            }
        }.start();*/

    public void buildTable(int rows){
        int x = 0;
        int y = 0;

        for (int i = 0; i < names.length; i++) {

            x = rand.nextInt(rows*rows);
            y = rand.nextInt(rows*rows);
            while (imgArr[x] == 0 && imgArr[y] == 0) {
                if (imgArr[x] == 0) {
                    imgArr[x] = names[i];
                }
                if (imgArr[y] == 0) {
                    imgArr[y] = names[i];
                }
            }
        }
    }
}