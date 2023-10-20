package ifpr.pgua.eic.tads.heranca;

public class Discente extends Pessoa{
    
    private String nSigaa;
    private String curso;
    private int anoEntrada;

    public Discente(String nome, int idade, String email, String curso, int anoEntrada) {
        super(nome, idade, email);
        this.curso = curso;
        this.anoEntrada = anoEntrada;
    }
    
}
