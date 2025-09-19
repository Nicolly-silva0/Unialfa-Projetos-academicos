public class Personagem {
    public static void main(String[] args) {
        Co c = new Co();
        c.nome ="Corredor";
        c.vida = 100;
        c.mostrarStatus();
        c.atacar();

        Ba b = new Ba();
        b.nome = "Bandida";
        b.vida = 85;
        b.mostrarStatus();
        b.atacar();

        Valk v = new Valk();
        v.nome = "Valquíria";
        v.vida = 130;
        v.mostrarStatus();
        v.atacar();

        Magof m = new Magof();
        m.nome = "Mago de fogo";
        m.vida = 75;
        m.mostrarStatus();
        m.atacar();

        Pek p = new Pek();
        p.nome = "Pekka";
        p.vida = 200;
        p.mostrarStatus();
        p.atacar();

        DMD d = new DMD();
        d.nome = "Domadora de Carneiro";
        d.vida = 100;
        d.mostrarStatus();
        d.atacar();

        BBD bb = new BBD();
        bb.nome = "Bebê Dragão";
        bb.vida = 75;
        bb.mostrarStatus();
        bb.atacar();

        Goblin g = new Goblin();
        g.nome = "Goblin com Dardo";
        g.vida = 50;
        g.mostrarStatus();
        g.atacar();

        }
    }

    class PersonagemDoJogo{
    protected String nome;
    protected double vida;
    protected String tipo;

    public void atacar(){
        System.out.println(nome+" realizou um ataque básico");
    }

    public void mostrarStatus(){
        System.out.printf("Nome: %s | Tipo: %s | Vida: %.2f\n",nome,tipo,vida);
    }
}

class Co extends PersonagemDoJogo{
    public Co(){
        this.tipo ="Atacante";
    }
    @Override
    public void atacar(){
        System.out.println(nome+" atacou com uma marretada bruta!");
    }
}

class Ba extends PersonagemDoJogo{
    public Ba(){
        this.tipo ="Veloz";
    }
    @Override
    public void atacar(){
        System.out.println(nome+" roubou seus inimigos numa rapidez que eles nem perceberam!");
    }
}

class Valk extends PersonagemDoJogo{
    public Valk(){
        this.tipo ="Guerreiro";
    }
    @Override
    public void atacar(){
        System.out.println(nome+" só precisou de alguns giros para acabar com o inimigo!");
    }
}

class Magof extends PersonagemDoJogo{
    public Magof(){
        this.tipo ="Mago";
    }
    @Override
    public void atacar(){
        System.out.println(nome+" deixou todos boquiabertos destruindo tudo com suas bolas de fogo!");
    }
}

class Pek extends PersonagemDoJogo{
    public Pek(){
        this.tipo = "Tanque";
    }
    @Override
    public void atacar(){
        System.out.println(nome+" pode ser um pouco desequilibrada, mas tem um soco de impacto.");
    }
}

class DMD extends PersonagemDoJogo{
    public DMD(){
        this.tipo = "Atacante";
    }
    @Override
    public void atacar(){
        System.out.println(nome+" juntos, eles atravessam a arena, laçam inimigos, derrubam torres e... comem grama?");
    }
}

class BBD extends PersonagemDoJogo{
    public BBD(){
        this.tipo = "Defensor";
    }
    @Override
    public void atacar(){
        System.out.println(nome+" arrota bolas de fogo que causam dano em área.");
    }
}

class Goblin extends PersonagemDoJogo{
    public Goblin(){
        this.tipo = "Atirador";
    }
    @Override
    public void atacar(){
        System.out.println(nome+" corre muito, atira longe e ainda masca chiclete! Como consegue lançar dardos com a boca cheia de chiclete? Anos de prática!");
    }
}