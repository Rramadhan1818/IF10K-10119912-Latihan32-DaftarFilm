/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119912.latihan32.daftarfilm;

/**
 *
 * @author 
 * NAMA  : Rezki Ramadhan
 * KELAS : IF10K
 * NIM  `: 10119912
 * 
 */

class Film {
    
    public String filmName, filmGenre;
    public Double filmRating;
    public int filmDuration;
    
    public void nowPlaying() {
        System.out.println("Judul Film : " + filmName);
        System.out.println("Genre Film : " + filmGenre);
        System.out.println("Rating Film : " + filmRating);
        System.out.println("Duration Film : " + filmDuration + " Menit");
    }
}

public class IF10K10119912Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          System.out.println("===Daftar Film Sedang Tayang===");
        System.out.println();
        
        Film f = new Film();
        f.filmName = "Venom";
        f.filmGenre = "Action, Horror, Scifi";
        f.filmRating = 8.5;
        f.filmDuration = 120;
        f.nowPlaying();
        System.out.println();
        
        f.filmName = "Small Foot";
        f.filmGenre = "Animation";
        f.filmRating = 9.0;
        f.filmDuration = 96;
        f.nowPlaying();
        System.out.println();
        
        f.filmName = "Crazy Rich Asian";
        f.filmGenre = "Comedy";
        f.filmRating = 7.8;
        f.filmDuration = 119;
        f.nowPlaying();
        System.out.println();
        
        f.filmName = "Asih";
        f.filmGenre = "Horror";
        f.filmRating = 6.0;
        f.filmDuration = 100;
        f.nowPlaying();
        System.out.println();
    }
    
}
