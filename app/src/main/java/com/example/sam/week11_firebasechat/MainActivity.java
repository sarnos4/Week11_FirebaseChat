package com.example.sam.week11_firebasechat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private Button sendBtn;
    EditText editText;
    ArrayAdapter<String> adapter;
    ArrayList<String> lstOfMsgs=new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendBtn=(Button)findViewById(R.id.send_msg);
        editText=(EditText)findViewById(R.id.input_msg);

        listView = (ListView) findViewById(R.id.lstview);
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, lstOfMsgs);
        listView.setAdapter(adapter);

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                adapter.add(editText.getText().toString());
            }
        });
    }
}
