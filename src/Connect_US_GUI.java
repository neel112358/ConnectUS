
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.*;

public class Connect_US_GUI
{
    public static void main(String[] args)
    {
    	    //Frame
        /*JFrame frame1 = new JFrame();
        
        frame1.setLayout(new FlowLayout(FlowLayout.CENTER));
		frame1.setSize(1200, 600);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setLocationRelativeTo(null);
		

		
		
		
        //Logo Panel      
		
        JPanel Uspanel = new JPanel();
        Uspanel.setLayout(new GridLayout(0, 1));
		Uspanel.setSize(600, 300);
		JLabel label = new JLabel();
        
        
     
		
        
        
        frame1.add(Uspanel);
        
        frame1.setVisible(true);
        */
    	
        

}
    

    public class Tutorial extends JFrame
    {
           JPanel jp = new JPanel();
           JLabel jl = new JLabel();

           public Tutorial()
           {
                  setTitle("Tutorial");
                  setVisible(true);
                  setSize(400, 200);
                  setDefaultCloseOperation(EXIT_ON_CLOSE);

                  jl.setIcon(new ImageIcon("C:\\Your image directory goes here"));
                  jp.add(jl);
                  add(jp);

                  validate();
           }

          
    }
}



