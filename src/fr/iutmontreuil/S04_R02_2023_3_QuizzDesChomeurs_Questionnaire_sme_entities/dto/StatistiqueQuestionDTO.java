package fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto;

public class StatistiqueQuestionDTO {

    private int score;

    private int time;

    public StatistiqueQuestionDTO(int score) {
        this.score = score;
        this.time = 0;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
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

    public void setTime(int time) {
        this.time = time;
    }
}
