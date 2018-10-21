package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int i;
	int j;
	int p;
	int q;
	int min;
	int max;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] sz = new int[10000];
	int[] a = new int[100];
	int[] b = new int[100];
	for (i = 0;i <= 10000;i++)
	{
		sz[i] = 0;
	}
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(a[i]) = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			(b[i]) = Integer.parseInt(tempVar3);
		}
	for (k = 2 * a[i];k <= 2 * b[i];k++)
	{
		sz[k] = 1;
	}
	}
	for (i = 1;i <= n;i++)
	{
	for (j = 0;j < n - 1;j++)
	{
		if (a[j + 1] < a[j])
		{
			p = a[j + 1];
			a[j + 1] = a[j];
			a[j] = p;
		}
	}
	}
	min = a[0];
	for (i = 1;i <= n;i++)
	{
	for (j = 0;j < n - 1;j++)
	{
		if (b[j + 1] > b[j])
		{
			q = b[j + 1];
			b[j + 1] = b[j];
			b[j] = q;
		}
	}
	}
	max = b[0];
	for (i = 2 * a[0];i <= 2 * b[0];i++)
	{
		if (sz[i] != 1)
		{
			System.out.print("no");
			return 0;
		}
	}
	System.out.printf("%d %d",min,max);
	return 0;
	}

}

