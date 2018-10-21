package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int j;
		int k;
		int m;
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
		m = n;
		i = 0;
		while (i < m)
		{
			for (j = i + 1;j < m;j++)
			{
				if (a[i] == a[j])
				{
					for (k = j;k < n;k++)
					{
						a[k] = a[k + 1];
					}
					m = m - 1;
					j = j - 1;
				}
			}
			i = i + 1;
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < m;i++)
		{
		System.out.printf(",%d",a[i]);
		}
	}
}

