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

        initiatives.add(new InitiativeInfo("Челябинск. Ликвидация отнесенного правого поворота " +
                "на пересечении проспекта Ленина с улицей Красная",
                "Несколько лет назад был " +
                "организован отнесенный правый поворот для движения транспорта с проспекта Ленина на " +
                "улицу Красную. При этом широкая зона тротуара ближе к улице Красной значительно " +
                "сужается и заканчивается тупиком, а для продолжения движения вдоль проспекта Ленина " +
                "пешеходы вынуждены переходить по светофору дополнительную полосу движения."));
        initiatives.add(new InitiativeInfo("Копейск. Чем занять детей в каникулы: ваше мнение",
                "Каникулы — самая любимая школьная пора. Хорошо бы вырваться всей семьей в путешествие, " +
                        "забыть о буднях, насладиться отдыхом и беззаботно провести время, но, увы, такая возможность " +
                        "есть не всегда. Впрочем, это не повод настраивать ребенка на штудирование учебников или ругать " +
                        "его за бесконечное сидение с планшетом или перед телевизором.\n" +
                        "Экскурсии и поездки, организованные в школах города, — это интересные и познавательные " +
                        "путешествия по родному краю, благодаря которым ребята смогут не только отдохнуть, но и узнать что-то новое.\n" +
                        "Какие мероприятия организовать в школах во время каникул, решать жителям.\n" +
                        "Голосование продлится до 11.11.2019.\n" +
                        "Голосование доступно для пользователей с подтвержденными учетными записями ЕСИА."));
        initiatives.add(new InitiativeInfo("Создание ландшафтного парка на территории Сада камней",
                "Вдоль набережной реки Миасс, между Краеведческим музеем и ул. Красная расположена большая территория, " +
                        "которая в настоящее время нуждается в комплексном благоустройстве. Частным инвестором разработан " +
                        "проект развития этого пространства, который предполагает благоустройство набережной и создание абсолютно нового для Челябинска вида общественного пространства — ландшафтного парка. Вход на основную территорию парка сделают платным, предусмотрев льготные тарифы для отдельных групп населения. Подобный проект «Сады мечты» уже реализован в Красноярске.\n" +
                        "\n" +
                        "Проектом также предусмотрена облагороженная общественная набережная зона на всем протяжении парка " +
                        "вдоль реки. Здесь появятся новые деревья, кустарники и газоны, удобные скамейки и небольшие торговые " +
                        "точки с сувенирами, места для художников и просто любителей посидеть у реки. Общественное пространство " +
                        "набережной будет открыто для свободного посещения всеми жителями и гостями Челябинска.\n" +
                        "\n" +
                        "Челябинцев просят высказать свое мнение о концептуально новом платном общественном пространстве, к " +
                        "созданию которого могут приступить уже в этом году."));
        initiatives.add(new InitiativeInfo("Концепция главного ледового городка города Челябинска",
                "Ежегодно на Площади Революции возводится главный ледовый городок Челябинска. " +
                        "Традиционно, в новогодние каникулы, ледяная сказка приглашает в гости челябинцев " +
                        "и гостей города. Из года в год ледовый городок подтверждает звание самого любимого " +
                        "места зимнего отдыха и развлечений. Проект городка, который удивит и порадует жителей " +
                        "этой зимой, находится в разработке. Каким он будет – решать горожанам."));
        initiatives.add(new InitiativeInfo("Заголовок 5", "Lorem Lorem 5"));
        initiatives.add(new InitiativeInfo("Заголовок 6", "Lorem Lorem 6"));
        initiatives.add(new InitiativeInfo("Заголовок 7", "Lorem Lorem 7"));
    }
}
