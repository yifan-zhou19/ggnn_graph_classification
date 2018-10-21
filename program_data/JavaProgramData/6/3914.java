package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] sum = new int[100];
		int[][] jz = new int[100][100];
		int h;
		int l;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			sum[i] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				l = Integer.parseInt(tempVar3);
			}
			for (j = 0;j < h;j++)
			{
				for (k = 0;k < l;k++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						jz[j][k] = Integer.parseInt(tempVar4);
					}
				}
			}
			for (p = 0;p < l - 1;p++)
			{
				sum[i] = sum[i] + jz[0][p];
			}
			for (q = 0;q < h - 1;q++)
			{
				sum[i] = sum[i] + jz[q][l - 1];
			}
			for (p = l - 1;p > 0;p--)
			{
				sum[i] = sum[i] + jz[h - 1][p];
			}
			for (q = h - 1;q > 0;q--)
			{
				sum[i] = sum[i] + jz[q][0];
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n", sum[i]);
		}
		return 0;
	}
}

