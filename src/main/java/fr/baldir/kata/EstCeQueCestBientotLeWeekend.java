package fr.baldir.kata;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EstCeQueCestBientotLeWeekend {


    public String answer() {

        LocalDateTime now = LocalDateTime.now();
        // 2 janvier 2022
        // http://web.archive.org/web/20220102062033/http://estcequecestbientotleweekend.fr/


        // Vendredi 1 avril 2022 à 22h27
        // http://web.archive.org/web/20220401222742/https://estcequecestbientotleweekend.fr/

        // Jeudi 14 avril 2022 à 17h58
        // http://web.archive.org/web/20220414175810/https://estcequecestbientotleweekend.fr/
        // 1 novembre 2022
        LocalDate toussaint2022 = LocalDate.of(2022, 11, 1);
        if (toussaint2022.getDayOfMonth() == now.getDayOfMonth() &&
            toussaint2022.getMonthValue() == now.getMonthValue()) {
            return "Non. ¯\\_(ツ)_/¯\n" +
                   "\n" +
                   "Mais on ne travaille pas ! 😎";
        }
        LocalDate dimanche12Avril2020 = LocalDate.of(2020, 4, 12);
        if (dimanche12Avril2020.getYear() == now.getYear()
            && dimanche12Avril2020.getDayOfMonth() == now.getDayOfMonth() &&
            dimanche12Avril2020.getMonthValue() == now.getMonthValue()) {
            return "C'est le week-end ! \\o/\n" +
                   "\n" +
                   "Mais demain, on ne travaille pas \\o/";
        }
        // http://web.archive.org/web/20200413112731/https://estcequecestbientotleweekend.fr/
        LocalDate lundi13Avril2020 = LocalDate.of(2020, 4, 13);
        if (lundi13Avril2020.getYear() == now.getYear()
            && lundi13Avril2020.getDayOfMonth() == now.getDayOfMonth() &&
            lundi13Avril2020.getMonthValue() == now.getMonthValue()) {
            return"Non.\n" +
                  "\n" +
                  "En fait, si. C'est toujours le week-end \\o/";
        }

        // 2 novembre 2022
        LocalDate mercredi2Novembre2022 = LocalDate.of(2022, 11, 2);
        if (mercredi2Novembre2022.getDayOfMonth() == now.getDayOfMonth() &&
            mercredi2Novembre2022.getMonthValue() == now.getMonthValue()) {
            return "Non. ¯\\_(ツ)_/¯";
        }

        LocalDate vendredi17Avril2020 = LocalDate.of(2020, 4, 17);
        if (
                vendredi17Avril2020.getYear() == now.getYear() &&
                vendredi17Avril2020.getDayOfMonth() == now.getDayOfMonth() &&
            vendredi17Avril2020.getMonthValue() == now.getMonthValue()) {
            if(now.getHour()<12){
                return "Presque, mais pas encore. :(";
            }else if(now.getHour()>=12 && now.getHour() <18){
                return "Bientôt...";
            }
            return "C'est le week-end ! \\o/";
        }


        // http://web.archive.org/web/20200415000000*/estcequecestbientotleweekend.fr
        // En 2020
        // Jeudi    09 avril
        // Vendredi 10 avril
        // Samedi   11 avril
        // Dimanche 12 avril
        // Lundi    13 avril
        // Mardi    14 avril
        // Mercredi 15 avril
        // Jeudi    16 avril
        // Vendredi 17 avril
        // Samedi   18 avril
        // Dimanche 19 avril
        // Lundi    20 avril



        return "Non. ¯\\_(ツ)_/¯";
    }

}
