package atv_jamires;

/**
 *
 * @author fabio
 */
public class Computador implements F_Dispositivos {

    @Override
    public void carregarFilme() {
        System.out.println("Carregando filmes da tela incial, aguarde o carregamento ------------\n");
      
    }

    @Override
    public void pesquisarFilme() {
        System.out.println("Pesquisando filme, aguarde a filtragem -----------\n");
    }

    @Override
    public void assistirFilme() {
        System.out.println("Assistindo filme, estabilizando resolução ------------\n");
    }
    
}
