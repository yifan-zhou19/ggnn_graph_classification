package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[30];
		int[] b = new int[30];
		int max = 1;
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
				a[i - 1] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= n;i++)
		{
			b[i - 1] = 1;
		}
		for (i = 2;i <= n;i++)
		{
			for (j = 1;j <= i - 1;j++)
			{
				if (a[n - i] >= a[n - i + j] != 0 && b[n - i] <= b[n - i + j])
				{
					b[n - i] = 1 + b[n - i + j];
				}
			}
		}

		for (i = 1;i <= n;i++)
		{
			if (b[i - 1] > max)
			{
			max = b[i - 1];
			}
		}
		System.out.printf("%d",max);
	}
}

