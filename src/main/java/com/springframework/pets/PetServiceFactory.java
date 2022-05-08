package com.springframework.pets;

/**
 * @author igorg
 * Date 08.05.2022
 */
public class PetServiceFactory {

    public PetService getPetService(String petType) {
        switch (petType) {
            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();

        }

    }
}
