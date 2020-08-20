package datolist;
import java.util.ArrayList;
import java.util.List;
public class Datolist {
        public Datolist(){
            principal();
        }
        public void principal(){
            List<Datos> lista = new ArrayList<>();
            Datos datos = new Datos();
            datos.setNom("Oscar");
            datos.setEdad(34);
            
            lista.add(datos);
            
            datos = new Datos();
            
            datos.setNom("Alexis");
            datos.setEdad(20);
            
            lista.add(datos);
            datos = new Datos();
            
            datos.setNom("Evelyn");
            datos.setEdad(20);
            
            lista.add(datos);
            datos = new Datos();

            
            lista.forEach(elemento ->{
                System.out.println("Nombre: "+elemento.getNom());
                System.out.println("Edad: "+elemento.getEdad());                
            });
            System.out.println("\n\n Otra forma de recorrer datos: ");
            
            for(Datos cont : lista){
                System.out.println("Nombre: "+ cont.getNom());
                System.out.println("Edad: "+ cont.getEdad());
            }
            datos = new Datos();
            
            datos.setNom("Raul");
            datos.setEdad(30);
            
            lista.add(datos);
            
            System.out.println("\n\n 3ra forma de recorrer los datos:");
            lista.stream().forEach((Valor) ->{
                System.out.println("Nombre: "+ Valor.getNom());
                System.out.println("Edad: "+ Valor.getEdad());
                
                if(Valor.getNom().equals("Alexis")){
                    System.out.println("Se encontro el nombre: ");
            }
            });
        }
    
    public static void main(String[] args) {
        new Datolist();
    }
}
