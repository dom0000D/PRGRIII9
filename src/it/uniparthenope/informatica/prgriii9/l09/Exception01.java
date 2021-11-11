package it.uniparthenope.informatica.prgriii9.l09;

public class Exception01 {
    public static void main(String[] args) {
        double sum = 0;
        try {
            for (String arg : args) {
                sum += Double.parseDouble(arg);
            }
            System.out.println("La somma è " + sum);
        } catch (NumberFormatException e){
            System.out.println("Errore! " + e.getMessage());
        }
    }
}
