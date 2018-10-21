package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int m = 0;
		int[] a = new int[25];
		int[] b = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0};
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
		b[n - 1] = 1;
		for (i = n - 2;i >= 0;i--)
		{
			for (j = i + 1;j < n;j++)
			{
				if ((a[i] >= a[j]) && (b[i] <= b[j]))
				{
					b[i] = b[j] + 1;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] >= m)
			{
				m = b[i];
			}
		}
		System.out.printf("%d\n",m);
	}
}

