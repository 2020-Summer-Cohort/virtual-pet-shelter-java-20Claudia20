package shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) {

        //create objects
        VirtualPet pet1 = new VirtualPet("Dexter", "clever", 50, 50, 50);
        VirtualPet pet2 = new VirtualPet("Bono", "ferocious", 50, 50, 50);
        VirtualPet pet3 = new VirtualPet("Morty", "messy", 50, 50, 50);
        VirtualPet pet4 = new VirtualPet("Leia", "energetic", 50, 50, 50);

        //create shelterPet (petMap) to interact with all pets at once
        VirtualPetShelter shelterPets = new VirtualPetShelter();
        shelterPets.addPet(pet1);
        shelterPets.addPet(pet2);
        shelterPets.addPet(pet3);
        shelterPets.addPet(pet4);

        //Welcome statement (Move to a welcome method and call?)
        System.out.println("Welcome and thank you for volunteering at The Doggy Virtual Pet Shelter!");
        System.out.println("Let's meet the dogs you will be working with.");
        System.out.println(pet1.getName() + " is a " + pet1.getDesc() + " German Shepperd.");
        System.out.println(pet2.getName() + " is a " + pet2.getDesc() + " Australian Terrier.");
        System.out.println(pet3.getName() + " is a " + pet2.getDesc() + " St.Bernard.");
        System.out.println(pet4.getName() + " is an " + pet4.getDesc() + " Princess Siberian Husky.");
        //current status
        System.out.println("This is the status of our furry friends:");
        System.out.println("Name    |Hunger |Thirst	|Boredom");
        System.out.println("--------|-------|-------|-------");
        System.out.println(pet1.getName() + "  |" + pet1.getHunger() + "     |" + pet1.getThirst() + "     |" + pet1.getBoredom());
        System.out.println(pet2.getName() + "    |" + pet2.getHunger() + "     |" + pet2.getThirst() + "     |" + pet2.getBoredom());
        System.out.println(pet3.getName() + "   |" + pet3.getHunger() + "     |" + pet3.getThirst() + "     |" + pet3.getBoredom());
        System.out.println(pet4.getName() + "    |" + pet4.getHunger() + "     |" + pet4.getThirst() + "     |" + pet4.getBoredom());

        //user selection
        System.out.println("What would you like to do?");
        System.out.println("1. Feed all the dogs");
        System.out.println("2. Give water to all the dogs");
        System.out.println("3. Play with a furry friend");
        System.out.println("4. Adopt a companion");
        System.out.println("5. Admit a pet");
        System.out.println("6. Quit");

        //use scanner to read user response
        Scanner scanner = new Scanner(System.in);

        // user 'int userResponse' to create a spot for users input
        int userResponse = scanner.nextInt();

        //begin game loop
        while (true) {
            //call to tick method in VirtualPetShelter
            shelterPets.tickAll();

            //if statements to recognize userResponse & direct game on what to do based on user response
            if (userResponse == 1) {
                System.out.println(" You have selected to feed all the dogs.");
                shelterPets.actionFeedAllPets();
            } else if (userResponse == 2) {
                System.out.println(" You will give fresh water to all the dogs.");
                shelterPets.actionGiveWaterToPets();
            } else if (userResponse == 3) {
                System.out.println("You get to play with a dog. What furry friend would you like to play with?");
                System.out.println("1." + pet1.getName() + pet1.getDesc());
                System.out.println("2." + pet2.getName() + pet2.getDesc());
                System.out.println("3." + pet3.getName() + pet3.getDesc());
                System.out.println("4." + pet4.getName() + pet4.getDesc());
            } else if (userResponse == 4){
                System.out.println( "You have selected to adopt a lifelong companion." + "\n" +
                        "What furry friend would you like to give a new home to?");
                System.out.println("1." + pet1.getName() + "the" + pet1.getDesc() + " German Shepperd.");
                System.out.println("2." + pet2.getName() + "the" + pet2.getDesc() + "Australian Terrier .");
                System.out.println("3." + pet3.getName() + "the" + pet3.getDesc() + "St.Bernard.");
                System.out.println("4." + pet4.getName() + "the" + pet4.getDesc() + "Princess Siberian Husky.");
                Scanner scanner1 = new Scanner(System.in);
            } else if (userResponse == 5){
                System.out.println("You have selected to intake a dog.Who's our new furry friend?");
                // code to add the pet they are bringing in
            }


            else continue;
            break;
        }
        System.out.println("New status updates on all our furry friends:");

    }
        }



