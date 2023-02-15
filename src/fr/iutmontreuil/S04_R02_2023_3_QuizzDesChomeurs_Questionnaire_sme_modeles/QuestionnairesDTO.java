package fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_modeles;

import com.opencsv.CSVReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class QuestionnairesDTO {
    private ArrayList<QuestionDTO> questions;

    public QuestionnairesDTO(){
        this.questions = fournirListeQuestions();
    }

    public QuestionnairesDTO(ArrayList<QuestionDTO> questions){
        this.questions = questions;
    }


    public ArrayList<QuestionDTO> fournirListeQuestions() {

        String ligne = "";
        String séparateur = ";";
        ArrayList<QuestionDTO> liste_Question = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("questionsQuizz_V1.1.csv"));
            while ((ligne = br.readLine()) != null)  {

                String[] attribut_Question = ligne.split(séparateur);

                int id = Integer.parseInt(attribut_Question[0]);
                int numQuestion = Integer.parseInt(attribut_Question[1]);
                String libellé = attribut_Question[2];
                String réponse = attribut_Question[3];
                int difficulté = Integer.parseInt(attribut_Question[4]);
                String explication = attribut_Question[5];;
                String référence = attribut_Question[6];

                QuestionDTO questionDTO = new QuestionDTO(id,numQuestion,libellé,réponse,difficulté,explication,référence);

                liste_Question.add(questionDTO);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return liste_Question;
    }

    public void addQuestion(QuestionDTO question){
        this.questions.add(question);
    }

    public ArrayList<QuestionDTO> getQuestions() {
        return questions;
    }
}
