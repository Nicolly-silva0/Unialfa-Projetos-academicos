

public class HerancaJava {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.emitirSom();

        Cachorro c = new Cachorro();
        c.nome = "Rex";
        c.peso = 12;
        c.raca = "Vira-lata";

        c.emitirSom();
        System.out.printf("Nome do cachorro: %s\n",c.nome);
        System.out.printf("O peso em kg: %.2f\n",c.peso);
        System.out.printf("A raça: %s\n",c.raca);

        Gato g = new Gato();
        g.nome = "Mimi";
        g.peso = 7;
        g.raca = "Siamês";

        g.emitirSom();
        System.out.printf("Nome do gato: %s\n",g.nome);
        System.out.printf("O peso em kg: %.2f\n",g.peso);
        System.out.printf("A raça: %s\n",g.raca);

        Cavalo Ca = new Cavalo();
        Ca.nome = "Jack";
        Ca.peso = 475;
        Ca.raca = "Mangalarga Machador";

        Ca.emitirSom();
        System.out.printf("O nome do cavalo: %s\n",Ca.nome);
        System.out.printf("O peso em kg: %.2f\n",Ca.peso);
        System.out.printf("A raça: %s\n",Ca.raca);

        Camelo cm = new Camelo();
        cm.nome = "Bolinha";
        cm.peso = 520;
        cm.raca = "Dromedário";

        cm.emitirSom();
        System.out.printf("Nome do camelo: %s\n",cm.nome);
        System.out.printf("O peso em kg: %.2f\n",cm.peso);
        System.out.printf("A raça: %s\n",cm.raca);

        Tubarao T = new Tubarao();
        T.nome = "Hard";
        T.peso = 1232;
        T.raca = "Tubarão branco";

        T.emitirSom();
        System.out.printf("Nome do tubarão: %s\n",T.nome);
        System.out.printf("O peso em kg: %.2f\n ",T.peso);
        System.out.printf("A raça: %s\n",T.raca);
    }
}
          
class Animal{
   String nome;
   double peso;
   String raca;

   public void emitirSom(){
    System.out.println("O animal faz um som genérico.");
   }
}

class Cachorro extends Animal{
    @Override
    public void emitirSom(){
        System.out.println("O cachorro late: Au Au!");
    }
}

class Gato extends Animal{
    @Override
    public void emitirSom(){
        System.out.println("O gato mia: Miau!");
    }
}

class Cavalo extends Animal{
    @Override
    public void emitirSom(){
        System.out.println("O cavalo relincha!");
    }
}

class Camelo extends Animal{
    @Override
    public void emitirSom(){
        System.out.println("O camelo faz um som grave!");
    }
}

class Tubarao extends Animal{
    @Override
    public void emitirSom(){
        System.out.println("O tubarão não emite sons audíveis, mas nada silenciosamente.");
    }
}