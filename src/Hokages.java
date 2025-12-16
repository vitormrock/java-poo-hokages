public abstract class Hokages implements EstrategiaDeBatalha {
    String  nome;
    int idade;
    boolean vivoOuMorto;
    String habilidade;

    public Hokages () {

    }

    public Hokages(String nome, String habilidade, boolean vivoOuMorto, int idade) {
        this.nome = nome;
        this.habilidade = habilidade;
        this.vivoOuMorto = vivoOuMorto;
        this.idade = idade;
    }


    // METODO GEREL TODOS OS NINJAS VÃO TER
    public void habilidadeEspecial(){
        System.out.println("Meu nome é: " +nome+ " e esse é meu ataque especial " +habilidade);
    }

    // SOBRE ESCREVENDO ESSE METODO DA INTERFACE
    @Override
    public void estrategiaDeBatalhaNinja(){
        System.out.println("Meu nome é " +nome+ " Essa é minha estrategia de batalha ");
}


}
