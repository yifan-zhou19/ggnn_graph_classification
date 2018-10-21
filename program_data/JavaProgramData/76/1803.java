package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[50000];
	int[] b = new int[50000];
	int n;
	int i;
	int s;
	int v = 0;
	int z;
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
	for (z = 0;z < n;z++)
	{
		for (i = 0;i < n - 1;i++)
		{
	if (a[i] > a[i + 1])
	{
	 s = a[i];
	a[i] = a[i + 1];
	a[i + 1] = s;
	s = b[i];
	b[i] = b[i + 1];
	b[i + 1] = s;
	}
		}
	}
	for (i = 0;i < n - 1;i++)
	{
	if (b[i + 1] < b[i])
	{
		a[i + 1] = a[i];
		b[i + 1] = b[i];
	}
	}
	for (i = 0;i < n - 1;i++)
	{
		if (a[i + 1] > b[i])
		{
			v += 1;
		}
	}
	if (v == 0)
	{
	System.out.printf("%d %d",a[0],b[n - 1]);
	}
	if (v > 0)
	{
	System.out.print("no");
	}
	return 0;
	}

}

