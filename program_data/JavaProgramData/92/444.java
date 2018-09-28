package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int x;
		  for (x = 0;x < 49;x++)
		  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int t;
		  int[] a = new int[1000];
		  int[] b = new int[1000];
		  for (i = 0;i < n;i++)
		  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  a[i] = Integer.parseInt(tempVar2);
						  }
		  }
		  for (i = 0;i < n;i++)
		  {
						  String tempVar3 = ConsoleInput.scanfRead();
						  if (tempVar3 != null)
						  {
							  b[i] = Integer.parseInt(tempVar3);
						  }
		  }
		  for (i = 0;i < n - 1;i++)
		  {
							for (j = 0;j < n - 1 - i;j++)
							{
												if (a[j] < a[j + 1])
												{
															   t = a[j];
															   a[j] = a[j + 1];
															   a[j + 1] = t;
												}
							}
		  }
		  for (i = 0;i < n - 1;i++)
		  {
							for (j = 0;j < n - 1 - i;j++)
							{
												if (b[j] < b[j + 1])
												{
															   t = b[j];
															   b[j] = b[j + 1];
															   b[j + 1] = t;
												}
							}
		  }
		  int k;
		  int l;
		  int m;
		  int p;
		  int y;
		  int z;
		  int[] c = new int[1000];
		  k = 0,l = 0,m = 0,p = 0;
		  for (i = 0;i < n;i++)
		  {
						if (a[n - 1 - i] > b[n - 1 - l])
						{
							k++;
							l++;
						}
						  else if (a[n - 1 - i] < b[n - 1 - l])
						  {
							  k--;
							  m++;
						  }
						  else if (a[n - 1 - i] == b[n - 1 - l])
						  {
							 y = p;
							 z = m;
							 int u;
							 u = 0;
							 while (y <= n - 1 - i && z <= n - 1 - l)
							 {
										 int f = new int(int z,int u);
									  if (f(z, u) == 0)
									  {
										   if (a[y] <= b[z])
										   {
													  c[u] = z;
													  if (a[n - 1 - i] < b[z])
													  {
														  k--;
														  m++;
													  }
													  else
													  {
														  m++;
													  }
													  u++;
													  break;
										   }
										else if (a[y] > b[z])
										{
											z++;
											y++;
										}
									  }
										else
										{

											z++;
											if (a[y] <= b[z] != 0 && z <= n - 1 - l)
											{
													  c[u] = z;
													  if (a[n - 1 - i] < b[z])
													  {
														  k--;
														  m++;
													  }
													  else
													  {
														  m++;
													  }
													  u++;
													  break;
											}
											 else if (a[y] > b[z])
											 {
												 z++;
												 y++;
											 }

										}
							 }
						  }
		  }
		  if (n != 0)
		  {
			  System.out.printf("%d\n",200 * k);
		  }
		  }
	}

	public static int f(int z,int u)
	{
	 int[] c = new int[1000];
	 int i;
	 for (i = 0;i < u;i++)
	 {
			 if (c[i] == z)
			 {
				 break;
			 }
	 }
			 if (i == u)
			 {
				 return 0;
			 }
			 else
			 {
				 return 1;
			 }
	}


}

