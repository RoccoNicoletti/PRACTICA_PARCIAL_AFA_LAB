import javax.imageio.IIOException;
import java.io.IOException;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Futbolistas futbolista1 = new Futbolistas("Lionel", "Messi", 35, 10, "DELANTERO");
        AyudanteCampo ayudante = new AyudanteCampo("Tomi", "Rosado", 10, "kineo");
        Entrenador entrenador2 = new Entrenador("Coco", "Basile", 80, "4-3-3", "OFENSIVO");
        Masajistas masaje = new Masajistas("Rocco", "Nicoletti", 30, "decrack", 10);


        Federacion fed = new Federacion<>("Argentina","1990, 8, 20",  3);
        try {
            fed.agregarMiembros(futbolista1);
            fed.agregarMiembros(ayudante);
            fed.agregarMiembros(entrenador2);
            fed.agregarMiembros(masaje);
            fed.listar();


        } catch (CantidadMaxFutbolistas e) {

            System.out.println(e.getMessage());
        } catch (CapacidadMaximaEntrenador ex) {
            System.out.println(ex.getMessage());
        }

        try {
            fed.exportarDatos("ArchivoAFA.json", fed);


        } catch (IOException E) {
            System.out.println(E.getMessage());
        }

        System.out.println("Mostrando archivo...");

        try {
            fed.leerArchivo("ArchivoAFA.json");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }








   }
}