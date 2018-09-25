package <missing>;

public class GlobalMembers
{
	public static int su(int i)
	{
		if (i == 1)
		{
			return (0);
		}
		else
		{
			int j;
			int k;
			int flag = 1;
			k = Math.sqrt(i);
			for (j = 2;j <= k;j++)
			{
				if (i % j == 0)
				{
					flag = 0;
					break;
				}
			}
		return (flag);
		}
	}

	public static int huiwen(int i)
	{
		int k = 0;
		int x;
		x = i;
		while (i > 0)
		{
			k = 10 * k + i % 10;
			i = i / 10;
		}
		if (x == k)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}

	public static void Main()
	{
		int i;
		int m;
		int n;
		int[] a = new int[100];
		int k = 0;
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
		for (i = m;i <= n;i++)
		{
			if (su(i) != 0 && huiwen(i) != 0)
			{
				a[k] = i;
				k++;
			}
		}
		if (k == 0)
		{
			System.out.print("no");
		}
		else
		{
			for (i = 0;i < k - 1;i++)
			{
			System.out.printf("%d,",a[i]);
			}
			System.out.printf("%d",a[k - 1]);
		}
	}
}

