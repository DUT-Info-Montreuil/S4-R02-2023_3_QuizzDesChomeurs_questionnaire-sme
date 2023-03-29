package fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme.entities.modeles;

import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto.QuestionDTO;
import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto.QuestionnairesDTO;
import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto.StatistiquesDTO;

public interface IServiceQuizz {

    public void preparerLesElementsDeLaPartie(String fichier);

    public int determinerLaProchaineQuestions(QuestionnairesDTO questionnaire);

    public void determinerLeScoreDeLaQuestion(StatistiquesDTO statistiquesDTO,QuestionDTO questionDTO,String reponse);

}
