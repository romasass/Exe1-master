package afeka.com.exe1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class EasyActivity extends AppCompatActivity {

    int rows = 2;
    int sec = 30;
    int[] names= {R.drawable.kitkat, R.drawable.donut};
    int[] imgArr = new int[rows*rows];

    Random rand = new Random();
    Button btn1, btn2, btn3, btn4;
    Button tmpBtn;
    boolean oneTileOpen = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);

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
    public void buildTable(int rows){
        int x = 0;
        int y = 0;

        for (int i = 0; i < names.length; i++) {

            x = rand.nextInt(rows*rows);
            y = rand.nextInt(rows*rows);
            while (imgArr[x] == 0 && imgArr[y] == 0) {
                if (imgArr[x] == 0)
                    imgArr[x]  = names[i];

                if (imgArr[y] == 0)
                    imgArr[y] = names[i];

            }
        }
    }
}
