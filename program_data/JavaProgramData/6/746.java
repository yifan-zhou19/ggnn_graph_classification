package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int l;
		int[] m = new int[100];
		int[] n = new int[100];
		int[] sum = new int[100];
		int[][][] a = new int[100][100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}

			for (j = 0;j < m[i];j++)
			{
				for (l = 0;l < n[i];l++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[j][l][i] = Integer.parseInt(tempVar4);
					}
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			for (l = 0;l < n[i] - 1;l++)
			{
				sum[i] += a[0][l][i];
			}
			for (j = 0;j < m[i] - 1;j++)
			{
				sum[i] += a[j][n[i] - 1][i];
			}
			for (l = n[i] - 1;l > 0;l--)
			{
				sum[i] += a[m[i] - 1][l][i];
			}
			for (j = m[i] - 1;j > 0;j--)
			{
				sum[i] += a[j][0][i];
			}
			System.out.printf("%d\n",sum[i]);
		}
		return 0;
	}
}

