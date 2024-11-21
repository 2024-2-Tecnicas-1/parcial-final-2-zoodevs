package logicaNegocio;

public class Leon extends Animal{
    
    public Leon(){
        super("Leon", TipoHabitat habitat.Terrestre)
    }
    
    public String emitirSonido(){
        return "Rugido";
    }
    
    public String obtenerDieta(){
        return "Carnívoro";
    }
    
    
}
