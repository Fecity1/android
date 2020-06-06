package com.progtech.opinionleaders;

import androidx.core.content.ContextCompat;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class LeaderDetailFragment extends Fragment {

    private LeaderDetailViewModel mViewModel;

    public static LeaderDetailFragment newInstance() {
        return new LeaderDetailFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.leader_detail_fragment, container, false);

        Bundle bundle = getArguments();
        assert bundle != null;

        TextView detailNameView = root.findViewById(R.id.detailNameView);
        TextView detailSurnameView = root.findViewById(R.id.detailSurnameView);
        TextView detailPatronomicView = root.findViewById(R.id.detailPatronomicView);
        ImageView detailImageView = root.findViewById(R.id.detailImageView);

        detailNameView.setText(bundle.getString("name"));
        detailSurnameView.setText(bundle.getString("surname"));
        detailPatronomicView.setText(bundle.getString("second_name"));
        detailImageView.setImageDrawable(
                ContextCompat.getDrawable(getContext(),
                bundle.getInt("image"))
        );

        /*
        bundle.putString("name", leaderProfiles.get(pos).getName());
        bundle.putString("surname", leaderProfiles.get(pos).getSurname());
        bundle.putInt("image", leaderProfiles.get(pos).getImage());
        bundle.putString("city", leaderProfiles.get(pos).getCity());
        bundle.putString("about", leaderProfiles.get(pos).getAbout());
        bundle.putInt("rating", leaderProfiles.get(pos).getRating());
        */

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(LeaderDetailViewModel.class);
        // TODO: Use the ViewModel


    }

}
