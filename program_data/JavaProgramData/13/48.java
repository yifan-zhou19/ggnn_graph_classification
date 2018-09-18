package <missing>;

public class GlobalMembers
{
	//????????   ???  ??1000012729
	//****************************************************************
	public static int Main()
	{
		int i; //????num,?????
		int j;
		int n;
		int[] num = new int[20000];
		int judge;
											  //???judge
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print("\n");
		if (n > 0 && n <= 20000) //??n??0??20000
		{
			for (i = 0;i < n;i++)
			{
				judge = 0;
				judge = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (judge >= 10 && judge < 100) //??????
				{
											   //????10??100
					num[i] = judge;
				}
			}
			for (i = 1;i < n;i++)
			{
			  for (j = 0;j < i;j++)
			  {
				  if (num[i] - num[j] == 0) //??????????
				  {
											  //????
					  num[i] = 0; //???????????0
				  }
			  }
			}
			  System.out.print(num[0]);
			  for (i = 1;i < n;i++)
			  {
				if (num[i] != 0) //????0??
				{
					System.out.print(" ");
					System.out.print(num[i]);
				}
			  }
		}
		else
		{
			System.out.print("error");
			System.out.print("\n");
		}
		return 0;
	}


}

