package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int year;
		int leap;
		int i;
		int j;
		int k;
		int m1;
		int m2;
		int re;
		int q;
		int tmp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
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
				tmp = m1;
				m1 = m2;
				m2 = tmp;
			}
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			{
				leap = 1;
			}
			else
			{
				leap = 0;
			}
			q = 0;
			if (leap == 1)
			{
				int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
				for (k = m1;k < m2;k++)
				{
					q += month[k - 1];
				}
				if (q % 7 == 0)
				{
					re = 1;
				}
				else
				{
					re = 0;
				}
			}
			else
			{
				int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
				for (k = m1;k < m2;k++)
				{
					q += month[k - 1];
				}
				if (q % 7 == 0)
				{
					re = 1;
				}
				else
				{
					re = 0;
				}
			}
			if (re == 1)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
		return 0;
	}

}

