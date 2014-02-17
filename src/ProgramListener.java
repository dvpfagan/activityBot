import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * 
 * @author Dave
 *
 */
public class ProgramListener implements Runnable {
	int wait;
	
	public ProgramListener(){
		this.wait = 1000;
	}
	
	public ProgramListener(int wait){
		this.wait = wait;
	}
	
	@Override
	public void run(){
		new KeyListener()
        {
              //When any key is pressed and released then the 
              //keyPressed and keyReleased methods are called respectively.
              //The keyTyped method is called when a valid character is typed.
              //The getKeyChar returns the character for the key used. If the key
              //is a modifier key (e.g., SHIFT, CTRL) or action key (e.g., DELETE, ENTER)
              //then the character will be a undefined symbol.
              @Override 
              public void keyPressed(KeyEvent e)
              {
            	  if (e.getKeyCode() == KeyEvent.VK_Q) {
                      System.out.println("pressed");
            		  System.exit(0);
                  } 
              }

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
        };
		
	}
}
