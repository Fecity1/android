package com.progtech.opinionleaders.ui.initiatives;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;

import com.progtech.opinionleaders.R;
import com.progtech.opinionleaders.ui.leaders.LeaderProfile;
import com.progtech.opinionleaders.ui.leaders.LeaderProfileAdapter;

import java.util.ArrayList;
import java.util.List;

public class InitiativesFragment extends Fragment {

    private InitiativesViewModel initiativesViewModel;
    List<InitiativeInfo> initiatives = new ArrayList<>();
    RecyclerView recyclerInitiatives;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        initiativesViewModel =
                ViewModelProviders.of(this).get(InitiativesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_initiatives, container, false);

        setInitialData();
        recyclerInitiatives = root.findViewById(R.id.recyclerInitiatives);
        // создаем адаптер
        InitiativeInfoAdapter adapter = new InitiativeInfoAdapter(getContext(), initiatives);
        // устанавливаем для списка адаптер
        recyclerInitiatives.setAdapter(adapter);

        /*
        final TextView textView = root.findViewById(R.id.text_slideshow);
        initiativesViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

         */

        return root;
    }

    private void setInitialData(){

        initiatives.add(new InitiativeInfo("Заголовок 1", "Lorem Lorem 1"));
        initiatives.add(new InitiativeInfo("Заголовок 2", "Lorem Lorem 2"));
        initiatives.add(new InitiativeInfo("Заголовок 3", "Lorem Lorem 3"));
        initiatives.add(new InitiativeInfo("Заголовок 4", "Lorem Lorem 4"));
        initiatives.add(new InitiativeInfo("Заголовок 5", "Lorem Lorem 5"));
        initiatives.add(new InitiativeInfo("Заголовок 6", "Lorem Lorem 6"));
        initiatives.add(new InitiativeInfo("Заголовок 7", "Lorem Lorem 7"));
    }
}
