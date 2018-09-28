package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int y;
		int m1;
		int m2;
		int j;
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			int t = 0;
			int d1 = 1;
			int d2 = 1;
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
			if ((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0))
			{
				days[2] = 29;
			}
			else
			{
				days[2] = 28;
			}

			for (i = 0;i < m1;i++)
			{
				d1 = d1 + days[i];
			}
			for (i = 0;i < m2;i++)
			{
				d2 = d2 + days[i];
			}
			t = d2 - d1;
			if (t % 7 == 0)
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

