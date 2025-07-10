package local.collections.exercices;

import java.util.ArrayList;

public class Ex01 {
    ArrayList<String> listDias = new ArrayList<>();

    public void createWeek() {

        // Crea una lista que contenga los días de la semana.
        listDias.add("Lunes");
        listDias.add("Martes");
        listDias.add("Miercoles");
        listDias.add("Jueves");
        listDias.add("Viernes");
        listDias.add("Sabado");
        listDias.add("Domingo");


        // Inserta en la posición 4 el elemento «Juernes».
        listDias.add(4, "Juernes");
        // listDias.set(4, "Juernes");

        // Copia esa lista a otra llamada listaDos.
        ArrayList<String> listaDos = new ArrayList<>();

        // Añade a listDias el contenido de listaDos.
        listDias.addAll(listaDos);

        // Muestra el contenido de las posiciones 3 y 4 de la lista original.
        System.out.println(listDias.get(3));
        System.out.println(listDias.get(4));
        
        // Muestra el primer elemento y el último de la lista original.
        System.out.println(listDias.get(0));
        System.out.println(listDias.get(listDias.size() - 1));

        // Elimina el elemento que contenga «Juernes» de la lista y comprueba si elimina algo o no.



        // Crea un iterador y muestra uno a uno los valores de la lista original.
        listDias.forEach(item -> System.out.println(item));

        // Busca si existe en la lista un elemento que se denomine «Lunes».

        // Busca si existe en la lista un elemento que se denomine «Lunes». No importa si está en mayúscula o minúscula.

        // Ordena la lista y muestra su contenido.

        // Borra todos los elementos de la lista.

    }

    public static void main(String[] args) {

        Ex01 ex = new Ex01();
        ex.createWeek();



      





        // System.out.println(listDias);
        // listDias.remove(«Juernes»);

        // if(listDias.remove(«Juernes»)){
        // System.out.println(«Borrado»);
        // }else{
        // System.out.println(«No existe»);
        // }

        // Iterator it = listDias.iterator();
        // while(it.hasNext()){
        // System.out.println(it.next());
        // }

        // if (listDias.contains(«Lunes»)){
        // System.out.println(«Si existe Lunes»);
        // }

        // Iterator it2 = listDias.iterator();
        // while(it2.hasNext()){
        // if(it2.next().toUpperCase()==»LUNES»){
        // System.out.println(«Si existe»);
        // }
        // }

        // Collections.sort(listDias);
        // System.out.println(listDias);

        // listDias.clear();
        // System.out.println(listDias);

        // }

    }
}
