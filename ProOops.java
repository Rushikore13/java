package demo.ptpl;
import java.util.*;
public class ProOops {

		  int Id, price,quantity;
		  String productName;
		  ProOops(int price, String productName){
		    
		    this.productName=productName;
		    this.price=price;
		    
		  }
		  public  void total(){
		    System.out.println("Total Cost of "+ productName +" is: Rs= "+price*quantity+"." );
		  }
		  public static void main(String[] args) {
			  ProOops product1= new ProOops(45000,"Laptop");
			  ProOops product2= new ProOops(10000,"Mobile");
			  ProOops product3= new ProOops(364,"Charger");
			  ProOops product4= new ProOops(150, "Earphone");
			  
			  
			  Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter the product ID (1 for Laptop, 2 for Mobile, 3 for Charger, 4 for Earphone): ");
		        int Id = scanner.nextInt();

		        System.out.println("Enter the quantity: ");
		        int quantity = scanner.nextInt();

                 
			  switch (Id) {
	            case 1:
	                product1.quantity = quantity;
	                product1.total();
	                break;
	            case 2:
	                product2.quantity = quantity;
	                product2.total();
	                break;
	            case 3:
	                product3.quantity = quantity;
	                product3.total();
	                break;
	            case 4:
	                product4.quantity = quantity;
	                product4.total();
	                break;
	            default:
	                System.out.println("Invalid product ID.");
	                break;
	        }

	        scanner.close();

		  }
		}

		
	


