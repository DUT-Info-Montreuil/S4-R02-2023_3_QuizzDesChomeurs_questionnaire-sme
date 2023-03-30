package fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto;

import java.sql.Time;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class StatistiquesDTO {

    ArrayList<StatistiqueQuestionDTO> listeStatistique;


    public StatistiquesDTO(ArrayList<StatistiqueQuestionDTO> listeStatistique) {
        this.listeStatistique = listeStatistique;
    }

    public ArrayList<StatistiqueQuestionDTO> getListeStatistique() {
        return listeStatistique;
    }

    public void setListeStatistique(ArrayList<StatistiqueQuestionDTO> listeStatistique) {
        this.listeStatistique = listeStatistique;
    }
}
