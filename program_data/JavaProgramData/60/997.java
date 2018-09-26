package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		int i;
		int num = 0;
		for (i = 1;i <= x;i++)
		{
			if (x % i == 0)
			{
				num++;
			}
		}
		if (num == 2)
		{
			return 1;
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
		int e = 2;
		int num = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n;i++)
		{
			if (f(i) != 0 && i == e+2)
			{
				System.out.printf("%d %d\n",e,i);
				num++;
			}
			if (f(i) != 0)
			{
				e = i;
			}
		}
		if (num == 0)
		{
			System.out.print("empty");
		}
		return 0;
	}
}

