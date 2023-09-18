package guia1eggintroduccion;

public class cambiar3E {

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            String numero = String.format("%03d", i);
            String contador = numero.replace("3", "E");
            String formato_contador = String.join("-", contador.split(""));
            System.out.println(formato_contador);
        }
    }
}
