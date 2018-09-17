package <missing>;

public class GlobalMembers
{
	public static int isrunnian(int year)
	{
		if (year % 400 == 0)
		{
			return 1;
		}
		else if (year % 4 == 0 && year % 100 != 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int y;
		int m;
		int d;
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
			System.out.printf("%d\n",d);
		}
		else if (m == 2)
		{
			System.out.printf("%d\n",31 + d);
		}
		else if (m == 3)
		{
			if (isrunnian(y) != 0)
			{
				System.out.printf("%d\n",31 + 29 + d);
			}
			else
			{
				System.out.printf("%d\n",31 + 28 + d);
			}
		}
		else if (m == 4)
		{
			if (isrunnian(y) != 0)
			{
				System.out.printf("%d\n",31 + 29 + 31 + d);
			}
			else
			{
				System.out.printf("%d\n",31 + 28 + 31 + d);
			}
		}
		else if (m == 5)
		{
			if (isrunnian(y) != 0)
			{
				System.out.printf("%d\n",31 + 29 + 31 + 30 + d);
			}
			else
			{
				System.out.printf("%d\n",31 + 28 + 31 + 30 + d);
			}
		}
		else if (m == 6)
		{
			if (isrunnian(y) != 0)
			{
				System.out.printf("%d\n",31 + 29 + 31 + 30 + 31 + d);
			}
			else
			{
				System.out.printf("%d\n",31 + 28 + 30 + 31 + 31 + d);
			}
		}
		else if (m == 7)
		{
			if (isrunnian(y) != 0)
			{
				System.out.printf("%d\n",31 + 29 + 31 + 30 + 31 + 30 + d);
			}
			else
			{
				System.out.printf("%d\n",31 + 28 + 31 + 30 + 31 + 30 + d);
			}
		}
		else if (m == 8)
		{
			if (isrunnian(y) != 0)
			{
				System.out.printf("%d\n",31 + 29 + 31 + 30 + 31 + 30 + 31 + d);
			}
			else
			{
				System.out.printf("%d\n",31 + 28 + 31 + 30 + 31 + 30 + 31 + d);
			}
		}
		else if (m == 9)
		{
			if (isrunnian(y) != 0)
			{
				System.out.printf("%d\n",31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + d);
			}
			else
			{
				System.out.printf("%d\n",31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + d);
			}
		}
		else if (m == 10)
		{
			if (isrunnian(y) != 0)
			{
				System.out.printf("%d\n",31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + d);
			}
			else
			{
				System.out.printf("%d\n",31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + d);
			}
		}
		else if (m == 11)
		{
			if (isrunnian(y) != 0)
			{
				System.out.printf("%d\n",31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + d);
			}
			else
			{
				System.out.printf("%d\n",31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + d);
			}
		}
		else if (m == 12)
		{
			if (isrunnian(y) != 0)
			{
				System.out.printf("%d\n",31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + d);
			}
			else
			{
				System.out.printf("%d\n",31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + d);
			}
		}
		return 0;
	}
}

