package <missing>;

public class GlobalMembers
{
	public static int p(int a,int m)
	{
		int t = 0;
		int i;
		if (a % m != 0)
		{
			return 0;
		}
		if ((a % m == 0) && (a / m < m) && (a != m))
		{
			return 0;
		}
		if (a == m)
		{
			return 1;
		}
		if ((a % m == 0) && (a / m >= m))
		{
				for (i = m;i <= a / m;i++)
				{
					t = t + p(a / m, i);
				}
				return t;
		}
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int x;
		int j;
		int num = 0;
		for (i = 0;i < n;i++)
		{
			  x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  for (j = 2;j <= x;j++)
			  {
				  num = num + p(x, j);
			  }
			  System.out.print(num);
			  System.out.print("\n");
			  num = 0;
		}

		return 0;
	}

}

