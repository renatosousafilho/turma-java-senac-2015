package primeiraaula;

public class PrimeiraAula {

    public static void main(String[] args) {
        System.out.println("Ola mundo");
        System.out.println("Bom dia!");
        
        String nome = null;
        try {
          System.out.println(nome.length());
        } catch (Exception e) {
            System.out.println("Voce nao pode acessar um objeto nulo");
        }
    }
    
}
