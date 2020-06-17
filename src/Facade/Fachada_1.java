/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import PadrãoFacade.consulta;
import PadrãoFacade.medicamento;
import PadrãoFacade.medico;
import PadrãoFacade.paciente;
import PadrãoFacade.receitamedica;
import PadrãoFacade.serviçofarmacia;

/**
 *
 * @author CAROL
 */
class Fachada {
    private consulta c;
    private receitamedica rc;
    private serviçofarmacia sf;
    private receitamedica receita;

    public Fachada(consulta c, serviçofarmacia sf) {
        super();
        this.c = new consulta();
        this.sf = new serviçofarmacia();
    }

    public void CadrastrarPaciente(String nome, String telefone) {
        paciente y = new paciente();
        y.setNome(nome);
        y.setTelefone(telefone);
        System.out.println("Paciente Cadastrado");
        this.c.setPaciente(y);

    }

    public void CadrastrarMedico(String nome, String resgistromedico) {
        medico l = new medico();
        l.setNome(nome);
        l.setRegistroMedico(resgistromedico);
        System.out.println("Medico Cadastrado");
        this.c.setMedico(l);

    }

    public void CadrastrarConsulta(String data, String horario) {
        this.c.setData(data);
        this.c.setHorario(horario);

    }

    public void marcarconsulta(medico medico, paciente paciente, String data, String horario) {

        c.agendarConsulta(medico, paciente, data, horario);

    }

    public receitamedica obterReceita(paciente paciente, medico medico, medicamento medicamento) {
        c.gerarReceita(paciente, medico, medicamento);
        System.out.println("\nReceita gerada");

        return receita;

    }

    public void ReceberMedicamento(receitamedica receita) {

        sf.receberMedicamento(receita);
    }

    void MarcarConsulta(medico medico, paciente paciente, String data, String horario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
