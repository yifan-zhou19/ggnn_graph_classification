package <missing>;

public class GlobalMembers
{
	public static int isprime(int p)
	{
		int prime = 1;
		int i;
		if (p == 2)
		{
		 return prime;
		}
		for (i = 3;i <= (p / 2);i = i + 2)
		{
			if (p % i == 0)
			{
				prime = 0;
			break;
			}
		}
		return prime;
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n > 50000)
		{
			System.out.print("??????50000??\n");
		}
		else
		{
				for (i = 6;i <= n;i = i + 2)
				{

				for (j = 3;j <= i;j = j + 2)

				{

					if (isprime(j) == 1)
					{

						int m;
						m = i - j;
						if (isprime(m) == 1)
						{
							System.out.printf("%d=%d+%d\n",i,j,m);
							break;
						}
					}
				}


				}
		}
			return 0;
	}


}

