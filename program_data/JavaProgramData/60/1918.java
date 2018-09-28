package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int m;
		  int i;
		  int j;
		  int s;
		  int k;
		  int h;
		  int n;
		  int a;
		  int b;
		  int l;
		  a = 0;
		  b = 0;
		  l = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (m = 2;m < n - 1;m++)
		  {
						  k = Math.sqrt(m);
						  for (i = 2;i <= k;i++)
						  {
							  if (m % i == 0)
							  {
									a = 1;
									break;
							  }
						  }
							  if (a == 0)
							  {
									s = m + 2;
									h = Math.sqrt(s);
									for (j = 2;j <= h;j++)
									{
									if (s % j == 0)
									{
										b = 1;
										break;
									}
									}
									if (b == 0)
									{
										System.out.printf("%d %d\n",m,s);
										l = 1;
									}
							  }
						  a = 0;
						  b = 0;
		  }
		  if (l == 0)
		  {
		  System.out.print("empty");
		  }

	}

}

