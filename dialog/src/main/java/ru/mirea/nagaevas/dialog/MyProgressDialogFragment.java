package ru.mirea.nagaevas.dialog;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;

import androidx.fragment.app.DialogFragment;

public class MyProgressDialogFragment extends DialogFragment {

    ProgressDialog progDialog;

    public MyProgressDialogFragment(Activity activity) {
        progDialog = new ProgressDialog(activity);
    }

    public void onProgress(){
        progDialog.setMessage("Cool spinning stuff!");
        progDialog.setTitle("Progress");
        progDialog.setButton("Stop!", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        progDialog.show();
    }

}