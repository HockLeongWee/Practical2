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
                intent.putExtra("img", R.drawable.elephanthd);
                intent.putExtra("Desc", "These massive giants exhibit all kinds of complex behavior that in some ways mirror our own behavior but in other ways are distinct and unique to them. This has made them the subject of rigorous behavioral, anatomical, and cognitive studies, as well as a source of continued fascination in human culture, particularly in Indian, Sumatran, and some African mythologies and tales.");
                intent.putExtra("MoreDesc", "But after decades of decline from poaching and habitat loss, the elephant is in a perilous state, and unless more is done to protect them, they may be on a path toward extinction.");
                intent.putExtra("ExtraInfo", "The elephant is defined most of all by its size. These impressive creatures stand about 10 feet tall, reach about 18 to 24 feet long, and weigh between 4 and 8 tons. The largest specimen ever recorded stood 13 feet tall and weighed a massive 12 tons. Much of the skeletal structure is taken up by the huge skull, which supports the large ears, tusks, and trunk. The skull contains big cavities that reduce the weight without diminishing the strength");
                intent.putExtra("URL", "https://a-z-animals.com/animals/elephant/");
                startActivity(intent);
            }
        });

        ivFlying.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, InformationActivity.class);
                intent.putExtra("Title", "Flying Squirrel");
                intent.putExtra("img", R.drawable.flying_squirrelhd);
                intent.putExtra("Desc", "Despite its name, a flying squirrel doesn’t fly the same way a bird or a bat flies. Instead, flying squirrels are animals that glide or drift, through the air. These omnivores eat insects, mushrooms, flowers, and, of course, nuts. Flying squirrels are nocturnal animals and search for food at night. They can change direction by 180 degrees when gliding through the air.");
                intent.putExtra("MoreDesc", "These squirrels have a light coat of brown fur on their back and white fur on their stomach. Some types of squirrels have small differences in fur color. For instance, the southern flying squirrel has all-white fur on its stomach while a northern flying squirrel has belly fur that’s white at the tip and darker near the skin. The most notable feature of all of these squirrels is a pair of large, dark eyes. Their eyes let a lot of light in which helps these animals to see their surroundings as they hunt at night.");
                intent.putExtra("ExtraInfo", "These squirrels have a flat tail, four small feet, and long whiskers. Their whiskers help them to avoid running into objects while hunting at night. Like their cousin, the ground squirrel, they have sharp teeth they use to cut into black walnuts and other types of nuts.");
                intent.putExtra("URL", "https://a-z-animals.com/animals/flying-squirrel/");
                startActivity(intent);
            }
        });

        ivWhale.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, InformationActivity.class);
                intent.putExtra("Title", "False Killer Whale");
                intent.putExtra("img", R.drawable.false_killer_whalehd);
                intent.putExtra("Desc", "The name obviously arises from the similarities between orcas and false killer whales. Until 1862, early taxonomists classified both species within the same genus. Despite the name, this species is sometimes mistaken for the bottle-nosed dolphin or short-finned pilot whale. It is now under threat in certain parts of its range.");
                intent.putExtra("MoreDesc", "These animals actually looks a bit like a cross between a dolphin (with its rather sleek, ergonomic body) and a killer whale (because of the rounded head with no beak). Nevertheless, you probably wouldn’t mistake them for an orca.");
                intent.putExtra("ExtraInfo", "The false killer whale has a much smaller dorsal fin and a distinct curved hump on the flippers. And instead of the black and white coloration of the orca, the false killer whale has a black or dark gray coloration with a streak of white along the side. ");
                intent.putExtra("URL", "https://a-z-animals.com/animals/false-killer-whale/");
                startActivity(intent);
            }
        });

        ivGorilla.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, InformationActivity.class);
                intent.putExtra("Title", "Eastern Gorilla");
                intent.putExtra("img", R.drawable.eastern_gorillahd);
                intent.putExtra("Desc", "The eastern gorilla belongs to the genus gorilla. It is one of the great apes and is very closely related to humans. It is often observed that the eastern gorilla, which is most commonly found in jungles on mountain tops, comes with several features that made it easier for it to survive in the wild.");
                intent.putExtra("MoreDesc", "The eastern gorilla that goes by the scientific name Gorilla beringei is much closer to humans than first thought and can perform several tasks like peeling fruits by hand – much like humans. The eastern gorilla has two subspecies as of now – the eastern mountain gorilla and the eastern lowland gorilla, which is also known as the Grauer’s gorilla.");
                intent.putExtra("ExtraInfo", "Eastern gorillas are known to have strong, sturdy bodies that are covered with black colored fur. They have broad chests and long arms. However, the chest area, much like the face, hands, and soles of these gorillas is much less hairy than the rest of the body.");
                intent.putExtra("URL", "https://a-z-animals.com/animals/eastern-gorilla/");
                startActivity(intent);
            }
        });

        ivFlamingo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, InformationActivity.class);
                intent.putExtra("Title", "Flamingo");
                intent.putExtra("img", R.drawable.flamingohd);
                intent.putExtra("Desc", "Flamingos are omnivorous birds who eat brine shrimp, algae, and snails. They live in large groups called colonies. These birds reside in tropical climates in regions of Africa, Asia, and around South America. This bird can have a wingspan as wide as 60 inches.");
                intent.putExtra("MoreDesc", "Flamingos are birds that are known for their long legs (with webbed feet), S-shaped neck, curved beak, and pink feathers. Their diet of algae and brine shrimp contains beta carotene which is a red/orange pigment. The large supply of beta carotene taken in via the bird’s diet is what turns their feathers bright pink. This bird uses its curved beak to shovel algae into its mouth when its head is underwater.");
                intent.putExtra("ExtraInfo", "These birds range from 3 to 4 feet tall and can weigh up to 9 pounds, depending on the species. The tallest species is the greater flamingo at 4.7 feet as well as the heaviest at 9 pounds. Line up three bowling pins end to end, and they are equal in length to a 4-foot-tall bird. A 9-pound bird is almost as heavy as the average housecat.");
                intent.putExtra("URL", "https://a-z-animals.com/animals/flamingo/");
                startActivity(intent);
            }
        });

        ivFrilledShark.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, InformationActivity.class);
                intent.putExtra("Title", "Frilled Shark");
                intent.putExtra("img", R.drawable.frilled_sharkhd);
                intent.putExtra("Desc", "They are considered living fossils because of their primitive traits, like their brown color, long body, and placement of their jaws. Frilled Sharks spend most of their time deep beneath the surface of the water. They are most commonly found at depths between 390 and 4,200 feet below the surface. Frilled Sharks were given their name because of the six pairs of gills along their throat that look like ruffled collars.");
                intent.putExtra("MoreDesc", "The body of these sharks actually looks quite similar to an eel or snake. They have a very primitive appearance with a long and slender body. They have a flat head with a rounded snout. ");
                intent.putExtra("ExtraInfo", "The fins on these sharks are much smaller than those you’d see on other species of sharks. They also have a ruffled throat and six pairs of gills, that look similar to collars. These collar-looking gills are the reason the Frilled Shark was given his name.");
                intent.putExtra("URL", "https://a-z-animals.com/animals/frilled-shark/");
                startActivity(intent);
            }
        });

    }
}