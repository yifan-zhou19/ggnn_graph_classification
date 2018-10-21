package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int e;
		int i;
		int c;
		int[] a = new int[500];
		int[] b = new int[500];
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
		c = 0;
		for (i = 0;i < n;i++)
		{
			b[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] % 2 != 0)
			{
				b[c] = a[i];
				c++;
			}
		}
		for (int o = 1 ; o <= c ; o++)
		{
			for (i = 0; i < c - o; i++)
			{
					if (b[i] < b[i + 1])
					{
							e = b[i + 1];
							b[i + 1] = b[i];
							b[i] = e;
					}
			}
		}
		i = c - 1;
		while (i >= 0)
		{
			if (i > 0)
			{
				System.out.printf("%d,",b[i]);
			}
			else
			{
				System.out.printf("%d",b[i]);
			}
			i--;
		}


	return 0;
	}
}

