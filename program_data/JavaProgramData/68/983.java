package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		int i;
		for (i = 2;i <= Math.sqrt(x);i++)
		{
			if (x % i == 0)
			{
				return 0;
			}
		}
			return 1;

	}
	public static void Gede(int n)
	{
		int i;
		for (i = 3;i <= (n / 2);i++)
		{
			if ((f(i)) != 0 && (f(n - i)) != 0)
			{
				System.out.printf("%d=%d+%d\n",n,i,n - i);
				break;
			}
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
		for (i = 6;i <= n;i += 2)
		{
				Gede(i);
		}
			return 0;
	}
}

