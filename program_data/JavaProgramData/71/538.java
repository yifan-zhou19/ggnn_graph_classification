package <missing>;

public class GlobalMembers
{
	public static int year(int y)
	{
		if (!(y % 4) && y % 100)
		{
			return 1;
		}
		if ((y % 400) == 0)
		{
			return 1;
		}
		return 0;
	}
	public static void Main()
	{
		int i;
		int m1;
		int m2;
		int n;
		int c;
		int s;
		int y;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			if (m1 > m2)
			{
				c = m1;
				m1 = m2;
				m2 = c;
			}
			s = 0;
			if (year(y) != 0)
			{
				for (i = m1 - 1;i < m2 - 1;i++)
				{
					s += b[i];
				}
			}
			else
			{
				for (i = m1 - 1;i < m2 - 1;i++)
				{
					s += a[i];
				}
			}
			if (s % 7 != 0)
			{
				System.out.print("NO\n");
			}
			else
			{
				System.out.print("YES\n");
			}
		}
	}
}

