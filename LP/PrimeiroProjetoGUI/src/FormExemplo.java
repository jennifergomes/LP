import javax.swing.*;
import java.awt.*;

public class FormExemplo extends JFrame {

    //Atributos

    private JPanel painel = new JPanel();
    private JButton jButtonLimpar = new JButton("Limpar");
    private JTextField jTextField = new JTextField("Teste" , 20);
    private JLabel jLabelMensagem = new JLabel("Exemplo simples de janela");


    //Constructor

    public FormExemplo(){

        this.setTitle("Testo da barra do título");
        this.setSize(300,200);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 20 ));
        painel.setBackground(new Color(255,255,255));
        painel.add(jTextField);
        painel.add(jButtonLimpar);
        painel.add(jLabelMensagem);
        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null); //Centraliza a janela independente do tamanho do monitor
        this.setVisible(true); //Exibir janela
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); /*Para de rodar a aplicação assim que o usuário clica no X da tela.
        Sem essa opção, mesmo clicando no X, a aplicação continua rodando na IDE.*/

    }

    public static void main(String[] args) {
        new FormExemplo();
    }
}