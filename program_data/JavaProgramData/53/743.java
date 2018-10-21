package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int[] b = new int[300];
		int n;
		int j;
		int i;
		int k;
		int m = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[j] = Integer.parseInt(tempVar2);
			}
		}
		b[0] = a[0];
		for (j = 1;j < n;j++)
		{
			for (k = 0;k < j;k++)
			{
				if (a[j] == b[k])
				{
					break;
				}
				else
				{
					continue;
				}
			}
				if (k == j)
				{
					b[m] = a[j];
					m++;
				}
		}
		for (i = 0;i < m - 1;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[m - 1]);
	}

}

