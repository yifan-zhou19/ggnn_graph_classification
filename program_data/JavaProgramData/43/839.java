package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int primeA;
		int primeB;
		int i;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (primeA = 3; primeA <= m - 1; primeA += 2)
		{
			primeB = m - primeA;
			for (i = 2; i <= (int)Math.sqrt(m); i++)
			{
				if (primeA % i == 0 && primeA != i)
				{
					break;
				}
			}
			for (k = 2; k <= (int)Math.sqrt(m); k++)
			{
				if (primeB % k == 0)
				{
					break;
				}
			}
			if ((i == (int)Math.sqrt(m) + 1) && (k == (int)Math.sqrt(m) + 1) && (primeA <= primeB))
			{
				System.out.print(primeA);
				System.out.print(" ");
				System.out.print(primeB);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

