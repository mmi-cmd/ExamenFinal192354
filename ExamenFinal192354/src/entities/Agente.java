package entities;

public class Agente extends Entidad {
    private String habilidadEspecial;
    private String misionAsignada;
    protected int habilidad;
    protected int incremento;




    public Agente(int id, String nombre, String habilidadEspecial, int habilidad, int incremento) {
        super(id, nombre);
        this.habilidadEspecial = habilidadEspecial;
        this.habilidad = habilidad;
        this.incremento = incremento;
    }

    

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    public String getMisionAsignada() {
        return misionAsignada;
    }

    public void asignarMision(String mision) {
        this.misionAsignada = mision;
    }

    @Override
    public String toString() {
        return super.toString() + ", Habilidad Especial: " + habilidadEspecial +
                (misionAsignada != null ? ", Misión: " + misionAsignada : "");
    }

  
    public void entrenar(String habilidad, int incremento){
        this.habilidad += incremento;
        System.out.println("Ahora tu habilidad es: " + habilidad);
    }
   
}
