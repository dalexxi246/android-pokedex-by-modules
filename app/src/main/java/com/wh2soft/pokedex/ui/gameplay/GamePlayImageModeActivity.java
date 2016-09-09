package com.wh2soft.pokedex.ui.gameplay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.wh2soft.pokedex.R;
import com.wh2soft.pokedex.model.entities.Pokemon;
import com.wh2soft.pokedex.ui.gameplay.view.GameModeView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class GamePlayImageModeActivity extends AppCompatActivity implements GameModeView {

    @BindView(R.id.toolbar_main)
    Toolbar toolbarMain;
    @BindView(R.id.picture)
    ImageView picture;
    @BindView(R.id.pokemon_choice_3)
    Button pokemonChoice3;
    @BindView(R.id.pokemon_choice_2)
    Button pokemonChoice2;
    @BindView(R.id.pokemon_choice_1)
    Button pokemonChoice1;
    @BindView(R.id.text_current_matched_items)
    TextView textCurrentMatchedItems;
    @BindView(R.id.fab)
    Button fab;
    @BindView(R.id.text_time_remaining)
    TextView textTimeRemaining;
    @BindView(R.id.text_countdown)
    TextView textCountdown;

    // GamePresenter presenter;

    // Android LifeCycle Methods -------------------------------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_play_image_mode);
        ButterKnife.bind(this);

        setSupportActionBar(toolbarMain);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    // Android Interaction Listeners Methods -------------------------------------------------------

    @OnClick({R.id.pokemon_choice_3, R.id.pokemon_choice_2, R.id.pokemon_choice_1, R.id.fab})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.pokemon_choice_3:
                break;
            case R.id.pokemon_choice_2:
                break;
            case R.id.pokemon_choice_1:
                break;
            case R.id.fab:
                break;
        }
    }

    // View Methods --------------------------------------------------------------------------------

    @Override
    public void addChoiceButtons() {

    }

    @Override
    public void beforeStartGame() {

    }

    @Override
    public void updateCountdown() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showError(String errorMsg) {

    }

    @Override
    public void hideError() {

    }

    @Override
    public void getNextPokemonSet() {

    }

    @Override
    public void onSetImageURL(Pokemon p) {

    }

    @Override
    public void onSetPokemonChoice(Pokemon p, int position) {
        String name = p.getName();
        switch (position) {
            case 1:
                pokemonChoice1.setText(name);
                break;
            case 2:
                pokemonChoice2.setText(name);
                break;
            case 3:
                pokemonChoice3.setText(name);
                break;
        }
    }
}
