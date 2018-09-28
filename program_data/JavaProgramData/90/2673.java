package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		if (n == 1)
		{
			return 1;
		}
		if (m >= n)
		{
			return f(m, n - 1) + f(m - n, n);
		}
		else
		{
			return f(m, n - 1);
		}
	}
	public static int Main()
	{
		int n;
		int m;
		int t;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			k = f(m, n);
			System.out.printf("%d",k);
			System.out.print("\n");
		}
		return 0;
	}
























}

