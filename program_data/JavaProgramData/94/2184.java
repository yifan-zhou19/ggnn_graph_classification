package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int[] a = new int[600];
		int[] b = new int[600];
		int i;
		int j = 1;
		int c = 1;
		int t;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= N;i++)
		{
			if (a[i] % 2 != 0)
			{
				b[j] = a[i];
				j = j + 1;
				c = c + 1;
			}
		}
		for (j = 1;j < c;j++)
		{
			for (t = 1;t < c - j;t++)
			{
				if (b[t] > b[t + 1])
				{
				d = b[t];
				b[t] = b[t + 1];
				b[t + 1] = d;
				}
			}
		}
		System.out.printf("%d",b[1]);
		for (t = 2;t < c;t++)
		{
			System.out.printf(",%d",b[t]);
		}

		return 0;
	}
}

