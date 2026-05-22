import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
 
public class TrechoRodoviaTest {
 
  
    @Test
  
    public void testInstanciacaoNaoNula() {
      
        TrechoRodovia trecho = new TrechoRodovia("Teste-Rodovia", 0.0, 10.0);
      
        assertNotNull(trecho, "O objeto criado não deveria ser nulo.");
    }
 
  
    @Test
  
    public void testRegistrarCrescimento() {
        TrechoRodovia trecho = new TrechoRodovia("Teste-Rodovia", 0.0, 10.0);
      
        trecho.setNivelVegetacao(10.0); 
      
        trecho.registrarCrescimento(5.0);
        
        assertEquals(15.0, trecho.getNivelVegetacao(), "O nível final da vegetação deve ser 15.0cm");
    }
 

    @Test
  
    public void testValidacaoEncapsulamentoNegativo() {
      
        TrechoRodovia trecho = new TrechoRodovia("Teste-Rodovia", 0.0, 10.0);
      
        
    
        Exception excecao = assertThrows(IllegalArgumentException.class, () -> {
          
            trecho.setNivelVegetacao(-5.0);
        });
        

        assertEquals("Erro: O nível da vegetação não pode ser negativo.", excecao.getMessage());
    }
}
