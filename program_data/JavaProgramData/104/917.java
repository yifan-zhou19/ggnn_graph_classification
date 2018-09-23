package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int l;
		int k;
		int t;
		int i;
		int j;
		int x;
		int y;
		int[] a = new int[1000];
		int[] b = new int[1000];
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
		if (n < m)
		{
			l = n;
			n = m;
			m = l;
		}
		a[0] = 0;
		k = 1;
		a[k] = n;
		while (n != 1)
		{
			k = k + 1;
			a[k] = n = n / 2;
		}
		b[0] = 1;
		t = 1;
		b[t] = m;
		while (m != 1)
		{
			t++;
			b[t] = m = m / 2;
		}
		for (i = k;i >= k - t;i--)
		{
			if (a[i] == b[i + t - k] && a[i - 1] != b[i + t - k - 1])
			{
				x = a[i];
				break;
			}
		}
		System.out.printf("%d",x);
	}
}

