package tw.edu.tut.mis.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private  final  String TAG = "ooxx MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v(TAG,"fsadfasfasfas");
        Log.i(TAG,"This is a book");
        super.onCreate(savedInstanceState);
        Log.d(TAG,"This is a book");
        setContentView(R.layout.activity_main);
        Log.w(TAG, "This is a book");
        Log.e(TAG,"This is a book");
    }
}
