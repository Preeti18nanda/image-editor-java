package MainPackage;
import javax.swing.*;
public class Demo extends JFrame {
    
	public Demo()
	{
		JFrame frame=new JFrame("demo");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(null);
		JLabel background;
		setSize(1200,700);
		setLayout(null);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		ImageIcon img= new ImageIcon("billy-freeman-bAsxH3pWW8I-unsplash.jpg");
		background=new JLabel("",img,JLabel.CENTER);
		background.setBounds(0,0,1200,700);
		frame.add(background);

	}

    public static void main(String[] args) {
        new Demo();
    }
}
