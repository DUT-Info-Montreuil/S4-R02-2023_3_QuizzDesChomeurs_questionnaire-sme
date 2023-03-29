package fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto;

import java.util.ArrayList;

public class QuestionnairesDTO {
    private ArrayList<QuestionDTO> listeQuestion;
    private int index;

    public QuestionnairesDTO(){
        this.listeQuestion = new ArrayList<>();
        this.index = 0;
    }

    public QuestionnairesDTO(ArrayList<QuestionDTO> listeQuestion){
        this.listeQuestion = listeQuestion;
        this.index = 0;
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

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void incrementeIndex() {
        this.index+=1;
    }
}
