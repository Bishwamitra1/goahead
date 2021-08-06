package bishwa.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.util.Log;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
        public void disable(View v) {
            v.setEnabled(false);  //disabled when a  button is pressed
            Button button = (Button) v; // v is an object which has type view, we cast the object to a button
            button.setText("O");
        }

     */

}