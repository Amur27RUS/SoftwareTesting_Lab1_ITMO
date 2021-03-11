package domainModel;

public class CompanySizes {
    public String getCompanySizes(int size){
        if(size < 5){
            return "Горстка";
        }else if (size<=8){
            return "Кучка";
        }else if(size <=30){
            return "Горка";
        }else if(size <=50){
            return "Груда";
        }else{
            return "Стадо";
        }
    }

}
