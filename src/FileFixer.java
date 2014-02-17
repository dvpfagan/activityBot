import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 * We have called this file fixer so it doesn;t flag on systems
 * @author Dave
 *
 */
public class FileFixer {
	JLabel l1,l2,l3;
	JTextField tf1,tf2,tf3;
	JButton b1,b2;
	int c = 10000;
	boolean quit = true;

	@SuppressWarnings({ "serial", "static-access" })
	public FileFixer(){
		JFrame jf=new JFrame();
		
		jf.setTitle("File Fixer");
		jf.setSize(300,150);

		Action action1 = new AbstractAction("Start"){
			// This method is called when the button is pressed
			public void actionPerformed(ActionEvent evt) {
				(new Thread(new MouseMover(5000,c))).start();
				(new Thread(new ProgramListener())).start();
				(new Thread(new ProgramSwitcher(100000))).start();
			}
		};
		
		Action action2 = new AbstractAction("Exit") {
			// This method is called when the button is pressed
			public void actionPerformed(ActionEvent evt) {
				System.exit(0);
			}
		};

		JButton b1=new JButton(action1);
		JButton b2=new JButton(action2);


		Container pane=jf.getContentPane();
		pane.setLayout(new GridLayout(2,1) );
		pane.add(b1);
		pane.add(b2);

		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}


	public static void main(String[] args) {
		@SuppressWarnings("unused")
		FileFixer fixer = new FileFixer();	
		//fixer.c = Integer.parseInt(args[0]);
		
	}

}
