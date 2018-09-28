package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int m;
		  int k;
		  int i;
		  int n = 0;
		  int h;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  h = Integer.parseInt(tempVar);
		  }
		  if (h < 5)
		  {
			  System.out.print("empty");
		  }
		  else
		  {
				  for (m = 3;m <= h;m = m + 2)
				  {
					  k = Math.sqrt(m);
					for (i = 2;i <= k;i++)
					{
						   if (m % i == 0)
						   {
							   break;
						   }
					}
					if (i >= k + 1)
					{
						   k = Math.sqrt(m + 2);
						 for (i = 2;i <= k;i++)
						 {
							if ((m + 2) % i == 0)
							{
								break;
							}
						 }
							if (i >= k + 1)
							{
							   if ((m + 2) <= h)
							   {
								System.out.printf("%d %d\n",m,m + 2);
							   }
							}
					}
				  }
		  }
			System.in.read();
			 System.in.read();
			 System.in.read();
	}
}

