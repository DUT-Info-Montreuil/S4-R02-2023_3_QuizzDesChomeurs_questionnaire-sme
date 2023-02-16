package fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto;

import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto.QuestionDTO;

import java.util.ArrayList;

public class QuestionnairesDTO {
    private ArrayList<QuestionDTO> questions;

    public QuestionnairesDTO(){
        this.questions = new ArrayList<>();
    }

    public QuestionnairesDTO(ArrayList<QuestionDTO> questions){
        this.questions = questions;
    }

    public void addQuestion(QuestionDTO question){
        this.questions.add(question);
    }

    public ArrayList<QuestionDTO> getQuestions() {
        return questions;
    }
}
