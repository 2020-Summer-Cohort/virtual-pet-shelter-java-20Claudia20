package shelter;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> petMap = new HashMap<String, VirtualPet>();

    public void addPet(VirtualPet pet) {petMap.put(pet.getName(), pet);
    }

    public void adoptPet(VirtualPet pet) {
        petMap.remove(pet.getName(), pet);
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

    // set up tick method (does this call for each pet and update needs?)
    public void tickAll() {
        for (VirtualPet petToTick : petMap.values())
            petToTick.tick();
    }
}




