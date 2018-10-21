package <missing>;

public class GlobalMembers
{
	//*****************************************************
	//???????
	//??:??????????
	// ??????
	//****************************************************** 
	public static int Main() //???
	{ //?????
		int num; //??????num
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (num != 1) //while??????1??
		{
				  if (num % 2 == 0) //if????????
				  {
											//?? 
						 System.out.print(num);
						 System.out.print("/2=");
						 System.out.print(num / 2);
						 System.out.print("\n");
						 num = num / 2;
				  }
				  else
				  {
					   System.out.print(num);
					   System.out.print("*3+1=");
					   System.out.print(num * 3 + 1);
					   System.out.print("\n");
					   num = num * 3 + 1;
				  }
		}
		System.out.print("End");
		System.out.print("\n");
		return 0;
	} //?????

}

