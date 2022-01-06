package com.example.notes.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.notes.ContentActivity;
import com.example.notes.MainActivity;
import com.example.notes.R;
import com.example.notes.model.ItemNote;

import org.w3c.dom.Text;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    LayoutInflater inflater;
    List<ItemNote> notes;
    Context cxt;

    public MainAdapter(Context cxt,  List<ItemNote> notes) {
        this.inflater = LayoutInflater.from(cxt);;
        this.notes = notes;
        this.cxt = cxt;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.main_item_note, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int position) {
        ItemNote n = notes.get(position);
        h.tvNameNote.setText(n.getNameOfNote());

        h.cardItemNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        h.btMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNameNote;
        ImageButton btMore;
        CardView cardItemNote;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNameNote = itemView.findViewById(R.id.name_of_note);
            btMore = itemView.findViewById(R.id.bt_note_more);
            cardItemNote = itemView.findViewById(R.id.cardItemNote);
        }
    }
}
