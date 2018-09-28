package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		w = 0;
		int[] a = new int[32767];
		for (i = 3;i <= n - 1;i = i + 2)
		{
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					w++;
				}
			}
			if (w == 0)
			{
				a[i] = i;
			}
			w = 0;
		}
		for (i = 3;i <= n - 1;i = i + 2)
		{
			for (j = i;j <= n - 1;j = j + 2)
			{
				if (a[i] + a[j] == n)
				{
					System.out.printf("%d %d\n",a[i],a[j]);
				}
			}
		}
		return 0;
	}
}

