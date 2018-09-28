package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int prime = int p;
		int n;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i++,i++)
		{
		   for (k = 3;k < n / 2;k++,k++)
		   {
			   if (prime(k) + prime(i - k) == 2)
			   {
				   System.out.printf("%d=%d+%d\n",i,k,i - k);
				   break;
			   }
		   }
		}
	}

	public static int prime(int p)
	{
		int isprime = 1;
		int j;
		if (p == 3 || p == 5 || p == 7)
		{
			return isprime;
		}
		else
		{
			for (j = 3;j <= Math.sqrt(p);j++,j++)
			{
				if (p % j == 0)
				{
					isprime = 0;
					return isprime;
					break;
				}
			}
		}
		return isprime;
	}


}

