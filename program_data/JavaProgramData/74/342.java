package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		int i;
		for (i = Math.sqrt(n + .1);i > 1;i--)
		{
			if (n % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int g(int n)
	{
		int[] a = new int[10];
		int i = 0;
		int j;
		while (n != 0)
		{
			a[i++] = n % 10,n /= 10;
		}
		for (j = 0,i--;j < i;j++,i--)
		{
			if (a[j] != a[i])
			{
				return 0;
			}
		}
		return 1;
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int t = 0;
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
			if (f(i) != 0 && g(i) != 0)
			{
				if (t != 0)
				{
					System.out.print(",");
				}
				else
				{
					t = 1;
				}
				System.out.printf("%ld",i);
			}
		}
		if (t == 0)
		{
			System.out.print("no");
		}
	}
}

