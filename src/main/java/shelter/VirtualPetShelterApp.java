package shelter;
import java.util.Scanner;

// Not too far off but we'd like for you to make a couple changes.
// - Lines 34-37 print your pets but are hard coded to the 4 pets you create at the beginning of the program
// this makes it so when we add pets or remove them, the program does not give the user an accurate representation
// of the state of the program, or see the effect of their actions. Try using a for loop like you have in lines
// 29 and 30 to print
// to print.
// - Bonus points if you can clean up your while loop and move your print statements to their own methods within this class

public class VirtualPetShelterApp {
    public static void main(String[] args) {

        VirtualPet pet1 = new VirtualPet("Dexter", "clever German Shepperd", 30, 30, 30);
        VirtualPet pet2 = new VirtualPet("Bono", "ferocious Australian Terrier", 30, 30, 30);
        VirtualPet pet3 = new VirtualPet("Morty", "messy St.Bernard", 30, 30, 30);
        VirtualPet pet4 = new VirtualPet("Leia", "energetic Siberian Husky", 30, 30, 30);

        VirtualPetShelter shelterPets = new VirtualPetShelter();
        shelterPets.addPet(pet1);
        shelterPets.addPet(pet2);
        shelterPets.addPet(pet3);
        shelterPets.addPet(pet4);

        System.out.println("Welcome and thank you for volunteering at The Furry Friends Virtual Pet Shelter!");
        System.out.println("Let's meet the dogs you will be working with." + "\n");
        int petCount = 1;
        for (VirtualPet petToDisplay : shelterPets.retrieveAllPets()) {
            System.out.println(petCount + ". " + petToDisplay.getName() + " the " + petToDisplay.getDescription());
            petCount++;
        }

        while (true) {

            System.out.println("\n" + "This is the status of our furry friends:");
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

            Scanner scanner = new Scanner(System.in);
            int userResponse = scanner.nextInt();
            scanner.nextLine();

            if (userResponse == 1) {
                System.out.println("You selected to give all the dogs their favorite ice cream treats.");
                shelterPets.actionFeedAllPets();
            } else if (userResponse == 2) {
                System.out.println("You selected to give all the dogs some fresh iced water.");
                shelterPets.actionGiveWaterToPets();
            } else if (userResponse == 3) {
                System.out.println("Type the name of the dog you would like to play with?");
                System.out.println(pet1.getName() + "," + pet2.getName() + "," + pet3.getName() + "," + pet4.getName() + ":");
                String userPlayOption = scanner.nextLine();
                System.out.println("You can take " + userPlayOption + " to the park.");
                shelterPets.actionPlayWithPet(userPlayOption);
            } else if (userResponse == 4) {
                System.out.println("You have selected to adopt a lifelong companion." + "\n" +
                        "What furry friend would you like to take home?");
                String userInput = scanner.nextLine();
                shelterPets.adoptPet(userInput);
                System.out.println("\n" + "Congrats! You adopted " + userInput + " as your new pet.");
            } else if (userResponse == 5) {
                System.out.println("You have selected to bring in a dog. What's the name of our new furry friend?");
                String userInput = scanner.nextLine();          // java is waiting for user input
                System.out.println("How would you describe the dog? (ex.breed and attributes)");
                String userDescription = scanner.nextLine();
                VirtualPet newPet = new VirtualPet(userInput, userDescription);
                shelterPets.addPet(newPet);
                System.out.println("Thank you " + userInput + " is now part of our shelter!");
            } else if (userResponse == 6) {
                System.out.println("Thank you for visiting The Furry Friends Shelter, have a good day.");
                break;
            } else {
                continue;
            }
            shelterPets.tickAll();
        }
    }

}



