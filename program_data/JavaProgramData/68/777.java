package <missing>;

public class GlobalMembers
{
	public static int isprime(int n)
	{
		int j;
		int x;
		if (n == 3)
		{
			x = 1;
		}
		else
		{
		for (j = 2;j <= Math.sqrt(n);j++)
		{
		if (n % j == 0)
		{
				x = 0;
			 break;
		}

		}
		if (j > Math.sqrt(n))
		{
			x = 1;
		}
		}
		return (x);


	}
	public static void Main()
	{
	   int n;
	   int i;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 6;i <= n;i = i + 2)
	   {
		   int m;
		   for (m = 3;m <= (i / 2);m = m + 2)
		   {
			   if (isprime(m) == 1 && isprime(i - m) == 1)
			   {

				   System.out.printf("%d=%d+%d\n",i,m,i - m);
				   break;
			   }


		   }

	   }
	}
}

