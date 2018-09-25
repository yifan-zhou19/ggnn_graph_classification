package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int m;
		int t;
		int[][] a = new int[300][2];
		int s;
		for (;;)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if (n == 0)
		{
			break;
		}
		for (i = 0;i < n;i++)
		{
			a[i][0] = i;
		}
		for (t = n,s = 0;t > 1;t--,s = s == 0)
		{
			for (i = m % t,j = 0;j < t - 1;i++,j++)
			{
				a[j][s == 0] = a[i % t][s];
			}
		}
		System.out.printf("%d\n",a[0][s] + 1);
		}
	}
}

