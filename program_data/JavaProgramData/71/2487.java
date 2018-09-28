package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int y;
		int m1;
		int m2;
		int i;
		int j;

		for (i = 0;i < n;i++)
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
			int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			int c1 = 0;
			int c2 = 0;
			if ((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0))
			{
				days[2] = days[2] + 1;
			}
			for (j = 1;j < m1;j++)
			{
				c1 = c1 + days[j];
			}
			for (j = 1;j < m2;j++)
			{
				c2 = c2 + days[j];
			}
			if (c1 > c2)
			{
				if ((c1 - c2) % 7 == 0)
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
				if ((c2 - c1) % 7 == 0)
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

