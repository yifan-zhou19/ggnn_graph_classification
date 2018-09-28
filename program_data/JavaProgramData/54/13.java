package <missing>;

public class GlobalMembers
{
	public static int check(int a,int l,int n,int k)
	{
		if (l == 0)
		{
			if (a != 0)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else if ((a - k) % n == 0)
		{
			return check(a - k - (a - k) / n, l - 1, n, k);
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int i;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = n;i <= 100000000;i++)
		{
			if (check(i, n, n, k) != 0)
			{
				System.out.printf("%ld",i);
				return 0;
			}
		}
	   return 0;
	}
}

