/**
 *
 * @author fabio
 */
public interface ConsultaBuilder {
    public void CadastrarMedico(String Nome, String Especialidade);
    public void CadastrarPaciente(String Nome, String dataDeNascimento);
    public void AgendarConsulta(String Data, String Hora);
    Consulta finalizarConsulta();
}
