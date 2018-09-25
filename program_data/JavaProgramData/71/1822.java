package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int n;
		int y;
		int m1;
		int m2;
		int i;
		int c1;
		int c2;
		int j;
		int k;
		int cha;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			days[2] = 28;
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

			if ((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0))
			{
				days[2]++;
			}

			c1 = 0;
			c2 = 0;

			for (j = 1;j < m1;j++)
			{
				c1 = c1 + days[j];
			}

			for (k = 1;k < m2;k++)
			{
				c2 = c2 + days[k];
			}

			cha = c1 - c2;
			if (cha % 7 == 0)
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

