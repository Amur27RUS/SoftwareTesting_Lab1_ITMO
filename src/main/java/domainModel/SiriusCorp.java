package domainModel;

import java.lang.reflect.Type;

public class SiriusCorp {
    private int numberOfEmployees = 8;
    private String CEOName = "John Sung";
    private int[] openVacancies = new int[] {92};
    private HumanCharacteristics employeesChar = HumanCharacteristics.BRAINLESS;

    public int getNumberOfEmployees(){
        return numberOfEmployees;
    }

    public String getCEO(){
        return CEOName;
    }

    public int[] getOpenVacancies(){
        return openVacancies;
    }

    public HumanCharacteristics getEmployeesChar(){
        return employeesChar;
    }


}
