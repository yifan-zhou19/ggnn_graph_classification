package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		int n;
		int[][] a = new int[100][101];
		int[] b = new int[100];
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				b[j] = 60;
				continue;
			}
			for (i = 0;i < m;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j][i] = Integer.parseInt(tempVar3);
				}
			}
			if (a[j][0] > 60)
			{
				b[j] = 60;
				continue;
			}
			for (i = 0;i < m;i++)
			{
				a[j][i] += (i + 1) * 3;
			}
			i--;
			for (k = 0;a[j][i] > 63;i--,k++)
			{
				;
			}
			if (a[j][i] < 64 && a[j][i]>60)
			{
				b[j] = a[j][i] - (i + 1) * 3;
			}
			else
			{
				b[j] = 60 - 3 * (m - k);
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
		return 0;
	}

}

