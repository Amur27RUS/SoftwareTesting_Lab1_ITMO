import domainModel.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DomainModelTest extends Assert {

    static Environment environment;

    SiriusCorp sc = new SiriusCorp();
    CompanySizes cs = new CompanySizes();
    LabourExchange le = new LabourExchange();
    GalaxyGuide gg = new GalaxyGuide();

    //действие: Революция

    @BeforeClass
    public static void createEnvironment() {
        environment = new Environment();
    }

    @Test
    public void beforeTheRevolutionTest(){
        assertFalse(environment.getCompanyWallState());
    }

    @Test
    public void afterTheRevolution(){
        environment.startRevolution();
        assertTrue(environment.getCompanyWallState());
    }

    @Test
    public void afterTheRevolutionEnded(){
        environment.startRevolution();
        environment.endRevolution();
        assertFalse(environment.getCompanyWallState());
    }

    @Test
    public void isSiriusCorpKuchka(){
        assertEquals("Кучка", cs.getCompanySizes(sc.getNumberOfEmployees()));
    }

    @Test
    public void checkRightVacancy(){
        boolean completed = false;
        int[] vacancies = sc.getOpenVacancies();
        for(int i = 0; i<vacancies.length; i++){
            if(le.getVacancy(vacancies[i]).equals("Корреспондент по робототехнике")){
                completed = true;
            }
        }
        assertTrue(completed);
    }

    @Test
    public void checkRightDef(){
        assertEquals("кучка безмозглых придурков, которых первыми поставят к стенке, когда начнется революция",
                gg.getDef("Кибернитическая корпорация Сириус"));
    }

    @Test
    public void checkSiriusEmpChar(){
        assertEquals(HumanCharacteristics.BRAINLESS, sc.getEmployeesChar());
    }


}
