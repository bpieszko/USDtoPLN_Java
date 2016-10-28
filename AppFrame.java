import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Toolkit;

public class AppFrame extends JFrame {
	public static JLabel val;
	public AppFrame() {
		super("USD/PLN");

		setSize(300, 300);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dimension.width / 2  - 150, dimension.height / 2 - 150);

		val = new JLabel("", SwingConstants.CENTER);
		add(val);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}