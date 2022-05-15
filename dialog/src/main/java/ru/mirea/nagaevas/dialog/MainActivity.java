package ru.mirea.nagaevas.dialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickShowDialog(View view) {
        MyDialogFragment dialogFragment = new MyDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "mirea");
    }
    void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Keep moving!",
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Stay strong!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Start working!",
                Toast.LENGTH_LONG).show();
    }
    public void onClickDateDialog(View view){
        MyDateDialogFragment dateFragment = new MyDateDialogFragment();
        new DatePickerDialog(MainActivity.this, dateFragment.d,
                dateFragment.calendar.get(Calendar.YEAR),
                dateFragment.calendar.get(Calendar.MONTH),
                dateFragment.calendar.get(Calendar.DAY_OF_MONTH))
                .show();
    }
    public void onClickTimeDialog(View v){
        MyTimeDialogFragment timeFragment = new MyTimeDialogFragment();
        new TimePickerDialog(MainActivity.this, timeFragment.time,
                timeFragment.calendar.get(Calendar.HOUR_OF_DAY),
                timeFragment.calendar.get(Calendar.MINUTE), true)
                .show();
    }
    public void onClickProgressDialog(View view){
        MyProgressDialogFragment progressFragment = new MyProgressDialogFragment(this);
        progressFragment.onProgress();
    }

}