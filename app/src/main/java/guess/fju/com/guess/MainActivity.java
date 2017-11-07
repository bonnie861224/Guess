package guess.fju.com.guess;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void number(View view){
        EditText edNumber = (EditText) findViewById(R.id.b);
        int number =Integer.parseInt(edNumber.getText().toString());
        Random r=new Random();
        int a,b;
        a=r.nextInt(10)+1;
        if (a>b)
            System.out.println("大一點");
        else if (a<b)
            System.out.println("小一點");
        else
            System.out.println("答對了");
        new AlertDialog.Builder(this).setPositiveButton("OK",null).show();
    }

}
