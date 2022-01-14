package pokemonregister.application;

import pokemonregister.database.Register;
import pokemonregister.pokemon.Species;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

    public static void application(){

        Species speciesRegister = new Species();
        Scanner scanner = new Scanner(System.in);

        System.out.println("(------------------------- Welcome to Pokedex (-------------------------");
        System.out.println("1 > Add a new specie");
        System.out.println("2 > List view");
        System.out.println("3 > Search specie");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("4 > Type to exit");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        int specieselected = scanner.nextInt();
        switch (specieselected){
            case 1:
                System.out.println("~ Type your PokemonID: ~");
                speciesRegister.setIdspecie(scanner.nextInt());
                System.out.println("~ Type the Name ~");
                speciesRegister.setName(scanner.next());
                System.out.println("~ Write the Type ~");
                try{
                    speciesRegister.setType(scanner.next());

                }catch (InputMismatchException ex) {
                    System.out.println("Invalid type !!!");
                    System.out.println();
                    Application.application();
                }catch (NumberFormatException exc){
                    System.out.println("Invalid type !!!");
                    Application.application();
                }
                System.out.println("~ Type your Element ~");
                speciesRegister.setElement(scanner.next());
                System.out.println("~ Type your force ~");

                try{
                    speciesRegister.setForce(scanner.nextInt());

                }catch (InputMismatchException ex){
                    System.out.println("Invalid type !!!");
                    Application.application();
                }catch (NumberFormatException exc){
                    System.out.println("Invalid type !!!");
                    Application.application();
                }

                Register.addSpecies(speciesRegister.getIdspecie(), speciesRegister);
                Application.application();

                break;
            case 2:
                Register.listSpecie();
                Application.application();

                break;
            case 3:
                System.out.println("~ Write the Pokemon Name ~");
                String pokemonname = scanner.next();
                Register.searchSpecie(pokemonname);
                Application.application();

                break;
            case 4:
                System.out.println("!!! Success Registered !!!" + " \n\n Thank you =^.^=");

                break;
            default:
                System.out.println("Invalid Option !!!");
                Application.application();
                break;
        }
    }
}