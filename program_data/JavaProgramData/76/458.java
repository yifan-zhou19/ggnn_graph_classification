package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int min;
	int max;
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
			(a[i]) = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			(b[i]) = Integer.parseInt(tempVar3);
		}
	}
	min = a[0];
	max = b[0];
	for (i = 0;i < n;i++)
	{
		if (a[i] < min)
		{
			min = a[i];
		}
	}
	for (i = 0;i < n;i++)
	{
		if (b[i] > max)
		{
			max = b[i];
		}
	}
	double h;
	int k = 0;
	for (h = min;h <= max;h = h + 0.5)
	{
		for (i = 0;i < n;i++)
		{
			if (h <= b[i] != 0 && h >= a[i])
			{
				k = 1;
			}
		}
			if (k == 0)
			{
				System.out.print("no");
							break;
			}
			if (h == max)
			{
				System.out.printf("%d %d",min,max);
			}
			k = 0;
	}
		return 0;
	}
}

