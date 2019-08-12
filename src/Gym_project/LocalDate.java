package Gym_project;

import java.time.format.DateTimeFormatter;

class LocalDate {
    String getLocalDate() {
        return java.time.LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
    }
}
