import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pong extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    public static final String TITLE = "Pong Pre-Alpha 0.01";
    
    public static final JPanel panel = new JPanel();
    public static Pong frame = new Pong();
    public static JLabel ball = new JLabel();
    public static boolean run;
    public boolean right;
    public boolean down;

	public static void main(String[] args) {
		setComponents();
        frame.pack();
        frame.setTitle(TITLE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
	}
	
	public void setBackground() {
		panel.setBackground(Color.WHITE);
		ball.setSize(30, 30);
		ball.setLocation(0, 0);
		ball.setOpaque(true);
		ball.setBackground(Color.RED);
	}
	
	public void moveBall() {
		right = true;
		down = true;
		while (run) {
			moveDir();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void moveDir() {
		if (right) {
			ball.setLocation(ball.getX() + 1, ball.getY());
		}
		else {
			ball.setLocation(ball.getX() - 1, ball.getY());
		}
		if (down) {
			ball.setLocation(ball.getX(), ball.getY() + 1);
		}
		else {
			ball.setLocation(ball.getX(), ball.getY() - 1);
		}
	}
	
	public static void start() {
		run = true;
	}
	
	public static void setComponents() {
		frame.setBackground();
		panel.add(ball);
		frame.add(panel);
	}
}
