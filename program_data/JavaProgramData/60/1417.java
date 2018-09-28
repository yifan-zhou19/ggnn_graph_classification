package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x1;
		int x2;
		int i1;
		int i2;
		int k1;
		int k2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n <= 4)
		{
			System.out.print("empty");
		}
		else
		{
		for (x1 = 3;x1 <= (n - 2);x1++)
		{
			  k1 = Math.sqrt(x1);
			  for (i1 = 2;i1 <= k1;i1++)
			  {
				  if (x1 % i1 == 0)
				  {
					  break;
				  }
			  }
			  if (i1 > k1)
			  {
				 x2 = x1 + 2;
				 k2 = Math.sqrt(x2);
				 for (i2 = 2;i2 <= k2;i2++)
				 {
					 if (x2 % i2 == 0)
					 {
						 break;
					 }
				 }
				 if (i2 > k2)
				 {
					System.out.printf("%d %d\n",x1,x2);
				 }
			  }

		}
		}

	  return 0;
	}
}

