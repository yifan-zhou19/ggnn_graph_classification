package <missing>;

public class GlobalMembers
{
	public static int sushu(int b)
	{
		int i;
		int a;
		a = 0;
		for (i = 1;i <= b;i++)
		{
			if (i == 2 || i == 4 || i == 6 || i == 8 || i == 9 || i == 11)
			{
			a += 31;
			}
			else if (i == 1)
			{
				a += 12;
			}
				else if (i == 3)
				{
			a += 28;
				}
				else if (i == 5 || i == 7 || i == 10 || i == 12)
				{
					a += 30;
				}
		}
		return a;
	}
	public static int Main()
	{
	int p;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		p = Integer.parseInt(tempVar);
	}
	for (int i = 1;i <= 12;i++)
	{
		if ((sushu(i) + p) % 7 == 5)
		{
			System.out.printf("%d\n",i);
		}
	}
	return 0;
	}
}

