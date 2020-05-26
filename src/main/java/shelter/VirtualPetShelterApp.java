package shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) {

        //create objects
        VirtualPet pet1 = new VirtualPet("Dexter", "clever", 30, 30, 30);
        VirtualPet pet2 = new VirtualPet("Bono", "ferocious", 30, 30, 30);
        VirtualPet pet3 = new VirtualPet("Morty", "messy", 30, 30, 30);
        VirtualPet pet4 = new VirtualPet("Leia", "energetic", 30, 30, 30);

        //create shelterPet (petMap) to interact with all pets at once
        VirtualPetShelter shelterPets = new VirtualPetShelter();
        shelterPets.addPet(pet1);
        shelterPets.addPet(pet2);
        shelterPets.addPet(pet3);
        shelterPets.addPet(pet4);

        //Welcome statement
        System.out.println("Welcome and thank you for volunteering at The Doggy Virtual Pet Shelter!");
        System.out.println("Let's meet the dogs you will be working with." + "\n");
        System.out.println(pet1.getName() + " is a " + pet1.getDescription() + " German Shepperd." + "\n");
        System.out.println(pet2.getName() + " is a " + pet2.getDescription() + " Australian Terrier." + "\n");
        System.out.println(pet3.getName() + " is a " + pet2.getDescription() + " St.Bernard." + "\n");
        System.out.println(pet4.getName() + " is an " + pet4.getDescription() + " Princess Siberian Husky." + "\n");

        // begin game loop
        while (true) {

            //current status
            System.out.println("This is the status of our furry friends:");
            System.out.println("Name    |Hunger |Thirst	|Boredom");
            System.out.println("--------|-------|-------|-------");
            System.out.println(pet1.getName() + "  |" + pet1.getHunger() + "     |" + pet1.getThirst() + "     |" + pet1.getBoredom());
            System.out.println(pet2.getName() + "    |" + pet2.getHunger() + "     |" + pet2.getThirst() + "     |" + pet2.getBoredom());
            System.out.println(pet3.getName() + "   |" + pet3.getHunger() + "     |" + pet3.getThirst() + "     |" + pet3.getBoredom());
            System.out.println(pet4.getName() + "    |" + pet4.getHunger() + "     |" + pet4.getThirst() + "     |" + pet4.getBoredom());


            System.out.println("\n" + "What would you like to do?");
            System.out.println("1. Feed all the dogs");
            System.out.println("2. Give water to all the dogs");
            System.out.println("3. Play with a furry friend");
            System.out.println("4. Adopt a companion");
            System.out.println("5. Admit a pet");
            System.out.println("6. Quit");

            Scanner scanner = new Scanner(System.in);    //use scanner to read user response
            int userResponse = scanner.nextInt();      // 'int userResponse' to create a spot for users input
            scanner.nextLine();

            //if statements to recognize userResponse & direct game on what to do based on user response
            if (userResponse == 1) {
                System.out.println("You selected to give all the dogs their favorite ice cream treats.");
                shelterPets.actionFeedAllPets();
            } else if (userResponse == 2) {
                System.out.println("You selected to give all the dogs some fresh iced water.");
                shelterPets.actionGiveWaterToPets();
            } else if (userResponse == 3) {
                System.out.println("You get to play with a dog. Which furry friend would you like to play with?");
                System.out.println("1. " + pet1.getName() + " the " + pet1.getDescription() + " German Shepperd.");
                System.out.println("2. " + pet2.getName() + " the " + pet2.getDescription() + " Australian Terrier.");
                System.out.println("3. " + pet3.getName() + " the " + pet3.getDescription() + " St. Bernard.");
                System.out.println("4. " + pet4.getName() + " the " + pet4.getDescription() + " Siberian Husky");
                String userPlayOption = scanner.nextLine();
                System.out.println("You can take" + userPlayOption + "to the park.");
                shelterPets.actionPlayWithPet(userPlayOption);

            } else if (userResponse == 4) {
                System.out.println("You have selected to adopt a lifelong companion." + "\n" +
                        "What furry friend would you like to take home?");
                String userInput = scanner.nextLine();
                shelterPets.adoptPet(userInput);
                System.out.println("\n" + "Congrats! You adopted " + userInput + " as your new pet." + "\n");
            } else if (userResponse == 5) {
                System.out.println("You have selected to bring in a dog. What's the name of our new furry friend?");
                String userInput = scanner.nextLine();          // java is waiting for user input
                System.out.println("How would you describe the dog? (ex.breed and attributes)");
                String userDescription = scanner.nextLine();
                VirtualPet newPet = new VirtualPet(userInput, userDescription);
                shelterPets.addPet(newPet);
                System.out.println("Thank you " + userInput + " is now part of our shelter!" + "\n");
            } else if (userResponse == 6) {
                System.out.println("Thank you for visiting The Doggy Shelter, have a good day.");
                break;
            } else {
                continue;
            }
            shelterPets.tickAll();   //call to tick method in VirtualPetShelter
        }
    }

}



