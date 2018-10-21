package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int number;
		int i;
		int m;
		int[] x = new int[5];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			number = Integer.parseInt(tempVar);
		}
		if (number <= 9)
		{
			i = 1;
		}
		else if (number <= 99)
		{
			i = 2;
		}
		else if (number <= 999)
		{
			i = 3;
		}
		else if (number <= 9999)
		{
			i = 4;
		}
		else
		{
			i = 5;
		}
		for (m = 0;m <= i - 1;m++)
		{
			x[m] = number % 10;
			number = (number - x[m]) / 10;
		}
		for (m = 0;m <= i - 1;m++)
		{
			System.out.printf("%d",x[m]);
		}

		return 0;

	}
}

