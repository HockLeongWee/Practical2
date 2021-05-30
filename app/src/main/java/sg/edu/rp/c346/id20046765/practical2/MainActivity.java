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

        ivEmu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, InformationActivity.class);
                intent.putExtra("Title", "Emu");
                intent.putExtra("img", R.drawable.emuhd);
                intent.putExtra("Desc", "The scientific name for an emu is Dromaius novaehollandiae. The word Dromaius is Greek meaning runner and the word novaehollandiae means New Hollander. New Hollander refers to this bird’s initial classification as the New Holland Cassowary.");
                intent.putExtra("MoreDesc", "Emus have dark brown feathers that turn a lighter shade of brown as they age. They have bluish skin on their neck and head. An emu ranges from 4.9 to 6.2 feet in height. They weigh anywhere from 66 to 121 pounds. As an example, a 6-foot-tall emu is equal in height to a stack of 5 bowling pins. A 120-pound emu weighs two-thirds as much as an adult kangaroo.");
                intent.putExtra("ExtraInfo", "Emus have 2 long legs with 3 toes on each foot. These birds aren’t able to fly so they use their long legs to run away from predators. They also have quite a long stride when running. One stride of an emu can be 9 feet long. Just think, 9 feet is equal to half the height of an adult giraffe.");
                intent.putExtra("URL", "https://a-z-animals.com/animals/emu/");
                startActivity(intent);
            }
        });

        ivEmperor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, InformationActivity.class);
                intent.putExtra("Title", "Emperor Penguin");
                intent.putExtra("img", R.drawable.emperor_penguinhd);
                intent.putExtra("Desc", "Emperor Penguins are flightless birds that have small, stiff wings that help them to fly through the water, rather than through the air.");
                intent.putExtra("MoreDesc", "The Emperor Penguin is found on and around the Antarctic continent and is not just the largest species of penguin in the world but also one of the most unique. Instead of breeding in the warmer summer months like other penguin species, Emperor Penguins lay and incubate their eggs during the coldest time of year in the coldest place on Earth.");
                intent.putExtra("ExtraInfo", "The Emperor Penguin is a large bird that stands up to more than a meter in height. Their feathers vary in colour from black on the back to white on the front with a yellow patch towards the neck. The black and white colouration is thought to be particularly important for camouflaging the Emperor Penguin from predators whilst in the ocean.");
                intent.putExtra("URL", "https://a-z-animals.com/animals/emperor-penguin/");
                startActivity(intent);
            }
        });

        ivEletric.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, InformationActivity.class);
                intent.putExtra("Title", "Eletric Eel");
                intent.putExtra("img", R.drawable.eletric_eelhd);
                intent.putExtra("Desc", "Electric Eels are found in the waters of South America, and are capable of generating a 500volt electric shock through 28ft of still water. The shock that the electric eel produces is enough to harm any large mammal, including humans.");
                intent.putExtra("MoreDesc", "Electric eels can grow up to 2.5 metres and only need to surface for air every 10 minutes due to the eels complex circulatory system. Electric eels tend to live in muddy beds in calm water, eating fish and small mammals.");
                intent.putExtra("ExtraInfo", "Despite the name electric eel, the electric eel is actually related most closely to a catfish and not the common eel fish and many electric eel adults tend to be smaller than their eel fish counterparts.");
                intent.putExtra("URL", "https://a-z-animals.com/animals//electric-eel/");
                startActivity(intent);
            }
        });

        ivElephant.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, InformationActivity.class);
                intent.putExtra("Title", "Elephant");
                intent.putExtra("img", R.drawable.elee;);
                intent.putExtra("Desc", "");
                intent.putExtra("MoreDesc", "");
                intent.putExtra("ExtraInfo", "");
                intent.putExtra("URL", "https://a-z-animals.com/animals/emu/");
                startActivity(intent);
            }
        });

        ivFlying.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, InformationActivity.class);
                intent.putExtra("Title", "Fox");
                intent.putExtra("img", R.drawable.foxhd);
                intent.putExtra("Desc", "");
                intent.putExtra("MoreDesc", "");
                intent.putExtra("ExtraInfo", "");
                intent.putExtra("URL", "https://a-z-animals.com/animals/emu/");
                startActivity(intent);
            }
        });

        ivWhale.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, InformationActivity.class);
                intent.putExtra("Title", "Fox");
                intent.putExtra("img", R.drawable.foxhd);
                intent.putExtra("Desc", "");
                intent.putExtra("MoreDesc", "");
                intent.putExtra("ExtraInfo", "");
                intent.putExtra("URL", "https://a-z-animals.com/animals/emu/");
                startActivity(intent);
            }
        });

        ivGorilla.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, InformationActivity.class);
                intent.putExtra("Title", "Fox");
                intent.putExtra("img", R.drawable.foxhd);
                intent.putExtra("Desc", "");
                intent.putExtra("MoreDesc", "");
                intent.putExtra("ExtraInfo", "");
                intent.putExtra("URL", "https://a-z-animals.com/animals/emu/");
                startActivity(intent);
            }
        });

        ivFlamingo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, InformationActivity.class);
                intent.putExtra("Title", "Fox");
                intent.putExtra("img", R.drawable.foxhd);
                intent.putExtra("Desc", "");
                intent.putExtra("MoreDesc", "");
                intent.putExtra("ExtraInfo", "");
                intent.putExtra("URL", "https://a-z-animals.com/animals/emu/");
                startActivity(intent);
            }
        });

        ivFrilledShark.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, InformationActivity.class);
                intent.putExtra("Title", "Fox");
                intent.putExtra("img", R.drawable.foxhd);
                intent.putExtra("Desc", "");
                intent.putExtra("MoreDesc", "");
                intent.putExtra("ExtraInfo", "");
                intent.putExtra("URL", "https://a-z-animals.com/animals/emu/");
                startActivity(intent);
            }
        });

    }
}