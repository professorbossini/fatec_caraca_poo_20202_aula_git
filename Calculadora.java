import javax.swing.JOptionPane;
public class Calculadora{
    public static void main (String... args){
        //vou começar com a soma...
        int a = Integer.parseInt(JOptionPane.showInputDialog ( "Primeiro operando"));
        int b = Integer.parseInt (JOptionPane.showInputDialog ("Segundo operando" ));
        int res = a + b;
        JOptionPane.showMessageDialog (null, res);
    }
} 
