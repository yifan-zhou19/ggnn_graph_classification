package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int t;
		int i;
		int c;
		int n = 0;
		char tc;
		do
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			tc = tempVar2.charAt(0);
		}
		a[n] = t;
		n++;
		}while (tc != 10);

	for (i = 0;i < n;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
	}
	int max = 0;
	int maxp = 0;
	for (i = 0;i < n;i++)
	{
		if (b[i] > max)
		{
			max = b[i];
		}
	}


	for (t = 1;t < max;t++)
	{
		c = 0;
	for (i = 0;i < n;i++)
	{
		if ((a[i] <= t) && (b[i]> t))
		{
			c++;
		}
	}
	if (c > maxp)
	{
		maxp = c;
	}
	}

	System.out.printf("%d %d",n,maxp);

	}

}

