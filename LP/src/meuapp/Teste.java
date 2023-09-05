package meuapp;
import java.io.IOException;
public class Teste {
    public static void main(String[] args) throws IOException {
        System.out.println("Olá Mundo!");

        char ch;
        ch = 'X';

        System.out.println("ch contains: " +ch);
        ch++; //incrementa ch
        System.out.println("ch is now: " +ch);
        ch = 90; //dá para ch um novo valor
        System.out.println("ch is now: " +ch);

        byte tipoByte = 127;
        short tipoShort = 32767;
        char tipoChar = 'C';
        float tipoFloat = 2.6f;
        double tipoDouble = 3.59;
        int tipoInt = 2147483647;
        long tipoLong = 9223372036854775807L;
        boolean tipoBoolean = true;

        System.out.println("Valor do tipoByte = " +tipoByte);
        System.out.println("Valor do tipoShort = " +tipoShort);
        System.out.println("Valor do tipoChar = " +tipoChar);
        System.out.println("Valor do tipoFloat = " +tipoFloat);
        System.out.println("Valor do tipoDouble = " +tipoDouble);
        System.out.println("Valor do tipoInt = " +tipoInt);
        System.out.println("Valor do tipoLong = " +tipoLong);
        System.out.println("Valor do tipoBoolean = " +tipoBoolean);

        //Demonstra valores booleanos:

        boolean b;
        b = false;
        System.out.println("b is: " +b);

        b = true;
        System.out.println("b is: " +b);

        //Um valor booleano pode controlar a instrução if.

        if(b) System.out.println("This is executed.");
        b = false;

        if(b) System.out.println("This is executed.");
        //O resultado de um operador relacional é um valor booleano.

        System.out.println("10 > 9 is " + (10 > 9));

        int count = 10; //da a count um valor inicial igual a 10
        char chr  = 'X'; //inicializa chr com a letra X
        float f = 1.2f; //f é inicializada com o valor 1.2

        int x = 8, y = 8, z = 19, w = 0; //y e z tem inicializações

        System.out.println(x + y + z + w);


        //Demonstra a inicialização dinâmica
        double radius = 4, height = 5;

        //Inicializa volume dinamicamente
        double volume   = 3.1416 * radius * radius * height;
        System.out.println("\nVolume is " +volume);

        //Demonstra o escopo de bloco
        int m; //conhecida pelo código dentro do main
        m = 10;

        if(m == 10) { //inicia novo escopo
            int n = 20; //conhecida apenas nesse bloco
            //tanto m quanto n são conhecidas aqui.
            System.out.println("m and n: " +m+ "" +n);

            m = n * 2;
        }

        //n = 100; //Erro! n não é conhecida aqui
        //m ainda é conhecida aqui
        System.out.println("m is " +m);

        //Demonstra o tempo de vida de uma variável

        for(int i = 0; i < 3; i++ ){
            int j = -1; //
            System.out.println("j is: " +j); //essa linha sempre exibe -1
            j = 100;
            System.out.println("j is now: " +j);
        }


        //Demonstra o operador %
        int iresult, irem;
        double dresult, drem;
        iresult = 10/3;
        irem = 10 % 3;
        dresult = 10.0 / 3.0;
        drem = 10.0 % 3.0;
        System.out.println("\nResult and remainder of 10 / 3: " +iresult + "" +irem);
        System.out.println("Result and remainder of 10.0 / 3.0: " +dresult + "" +drem);


        //Demonstra os operadores lógicos e relacionais
        int i, j; boolean b1, b2;
        i = 10;
        j = 11;

        if(i < j) System.out.println("\ni < j");
        if(i <= j) System.out.println("\ni <= j");
        if(i != j) System.out.println("\ni != j");
        if(i == j) System.out.println("this won't execute");
        if(i >= j) System.out.println("this won't execute");
        if(i > j) System.out.println("this won't execute");

        b1 = true;
        b2 = false;
        if(b1 & b2)
            System.out.println("this won't execute");
        if(!(b1 & b2)) System.out.println("!(b1 & b2) is true");
        if(b1 | b2) System.out.println("b1 | b2 is true");
        if(b1 ^ b2) System.out.println("b1 ^ b2 is true");

        //Demonstra os operadores de curto-circuito
        int n, d, q;
        n = 10; d = 2;
        if(d != 0 && (n % d) == 0) {
            System.out.println(d + " " + "is a factor of " + n);
        }

        d = 0; //configura d com zero
        //Já que d é igual a zero, o segundo operando não é avaliado.
        if(d != 0 && (n % d) == 0) {
            System.out.println(d + " " + "is a factor of " + n);
        }
        System.out.println("Passou\n");
        //Tente a mesma coisa sem. Isso causará um erro de divisão por zero

        /*if(d != 0 & (n % d) == 0) {
            System.out.println(d + "is a factor of " + n);
        } */


        //Pré-incremento (++x):

        x = 5;
        int resultado = ++x; //Pré-incremento: incrementa x antes  de usá-lo em qualquer operação
        System.out.println("\nx: " +x); //Output: x: 6
        System.out.println("resultado: " +resultado); //Output: resultado: 6

        //Pós-incremento (x++):

        x = 5;
        resultado = x++; //Pós-incremento: usa o valor atual de x e depois o incrementa
        System.out.println("\nx: " +x); //Output: x: 6 (incrementado após a atribuição)
        System.out.println("resultado: " +resultado); //Output: resultado: 5 (valor antes do incremento)

        //Lê um caractere no teclado
        char chx;
        System.out.println("\nPress a key followed by ENTER: ");
        chx = (char) System.in.read(); //obtém um char
        System.out.println("Your key is: " +chx);

        //Declaração do enum
        enum DiaDaSemana {
            SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
        }
        //Uso do enum
        DiaDaSemana dia = DiaDaSemana.SEGUNDA;

        //Exemplo de uso do switch-case com enum
        switch (dia) {
            case SEGUNDA:
                System.out.println("Dia de trabalho.");
                break;
            case TERCA:
                System.out.println("Dia de trabalho.");
                break;
            case QUARTA:
                System.out.println("Dia de trabalho.");
                break;
            case QUINTA:
                System.out.println("Dia de trabalho.");
                break;
            case SEXTA:
                System.out.println("Dia de trabalho.");
                break;
            case SABADO:
                System.out.println("Final de semana.");
                break;
            case DOMINGO:
                System.out.println("Final de semana.");
                break;

        }
    }
}
