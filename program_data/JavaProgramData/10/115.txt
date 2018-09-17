package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int max;
		int[] a = new int[100];
		int[] b = new int[100];
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
		}
		for (i = 0;i < n;i++)
		{
			b[i] = 1;
		}
		for (i = n - 2;i >= 0;i--)
		{
			max = 0;
			for (j = n - 1;j > i;j--)
			{
				if (a[i] >= a[j])
				{
					if (b[j] > max)
					{
						max = b[j];
					}
				}
			}
			b[i] += max;
		}
		max = 0;
		for (i = 0;i < n;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		System.out.printf("%d",max);
	}
}

