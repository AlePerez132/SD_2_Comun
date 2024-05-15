/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestorbibliotecacomun;

/**
 *
 * @author alepd
 */
public class TLibro {
   private String Isbn;
   private String Titulo;
   private String Autor;
   private int Anio;
   private String Pais;
   private String Idioma;
   private int NoLibros;
   private int NoPrestados;
   private int NoListaEspera;

    public TLibro() {
    }

    public TLibro(String Isbn, String Titulo, String Autor, int Anio, String Pais, String Idioma, int NoLibros, int NoPrestados, int NoListaEspera) {
        this.Isbn = Isbn;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Anio = Anio;
        this.Pais = Pais;
        this.Idioma = Idioma;
        this.NoLibros = NoLibros;
        this.NoPrestados = NoPrestados;
        this.NoListaEspera = NoListaEspera;
    }

   
    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String Isbn) {
        this.Isbn = Isbn;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getAnio() {
        return Anio;
    }

    public void setAnio(int Anio) {
        this.Anio = Anio;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }

    public int getNoLibros() {
        return NoLibros;
    }

    public void setNoLibros(int NoLibros) {
        this.NoLibros = NoLibros;
    }

    public int getNoPrestados() {
        return NoPrestados;
    }

    public void setNoPrestados(int NoPrestados) {
        this.NoPrestados = NoPrestados;
    }

    public int getNoListaEspera() {
        return NoListaEspera;
    }

    public void setNoListaEspera(int NoListaEspera) {
        this.NoListaEspera = NoListaEspera;
    }
   
}
