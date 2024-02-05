package ui;
import androidx.annotation.NonNull;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;


import com.example.lab_1.R;
import com.example.lab_1.databinding.ActivityMainBinding;

import data.MainViewModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activitybinding;
private MainViewModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activitybinding =ActivityMainBinding.inflate(getLayoutInflater());
       // setContentView(R.layout.activity_main);
        @NonNull ActivityMainBinding bindingVar = ActivityMainBinding.inflate(getLayoutInflater());
        ActivityMainBinding variableBinding = null;
        setContentView(variableBinding.getRoot());
        // setContentView(R.layout.activity_main);


        EditText myedit=findViewById(R.id.myedittext);
        Button mybutton=findViewById (R.id.mybutton);
        TextView mytext= findViewById (R.id.textview);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTextContent = myedit.getText().toString();
                mytext.setText("Your Name Is: " + editTextContent);
            }


        });
    }
}