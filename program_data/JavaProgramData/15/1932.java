package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[1000][1000];
		int j;
		int[] m = new int[100];
		int i;
		int[] k = new int[100];
		int[] p = new int[100];
		int[] b = new int[100];
		int s = 0;
		int g = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n;i++)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[j][i] = Integer.parseInt(tempVar2);
			}
			}
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n;i++)
			{
				if (a[j][i] == 0)
				{
					s += 1;
					m[s] = j;
					k[s] = i;
					break;
				}
			}
		}
		for (j = n - 1;j > 0;j--)
		{
			for (i = n - 1;i > 0;i--)
			{
				if (a[j][i] == 0)
				{
					g += 1;
					p[g] = j;
					b[g] = i;
					break;
				}
			}
		}
		System.out.printf("%d",(p[1] - m[1] - 1) * (b[1] - k[1] - 1));
	return 0;
	}
}

