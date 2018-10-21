package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int k;
	int max = 0;
	int min = 10000;
	int sum = 0;
	int[] a = new int[10000];
	int[] b = new int[10000];
	int[] c = new int[10000];
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
	}
	for (i = 0;i < n;i++)
	{
		if (a[i] < min)
		{
			min = a[i];
		}
		if (b[i] > max)
		{
			max = b[i];
		}
	}
	for (i = 2 * min - 1;i < 2 * max;i++)
	{
	c[i] = 1;
	}
	for (i = 0;i < n;i++)
	{
		for (k = 2 * a[i] - 1;k < 2 * b[i];k++)
		{
			c[k] = 0;
		}
	}
	for (i = 2 * min - 1;i < 2 * max;i++)
	{
		if (c[i] == 1)
		{
			System.out.print("no");
			return 0;
		}
	}

	System.out.printf("%d %d",min,max);
		return 0;
	}



}

