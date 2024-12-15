package exercicios;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Ola mundo".charAt(4));

        String s = "Boa tarde";
        s = s.toUpperCase();
        System.out.println(s.concat("!!"));
        System.out.println(s + "!!");
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.length());
        System.out.println(s.toLowerCase().endsWith("tarde"));
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));


        var nome = "Caio";
        var sobrenome = "Santos";
        var idade = 22;
        var salario = 12345.85F;

        System.out.println("Nome: " + nome
                + "\nSobrenome: " + sobrenome
                + "\nIdade: " + idade
                + "\nSalario: " + salario);

        String maisUmaFrase = "Nome: " + nome
                + "\nSobrenome: " + sobrenome
                + "\nIdade: " + idade
                + "\nSalario: " + salario;

        System.out.println(maisUmaFrase);

        System.out.printf("Nome: %s\n", nome);
        System.out.printf("O Senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);

        String frase = String.format("\nO Senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);

        System.out.println(frase);


        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".indexOf("qual"));
        System.out.println("Frase qualquer".substring(6));
        System.out.println("Frase qualquer".substring(6, 8)); // Vai incluir o caractere 6, mas não o 8, ficando "qu" no resultado
    }
}
