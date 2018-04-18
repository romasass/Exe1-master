package afeka.com.exe1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GameActivity extends AppCompatActivity {

    public static final String EXT_NAME = "EXT_NAME";
    public static final String EXT_ROW = "EXT_ROW";
    public static final String EXT_TIME = "EXT_TIME";
    public static  String p_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.EXT_NAME);
        p_name = name;
        int age = intent.getIntExtra(MainActivity.EXT_AGE,0);

        TextView textView1 = (TextView) findViewById(R.id.welcome);
        textView1.setText("name:" + name + " age:" + age);

    }

    public void btnEasy(View view){play(2,30, EasyActivity.class);}
    public void btnMedium(View view){play(4,45,MediumActivity.class);}
    public void btnHard(View view){play(5,60,EasyActivity.class);}

    public void play(int rows,int time, Class activity){

        Intent intent = new Intent(this,activity);
        intent.putExtra(EXT_NAME,p_name);
        intent.putExtra(EXT_ROW,rows);
        intent.putExtra(EXT_TIME,time);
        startActivity(intent);
    }
}
