package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[xl];
	public static int[] b = new int[xl];
	public static int Main()
	{
		int N;
		int j;
		int r;
		int i;
		int k;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		sum = 0;
		for (i = 0;i < N;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		for (i = 0;i < N;i++)
		{
		if (a[i] % 2 != 0)
		{
		b[sum++] = a[i];
		}
		}
		for (j = 0;j < sum;j++)
		{
			for (r = 0;r < sum - j - 1;r++)
			{
				if (b[r] > b[r + 1])
				{
					int e;
					e = b[r + 1];
					b[r + 1] = b[r];
					b[r] = e;
				}
			}
		}
		for (r = 0;r < sum;r++)
		{
			if (r == sum - 1)
			{
			System.out.printf("%d",b[r]);
			}
			else
			{
			System.out.printf("%d,",b[r]);
			}
		}
		return 0;
	}


}

