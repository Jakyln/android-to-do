package com.example.td_to_do;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.td_to_do.pojos.Todo;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.List;

public class AddToDoActivity extends AppCompatActivity {
    private Button btnAdd;
    private Button btnCancel;
    private EditText editTextToDo;
    private Spinner spUrgency;
    private List<Todo> todos = new ArrayList<Todo>();
    private final String TAG = "ToDoActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_do);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnCancel = findViewById(R.id.btnCancel);
        editTextToDo  = (EditText)findViewById(R.id.editTextToDo);
        spUrgency = findViewById(R.id.spUrgency);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String textgdd = editTextToDo.getEditText().ToString();

                if(editTextToDo.getText().toString()!=""){
                    //on check si user a rien ecrit
                    String testName = editTextToDo.getText().toString();
                    todos.add(new Todo(testName, "testUrgence1"));
                    //Todou toDo1 = new Todoj (testName, "testUrgence1");
                    //Log.d(TAG,"Todo added - Name = " + toDo1.getName() +" - Urgency = " + toDo1.getUrgency());
                    Log.d(TAG,"Todo added - Name = ");

                }
                else{
                        //on ajoute le input dans name de todos et on met par défaut le urgency à low
                }

            }
        });
    }
}