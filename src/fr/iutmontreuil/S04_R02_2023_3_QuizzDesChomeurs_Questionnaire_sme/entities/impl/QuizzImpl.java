package fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme.entities.impl;

import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme.entities.modeles.IServiceQuizz;
import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto.QuestionDTO;
import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto.QuestionnairesDTO;
import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto.StatistiquesDTO;

import java.util.ArrayList;

public class QuizzImpl implements IServiceQuizz {

    @Override
    public void preparerLesElementsDeLaPartie(QuestionnairesDTO questionnairesDTO,StatistiquesDTO statistique) {

        statistique.setScore(0);
        statistique.setTime(0);
    }

    @Override
    public int determinerLaProchaineQuestions(QuestionnairesDTO questionnaire) {

        int index = questionnaire.getIndex();

        if(index > questionnaire.getListeQuestion().size()) {
            throw new IndexOutOfBoundsException("Pas de question disponible.");
        }

        questionnaire.incrementeIndex();

        return index;
    }

}
