package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k;
		int[] a = new int[400];
		int[] b = new int[400];
		int[] c = new int[400];
		for (i = 0;i < 400;i++)
		{
			a[i] = 0;
			b[i] = 0;
			c[i] = 0;
		}
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
			b[i] = 1;
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] != 0)
			{
				c[j] = a[i];
				for (k = i;k < n;k++)
				{
					if (a[k] == c[j])
					{
						b[k] = 0;
					}
				}
				j = j + 1;
			}
		}
		if (j > 1)
		{
			for (i = 0;i < j - 1;i++)
			{
				System.out.printf("%d,",c[i]);
			}
		}
		System.out.printf("%d",c[j - 1]);
		return 0;
	}
}

