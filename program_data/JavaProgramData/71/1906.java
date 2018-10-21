package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int j;
		int x;
		int y;
		int[] a = new int[200];
		int[] b = new int[200];
		int[] c = new int[200];
		int[] d = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] e = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			m = 0;
			if ((a[i] % 4 == 0) && (a[i] % 100 != 0) || (a[i] % 400 == 0))
			{
				if (b[i] >= c[i])
				{
					x = c[i];
					y = b[i];
				}
				else
				{
					y = c[i];
					x = b[i];
				}
				for (j = x;j < y;j++)
				{
					m = m + e[j - 1];
				}
				if (m % 7 == 0)
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
				if (b[i] >= c[i])
				{
					x = c[i];
					y = b[i];
				}
				else
				{
					y = c[i];
					x = b[i];
				}
				for (j = x;j < y;j++)
				{
					m = m + d[j - 1];
				}
				if (m % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
			}
		}
		return 0;
	}
}

