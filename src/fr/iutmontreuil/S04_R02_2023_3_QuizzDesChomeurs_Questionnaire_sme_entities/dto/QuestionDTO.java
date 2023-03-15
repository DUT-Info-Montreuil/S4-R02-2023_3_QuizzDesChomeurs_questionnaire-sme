package fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto;

import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.bo.FichierQuestionnaireBO;

public class QuestionDTO {

    private int id;
    private int numQuestion;
    private String langue;
    private String libellé;
    private String réponse;
    private int difficulté;
    private String explication;
    private String référence;

    public QuestionDTO(FichierQuestionnaireBO question) {
        this.id = question.getIdQuestion();
        this.numQuestion = question.getNumQuestion();
        this.langue = question.getLangue();
        this.libellé = question.getLibelléQuestion();
        this.réponse = question.getRéponseQuestion();
        this.difficulté = question.getDifficultéQuestion();
        this.explication = question.getExplicationQuestion();
        this.référence = question.getRéférenceQuestion();
    }

    public QuestionDTO(int id, int numQuestion, String langue, String libellé, String réponse, int difficulté, String explication, String référence) {
        this.id = id;
        this.numQuestion = numQuestion;
        this.langue = langue;
        this.libellé = libellé;
        this.réponse = réponse;
        this.difficulté = difficulté;
        this.explication = explication;
        this.référence = référence;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumQuestion() {
        return numQuestion;
    }

    public void setNumQuestion(int numQuestion) {
        this.numQuestion = numQuestion;
    }

    public String getLibellé() {
        return libellé;
    }

    public void setLibellé(String libellé) {
        this.libellé = libellé;
    }

    public String getRéponse() {
        return réponse;
    }

    public void setRéponse(String réponse) {
        this.réponse = réponse;
    }

    public int getDifficulté() {
        return difficulté;
    }

    public void setDifficulté(int difficulté) {
        this.difficulté = difficulté;
    }

    public String getExplication() {
        return explication;
    }

    public void setExplication(String explication) {
        this.explication = explication;
    }

    public String getRéférence() {
        return référence;
    }

    public void setRéférence(String référence) {
        this.référence = référence;
    }


    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    @Override
    public String toString() {
        return numQuestion+"."+" "+libellé;
    }
}
