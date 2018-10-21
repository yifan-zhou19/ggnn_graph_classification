package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int i;
		int j;
		int k;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			e = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			f = Integer.parseInt(tempVar6);
		}
		for (i = a;i <= d;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				sum = sum + 366;
			}
			else
			{
				sum = sum + 365;
			}
		}
		for (j = 1;j <= b - 1;j++)
		{
			if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
			{
				sum = sum - 31;
			}
			else if (j == 4 || j == 6 || j == 9 || j == 11)
			{
					sum = sum - 30;
			}
				else if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
				{
						sum = sum - 29;
				}
					else
					{
						sum = sum - 28;
					}
		}
		for (j = e+1;j <= 12;j++)
		{
			if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
			{
				sum = sum - 31;
			}
			else if (j == 4 || j == 6 || j == 9 || j == 11)
			{
					sum = sum - 30;
			}
				else if ((d % 4 == 0 && d % 100 != 0) || (d % 400 == 0))
				{
						sum = sum - 29;
				}
					else
					{
						sum = sum - 28;
					}
		}
		j = e;
		if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
		{
				sum = sum + f - 31;
		}
			else if (j == 4 || j == 6 || j == 9 || j == 11)
			{
					sum = sum + f - 30;
			}
				else if ((j % 4 == 0 && j % 100 != 0) || (j % 400 == 0))
				{
						sum = sum + f - 29;
				}
					else
					{
						sum = sum + f - 28;
					}
		sum = sum - c;
		System.out.printf("%d",sum);

	}
}

