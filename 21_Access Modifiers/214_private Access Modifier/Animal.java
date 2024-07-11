public class Animal {
    // private variable
    private String species;
    
    // public constructor
    public Animal(String species) {
        this.species = species;
    }
    
    // private method
    private void displaySpecies() {
        System.out.println("Species: " + species);
    }
    
    // public method to access private method
    public void showSpecies() {
        displaySpecies();
    }
}