package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][15];
		int i;
		int k;
		int n;
		int[] p = new int[100];
		int[] q = new int[100];
		int[] t = new int[100];
		for (n = 0;1;n++)
		{
			for (i = 0;i < 6;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[n][i] = Integer.parseInt(tempVar);
				}
			}
			k = 0;
			for (i = 0;i < 6;i++)
			{
				if (a[n][i] == 0)
				{
					k++;
				}
			}
			if (k == 6)
			{
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			p[i] = a[i][0] * 3600 + a[i][1] * 60 + a[i][2];
			q[i] = a[i][3] * 3600 + a[i][4] * 60 + a[i][5] + 12 * 3600;
			t[i] = q[i] - p[i];
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d\n",t[i]);
		}
		System.out.printf("%d",t[n - 1]);
		//scanf("%d",&n);
		return 0;
	}
}

