package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int num;
	int k;
	int max = -1;
	int min = 100000;
	int sum = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (k = 0; k < n; ++k)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num = Integer.parseInt(tempVar2);
		}
	sum = sum + num;
	if (num > max)
	{
		max = num;
	}
	if (num < min)
	{
		min = num;
	}
	}
	if ((max * n - sum) == (sum - min * n))
	{
		System.out.printf("%d,%d",min,max);
	}
	else if ((max * n - sum) > (sum - min * n))
	{
		System.out.printf("%d", max);
	}
	else
	{
		System.out.printf("%d",min);
	}
	}

}

