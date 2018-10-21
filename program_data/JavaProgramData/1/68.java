package <missing>;

public class GlobalMembers
{
	public static int f(int a,int b)
	{
		if (a < b)
		{
			return 0;
		}
		int i;
		int r = 1;
		for (i = b; i <= a; i++)
		{
			if (!(a % i) && i <= a / i)
			{
				r += f(a / i, i);
			}
		}
		return r;
	}
	public static void Main()
	{
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			int result = f(m, 2);
			System.out.printf("%d\n",result);
		}
	}

}

