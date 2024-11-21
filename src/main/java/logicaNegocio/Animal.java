package logicaNegocio;

public abstract class Animal {
    
    private final String nombre;
    private final TipoHabitat habitat;
    
    public Animal(String nombre, TipoHabitat habitat){
        this.nombre = nombre;
        this.habitat = habitat;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public TipoHabitat getHabitat(){
        return this.habitat;
    }
    
    
    public abstract String emitirSonido();
    
    public abstract String obtenerDieta();
}
