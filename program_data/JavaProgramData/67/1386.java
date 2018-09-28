package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[N];
	int[] b = new int[N];
	int i;
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(a[i]) = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			(b[i]) = Integer.parseInt(tempVar3);
		}
	}
	double c;
	c = b[0] * 1.0 / a[0];

	for (i = 1;i < n;i++)
	{
	if ((b[i] * 1.0 / a[i] - c) * 100 > 5)
	{
		System.out.print("better\n");
	}
	else if ((b[i] * 1.0 / a[i] - c) * 100 < -5)
	{
		System.out.print("worse\n");
	}
	else
	{
		System.out.print("same\n");
	}
	}
		return 0;
	}
}

