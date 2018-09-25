package <missing>;

public class GlobalMembers
{
	public static int f(int m, int k)
	{
		int m1;
		int sum = 1;
		m1 = m;
		while (k <= (int)Math.sqrt(m))
		{
			if (m % k == 0)
			{
				m = m / k;

				sum = sum + f(m, k);
			}
			m = m1;
			k++;
		}
		return sum;
	}

	public static int Main()
	{
		int n; //????n,????m,???k
		int i;
		int k;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			k = 2;
			System.out.print(f(m, k));
			System.out.print("\n");
		}






		return 0;
	}


}

