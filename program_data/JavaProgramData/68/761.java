package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int j1;
		int k1;
		int k;
		int m;
		int flagj = 1;
		int flagk = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i += 2)
		{
			for (j = 3;j <= i / 2;j += 2)
			{
				flagj = 1;
				flagk = 1;
				k = i - j;
				j1 = Math.sqrt(j);
				k1 = Math.sqrt(k);
				for (m = 2;m <= j1;m++)
				{
					if (j % m == 0)
					{
						flagj = 0;
						break;
					}
				}
				for (m = 2;m <= k1;m++)
				{
					if (k % m == 0)
					{
						flagk = 0;
						break;
					}
				}
				if (flagj != 0 && flagk != 0)
				{
					System.out.printf("%d=%d+%d\n",i,j,k);
					break;
				}
			}
		}
	}
}

