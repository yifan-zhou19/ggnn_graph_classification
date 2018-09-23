package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int[] shu = new int[300];
	int he = 0;
	int j;
	double a;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0; i < n; i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		shu[i] = Integer.parseInt(tempVar2);
	}
	he = he + shu[i];
	}
	a = (double)he / n;
	for (i = 0;i < n;i++)
	{
		for (j = n - 1;j >= 1;j--)
		{
		int t;
	if (shu[j - 1] > shu[j])
	{
	t = shu[j - 1];
	shu[j - 1] = shu[j];
	shu[j] = t;
	}
		}
	}
	if ((a - shu[0]) > (shu[n - 1] - a))
	{
	System.out.printf("%d", shu[0]);
	}
	else if ((a - shu[0]) < (shu[n - 1] - a))
	{
	System.out.printf("%d", shu[n - 1]);
	}
	else if ((a - shu[0]) == (shu[n - 1] - a) && shu[0] != shu[n - 1])
	{
	System.out.printf("%d,%d", shu[0], shu[n - 1]);
	}
	return 0;
	}


}

