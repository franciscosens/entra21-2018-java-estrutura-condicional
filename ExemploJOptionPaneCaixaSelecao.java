import javax.swing.JOptionPane;

public class ExemploJOptionPaneCaixaSelecao{
    public static void main(String[] args) {
        String opcaoSelecionada = JOptionPane
        .showInputDialog(null, 
            "Selecione um estado",
            "SISTEMA - DA Vovó",
            JOptionPane.QUESTION_MESSAGE,
            null,
            new Object[]{
                "","PR", "RS", "SC"
            },
            ""
        ).toString();   
        System.out.println(opcaoSelecionada);  
        if(opcaoSelecionada.equals("SC")){
            System.out.println("Santa Catarina");
        }else if(opcaoSelecionada.equals("PR"))   {
            System.out.println("Paraná");
        }else if(opcaoSelecionada.equals("RS")){
            System.out.println("Rio Grande do Sul");
        }
    }
}