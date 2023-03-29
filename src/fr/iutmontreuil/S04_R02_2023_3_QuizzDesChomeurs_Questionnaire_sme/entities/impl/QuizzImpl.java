package fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme.entities.impl;

import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme.entities.modeles.IServiceQuizz;
import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto.QuestionDTO;
import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto.QuestionnairesDTO;
import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto.StatistiquesDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuizzImpl implements IServiceQuizz {

    private QuestionnaireImpl questionnaireImpl;

    public QuizzImpl() {
        this.questionnaireImpl = new QuestionnaireImpl();
    }

    @Override
    public void preparerLesElementsDeLaPartie(String fichier) {

        List<QuestionDTO> liste_Questions = questionnaireImpl.fournirUnQuestionnaire(fichier);
        Collections.shuffle(liste_Questions);
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

    @Override
    public void determinerLeScoreDeLaQuestion(StatistiquesDTO statistiquesDTO, QuestionDTO questionDTO, String reponse) {

        if(questionnaireImpl.verifReponse(questionDTO,reponse)) {
            if(questionDTO.getDifficulté()==3) {
                statistiquesDTO.incrementeScore(2);
            }else {
                statistiquesDTO.incrementeScore(1);
            }
        }
    }

}
