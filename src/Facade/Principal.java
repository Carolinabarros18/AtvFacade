
package Facade;

/**
 *
 * @author CAROL
 */

import PadrãoFacade.consulta;
import PadrãoFacade.medicamento;
import PadrãoFacade.medico;
import PadrãoFacade.paciente;
import PadrãoFacade.receitamedica;
import PadrãoFacade.serviçofarmacia;

public class Principal {
        public static void main(String[] args) {
  



        consulta consulta = new consulta();

        serviçofarmacia sf = new serviçofarmacia();

        medicamento rivotril = new medicamento();
        rivotril.setNome("dipírona");
        medicamento ibuprofeno = new medicamento();
        ibuprofeno.setNome("paracetamol");
        medicamento paracetamol = new medicamento();
        paracetamol.setNome("gardenal");

        sf.setListMedicamentos("dipírona");
        sf.setListMedicamentos("paracetamol");
        sf.setListMedicamentos("gardenal");

        Fachada clinica = new Fachada (consulta, sf);
        System.out.println("Cadastrar Paciente:");
        clinica.CadrastrarPaciente("Fabiana", "30028922");
        System.out.println("\nCadastrar Médico:");
        clinica.CadrastrarMedico("Maria Lopes", "1985");
        clinica.CadrastrarConsulta("10/09/2020", "19:00");

        receitamedica receita = new receitamedica();
        receita.setMedicamento(paracetamol);
        receita.setMedico(consulta.getMedico());
        receita.setPaciente(consulta.getPaciente());

        System.out.println("-----\n");
        clinica.MarcarConsulta(consulta.getMedico(), consulta.getPaciente(), consulta.getData(), consulta.getHorario());

        System.out.println("-----\n");
        clinica.obterReceita(consulta.getPaciente(), consulta.getMedico(), paracetamol);

        System.out.println("-----\n");
        clinica.ReceberMedicamento(receita);

    }
    }
    

