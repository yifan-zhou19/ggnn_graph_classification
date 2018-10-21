package <missing>;

public class GlobalMembers
{
	public static int hezi(int[] a)
	{
		int m;
		int i = 1;
		while (true)
		{
			if (a[i] != 0)
			{
				m = a[i];
				break;
			}
			i = i + 1;
		}
		return m;
	}
	public static int pan(int n,int m)
	{
		int[] a = new int[301];
		int[] b = new int[301];
		int i;
		int k;
		int l;
		int p;
		int s = 0;
		int r;
		for (i = 0;i <= n;i++)
		{
			a[i] = i;
		}
		while (true)
		{
			l = 1;
			k = 0;
			while (m * l + s <= n)
			{
				a[m * l + s] = 0;
				l = l + 1;
				k = k + 1;
				if (n - k == 1)
				{
					a[1] = hezi(a);
					break;
				}
			}
			if (n - k == 1)
			{
				break;
			}
			p = m * l + s - n;
			n = n - k;
			s = p % n;
			if (s == 0)
			{
				s = n;
			}
			s = s - m;
			r = 1;
			for (i = 1;i <= n + k;i++)
			{
				if (a[i] != 0)
				{
					b[r] = a[i];
					r = r + 1;
				}
			}
			for (i = 1;i <= n;i++)
			{
				a[i] = b[i];
			}
		}
		return a[1];
	}
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[20];
		int i = 0;
		while (true)
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
			if (m + n == 0)
			{
				a[i] = 0;
				break;
			}
			a[i] = pan(n, m);
			i = i + 1;
		}
		for (i = 0;a[i] != 0;i++)
		{
			System.out.printf("%d\n",a[i]);
		}
		return 1;
	}


}

