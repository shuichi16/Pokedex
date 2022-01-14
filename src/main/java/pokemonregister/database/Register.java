package pokemonregister.database;

import pokemonregister.pokemon.Species;

import java.util.HashMap;
import java.util.Map;

public class Register {
    public static Map<Integer, Species> mapSpecies = new HashMap<>();

    public static void addSpecies(Integer idspecie, Species species) {
        mapSpecies.put(idspecie, species);
        System.out.println(species);
        System.out.println("Specie added");

    }

    public static void listSpecie() {
        for (Integer id : mapSpecies.keySet()) {
            Species liststore = mapSpecies.get(id);
            System.out.println(liststore);
            System.out.println();
        }
    }

    public static void searchSpecie(String nome) {
        for (Integer id : mapSpecies.keySet()) {
            Species liststores = mapSpecies.get(id);

            System.out.println();
            if(liststores.getName().equals(nome)) {
                System.out.println("Name: " + liststores.getName() +
                        ", Type: " + liststores.getType() +
                        ", Element: " + liststores.getElement());
                //ProductApplication.application();
            } else {
                System.out.println();
                System.out.println("No Pokemon Found !!!");
                //ProductApplication.application();
            }
        }
    }

}
