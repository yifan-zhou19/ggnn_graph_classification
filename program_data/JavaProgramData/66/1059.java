package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] p = new int[400];
		int[] q = new int[12];
		int a;
		int b;
		int c;
		int i;
		int s = 0;
		for (i = 1;i <= 12;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				q[i] = 31;
			}
			else
			{
				if (i == 4 || i == 6 || i == 9 || i == 11)
				{
					q[i] = 30;
				}
				else
				{
					q[i] = 28;
				}
			}
		}
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
		if (a % 400 != 0)
		{
		a = a % 400;
		}
		else
		{
			a = 400;
		}
		for (i = 1;i <= a;i++)
		{
			if (i % 400 == 0)
			{
				p[i] = 1;
			}
			else
			{
				if (i % 100 == 0)
				{
					p[i] = 0;
				}
				else
				{
					if (i % 4 == 0)
					{
						p[i] = 1;
					}
					else
					{
						p[i] = 0;
					}
				}
			}
		}
		for (i = 1;i <= b;i++)
		{
			s = s + q[i];
		}
		s = s - q[b] + c;
		for (i = 1;i <= a;i++)
		{
			s = s + p[i] + 365;
		}
		s = s - 365 - p[a];
		if (p[a] == 1 && b >= 3)
		{
			s = s + 1;
		}
		s = s % 7;
		if (s == 1)
		{
		System.out.print("Mon.");
		}
		if (s == 2)
		{
		System.out.print("Tue.");
		}
		if (s == 3)
		{
		System.out.print("Wed.");
		}
		if (s == 4)
		{
		System.out.print("Thu.");
		}
		if (s == 5)
		{
		System.out.print("Fri.");
		}
		if (s == 6)
		{
		System.out.print("Sat.");
		}
		if (s == 0)
		{
		System.out.print("Sun.");
		}
		return 0;
	}
}

