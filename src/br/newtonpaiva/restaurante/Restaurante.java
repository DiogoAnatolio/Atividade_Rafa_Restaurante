package br.newtonpaiva.restaurante;
import javax.swing.*;

public class Restaurante {
    public static void main(String[] args) {

        int opcao;

        String nome;

        Double valor;


        Pizza pizza1 = new Pizza("Portuguesa", 35.0, 1);

        Hamburguer hamburguer1 = new Hamburguer("Quarteirao", 20.0, 2);

        pizza1.calculaBorda(1, 35.0);
        System.out.println("O valor da pizza " + pizza1.nome + " é " + pizza1.getValor() );


        opcao = Integer.parseInt(JOptionPane.showInputDialog( "Informe o pedido: \n 1.Pizza \n 2.Hamburguer \n 3.Sair" ));

        switch (opcao){
            case 1:

                nome = JOptionPane.showInputDialog("Informe o nome");
                valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor"));
                Integer borda = Integer.parseInt(JOptionPane.showInputDialog("Possui borda, digite 1 para sim ou 2 para não: "));
                pizza1.setValor(pizza1.calculaBorda(borda,valor));
                JOptionPane.showMessageDialog(null, "O valor total ficou: " + pizza1.getValor(),"resultado", JOptionPane.INFORMATION_MESSAGE);
            break;
            case 2:

                nome = JOptionPane.showInputDialog("Escreva o nome do Hamburguer: ");
                valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor"));
                Integer artesanal = Integer.parseInt(JOptionPane.showInputDialog("Será artesanal digite 1 sim ou 2 para não"));
                hamburguer1.setValor(hamburguer1.calculaValor(artesanal,valor));
                JOptionPane.showMessageDialog(null, "O valor total ficou: " + hamburguer1.getValor(), "resultado", JOptionPane.INFORMATION_MESSAGE);

            break;
            default:
                JOptionPane.showMessageDialog(null, "Escolha uma opção valida", "", JOptionPane.ERROR_MESSAGE);
        }
    }
}
