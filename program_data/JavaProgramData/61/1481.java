package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int c;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] g = new int[1000];
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
		b[1] = 1;
		for (i = 2;i < 1000;i++)
		{
			b[i] = b[i - 1] + b[i - 2];
		}
		for (i = 0;i < n;i++)
		{
			c = a[i] - 1;
			g[i] = b[c];
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",g[i]);
		}
		return 0;
	}
}

