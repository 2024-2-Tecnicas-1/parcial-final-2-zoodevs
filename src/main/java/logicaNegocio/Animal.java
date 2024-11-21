package logicaNegocio;

public abstract class Animal {
    
    private String nombre;
    private TipoHabitat habitat;
    
    public Animal(String nombre, TipoHabitat habitat){
        this.nombre = nombre
        this.habitat = habitat
    }
    
    
    public abstract String emitirSonido();
    
    public abstract String obtenerDieta();
}
