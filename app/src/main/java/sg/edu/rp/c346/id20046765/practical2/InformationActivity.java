package sg.edu.rp.c346.id20046765.practical2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextMenu;
import android.view.MenuItem;
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

    String wordClicked = ""; // Aye I have no idea why I did this. I think later me will explain
    float textSize = 18f; // For the text size cuz all 18sp.

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

        registerForContextMenu(tvDesc); // Registering so they can trigger da menu
        registerForContextMenu(tvMoreDesc);
        registerForContextMenu(tvExtraInfo);

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

        tvURL.setOnClickListener(new View.OnClickListener(){ // Bring user to browser
            @Override
            public void onClick(View view){
                Intent intentCall = new Intent(Intent.ACTION_VIEW, Uri.parse(URL));
                startActivity(intentCall);
            }
        });

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        if(v == tvDesc){              // This if statement is basically useless
            wordClicked = "Desc";     // because I kinda need all 3 of them work
        }else if(v == tvMoreDesc){    // and that is because I created them
            wordClicked = "MoreDesc"; // separately.
        }else if(v == tvExtraInfo){
            wordClicked = "ExtraInfo";
        }

        menu.add(0,0,0,"Text Size UP"); // Add things inside menu
        menu.add(0,1,1,"Text Size Down");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (wordClicked.equalsIgnoreCase("Desc")) { // This is the code that allows the menu to do what they progarmmed to do :)
            if (item.getItemId() == 0) {
                textSize += 2f;
                tvDesc.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize); // I used COMPLEX_UNIT_SP, because I want it to be a default value of sp. So the text size won't change randomly.
                tvMoreDesc.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize);
                tvExtraInfo.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize); // IF YOU WERE WONDERING WHY SO MANY THE SAMETHING
            } else if(item.getItemId() == 1){
                textSize -= 2f;
                tvDesc.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize); // btw textSize, is a float variable that stores an default value of text size.
                tvMoreDesc.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize);
                tvExtraInfo.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize); // IT'S KINDA BECAUSE THE PAST ME, DECIDED TO CREATE 3 DIFFERENT TEXTVIEW.
            }
        } else if (wordClicked.equalsIgnoreCase("MoreDesc")) {
            if (item.getItemId() == 0) {
                textSize += 2f; // and this, is actually to add 2 on the text size.
                tvDesc.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize);
                tvMoreDesc.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize);
                tvExtraInfo.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize); // AND I KINDA WANT ALL 3 TEXTVIEW TO HAVE THE MENU
            } else if(item.getItemId() == 1){
                textSize -= 2f;
                tvDesc.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize);
                tvMoreDesc.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize);
                tvExtraInfo.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize); // THEREFORE HAVING ALL THIS :D
            }
        } else if (wordClicked.equalsIgnoreCase("ExtraInfo")) {
            if (item.getItemId() == 0) {
                textSize += 2f;
                tvDesc.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize);
                tvMoreDesc.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize);
                tvExtraInfo.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize);
            } else if(item.getItemId() == 1){
                textSize -= 2f;
                tvDesc.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize);
                tvMoreDesc.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize);
                tvExtraInfo.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize);
            }
        }
        return super.onContextItemSelected(item);
    }


}