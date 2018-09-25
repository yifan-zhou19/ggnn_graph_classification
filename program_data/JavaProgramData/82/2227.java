package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[2][100];
		int n;
		int i;
		int max1;
		int max2;
		int m = 0;
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[0][i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[1][i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0; i < n; i++)
		{
			if (a[0][i] >= 90 && a[0][i] <= 140 && a[1][i] >= 60 && a[1][i] <= 90)
			{
				p++;
			}
			else
			{
				if (p > m)
				{
					m = p;
				}
				p = 0;
			}
		}
		if (p > m)
		{
			m = p;
		}
		System.out.printf("%d",m);

	}
}

