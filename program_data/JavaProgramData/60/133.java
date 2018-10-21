package <missing>;

public class GlobalMembers
{
	public static int isprime(int i)
	{
	   int j;
	   int k;
	   k = Math.sqrt(i);
	   if (i == 1)
	   {
		   return 0;
	   }
	   for (j = 2;j <= k;j++)
	   {
		  if (i % j == 0)
		  {
			 return 0;
		  }
	   }
	   if (j > k)
	   {
		   return 1;
	   }
	}
	public static void Main()
	{
		int n;
		int i;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i < (n - 1);i++)
		{
			if (isprime(i) != 0 && isprime(i + 2) != 0)
			{
				System.out.printf("%d %d\n",i,i + 2);
				s = 1;
			}
		}
		if (s == 0)
		{
			System.out.print("empty\n");
		}
	}
}

