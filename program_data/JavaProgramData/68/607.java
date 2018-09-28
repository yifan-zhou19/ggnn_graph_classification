package <missing>;

public class GlobalMembers
{
	public static int isprime(int n)
	{
		int i;
		int j;
		if (n == 2)
		{
			return 1;
		}
		else if (n == 1)
		{
			return 0;
		}
		else
		{
			for (i = 2,j = 0;i <= (int)Math.sqrt(n);i++)
			{
				if (n % i == 0)
				{
					break;
				}
				else
				{
					j++;
				}
			}
			if (j != (int)Math.sqrt(n) - 1)
			{
				return 0;
			}
			else
			{
				return 1;
			}
		}
	}
	public static void Goldbach(int m)
	{
		int i;
		int j;
		for (i = 6;i <= m;i++)
		{
			if (i % 2 == 0)
			{
				for (j = 3;j <= i;j++)
				{
					if ((isprime(j) == 1) && (isprime(i - j) == 1))
					{
						System.out.printf("%d=%d+%d\n",i,j,i - j);
						break;
					}
				}
			}
		}
	}
	public static int Main()
	{
	int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	Goldbach(m);
	return 0;
	}



}

