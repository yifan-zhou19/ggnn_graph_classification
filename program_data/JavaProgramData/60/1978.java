package <missing>;

public class GlobalMembers
{
	public static int fun(int a)
	{
		int sum;
		int i;
		if (a == 2 || a == 3)
		{
		return 0;
		}
	  if (a > 3)
	  {
			 for (sum = 0,i = 2;i <= Math.sqrt(a);i++)
			 {
		  if (a % i == 0)
		  {
					sum++;
				  break;
		  }
			 }
		  return sum;
	  }
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
		if (n < 5)
		{
			   System.out.print("empty");
		}
			   if (n >= 5)
			   {
		for (i = 2;i <= n - 2;i++)
		{
						  if (fun(i) == 0)
						  {
									   if (fun(i + 2) == 0)
									   {
													  System.out.printf("%d %d\n",i,i + 2);
									   }
						  }
		}
			   }
													  return 0;
	}

}

