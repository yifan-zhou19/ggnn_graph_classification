package <missing>;

public class GlobalMembers
{
	public static int runnian(int year)

	{
		int result;
		if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0))
		{
			result = 1;
		}
		else
		{
			result = 0;
		}
		return result;
	}
	public static int Main()
	{
		int b;
		int tian = -1;
		int nian;
		int yue;
		int ri;
		int a = 1;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			nian = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			yue = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			ri = Integer.parseInt(tempVar3);
		}
		b = nian % 4000;
		for (i = 1;i < b;i++)
		{
			if (runnian(i) != 0)
			{
				a = a + 2;
			}
			else
			{
				a++;
			}
		}
		for (i = 1;i < yue;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
			{
				tian += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				tian += 30;
			}
			else if (i = 2)
			{
				if (runnian(b) != 0)
				{
					tian += 29;
				}
				else
				{
					tian += 28;
				}
			}
		}
		tian += ri;
		a = a + tian;
		if (a % 7 == 0)
		{
			System.out.print("Sun.");
		}
		if (a % 7 == 1)
		{
			System.out.print("Mon.");
		}
		if (a % 7 == 2)
		{
			System.out.print("Tue.");
		}
		if (a % 7 == 3)
		{
			System.out.print("Wed.");
		}
		if (a % 7 == 4)
		{
			System.out.print("Thu.");
		}
		if (a % 7 == 5)
		{
			System.out.print("Fri.");
		}
		if (a % 7 == 6)
		{
			System.out.print("Sat.");
		}
		return 0;
	}
}

