package exercicios;

public class NotacaoPonto {
    public static void main(String[] args) {
        String s = "Bom dia X";

        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!");

        System.out.println(s);
        String x = "Leo".toUpperCase();
        System.out.println(x);

        String y = "Bom dia X".replace("X", "Caio").concat("!").toUpperCase();
        System.out.println(y);

        //TIPOS PRIMITIVOS NAO TEM O OPERADOR "."
        //int a = 3;
        //a.

    }
}
