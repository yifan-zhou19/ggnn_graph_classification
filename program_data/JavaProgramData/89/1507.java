package <missing>;

public class GlobalMembers
{
	public static void work(int m)
	{
		int[] a = new int[m];
		int[] b = new int[m];
		int i;
		int j;
		int k;
		int man;
		int hear;
		int l;
		l = 0;
		for (i = 0;i <= m - 1;i++)
		{ //chushihua
			a[i] = 1;
			b[i] = 0;
		}
		for (j = 1;j <= m * m;j++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				man = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				hear = Integer.parseInt(tempVar2);
			}
			if (man == hear)
			{
				break;
			}
			a[man] = 0;
			b[hear] = b[hear] + 1;
		}
		for (k = 0;k <= m - 1;k++)
		{
			if (a[k] == 1)
			{
				if (b[k] == m - 1)
				{
					System.out.printf("%d",k);
					l = 1;
					break;
				}

			}
		}
		if (l == 0)
		{
			System.out.print("NOT FOUND");
		}

	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		work(n);
		return 0;
	}
}

