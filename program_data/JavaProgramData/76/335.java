package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[10001];
		int[] b = new int[10001];
		int[] c = new int[10001];
		int i;
		int j;
		int max;
		int M;
		int m;
		int temp;
		int k;
		int s;
		int h = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j < n;j++)
		{
			for (i = n - 1;i > h - 1;i--)
			{
				if (a[i] < a[i - 1])
				{
					k = a[i - 1];
					a[i - 1] = a[i];
					a[i] = k;
					s = b[i - 1];
					b[i - 1] = b[i];
					b[i] = s;
				}
			}
			h++;
		}

		for (i = 1;i < n;i++)
		{
			if (b[i] < b[i - 1])
			{
				a[i] = a[i - 1];
				b[i] = b[i - 1];
			}
		}
		m = a[0];
		M = b[n - 1];

		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				max = b[i];
			}
			if (b[i] < a[i + 1] && b[i] >= max)
			{
				System.out.print("no");
				return 0;
			}
			if (i != n - 1 && b[i + 1] > max)
			{
				max = b[i + 1];
			}
		}
		System.out.printf("%d %d",m,M);
	}
}

