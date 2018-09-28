package <missing>;

public class GlobalMembers
{
	public static void sort(int[] a, int n)
	{
		int i;
		int j;
		int k;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					k = a[j];
					a[j] = a[j + 1];
					a[j + 1] = k;
				}
			}
		}
	}
	public static int Main()
	{
	int i;
	int n;
	int j;
	int m;
	int[] sz = new int[500];
	int[] js = new int[500];
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
			sz[i] = Integer.parseInt(tempVar2);
		}
	}
	for (i = 0,j = 0;i < n;i++)
	{
		if (sz[i] % 2 != 0)
		{
		js[j] = sz[i];
		j++;
		}
	}
	for (i = n - 1;;i--)
	{
		if (sz[i] % 2 != 0)
		{
		m = sz[i];
		break;
		}
	}
	for (i = 0,j = 1;;i++)
	{
		if (js[i] != m)
		{
		j++;
		}
		else
		{
			break;
		}
	}
	sort(js, j);
	for (i = 0;i < j - 1;i++)
	{
		System.out.printf("%d,",js[i]);
	}
	System.out.printf("%d",js[j - 1]);
	return 0;
	}
}

