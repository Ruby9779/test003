package tw.edu.pu.s1071475.test003;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void myfun(View btnView){

        EditText et=(EditText) findViewById(R.id.EditText2);
        TextView tv=(TextView) findViewById(R.id.TextView);
        tv.setText(et.getText());
    }
}


