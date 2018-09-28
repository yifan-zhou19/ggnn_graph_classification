package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int[] a = new int[100];
	int[] b = new int[100];
	int[] c = new int[100];
	int n;
	int e;
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
	c[i] = 0;
	}
	j = 0;
	for (i = 0;i < n;i++)
	{
	if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
	{
		c[j]++;
	}
	if (!(a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90))
	{
		j++;
	}
	}
	for (i = 0;i < n - 1;i++)
	{
		if (c[i] > c[i + 1])
		{
	e = c[i];
	c[i] = c[i + 1];
	c[i + 1] = e;
		}
	}
	System.out.printf("%d",c[n - 1]);
	return 0;
	}
}

