package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int a;
		int b;
		int i;
		int k = 0;
		int l = 0;
		int p = 0;
		int[][] s = new int[8][8];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (a = 0;a < m;a++)
		{
			for (b = 0;b < n;b++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					s[a][b] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (a = 0;a < m;a++)
		{
			for (b = 0;b < n;b++)
			{
			k = 0;
			l = 0;
		for (i = 0;i < m;i++)
		{
			if (s[i][b] < s[a][b])
			{
				k = 1;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (s[a][i] > s[a][b])
			{
				l = 1;
			}
		}
		if (k == 0 && l == 0)
		{
			System.out.printf("%d+%d",a,b);
			p = 1;
		}
			}
		}
		if (p == 0)
		{
			System.out.print("No");
		}
		return 0;
	}


}

