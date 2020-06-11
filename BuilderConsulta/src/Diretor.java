
/**
 *
 * @author fabio
 */
public class Diretor {

    private ConcretConsultaBuilder c;

    public Diretor(ConcretConsultaBuilder c) {
        this.c = c;
    }

    public void CadastrarConsulta(String MdcNome, String Especialidade, String PctNome, String dataDeNascimento, String Data, String Hora) {
        c.CadastrarMedico(MdcNome, Especialidade);
        c.CadastrarPaciente(PctNome, dataDeNascimento);
        c.AgendarConsulta(Data, Hora);
    }
    public Consulta finalizarConsulta(){
        return this.finalizarConsulta();
    }
}
