package fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_modeles;

import java.util.ArrayList;

public class Questionnaires {
    private ArrayList<QuestionDTO> questions;

    public Questionnaires(){
        this.questions = new ArrayList<QuestionDTO>();
    }

    public Questionnaires(ArrayList<QuestionDTO> questions){
        this.questions = questions;
    }

    public void addQuestion(QuestionDTO question){
        this.questions.add(question);
    }

    public ArrayList<QuestionDTO> getQuestions() {
        return questions;
    }
}
