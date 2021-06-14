package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    class Number{
        int num;
        public boolean isTraingle(){
            int sum=1;
            for(int i=2;i<=num;i++){
                if(num==sum)
                {
                    return true;

                }
                else
                    sum=sum+i;

            }
            return false;
        }

        public boolean isSquare(){
            if((Math.sqrt(num))%1==0)
                return true;
            else
                return false;
        }
    }
    public void click(View View) {

        Number number = new Number();
        EditText numb = (EditText) findViewById(R.id.editTextNumber);
        number.num = Integer.parseInt(numb.getText().toString());
        if ((number.isTraingle())&&(number.isSquare())) {
            Toast.makeText(this, "number is triangle as well as square", Toast.LENGTH_LONG).show();
        }else
        if (number.isSquare()) {
            Toast.makeText(this, "number is square", Toast.LENGTH_LONG).show();
        }
        else if(number.isTraingle()){
            Toast.makeText(this, "number is triangle", Toast.LENGTH_LONG).show();
        }
        else
            Toast.makeText(this, "number is neither triangle nor square", Toast.LENGTH_LONG).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}