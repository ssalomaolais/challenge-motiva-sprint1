public class EquipeManutencao {
  
    private String nomeEquipe;
  
    private TrechoRodovia trechoAlocado;
 
    public EquipeManutencao(String nomeEquipe) {
      
        this.nomeEquipe = nomeEquipe;
    }
 
    public void alocarTrecho(TrechoRodovia trecho) {
      
        this.trechoAlocado = trecho;
      
        System.out.println("Equipe '" + this.nomeEquipe + "' alocada para manutenção no trecho: " + trecho.toString());
    }
}
