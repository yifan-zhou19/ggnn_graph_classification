package <missing>;

public class GlobalMembers
{
	public static int fj(int n,int m)
	{
		int i;
		int j;
		int k = 0;
		if (n == 1)
		{
			return 1;
		}
		for (i = m;i <= n;i++)
		{
			if (n % i == 0)
			{
			k += fj(n / i, i);
			}
		}
		return k;
	}
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;n > 0;n--)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				i = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d",fj(i, 2));
			if (n - 1 != 0)
			{
				System.out.print("\n");
			}
		}
	}
}

