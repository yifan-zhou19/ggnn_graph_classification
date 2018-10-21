package <missing>;

public class GlobalMembers
{
	public static int f(int m, int n)
	{
		return f1(m, n) + f2(m, n);
	}
	public static int f1(int m,int n) //?????????
	{
		if (n == 1)
		{
		return 0;
		}
		else
		{
		return f(m, n - 1);
		}
	}
	public static int f2(int m,int n) //???????
	{
		if (m < n)
		{
		return 0;
		}
		else if (m == n)
		{
		return 1;
		}
		else
		{
		return f(m - n, n);
		}
	}
	public static int Main()
	{
		int i;
		int m;
		int n;
		int t;
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
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",f(m, n));
		}
	}


}

