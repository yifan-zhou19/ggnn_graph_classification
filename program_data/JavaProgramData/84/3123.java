package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int[] a = new int[100];
	int max;
	int sm;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i <= n - 2;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[n - 1] = Integer.parseInt(tempVar3);
	}
	max = a[0];
	for (i = 0;i <= n - 1;i++)
	{
		if (a[i] > max)
		{
			max = a[i];
		}
	}
	System.out.printf("%d\n",max);
	sm = a[0];
	for (i = 0;i <= n - 1;i++)
	{
		if (a[i] != max && a[i] > sm)
		{
			sm = a[i];
		}
	}
	System.out.printf("%d",sm);
	}



}

