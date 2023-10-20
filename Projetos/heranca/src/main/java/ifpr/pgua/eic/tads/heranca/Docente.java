package ifpr.pgua.eic.tads.heranca;

public class Docente extends Pessoa {

    private String siape;
    private double salario;
    
    public Docente(String nome, int idade, String email, String siape, double salario) {
        super(nome, idade, email);
        this.siape = siape;
        this.salario = salario;
    }
    
}
