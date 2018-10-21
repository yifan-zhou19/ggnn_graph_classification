package <missing>;

public class GlobalMembers
{
	public static int ysf(int n,int m)
	{
		int i;
		int s = n;
		int h = 0;
	int[] a = new int[n + 1];
	for (i = 0;i <= n;i++)
	{
		a[i] = 1;
	}
	for (i = 1;s > 1;i++)
	{
		i = i % n;
	if (a[i] == 0)
	{
		continue;
	}
	else
	{
		h++;
	}
	if (h == m)
	{
		s--;
		a[i] = 0;
		h = 0;
	}
	}
	for (i = 1;i <= n;i++)
	{
	if (a[i] == 1)
	{
		return i;
	}
	}
	}
	public static int Main()
	{
		int a0;
		int b;
		int c;
	while (true)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a0 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
	if (a0 == 0 && b == 0)
	{
		break;
	}
	c = ysf(a0, b);
	System.out.printf("%d\n",c);
	}
	return 0;
	}
}

