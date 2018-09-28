package <missing>;

public class GlobalMembers
{
	public static int isprime(int n)
	{
		int i;
		for (i = 2;i <= Math.sqrt(n);i++)
		{
			if (n % i == 0)
			{
				return 0;
				break;
			}
		}
	//	if(i==sqrt(n)+1)
	//	{
			return 1;
	//	}
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 3;j <= n;j++)
		{
			if (isprime(j) != 0)
			{
				if (isprime(j + 2) != 0 && (j + 2 <= n))
				{
					p = 1;
				}
			}
			if (p == 1)
			{
				System.out.printf("%d %d\n",j,j + 2);
				p = 2;
			}
		}
		if (p == 0)
		{
			System.out.print("empty");
		}
		return 0;
	}
}

