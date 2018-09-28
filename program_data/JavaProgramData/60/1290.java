package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int j;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 3;a <= (n - 2);a++)
		{
		  for (i = 2;i <= (a / 2);i++)
		  {
			 if (a % i == 0)
			 {
			   break;
			 }
		  }
			  if (i >= a / 2)
			  {
				  b = a + 2;
					for (j = 2;j <= (b / 2);j++)
					{
					   if (b % j == 0)
					   {
						break;
					   }
					}
					 if (j >= (b / 2))
					 {
					   System.out.printf("%d %d\n",a,b);
					   sum++;
					 }
			  }


		}
		if (sum == 0)
		{
		  System.out.print("empty");

		}














	}
}

