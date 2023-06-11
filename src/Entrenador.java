public class Entrenador extends Seleccion{

    private String sistemaJuego;
    private String estilo;


    ///constructores
    public Entrenador(){}

    public Entrenador(String sistemaJuego, String estilo) {
        this.sistemaJuego = sistemaJuego;
        this.estilo = estilo;
    }

    public Entrenador(String nombre, String apellido, int edad, String sistemaJuego, String estilo) {
        super(nombre, apellido, edad);
        this.sistemaJuego = sistemaJuego;
        this.estilo = estilo;
    }

    ///getters y setters


    public String getSistemaJuego() {
        return sistemaJuego;
    }

    public void setSistemaJuego(String sistemaJuego) {
        this.sistemaJuego = sistemaJuego;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return super.toString()+ "Entrenador{" +
                "sistemaJuego='" + sistemaJuego + '\'' +
                ", estilo='" + estilo + '\'' +
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
        System.out.println(" prepara el entrenamiento.");
    }
}
