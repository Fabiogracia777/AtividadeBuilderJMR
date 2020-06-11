
/**
 *
 * @author fabio
 */
public class ConcretConsultaBuilder implements ConsultaBuilder {

    private Consulta consulta;

    public ConcretConsultaBuilder() {

        this.consulta = new Consulta();

    }

    @Override
    public void CadastrarMedico(String Nome, String Especialidade) {
        Medico m1 = new Medico();
        m1.setEspecialidade(Especialidade);
        m1.setNome(Nome);
        this.consulta.setMedico(m1);
    }

    @Override
    public void CadastrarPaciente(String Nome, String Endereco) {
        Paciente p1 = new Paciente();
        p1.setNome(Nome);
        p1.setEndereco(Endereco);
        this.consulta.setPaciente(p1);
    }

    @Override
    public void AgendarConsulta(String Data, String Hora) {
        Consulta c1 = new Consulta();
        c1.setData(Data);
        c1.setHora(Hora);
        this.consulta.setData(Data);
        this.consulta.setHora(Hora);
    }

    @Override
    public Consulta finalizarConsulta() {

        return this.consulta;
    }

}
