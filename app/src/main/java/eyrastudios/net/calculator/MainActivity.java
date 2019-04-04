package eyrastudios.net.calculator;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button Zero;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button dot;
    private TextView info;
    private TextView result;
    private Button equals;
    private final char Addition = '+';
    private final char Subtraction = '-';
    private final char Division = '/';
    private final char Multiplication ='*';
    private final char Equal = '=';
    private double value1 = Double.NaN;
    private double value2;
    private char Act;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();

        Zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "9");
            }
        });


        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               solve();
               Act =Division;
               result.setText(String.valueOf(value1)+ "/");
               info.setText(null);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solve();
                Act = Multiplication;
                result.setText(String.valueOf(value1)+ "*");
                info.setText(null);

            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + ".");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solve();
                Act = Addition;
                result.setText(String.valueOf(value1) + "+");
                info.setText(null);
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solve();
                Act = Equal;
                result.setText(String.valueOf(value1) + String.valueOf(value2)+ "=");
            }
        });






    }

    private void setupUIViews(){

        one = (Button) findViewById(R.id.btn1);
        two = (Button) findViewById(R.id.btn2);
        three = (Button) findViewById(R.id.btn3);
        four = (Button) findViewById(R.id.btn4);
        five = (Button) findViewById(R.id.btn5);
        six = (Button) findViewById(R.id.btn6);
        seven = (Button) findViewById(R.id.btn7);
        eight = (Button) findViewById(R.id.btn8);
        nine = (Button) findViewById(R.id.btn9);
        Zero = (Button) findViewById(R.id.btn0);
        add = (Button) findViewById(R.id.btnplus);
        mul = (Button) findViewById(R.id.btntimes);
        div = (Button) findViewById(R.id.btndivide);
        result = (TextView) findViewById(R.id.ResultID);
        info = (TextView) findViewById(R.id.ctrlID);
        result = (TextView) findViewById(R.id.ResultID);
        dot = (Button) findViewById(R.id.btndot);
        equals = (Button) findViewById(R.id.btnequal);



    }

    private void solve(){
        if(!Double.isNaN(value1)){
            value2 = Double.parseDouble(info.getText().toString());

            switch (Act){
                case  Addition:
                    value1 = value1 + value2;
                    break;

                case Division :
                    value1 = value1/value2;
                    break;

                case Multiplication:
                    value1 = value1*value2;
                    break;


            }
        }
        else{
            value1 = Double.parseDouble(info.getText().toString());
        }
    }

}
