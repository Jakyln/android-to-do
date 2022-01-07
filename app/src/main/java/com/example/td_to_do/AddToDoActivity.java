package com.example.td_to_do;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
                    //todos.add(new Todo(testName, "testUrgence1"));
                    Todo toDo1 = new Todo (testName, "testUrgence1");
                    todos.add(toDo1);
                    //Log.d(TAG,"Todo added - Name = " + toDo1.getName() +" - Urgency = " + toDo1.getUrgency());
                    Log.d(TAG,"Todo added - Name = ");

                    String toDo = toDo1.getName()+" // "+toDo1.getUrgency();
                    Intent intent=new Intent();
                    intent.putExtra("To Do : ",toDo);

                    setResult(1,intent);
                    finish();

                }
                else{
                        //on ajoute le input dans name de todos et on met par défaut le urgency à low
                }

            }


        });

    }
    @Override
    protected void onStart(){
        super.onStart();

        Log.d(TAG,"onStart() called");
    }

    @Override
    protected void onResume(){
        super.onResume();

        Log.d(TAG,"onResume() called");
    }

    @Override
    protected void onPause(){
        super.onPause();

        Log.d(TAG,"onPause() called");
    }
    @Override
    protected void onStop(){
        super.onStop();

        Log.d(TAG,"onStop() called");
    }

    @Override
    protected void onRestart(){
        super.onRestart();

        Log.d(TAG,"onRestart() called");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();

        Log.d(TAG,"onDestroy() called");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        Log.d(TAG, "onSaveInstanceState() called");

        /*outState.putInt(KEY_INDEX, indexQuestion);
        outState.putInt(KEY_SCORE, score);*/
        //outState.putBoolean(KEY_REPLAY, btnReplay.getVisibility() == View.VISIBLE ? true : false);
    }
}