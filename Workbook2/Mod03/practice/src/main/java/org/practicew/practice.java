package org.practicew;
import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter score: Example format: Team1:Team2|21:9");
        String input = scanner.nextLine().trim();

        String[] tokens = input.split("\\|");

        String[] teams = tokens[0].split(":");
        String[] scores = tokens[1].split(":");
        int teams1 = Integer.parseInt(scores[0]);
        int teams2 = Integer.parseInt(scores[1]);

        String winner;
        if (teams1 > teams2) {
            System.out.println("Winner: team 1  Score: "+teams1);
        } else if(teams2 > teams1) {
            System.out.println("Winner: team 2  Score: "+teams2);



        }else{
            System.out.println("draw");
        }

        }
    }

