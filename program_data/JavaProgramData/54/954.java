package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int j;
	int l;
	int k;
	int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	for (j = 2;l != n;j++)
	{
	m = j;
	for (l = 0;l < n;l++)
	{
	if (m % (n - 1) == 0)
	{
		m = m * n / (n - 1) + k;
	continue;
	}
	break;
	}
	}
	System.out.printf("%d",m);
	}
}

