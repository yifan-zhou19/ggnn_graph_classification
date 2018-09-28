package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t;
		int[] a = new int[80000];
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 2;i < Math.sqrt(n);i++,sum = 0)
			{
				sum = sum + i;
				if (a[sum] == 0)
				{
					while (sum <= n)
					{
						sum = sum + i;
						a[sum] = 1;
					}
				}
			}
			t = n - 6;
			for (i = 2;i <= n / 2 && t >= 0;i++)
			{
				if (a[i] == 1)
				{
					continue;
				}
					if (a[n - i - t] == 0)
					{
						System.out.print(n - t);
						System.out.print('=');
						System.out.print(i);
						System.out.print("+");
						System.out.print(n - i - t);
						System.out.print("\n");
						t = t - 2;
						i = 1;
					}
			}
		return 0;
	}
}

