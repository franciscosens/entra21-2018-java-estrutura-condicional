import javax.swing.JOptionPane;
public class Ex{
    public static void main(String[] args) {
        JOptionPane.showInputDialog(null,
        "Selecione um estado","SISTEMA",
        JOptionPane.QUESTION_MESSAGE,
        null, 
        new Object[]{
            "Blumenau", "Indaial"
        }, "");
    }
}