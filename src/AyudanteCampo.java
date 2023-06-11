public class AyudanteCampo extends Seleccion implements Jugar, PrepararEntrenamiento{

    private String metodologia;


    ///constructores
    public AyudanteCampo(){

    }

    public AyudanteCampo(String metodologia) {
        this.metodologia = metodologia;
    }

    public AyudanteCampo(String nombre, String apellido, int edad, String metodologia) {
        super(nombre, apellido, edad);
        this.metodologia = metodologia;
    }

    ///getters y setters

    public String getMetodologia() {
        return metodologia;
    }

    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }

    @Override
    public String toString() {
        return super.toString()+  "AyudanteCampo{" +
                "metodologia='" + metodologia + '\'' +
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
        // Lógica para jugar un partido
        System.out.println("El ayudante juega el partido.");
    }


    public void prepararEntrenamiento() {
        // Lógica para preparar el entrenamiento
        System.out.println("El ayudante prepara el entrenamiento.");
    }
}
