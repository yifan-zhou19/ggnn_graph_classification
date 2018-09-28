package <missing>;

public class GlobalMembers
{
	public static int run(int year)
	{
		if (year % 100 == 0)
		{
			if (year % 400 == 0)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			if (year % 4 == 0)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= n;i++)
		{
			int year;
			int m1;
			int m2;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
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
			int[] m = new int[13];
			m[1] = 31;
			m[2] = 28;
			m[3] = 31;
			m[4] = 30;
			m[5] = 31;
			m[6] = 30;
			m[7] = 31;
			m[8] = 31;
			m[9] = 30;
			m[10] = 31;
			m[11] = 30;
			m[12] = 31;
			int p = 0;
			int q = 0;
			if (run(year) != 0)
			{
				m[2] = 29;
				int j = 1;
				while (j < m1)
				{
					p = p + m[j];
					j++;
				}
				j = 1;
				while (j < m2)
				{
					q = q + m[j];
					j++;
				}
			}
			else
			{
				int j = 1;
				while (j < m1)
				{
					p = p + m[j];
					j++;
				}
				j = 1;
				while (j < m2)
				{
					q = q + m[j];
					j++;
				}
			}
			if ((p - q) % 7 == 0)
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

