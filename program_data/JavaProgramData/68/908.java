package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int b;
		int i;
		int[] a = new int[50001];
		a[0] = a[1] = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 2 ; i < n ; i++)
		{
			a[i] = 0;
		}
		for (i = 4 ; i < n ; i++)
		{
			for (j = 2 ; j < 230 && j <= i / 2 ; j++)
			{
				if (a[j] == 1)
				{
					continue;
				}
				if (i % j == 0)
				{
					a[i]++;
					i++;
					j = 1;
				}
			}
		}
		for (i = 3 ; i <= n / 2 ; i++)
		{
			for (j = 3 ; j <= n / 2 ; j++)
			{
				if (a[j] == 1)
				{
					continue;
				}
				if (a[2 * i - j] == 0)
				{
					System.out.print(2 * i);
					System.out.print("=");
					System.out.print(j);
					System.out.print("+");
					System.out.print(2 * i - j);
					System.out.print("\n");
					i++;
					if (i > n / 2)
					{
						break;
					}
					j = 2;
				}
			}
		}
	}
}

