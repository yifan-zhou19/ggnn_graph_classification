package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[501];
		int[] b = new int[501];
		int i;
		int j = 1;
		int t;
		int n;
		int p;
		int m = 1;
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
			if (a[i] % 2 == 1)
			{
				b[j] = a[i];
				j++;
				m++;
			}
		}
		for (p = 1;p < m - 1;p++)
		{
			for (j = 1;j < m - p;j++)
			{
				if (b[j] > b[j + 1])
				{
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
				}
			}
		}
		System.out.printf("%d",b[1]);
		for (j = 2;j <= m - 1;j++)
		{
			System.out.printf(",%d",b[j]);
		}
		return 0;
	}

}

