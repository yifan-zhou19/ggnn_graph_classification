package <missing>;

public class GlobalMembers
{
	public static int zui(int k, int m, int[] a)
	{
		int s = 1;
		int i = m + 1;
		int max = 0;
		if (m == k)
		{
			s = 1;
		}
		else
		{
		for (i = m + 1;i <= k;i++)
		{
			if (a[k - m] <= a[k - i])
			{
				if (max < zui(k, i, a))
				{
				max = zui(k, i, a);
				}
			}
		}
		s = s + max;
		}
		return s;
	}
	public static int Main()
	{
		int i;
		int k;
		int[] a = new int[25];
		int max = 0;
		int s;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i < k;i++)
		{
			s = zui(k, i, a);
			if (s > max)
			{
				max = s;
			}
		}
		System.out.printf("%d",max);
		return 0;
	}
}

