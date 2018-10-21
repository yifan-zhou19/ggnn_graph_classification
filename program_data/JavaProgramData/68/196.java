package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int p;
		int x;
		int n;
		int f;
		int g;
		int primep;
		int primeq;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}

		for (n = 6;n <= x;n++)
		{
			if (n % 2 == 0)
			{
			  for (p = 2;p < n;p++)
			  {
				primep = 1;
				f = Math.sqrt(p);
				for (i = 2;i <= f;i++)
				{
					if (p % i == 0)
					{
						primep = 0;
						break;
					}
				}
				if (primep != 0)
				{
					primeq = 1;
					g = Math.sqrt(n - p);
					for (i = 2;i <= g;i++)
					{
						if ((n - p) % i == 0)
						{
							primeq = 0;
							break;
						}
					}
					if (primeq != 0 && (n - p) > 1 && p <= (n - p))
					{
						System.out.printf("%d=%d+%d\n",n,p,n - p);
						break;
					}

				}
			  }
			}
		}
	}


}

