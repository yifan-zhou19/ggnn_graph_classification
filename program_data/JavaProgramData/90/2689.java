package <missing>;

public class GlobalMembers
{
	public static int kong(int m, int n)
	{
		if (n == 1)
		{
			return 0;
		}
		else
		{
			return (zong(m, n - 1));
		}
	}
	public static int zong(int m, int n)
	{
		if (m == 0)
		{
			return 1;
		}
		else if (m == 1)
		{
			return 1;
		}
		else if (m >= n)
		{
			return (kong(m, n) + have(m, n));
		}
		else
		{
			return (kong(m, n));
		}
	}
	public static int have(int m, int n)
	{
		return (zong(m - n, n));
	}
	public static int Main()
	{
		int a;
		int b;
		int t;
		int i;
		int[] c = new int[50];
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
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			c[i] = zong(a, b);
		}
		for (i = 0;i < t;i++)
		{
			System.out.printf("%d\n",c[i]);
		}
		return 0;
	}

}

