package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		i = 2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;i <= n / 2;i++)
		{
			j = n - i;
			if (i % 2 != 0 && j % 2 != 0)
			{
				m = 0;
				for (k = 2;k <= j - 1;k++)
				{
					if (k != i)
					{
						if (i % k == 0 || j % k == 0)
						{
						   m++;
						}
					}
				}
				if (m == 0)
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

