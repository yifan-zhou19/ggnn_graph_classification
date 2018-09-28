package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int t1;
		int i;
		int yu = 0;
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

		t1 = (a - 1) % 400 + 1;

		for (i = 1;i < t1;i++)
		{
			if (i % 4 != 0 || i % 100 == 0 && i % 400 != 0)
			{
				yu = yu + 365;
			}
			else
			{
				yu = yu + 366;
			}
		}
		for (i = 1;i < b;i++)
		{
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				yu = yu + 30;
			}
			else if (i == 2)
			{
				if (a % 4 != 0 || a % 100 == 0 && a % 400 != 0)
				{
					yu = yu + 28;
				}
				else
				{
					yu = yu + 29;
				}
			}
			else
			{
				yu = yu + 31;
			}
		}
		yu = yu + c;
		yu = yu % 7;
		if (yu == 0)
		{
			System.out.print("Sun.");
		}
		if (yu == 1)
		{
			System.out.print("Mon.");
		}
		if (yu == 2)
		{
			System.out.print("Tue.");
		}
		if (yu == 3)
		{
			System.out.print("Wed.");
		}
		if (yu == 4)
		{
			System.out.print("Thu.");
		}
		if (yu == 5)
		{
			System.out.print("Fri.");
		}
		if (yu == 6)
		{
			System.out.print("Sat.");
		}

	}
}

