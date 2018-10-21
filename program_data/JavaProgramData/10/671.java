package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[] b = new int[25];
		int[] a = new int[25];
		int c;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i < k;i++)
		{
			a[0] = 1;
			c = 1;
			for (j = 0;j < i;j++)
			{
				if (b[i] < b[j])
				{
					if (a[j] > c)
					{
						c = a[j];
					}
				}
			}
			a[i] = c + 1;
		}
		c = 0;
		for (i = 0;i < k;i++)
		{
			if (a[i] > c)
			{
				c = a[i];
			}
		}
		System.out.printf("%d",c);
		return 0;
	}

}

