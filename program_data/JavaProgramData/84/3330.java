package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int i;
	int t;
	int[] a = new int[100];
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
	}
	for (i = 0;i < n;i++)
	{
	for (t = i + 1;t < n;t++)
	{
	if (a[i] < a[t])
	{
	m = a[i];
	a[i] = a[t];
	a[t] = m;
	}
	}
	}
	System.out.printf("%d\n",a[0]);
	System.out.printf("%d\n",a[1]);
	return 0;
	}

}

