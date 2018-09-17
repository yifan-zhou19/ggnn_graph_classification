package <missing>;

public class GlobalMembers
{
	public static int lanjie(int m, int[] b, int lim)
	{
	if (m == 1)
	{
	if (b[0] <= lim)
	{
	return (1);
	}
	else
	{
		return (0);
	}
	}
	else if (m == 2)
	{
		if (b[0] <= lim != 0 && b[1] <= b[0])
		{
			return (2);
		}
		else if (b[0] > lim && b[1] > lim)
		{
			return (0);
		}
		else
		{
			return (1);
		}
	}
	else
	{
		if (b[0] <= lim)
		{
			return (lanjie(m - 1, b[1], b[0]) + 1 >= lanjie(m - 1, b[1], lim) != 0?lanjie(m - 1, b[1], b[0]) + 1:lanjie(m - 1, b[1], lim));
		}
		else
		{
			return (lanjie(m - 1, b[1], lim));
		}
	}
	}
	public static void Main()
	{
		int[] a = new int[26];
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= k - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		System.in.read();
		System.out.printf("%d\n",lanjie(k, a, 32767));
	}

}

