package fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme.entities.impl;

import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme.entities.modeles.IServiceQuestionnaire;
import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.bo.FichierQuestionnaireBO;
import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto.QuestionDTO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class QuestionImpl implements IServiceQuestionnaire {
    @Override
    public ArrayList<QuestionDTO> fournirListeQuestions() {
        String ligne = "";
        String separateurFichier = ";";
        ArrayList<QuestionDTO> listeQuestionDTO = new ArrayList<>();
        int size = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/fr/iutmontreuil/S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_ressources/questionsQuizz_V1.1.csv"));
            while ((ligne = br.readLine()) != null) {
                size++;
            }
            for(int i = 1; i < size; i++){
                listeQuestionDTO.add(new QuestionDTO(new FichierQuestionnaireBO(i)));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listeQuestionDTO;
    }
}
