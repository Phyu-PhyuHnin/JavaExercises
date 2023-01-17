package exercise2;

public class TestIncrement {

	public static void main(String[] args) {
		int i = 20;  //declaration and assign of variable i
		int iInc;    //declaration of variable
		
//demonstrate postfit increment	
		iInc = i++;
		System.out.println("The value of i : " + i);
		System.out.println("The value of iInc : " + iInc);
		
//demonstrate prefit increment		
        iInc = ++i;
		System.out.println("The value of i : " + i);
		System.out.println("The value of iInc : " + iInc);

	}

}
