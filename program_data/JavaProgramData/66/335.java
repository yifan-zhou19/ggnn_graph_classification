package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int m = 0;
		int i;
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
		m += a - 1 + (a - 1) / 4 - (a - 1) / 100 + (a - 1) / 400 + c;
		int[] m1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] m2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (b > 1)
		{
			if (a % 4 != 0 || (a % 100 == 0 && a % 400 != 0))
			{
				for (i = 0;i < b - 1;i++)
				{
					m += m1[i];
				}
			}
			else
			{
				for (i = 0;i < b - 1;i++)
				{
					m += m2[i];
				}
			}
		}
		if (m % 7 == 1)
		{
			System.out.print("Mon.");
		}
		if (m % 7 == 2)
		{
			System.out.print("Tue.");
		}
		if (m % 7 == 3)
		{
			System.out.print("Wed.");
		}
		if (m % 7 == 4)
		{
			System.out.print("Thu.");
		}
		if (m % 7 == 5)
		{
			System.out.print("Fri.");
		}
		if (m % 7 == 6)
		{
			System.out.print("Sat.");
		}
		if (m % 7 == 0)
		{
			System.out.print("Sun.");
		}
		return 0;
	}
}

