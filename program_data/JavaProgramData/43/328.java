package <missing>;

public class GlobalMembers
{
	public static int PrimeNumber(int p)
	{
		int i;
		for (i = 2;i <= Math.sqrt(p);i++)
		{
		if (p % i == 0)
		{
		return 0;
		}
		}
		return 1;
	}
	public static int Main()
	{
		int m;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 3;j <= m / 2;j = j + 2)
		{
		 if (PrimeNumber(j) != 0 && PrimeNumber(m - j) != 0)
		 {
			 System.out.print(j);
			 System.out.print(' ');
			 System.out.print(m - j);
			 System.out.print("\n");
		 }

		}

		return 0;
	}

}

