package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		int k;
		int j;
		int l;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 6; i <= n; i = i + 2)
		{

			for (x = 3; x <= n / 2; x = x + 2)
			{
				l = Math.sqrt((double)x);
				for (j = 2; j <= l; j++)
				{
					if (x % j == 0)
					{
						break;
					}
				}
				if (j != l + 1)
				{
					continue;
				}
				if ((i - x) == 2)
				{
					break;
				}
				k = Math.sqrt((double)(i - x));
				for (j = 2; j <= k; j++)
				{
					if ((i - x) % j == 0)
					{
						break;
					}
				}
				if (j == k + 1)
				{
					System.out.print(i);
					System.out.print("=");
					System.out.print(x);
					System.out.print("+");
					System.out.print(i - x);
					System.out.print("\n");
					break;
				}
			}
		}
		return 0;
	}
}

