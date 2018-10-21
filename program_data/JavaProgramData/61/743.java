package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int sum = 0;
	int a = 1;
	int b = 1;
	int[] d = new int[20];
	int[] c = new int[20];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			d[i] = Integer.parseInt(tempVar2);
		}
	if (d[i] > 2)
	{
	for (int j = 1;j < d[i] - 1;j++)
	{
		sum = a + b;
		a = b;
		b = sum;
	}
	}
	else
	{
		b = 1;
	}
	c[i] = b;
	b = 1;
	a = 1;
	}
	for (int k = 0;k < n;k++)
	{
		System.out.printf("%d\n",c[k]);
	}
	return 0;
	}
}

