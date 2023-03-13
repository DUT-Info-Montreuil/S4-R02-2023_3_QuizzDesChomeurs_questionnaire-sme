package Test.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_impl;

import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme.entities.impl.QuestionnaireImpl;
import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme.entities.modeles.IServiceQuestionnaire;
import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto.QuestionnairesDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

class IServiceQuestionnaireTest {

    @Mock
    IServiceQuestionnaire serviceQuestionnaire;

    @BeforeEach
    public void init(TestInfo testInfo) {
        System.out.println("Appel du test"+testInfo.getDisplayName());
    }

    @Test
    public void NombreQuestionsDansLeQuestionnaireTest() {
        String fichierCSV = "src/fr/iutmontreuil/S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_ressources/questionsQuizz_V1.1.csv";

        QuestionnaireImpl objATester = new QuestionnaireImpl();

        QuestionnairesDTO questionnaires = objATester.fournirUnQuestionnaire(fichierCSV);

        int nombreQuestion = questionnaires.getListeQuestion().size();

        assertEquals(30,nombreQuestion);
    }
}