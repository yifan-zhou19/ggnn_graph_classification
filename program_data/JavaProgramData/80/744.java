package <missing>;

public class GlobalMembers
{
	public static int judge(int n)
	{
		if (((n % 4 == 0) && ((n % 100) != 0)) || ((n % 400) == 0))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int add(int[] g, int year, int mon, int day)
	{
		int i;
		int s = 0;
		  if (judge(year) != 0)
		  {
			g[2]++;
		for (i = 1;i <= mon - 1;i++)
		{
			s += g[i];
		}
		s += day;
		g[2]--;
		  }
		else
		{
			for (i = 1;i <= mon - 1;i++)
			{
				s += g[i];
			}
		s += day;
		}
		return (s);
	}
	public static int Main()
	{


		int u = 0;
		int year;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int[] g = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 0, 0};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			e = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			f = Integer.parseInt(tempVar6);
		}
		int i;
		int j;
		if (a == d)
		{
			u += add(g, a, e, f) - add(g, a, b, c);
		}
		else
		{
		if (judge(a) != 0)
		{
			u += 366 - add(g, a, b, c);
		}
		else
		{
			u += 365 - add(g, a, b, c);
		}
		for (i = a + 1;i <= d - 1;i++)
		{
			if (judge(i) != 0)
			{
				u += 366;
			}
			else
			{
				u += 365;
			}
		}
		u += add(g, d, e, f);
		}
		System.out.printf("%d",u);
	}

}

