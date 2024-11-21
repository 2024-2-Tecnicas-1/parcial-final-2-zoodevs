package logicaNegocio;

public class Delfin extends Animal {
    
    public Delfin(){
       super("Delfin", TipoHabitat.ACUATICO);
    }

    @Override
    public String emitirSonido() {
        return "Chirrido";
    }

    @Override
    public String obtenerDieta() {
        return "Pescado";
    }
    // TODO: Aquí va tu código
}


