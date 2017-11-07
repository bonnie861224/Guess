package guess.fju.com.guess;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random r = new Random();
    int a= r.nextInt(10) + 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void guess(View view) {
        EditText edNumber = (EditText) findViewById(R.id.b);
        int num = Integer.parseInt(edNumber.getText().toString());

        if (a > num) {
            Toast.makeText(this, "大一點",  Toast.LENGTH_LONG).show();
        } else if (a < num) {
            Toast.makeText(this, "小一點",  Toast.LENGTH_LONG).show();
        } else{
            Toast.makeText(this, "答對了",  Toast.LENGTH_LONG).show();
        new AlertDialog.Builder(this)
                .setMessage(Integer.toString(num))
                .setPositiveButton("OK", null)
                .show();
    }
}
}
