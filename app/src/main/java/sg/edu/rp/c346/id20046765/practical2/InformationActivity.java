package sg.edu.rp.c346.id20046765.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class InformationActivity extends AppCompatActivity {

    TextView tvTitle; // Creation
    ImageView iv;
    TextView tvDesc;
    TextView tvMoreDesc;
    TextView tvExtraInfo;
    TextView tvURL;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        tvTitle = findViewById(R.id.tvTitle); //Assign
        iv = findViewById(R.id.iv);
        tvDesc = findViewById(R.id.tvDesc);
        tvMoreDesc = findViewById(R.id.tvMoreDesc);
        tvExtraInfo = findViewById(R.id.tvExtraInfo);
        tvURL = findViewById(R.id.tvURL);
        btnBack = findViewById(R.id.btnBack);

        Intent intentReceived = getIntent(); //Intent
        String Title = intentReceived.getStringExtra("Title");
        String Desc = intentReceived.getStringExtra("Desc");
        String MoreDesc = intentReceived.getStringExtra("MoreDesc");
        String ExtraInfo = intentReceived.getStringExtra("ExtraInfo");
        String URL = intentReceived.getStringExtra("URL");
        int img = intentReceived.getIntExtra("img", 0);

        tvTitle.setText(Title); //Set
        iv.setImageResource(img);
        tvDesc.setText(Desc);
        tvMoreDesc.setText(MoreDesc);
        tvExtraInfo.setText(ExtraInfo);
        tvURL.setText(URL);

        btnBack.setOnClickListener(new View.OnClickListener(){ // BACK BUTTON
            @Override
            public void onClick(View view){
                onBackPressed();
            }
        });

    }


}