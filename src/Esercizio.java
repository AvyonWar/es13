public class Esercizio {
    public static void main(String[] args) {
        String myName = new String("tania");
        int strlen = myName.length(); // il " strlen " variabile conta le lettere della stringa
        if((strlen % 2) == 0 ) {
            System.out.println("è pari");;
        }else {
            System.out.println("è dispari");
        }
    }



}
