package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int j;
		int a;
		int b;
		int c;
		int d;
		double i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		d = 1;
		for (m = 2;m <= b;m++)
		{
						 a = 1;
						 i = Math.sqrt(m);
						 n = (int)i + 1;
						 for (j = 2;j < n;j++)
						 {
										 if (m % j == 0)
										 {
												   a = 0;
												   break;
										 }
						 }
						  if (a == 1)
						  {
							  c = m + 2;
						  }
						  else
						  {
							  c = 4;
						  }
						  a = 1;
						  i = Math.sqrt(c);
						  n = (int)i + 1;
						  for (j = 2;j < n;j++)
						  {
										  if (c % j == 0)
										  {
													a = 0;
													break;
										  }
						  }
						   if (a == 1 && c <= b)
						   {
								   System.out.printf("%d ""%d\n",m,c);
								   d = 0;
						   }
		}
		  if (d == 1)
		  {
			  System.out.print("empty");
		  }
		  return 0;
	}

}

