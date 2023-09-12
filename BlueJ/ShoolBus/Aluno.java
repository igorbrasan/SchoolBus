
/**
 * Escreva uma descrição da classe Aluno aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Aluno extends Pessoa
{
    private Escola escola;
    private Rota rota;
    private String matricula, serie;
    private int x;

    /**
     * Construtor para objetos da classe Aluno
     */
    public Aluno()
    {
        // inicializa variáveis de instância
        x = 0;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public int sampleMethod(int y)
    {
        // escreva seu código aqui
        return x + y;
    }
}
