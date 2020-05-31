package atv_jamires;

import java.util.Scanner;

/**
 *
 * @author fabio
 */
public class Funcional {

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);

        int opcao;

        System.out.println("Em qual aparelho deseja acessar a nossa aplicação \n 1- Computador\n 2- Celular\n 3- SmartTV");
        opcao = n.nextInt();

        F_Dispositivos d = new Computador();

        if (opcao == 1) {
            d.carregarFilme();
            d.pesquisarFilme();
            d.assistirFilme();
        }
        if (opcao == 2) {
            d = new Celular();
            d.carregarFilme();
            d.pesquisarFilme();
            d.assistirFilme();

        }
        if (opcao == 3) {
            d = new AdapterSmartTV();
            d.carregarFilme();
            d.pesquisarFilme();
            d.assistirFilme();
        }
        

    }

}
