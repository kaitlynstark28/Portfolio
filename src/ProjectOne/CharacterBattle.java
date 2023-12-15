package ProjectOne;

import java.util.Scanner;
import java.util.Random;

class Character {
    String name;
    int hitPoints;
    String move;
    int movePower;
    int attackSpeed;

    public Character(String name, int hitPoints, String move, int movePower, int attackSpeed) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.move = move;
        this.movePower = movePower;
        this.attackSpeed = attackSpeed;
    }
}

public class CharacterBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Character Battle Game");

        // Get the number of rounds (must be odd)
        int rounds;
        do {
            System.out.print("Enter the number of rounds (odd number): ");
            rounds = scanner.nextInt();
        } while (rounds % 2 == 0);

        Character player1 = createCharacter(scanner, "Player 1");
        Character player2 = createCharacter(scanner, "Player 2");

        int player1Wins = 0;
        int player2Wins = 0;

        int randomSpeed;

        for (int round = 1; round <= rounds; round++) {
            System.out.println("Round " + round + ":");

            randomSpeed = random.nextInt(2);

            if (randomSpeed == 0) {
                player1Turn(player1, player2);
                if (player2.hitPoints <= 0) {
                    player1Wins++;
                    System.out.println(player1.name + " is the round winner.");
                } else {
                    player2Turn(player2, player1);
                    if (player1.hitPoints <= 0) {
                        player2Wins++;
                        System.out.println(player2.name + " is the round winner.");
                    }
                }
            } else {
                player2Turn(player2, player1);
                if (player1.hitPoints <= 0) {
                    player2Wins++;
                    System.out.println(player2.name + " is the round winner.");
                } else {
                    player1Turn(player1, player2);
                    if (player2.hitPoints <= 0) {
                        player1Wins++;
                        System.out.println(player1.name + " is the round winner.");
                    }
                }
            }
        }

        if (player1Wins == player2Wins) {
            // Sudden death tiebreaker
            int suddenDeathRounds = 0;
            while (player1Wins == player2Wins) {
                suddenDeathRounds++;
                System.out.println("Sudden Death Round " + suddenDeathRounds + ":");
                randomSpeed = random.nextInt(2);

                if (randomSpeed == 0) {
                    player1Turn(player1, player2);
                    if (player2.hitPoints <= 0) {
                        player1Wins++;
                        System.out.println(player1.name + " is the round winner.");
                    } else {
                        player2Turn(player2, player1);
                        if (player1.hitPoints <= 0) {
                            player2Wins++;
                            System.out.println(player2.name + " is the round winner.");
                        }
                    }
                } else {
                    player2Turn(player2, player1);
                    if (player1.hitPoints <= 0) {
                        player2Wins++;
                        System.out.println(player2.name + " is the round winner.");
                    } else {
                        player1Turn(player1, player2);
                        if (player2.hitPoints <= 0) {
                            player1Wins++;
                            System.out.println(player1.name + " is the round winner.");
                        }
                    }
                }
            }
        }

        System.out.println("Final Scores:");
        System.out.println(player1.name + ": " + player1Wins + " wins");
        System.out.println(player2.name + ": " + player2Wins + " wins");

        if (player1Wins > player2Wins) {
            System.out.println(player1.name + " has won the battle!");
        } else if (player2Wins > player1Wins) {
            System.out.println(player2.name + " has won the battle!");
        } else {
            System.out.println("It's a tie! There is no winner.");
        }
    }

    public static Character createCharacter(Scanner scanner, String playerName) {
        System.out.println(playerName + ", choose a character:");
        System.out.println("1. Warrior");
        System.out.println("2. Wizard");
        System.out.println("3. Archer");
        System.out.println("4. Create your own");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            return new Character("Warrior", 100, "SwordSlap", 20, 5);
        } else if (choice == 2) {
            return new Character("Wizard", 80, "FireStorm", 30, 8);
        } else if (choice == 3) {
            return new Character("Archer", 90, "MultiShot", 25, 7);
        } else {
            System.out.print("Enter character name: ");
            String name = scanner.nextLine();
            System.out.print("Enter hit points: ");
            int hitPoints = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter move: ");
            String move = scanner.nextLine();
            System.out.print("Enter move's power: ");
            int movePower = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter attack speed: ");
            int attackSpeed = scanner.nextInt();
            scanner.nextLine();

            return new Character(name, hitPoints, move, movePower, attackSpeed);
        }
    }

    public static void player1Turn(Character player1, Character player2) {
        System.out.println(player1.name + "'s turn:");
        int damage = player1.movePower;
        player2.hitPoints -= damage;
        System.out.println(player1.name + " attacks with " + player1.move + " for " + damage + " damage.");
    }

    public static void player2Turn(Character player2, Character player1) {
        System.out.println(player2.name + "'s turn:");
        int damage = player2.movePower;
        player1.hitPoints -= damage;
        System.out.println(player2.name + " attacks with " + player2.move + " for " + damage + " damage.");
    }
}
