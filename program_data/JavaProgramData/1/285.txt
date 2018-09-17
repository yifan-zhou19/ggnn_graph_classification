package <missing>;

public class GlobalMembers
{
	//------------------
	//  1057???
	//   2010/12/1
	//    ???
	//------------------

	public static int devide(int m,int x,int i)
	{
		if (x == 1 && m >= i)
		{
			return 1;
		}
		else if (x > 1)
		{
			int j = i;
			int sum = 0;
			while (j <= m)
			{
				if (j != 1 && m % j == 0)
				{
					sum = sum + devide(m / j, x - 1, j);
				}
				j++;
			}
			return sum;
		}
		return 0;
	}

	public static int Main()
	{
		int n;
		int a;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			int sum = 0;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int X = 1;X <= 16;X++)
			{
				sum += devide(a, X, 1);
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

