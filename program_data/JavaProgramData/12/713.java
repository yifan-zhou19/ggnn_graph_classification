package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[16];
	int n;
	int j;
	int k;
	int p;
	int m;
	do
	{
	a[0] = -1;
	for (j = 0,n = 0;;j++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[j] = Integer.parseInt(tempVar);
		}
	if (a[0] == -1)
	{
		break;
	}
	if (a[j] == 0)
	{
		break;
	}
	n++;
	}
	m = 0;
	for (k = 0;k <= n - 1;k++)
	{
	for (p = k + 1;p <= n;p++)
	{
	if (a[p] == (a[k] * 2) || a[k] == (a[p] * 2))
	{
	m++;
	}

	}
	}
	if (a[0] == -1)
	{
	break;
	}
	System.out.printf("%d\n",m);


	}while (a[0] != -1);
	return 0;
	}
}

