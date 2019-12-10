package bol13;

/**
 *
 * @author lromerofajar
 */
public class SeleccionFutbol {
    
    private int id, edade;
    private String nome, apelido;
    
    public void Concentarse(){
        
        System.out.println("Concentrarse a seleccion");
        
    }
    
    public void Viaxar(){
       
        System.out.println("Viaxa a seleccion");
        
    }

    public SeleccionFutbol(int id, int edade, String nome, String apelido) {
        this.id = id;
        this.edade = edade;
        this.nome = nome;
        this.apelido = apelido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdade() {
        return edade;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    @Override
    public String toString() {
        return "Seleccion Futbol" + " id " + id + ", edade " + edade + ", nome " + nome + ", apelido " + apelido;
    }
    
    
}
