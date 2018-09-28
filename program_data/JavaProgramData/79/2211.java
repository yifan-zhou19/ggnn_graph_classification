package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 1;
		int m = 1;
		int[] a = new int[301];
		int[] b = new int[301];
		int i;
		int c;
		int d;
		int[] e = new int[301];
		int f = 0;
		while (n != 0 && m != 0)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if ((n == 0) && (m == 0))
		{
			break;
		}
		f++;
		for (i = 0;i < n;i++)
		{
			a[i + 1] = i + 1;
		}
		for (i = 1;i < n;i++)
		{
			c = m % (n - i + 1);
			for (d = 1;d <= (n - i + 1 - c);d++)
			{
				b[d] = a[c + d];
			}
			for (d = 1;d < c;d++)
			{
				b[n - i + 1 - c + d] = a[d];
			}
			for (d = 0;d < (n - i);d++)
			{
				a[d + 1] = b[d + 1];
			}
		}
		e[f] = a[1];
		}
		for (d = 1;d <= f;d++)
		{
			System.out.printf("%d\n",e[d]);
		}
		return 0;
	}

}

