public class Person {

    // Tipos de numeros
    // byte - 1byte -128 - 127
    // short - 2bytes
    // int - 4bytes
    // long - 8bytes
    // float - decimal 4 bytes
    // double - decimal 8 bytes


    public static void main(String[] args) {

        byte age; // Declaración
        age = 22; // Asignacion
        short birthYear = 1990; // Inicialización = Declaración + Asignación
        int cityPopulation = 4_000_000;
        long countryPopulation = 40_000_000;
        float heigth = 1.78f;
        double weight =  65.74;
        boolean hasPet =  true;
        char type = 'A';
        String name = "Pepe";

        System.out.println("Edad " + age);
        System.out.println("Fecha " + birthYear);
        System.out.println("Población de mi ciudad " +  cityPopulation);
        System.out.println("Población de mi pais " + countryPopulation);
        System.out.println("""
                Altura %s mts
                Peso %s kgs
                ¿Tiene mascotas? %s
                Tipo %s
                Nombre %s
                """.formatted(heigth, weight,hasPet, type, name));
    }
    
}
