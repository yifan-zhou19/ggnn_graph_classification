package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[10000];
		int i;
		int j;
		int k = 1;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[0] = 2;
		for (i = 3;i <= n;i++)
		{
			s = 0;
			for (j = 2;j <= (i - 1);j++)
			{
				if (i % j == 0)
				{
					s = s + 1;
				}
			}
			if (s == 0)
			{
				a[k] = i;
				k = k + 1;
			}
		}
		int[][] b = new int[10000][2];
		int t = 0;
		for (i = 0;i <= (k - 2);i++)
		{
			if (a[i] == (a[i + 1] - 2))
			{
				b[t][0] = a[i];
				b[t][1] = a[i + 1];
				t = t + 1;
			}
		}
		if (t == 0)
		{
			System.out.print("empty");
		}
		else
		{
			for (i = 0;i <= (t - 1);i++)
			{
				System.out.printf("%d %d\n",b[i][0],b[i][1]);
			}
		}
		return 0;
	}

}

