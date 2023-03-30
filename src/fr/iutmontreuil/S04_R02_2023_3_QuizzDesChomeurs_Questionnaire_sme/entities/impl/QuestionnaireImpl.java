package fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme.entities.impl;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme.entities.modeles.IServiceQuestionnaire;
import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto.QuestionDTO;
import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto.QuestionnairesDTO;
import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto.StatistiqueQuestionDTO;
import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto.StatistiquesDTO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class QuestionnaireImpl implements IServiceQuestionnaire {

    public QuestionnaireImpl() {
    }

    @Override
    public ArrayList<QuestionnairesDTO> fournirListeQuestionnaires() {
        return null;
    }

    @Override
    public List<QuestionDTO> fournirUnQuestionnaire(String fichierCSV) {

        try {
            if (fichierCSV == null || fichierCSV.isEmpty()) {
                throw new IllegalArgumentException("Erreur le fichier n'existe pas.");
            }

            File file = new File(fichierCSV);

            if (!file.exists()) {
                throw new FileNotFoundException("Erreur le fichier n'existe pas.");
            }
        }catch (Exception e ) {

        }

        List<QuestionDTO> questionnairesDTO = new ArrayList<>();

        try {

            FileReader filereader = new FileReader(fichierCSV);

            List<String[]> resultatCSV = new ArrayList<>();

            CSVParser séparateur = new CSVParserBuilder().withSeparator(';').build();

            CSVReader csvReader = new CSVReaderBuilder(filereader)
                    .withCSVParser(séparateur)
                    .build();

            resultatCSV = csvReader.readAll();

            String[] retireBOM = resultatCSV.get(0);

            if (retireBOM[0].startsWith("\uFEFF")) {
                retireBOM[0] = retireBOM[0].substring(1);
            }

            for(int i = 0 ; i < resultatCSV.size() ; i++) {

                String [] attributParColonne = resultatCSV.get(i);

                int id = Integer.parseInt(attributParColonne[0]);
                int num = Integer.parseInt(attributParColonne[1]);
                String langue = attributParColonne[2];
                String libellé = attributParColonne[3];
                String réponse = attributParColonne[4];
                int difficulté = Integer.parseInt(attributParColonne[5]);
                String explication = attributParColonne[6];
                String référence = attributParColonne[7];

                questionnairesDTO.add(new QuestionDTO(id,num,langue,libellé,réponse,difficulté,explication,référence));
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return questionnairesDTO;
    }

    @Override
    public void majStatsQuestion(QuestionDTO question) {

        if(question.getDifficulté()==1 || question.getDifficulté()==2) {
            question.getStatistique().setScore(1);
        }else {
            question.getStatistique().setScore(2);
        }
    }

    @Override
    public StatistiquesDTO fournirStatsQuestions(QuestionnairesDTO questionnaires) {

        ArrayList<StatistiqueQuestionDTO> listeStats = new ArrayList<>();

        for(QuestionDTO q : questionnaires.getListeQuestion()) {
            listeStats.add(q.getStatistique());
        }

        return new StatistiquesDTO(listeStats);

    }

}
