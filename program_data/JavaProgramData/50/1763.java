package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		int sum = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		if ((13 + w - 1) % 7 == 5)
		{
			System.out.print("1\n");
		}
		for (n = 2;n <= 12;n++)
		{
			sum = 0;
		for (i = 1;i < n;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				sum += 31;
			}
		else if (i == 2)
		{
				sum += 28;
		}
			else
			{
				sum += 30;
			}
		}
		sum += 13;
		if ((sum + w - 1) % 7 == 5)
		{
			System.out.printf("%d\n",n);
		}
		}
		return 0;
	}
}

