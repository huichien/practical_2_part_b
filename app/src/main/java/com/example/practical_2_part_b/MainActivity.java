package com.example.practical_2_part_b;

import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Button mResetButton;
    private Button mCountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
        mResetButton = findViewById(R.id.button_zero);
        mCountButton = findViewById(R.id.button_count);
    }

    public void showToast(View view) {

        Toast toast = Toast.makeText(this, R.string.toast_message_idname, Toast.LENGTH_LONG);
        toast.show();
    }

    public void countUp(View view) {

        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(String.format(Locale.ENGLISH, "%d", mCount));
        }
        mResetButton.setBackgroundColor(Color.MAGENTA);
        mResetButton.setClickable(true);
        //setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        switch (mCount % 2) {

            case 0:
                view.setBackgroundColor(Color.GREEN);
                break;
            case 1:
                view.setBackgroundColor(Color.MAGENTA);
                break;
            default:
                break;
        }
    }

    public void callMethod(View view) {
        mCount = 0;
        mShowCount.setText(String.valueOf(mCount));

        view.setClickable(false);
        view.setBackgroundColor(Color.GRAY);
        mCountButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
    }

}