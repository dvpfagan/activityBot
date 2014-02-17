import java.awt.Robot;
import java.awt.event.KeyEvent;

/**
 * 
 * @author Dave
 *
 */
public class ProgramSwitcher implements Runnable {
	int wait;
	
	public ProgramSwitcher(){
		this.wait = 1000;
	}
	
	public ProgramSwitcher(int wait){
		this.wait = wait;
	}
	
	@Override
	public void run(){
		try{
			Robot robot = new Robot();
			while(true){
				//We want the program to tab 3 times 
				robot.keyPress(KeyEvent.VK_ALT);
				for(int i =0; i<4; i++)
					robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_ALT);
				//Want the thread to sleep for a while
				Thread.sleep(wait); 
			}
			}catch (Exception e) {
				System.exit(0);
			}
	}
}
