package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int sum = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}

		for (i = 1;i <= m;i++)
		{
			if (i % 10 == 7 || i / 10 == 7 || i % 7 == 0)
			{
				sum += i * i;
			}
		}

		int SUM = 0;
		int n;
		for (n = 0;n <= m;n++)
		{
			SUM += n * n;
		}
		System.out.printf("%d",SUM - sum);

	}

}

