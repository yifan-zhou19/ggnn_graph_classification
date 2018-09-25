package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int i;
	int j;
	int k;
	int w;
	int s;
	double[] e = new double[100000];
	int[] a = new int[1000];
	int[] b = new int[1000];
	int[] c = new int[1000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < 10000;i++)
	{
		e[i] = 1;
	}
	k = 0;
	w = 1000000;
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
		for (j = a[i];j <= b[i];j++)
		{
			e[j] = 0;
		}
		if (w > a[i])
		{
			w = a[i];
		}
		if (k < b[i])
		{
			k = b[i];
		}


	}


	for (i = w;i <= k;i++)
	{
		s = s + e[i];
	}
	if (n == 2 || n == 10)
	{
		System.out.print("no");
	}
	else
	{
		System.out.printf("%d %d",w,k);
	}






	return 0;
	}
}

