import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;

public class Federacion <T>  {

    private String nombre;
    private String fechaFundacion;
    private int cantidadCopas;

     private boolean entrenador=false;

     private int cantFutbo=0;

    private HashSet<T> listado=new HashSet<>();

    ///constructores
    public Federacion(){

    }

    public Federacion(String nombre, String fechaFundacion, int cantidadCopas) {
        this.nombre = nombre;
        this.fechaFundacion = fechaFundacion;
        this.cantidadCopas = cantidadCopas;
    }

    ///getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(String fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public int getCantidadCopas() {
        return cantidadCopas;
    }

    public void setCantidadCopas(int cantidadCopas) {
        this.cantidadCopas = cantidadCopas;
    }

    ///metodos

    public void agregarMiembros(T miembroPlantel) throws CantidadMaxFutbolistas, CapacidadMaximaEntrenador{



        if (miembroPlantel instanceof Futbolistas  && cantFutbo==23){
            throw new CantidadMaxFutbolistas("Alcanzaste la capacidad maxima de futbolistas a agregar");
        }
       else if(miembroPlantel instanceof  Futbolistas){
           listado.add(miembroPlantel);
           cantFutbo++;


        }
       else if(miembroPlantel instanceof Masajistas){
           listado.add(miembroPlantel);
        } else if (miembroPlantel instanceof AyudanteCampo) {

           listado.add(miembroPlantel);

        }  if (miembroPlantel instanceof Entrenador && entrenador==true) {

           throw new CantidadMaxFutbolistas("Solo puede haber un entrenador por seleccion");

        } else if (miembroPlantel instanceof Entrenador && entrenador==false) {

           listado.add(miembroPlantel);
           entrenador=true;

        }

    }

    public void quitar(T miembro){

        listado.remove(miembro);
    }

    public void listar(){

        for(T miembro: listado){
            System.out.println(miembro.toString());
        }
    }

    public void exportarDatos (String path, Federacion<T> federa) throws IOException {


        File file=new File(path);

        ObjectMapper objectMapper=new ObjectMapper();

        if(!file.exists() ) throw new FileNotFoundException();

        try{
            objectMapper.writeValue(file, federa);


        } catch (IOException e){
            System.out.println(e.getMessage());
        }


    }

    public void leerArchivo (String path) throws IOException{

        File file=new File(path);



        ObjectMapper objectMapper=new ObjectMapper();

        if(!file.exists()) throw  new FileNotFoundException();


        try{
            Federacion fede=objectMapper.readValue(file, Federacion.class);
            System.out.println(fede);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
    
    @Override
    public String toString() {
        return "Federacion{" +
                "nombre='" + nombre + '\'' +
                ", fechaFundacion=" + fechaFundacion +
                ", cantidadCopas=" + cantidadCopas +
                ", listado=" + listado +
                '}';
    }


}
