package br.kleberf65.verticalseekbar;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import br.kleberf65.widget.VerticalSeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textProgress = findViewById(R.id.text_progress);
        VerticalSeekBar seekBarXml = findViewById(R.id.box_from_xml);

        seekBarXml.setOnBoxedPointsChangeListener(new VerticalSeekBar.OnValuesChangeListener() {
            @Override
            public void onPointsChanged(VerticalSeekBar seekBar, int progress) {
                textProgress.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(VerticalSeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(VerticalSeekBar seekBar) {

            }
        });


        VerticalSeekBar seekBarCode = findViewById(R.id.box_from_code);
        seekBarCode.setProgressColor(Color.RED);
        seekBarCode.setBackgroundColor(Color.DKGRAY);
        seekBarCode.setMax(100);
        seekBarCode.setProgress(50);
        seekBarCode.setStep(1);
        seekBarCode.setCornerRadius(16);
        seekBarCode.setEnabled(true);

        seekBarCode.setOnBoxedPointsChangeListener(new VerticalSeekBar.OnValuesChangeListener() {
            @Override
            public void onPointsChanged(VerticalSeekBar seekBar, int progress) {
                textProgress.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(VerticalSeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(VerticalSeekBar seekBar) {

            }
        });
    }
}