/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Daftar Film
 */
package pbo210116397latihan32daftarfilm;

/**
 *
 * @author Zetro
 */
public class Film {
    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;

    public void nowPlaying(String parJudul, String parGenre, double parRating, 
            int parDuration){
        System.out.println("Judul Film  : "+parJudul);
        System.out.println("Genre Film  : "+parGenre);
        System.out.println("Rating Film : "+parRating);
        System.out.println("Duration Film : "+parDuration+" menit\n");
    }
}
