package view;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.*;

public class CalcGui extends JFrame {
    // encapsulamento
    private JButton botao0;
    private JButton botao1; 
    private JButton botao2;
    private JButton botao3;
    private JButton botao4;
    private JButton botao5;
    private JButton botao6;
    private JButton botao7;
    private JButton botao8;
    private JButton botao9;
    private JButton botaoSomar;
    private JButton botaoDividir;
    private JButton botaoMultiplicar;
    private JButton botaoSubtrair;
    private JButton botaoResultado;
    private JTextField textoEquacao;
    private String equacao;
    private int numA;
    private int numB;
    private int resultado;
    
    // adicionando CalcGui ao JFrame
    public CalcGui() {
        super ("JCalc");
        setLayout( new FlowLayout()); // configura o layout
        
        
        textoEquacao = new JTextField(15);
        add(textoEquacao);
        
        
        botaoSomar = new JButton("+");
        add(botaoSomar);
        
        botaoDividir = new JButton("/");
        add(botaoDividir);
        
        botaoMultiplicar = new JButton("x");
        add(botaoMultiplicar);
        
        botaoSubtrair = new JButton("-");
        add(botaoSubtrair);
        
        botao1 = new JButton("1");
        add(botao1);
        
        botao2 = new JButton("2");
        add(botao2);             
        
        botao3 = new JButton("3");
        add(botao3);
        
        botao4 = new JButton("4");
        add(botao4);
        
        botao5 = new JButton("5");
        add(botao5);
        
        botao6 = new JButton("6");
        add(botao6);
        
        botao7 = new JButton("7");
        add(botao7);
        
        botao8 = new JButton("8");
        add(botao8);
        
        botao9 = new JButton("9");
        add(botao9);
        
        botao0 = new JButton("0");
        add(botao0);
        
        botaoResultado = new JButton("=");
        add(botaoResultado);
        
        // handler de eventos registradores
         //ButtonHandler handler = new buttonHandler();
        botao1.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textoEquacao.setText("1");
                numA = 1;
                
            }
        });
        botao2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textoEquacao.setText("2");
                numB = 2;
            }
        });
        botao3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicou");
            }
        });
        botao4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicou");
            }
        });
        botao5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicou");
            }
        });
        botao6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicou");
            }
        });
        botao7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicou");
            }
        });
        botao8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicou");
            }
        });
        botao9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicou");
            }
        });
        botao0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicou");
            }
        });
        botaoResultado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicou");
            }
        });
        botaoMultiplicar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resultado = numA * numB;
                JOptionPane.showMessageDialog(null, resultado);
            }
        });
        botaoDividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicou");
            }
        });
        botaoSomar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicou");
            }
        });
        botaoSubtrair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicou");
            }
        });
        
    }
        
        
}