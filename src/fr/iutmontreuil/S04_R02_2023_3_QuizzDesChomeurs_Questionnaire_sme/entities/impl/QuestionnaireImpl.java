package fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme.entities.impl;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme.entities.modeles.IServiceQuestionnaire;
import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto.QuestionDTO;
import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto.QuestionnairesDTO;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class QuestionnaireImpl implements IServiceQuestionnaire {

    public QuestionnaireImpl() {
    }

    @Override
    public ArrayList<QuestionnairesDTO> fournirListeQuestionnaires(QuestionnairesDTO questionnaire) {
        ArrayList<QuestionnairesDTO> listeQuestionnaire = new ArrayList<>();
        listeQuestionnaire.add(questionnaire);
        return listeQuestionnaire;
    }

    @Override
    public QuestionnairesDTO fournirUnQuestionnaire(String fichierCSV) {

        QuestionnairesDTO questionnairesDTO = new QuestionnairesDTO();

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

                questionnairesDTO.addQuestion(new QuestionDTO(id,num,langue,libellé,réponse,difficulté,explication,référence));
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return questionnairesDTO;
    }


}
