import java.text.ParseException;

public class Q3Main{
    public static void main(String []args) throws ParseException{

        Datas hoje = new Datas(3, 11, 2022);

        Datas amanha = new Datas();
        amanha.setDay(13);
        amanha.setMonth(4);
        amanha.setYear(2022);

        hoje.str();
        amanha.str();
        hoje.nextDay();
    }
}