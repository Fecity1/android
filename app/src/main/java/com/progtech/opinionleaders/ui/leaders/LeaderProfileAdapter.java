package com.progtech.opinionleaders.ui.leaders;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.progtech.opinionleaders.R;

import java.util.List;

public class LeaderProfileAdapter extends RecyclerView.Adapter<LeaderProfileAdapter.ViewHolder> {

    private LayoutInflater inflater;
    private List<LeaderProfile> leaderProfiles;

    LeaderProfileAdapter(Context context, List<LeaderProfile> leaderProfiles) {
        this.leaderProfiles = leaderProfiles;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View root = inflater.inflate(R.layout.leaders_list_item, parent, false);

        final ViewHolder viewHolder = new ViewHolder(root);

        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle bundle = new Bundle();

                int pos = viewHolder.getAdapterPosition();

                bundle.putString("name", leaderProfiles.get(pos).getName());
                bundle.putString("surname", leaderProfiles.get(pos).getSurname());
                bundle.putString("second_name", leaderProfiles.get(pos).getSecondName());
                bundle.putInt("image", leaderProfiles.get(pos).getImage());
                bundle.putString("city", leaderProfiles.get(pos).getCity());
                bundle.putString("about", leaderProfiles.get(pos).getAbout());
                bundle.putInt("rating", leaderProfiles.get(pos).getRating());

                Navigation.findNavController(view).navigate(R.id.leaderDetailFragment, bundle);
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        LeaderProfile leaderProfile = leaderProfiles.get(position);
        holder.imageView.setImageResource(leaderProfile.getImage());
        holder.nameView.setText(leaderProfile.getName());
        holder.surnameView.setText(leaderProfile.getSurname());
        holder.cityView.setText("г. " + leaderProfile.getCity());
        holder.aboutView.setText(leaderProfile.getAbout());
        holder.ratingView.setText(String.format("Рейтинг: %d", leaderProfile.getRating()));
    }

    @Override
    public int getItemCount() {
        return leaderProfiles.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView imageView;
        final TextView nameView, surnameView;
        final TextView cityView, aboutView;
        final TextView ratingView;
        ViewHolder(View view){
            super(view);
            imageView = view.findViewById(R.id.image);
            nameView = view.findViewById(R.id.nameView);
            surnameView = view.findViewById(R.id.surnameView);
            cityView = view.findViewById(R.id.cityView);
            aboutView = view.findViewById(R.id.aboutView);
            ratingView = view.findViewById(R.id.ratingView);
        }
    }
}
