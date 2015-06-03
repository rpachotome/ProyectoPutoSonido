

package juego;
import java.applet.AudioClip;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Sonido {
    public void bso() {
       
           
            AudioClip sonido;
            sonido= java.applet.Applet.newAudioClip(getClass().getResource("/juego/ambiente.wav"));
            sonido.play();
    }
    }

