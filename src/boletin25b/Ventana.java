package boletin25b;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Ventana implements ActionListener {
    
    JFrame marco;
    JPanel panel1,panel2;
    JButton ButtonDebuxar,ButtonLimpar;
    JTextField JText;
    int numTexto;
    String num;
    int i;
    
    public void ventana (){
        marco = new JFrame();
        marco.setSize(700,700);
        panel1 = new JPanel();
            
        panel2 = new JPanel();
        ButtonDebuxar = new JButton("Debuxar");
        ButtonLimpar = new JButton("Limpar");
        JText = new JTextField("0"); 
        
        ButtonDebuxar.addActionListener (this);
        ButtonLimpar.addActionListener (this);
        
        panel1.add(ButtonDebuxar);
        panel1.add(ButtonLimpar);
        panel1.add(JText);
        
        marco.add(panel1, BorderLayout.NORTH);
        marco.add(panel2, BorderLayout.CENTER);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object obx = e.getSource();
        
        if(obx == ButtonDebuxar){
            num=String.valueOf(numTexto);
            JText.setText(num);
            for(int i = 0;numTexto == i;i++){
            
            Graphics g = panel2.getGraphics();
            g.drawOval(250+this.i, 250, 10, 10);
            this.i=+15;
            }
        }else
            panel2.repaint();
}
}
    

