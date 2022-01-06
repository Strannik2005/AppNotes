package com.example.notes;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.notes.adapter.MainAdapter;
import com.example.notes.model.ItemNote;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ItemNote> cardNotes = new ArrayList<ItemNote>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView rvMain = findViewById(R.id.main_recycler);
        MainAdapter adapter = new MainAdapter(this, cardNotes);
        rvMain.setAdapter(adapter);
        rvMain.setLayoutManager(new LinearLayoutManager(this));

        findViewById(R.id.add_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                createDialog();
            }
        });

    }









    private void createDialog(){

        View v = getLayoutInflater().inflate(R.layout.add_note_dialog,null);

        AlertDialog.Builder addNoteDialog = new AlertDialog.Builder(MainActivity.this);
        EditText editNoteName = v.findViewById(R.id.editNoteName);



        addNoteDialog.setView(v)

                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {


                        String nameItemNote = editNoteName.getText().toString();
                        cardNotes.add(new ItemNote(nameItemNote));


                    }
                })

                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        addNoteDialog.create();
        addNoteDialog.show();

    }

}