package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int[] p = new int[A];
		int i;
		int j;

	 p[0] = p[1] = 1;
		for (i = 2;i <= m;i++)
		{
			if (p[i] == 0)
			{
				for (j = 2;j <= m / i;j++)
				{
					p[i * j] = 1;
				}
			}
		} //??????

		int k;
		for (k = 3;k <= m / 2;k += 2)
		{
		if (p[k] + p[m - k] == 0)
		{
				System.out.printf("%d %d\n",k,m - k);
		}
		}


		return 0;
	}

}

