package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[20000];
	int n;
	int i;
	int j;
	int p;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	p = 0;
	for (j = 1;j < i;j++)
	{
	if (a[j] == a[i])
	{
	p = 1;
	}
	}
	if (p == 0 & i == 1)
	{
	System.out.printf("%d",a[i]);
	}
	if (p == 0 & i != 1)
	{
	System.out.printf(" %d",a[i]);
	}
	}
	return 0;
	}

}

