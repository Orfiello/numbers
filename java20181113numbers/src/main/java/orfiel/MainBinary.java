package orfiel;
//import klasy Scanner

import java.util.Scanner;

public class MainBinary {

    public static void main(String[] arg) {
        //deklaracja tablicy 4-elementowej
        int[] tab = new int[4];

        //deklaracja zmiennej "liczba"
        int liczba;

        //deklaracja zmiennej "i" i przypisanie jej wartości 0
        int index = 0;

        //prośb o wartośc od urzytkownika
        System.out.println("Podaj liczbę");

        //dodanie obiektu "sc" odbierającego dane wprowadzone przez urzytkownika
        Scanner sc = new Scanner(System.in);

        //przypisanie wartości wprowadzonej przez urzytkownika do zmiennnej "liczba"
        liczba = sc.nextInt();

        //instrukcja warunkowa w sytuacji wprowadzenia wartości mniejszyj lub równej 0
        if (liczba < 0) {

            //drukowanie pouczenia dla użytkownika
            System.out.println("Należy podać liczbę z przedziału 0 do 15 włącznie");

        //instrukcja warunkowa w sytuacji wprowadzenia wartości większej niż 15
        } else if (liczba > 15) {

            //drukowanie pouczenia dla użytkownika
            System.out.println("Należy podać liczbę z przedziału 0 do 15 włącznie");

        //instrukcja warunkowa niezadeklarowa w żadnym z powyższych przypadków
        } else {


            //pętla która wykonuje sie do momentu gdy pobrany argument jest różny od 0
            while (liczba != 0) {

                //wprowadzony przez urzytkowika element jest dzielony modulo
                //wynik jest przypisywany do tablicy
                tab[index] = liczba % 2;

                //liczba jest dzielona przez 2 bez reszty a jej wynik nadpisuje zmienną "liczba"
                liczba /= 2;

                //inkrementacja indexu tablicy i ponowne rozpoczęcie pętli
                index++;
            }
            //wydrukowanie tekstu w cudzysłowie
            System.out.print("Twoja liczba w zapisie binarnym: ");

            //pętla wypisująca zawartosć tablicy od tyłu w jednej linii
            for (int j = tab.length - 1; j >= 0; j--)

                //wydrukowanie elementów tablicy
                System.out.print(tab[j]);
        }
    }
}
