import javax.swing.JOptionPane;

import org.omg.CORBA.OBJECT_NOT_EXIST;

public class ExemploJOptionPaneshowOptionDialog{
    
    public static void main(String[] args) {
        int opcao = JOptionPane.showOptionDialog(
            null, 
            "Selecione o menu desejado!",
            "MENU DO SISTEMA", 
            0, 
            JOptionPane.INFORMATION_MESSAGE, 
            null, 
            new Object[]{
                "Cadastro", "Edição", "Lista"
            }, 
            "Edição"
        );
        if(opcao == 1){
            JOptionPane.showMessageDialog(null, 
                "Edição selecionada");
        }else if(opcao == 0){
            JOptionPane.showMessageDialog(null, 
                "Cadastro selecionado");
        }else if(opcao == 2){
            JOptionPane.showMessageDialog(null, 
                "Lista selecionada");
        }
    

    }

}