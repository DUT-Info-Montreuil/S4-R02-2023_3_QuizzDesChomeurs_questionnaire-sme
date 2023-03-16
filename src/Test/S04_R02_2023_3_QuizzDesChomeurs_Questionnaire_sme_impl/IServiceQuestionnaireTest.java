package Test.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_impl;

import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme.entities.impl.QuestionnaireImpl;
import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme.entities.modeles.IServiceQuestionnaire;
import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto.QuestionDTO;
import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto.QuestionnairesDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.mockito.Mock;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IServiceQuestionnaireTest{

    QuestionnaireImpl questionnaire = new QuestionnaireImpl();

    @BeforeEach
    public void init(TestInfo testInfo) {
        System.out.println("Appel du test"+testInfo.getDisplayName());
    }

    @Test
    public void fournirUnQuestionnaireTest() {

        List<QuestionDTO> questions = questionnaire.fournirUnQuestionnaire("src/fr/iutmontreuil/S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_ressources/questionsQuizz_V1.1.csv");
        assertEquals(30, questions.size());

        assertTrue(questions.get(0).getId()==1);
        assertTrue(questions.get(0).getId()==1);
        assertTrue(questions.get(0).getLangue().equals("fr"));
        assertTrue(questions.get(0).getLibellé().equals("De quel petit objet se munit le golfeur pour surélever sa balle avant de la frapper ?"));
        assertTrue(questions.get(0).getRéponse().equals("Tee"));
        assertTrue(questions.get(0).getDifficulté()==1);
        assertTrue(questions.get(0).getExplication().equals("Le joueur peut poser sa balle sur une cheville de bois ou de plastique qui ne peut pas être utilisée en dehors des départs."));
        assertTrue(questions.get(0).getRéférence().equals("https://fr.wikipedia.org/wiki/Matériel_de_golf"));
    }
}