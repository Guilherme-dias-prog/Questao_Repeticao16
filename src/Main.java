import javax.swing.*;


public class Main {
    public static void main(String[] args) {
       
        int numsecret = Integer.parseInt(JOptionPane.showInputDialog("Usuário 1, digite o número secreto:"));

        int tent = 0; 
        int palp; 
        boolean acertou = false; 

       
        while (!acertou) {
            palp = Integer.parseInt(
                    JOptionPane.showInputDialog("Usuário 2, digite seu palp:")
            );
            tent++; 

            if (palp == numsecret) {
                acertou = true; 
                JOptionPane.showMessageDialog(null,
                        "Parabéns! Você acertou o número em " + tent + " tent.");
            } else if (palp < numsecret) {
                JOptionPane.showMessageDialog(null,
                        "Seu número é menor do que o meu.");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Seu número é maior do que o meu.");
            }
        }
    }
}