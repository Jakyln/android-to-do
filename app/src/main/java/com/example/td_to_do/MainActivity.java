package com.example.td_to_do;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.td_to_do.pojos.Todo;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.List;
//METTRE EDIT TEXT AU LIEU DE TEXT LAYOUT POUR TODOs
public class MainActivity extends AppCompatActivity {
    private TextView tvTodos; //dans activity main

    private List<Todo> todos = new ArrayList<Todo>();
    private int indexTodo = 0;
    private Todo todo;
    private final String TAG = "ToDoActivity";
    private static final String KEY_INDEX = "index";
    private static final String KEY_add = "add";
    public static final String KEY_TODO = "todo";
    private boolean isEmpty = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate() called");

        // on récupère les léments du layout
        tvTodos = findViewById(R.id.tvTodos);
        /*if(isEmpty){
            tvTodos.setText("PAS DE TACHES");
            tvTodos.append("\n");
            tvTodos.append("Pour ajouter une tache, appuyer sur 'Add To Do'");
        }*/
        /*if(tvTodos.getText().toString().equals("")){
            tvTodos.setText("PAS DE TACHES");
            tvTodos.append("\n");
            tvTodos.append("Pour ajouter une tache, appuyer sur 'Add To Do'");
        }*/




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        //crée le menu
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    //Lorsqu'on choisit le add to do
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuItemAddToDo:

                Intent intent=new Intent(MainActivity.this,AddToDoActivity.class);
                startActivityForResult(intent, 1);// Activity is started with requestCode 2
                return true;
        }


        return super.onOptionsItemSelected(item);
    }


    // Recupere le to do de l'autre activité
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        // check if the request code is same as what is passed  here it is 2
        if(requestCode==1 && resultCode == RESULT_OK)
        {
            //isEmpty=false;
            Todo newTodo = (Todo) data.getSerializableExtra("To Do : ");
            //String message=data.getStringExtra("To Do : "); //attention, le string doit etre le meme que celui inséré dans le Intent dans AddToDoAcTivity
            //tvTodos.setText(message);
            String lesToDo = newTodo.getName()+" // "+newTodo.getUrgency(); //Je met le nom et l'urgence dans un même string, puis je l'envoie
            tvTodos.append("\n");
            //String toDo = todo.getName()+" // "+todo.getUrgency(); //Je met le nom et l'urgence dans un même string, puis je l'envoie
            tvTodos.append(lesToDo);
        }
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
    protected void onSaveInstanceState(@NonNull Bundle outState){
        super.onSaveInstanceState(outState);

        Log.d(TAG,"SaveInstanceState() called");
    }
}