package orfiel;

//import klasy Scanner
import java.util.Scanner;

public class Main42 {

    public static void main(String[] arg) {

        //deklaracja zmiennej "liczba" i przypisanie jej wartości
        int liczba = 0;

        //dodanie obiektu "sc" odbierającego dane wprowadzone przez urzytkownika
        Scanner sc = new Scanner(System.in);

        //uruchomienie pętli
        while (liczba !=42) {

            //prośba o liczbę
            System.out.println("Podaj liczbę całkowitą");

            //nadpisanie wartości "liczba" przez wartość wprowadzoną przez urzytkownika
            liczba = sc.nextInt();

            //wypisanie warości podanej przez urzytkownika
            System.out.println(liczba);

        //warunek zakończenia działania pętli i zamknię programu gdy pojawi się liczba 42
        }
    }
}  //jak zrobić żeby ta kurwa na końcu się nie wyświetlała i czemu
//po znianie robisię unreachable statements

