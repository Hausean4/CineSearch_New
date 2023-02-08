package ch.zhaw.gpi.CineSearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CineSearch {

    /**
     * Haupt-Methode, welche beim Run-Befehl eine
     * Camunda-Prozessapplikation erstellt.
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(CineSearch.class, args);
    }
}
