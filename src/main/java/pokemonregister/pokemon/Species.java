package pokemonregister.pokemon;

public class Species {

    private String name;
    private int idspecie;
    private String type;
    private String element;
    private int force;

    public Species() {
    }

    public Species(String name, String type, String element, int force, int idspecie) {
        this.name = name;
        this.type = type;
        this.element = element;
        this.force = force;
        this.idspecie = idspecie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getIdspecie() {
        return idspecie;
    }

    public void setIdspecie(int idspecie) {
        this.idspecie = idspecie;
    }
}
