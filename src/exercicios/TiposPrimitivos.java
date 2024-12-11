package exercicios;

public class TiposPrimitivos {
    public static void main(String[] args) {
    // INFO DO FUNCIONARIO


    //TIPOS NUMERICOS INTEIROS

        byte anosDeEmpresa = 23;
        short numeroDeVoos = 3279;
        int id = 12343554;
        long pontosAcumulados = 3_321_856_543L;

    // TIPOS NUMERICOS REAIS
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_979_103.01;

    // TIPO BOOLEANO
        boolean estaDeFerias = false;

    // TIPO CARACTERE
        char status = 'A';

    // DIAS DE EMPRESA
        System.out.println(anosDeEmpresa * 365);
    // NUMERO DE VIAGENS
        System.out.println(numeroDeVoos/2);

    // PONTOS POR REAL
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha => " + salario);
        System.out.println("Férias?" + estaDeFerias);

        System.out.println("Status: "+ status);
    }
}
