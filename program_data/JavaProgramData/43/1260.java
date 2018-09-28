package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		int b;
		int i;
		int j;
		int k;
		int l;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 3; i < m; i = i + 2)
		{
				for (j = 3; j < i; j = j + 2)
				{
					if ((i % j) == 0)
					{
						break;
					}
				}
				if (j == i)
				{
					a = i;
				}
				else
				{
					a = 0;
				}
				b = m - a;
				for (k = 3; k < b; k = k + 2)
				{
					if ((b % k) == 0)
					{
						break;
					}
				}
				if (k == b)
				{
					if (((a <= b) && (a != 0)) == 1)
					{
						System.out.print(a);
						System.out.print(" ");
						System.out.print(b);
						System.out.print("\n");
					}
				}
		}
		return 0;
	}


}

