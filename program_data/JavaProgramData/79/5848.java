package <missing>;

public class GlobalMembers
{
	public static int hs(int n,int m)
	{
	int i;
	int k = 0;
	for (i = 2;i <= n;i++)
	{
		k = ((m % i) + k) % i;
	}
	return k;
	}
	public static int Main()
	{
		int m;
		int n;
		int h = 0;
		int[] a = new int[100];
		int j = 0;
		int y = 0;
		while (h == 0)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if ((n == 0) && (m == 0))
		{
		h = 1;
		}
		a[j] = hs(n, m) + 1;
			j++;
			y += 1;
		}
		for (j = 0;j < y - 1;j++)
		{
		System.out.printf("%d\n",a[j]);
		}
		return 0;
	}

}

