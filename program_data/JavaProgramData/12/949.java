package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] a = new int[16];
		int m = 0;
		int n = 0;
		int b;
		int[] c = new int[200];
		int x = 0;
		int y = 0;
		for (i = 0;i < 200;i++)
		{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		c[i] = Integer.parseInt(tempVar);
	}
	x = x + 1;
	if (c[i] < 0)
	{
	i = 300;
	}
		}
		for (i = 0;i < 16;i++,y++)
		{
	a[i] = c[y];

	if (a[i] > 0)
	{
	for (b = 0;b < i;b++)
	{
	if (a[i] == 2 * a[b] || a[b] == 2 * a[i])
	{
	m = m + 1;
	}
	}
	}


	else if (a[i] == 0)
	{
		i = -1;
	System.out.printf("%d\n",m);
	m = 0;
	}


	else
	{
	i = 100;
	}
		}
		return 0;
	}
}

