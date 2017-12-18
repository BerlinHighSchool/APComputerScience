import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class guiTest {



	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guiTest window = new guiTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public guiTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		final int FPS_MIN = 0;
		final int FPS_MAX = 30;
		final int FPS_INIT = 15;
		JSlider framesPerSecond = new JSlider(JSlider.HORIZONTAL,
				FPS_MIN, FPS_MAX, FPS_INIT);
		framesPerSecond.setMajorTickSpacing(10);
		framesPerSecond.setMinorTickSpacing(1);
		framesPerSecond.setPaintTicks(true);
		framesPerSecond.setPaintLabels(true);
		framesPerSecond.setBounds(30, 30, 300, 50);
		frame.getContentPane().add(framesPerSecond);

		ChangeListener listener = new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider)e.getSource();
				if (source.getValueIsAdjusting()) {
					int value = source.getValue(); // <-- gets the value at the slider mark
				}
			}
		};
		framesPerSecond.addChangeListener(listener);
	}
}
