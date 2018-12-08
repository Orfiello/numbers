package orfiel;

//import klasy Scanner
import java.util.Scanner;

public class MainTab {

    public static void main(String[] args) {

        //deklaracja zmiennej "size"
        int size;

        //deklaracja tablicy
        int[] tab;

        //prośba o podanie wielkości tablicy
        System.out.println("Podaj rozmiar tablicy");

        //dodanie obiektu "sc" odbierającego dane wprowadzone przez urzytkownika
        Scanner sc = new Scanner(System.in);

        //przypisanie wartości wprowadzonej przez urzytkownika do zmiennnej "size"
        size = sc.nextInt();

        //nadanie tablicy rozmiaru wprowadzonego przez urzytkownika
        tab = new int[size];

        //zadeklarowanie i nadanie wartośći zmiennej
        int index = 0;

        //uruchomienie pętli
        do {

            //prosba o wprowadzenie wartosci
            System.out.println("Podaj liczbę całkowitą");

            //przypisanie wartosci wprowadzonej do konkretnego indexu w Tablicy zaczynając od indexu 0
            tab[index] = sc.nextInt();

            //po każdej pętli następuje inkrementacja indeksu
            index++;

            //warunek zakończenia pętli ( gdy numer indexu przestanie być mniejszy od długości tablicy)
        } while (index < tab.length);

        //deklaracja zmiennej i przypisanie do niej długości tablicy
        int dlugosc = tab.length;

        //deklaracja zmiennej i przypisanie jej indexu 0 z tablicy
        int max = tab[0];

        //deklaracja zmiennej i przypisanie jej indexu 0 z tablicy
        int min = tab[0];

        //pętla przeska po indeksach zaczynając od 0 i po wykonaniu się zwieksza index o 1 do momentu gdy
        //wartość indeksu nie przestanie być mniejsza od długości tablicy
        for (int i = 0; i < dlugosc; i++) {

            //instrukcja warunkowa przyjmująca wartość znajdującą się pod konkretnym indeksem
            //porównująca tę wartość z zmienną max
            if (tab[i] > max)

                //jeżeli wartość elementu z tablicy jest większa niż wartość zmiennej max
                //zmienna max zostanie nadpisana po czym pętla zaczyna się od nowa
                max = tab[i];
        }
        //wydrukowanie największej wartości z tablicy
        System.out.println("Najwieksza wartość w tablicy to: " + max);




        //pętla przeska po indeksach zaczynając od 0 i po wykonaniu się zwieksza index o 1 do momentu gdy
        //wartość indeksu nie przestanie być mniejsza od długości tablicy
        for (int i = 0; i < dlugosc; i++) {

            //instrukcja warunkowa przyjmująca wartość znajdującą się pod konkretnym indeksem
            //porównująca tę wartość z zmienną max
            if (tab[i] < min)

                //jeżeli wartość elementu z tablicy jest większa niż wartość zmiennej max
                //zmienna max zostanie nadpisana po czym pętla zaczyna się od nowa
                min = tab[i];
        }
        //wydrukowanie największej wartości z tablicy
        System.out.println("Najmniejsza wartość w tablicy to: " + min);


//        //pętla przeska po indeksach zaczynając od 0 i po wykonaniu się przechodzi do następnego indeksu
//        //do momętu gdy wartość indeksu nie przestanie być mniejsza od długości tablicy
//        for (int i : tab) {
//
//            //instrukcja warunkowa przyjmująca wartość znajdującą się pod konkretnym indeksem
//            //porównująca tę wartość z zmienną min
//            if (tab[i] > min)
//
//                //jeżeli wartość elementu z tablicy jest mniejsza niż wartość zmiennej min
//                //zmienna min zostanie nadpisana po czym pętla zaczyna się od nowa
//                min = tab[i];
//        }
//
//
//
//        //wydrukowanie największej wartości z tablicy
//        System.out.println("Najmniejsza wertość w tablicy to: " + min);

    }
}
