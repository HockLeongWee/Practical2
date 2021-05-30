package sg.edu.rp.c346.id20046765.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView ivFox;
    ImageView ivEmu;
    ImageView ivEmperor;
    ImageView ivEletric;
    ImageView ivElephant;
    ImageView ivFlying;
    ImageView ivWhale;
    ImageView ivGorilla;
    ImageView ivFlamingo;
    ImageView ivFrilledShark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivFox = findViewById(R.id.ivFox);
        ivEmu = findViewById(R.id.ivEmu);
        ivEmperor = findViewById(R.id.ivEmperor);
        ivEletric = findViewById(R.id.ivEletric);
        ivElephant = findViewById(R.id.ivElephant);
        ivFlying = findViewById(R.id.ivFlying);
        ivWhale = findViewById(R.id.ivWhale);
        ivGorilla = findViewById(R.id.ivGorilla);
        ivFlamingo = findViewById(R.id.ivFlamingo);
        ivFrilledShark = findViewById(R.id.ivFrilledShark);

        ivFox.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, InformationActivity.class);
                intent.putExtra("Title", "Fox");
                intent.putExtra("img", R.drawable.foxhd);
                intent.putExtra("Desc", "Foxes belong to the kingdom Animalia (Animals!) and are mammals. As part of the family Canidae they’re closely related to wolves, racoons, and domesticated dogs!");
                intent.putExtra("MoreDesc", "Wild foxes tend live for around 6-7 years, but some foxes have been known to be older than 13 in captivity. The wild fox hunts for the mouse and other small mammals and birds, but foxes appear to enjoy all species of insect.");
                intent.putExtra("ExtraInfo", "A fox is generally smaller than other members of the dog family like wolves, jackals and domestic dogs. Foxes can be a pest in the cities as foxes are often seen tearing into rubbish.");
                intent.putExtra("URL", "https://a-z-animals.com/animals/fox/");
                startActivity(intent);
            }
        });

    }
}