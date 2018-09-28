package <missing>;

public class GlobalMembers
{
	//?????
	public static int f(int a)
	{
		int i;
		int l = (float)Math.sqrt((float)a);
		for (i = 2;i <= l;i++)
		{
			if (a % i == 0)
			{
				break;
				return 0;
			}
		}
		if (i == l + 1)
		{
			return 1;
		}
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
		if (n % 2 != 0)
		{
			return 0;
		}
		else
		{
			for (i = 3;i <= n / 2;i = i + 2)
			{
				if (f(i) == 1 && f(n - i) == 1)
				{
					System.out.printf("%d %d\n",i,n - i);
				}
			}
		}
		return 0;
	}
}

