package shelter;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> petMap = new HashMap<>();

    public void addPet(VirtualPet pet) {
        petMap.put(pet.getName(), pet);
    }

    public void adoptPet(String petName) {
        petMap.remove(petName);
    }

    public void actionFeedAllPets() {
        for (VirtualPet petToFeed : petMap.values()) {
            petToFeed.actionFeedAnimals();
        }
    }

    public void actionGiveWaterToPets() {
        for (VirtualPet petToWater : petMap.values()) {
            petToWater.actionGiveWaterToAnimals();
        }
    }

    public void actionPlayWithPet(String petName) {
        petMap.get(petName);
    }

    // set up tick method
    public void tickAll() {
        for (VirtualPet petToTick : petMap.values())
            petToTick.tick();
    }
}




