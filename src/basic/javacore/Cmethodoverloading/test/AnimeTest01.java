package basic.javacore.Cmethodoverloading.test;
import basic.javacore.Cmethodoverloading.domain.Anime;
public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Chuunibyou", "Action", 12, "Finished");


        anime.print();

    }
}
