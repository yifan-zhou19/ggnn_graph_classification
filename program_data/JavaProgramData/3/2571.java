package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int m;
	int[] a = new int[1000];
	int[] b = new int[1000];
	int[] d = new int[1000];
	int c = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < n;i++)
	{
		b[i] = a[i];
	}
	for (int t = 0;t < n;t++)
	{
		for (i = 0;i < n;i++)
		{
		if (t != i)
		{
		d[t] = a[t] + b[i];
		}
		if (d[t] == m)
		{
		c = c + 1;
		}
		}
	}
	if (c == 0)
	{
	System.out.print("no");
	}
	else
	{
	System.out.print("yes");
	}
	return 0;
	}
}

