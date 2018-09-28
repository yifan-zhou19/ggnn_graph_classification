package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k;
	int max;
	int min;
	int z;
	int t;
	double d;
	z = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[n];
	int[] b = new int[n];
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
	}
	min = a[0];
	max = b[0];
	for (i = 1;i < n;i++)
	{
		if (a[i] < min)
		{
			min = a[i];
		}
		if (max < b[i])
		{
			max = b[i];
		}
	}
	int[] sz = new int[10000];
	for (i = min;i <= 2 * max - min;i++)
	{
		sz[i] = 0;
	}
	for (d = min;d <= max;d = d + 0.5)
	{
		k = 0;
		for (j = 0;j < n;j++)
		{
			if (d <= b[j] != 0 && d >= a[j])
			{
				k++;
			}
		}
		if (k != 0)
		{
			t = min + 2 * (d - min);
		sz[t] = 1;
		}
	}
	for (i = min;i <= 2 * max - min;i++)
	{
		if (sz[i] == 0)
		{
			z++;
		}
	}
	if (z == 0)
	{
		System.out.printf("%d %d",min,max);
	}
	else
	{
		System.out.print("no");
	}
	return 0;
	}


}

