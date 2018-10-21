package <missing>;

public class GlobalMembers
{
	public static int[] b = new int[10000];

	public static int Main()
	{
		int n = 1;
		int i;
		int j;
		int k;
		int[] a = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[1] = Integer.parseInt(tempVar);
		}
		do
		{
			++n;
		}while (scanf(",%d", a[n]));
		for (i = 1;i < n;++i)
		{
			b[a[i]]++;
		}
		k = 0;
		for (b[j = 9999];j >= 1;--j)
		{
			if (b[j] > 0)
			{
				k = k + 1;
			}
			if (k == 2)
			{
				System.out.printf("%d\n",j);
				break;
			}
		}
		if (j == 0)
		{
			System.out.print("No\n");
		}
		return (0);
	}
}

