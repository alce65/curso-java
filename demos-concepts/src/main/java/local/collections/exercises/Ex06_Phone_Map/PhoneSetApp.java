package local.collections.exercises.Ex06_Phone_Map;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

// Definida una clase Empleado con 
// número de empleado
// nombre
// primer apellido
// segundo apellido
// teléfono móvil
// e-mail
// fecha de contratación
// Defina e implemente un directorio de teléfonos mediante un Map<K, V>. 
// En el mismo tendrá entradas de agenda de la clase anterior. 
// Se buscará por el nombre y apellidos y devolverá la entrada de agenda correspondiente. 
// Pruebe a insertar unas pocas entradas y luego a buscar alguna de ellas. 
// Pruebe a insertar dos nombre iguales, que cambie simplemente en el orden de los apellidos.

public class PhoneSetApp {

     private Set<Employee> phoneDirectory = new HashSet<>();

     public void addEntry(Employee employee) {
        // Integer key = generateKey(employee.name,employee.surname,employee.surname2);
        phoneDirectory.add(employee);
     }

     private String generateFullName(String name, String surname, String surname2) {
        StringBuilder fullName = new StringBuilder();
        fullName.append(name.toLowerCase().trim());

        if (surname != null && !surname.isEmpty()) {
            fullName.append(" ").append(surname.toLowerCase().trim());
        }

        if (surname2 != null && !surname2.isEmpty()) {
            fullName.append(" ").append(surname2.toLowerCase().trim());
        }
        System.out.println("Full Name : " + fullName);

        return fullName.toString();

     }

    public void showDirectory() {
        System.out.println("\n📞 COMPLETE PHONE DIRECTORY");
        System.out.println("=".repeat(50));

        if (phoneDirectory.isEmpty()) {
            System.out.println("The directory is empty.");
            return;
        }

        for (Employee employee : phoneDirectory) {
            System.out.println(employee);
            System.out.println("-".repeat(30));
        }
        System.out.println("=".repeat(50));
    }

    /**
     * Searches for an entry by name and surnames
     */
    public Employee searchEntry(String name, String surname, String surname2) {

        Optional<Employee> result = phoneDirectory.stream().filter(
            empleado -> empleado.name.equals(name) && empleado.surname.equals(surname) && empleado.surname2.equals(surname2)
        ).findFirst();

        return result.orElseThrow();
     }

    // /**
    //  * Searches for an entry by full name (format: "name surname1 surname2")
    //  */
    public Employee searchByFullName(String searchFullName) {
        
         Optional<Employee> result  = phoneDirectory.stream().filter(
            (employee) -> {
                String fullName = generateFullName(employee.name,employee.surname, employee.surname2);
                return fullName.equalsIgnoreCase(searchFullName);
            }
        ).findFirst();
         return result.orElseThrow(); 
    }

     public static void main(String[] args) {
        PhoneSetApp phoneAgende = new PhoneSetApp();
        phoneAgende.addEntry(new Employee("Pepa", "Pérez", "Pérez", "21/12/2023"));
        phoneAgende.addEntry(new Employee("Pepe", "Pérez", "López", "21/12/2023"));
        phoneAgende.addEntry(new Employee("Luisa", "López", "Pérez", "12/12/2023"));
        
        System.out.println(phoneAgende);
        phoneAgende.showDirectory();
        System.out.println("Search 1\n" + 
            phoneAgende.searchEntry("Pepe", "Pérez", "López")
        );
        System.out.println("Search 2\n" + 
            phoneAgende.searchByFullName("Pepe Pérez López")
        );
     }

}
