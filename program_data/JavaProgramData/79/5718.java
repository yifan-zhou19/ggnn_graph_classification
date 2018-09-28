package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int a;
		int i;
		int j;
		int k;
		int c = 0;
		int[] d = new int[9999];
		int z;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0 && n == 0)
			{
				break;
			}
			a = -1;
			int[] b = new int[300];
			for (i = 1;i <= n - 1;i++)
			{
				for (k = 1;k <= m;k++)
				{
					a = a + 1;
					if (a >= n)
					{
						a = a - n;
					}
					while (b[a] != 0)
					{
						a = a + 1;
						if (a >= n)
						{
							a = a - n;
						}
					}
				}
				b[a] = 1;
			}
			for (j = 0;j <= n - 1;j++)
			{
				if (b[j] == 0)
				{
					break;
				}
			}
			d[c] = j + 1;
			c = c + 1;
		}
		for (z = 0;z <= c - 1;z++)
		{
			System.out.printf("%d\n",d[z]);
		}
	}

}

