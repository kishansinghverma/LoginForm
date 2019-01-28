package com.example.loginform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=findViewById(R.id.button);
        ArrayAdapter<CharSequence> adt = ArrayAdapter.createFromResource(this, R.array.my_list, R.layout.support_simple_spinner_dropdown_item);
        final Spinner spn=findViewById(R.id.course);
        spn.setAdapter(adt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str1= ((EditText)findViewById(R.id.sname)).getText().toString();
                String str2= spn.getSelectedItem().toString();
                String str3= ((EditText)findViewById(R.id.fname)).getText().toString();
                String str4= ((EditText)findViewById(R.id.address)).getText().toString();
                String str5= ((EditText)findViewById(R.id.email)).getText().toString();
                String str6= ((EditText)findViewById(R.id.mobile)).getText().toString();


                if(str1.equals("")||str2.equals("Select A Course...")||str3.equals("")||str4.equals("")||str5.equals("")||str6.equals(""))
                    Toast.makeText(MainActivity.this, "Fill All Fields!!", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Submitted SuccessFully", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
