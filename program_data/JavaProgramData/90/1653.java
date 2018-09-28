package <missing>;

public class GlobalMembers
{
	public static int apple(int m, int n)
	{

		if (m < 0)
		{
			return 0;
		}
		else if (m == 0 || n == 1 || m == 1)
		{
			return 1;
		}
		else
		{
			int a = apple(m, n - 1) + apple(m - n, n);
			return a;
		}

	}
	public static int Main()
	{
		int x;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < x;i++)
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
			int y;
			y = apple(m, n);
			System.out.printf("%d\n", y);
		}

	}

}

