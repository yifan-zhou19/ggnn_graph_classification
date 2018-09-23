package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		if (m == 1)
		{
			sum = d;
		}
		if (m == 2)
		{
			sum = 31 + d;
		}
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
		{
			if (m == 3)
			{
				sum = 31 + 29 + d;
			}
			if (m == 4)
			{
				sum = 31 + 29 + 31 + d;
			}
			if (m == 5)
			{
				sum = 31 + 29 + 31 + 30 + d;
			}
			if (m == 6)
			{
				sum = 31 + 29 + 31 + 30 + 31 + d;
			}
			if (m == 7)
			{
				sum = 31 + 29 + 31 + 30 + 31 + 30 + d;
			}
			if (m == 8)
			{
				sum = 31 + 29 + 31 + 30 + 31 + 30 + 31 + d;
			}
			if (m == 9)
			{
				sum = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + d;
			}
			if (m == 10)
			{
				sum = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + d;
			}
			if (m == 11)
			{
				sum = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + d;
			}
			if (m == 12)
			{
				sum = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + d;
			}
		}
		else
		{
			if (m == 3)
			{
				sum = 31 + 28 + d;
			}
			if (m == 4)
			{
				sum = 31 + 28 + 31 + d;
			}
			if (m == 5)
			{
				sum = 31 + 28 + 31 + 30 + d;
			}
			if (m == 6)
			{
				sum = 31 + 28 + 31 + 30 + 31 + d;
			}
			if (m == 7)
			{
				sum = 31 + 28 + 31 + 30 + 31 + 30 + d;
			}
			if (m == 8)
			{
				sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + d;
			}
			if (m == 9)
			{
				sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + d;
			}
			if (m == 10)
			{
				sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + d;
			}
			if (m == 11)
			{
				sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + d;
			}
			if (m == 12)
			{
				sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + d;
			}
		}
		System.out.printf("%d\n",sum);
		return 0;
	}
}

