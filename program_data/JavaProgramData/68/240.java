package <missing>;

public class GlobalMembers
{
	public static int prime(int n)
	{
		int i;
		float q;

		if (n == 2)
		{
			return 1;
		}
		else
		{
			q = (float)Math.sqrt(n);
			for (i = 2;i <= q;i++)
			{
				if (n % i == 0)
				{
					break;
				}

			}
			  if (i > q)
			  {
				  return 1;
			  }
			  else
			  {
				  return 0;
			  }
		}

	}
	public static int Main()
	{
		int n;
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i += 2)
		{
			for (k = 3;k <= (n / 2);k += 2)
			{
				if (prime(k) + prime(i - k) == 2)
				{
				System.out.printf("%d=%d+%d\n",i,k,i - k);
				break;
				}
			}
		}
	return 0;
	}
}

