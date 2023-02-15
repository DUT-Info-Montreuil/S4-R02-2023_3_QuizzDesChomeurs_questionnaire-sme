package fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_modeles;

public class Question {

    private int id;
    private int numQuestion;
    private String libellé;
    private String réponse;
    private int difficulté;
    private String explication;
    private String référence;

    public Question(int id, int numQuestion, String libellé, String réponse, int difficulté, String explication, String référence) {
        this.id = id;
        this.numQuestion = numQuestion;
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
}
