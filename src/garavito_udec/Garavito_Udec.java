package garavito_udec;

import garavito_udec.Controllers.Music;
import garavito_udec.Controllers.numberGames;

public class Garavito_Udec {
    public static void main(String args[]) throws Exception {
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                numberGames v1 = new numberGames();
                v1.setVisible(true);
            }
        });
        
        //start music
        Music y = new Music();
        y.AbrirFichero("C:/Users/Crisbrix/Desktop/Garavito_Udec/src/media/nombre1.mp3");
        y.Play();
        
    }
}
