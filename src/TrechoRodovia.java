public class TrechoRodovia {
    

    private String nomeRodovia;
  
  
  private double quilometroInicial;
  
  private double quilometroFinal;
  
  private double nivelVegetacao;
 

    public TrechoRodovia(String nomeRodovia, double quilometroInicial, double quilometroFinal) {
      
        this.nomeRodovia = nomeRodovia;
      
        this.quilometroInicial = quilometroInicial;
      
        this.quilometroFinal = quilometroFinal;
      
        this.nivelVegetacao = 0.0; 
    }
 

    public double getNivelVegetacao() {
      
        return this.nivelVegetacao;
    }
 

    public void setNivelVegetacao(double nivelVegetacao) {
      
        if (nivelVegetacao < 0) {

            throw new IllegalArgumentException("Erro: O nível da vegetação não pode ser negativo.");
          
        }
        this.nivelVegetacao = nivelVegetacao;
    }
 
   
    public void registrarCrescimento(double taxa) {
      
        if (taxa > 0) {
          
            this.nivelVegetacao += taxa;
        }
    }
 

    @Override
  
    public String toString() {
      
        return nomeRodovia + " (KM " + quilometroInicial + " ao " + quilometroFinal + ") - Vegetação: " + nivelVegetacao + "cm";
    }
}
