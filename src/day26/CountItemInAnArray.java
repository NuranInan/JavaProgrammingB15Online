package day26;
import java.util.Arrays;
public class CountItemInAnArray {
    public static void main(String[] args) {


        String[] marvelHeros = {"Iron Man", "Capitan America", "Spiderman",
                "Balck Panther", "Hulk", "Black Widow", "Wanda", "Capitan Marvel",
                "Capitan America", "Spiderman",
                "Black Widow", "Wanda", "Capitan Marvel",
                "Capitan America"};
        String[] marvelHeroes = {"Iron Man", "Captain America", "Spider man",
                "Black Panther", "Hulk", "Black Widow", "Wanda", "Captain Marvel",
                "Captain America", "Spider man",
                "Black Widow", "Wanda", "Captain Marvel",
                "Captain America"};

        System.out.println("Marvel Heros = " + Arrays.toString(marvelHeros));
        System.out.println("Marvel Heros = " + Arrays.toString(marvelHeroes));
        int sizeOfArray = marvelHeroes.length;
        System.out.println("Hero count = " + sizeOfArray);


        String itemToSearch;
       itemToSearch = "Black Widow";
        int countOfItem = 0;

        for (String eachHero : marvelHeroes) {

            if (eachHero.equals(itemToSearch)) {
                countOfItem++;
            }

        }

        // COUNT THE HERO WITH WITH THE NAME CONTAINS BLACK

        System.out.println("countOfItem = " + countOfItem);


    }
}
