package com.japari_library.okitsu.synthapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.NumberPicker;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    private Button aButton, asButton, bButton, cButton, csButton, dButton, dsButton, eButton, fButton, fsButton, gButton, gsButton;
    private Button play;
    private final int QUARTER_NOTE = 600;
    private MediaPlayer[] noteList;
    private NumberPicker pickWheel;
    private Switch modes;
    private boolean whichMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
        setListeners();
        noteList = new MediaPlayer[24];
        pickWheel.setMaxValue(200);
        pickWheel.setMinValue(1);
        createMediaPlayers();
    }

    private void setListeners() {
        aButton.setOnClickListener(this);
        asButton.setOnClickListener(this);
        bButton.setOnClickListener(this);
        cButton.setOnClickListener(this);
        csButton.setOnClickListener(this);
        dButton.setOnClickListener(this);
        dsButton.setOnClickListener(this);
        eButton.setOnClickListener(this);
        fButton.setOnClickListener(this);
        fsButton.setOnClickListener(this);
        gButton.setOnClickListener(this);
        gsButton.setOnClickListener(this);
        modes.setOnCheckedChangeListener(this);
        play.setOnClickListener(this);
    }

    private void createMediaPlayers() {
        noteList[0] = MediaPlayer.create(this, R.raw.scalea);
        noteList[1] = MediaPlayer.create(this, R.raw.scaleas);
        noteList[2] = MediaPlayer.create(this, R.raw.scaleb);
        noteList[3] = MediaPlayer.create(this, R.raw.scalec);
        noteList[4] = MediaPlayer.create(this, R.raw.scalecs);
        noteList[5] = MediaPlayer.create(this, R.raw.scaled);
        noteList[6] = MediaPlayer.create(this, R.raw.scaleds);
        noteList[7] = MediaPlayer.create(this, R.raw.scalee);
        noteList[8] = MediaPlayer.create(this, R.raw.scalef);
        noteList[9] = MediaPlayer.create(this, R.raw.scalefs);
        noteList[10] = MediaPlayer.create(this, R.raw.scaleg);
        noteList[11] = MediaPlayer.create(this, R.raw.scalegs);
        noteList[12] = MediaPlayer.create(this, R.raw.scalehigha);
        noteList[13] = MediaPlayer.create(this, R.raw.scalehighas);
        noteList[14] = MediaPlayer.create(this, R.raw.scalehighb);
        noteList[15] = MediaPlayer.create(this, R.raw.scalehighc);
        noteList[16] = MediaPlayer.create(this, R.raw.scalehighcs);
        noteList[17] = MediaPlayer.create(this, R.raw.scalehighd);
        noteList[18] = MediaPlayer.create(this, R.raw.scalehighds);
        noteList[19] = MediaPlayer.create(this, R.raw.scalehighe);
        noteList[20] = MediaPlayer.create(this, R.raw.scalehighf);
        noteList[21] = MediaPlayer.create(this, R.raw.scalehighfs);
        noteList[22] = MediaPlayer.create(this, R.raw.scalehighg);
        noteList[23] = MediaPlayer.create(this, R.raw.scalehighgs);

    }

    private void wireWidgets() {
        aButton = (Button) findViewById(R.id.button_a);
        asButton = (Button) findViewById(R.id.button_as);
        bButton = (Button) findViewById(R.id.button_b);
        cButton = (Button) findViewById(R.id.button_c);
        csButton = (Button) findViewById(R.id.button_cs);
        dButton = (Button) findViewById(R.id.button_d);
        dsButton = (Button) findViewById(R.id.button_ds);
        eButton = (Button) findViewById(R.id.button_e);
        fButton = (Button) findViewById(R.id.button_f);
        fsButton = (Button) findViewById(R.id.button_fs);
        gButton = (Button) findViewById(R.id.button_g);
        gsButton = (Button) findViewById(R.id.button_gs);
        play = (Button) findViewById(R.id.button_play);
        pickWheel = (NumberPicker) findViewById(R.id.numberPicker);
        modes = (Switch) findViewById(R.id.modes);
    }

    private void playNote(String name, int delay) {
        switch (name) {
            case "a":
                noteList[0].seekTo(0);
                noteList[0].start();
                break;
            case "as":
                noteList[1].seekTo(0);
                noteList[1].start();
                break;
            case "b":
                noteList[2].seekTo(0);
                noteList[2].start();
                break;
            case "c":
                noteList[3].seekTo(0);
                noteList[3].start();
                break;
            case "cs":
                noteList[4].seekTo(0);
                noteList[4].start();
                break;
            case "d":
                noteList[5].seekTo(0);
                noteList[5].start();
                break;
            case "ds":
                noteList[6].seekTo(0);
                noteList[6].start();
                break;
            case "e":
                noteList[7].seekTo(0);
                noteList[7].start();
                break;
            case "f":
                noteList[8].seekTo(0);
                noteList[8].start();
                break;
            case "fs":
                noteList[9].seekTo(0);
                noteList[9].start();
                break;
            case "g":
                noteList[10].seekTo(0);
                noteList[10].start();
                break;
            case "gs":
                noteList[11].seekTo(0);
                noteList[11].start();
                break;
            case "ha":
                noteList[12].seekTo(0);
                noteList[12].start();
                break;
            case "has":
                noteList[13].seekTo(0);
                noteList[13].start();
                break;
            case "hbs":
                noteList[14].seekTo(0);
                noteList[14].start();
                break;
            case "hc":
                noteList[15].seekTo(0);
                noteList[15].start();
                break;
            case "hcs":
                noteList[16].seekTo(0);
                noteList[16].start();
                break;
            case "hd":
                noteList[17].seekTo(0);
                noteList[17].start();
                break;
            case "hds":
                noteList[18].seekTo(0);
                noteList[18].start();
                break;
            case "he":
                noteList[19].seekTo(0);
                noteList[19].start();
                break;
            case "hf":
                noteList[20].seekTo(0);
                noteList[20].start();
                break;
            case "hfs":
                noteList[21].seekTo(0);
                noteList[21].start();
                break;
            case "hg":
                noteList[22].seekTo(0);
                noteList[22].start();
                break;
            case "hgs":
                noteList[23].seekTo(0);
                noteList[23].start();
                break;
        }
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity", "Audio playback interrupted");
        }
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button_play) {
                    /*playNote("ha", QUARTER_NOTE);
                    playNote("f", QUARTER_NOTE / 2);
                    playNote("g", QUARTER_NOTE / 2);
                    playNote("f", QUARTER_NOTE * 2);
                    playNote("g", QUARTER_NOTE / 2);
                    playNote("f", QUARTER_NOTE * 2);
                    playNote("c", QUARTER_NOTE / 2);
                    playNote("f", QUARTER_NOTE / 2);
                    playNote("e", QUARTER_NOTE / 2);
                    playNote("f", QUARTER_NOTE / 2);
                    playNote("g", QUARTER_NOTE / 2);
                    playNote("ha", QUARTER_NOTE / 2);
                    playNote("g", QUARTER_NOTE / 2);
                    playNote("f", QUARTER_NOTE / 2);
                    playNote("g", QUARTER_NOTE / 2);
                    playNote("f", QUARTER_NOTE);
                    playNote("g", QUARTER_NOTE / 2);
                    playNote("f", QUARTER_NOTE);
                    playNote("c", QUARTER_NOTE / 2);
                    playNote("f", QUARTER_NOTE / 2);
                    playNote("e", QUARTER_NOTE / 2);
                    playNote("f", QUARTER_NOTE / 2);
                    playNote("g", QUARTER_NOTE / 2);
                    playNote("ha", QUARTER_NOTE * 2);*/
            playNote("hb", 0);
            playNote("e", 0);
            playNote("c", QUARTER_NOTE * 3 / 4);
            playNote("hb", 0);
            playNote("e", 0);
            playNote("c", QUARTER_NOTE * 3 / 4);
            playNote("hb", 0);
            playNote("e", 0);
            playNote("c", QUARTER_NOTE / 2);
            playNote("hb", 0);
            playNote("e", 0);
            playNote("c", QUARTER_NOTE * 3 / 4);
            playNote("hb", 0);
            playNote("e", 0);
            playNote("c", QUARTER_NOTE * 3 / 4);
            playNote("ha", 0);
            playNote("hc", 0);
            playNote("he", QUARTER_NOTE / 2);
            playNote("hb", 0);
            playNote("e", 0);
            playNote("c", QUARTER_NOTE * 3 / 4);
            playNote("hb", 0);
            playNote("e", 0);
            playNote("c", QUARTER_NOTE * 3 / 4);
            playNote("hb", 0);
            playNote("e", 0);
            playNote("c", QUARTER_NOTE / 2);
            playNote("hb", 0);
            playNote("e", 0);
            playNote("c", QUARTER_NOTE * 3 / 4);
            playNote("hb", 0);
            playNote("e", 0);
            playNote("c", QUARTER_NOTE * 3 / 4);
            playNote("ha", 0);
            playNote("hc", 0);
            playNote("he", QUARTER_NOTE / 2);
            playNote("hb", 0);
            playNote("e", 0);
            playNote("c", QUARTER_NOTE * 3 / 4);
            playNote("hb", 0);
            playNote("e", 0);
            playNote("c", QUARTER_NOTE * 3 / 4);
            playNote("hb", 0);
            playNote("e", 0);
            playNote("c", QUARTER_NOTE / 2);
            playNote("hb", 0);
            playNote("e", 0);
            playNote("c", QUARTER_NOTE * 3 / 4);
            playNote("hb", 0);
            playNote("e", 0);
            playNote("c", QUARTER_NOTE * 3 / 4);
            playNote("ha", 0);
            playNote("hc", 0);
            playNote("he", QUARTER_NOTE / 2);
            playNote("ha", 0);
            playNote("hc", 0);
            playNote("he", QUARTER_NOTE * 3 / 4);
            playNote("ha", 0);
            playNote("hc", 0);
            playNote("he", QUARTER_NOTE * 3 / 4);
            playNote("hd", 0);
            playNote("hb", 0);
            playNote("g", QUARTER_NOTE / 2);
            playNote("hd", 0);
            playNote("hb", 0);
            playNote("g", QUARTER_NOTE * 3 / 4);
            playNote("hd", 0);
            playNote("hb", 0);
            playNote("g", QUARTER_NOTE * 3 / 4);
            playNote("ha", 0);
            playNote("fs", 0);
            playNote("d", QUARTER_NOTE / 2);
            playNote("hb", 0);
            playNote("e", 0);
            playNote("c", 0);
            playNote("e", QUARTER_NOTE / 4);
            playNote("e", QUARTER_NOTE / 4);
            playNote("e", QUARTER_NOTE / 4);
            playNote("hb", 0);
            playNote("e", 0);
            playNote("c", 0);
            playNote("e", QUARTER_NOTE / 4);
            playNote("e", QUARTER_NOTE / 2);
            playNote("hb", 0);
            playNote("e", 0);
            playNote("c", QUARTER_NOTE / 2);
            playNote("hb", 0);
            playNote("e", 0);
            playNote("c", QUARTER_NOTE * 3 / 4);
            playNote("hb", 0);
            playNote("e", 0);
            playNote("c", QUARTER_NOTE * 3 / 4);
            playNote("ha", 0);
            playNote("hc", 0);
            playNote("he", QUARTER_NOTE / 2);
            playNote("hb", 0);
            playNote("e", 0);
            playNote("c", QUARTER_NOTE * 3 / 4);
            playNote("hb", 0);
            playNote("e", 0);
            playNote("c", QUARTER_NOTE * 3 / 4);
            playNote("hb", 0);
            playNote("e", 0);
            playNote("c", QUARTER_NOTE / 2);
            playNote("hb", 0);
            playNote("e", 0);
            playNote("c", QUARTER_NOTE * 3 / 4);
            playNote("hb", 0);
            playNote("e", 0);
            playNote("c", QUARTER_NOTE / 4);
            playNote("g", QUARTER_NOTE / 2);
            playNote("ha", 0);
            playNote("fs", 0);
            playNote("d", 0);
            playNote("hb", 0);
            playNote("e", 0);
            playNote("c", 0);
            playNote("e", QUARTER_NOTE / 4);
            playNote("e", QUARTER_NOTE / 4);
            playNote("e", QUARTER_NOTE / 4);
            playNote("hb", 0);
            playNote("e", 0);
            playNote("c", 0);
            playNote("e", QUARTER_NOTE / 4);
            playNote("e", QUARTER_NOTE / 2);
            playNote("hb", 0);
            playNote("e", 0);
            playNote("c", QUARTER_NOTE / 2);
            playNote("hb", 0);
            playNote("e", 0);
            playNote("c", QUARTER_NOTE * 3 / 4);
            playNote("hb", 0);
            playNote("e", 0);
            playNote("c", QUARTER_NOTE * 3 / 4);
            playNote("ha", 0);
            playNote("hc", 0);
            playNote("he", QUARTER_NOTE / 2);
        } else {
            if (!whichMode) {
                switch (view.getId()) {
                    case R.id.button_a:
                        playNote("a", 0);
                        break;
                    case R.id.button_as:
                        playNote("as", 0);
                        break;
                    case R.id.button_b:
                        playNote("b", 0);
                        break;
                    case R.id.button_c:
                        playNote("c", 0);
                        break;
                    case R.id.button_cs:
                        playNote("cs", 0);
                        break;
                    case R.id.button_d:
                        playNote("d", 0);
                        break;
                    case R.id.button_ds:
                        playNote("ds", 0);
                        break;
                    case R.id.button_e:
                        playNote("e", 0);
                        break;
                    case R.id.button_f:
                        playNote("f", 0);
                        break;
                    case R.id.button_fs:
                        playNote("fs", 0);
                        break;
                    case R.id.button_g:
                        playNote("g", 0);
                        break;
                    case R.id.button_gs:
                        playNote("gs", 0);
                        break;
                }
            } else {
                for(int i = pickWheel.getValue(); i > 0; i--){
                    switch (view.getId()) {
                        case R.id.button_a:
                            playNote("a", 500);
                            break;
                        case R.id.button_as:
                            playNote("as", 500);
                            break;
                        case R.id.button_b:
                            playNote("b", 500);
                            break;
                        case R.id.button_c:
                            playNote("c", 500);
                            break;
                        case R.id.button_cs:
                            playNote("cs", 500);
                            break;
                        case R.id.button_d:
                            playNote("d", 500);
                            break;
                        case R.id.button_ds:
                            playNote("ds", 500);
                            break;
                        case R.id.button_e:
                            playNote("e", 500);
                            break;
                        case R.id.button_f:
                            playNote("f", 500);
                            break;
                        case R.id.button_fs:
                            playNote("fs", 500);
                            break;
                        case R.id.button_g:
                            playNote("g", 500);
                            break;
                        case R.id.button_gs:
                            playNote("gs", 500);
                            break;

                    }
                }
            }
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (b) {
            whichMode = true;
        } else {
            whichMode = false;
        }
    }

    //owo what's this
}