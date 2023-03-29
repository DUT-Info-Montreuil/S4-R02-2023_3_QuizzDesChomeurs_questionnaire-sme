package fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme.entities.impl;

import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme.entities.modeles.IServiceStatistique;
import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto.QuestionDTO;
import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto.StatistiquesDTO;

public class StatistiqueImpl implements IServiceStatistique {

    private QuestionnaireImpl questionnaire;

    public StatistiqueImpl() {
        this.questionnaire = new QuestionnaireImpl();
    }

    @Override
    public void determinerLeScoreDeLaQuestion(StatistiquesDTO statistiquesDTO, QuestionDTO questionDTO, String reponse) {

        if(questionnaire.verifReponse(questionDTO,reponse)) {
            statistiquesDTO.incrementeScore(1);
        }
    }

}
