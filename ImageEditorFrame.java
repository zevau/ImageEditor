import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;


public class ImageEditorFrame extends JFrame {
	public ImageEditorFrame(String title){
		setTitle(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 300);
		setVisible(true);
	}

	private void onOpen(){
		try{
			JFileChooser fileChooser = new FileChooser();
			fileChooser.showOpenDialog(this);
			File file = fileChooser.getSelectedFile();
			BufferedImage image = ImageIO.read(file);
			panel.setImage(image);
		}
		catch(IOException e) {
			JOptionPane.showMessageDialog(this, "Die Datei konnte nicht geöffnet werden");
		}
	
	}
}