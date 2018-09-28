package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int s = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int isPrime = int i;
		for (i = 3;i <= n - 2;i++)
		{
			if (isPrime(i) != 0 && isPrime(i + 2) != 0)
			{
				System.out.printf("%d %d\n",i,i + 2);
				s++;
			}
		}
		if (s == 0)
		{
			System.out.print("empty\n");
		}
	}
	public static int isPrime(int i)
	{
		int j;
		for (j = 2;j < i;j++)
		{
			if (i % j == 0)
			{
				return 0;
			}

		}
		return i;
	}
}

