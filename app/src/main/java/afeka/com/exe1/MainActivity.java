package afeka.com.exe1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    final String TAG = "Exe1";
    public static final String EXT_NAME = "EXT_NAME";
    public static final String EXT_AGE = "EXT_AGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

}

    public void btn1Click(View view){startGame();
    }

   public void startGame(){
       EditText editText1 = (EditText) findViewById(R.id.name);
       EditText editText2 = (EditText) findViewById(R.id.age);
       String name = editText1.getText().toString();
       int age = Integer.parseInt(editText2.getText().toString());

       Intent intent = new Intent(this,GameActivity.class);
       intent.putExtra(EXT_NAME,name);
       intent.putExtra(EXT_AGE,age);
       startActivity(intent);
   }





    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG,"e-onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"e-onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"e-onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG,"e-onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"e-onDestroy");
    }

    //onclickListener
    @Override
    public void onClick(View view) {
        Log.e(TAG,"e-onClick btn3");
    }
}
