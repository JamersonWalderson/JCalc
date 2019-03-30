package view;


import view.CalcGui;
import javax.swing.JFrame;

public class JCalc {

    public static void main(String[] args) {
        CalcGui interfaceUsuario = new CalcGui();
        interfaceUsuario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        interfaceUsuario.setSize(230,210); // configura o tamanho do frame
        interfaceUsuario.setVisible(true); // exibe o frame
        
        
    }
    
}
