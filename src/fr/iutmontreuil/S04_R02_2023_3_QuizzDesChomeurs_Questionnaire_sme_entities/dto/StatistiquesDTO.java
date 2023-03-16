package fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto;

import java.sql.Time;
import java.time.format.DateTimeFormatter;

public class StatistiquesDTO {
    private QuestionnairesDTO questionnaire;
    private int score;
    private int time;


    public StatistiquesDTO(QuestionnairesDTO questionnaire,int score) {
        this.questionnaire = questionnaire;
        this.score = score;
        this.time = 0;
    }

    public String getTime(){
        int heures = 0;
        int minutes = 0;
        int secondes = time;

        while(secondes > 60){
            minutes++;
            secondes = secondes - 60;
        }

        while(minutes > 60){
            heures++;
            minutes = minutes - 60;
        }

        return heures + " heures, "+minutes+" minutes et"+ secondes+" secondes.";
    }

    public int getScore(){
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
