package ifpr.pgua.eic.tads.heranca;

public class App 
{
    public static void main( String[] args ){

        Docente docente = new Docente("Zé",35,"ze@teste.com","1234",1000);
        
        docente.metodo1();
        
        Discente discente = new Discente("Chico",18,"chico@teste.com");
     
        discente.metodo1();

    }

    

    
}
