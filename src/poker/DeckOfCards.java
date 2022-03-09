package poker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {

    public static void main(String[] args) {
        String[] suits = { "♠", "♥", "♦", "♣" };
        String[] ranks = "A 2 3 4 5 6 7 8 9 10 J Q K".split(" ");

        List<String> cards = new ArrayList<>();

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(suit + rank);
            }
        }

        Collections.shuffle(cards);
        System.out.println(cards);

        for (int i = 0; i < 50; i += 5) {
            List<String> hand = cards.subList(i, i + 5);
            String handString = String.join(" ", hand);
            System.out.println(handString);
        }
    }
}
