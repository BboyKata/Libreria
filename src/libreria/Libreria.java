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
public class Libreria {

    private Libro[] libreria;
    private int i;

    public Libreria(int m) {
        this.i = 0;
        this.libreria = new Libro[m];
    }

    public boolean aggiungiLibro() {
        if (i < libreria.length) {
            Libro libro = new Libro();
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            
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
            
            libreria[i] = libro;
            i++;
            return true;
        }
        return false;
    }

    public boolean contieneLibro(String titolo) {
        for (int j = 0; j < libreria.length; j++) {
            if (libreria[j] != null && titolo.equals(libreria[j].titolo)) {
                return true;
            }
        }
        return false;
    }

    private int indiceLibro(String titolo) {
        for (int j = 0; j < libreria.length; j++) {
            if (titolo.equals(libreria[j].titolo)) {
                return j;
            }
        }
        return 0;
    }

    private void scalaLibri() {
        for (int j = 0; j < libreria.length; j++) {
            if (libreria[j] == null) {
                for (int k = j; k < libreria.length - 1; k++) {
                    if (libreria[k + 1] != null) {
                        libreria[k] = libreria[k + 1];
                    }
                }
            }
        }
    }

    public boolean rimuoviLibro(String titolo) {
        if (contieneLibro(titolo)) {
            libreria[indiceLibro(titolo)] = null;
            scalaLibri();
            i--;
            libreria[i] = null;
            return true;
        } else {
            return false;
        }
    }

    public void stampa() {
        for (Libro libro : libreria) {
            if (libro != null) {
                System.out.println("Titolo: " + libro.titolo + " Autore: " + libro.autore + " Genere: " + libro.genere + " Casa Editrice " + libro.casaEditrice + " Anno: " + libro.annoPubblicazione + " Prezzo: " + libro.prezzo);
            } else {
                System.out.println("XXXX SPAZIO DISPONIBILE PER UN LIBRO XXXX");
            }
        }
    }

}
