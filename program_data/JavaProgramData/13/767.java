package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int m;
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
		for (i = 0;i < n;i++)
		{
			if (a[i] != 0)
			{
			for (j = 0;j < n;j++)
			{
				if (a[i] == a[j])
				{
					if (i != j && a[j] != 0)
					{
						a[j] = 0;
					}
				}
			}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] != 0)
			{
				b[k] = a[i];
				k++;
			}
		}
		m = k;
		for (k = 0;k < m - 1;k++)
		{
		System.out.printf("%d ",b[k]);
		}
		System.out.printf("%d",b[k]);
	}
}

