package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] p = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int[] r = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		for (i = 0;i < n;i++)
		{
			int y;
			int m1;
			int m2;
			int d = 0;
			int j;
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
				int t = m1;
				m1 = m2;
				m2 = t;
			}
			if ((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0)))
			{
				for (j = m1;j < m2;j++)
				{
					d = d + r[j];
				}
			}
			else
			{
				for (j = m1;j < m2;j++)
				{
					d = d + p[j];
				}
			}
			if (d % 7 == 0)
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

