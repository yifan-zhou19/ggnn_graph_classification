package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int m;
		  int n;
		  int c;
		  int b;
		  int k;
		  b = 0;
		  k = 0;
		  int[] v = new int[10000];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  if (n < 5)
		  {
		  System.out.print("empty");
		  }
		  else
		  {
		  for (m = 2;m <= n;m++)
		  {
								for (i = 2;i <= Math.sqrt(m);i++)
								{
												  c = m % i;
												  if (c == 0)
												  {
												  break;
												  }
								}

												  if (i > Math.sqrt(m))
												  {
																  v[k] = m;
																  k++;
												  }
		  }
						   for (k = 0;k <= 10000;k++)
						   {
							 if (v[k + 1] - v[k] == 2)
							 {
							 System.out.printf("%d %d\n",v[k],v[k + 1]);
							 }
						   }
		  System.in.read();
		  System.in.read();
		  }
	}
}

