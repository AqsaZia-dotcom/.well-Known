package com.ahmad.cv.activities;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.ahmad.cv.base.R;;

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder> {

        private String[] data;
        public ProgrammingAdapter(String[] data)
        {
            this.data = data;
        }

        @NonNull
        @Override
        public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            LayoutInflater inflator = LayoutInflater.from(parent.getContext());
            View view = inflator.inflate(R.layout.list_item_layout, parent,false);

            return new ProgrammingViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ProgrammingViewHolder holder, int position) {
            String title = data[position];
            holder.textTitle.setText(title);
        }


        @Override
        public int getItemCount() {
            return data.length;
        }

        public class ProgrammingViewHolder extends RecyclerView.ViewHolder{

            ImageView imageicon;
            TextView textTitle;

            public ProgrammingViewHolder(@NonNull View itemView) {
                super(itemView);
                imageicon = itemView.findViewById(R.id.addressIcon);
                textTitle = itemView.findViewById(R.id.addressTitle);
            }
        }
    }

