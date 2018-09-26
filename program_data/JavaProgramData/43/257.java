package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int m;
		  int n;
		  int i;
		  int j;
		  int k;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  for (i = 3;i < m / 2 + 1;i++)
		  {
							for (j = 2;j < i;j++)
							{
											if (i % j == 0)
											{
											break;
											}
							}
							if (j == i)
							{
									n = m - i;
									for (k = 2;k < n;k++)
									{
													if (n % k == 0)
													{
													break;
													}
									}
									if (k == n)
									{
									System.out.printf("%d %d\n",i,n);
									}

							}
		  }
		  System.in.read();
		  System.in.read();
	}
}

