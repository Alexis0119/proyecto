package arraylist;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> lis = new ArrayList<>(Arrays.asList("A","B","C","D","E","F"));
        lis.forEach(element ->{
            System.out.println("El valor de la lista: "+ element);
            if (element.equals("D")){
                System.out.println("Se encontro la cadena: ");
            }
        });
        
        lis.add("G");
        lis.add("H");
        System.out.println("\n\n Otra forma de recorrer la lista \n ");
        for(String cont:lis){
            System.out.println("El valor de la lista es: "+ cont);
        }
        
        lis.add("I");
        lis.add("J");
        lis.add("K");
        String variable ="L";
        lis.add(variable);
        System.out.println("\n\n Otra forma de recorre es: \n");
        lis.stream().forEach((cont2)->{
        mensaje(cont2);
    });
    }
    
public static void mensaje(String valor){
    System.out.println("Contiene: "+ valor);
}
}
