package domainModel;

import java.lang.reflect.Type;

public class SiriusCorp {
    private int numberOfEmployees = 8;
    private String CEOName = "John Sung";
    private int[] openVacancies = new int[] {92};
    private HumanCharacteristics employeesChar = HumanCharacteristics.BRAINLESS;
    private boolean nearTheWall = false;

    public void changeNearTheWall(boolean bool){
        nearTheWall = bool;
        if(bool){
            System.out.println("Все сотрудники корпорации встали к стенке");
        }else{
            System.out.println("Все сотрудники корпорации отошли от стенки");
        }
    }

    public boolean getNearTheWall(){
        return nearTheWall;
    }

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
