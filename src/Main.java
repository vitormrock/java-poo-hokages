public class Main {
    public static void main(String[] args) {

        Hashirama Hashirama = new Hashirama("Hashirama", "Madeira", true, 34 );
        System.out.println("Meu nome é: " +Hashirama.nome);
        System.out.println("Minha idade é: "+Hashirama.idade);
        Hashirama.estrategiaDeBatalhaNinja();
        Hashirama.habilidadeEspecial();


        System.out.println("==========================");

        Minato Minato = new Minato();
        Minato.nome =  "Minato";
        Minato.habilidade = " --> Raio";
        Minato.estrategiaDeBatalhaNinja();
        Minato.habilidadeEspecial();



    }
}
