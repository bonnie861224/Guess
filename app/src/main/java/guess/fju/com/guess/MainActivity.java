package guess.fju.com.guess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random random = new Random();
    int ram= random.nextInt(10) + 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void guess(View view) {
        TextView r = (TextView)findViewById(R.id.t_n);
        r.setText(Integer.toString(ram));
        EditText edNumber = (EditText) findViewById(R.id.ed_number);
        int num = Integer.parseInt(edNumber.getText().toString());
        TextView n = (TextView) findViewById(R.id.t_m);
        if (ram > num) {
            n.setText("大一點");
 //           Toast.makeText(this, "大一點",  Toast.LENGTH_LONG).show();
        } else if (ram < num) {
            n.setText("小一點");
 //           Toast.makeText(this, "小一點",  Toast.LENGTH_LONG).show();
        } else{
            n.setText("答對了");
 /*           Toast.makeText(this, "答對了",  Toast.LENGTH_LONG).show();
        new AlertDialog.Builder(this)
                .setMessage(Integer.toString(num))
                .setPositiveButton("OK", null)
                .show();     */
    }
}
}
