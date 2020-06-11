
/**
 *
 * @author fabio
 */
public class Consulta {

    private String Data;
    private String Hora;
    private Medico Medico;
    private Paciente Paciente;

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public Medico getMedico() {
        return Medico;
    }

    public void setMedico(Medico Medico) {
        this.Medico = Medico;
    }

    public Paciente getPaciente() {
        return Paciente;
    }

    public void setPaciente(Paciente Paciente) {
        this.Paciente = Paciente;
    }
    
       
    public void EmitirAgendamento() {
        System.out.println("******Agendamento de consulta********");
        System.out.println("Paciente:" + this.getPaciente().getNome() + "  " + "Endereço:" + this.getPaciente().getEndereco() );
        System.out.println("Medico:" + this.getMedico().getNome() + "  " + "Especialidade:" + this.getMedico().getEspecialidade());
        System.out.println("Horario:" + this.getHora());
        System.out.println("Data:" + this.getData());
    }
}
