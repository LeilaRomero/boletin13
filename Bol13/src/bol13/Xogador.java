package bol13;

/**
 *
 * @author lromerofajar
 */
public class Xogador extends SeleccionFutbol {

    private int dorsal;
    private String demarcacion;

    public void xogarPartido() {

        System.out.println("Xogar Partido");
        
    }

    public void entrenar() {

        System.out.println("Entrenar antes del Partido");
        
    }

    public Xogador(int dorsal, String demarcacion, int id, int edade, String nome, String apelido) {
        super(id, edade, nome, apelido);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString() {
        return super.toString() + dorsal + " dorsal " + demarcacion + " demarcacion";
    }

    public void viaxar(){
        System.out.println("Viaxan os Xogadores");
    }
    
}
