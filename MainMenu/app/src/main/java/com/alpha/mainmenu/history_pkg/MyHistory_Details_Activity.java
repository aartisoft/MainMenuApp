package com.alpha.mainmenu.history_pkg;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.alpha.mainmenu.R;

public class MyHistory_Details_Activity extends AppCompatActivity implements View.OnClickListener {
    AppCompatImageView iv_back;
    View id_toolbar;
    AppCompatTextView tv_title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myhistory_details);
        id_toolbar = findViewById(R.id.id_toolbar);
        iv_back = id_toolbar.findViewById(R.id.id_back);
        tv_title = id_toolbar.findViewById(R.id.tv_tittle);
        tv_title.setText("Your Order");
        iv_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.id_back:
                onBackPressed();
                break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
