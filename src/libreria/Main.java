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
        Libreria libreria = new Libreria(Integer.parseInt(myObj.nextLine()));
        int c = 0;
        do {
            System.out.println("0) Esci;\n1) Aggiungi libro;\n2) Verifica presenza di un libro;\n3) Mostra libri\n4) Rimuovi libro.\n5)Applica sconto a un determinato genere;");
            System.out.println("Scegli un'operazione da eseguire sulla tua libreria: ");
            c = Integer.parseInt(myObj.nextLine());
            switch (c) {
                case 1:
                    if (libreria.aggiungiLibro()) {
                        System.out.println("Libro inserito correttamente!");
                    } else {
                        System.out.println("Non c'è spazio per questo libro!");
                    }
                    break;
                case 2:
                    System.out.print("Inserisci il titolo del libro da cercare: ");
                    if (libreria.contieneLibro(myObj.nextLine())) {
                        System.out.println("Il libro c'è");
                    } else {
                        System.out.println("Il libro non c'è");
                    }
                    break;
                case 3:
                    libreria.stampa();
                    break;
                case 4:
                    System.out.print("Inserisci il titololo del libro da rimouovere: ");
                    if (libreria.rimuoviLibro(myObj.nextLine())) {
                        System.out.println("Libro rimosso");
                    } else {
                        System.out.println("Il libro non c'è");
                    }
                    break;
                case 5:
                    System.out.println("Inserisci il genere da scontare: ");
                    String genere = myObj.nextLine();
                    if(libreria.isGenerePresente(genere)){
                        System.out.print("Inserisci lo sconto da applicare al genere "+genere+": ");
                        libreria.applicaSconto(genere, Integer.parseInt(myObj.nextLine()));
                        System.out.println("Sconto applicato.");
                    }else{
                        System.out.println("Questo genere non c'è quindi non può essere scontato.");
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
}
