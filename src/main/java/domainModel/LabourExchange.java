package domainModel;

import java.util.HashMap;

public class LabourExchange {
    private final HashMap<Integer, String> vacancies = new HashMap<Integer, String>(){{
        put(92, "Корреспондент по робототехнике");
        put(38, "Военный журналист");
        put(666, "Тестировщик");
        put(61, "Управляющий планетарного масштаба");
        put(93, "Корреспондент по робототехнике");
    }};

    public String getVacancy(int vacID){
        return vacancies.get(vacID);
    }

    public void addVacancy(Integer corpName, String JobName){
        vacancies.put(corpName, JobName);
    }

}
