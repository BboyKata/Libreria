/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.util.Scanner;

/**
 *
 * @author Studente
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Quanti elementi vuoi che abbia la tua libreria? ");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        Libreria l = new Libreria(Integer.parseInt(myObj.nextLine()));
        int c = 1;
        do {
            System.out.println("0) Esci;\n1) Aggiungi libro;\n2) Verifica presenza di un libro;\n3) Mostra libri\n4) Rimuovi libro.");
            System.out.println("Scegli un'operazione da eseguire sulla tua libreria: ");
            c = Integer.parseInt(myObj.nextLine());
            switch (c) {
                case 1:
                    if(l.aggiungiLibro(aggiungiLibro())){
                        System.out.println("Libro inserito correttamente!");
                    }else{
                        System.out.println("Non c'è spazio per questo libro!");
                    }
                    break;
                case 2:
                    System.out.println("Inserisci il titolo del libro da cercare: ");
                    if (l.contieneLibro(myObj.nextLine())) {
                        System.out.println("Il libro c'è");
                    } else {
                        System.out.println("Il libro non c'è");
                    }
                    break;
                case 3: 
                    l.stampa();
                    break;
                case 4:
                    System.out.println("Inserisci il titololo del libro da cercare: ");
                    if (l.rimuoviLibro(myObj.nextLine())) {
                        System.out.println("Libro rimosso");
                    } else {
                        System.out.println("Il libro non c'è");
                    }
                    break;
                case 0:
                    System.out.println("Ciao.");
                    break;
                default:
                    System.out.println("Inserimento errato");
            }
        } while (c != 0);

    }

    private static Libro aggiungiLibro() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        Libro libro = new Libro();
        System.out.println("Inserisci titolo: ");
        libro.setTitolo(myObj.nextLine());
        System.out.println("Inserisci autore: ");
        libro.setAutore(myObj.nextLine());
        System.out.println("Inserisci genere: ");
        libro.setGenere(myObj.nextLine());
        System.out.println("Inserisci casa editrice: ");
        libro.setCasaEditrice(myObj.nextLine());
        System.out.println("Inserisci anno pubblicazione: ");
        libro.setAnnoPubblicazione(Integer.parseInt(myObj.nextLine()));
        System.out.println("Inserisci prezzo: ");
        libro.setPrezzo(Double.parseDouble(myObj.nextLine()));
        return libro;

    }

}
