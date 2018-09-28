package <missing>;

public class GlobalMembers
{
	public static int prime(int n)
	{
		int i;
		int z = 1;
		for (i = 3;i <= n / 2;i++)
		{
			 if (n % i == 0)
			 {
				 z = 0;
				 break;
			 }
		}
		return z;
	}
	public static int Main()
	{
		  int n;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 3;i <= n / 2;i = i + 2)
		  {
			   if (prime(i) == 1 && prime(n - i) == 1)
			   {
			   System.out.printf("%d %d\n",i,n - i);
			   }
		  }
		  System.in.read();
		  System.in.read();
		  return 0;
	}

}

