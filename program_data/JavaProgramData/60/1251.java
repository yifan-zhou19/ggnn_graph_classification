package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int prime = int x;
		  int n;
		  int i;
		  int k = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 2;i <= n - 2;i++)
		  {
						   if (prime(i) != 0)
						   {
									   if (prime(i + 2) != 0)
									   {
													  System.out.printf("%d %d\n",i,i + 2);
													  k = 1;
									   }
						   }
		  }
		  if (k == 0)
		  {
			  System.out.print("empty\n");
		  }
	}

	public static int prime(int x)
	{
		int p;
		int j;
		p = Math.sqrt(x);
		for (j = 2;j <= p;j++)
		{
		if (x % j == 0)
		{
			break;
		}
		}
		if (j > p)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
}

