package poker;

import java.util.Scanner;

public class Poker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input 5 cards: ");
        String hand = input.nextLine();

        if (isRoyalFlush(hand)) {
            System.out.println("Royal flush!");
        } else if (isStraightFlush(hand)) {
            System.out.println("Straight flush!");
        } else if (isFourOfAKind(hand)) {
            System.out.println("Four of a kind!");
        } else if (isFullHouse(hand)) {
            System.out.println("Full house!");
        } else if (isFlush(hand)) {
            System.out.println("Flush!");
        } else if (isStraight(hand)) {
            System.out.println("Straight!");
        } else if (isThreeOfAKind(hand)) {
            System.out.println("Three of a kind!");
        } else if (isTwoPairs(hand)) {
            System.out.println("Two pairs!");
        } else if (isPair(hand)) {
            System.out.println("Pair!");
        } else {
            System.out.println("High card");
        }
    }

    private static boolean isStraight(String hand) {
        return false;
    }

    private static boolean isPair(String hand) {
        // Same logic than three methods below..
        return false;
    }

    private static boolean isTwoPairs(String hand) {
        return false;
    }

    private static boolean isThreeOfAKind(String hand) {
        return false;
    }

    private static boolean isFourOfAKind(String hand) {
        return false;
    }

    private static boolean isFlush(String hand) {
        return false;
    }

    private static boolean isFullHouse(String hand) {
        return isThreeOfAKind(hand) && isPair(hand);
    }

    private static boolean isStraightFlush(String hand) {
        return isFlush(hand) && isStraight(hand);
    }

    private static boolean isRoyalFlush(String hand) {
        boolean temp = isStraightFlush(hand);
        return false;
    }
}
