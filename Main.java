package game;

import javax.swing.JOptionPane;

import jplay.GameImage;
import jplay.Keyboard;
import jplay.URL;
import jplay.Window;

public class Main {

	public static void main(String[] args) {
		
	   Window janela = new Window(700,500); 
      GameImage plano = new GameImage(URL.sprite("19.png"));
      Keyboard teclado  = janela.getKeyboard();
      while(true) {
    	  plano.draw();
    	  janela.update();
    	  
    	  if(teclado.keyDown(Keyboard.ENTER_KEY)) {
    		  JOptionPane.showInternalMessageDialog(null, "funcionando");  
    	  }
    	  
      }
	}

}
