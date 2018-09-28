package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		int j;
		int m;
		int d;
		int[] c = new int[100];
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
				m = Integer.parseInt(tempVar2);
			}
			a[i] = m;
		}
		if (n / 2 == 0)
		{
			d = n / 2;
		}
		else
		{
			d = (n + 1) / 2;
		}
			for (j = 0;j < d;j++)
			{
				c[j] = a[n - 1 - j];
				System.out.printf("%d ",c[j]);
			}
				for (j = d;j < n;j++)
				{
				c[j] = a[n - 1 - j];
				if (j == (n - 1))
				{
						System.out.printf("%d",c[j]);
				}
				else
				{
		System.out.printf("%d ",c[j]);
				}
				}
	return 0;
	}


}

