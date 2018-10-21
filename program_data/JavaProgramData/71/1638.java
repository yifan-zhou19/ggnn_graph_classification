package <missing>;

public class GlobalMembers
{
	public static int check(int y,int m)
	{
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int c;
		if ((y % 4 == 0 && y % 100 != 0) || (y % 100 == 0 && y % 400 == 0))
		{
		days[2]++;
		}
		c = 1;
		for (i = 1;i < m;i++)
		{
		c = c + days[i];
		}
		return c;
	}
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int y;
		int m1;
		int m2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			if (m1 > m2)
			{
			k = check(y, m1) - check(y, m2);
			}
			else
			{
			k = check(y, m2) - check(y, m1);
			}
			if (k % 7 == 0)
			{
			System.out.print("YES\n");
			}
			else
			{
			System.out.print("NO\n");
			}
		}
	}

}

