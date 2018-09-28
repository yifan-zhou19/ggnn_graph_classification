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
		if (m >= 6 && m <= 10000 && m % 2 == 0)
		{ //if
		for (primeA = 3; primeA <= m - 1; primeA += 2)
		{
			primeB = m - primeA;
			if (primeA <= primeB)
			{
				for (i = 3; i <= (int)Math.sqrt(m); i++)
				{
					if (primeA % i == 0 && primeA != i)
					{
						break;
					}
				}
				if (i == (int)Math.sqrt(m) + 1)
				{
					for (k = 3; k <= (int)Math.sqrt(m); k++)
					{
						if (primeB % k == 0 && primeB != k)
						{
							break;
						}
					}
				if (k == (int)Math.sqrt(m) + 1)
				{
					System.out.print(primeA);
					System.out.print(" ");
					System.out.print(primeB);
					System.out.print("\n");
				}
				}
			}
		}
		} //if
		return 0;
	}
}

