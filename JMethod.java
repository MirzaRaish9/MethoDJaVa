package meThoD;

public class JMethod {
	
	public static void main (String [] args) {
		
		int myCredit = 9500;
		int myCoast1 = 3000;
		int myPetrolCoast2 = 800;
		int myEMI = 2200;
		int mySaving = 1000;
		
		int myTotalCoast = myCoast1 + myPetrolCoast2 + myEMI + mySaving;
		
		//total coast  in percentage
		
		
		System.out.println("My Total Coast is " + myTotalCoast );
		mySaving = myCredit - myTotalCoast ;
		System.out.println("My Saving " + mySaving);
		
		inPercentage(9500 ,3000 ,800,2200,1000,myTotalCoast);
		calculateSaving(9500 ,3000 ,800,2200,1000);
		

}
	public static void calculateSaving(int myCredit , int myCoast , int myPetrolCoast ,int myEMI ,int mysaving) {
		//int myCredit = 9500;
		//int myCoast1 = 3000;
		//int myPetrolCoast2 = 800;
		//int myEMI = 2200;
		//int mySaving = 1000;
		
		System.out.println("Your Credit Was " + myCredit);
		
		
		
		
     
		
	}
				//int also //
	public static double inPercentage(int myCredit , int myCoast , int myPetrolCoast ,int myEMI ,int mySaving ,int myTotalCoast) {
		//int myCredit = 9500;
		//int myCoast1 = 3000;
		//int myPetrolCoast2 = 800;
		//int myEMI = 2200;
		//int mySaving = 1000;
		//int myTotalCoast = myCoast1 + myPetrolCoast2 + myEMI + mySaving;
		
		double coastInPer = ((myTotalCoast * 100) / myCredit);
		System.out.println("MY TOTAL COAST IN % " + coastInPer  +" OUT OF 100%");
		double savInPer = ((mySaving * 100) / myCredit);
		System.out.println("MY TOTAL SAVING IN % " + savInPer + " Out Of 100% ");
		//return (coastInPer + savInPer);
		return -1;
}
}
	   
	   
   