package com.progtech.opinionleaders.ui.leaders;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;

import com.progtech.opinionleaders.R;

import java.util.ArrayList;
import java.util.List;

public class LeadersFragment extends Fragment {

    private LeadersViewModel leadersViewModel;
    List<LeaderProfile> leaderProfiles;
    RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        leadersViewModel =
                ViewModelProviders.of(this).get(LeadersViewModel.class);
        View root = inflater.inflate(R.layout.fragment_leaders, container, false);
        //final TextView textView = root.findViewById(R.id.text_gallery);

        recyclerView = root.findViewById(R.id.recyclerLeaders);

        leaderProfiles = new ArrayList<>();
        setInitialData();

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

    private void setInitialData() {

        leaderProfiles.add(new LeaderProfile ("Руслан", "Бабажанов",
                "Темерович", R.drawable.avatar_img,
                "Железногорск", "Участник Хаккатона", 5000));
        leaderProfiles.add(new LeaderProfile ("Артём", "Посунько", "", R.drawable.leader_02,
                "Екатеринбург", "Участник Хаккатона", 5000));
        leaderProfiles.add(new LeaderProfile ("Ангелина", "Нестерова", "", R.drawable.leader_03,
                "Санкт-Петербург", "Участник Хаккатона", 5000));
        leaderProfiles.add(new LeaderProfile ("Сергей", "Миронов", "", R.drawable.leader_04,
                "Железногорск", "Участник Хаккатона", 5000));
        leaderProfiles.add(new LeaderProfile ("Андрей", "Иванов", "", R.drawable.leader_05,
                "Екатеринбург", "Участник Хаккатона", 5000));

        leaderProfiles.add(new LeaderProfile ("Илон", "Маск", "", R.drawable.leader_06,
                "Марс", "Founder, CEO", 4000));
        leaderProfiles.add(new LeaderProfile ("Герман", "Греф", "Оскарович", R.drawable.leader_07,
                "Москва", "Президент Сбербанка России", 4000));

    }
}
