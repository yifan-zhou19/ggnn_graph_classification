package <missing>;

public class GlobalMembers
{
	public static int[] prime = new int[50000];
	public static int isprime(int n)
	{
	  int i;
	  if (prime[n] != -1)
	  {
		  return prime[n];
	  }
	  else
	  {
		  for (i = 2;i <= n / 2;i++)
		  {
			  if ((n % i == 0))
			  {
					prime[n] = 0;
					return 0;
			  }
		  }
		  prime[n] = 1;
		  return 1;
	  }
	}

	public static int Main()
	{
	  int n;
	  int i;
	  int k;

	  for (i = 2;i < 50000;i++)
	  {
		  prime[i] = -1;
	  }
	  prime[2] = 1;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (k = 6;k <= n;k = k + 2)
	  {
		  for (i = 2;i <= k / 2;i++)
		  {
			  if (isprime(i) != 0)
			  {
				  if (isprime(k - i) != 0)
				  {
					  System.out.printf("%d=%d+%d\n",k,i,k - i);
					  break;
				  }
			  }
		  }
	  }
	  return 0;
	}

}

