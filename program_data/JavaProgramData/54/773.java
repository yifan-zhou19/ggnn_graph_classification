package <missing>;

public class GlobalMembers
{
	public static int abc(int c,int d,int e)
	{
		c = c * d / (d - 1) + e;
		return c;
	}
	public static void Sum(int a,int b)
	{
		int m = 1;
		int i = 1;
		int j = 0;
		while (j != a)
		{
				m = i;
				for (j = 0;j < a;j++)
				{
					if (m % (a - 1) == 0)
					{
						m = abc(m, a, b);
					}
					else
					{
							i++;
							break;
					}
				}
		}
		System.out.print(m);
		System.out.print("\n");
	}

	public static int Main()
	{
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		Sum(n, k);
		return 0;
	}

}

