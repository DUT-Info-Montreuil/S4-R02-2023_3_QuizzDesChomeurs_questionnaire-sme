package fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme.entities.modeles;

import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto.QuestionDTO;

import java.util.ArrayList;

public interface IServiceQuestionnaire {
    public ArrayList<QuestionDTO> fournirListeQuestions();
}
