package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] y = new int[200];
		int[] m = new int[200];
		int[] d = new int[200];
		int i;
		int[] c = new int[200];
		int[] e = new int[200];
		int n;
		int j;
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
				y[j] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m[j] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				d[j] = Integer.parseInt(tempVar4);
			}

		if (((y[j] % 4 == 0) && (y[j] % 100 != 0)) || (y[j] % 400 == 0))
		{
			days[2]++;
		}
		c[j] = 0;
		e[j] = 0;
		for (i = 0;i < m[j];i++)
		{
			c[j] += days[i];
		}
		for (i = 0;i < d[j];i++)
		{
			e[j] += days[i];
		}
		if ((c[j] - e[j]) % 7 == 0)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
		days[2] = 28;
		}
		return 0;
	}
}

