package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] a = new int[100];
	public static int b = 0;
	public static int max = 0;

	public static void fun(int x,int m)
	{
		int i;
		if (x == 0)
		{
			if (b > max)
			{
				max = b;
			}
		}
		else if (a[x] < m)
		{
			fun(x - 1, m);
		}
		else if (a[x] >= m)
		{
			for (i = x;i >= 1;i--)
			{
				if (a[i] >= m)
				{
					b++;
					fun(i - 1, a[i]);
					b--;
				}
			}
		}
	}

	public static void Main()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		fun(n, 0);
		System.out.printf("%d",max);
	}
}

