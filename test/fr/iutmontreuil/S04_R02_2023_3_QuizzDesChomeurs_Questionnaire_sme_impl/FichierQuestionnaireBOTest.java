package fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_impl;

import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.bo.FichierQuestionnaireBO;
import fr.iutmontreuil.S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_entities.dto.QuestionDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class FichierQuestionnaireBOTest {


    @BeforeEach
    public void init(TestInfo testInfo) {
        FichierQuestionnaireBO fichierQuestionnaireBO = new FichierQuestionnaireBO(1);
        System.out.println("Appel du test"+testInfo.getDisplayName());
    }

    @Test
    public void fichierQuestionnaire() {
        FichierQuestionnaireBO fichierQuestionnaireBO = new FichierQuestionnaireBO(1);
        assertTrue(fichierQuestionnaireBO.getIdQuestion()==1);
        assertTrue(fichierQuestionnaireBO.getNumQuestion()==2);
        assertTrue(fichierQuestionnaireBO.getLibelléQuestion().equals("Quel sport de raquette porte le nom de la ville anglaise où il fut inventé ?"));
        assertTrue(fichierQuestionnaireBO.getRéponseQuestion().equals("Badminton"));
        assertTrue(fichierQuestionnaireBO.getDifficultéQuestion()==1);
        assertTrue(fichierQuestionnaireBO.getExplicationQuestion().equals("Le badminton est toujours pratiqué en intérieur car avec le vent, en extérieur, le volant peut brusquement changer de direction."));
        assertTrue(fichierQuestionnaireBO.getRéférenceQuestion().equals("https://fr.wikipedia.org/wiki/Badminton"));
    }

}