package <missing>;

public class GlobalMembers
{
	public static int prime(int p)
	{
		int i;
		int isprime = 1;
		if (p == 3 || p == 5 || p == 7)
		{
			return isprime;
		}
		else
		{
			for (i = 3;i <= Math.sqrt(p);i += 2)
			{
				if (p % i == 0)
				{
					isprime = 0;
					break;
					return isprime;
				}
			}
		}
		return isprime;
	}

	public static void Main(String[] args)
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
	}




}

