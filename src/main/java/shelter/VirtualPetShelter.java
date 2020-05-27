package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> petMap = new HashMap<>();

    public Collection<VirtualPet> retrieveAllPets() {
        return petMap.values();
    }
    public void addPet(VirtualPet pet) {
        petMap.put(pet.getName(), pet);
    }
    public void adoptPet(String petName) {   //need to call this method, ask user which one they will like to remove
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

    public void tickAll() {
        for (VirtualPet petToTick : petMap.values())
            petToTick.tick();
    }
}




