package shelter;

public class VirtualPet {
    private String name;
    private String desc;
    private int hunger;
    private int thirst;
    private int boredom;

    public VirtualPet(String name, String desc, int hunger, int thirst, int boredom) {
        this.name = name;
        this.desc = desc;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
    }
    public VirtualPet(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
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
        hunger += 10;
    }
    public void actionGiveWaterToAnimals(){
        thirst += 10;
    }

    public void addPet() {

    }

    public void tick() {
    }
}

   /* void tick(){
        hunger = hunger -=2;
    }
*/
