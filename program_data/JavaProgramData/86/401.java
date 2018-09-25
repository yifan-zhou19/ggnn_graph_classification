package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] a = new int[20];
		int c;
		int[] b = new int[20];
		int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			c = 0;
			for (j = 0; j < m; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Integer.parseInt(tempVar3);
				}
				if (a[j] + (3 * j) < 59)
				{
					c++;
					d = 0;
				}
				else if (a[j] + (3 * j) == 59)
				{
					d = 1;
				}
			}
			b[i] = 60 - (c * 3) - d;
		}
		for (i = 0; i < n; i++)
		{
			System.out.printf("%d\n", b[i]);
		}
		return 0;
	}
}

