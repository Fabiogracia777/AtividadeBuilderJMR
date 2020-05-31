package atv_jamires;

/**
 *
 * @author fabio
 */
public class AdapterSmartTV extends SmartTV implements F_Dispositivos {

    @Override
    public void carregarFilme() {
        this.verificarRede();
        this.inicializarAplicações();
        System.out.println("Carregando filmes da tela incial, aguarde o carregamento ------------\n");
    }

    @Override
    public void pesquisarFilme() {
        this.verificarRede();
        System.out.println("Pesquisando filme, aguarde a filtragem -----------\n");
    }

    @Override
    public void assistirFilme() {
        this.verificarRede();
        System.out.println("Assistindo filme, estabilizando resolução ------------\n");
    }
    
}
