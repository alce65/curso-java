package accounting;

public class Company {

    private String nif;
    private String name;

    Company(String nif, String name) {
        this.nif = nif;
        this.name = name;
    }

    String getNif() {
        return this.nif.toUpperCase();
    }

    String getName() {
        return name;
    }
    
}
