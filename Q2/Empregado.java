public class Empregado {
    String name;
    String surname;
    double salary;

    Empregado(String name, String surname, double salary){
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public void salario(){
        double ano = this.salary*12;
        System.out.println("Salário anual : " + ano);
        double aposAumento = ano*1.1;
        System.out.println("Salário anual após aumento : " + aposAumento);


    }
    
}
