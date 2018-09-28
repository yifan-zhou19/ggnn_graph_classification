package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int y;
		int m1;
		int m2;
		int t;
		int sum;
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
			sum = 0;
			if (m1 > m2)
			{
				t = m1;
				m1 = m2;
				m2 = t;
			}
			if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
			{
				if (1 >= m1 != 0 && 1 < m2)
				{
				sum = sum + 31;
				}
				if (2 >= m1 != 0 && 2 < m2)
				{
				sum = sum + 29;
				}
				if (3 >= m1 != 0 && 3 < m2)
				{
				sum = sum + 31;
				}
				if (4 >= m1 != 0 && 4 < m2)
				{
				sum = sum + 30;
				}
				if (5 >= m1 != 0 && 5 < m2)
				{
				sum = sum + 31;
				}
				if (6 >= m1 != 0 && 6 < m2)
				{
				sum = sum + 30;
				}
				if (7 >= m1 != 0 && 7 < m2)
				{
				sum = sum + 31;
				}
				if (8 >= m1 != 0 && 8 < m2)
				{
				sum = sum + 31;
				}
				if (9 >= m1 != 0 && 9 < m2)
				{
				sum = sum + 30;
				}
				if (10 >= m1 != 0 && 10 < m2)
				{
				sum = sum + 31;
				}
				if (11 >= m1 != 0 && 11 < m2)
				{
				sum = sum + 30;
				}
				if (12 >= m1 != 0 && 12 < m2)
				{
				sum = sum + 31;
				}
				if (sum % 7 == 0)
				{
				System.out.print("YES\n");
				}
				else
				{
				System.out.print("NO\n");
				}
			}
			else
			{
				if (1 >= m1 != 0 && 1 < m2)
				{
				sum = sum + 31;
				}
				if (2 >= m1 != 0 && 2 < m2)
				{
				sum = sum + 28;
				}
				if (3 >= m1 != 0 && 3 < m2)
				{
				sum = sum + 31;
				}
				if (4 >= m1 != 0 && 4 < m2)
				{
				sum = sum + 30;
				}
				if (5 >= m1 != 0 && 5 < m2)
				{
				sum = sum + 31;
				}
				if (6 >= m1 != 0 && 6 < m2)
				{
				sum = sum + 30;
				}
				if (7 >= m1 != 0 && 7 < m2)
				{
				sum = sum + 31;
				}
				if (8 >= m1 != 0 && 8 < m2)
				{
				sum = sum + 31;
				}
				if (9 >= m1 != 0 && 9 < m2)
				{
				sum = sum + 30;
				}
				if (10 >= m1 != 0 && 10 < m2)
				{
				sum = sum + 31;
				}
				if (11 >= m1 != 0 && 11 < m2)
				{
				sum = sum + 30;
				}
				if (12 >= m1 != 0 && 12 < m2)
				{
				sum = sum + 31;
				}
				if (sum % 7 == 0)
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

}

