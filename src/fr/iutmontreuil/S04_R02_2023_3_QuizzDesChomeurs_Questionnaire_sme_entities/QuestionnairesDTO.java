package fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
