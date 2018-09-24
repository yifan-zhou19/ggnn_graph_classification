package <missing>;

public class GlobalMembers
{
	public static int judgeprime(int x)
	{
		int i1;
		int flag_prime = 1;
		if (2 == x)
		{
			flag_prime = 1;
		}
		for (i1 = 2;i1 <= Math.sqrt((float)x) + 1;i1++)
		{
			if (0 == x % i1)
			{
				flag_prime = 0;
			}
		}
		if (0 == flag_prime)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static int Main()
	{
		int input;
		int counter = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			input = Integer.parseInt(tempVar);
		}
		int i2;
		for (i2 = 2;i2 <= (input - 2);i2++)
		{
			if (judgeprime(i2) != 0 && judgeprime(i2 + 2) != 0)
			{
				System.out.printf("%d %d\n",i2,i2 + 2);
				counter++;
			}
		}
		if (0 == counter)
		{
			System.out.print("empty");
		}
		return 0;
	}
}

