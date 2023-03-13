package fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto;

import java.util.ArrayList;

public class QuestionnairesDTO {
    private ArrayList<QuestionDTO> listeQuestion;

    public QuestionnairesDTO(){
        this.listeQuestion = new ArrayList<>();
    }

    public QuestionnairesDTO(ArrayList<QuestionDTO> listeQuestion){
        this.listeQuestion = listeQuestion;
    }

    public void addQuestion(QuestionDTO question){
        this.listeQuestion.add(question);
    }

    public ArrayList<QuestionDTO> getListeQuestion() {
        return listeQuestion;
    }

    public void setListeQuestion(ArrayList<QuestionDTO> listeQuestion) {
        this.listeQuestion = listeQuestion;
    }
}
