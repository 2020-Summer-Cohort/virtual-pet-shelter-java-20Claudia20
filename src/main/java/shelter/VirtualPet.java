package shelter;

public class VirtualPet {

    //declare variables
    private String name;
    private String description;
    private int hunger;
    private int thirst;
    private int boredom;

    //create constructor with name and desc
    public VirtualPet(String name, String desc) {
        this.name = name;
        this.description = desc;
    }

    public VirtualPet(String name, String desc, int hunger, int thirst, int boredom) {
        this.name = name;
        this.description = desc;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
    }

    // create getter methods
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    // methods to update game stats based on UserOption
    public void actionFeedAnimals() {
        hunger += 5;
    }

    public void actionGiveWaterToAnimals() {
        thirst += 5;
    }

    public void actionPlayWithAPet() {
        boredom -= 5;
    }


    void tick() {
        hunger = hunger -= 2;
        thirst = thirst -= 2;
        boredom = boredom -= 2;
    }
}
