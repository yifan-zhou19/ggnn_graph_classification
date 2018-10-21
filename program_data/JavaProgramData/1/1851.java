package <missing>;

public class GlobalMembers
{
	public static int sum = 0;
	public static void f(int x,int y)
	{
		if (x == 1)
		{
			sum++;
		}
		while (y <= x)
		{
			if (x % y == 0)
			{
				f(x / y, y);
			}
			y++;
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int j = 2;
			int num = 1;
			while (j <= a / 2)
			{
				if (a % j == 0)
				{
					sum = 0;
					f(a / j, j);
					num += sum;
				}
				j++;
			}
			System.out.printf("\n%d",num);
		}
		return 0;
	}

}

