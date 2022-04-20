import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Datas {
    
    int day;
    int month;
    int year;
    String date = str();
    
    Datas(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    Datas(){
    // construtor
    }

       public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public boolean verify(){

        if(this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month ==  10|| this.month ==  12){
          if(1 > this.day || this.day > 31){
              System.out.println("Formato inválido, seu dia deve ser entre 1 e 31");
              return false;
          }
       }if(this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11){
          if(1 > this.day || this.day > 30){
              System.out.println("Formato inválido, seu dia deve ser entre 1 e 30");
              return false;
        }
       }if(this.month == 2){
        if(1 > this.day || this.day > 30){
            System.out.println("Formato inválido, seu dia deve ser 1 e 28");
            return false;
      }
     }
        if(this.month > 12 || this.month < 1){
            System.out.println("Formato inválido, seu mês deve ser 1 e 12");
            return false;
        }
        else{
            return true;
        }
    }

    public String str(){
        String date = this.day + "/" + this.month + "/" + this.year;
        if(verify() == true){
            System.out.println(date);
        return date;
        }
        else{
            return "00/00/0000";
        }
    }

    public String nextDay() throws ParseException{

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sdf.parse(date));
        calendar.add(Calendar.DATE, 1);
        String nextDay = sdf.format(calendar.getTime());
        System.out.println(nextDay);
        return nextDay;
        
    }
    
}
