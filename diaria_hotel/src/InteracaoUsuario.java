import javax.swing.JOptionPane;

public class InteracaoUsuario {
    
    public String entradaDados(String msg){
        return JOptionPane.showInputDialog(null, msg);
    }

    public void mostraDados(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
}