package fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.bo;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto.QuestionnairesDTO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FichierQuestionnaireBO {

    private int idQuestion;
    private int numQuestion;
    private String langue;
    private String libelléQuestion;
    private String réponseQuestion;
    private int difficultéQuestion;
    private String explicationQuestion;
    private String référenceQuestion;

    public FichierQuestionnaireBO(int ligneQuestion) {

        try {

            String fichierCSV = "src/fr/iutmontreuil/S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_ressources/questionsQuizz_V1.1.csv";
            FileReader filereader = new FileReader(fichierCSV);


            List<String[]> resultatCSV = new ArrayList<>();

            CSVParser séparateur = new CSVParserBuilder().withSeparator(';').build();

            CSVReader csvReader = new CSVReaderBuilder(filereader)
                    .withCSVParser(séparateur)
                    .build();

            resultatCSV = csvReader.readAll();

            String[] attributs_question = resultatCSV.get(ligneQuestion);

            String[] retireBOM = resultatCSV.get(0);

            if (retireBOM[0].startsWith("\uFEFF")) {
                retireBOM[0] = retireBOM[0].substring(1);
            }

            this.idQuestion = Integer.parseInt(attributs_question[0]);
            this.numQuestion = Integer.parseInt(attributs_question[1]);
            this.langue = attributs_question[2];
            this.libelléQuestion = attributs_question[3];
            this.réponseQuestion = attributs_question[4];
            this.difficultéQuestion = Integer.parseInt(attributs_question[5]);
            this.explicationQuestion = attributs_question[6];
            this.référenceQuestion = attributs_question[7];

        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public int getNumQuestion() {
        return numQuestion;
    }

    public void setNumQuestion(int numQuestion) {
        this.numQuestion = numQuestion;
    }

    public String getLibelléQuestion() {
        return libelléQuestion;
    }

    public void setLibelléQuestion(String libelléQuestion) {
        this.libelléQuestion = libelléQuestion;
    }

    public String getRéponseQuestion() {
        return réponseQuestion;
    }

    public void setRéponseQuestion(String réponseQuestion) {
        this.réponseQuestion = réponseQuestion;
    }

    public int getDifficultéQuestion() {
        return difficultéQuestion;
    }

    public void setDifficultéQuestion(int difficultéQuestion) {
        this.difficultéQuestion = difficultéQuestion;
    }

    public String getExplicationQuestion() {
        return explicationQuestion;
    }

    public void setExplicationQuestion(String explicationQuestion) {
        this.explicationQuestion = explicationQuestion;
    }

    public String getRéférenceQuestion() {
        return référenceQuestion;
    }

    public void setRéférenceQuestion(String référenceQuestion) {
        this.référenceQuestion = référenceQuestion;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    @Override
    public String toString() {
        return "FichierQuestionnaireBO{" +
                "idQuestion=" + idQuestion +
                ", numQuestion=" + numQuestion +
                ", langue='" + langue + '\'' +
                ", libelléQuestion='" + libelléQuestion + '\'' +
                ", réponseQuestion='" + réponseQuestion + '\'' +
                ", difficultéQuestion=" + difficultéQuestion +
                ", explicationQuestion='" + explicationQuestion + '\'' +
                ", référenceQuestion='" + référenceQuestion + '\'' +
                '}';
    }
}
