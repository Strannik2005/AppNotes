package com.example.notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        settingsToolbar();
    }


    private void settingsToolbar() {

        TextView tvToolbar = findViewById(R.id.tv_name_of_note);
        String nameItem = getIntent().getExtras().getString("key_name_note");
        tvToolbar.setText(nameItem);


        Toolbar t = findViewById(R.id.toolbar_content_main);
        setSupportActionBar(t);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        t.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }


    private void initBtHelper(){
        ImageButton shareBt = findViewById(R.id.bt_share);
        ImageButton deleteBt = findViewById(R.id.bt_delete);
        ImageButton notificationBt = findViewById(R.id.bt_notification);


    }

}