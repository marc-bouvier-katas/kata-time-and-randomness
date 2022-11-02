package fr.baldir.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EstCeQueCestBientotLeWeekendTest {


    @Test
    void mercredi_2_novembre_2022_n_est_pas_le_weekend() {

        EstCeQueCestBientotLeWeekend sut = new EstCeQueCestBientotLeWeekend();

        assertThat(sut.answer())
                .isEqualTo("Non. ¯\\_(ツ)_/¯");
    }

    @Test
    void toussaint_2022_n_est_pas_le_weekend_mais_on_ne_travaille_pas() {

        // Comment faire?
        EstCeQueCestBientotLeWeekend sut = new EstCeQueCestBientotLeWeekend();
        // sut = ???;

        String answer = sut.answer();

        assertThat(answer).isEqualTo("Non. ¯\\_(ツ)_/¯\n" +
                                     "\n" +
                                     "Mais on ne travaille pas ! 😎");
    }

    // 2020-04-12T12:00:00.000Z
    @Test
    void dimanche_12_avril_2020_est_le_weekend_mais_demain_on_ne_travaille_pas() {

        // Comment faire?
        EstCeQueCestBientotLeWeekend sut = new EstCeQueCestBientotLeWeekend();
        // sut = ???;

        String answer = sut.answer();

        assertThat(answer).isEqualTo("C'est le week-end ! \\o/\n" +
                                     "\n" +
                                     "Mais demain, on ne travaille pas \\o/");
    }

    // Bientôt… 😎
    // http://web.archive.org/web/20200413112731/https://estcequecestbientotleweekend.fr/
    // 2020-04-13T12:00:00.000Z
    @Test
    void lundi_13_avril_2020_n_est_pas_le_weekend_en_fait_si() {

        // Comment faire?
        EstCeQueCestBientotLeWeekend sut = new EstCeQueCestBientotLeWeekend();
        // sut = ???;

        String answer = sut.answer();

        assertThat(answer).isEqualTo("Non.\n" +
                                     "\n" +
                                     "En fait, si. C'est toujours le week-end \\o/");
    }

    // 2020-04-14T12:00:00.000Z
    @Test
    void mardi_14_avril_2020_n_est_pas_le_weekend() {

        // Comment faire?
        EstCeQueCestBientotLeWeekend sut = new EstCeQueCestBientotLeWeekend();
        // sut = ???;

        String answer = sut.answer();

        assertThat(answer).isEqualTo("Non. ¯\\_(ツ)_/¯");
    }

    // Non.
    //http://web.archive.org/web/20200416121836/https://estcequecestbientotleweekend.fr/
    // 2020-04-15T12:00:00.000Z
    @Test
    void mercredi_15_avril_2020_n_est_pas_le_weekend() {

        // Comment faire?
        EstCeQueCestBientotLeWeekend sut = new EstCeQueCestBientotLeWeekend();
        // sut = ???;

        String answer = sut.answer();

        assertThat(answer).isEqualTo("Non. ¯\\_(ツ)_/¯");
    }

    //http://web.archive.org/web/20200416121836/https://estcequecestbientotleweekend.fr/
    // 2020-04-13T12:00:00.000Z
    @Test
    void jeudi_16_avril_2020_non_en_fait_si_c_est_toujours_le_weekend() {

        // Comment faire?
        EstCeQueCestBientotLeWeekend sut = new EstCeQueCestBientotLeWeekend();
        // sut = ???;

        String answer = sut.answer();

        assertThat(answer).isEqualTo("Non.\n" +
                                     "\n" +
                                     "En fait, si. C'est toujours le week-end \\o/");
    }


    // vendredi 17 avril 2020 à 09h12
    // 2020-04-17T09:12:00.000Z
    @Test
    void vendredi_17_avril_2020_matin_presque_mais_pas_encore() {

        // Comment faire?
        EstCeQueCestBientotLeWeekend sut = new EstCeQueCestBientotLeWeekend();
        // sut = ???;

        String answer = sut.answer();

        assertThat(answer).isEqualTo("Presque, mais pas encore. :(");
    }

    // http://web.archive.org/web/20200514193503/https://estcequecestbientotleweekend.fr/
    // 2020-04-17T15:25:00.000Z
    @Test
    void vendredi_17_avril_2020_15h25_bientot() {

        // Comment faire?
        EstCeQueCestBientotLeWeekend sut = new EstCeQueCestBientotLeWeekend();
        // sut = ???;

        String answer = sut.answer();

        assertThat(answer).isEqualTo("Bientôt...");
    }

    // vendredi 17 avril 2020 à 18h12
    // 2020-04-17T18:12:00.000Z
    @Test
    void vendredi_17_avril_2020_soir_est_le_weekend() {

        // Comment faire?
        EstCeQueCestBientotLeWeekend sut = new EstCeQueCestBientotLeWeekend();
        // sut = ???;

        String answer = sut.answer();

        assertThat(answer).isEqualTo("C'est le week-end ! \\o/");
    }

}
