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

class IServiceQuestionnaireTest implements IServiceQuestionnaire{

    @Override
    public ArrayList<QuestionnairesDTO> fournirListeQuestionnaires() {
        ArrayList<QuestionnairesDTO> questionnairesDTO = new ArrayList<>();
        return questionnairesDTO;
    }

    @Override
    public List<QuestionDTO> fournirUnQuestionnaire(String fichierCSV) {

        if (fichierCSV == null) {
            throw new IllegalArgumentException("Le fichier n'existe pas");
        }

        File file = new File(fichierCSV);
        if (!file.exists()) {
            throw new IllegalArgumentException("Le fichier "+fichierCSV+" n'existe pas");
        }

        List<QuestionDTO> res = new ArrayList<>();
        res.add(new QuestionDTO(1, 1, "non utilisé", "non utilisé", "non utilisé", 0, "non utilisé", "non utilisé"));
        res.add(new QuestionDTO(1, 2, "fr", "Quel sport de raquette porte le nom de la ville anglaise où il fut inventé ?", "Badminton", 1, "Le badminton est toujours pratiqué en intérieur car avec le vent, en extérieur, le volant peut brusquement changer de direction.", "https://fr.wikipedia.org/wiki/Badminton"));
        return res;
    }

    @BeforeEach
    public void init(TestInfo testInfo) {
        System.out.println("Appel du test"+testInfo.getDisplayName());
    }

    @Test
    public void fournirUnQuestionnaireTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            fournirUnQuestionnaire(null);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            fournirUnQuestionnaire("lefichiernestpaslamalheuresement");
        });

        List<QuestionDTO> questions = fournirUnQuestionnaire("src/fr/iutmontreuil/S04_R02_2023_3_QuizzDesChomeurs_Questionnaire_sme_ressources/questionsQuizz_V1.1.csv");
        assertEquals(2, questions.size());

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