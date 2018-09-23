package <missing>;

public class GlobalMembers
{
	public static int f(int a)
	{
		int t;
		if (a % 2 == 0)
		{
			t = a / 2;
		}
		else
		{
			t = (a - 1) / 2;
		}
		return (t);
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int p;
		int q;
		int r;
		int[] a = new int[100];
		int[] b = new int[100];
		i = 0;
		j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		while (m >= 1)
		{
			a[i] = m;
			i++;
			m = f(m);
		}
		while (n >= 1)
		{
			b[j] = n;
			j++;
			n = f(n);
		}
		for (p = 0;p < i;p++)
		{
			r = 0;
			for (q = 0;q < j;q++)
			{
				if (a[p] == b[q])
				{
					System.out.printf("%d",a[p]);
					r++;
					break;
				}
			}
			if (r > 0)
			{
				break;
			}
		}
		return 0;
	}
}

