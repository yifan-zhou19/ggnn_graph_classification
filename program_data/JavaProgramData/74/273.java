package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int zhi = int r;
		int hui = int r;
		int m;
		int n;
		int t = 0;
		int n1;
		int n2;
		int u = 0;
		int i;
		int[] a = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			n1 = zhi(i);
			n2 = hui(i);
			if (n1 == 0 && n2 == 0)
			{
				a[t] = i;
				t++;
				u = t;
			}
		}
		if (u == 0)
		{
			System.out.print("no");
		}
		else
		{
		for (t = 0;t < u - 1;t++)
		{
			System.out.printf("%d,",a[t]);
		}
				System.out.printf("%d",a[u - 1]);

		}
	}

	public static int zhi(int m)
	{
		int i;
		int k;
		int z = 1;
		k = Math.sqrt(m);
		for (i = 2;i <= k;i++)
		{
			if (m % i == 0)
			{
				break;
			}
		}
		if (i > k)
		{
			z = 0;
		}
		return z;
	}

	public static int hui(int m)
	{
		int[] a = new int[200];
		int n;
		int num;
		int t = 0;
		int k;
		int r;
		num = Math.log10(m);
		for (n = 0,k = num;n <= num;n++)
		{
			r = Math.pow(10,k);
			a[n] = m / r;
			m = m - a[n] * r;
			k--;
		}
		for (n = 0;n <= num / 2;n++)
		{
			if (a[n] != a[num - n])
			{
			t = 1;
			break;
			}
		}
		return t;
	}
}

