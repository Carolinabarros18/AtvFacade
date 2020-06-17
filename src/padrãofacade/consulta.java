
/**
 *
 * @author CAROL
 */package PadrãoFacade;
 
public class consulta {
    
    private String data;
    private String horario;
    private medico medico;
    private paciente paciente;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public medico getMedico() {
        return medico;
    }

    public void setMedico(medico medico) {
        this.medico = medico;
    }

    public paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(paciente paciente) {
        this.paciente = paciente;
    }

    public void agendarConsulta(medico medico, paciente paciente, String data, String horario) {
        
        System.out.println("- Consulta Marcada - \n");
        System.out.println("Médico:" + this.getMedico().getNome());
        System.out.println("Paciente:" + this.getPaciente().getNome());
        System.out.println("Data:" + this.getData());
        System.out.println("Hoarario:" + this.getHorario());

    }

    public receitamedica gerarReceita(paciente paciente, medico medico, medicamento medicamento) {
        receitamedica receita = new receitamedica();
        receita.setMedico(medico);
        receita.setPaciente(paciente);
        receita.setMedicamento(medicamento);
        
        System.out.println("---- Receita Médica ---- \n");
        System.out.println("Médico:" + this.getMedico().getNome());
        System.out.println("Paciente:" + this.getPaciente().getNome());
        System.out.println("Medicamento:" + receita.getMedicamento().getNome());

        return receita;
    }   
    }
