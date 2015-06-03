package juego;


import java.io.IOException;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Juego {

    public static void main(String[] args) throws LineUnavailableException, IOException, InterruptedException, UnsupportedAudioFileException {
        Sonido son=new Sonido();
      son.bso();
        
        Escenario esc=new Escenario();
        esc.setVisible(true);
        
       
        
       
    }
    
}
