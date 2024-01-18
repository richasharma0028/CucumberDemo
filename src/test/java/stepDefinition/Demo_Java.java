package stepDefinition;

public class Demo_Java {
	public static void main(String[] args) {

		//While loop
		//1 to 10
		int k=10;
		/* while(i>0)
	{
	System.out.println(i);
	i--;//i=2
	}
	}*/
		int j=20;
		do
		{
			System.out.println(j);
			j++;
		}
		while(j>30);// 1 loop of execution is guarantee
	
	// For if loop
	// 1 to 10

	/* for(initization;condition;increment)
	{

	}*/
	/* if(5>2)
	{


	System.out.println("success");
	System.out.println("second step");
	}

	else

	System.out.println("fail");*/


	for(int i=0;i<10;i=i+3)
	{
		if(i==9)
			System.out.println(" 9 is displayed");
		else
			System.out.println("I didnot find");//
	}
}

}



