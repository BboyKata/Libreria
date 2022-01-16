/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libreria;

/**
 *
 * @author Studente
 */
public class Libro {
    public String titolo;
    public String autore;
    public String genere;
    public String casaEditrice;
    public double prezzo;
    public int annoPubblicazione;

    public Libro() {
    }

    public Libro(String titolo, String autore, String genere, String casaEditrice, double prezzo, int annoPubblicazione) {
        this.titolo = titolo;
        this.autore = autore;
        this.genere = genere;
        this.casaEditrice = casaEditrice;
        this.prezzo = prezzo;
        this.annoPubblicazione = annoPubblicazione;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public void setCasaEditrice(String casaEditrice) {
        this.casaEditrice = casaEditrice;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }
    
}
