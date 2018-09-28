package <missing>;

public class GlobalMembers
{
	public static int prime(int x)
	{
	  int isprime = 1;
	  int i;
	  if (x == 3 || x == 5 || x == 7)
	  {
		  return isprime;
	  }
	  else
	  {
		  for (i = 3;i <= Math.sqrt(x);i += 2)
		  {
			  if (x % i == 0)
			  {
				  isprime = 0;
				  return isprime;
				  break;
			  }
		  }
	  }
	  return isprime;
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
		System.out.print("6=3+3\n");
		for (i = 8;i <= n;i = i + 2)
		{
		  for (j = 3;j <= (n / 2);j = j + 2)
		  {
			  if (prime(j) + prime(i - j) == 2)
			  {
			  System.out.printf("\n%d=%d+%d\n",i,j,i - j);
			  break;
			  }
		  }
		}
	return 0;
	}

}

