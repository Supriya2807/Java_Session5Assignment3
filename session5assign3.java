package acadgild.assignments;

class area{
	double side1,side2;
	
	area(double a){
	
		side1=side2=a;
		
	}
	
	area(double a,double b){
		
		side1=a;
		side2=b;
		
	}
	
	double getarea(){
	
		return side1*side2;
		
	}
	
	
}

public class session5assign3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		area sqr= new area(5);
		System.out.println("The area of Square is :"+sqr.getarea());
				
		
		area rect= new area(5,10);
		rect.getarea();
		System.out.println("The area of Rectangle is :"+rect.getarea());

		
		

		
	}

}
