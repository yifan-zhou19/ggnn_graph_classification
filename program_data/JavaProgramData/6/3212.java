package <missing>;

public class GlobalMembers
{
	public static int summer()
	{
		int m;
		int n;
		int line;
		int row;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			line = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			row = Integer.parseInt(tempVar2);
		}
		int[][] fib = new int[SIZE][SIZEE];

		for (m = 0;m < line;m++)
		{
						for (n = 0;n < row;n++)
						{
										String tempVar3 = ConsoleInput.scanfRead();
										if (tempVar3 != null)
										{
											fib[m][n] = Integer.parseInt(tempVar3);
										}
						}
		}
		int sum = 0;
		int i;
		for (i = 0;i < row;i++)
		{
						  sum = sum + *(fib + i) + *(*(fib + line-1) + i);
		}

		for (i = 1;i < line-1;i++)
		{
							sum = sum + *(*(fib + i)) + *(*(fib + i) + row - 1);
		}

		return sum;
	}

	public static int Main()
	{
		int counter;
		int times;
		int patty;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			times = Integer.parseInt(tempVar);
		}

		for (counter = 0;counter < times;counter++)
		{
		patty = summer();
		System.out.printf("%d\n",patty);
		}


		return 0;
	}
}

