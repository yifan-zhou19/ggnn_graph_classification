package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int[] sum = new int[100];
		int p;
		int q;
		int t;
		int l;
		int[] m = new int[100];
		int[] n = new int[100];
		int h;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			sum[i] = 0;
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
				for (h = 0;h < n[i];h++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[j][h] = Integer.parseInt(tempVar4);
					}
				}
			}
				for (p = 0;p < n[i];p++)
				{
					sum[i] = sum[i] + a[0][p];
				}
				for (q = 1;q < m[i];q++)
				{
					sum[i] = sum[i] + a[q][n[i] - 1];
				}
				for (l = n[i] - 2;l >= 0;l--)
				{
					sum[i] = sum[i] + a[m[i] - 1][l];
				}
				for (t = m[i] - 2;t > 0;t--)
				{
					sum[i] = sum[i] + a[t][0];
				}
			   System.out.printf("%d\n",sum[i]);
		}
		return 0;
	}




}

