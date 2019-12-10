package bol13;

/**
 *
 * @author lromerofajar
 */
public class Bol13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Xogador xo= new Xogador(1,"do",45,35,"luis","lopez ");
        System.out.println(xo.toString());
        xo.Concentarse();
        xo.Viaxar();
        xo.Concentarse();
        Adestrador ades= new Adestrador("jdhj",44,45,"hs","js");
        ades.Concentarse();
        System.out.println(ades.toString());
        Masaxista mas= new Masaxista("jdj",8,35,45,"lis","jdj");
        System.out.println(mas.toString());
        mas.Concentarse();
        mas.darMasaxes();
        
    }
    
}