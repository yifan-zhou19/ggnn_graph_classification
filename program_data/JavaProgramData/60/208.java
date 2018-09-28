package <missing>;

public class GlobalMembers
{
	public static int isprime(int i)
	{
		int j;
		for (j = 2;j * j <= i;j++)
		{
			if (i % j == 0)
			{
				return 0;
			}
		}
		return 1;
	}

	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n <= 4)
		{
			System.out.print("empty\n");
		}
		else
		{
			int i = 5;
			for (i = 5;i <= n;i += 2)
			{
				if (isprime(i - 2) != 0 && isprime(i) != 0)
				{
					System.out.printf("%d %d\n",i - 2,i);
				}
			}
		}
	}
}

