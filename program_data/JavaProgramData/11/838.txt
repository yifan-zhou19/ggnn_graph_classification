package <missing>;

public class GlobalMembers
{
	public static int isrn(int n)
	{
		if (n % 400 == 0)
		{
			return 1;
		}
		else
		{
			if (n % 100 == 0)
			{
				return 0;
			}
			else
			{
				if (n % 4 == 0)
				{
					return 1;
				}
				else
				{
					return 0;
				}
			}
		}
	}

	public static void Main()
	{
		int y;
		int m;
		int d;
		int sum = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		for (i = 1;i < m;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
			{
				sum += 31;
			}
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				sum += 30;
			}
			if (i == 2)
			{
				if (isrn(y) != 0)
				{
					sum += 29;
				}
				else
				{
					sum += 28;
				}
			}
		}
		sum += d;
		System.out.printf("%d\n",sum);
	}

}

