

/**
 *
 * @author CAROL
 */
package PadrãoFacade;

 
import java.util.ArrayList;


public class serviçofarmacia {
   

    private ArrayList<medicamento> ListMedicamentos = new ArrayList<>();
    

    public ArrayList<medicamento> getListMedicamentos() {
        return ListMedicamentos;
    }

    public void setListMedicamentos(medicamento medicamento) {
        this.ListMedicamentos.add(medicamento);
        
    }

    public void receberMedicamento(receitamedica receita) {
        
      
        for (int i = 0; i < ListMedicamentos.size(); i++) {
            
            if (ListMedicamentos.contains(receita.getMedicamento())) {
                
                System.out.println("\nMedicação entregue.");

            } else {
               
                System.out.println("\nMedicação não disponível.");

            }
            }
            }

    public void setListMedicamentos(String dipírona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            }
    

