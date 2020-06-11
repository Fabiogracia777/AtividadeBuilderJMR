
/**
 *
 * @author fabio
 */
public class Agenda {

    public static void main(String[] args) {
        ConcretConsultaBuilder ConsultaBuilder = new ConcretConsultaBuilder();
        Diretor dir = new Diretor (ConsultaBuilder);
        dir.CadastrarConsulta("Jõao Victor", "Cirurgia", "Luiz Gonçalves"
                ,"Rua Zeferino 316 Juazeiro do norte"," 16/06/2020", "14:00");
        Consulta Consulta = ConsultaBuilder.finalizarConsulta();
        Consulta.EmitirAgendamento();
    }
}
