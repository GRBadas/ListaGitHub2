public class Fatura {

    // atributes
    int productNumber;
    String itemDescription;
    int itemQuantity;
    double itemPrice;

    //constructor 
    Fatura(int productNumber, String itemDescription, int itemQuantity, double itemPrice ){
        this.productNumber = productNumber;
        this.itemDescription = itemDescription;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
        System.out.println("O valor é : " + calcular_valor_fatura());
    }

    public double calcular_valor_fatura(){
        double valor = this.itemPrice*this.itemQuantity;
        return valor;
        
    }

    
}
