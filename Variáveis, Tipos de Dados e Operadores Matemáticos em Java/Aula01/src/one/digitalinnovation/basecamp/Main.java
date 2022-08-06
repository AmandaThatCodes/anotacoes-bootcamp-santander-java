package one.digitalinnovation.basecamp;

/**
 * Classe de exemplo para o exercício da Aula 1 de Variáveis, Tipos de Dado e Operadores aritméticos.
 */
public class Main {

    public static void main(String[] args) {

        int i;
        //int i;
        int I;
        //int 1a; variáveis em Java não podem começar em número
        int _1a; //bom evitar começar com _
        int $aq; //bom evitar começar com $

        //A seguir, o valor inicial de cada uma das variáveis descritas acima
        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10; //variável final é uma variável constante
        //j = 15; //não posso mudar uma variável constante
        int asrn24678md;
        //int asrn246 78md; //não pode ter espaço
        int asrn2$4678_md = 10; //nome válido, porém não recomendado por causa do _
        //int asrn2$46%78_md = 10; //não pode usar %

        asrn24678md = 100;
        asrn2$4678_md = 10;

        int quantidadeProduto = 50;
        //int QuantidadeProduto; não pode começar com letra maiúscula
        final int NUMERO_TENTATIVAS = 5; //variáveis constantes/final tem que ser toda em maiúscula, separada com _ (não há CamelCase)
        //final int numeroTentativas = 5; //uma variável constante não pode ser nomeada como uma variável comum
        int QUANTIDADE_OPCOES = 25; //não é recomendada, não é uma boa prática, mas funciona
        //int qtdProd; //difícil de entender o que ela quer explicar

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);

    }
}