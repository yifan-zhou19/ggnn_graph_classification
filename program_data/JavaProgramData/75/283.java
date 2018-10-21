package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1001];
		int[] b = new int[1001];
		int[] x = new int[1001];
		int i;
		int j;
		int k;
		int l;
		int m = 0;
		int n;
		char c;
		c = ',';
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[1] = Integer.parseInt(tempVar);
		}
		i = 2;
		while (scanf(",%d", a[i]))
		{
			i++;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b[1] = Integer.parseInt(tempVar2);
		}
		i = 2;
		while (scanf(",%d", b[i]))
		{
			i++;
		}
		n = i - 1;
		for (i = 1;i <= n;i++)
		{
			for (j = a[i];j < b[i];j++)
			{
				 x[j]++;
			}
		}
		l = 0;
		for (i = 0;i <= 1000;i++)
		{
			if (x[i] > l)
			{
				l = x[i];
			}
		}
		System.out.printf("%d %d",n,l);
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			i = Integer.parseInt(tempVar3);
		}
	}

}

