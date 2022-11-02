package fr.baldir.kata;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Main {
    public static void main(String[] args) {
        // https://estcequecestbientotleweekend.fr

        String reponse = new EstCeQueCestBientotLeWeekend().answer();
        System.out.println(reponse);
        System.out.println(LocalDateTime.ofInstant(Instant.parse("2022-11-01T23:29:28.660Z"), ZoneOffset.UTC));
    }

}