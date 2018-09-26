package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		int a;
		if (m == 0 || n == 1)
		{
			return (1);
		}
		else
		{
			if (m < n)
			{
				a = f(m, m);
			}
			else
			{
				a = f(m - n, n) + f(m, n - 1);
			}
			return (a);
		}
	}
	public static void Main()
	{
		int t;
		int m;
		int n;
		int y;
		int i;
		int j;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",f(m, n));
		}
	}



}

