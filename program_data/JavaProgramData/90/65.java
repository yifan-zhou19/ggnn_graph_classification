package <missing>;

public class GlobalMembers
{
	public static int digui(int m,int n)
	{
		int p;
		if (m < n)
		{
			p = digui(m, m);
		}
		else
		{
			if (m == 0 || n == 1)
			{
			p = 1;
			}
			else
			{
				p = (digui(m, n - 1) + digui(m - n, n));
			}
		}
		return (p);
	}
	public static void Main()
	{
		int m;
		int n;
		int t;
		int i;
		int[] a = new int[20];
		int[] b = new int[20];
		int[] c = new int[20];
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c[i] = Integer.parseInt(tempVar3);
			}
			p = b[i];
			q = c[i];
			a[i] = digui(p, q);
		}
		System.out.printf("%d",a[0]);
		if (t >= 1)
		{
		for (i = 1;i < t;i++)
		{
		System.out.printf("\n%d",a[i]);
		}
		}
	}

}

