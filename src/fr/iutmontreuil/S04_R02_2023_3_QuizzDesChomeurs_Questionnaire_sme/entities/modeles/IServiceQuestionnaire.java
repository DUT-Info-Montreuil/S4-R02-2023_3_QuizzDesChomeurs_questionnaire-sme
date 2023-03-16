package fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme.entities.modeles;

import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto.QuestionDTO;
import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto.QuestionnairesDTO;

import java.util.ArrayList;
import java.util.List;

public interface IServiceQuestionnaire {

    public ArrayList<QuestionnairesDTO> fournirListeQuestionnaires();
    public List<QuestionDTO> fournirUnQuestionnaire(String fichierCSV);
}
