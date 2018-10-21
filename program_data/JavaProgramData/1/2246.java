package <missing>;

public class GlobalMembers
{
	public static int check(int n,int i)
	{
		for (i = 2; i <= n / 2;i++)
		{
			if (n % i == 0)
			{
				break;
			}
		}
		return (i == n / 2 && n != 4)?1:0;
	}
	public static int f(int n, int k)
	{
		if (check(n, 2) == 1 || k == n)
		{
			return 1;
		}
		else if (n < k)
		{
			return 0;
		}
		else
		{
			int h = 0;
			int i;
			for (i = k;i <= Math.sqrt(n);i++)
			{
				if (n % i == 0)
				{
					h += f(n / i, i);
				}
			}
			return h + 1;
		}
	}

	public static void Main()
	{
		int n;
		int h;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",f(h, 2));
		}
	}

}

