package juego;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Aitor
 */
public class CrearEscenario{
    
    public CrearEscenario(){
        
    }

   int[][] crearEscenario() {
        int[][] esc = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},//Columna
            {1, 0, 0, 1, 0, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 7, 1},//1
            {1, 0, 10, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 1, 8, 1},//2
            {1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1},//3
            {1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1},//4
            {1, 0, 0, 0, 0, 0, 1, 0, 3, 0, 0, 0, 1, 0, 3, 0, 1, 0, 0, 1, 1, 1},//5
            {1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 4, 1},//6
            {1, 3, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 21, 0, 0, 0, 1, 4, 1},//7
            {1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 4, 1},//8
            {1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1},//9
            {1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1},//10
            {1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1},//11
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1},//12
            {1, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1},//13
            {1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 2, 0, 1, 0, 1},//14
            {1, 0, 0, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1},//15
            {1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1},//16
            {1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 1, 0, 1},//17
            {1, 0, 2, 1, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1},//18
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}//19
        };
        return esc;
    }
    
    public ImageIcon obtenerImagen(int nImg) {
        switch (nImg) {
            case Contenedor.suelo:
                return new ImageIcon(getClass().getResource("/Imagenes/C.png"));
            case Contenedor.muro:
                return new ImageIcon(getClass().getResource("/Imagenes/M.png"));
            case Contenedor.personajeD:
                return new ImageIcon(getClass().getResource("/Imagenes/PD.png"));
            case Contenedor.personajeI:
                return new ImageIcon(getClass().getResource("/Imagenes/PI.png"));
            case Contenedor.personajeA:
                return new ImageIcon(getClass().getResource("/Imagenes/PArr.png"));
            case Contenedor.personajeAb:
                return new ImageIcon(getClass().getResource("/Imagenes/PAb.png"));
            case Contenedor.moneda:
                return new ImageIcon(getClass().getResource("/Imagenes/Moneda.gif"));
            case Contenedor.sigM:
                return new ImageIcon(getClass().getResource("/Imagenes/sigM.gif"));
            case Contenedor.sigX:
                return new ImageIcon(getClass().getResource("/Imagenes/sigX.png"));
            case Contenedor.zombieD:
                return new ImageIcon(getClass().getResource("/Imagenes/ZD.png"));
            case Contenedor.zombieI:
                return new ImageIcon(getClass().getResource("/Imagenes/ZI.png"));
            case Contenedor.live:
                return new ImageIcon(getClass().getResource("/Imagenes/L.gif"));
            case Contenedor.bala:
                return new ImageIcon(getClass().getResource("/Imagenes/B.gif"));
            case Contenedor.municion:
                return new ImageIcon(getClass().getResource("/Imagenes/BI.png"));
            default:
                return new ImageIcon(getClass().getResource("/Imagenes/C.png"));
        }
    }

    
}


