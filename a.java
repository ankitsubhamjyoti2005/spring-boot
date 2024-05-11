import java.util.Random;
import java.util.Scanner;

public class a {
    private static final int MAX_ROOMS = 20;
    private static final int TREASURE_CHANCE = 20;
    private static final int MONSTER_CHANCE = 30;
    private static final int EXIT_CHANCE = 5;

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    private static int currentRoom = 1;
    private static boolean hasKey = false;
    private static boolean gameOver = false;

    public static void main(String[] args) {
        System.out.println("Welcome to the Dungeon Adventure!");
        System.out.println("You find yourself trapped in a dungeon. Your goal is to find the key and escape.");

        while (!gameOver) {
            displayRoomInfo();
            int choice = getUserChoice();
            switch (choice) {
                case 1:
                    move("North");
                    break;
                case 2:
                    move("South");
                    break;
                case 3:
                    move("East");
                    break;
                case 4:
                    move("West");
                    break;
                case 5:
                    searchRoom();
                    break;
                case 6:
                    if (hasKey && currentRoom == MAX_ROOMS) {
                        System.out.println("Congratulations! You've escaped the dungeon!");
                        gameOver = true;
                    } else {
                        System.out.println("You need to find the key and reach the exit room to escape.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
        scanner.close();
    }

    private static void displayRoomInfo() {
        System.out.println("\nYou are in room " + currentRoom);
        System.out.println("Choose an action:");
        System.out.println("1. Move North");
        System.out.println("2. Move South");
        System.out.println("3. Move East");
        System.out.println("4. Move West");
        System.out.println("5. Search the room");
        System.out.println("6. Attempt to escape (if you have the key and reached the exit room)");
    }

    private static int getUserChoice() {
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    private static void move(String direction) {
        int nextRoom = getNextRoom(direction);
        if (nextRoom == -1) {
            System.out.println("You can't move " + direction + " from here.");
        } else {
            System.out.println("You move " + direction + " to room " + nextRoom + ".");
            currentRoom = nextRoom;
            handleRoomEvent();
        }
    }

    private static int getNextRoom(String direction) {
        switch (direction) {
            case "North":
                return currentRoom > 5 ? currentRoom - 5 : -1;
            case "South":
                return currentRoom <= MAX_ROOMS - 5 ? currentRoom + 5 : -1;
            case "East":
                return currentRoom % 5 != 0 ? currentRoom + 1 : -1;
            case "West":
                return (currentRoom - 1) % 5 != 0 ? currentRoom - 1 : -1;
            default:
                return -1;
        }
    }

    private static void searchRoom() {
        System.out.println("You search the room...");
        int randomNum = random.nextInt(100) + 1;
        if (randomNum <= TREASURE_CHANCE) {
            System.out.println("You found a treasure!");
        } else if (randomNum <= TREASURE_CHANCE + MONSTER_CHANCE) {
            System.out.println("Oh no! You encountered a monster!");
            if (hasKey) {
                System.out.println("Luckily, you had the key and managed to escape from the monster.");
            } else {
                System.out.println("The monster defeated you. Game over!");
                gameOver = true;
            }
        } else if (randomNum <= TREASURE_CHANCE + MONSTER_CHANCE + EXIT_CHANCE && currentRoom == MAX_ROOMS) {
            System.out.println("You found the exit! You need a key to escape.");
        } else {
            System.out.println("You didn't find anything interesting.");
        }
    }

    private static void handleRoomEvent() {
        int randomNum = random.nextInt(100) + 1;
        if (randomNum <= TREASURE_CHANCE) {
            System.out.println("You found a treasure in this room!");
        } else if (randomNum <= TREASURE_CHANCE + MONSTER_CHANCE) {
            System.out.println("Oh no! A monster appears in this room!");
            if (hasKey) {
                System.out.println("Luckily, you had the key and managed to escape from the monster.");
            } else {
                System.out.println("The monster defeated you. Game over!");
                gameOver = true;
            }
        } else if (randomNum <= TREASURE_CHANCE + MONSTER_CHANCE + EXIT_CHANCE && currentRoom == MAX_ROOMS) {
            System.out.println("You've found the exit! You need a key to escape.");
        }
        // If the player found the key in this room
        if (!hasKey && randomNum <= TREASURE_CHANCE && currentRoom != MAX_ROOMS) {
            System.out.println("You found a key in this room!");
            hasKey = true;
        }
    }
}

