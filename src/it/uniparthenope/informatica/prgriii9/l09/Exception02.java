package it.uniparthenope.informatica.prgriii9.l09;

public class Exception02 {
    public static void main(String[] args) {
        double sum = 0;

        for (String arg : args) {
            try {
                sum += Double.parseDouble(arg);
            } catch (NumberFormatException e) {
                System.out.println("Errore! " + e.getMessage());
            }
        }
        System.out.println("La somma è " + sum);

    }
}
