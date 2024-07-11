public class Animal {
    // protected variable
    protected String species;
    
    // protected constructor
    protected Animal(String species) {
        this.species = species;
    }
    
    // protected method
    protected void displaySpecies() {
        System.out.println("Species: " + species);
    }
}