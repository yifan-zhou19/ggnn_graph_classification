package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[] a = new int[25];
		int[] b = new int[25];
		int c;
		int n;
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
		b[0] = 1;
		for (i = 1;i < n;i++)
		{
			b[i] = 1;
			for (j = 0;j < i;j++)
			{
				if (((b[j] + 1) > b[i]) && (a[j] >= a[i]))
				{
					b[i] = b[j] + 1;
				}
			}
		}
		c = 0;
		for (i = 0;i < n;i++)
		{
			if (b[i] > c)
			{
				c = b[i];
			}
		}
		System.out.printf("%d\n",c);
	}
}

