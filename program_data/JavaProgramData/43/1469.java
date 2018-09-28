package <missing>;

public class GlobalMembers
{
	public static int prime(int p)
	{
		int i;
		for (i = 2;i <= (int)Math.sqrt(p);i++)
		{
			if (p % i == 0)
			{
				return (0);
			}
		}
		return (1);
	}
	public static void Main()
	{
		int a;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= a / 2;i++)
		{
			if (prime(i) != 0 && prime(a - i) != 0)
			{
				System.out.printf("%d %d\n",i,a - i);
			}
		}
	}

}

