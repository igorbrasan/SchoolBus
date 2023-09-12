
/**
 * Escreva uma descrição da classe Escola aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Escola
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private boolean escolaPublica;
    private String cnpj, nome, telefone, endereco;
    private String tipo;
    /**
     * Construtor para objetos da classe Escola
     */
    public Escola()
    {
        
    }
    private void setTipo()
    {
        if(escolaPublica)
        {
            this.tipo = tipo;
        } else
        {
            this.tipo = "Privada";
        }
    }
}
