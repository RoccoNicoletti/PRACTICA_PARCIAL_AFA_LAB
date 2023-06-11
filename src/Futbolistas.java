public class Futbolistas extends Seleccion implements Jugar{

    private int numCamisetas;
    private String puesto;

    ///constructores
 public Futbolistas(){}

    public Futbolistas(int numCamisetas, String puesto) {
        this.numCamisetas = numCamisetas;
        this.puesto = puesto;
    }

    public Futbolistas(String nombre, String apellido, int edad, int numCamisetas, String puesto) {
        super(nombre, apellido, edad);
        this.numCamisetas = numCamisetas;
        this.puesto = puesto;
    }

    ///getters y setters

    public int getNumCamisetas() {
        return numCamisetas;
    }

    public void setNumCamisetas(int numCamisetas) {
        this.numCamisetas = numCamisetas;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return super.toString()+ "Futbolistas{" +
                "numCamisetas=" + numCamisetas +
                ", puesto='" + puesto + '\'' +
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

    public void jugarPartido() {

        System.out.println("El futbolista juega el partido.");
    }


}
