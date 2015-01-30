/*
 * Este algoritmo serve para ilustrar a pesquisa de um registro em uma array
 */
package quintaaula;

import javax.swing.JOptionPane;

/**
 *
 * @author renato
 */
public class PesquisaArray {
    public static void main(String[] args) {
        String[] linguagensDeProgramacao = {"Java", "PHP", "Ruby", "Python", "C"};
        
        String linguagemParaPesquisar = JOptionPane.showInputDialog("Entre com o nome de uma linguagem");
        
        // Mensagem padrão que só vai ser alterada se 
        // encontrar um valor igual a variavel linguagemParaSerPesquisada
        
        String mensagem = "Linguagem não encontrada"; 

        for (int i = 0; i < linguagensDeProgramacao.length; i++) {
            // se a linguagem for encontrada vai mudar o valor da variavel mensagem
            // e sair do laço devido ao comando break.
            if (linguagensDeProgramacao[i].equals(linguagemParaPesquisar)){
                mensagem = "Linguagem encontrada no índice"+i;
                break;
            }
        }
        
        //Exibirá o valor da variável mensagem
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
