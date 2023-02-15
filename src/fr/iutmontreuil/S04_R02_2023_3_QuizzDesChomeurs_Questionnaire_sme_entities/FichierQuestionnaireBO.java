package fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities;

import java.util.ArrayList;

public class FichierQuestionnaireBO {

    private String nomQuestionnaire;
    private ArrayList<QuestionnairesDTO> questionnairesDTO;

    public FichierQuestionnaireBO(String nomQuestionnaire) {
        this.nomQuestionnaire = nomQuestionnaire;
        this.questionnairesDTO = new ArrayList<>();
    }

    public String getNomQuestionnaire() {
        return nomQuestionnaire;
    }

    public void setNomQuestionnaire(String nomQuestionnaire) {
        this.nomQuestionnaire = nomQuestionnaire;
    }

    public ArrayList<QuestionnairesDTO> getQuestionnairesDTO() {
        return questionnairesDTO;
    }

    public void setQuestionnairesDTO(ArrayList<QuestionnairesDTO> questionnairesDTO) {
        this.questionnairesDTO = questionnairesDTO;
    }
}
