package garavito_udec.Controllers;

import java.io.File;
import javazoom.jlgui.basicplayer.BasicPlayer;


public class Music {
    public BasicPlayer player;

    public Music() {
        player = new BasicPlayer();
    }
public void coge(String y){

}
    public void Play() throws Exception {
        player.play();
    }

    public void AbrirFichero(String ruta) throws Exception {
        player.open(new File(ruta));
    }

    public void Pausa() throws Exception {
        player.pause();
    }

    public void Continuar() throws Exception {
        player.resume();
    }

    public void Stop() throws Exception {
        player.stop();
    }
    public void reproducemp3 () throws Exception{
       try {
        Music sound = new Music();
            sound.AbrirFichero("C:/Users/Crisbrix/Desktop/Garavito_Udec/src/media/nombre1.mp3");
            sound.Play();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    /*public static void main(String args[]) throws Exception{
     Music y = new Music();
     y.AbrirFichero("C:/Users/Crisbrix/Documents/NetBeansProjects/Music/src/music/nombre1.mp3");
     y.Play();
    }*/
}