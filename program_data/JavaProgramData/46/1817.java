package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] ab = new int[100][100];
		int i;
		int s;
		int k = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				m = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < m;i++)
			{
				for (s = 0;s < n;s++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						ab[i][s] = Integer.parseInt(tempVar3);
					}
				}
			}
			for (i = 0;k < m * n;i++)
			{
				for (s = i;s < n - i && k < m * n;s++)
				{
					System.out.printf("%d\n",ab[0 + i][s]);
					k++;
				}
				for (s = 1 + i;s < m - i && k < m * n;s++)
				{
					System.out.printf("%d\n",ab[s][n - 1 - i]);
					k++;
				}
					for (s = n - 2 - i;s >= 0 + i && k < m * n;s = s - 1)
					{
						System.out.printf("%d\n",ab[m - 1 - i][s]);
						  k++;
					}
						  for (s = m - 2 - i;s >= i + 1 && k < m * n;s = s - 1)
						  {
							  System.out.printf("%d\n",ab[s][i]);
							  k++;
						  }
			}
		return 0;
	}

}

