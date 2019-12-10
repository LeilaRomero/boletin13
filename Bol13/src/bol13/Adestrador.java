package bol13;

/**
 *
 * @author lromerofajar
 */
public class Adestrador extends SeleccionFutbol {

    private String idFederacion;

    public void dirixirPartido() {

        System.out.println("Dirigir o partido");
        
    }

    public void dirixirAdestramento() {

        System.out.println("Dirixir o adestramento");
        
    }

    public Adestrador(String idFederacion, int id, int edade, String nome, String apelido) {
        super(id, edade, nome, apelido);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return super.toString() + idFederacion +" id Federacion";
    }


    public void viaxar(){
        System.out.println("Viaxar os adestradores");
    }
  
    
}
