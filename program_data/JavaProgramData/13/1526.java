package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int j;
	int k;
	int m = 1;
	int x;
	int[] a = new int[1000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if (n == 0)
	{
		return 0;
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		x = Integer.parseInt(tempVar2);
	}
	System.out.printf("%d",x);
	a[0] = x;
	for (j = 1; j < n; j++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		x = Integer.parseInt(tempVar3);
	}
	k = 0;
	while ((k < m) && (a[k] != x))
	{
	k++;
	}
	if (k == m)
	{
		a[m++] = x;
	System.out.printf(" %d",x);
	}
	}
	return 0;
	}
}

