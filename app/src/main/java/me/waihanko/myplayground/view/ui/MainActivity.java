package me.waihanko.myplayground.view.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import me.waihanko.myplayground.R;
import me.waihanko.myplayground.presenter.CarResponsibilityImplement;
import me.waihanko.myplayground.presenter.CarResponsibilityPresenter;
import me.waihanko.myplayground.view.PowerSystemResult;

public class MainActivity extends AppCompatActivity implements PowerSystemResult {

    CarResponsibilityPresenter carResponsibilityPresenter;
    Button btnUnlock;
    TextView txtMessage;
    String output = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnUnlock = findViewById(R.id.btn_unlock);
        txtMessage = findViewById(R.id.tv_message);

        carResponsibilityPresenter = new CarResponsibilityImplement(this);
        btnUnlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carResponsibilityPresenter.DoUnlock();
            }
        });
    }

    @Override
    public void StartingPowerSystem(String message) {
        output += message +"\n";
        txtMessage.setText(output);
    }

    @Override
    public void OpenFrontLight() {
        output += "Front Light Open \n";
        txtMessage.setText(output);
    }

    @Override
    public void GoForward() {
        output += "Go Forward \n";
        txtMessage.setText(output);
    }
}
