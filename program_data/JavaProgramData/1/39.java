package <missing>;

public class GlobalMembers
{
	public static int[] x = new int[1000];
	public static void f(int m,int n,int l)
	{
		int i;
		for (i = m;i <= n;i++)
		{
			if (n % i != 0)
			{
				continue;
			}
			else
			{
				if (n / i == 1)
				{
					x[l]++;
					return;
				}
				else
				{
					f(i, n / i, l);
				}
			}
		}
	}

	public static int Main()
	{
		int[] a = new int[1000];
		int s;
		int j;
		int sum;
		sum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1;j <= sum;j++)
		{
			a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			s = 2;
			f(s, a[j], j);
		}
		for (j = 1;j <= sum;j++)
		{
			System.out.print(x[j]);
			System.out.print("\n");
		}
		return 0;
	}
}

