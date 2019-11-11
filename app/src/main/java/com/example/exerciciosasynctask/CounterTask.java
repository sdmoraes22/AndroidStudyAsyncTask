package com.example.exerciciosasynctask;

import android.os.AsyncTask;
import android.os.SystemClock;
import android.widget.Button;
import android.widget.TextView;


public class CounterTask extends AsyncTask<Integer, Integer, Void> {

    private Button button;
    private TextView textView;

    public CounterTask(Button button, TextView textView) {
        this.button = button;
        this.textView = textView;
    }

    @Override
    protected Void doInBackground(Integer... integers) {
        int max = integers[0];

        for (int i = 0; i <= max; i++) {
            SystemClock.sleep(500);
            publishProgress(i);
        }

        return null;
    }

    @Override
    protected void onPreExecute() {
        button.setEnabled(false);


    }

    @Override
    protected void onPostExecute(Void aVoid) {
        button.setEnabled(true);

    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        textView.setText(String.valueOf(values[0]));
    }
}
