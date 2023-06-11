public class Masajistas extends Seleccion{

    private String titulo;
    private int añosExperiencia;


    ///constructores
    public Masajistas(){

    }

    public Masajistas(String titulo, int añosExperiencia) {
        this.titulo = titulo;
        this.añosExperiencia = añosExperiencia;
    }

    public Masajistas(String nombre, String apellido, int edad, String titulo, int añosExperiencia) {
        super(nombre, apellido, edad);
        this.titulo = titulo;
        this.añosExperiencia = añosExperiencia;
    }

    ///getters y setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public String toString() {
        return  super.toString()+"Masajistas{" +
                "titulo='" + titulo + '\'' +
                ", añosExperiencia=" + añosExperiencia +
                '}';
    }

    @Override
    public void viajan() {
        System.out.println("Viaja");
    }

    @Override
    public void concentran() {

        System.out.println("Concentra");

    }


    public void asistencia(){
        System.out.println("asiste");
    }
}
