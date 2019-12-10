package bol13;

/**
 *
 * @author lromerofajar
 */
public class Masaxista extends SeleccionFutbol{

    private String titulacion;
    private int anosExperiencia;

    public void darMasaxes() {

        System.out.println("Dar masaxe");
        
    }

    public Masaxista(String titulacion, int anosExperiencia, int id, int edade, String nome, String apelido) {
        super(id, edade, nome, apelido);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return super.toString() + " titulacion " + titulacion + ", anos Experiencia " + anosExperiencia;
    }

    public void viaxar(){
        System.out.println("viaxan os masaxistas");
    }
    
}
