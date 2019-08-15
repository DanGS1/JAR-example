package com.example.myapplicationjar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.lib.MyClass;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        final TextView text = (TextView)findViewById(R.id.textView);
        final EditText editText = (EditText)findViewById(R.id.editText);

        final MyClass myClass = new MyClass();

        System.out.println(myClass.decode("a"));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int x = myClass.decode(editText.getText().toString());

                text.setText(Integer.toString(x));

            }
        });



    }
}
