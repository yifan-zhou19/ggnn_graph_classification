package <missing>;

public class GlobalMembers
{
	public static int k;
	public static int d = 0;
	public static int m;
	public static void f(int i, int[] a, int[] c)
	{
		if (i == 0)
		{
			a[i] = 0;
		}
		else
		{
			a[i] = a[i - 1] + 1;
		}
		for (;;a[i]++)
		{
			if (a[i] == (k - 1))
			{
			if (i == 0)
			{
				m = 1;
			}
		else if (c[a[i]] > c[a[i - 1]])
		{
			m = i;
		}
		else
		{
			m = i + 1;
		}
		d = d > m != 0?d:m;
		break;
			}
		if (i != 0)
		{
			if (c[a[i]] > c[a[i - 1]])
			{
				continue;
			}
		else
		{
			f(i + 1, a, c);
		}
		}
		else
		{
			f(1, a, c);
		}
		}
	}
	public static int Main()
	{
		int i;
		int[] c = new int[25];
		int[] a = new int[25];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i] = Integer.parseInt(tempVar2);
			}
		}
		f(0, a, c);
		System.out.printf("%d",d);
		return 0;
	}


}

