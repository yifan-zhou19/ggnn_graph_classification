package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
		int n;
		int i;
		int j;
		int b;
		int c = 0;
		int m;
		int d;
		int k;
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
				b = Integer.parseInt(tempVar2);
			}
			if (b % 2 != 0)
			{
				a[c] = b;
				c++;
			}

		}
		for (j = 0;j < (c - 1);j++)
		{
			for (m = 0;m < (c - 1 - j);m++)
			{
				if (a[m] > a[m + 1])
				{
					d = a[m];
					a[m] = a[m + 1];
					a[m + 1] = d;
				}
			}

		}
		for (k = 0;k < c;k++)
		{
			System.out.printf("%d",a[k]);
			if (k != (c - 1))
			{
				System.out.print(",");
			}
		}
		return 0;
	}

}

