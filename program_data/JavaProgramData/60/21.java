package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int f = int x;
		for (i = 4;i <= n;i++)
		{
			if (f(i - 2) == 1 && f(i) == 1)
			{
				System.out.printf("%d %d\n",i - 2,i);
				s = s + 1;
			}
		}
		if (s == 0)
		{
			System.out.print("empty\n");
		}

	}
	public static int f(int x)
	{
		int i;
		if (x == 2)
		{
			return 1;
		}
		for (i = 2;i <= Math.sqrt(x);i++)
		{
			if (x % i == 0)
			{
				break;
			}
		}
		if (i > Math.sqrt(x))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}

