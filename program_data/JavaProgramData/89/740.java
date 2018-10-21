package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[][] a = new int[10000][2];
		int i;
		int j;
		int c;
		int[] d = new int[10000];
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;1;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
			if (a[i][0] == 0 && a[i][1] == 0)
			{
				m = i;
				break;
			}
		}
		for (i = 0;i < m;i++)
		{
			d[a[i][1]]++;
		}
		for (i = 0;i < m;i++)
		{
			if (d[i] >= (n - 1))
			{
				c = i;
				b = 1;
			}
		}
		for (i = 0;i < m;i++)
		{
			if (a[i][0] == c && a[i][1] != c)
			{
				b = 0;
			}

		}
		if (b == 0)
		{
			System.out.print("NOT FOUND");
		}
		if (b == 1)
		{
			System.out.printf("%d",c);
		}



	return 0;
	}
}

