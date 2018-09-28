package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int j;
		int k;
		int m;
		int g;
		int f;
		int n = 0;
		int h = 0;
		int[] a = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (k = 1;k < N;k++)
		{
			for (j = 0;j <= N - k;j++)
			{
				if (a[j + 1] < a[j])
				{
					m = a[j + 1];
					a[j + 1] = a[j];
					a[j] = m;
				}
			}
		}
		for (g = 0;g < N;g++)
		{
			if (a[g] % 2 != 0)
			{
				n++;
			}
		}
		for (f = 0;f < N;f++)
		{
			if (a[f] % 2 != 0)
			{
				h++;
				if (h < n)
				{
					System.out.printf("%d,",a[f]);
				}
				if (h == n)
				{
					System.out.printf("%d",a[f]);
				}
			}
		}
		return 0;
	}


}

