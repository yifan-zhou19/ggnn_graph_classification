package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a; //??
		int j = 0;
		int k = 0;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 3;i <= 7;i += 2) //??????????
		{
			 if (a % i == 0)
			 {
			 j++;
			 }
		}
		if (j == 0) //??1??
		{
		System.out.print("n");
		}
		else
		{
			for (int i = 3;i <= 7;i += 2) //??
			{
				  if (a % i != 0) //??
				  {
				  continue;
				  }
				  System.out.print(i);
				  k++; //??????????
				  if (k == j) //?????
				  {
				  break;
				  }
				  System.out.print(" ");
			}
		}
		//sys//tem ("pause");
		return 0;
	}


}

