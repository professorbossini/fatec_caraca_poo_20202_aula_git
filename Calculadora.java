import javax.swing.JOptionPane;
public class Calculadora{
    public static void main (String... args){
        int op = Integer.parseInt(JOptionPane.showInputDialog ("1-Soma 2-Subtracao"));
        int a = Integer.parseInt(JOptionPane.showInputDialog ( "Primeiro operando"));
        int b = Integer.parseInt (JOptionPane.showInputDialog ("Segundo operando" ));
        int res;
        if (op == 1){
            res = a + b;
        }
        else{
            res = a - b;
        }
        //exibindo o resultado...
        JOptionPane.showMessageDialog (null, "Resultado: " + res);
    }
} 
