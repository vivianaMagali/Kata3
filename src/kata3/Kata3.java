/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

/**
 *
 * @author usuario
 */
public class Kata3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Histogram<String> histogram=new Histogram();
        histogram.increment("google.com");
        histogram.increment("google.com");
        histogram.increment("prueba.es");
        histogram.increment("anime.com");
        histogram.increment("anime.com");
        histogram.increment("queascodevida.com");
        histogram.increment("queascodevida.com");
        histogram.increment("queascodevida.com");
        histogram.increment("anime.com");
        histogram.increment("anime.com");
        new HistogramDisplay(histogram).execute();
    }
}
