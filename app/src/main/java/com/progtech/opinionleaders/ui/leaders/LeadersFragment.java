package com.progtech.opinionleaders.ui.leaders;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;

import com.progtech.opinionleaders.R;

import java.util.ArrayList;
import java.util.List;

public class LeadersFragment extends Fragment {

    private LeadersViewModel leadersViewModel;
    List<LeaderProfile> leaderProfiles = new ArrayList<>();
    RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        leadersViewModel =
                ViewModelProviders.of(this).get(LeadersViewModel.class);
        View root = inflater.inflate(R.layout.fragment_leaders, container, false);
        //final TextView textView = root.findViewById(R.id.text_gallery);
        setInitialData();
        recyclerView = root.findViewById(R.id.recyclerLeaders);
        // создаем адаптер
        LeaderProfileAdapter adapter = new LeaderProfileAdapter(getContext(), leaderProfiles);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);

        /*
        leadersViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                //textView.setText(s);
            }
        });

         */
        return root;
    }

    private void setInitialData(){

        leaderProfiles.add(new LeaderProfile ("Иван", "Иванов", R.drawable.ic_user));
        leaderProfiles.add(new LeaderProfile ("Пётр", "Петров", R.drawable.ic_user));
        leaderProfiles.add(new LeaderProfile ("Василий", "Васильев", R.drawable.ic_user));
        leaderProfiles.add(new LeaderProfile ("Леонид", "Леонидов", R.drawable.ic_user));
        leaderProfiles.add(new LeaderProfile ("Ilon", "Mask", R.drawable.ic_user));
        leaderProfiles.add(new LeaderProfile ("German", "Gref", R.drawable.ic_user));
    }
}
