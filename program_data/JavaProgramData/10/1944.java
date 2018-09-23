package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[28];
		int[][] b = new int[28][28];
		int i;
		int j;
		int l;
		int t;
		int z = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		for (l = 1;l <= n;l++)
		{
			b[l][l] = 1;
			for (i = l;i <= n;i++)
			{
				z = 0;
				for (j = i - 1;j > l - 1;j--)
				{
				if (a[j] >= a[i] != 0 && b[l][j] >= b[l][i])
				{
					b[l][i] = b[l][j] + 1;
					z = 1;
				}
				}
				if (z == 0)
				{
				b[l][i] = 1;
				}
			}
		}
		t = b[1][1];
		for (i = 1;i <= n;i++)
		{
		for (j = 1;j <= n;j++)
		{
					if (b[i][j] > t)
					{
						t = b[i][j];
					}
		}
		}
		System.out.printf("%d",t);
	}
}

