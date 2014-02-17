import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Random;

/**
 * 
 * @author Dave
 *
 */
public class MouseMover implements Runnable {
	int wait , clicks;
	
	public MouseMover(){
		this.clicks = 1000;
		this.wait = 1000;
	}
	
	public MouseMover(int wait, int click){
		this.wait = wait;
		this.clicks = click;
	}
	
	@Override
	public void run(){
		try{
			Random rand = new Random();
			Robot robot = new Robot();
			Point a;
			for(int i = 0; i<this.clicks;i++){
			a = MouseInfo.getPointerInfo().getLocation();	
			robot.mouseMove(150,500); 
			robot.mousePress(InputEvent.BUTTON1_MASK);
	        robot.mouseRelease(InputEvent.BUTTON1_MASK);
	        Thread.sleep(10);
			robot.mouseMove((int)(a.getX()+rand.nextInt(250)),
							(int)(a.getY()+rand.nextInt(150)));
			Thread.sleep(wait); 
			robot.mouseWheel(-100);
			}
			}catch (Exception e) {
				System.exit(0);
			}
	}
}
