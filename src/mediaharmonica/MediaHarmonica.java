package mediaharmonica;

import javax.swing.JOptionPane;

public class MediaHarmonica {
    public static void main(String[] args) {
        double a,b,c, mh;
        //informações
        a = Double.parseDouble(JOptionPane.showInputDialog("Informar valor:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Informar valor:"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Informar valor:"));
        //processamento
        mh = 3/(1/a + 1/b + 1/c);
        //saída
        JOptionPane.showMessageDialog(null,"O valor da média harmonica é: "+mh);
    }
    
}
