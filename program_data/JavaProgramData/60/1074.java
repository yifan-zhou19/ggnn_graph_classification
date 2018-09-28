package <missing>;

public class GlobalMembers
{
	public static int prime(int i)
	{
		int j;
		int output = 0;
		int count = 0;

		if (i == 1 || i == 2)
		{
			 output = 0;
		}
		else
		{
		for (j = 1; j <= i; j++)
		{
			  if ((i / j) * j == i)
			  {
				   count++;
			  }
		}

		if (count == 2)
		{
				 output = 1;
		}
		}


		return output;
	}



	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int count = 0;
		int i;
		for (i = 3; i <= n - 2; i = i + 2)
		{
			  if (prime(i) == 1 && prime(i + 2) == 1)
			  {
						  System.out.printf("%d %d\n", i, i + 2);
						  count++;
			  }

		}
		if (count == 0)
		{
			System.out.print("empty");
		}

		return 0;
	}


}

