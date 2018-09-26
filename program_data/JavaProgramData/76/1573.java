package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[50000];
	int[] b = new int[50000];
	int[] c = new int[10001];
	int i;
	int n;
	for (i = 0;i < 10002;i++)
	{
		c[i] = 0;
	}
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
	}
	int amin;
	int bmax;
	int j;
	int ok;
	ok = 1;
	amin = 10000;
	bmax = 0;
	for (i = 0;i < n;i++)
	{
		if (a[i] < amin)
		{
			amin = a[i];
		}
	}
	for (i = 0;i < n;i++)
	{
		if (b[i] > bmax)
		{
			bmax = b[i];
		}
	}
	for (i = 0;i < n;i++)
	{
	for (j = a[i];j <= b[i] - 1;j++)
	{
		c[j] = 1;
	}
	}
	for (i = amin;i <= bmax - 1;i++)
	{
		if (c[i] == 0)
		{
			ok = 0;
		}
	}
	if (ok == 0)
	{
		System.out.print("no");
	}
	else
	{
		System.out.printf("%d %d",amin,bmax);
	}
		return 0;
	}

}

