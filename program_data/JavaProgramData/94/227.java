package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	int n;
	int i;
	int m;
	int x;
	int y;
	int z;
	int c;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[n];
	int[] b = new int[n];
	x = 0;
	y = 0;
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		(a[i]) = Integer.parseInt(tempVar2);
	}
	}
	for (i = 0;i < n;i++)
	{
	for (m = 0;m < n;m++)
	{
	if (a[m] < a[i])
	{
	x = x + 1;
	}
	if (a[m] == a[i])
	{
	y = y + 1;
	}
	}
	for (z = x;z <= x + y - 1;z++)
	{
	b[z] = a[i];
	}
	x = 0;
	y = 0;
	}
	for (i = 0;i < n;i++)
	{
	if (b[i] % 2 != 0)
	{
	System.out.printf("%d",b[i]);
	c = i;
	break;
	}
	}
	for (i = c + 1;i < n;i++)
	{
	if (b[i] % 2 != 0)
	{
	System.out.printf(",%d",b[i]);
	}
	}
	return 0;
	}

}

