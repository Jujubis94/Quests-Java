public class Hangar {
    public static void main(String[] args) {
        Car clio = new Car("Clio", 150000);
        Boat titanic = new Boat("Titanic", 100);

        System.out.println(clio.doStuff());  
        System.out.println(titanic.doStuff()); 
        
        System.out.println("La " + clio.getBrand() + " a " + clio.getKilometers() + " kilomètres");
        
        clio.setKilometers(160000);

        System.out.println("La " + clio.getBrand() + " a " + clio.getKilometers() + " kilomètres");
    }
}
