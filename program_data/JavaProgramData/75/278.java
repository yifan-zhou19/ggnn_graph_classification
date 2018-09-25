package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[2000];
		int[] b = new int[2000];
		int i;
		int j;
		int n;
		int m;
		int k;
		int p;
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
		j = 2;
		while (scanf(",%d", b[j]))
		{
			j++;
		}
		j--;
		System.out.printf("%d ",j);
		n = 0;
		for (i = 1;i <= j;i++)
		{
			if (b[i] > n)
			{
				n = b[i];
			}
		}
		m = 0;
		for (i = 0;i < n;i++)
		{
			p = 0;
			for (k = 1;k <= j;k++)
			{
				if (i >= a[k] != 0 && i < b[k])
				{
					p++;
				}
			}
			if (p > m)
			{
				m = p;
			}
		}
		System.out.printf("%d",m);
	}

}

