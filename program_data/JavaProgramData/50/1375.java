package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		int i;
		int d = 12;
		for (i = 1;i <= 12;i++)
		{
			if (i == 3)
			{
				d += 28;
			}
			else if (i == 5 || i == 7 || i == 10 || i == 12)
			{
				d += 30;
			}
			else if (i == 2 || i == 4 || i == 6 || i == 8 || i == 9 || i == 11)
			{
				d += 31;
			}
			if ((d % 7 + w) % 7 == 5)
			{
				System.out.printf("%d\n",i);
			}
		}
	return 0;
	}
}

