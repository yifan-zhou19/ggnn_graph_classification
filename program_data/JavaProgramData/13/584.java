package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int m = 1;
		int k = 1;
		int[] a = new int[20000];
		int[] b = new int[20000];
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
		b[0] = a[0];

		for (i = 1;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
				k = 0;
				}
			}
				if (k == 1)
				{
					b[m] = a[i];
					m++;
				}
				k = 1;
		}

		for (j = 0;j < m - 1;j++)
		{
		System.out.printf("%d ",b[j]);
		}
		System.out.printf("%d",b[j]);
	}

}

