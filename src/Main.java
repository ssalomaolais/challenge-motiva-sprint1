public class Main {
    public static void main(String[] args) {
        System.out.println("--- Sistema de Monitoramento Motiva/CCR ---\n");
 
        TrechoRodovia trechoAlfa = new TrechoRodovia("BR-116", 10.0, 15.0);
      
        TrechoRodovia trechoBeta = new TrechoRodovia("Rodoanel", 32.0, 40.0);
 
  
        System.out.println("Registrando crescimento da vegetação...");
      
        trechoAlfa.registrarCrescimento(15.5);
      
        trechoBeta.registrarCrescimento(5.0); 
 

        System.out.println("Status Atual:");
      
        System.out.println(" - " + trechoAlfa.toString());
      
        System.out.println(" - " + trechoBeta.toString());
        System.out.println();
 
  
        EquipeManutencao equipeAlpha = new EquipeManutencao("Equipe Alpha - Roçada Rápida");
 

        if (trechoAlfa.getNivelVegetacao() > trechoBeta.getNivelVegetacao()) {
          
            System.out.println("ALERTA: Trecho Alfa está crítico!");
          
            equipeAlpha.alocarTrecho(trechoAlfa);
        } else {
            System.out.println("ALERTA: Trecho Beta está crítico!");
          
            equipeAlpha.alocarTrecho(trechoBeta);
        }
    }
}
