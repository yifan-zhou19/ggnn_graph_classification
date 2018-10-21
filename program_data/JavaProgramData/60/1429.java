package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  i = 1;
		  j = 0;
		  while (i <= n)
		  {
					 if (isprime(i) == 1 && isprime(i + 2) == 1 && i + 2 <= n)
					 {
						 System.out.printf("%d %d\n",i,i + 2);
					 j++;
					 }
					 i = i + 2;
		  }
		  if (j == 0)
		  {
		  System.out.print("empty");
		  }

	}
	public static int isprime(int a)
	{
		int j = 2;
		while (j < a && a % j != 0)
		{
				   j++;
		}
				   if (j == a)
				   {
				   return 1;
				   }
				   else
				   {
				   return 0;
				   }
	}


}

