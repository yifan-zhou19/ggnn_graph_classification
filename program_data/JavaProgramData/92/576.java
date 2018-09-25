package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  while (n != 0)
		  {
						 int[] a = new int[1002];
						 int[] b = new int[1002];
						 int u = 0;
						 int k = 0;
		  for (int i = 1;i <= n;i++)
		  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  a[i - 1] = Integer.parseInt(tempVar2);
				  }
		  }
		  for (int i = 1;i <= n;i++)
		  {
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  b[i - 1] = Integer.parseInt(tempVar3);
				  }
		  }
		  b[n] = 1000001;
		  a[n] = -1;
		  for (int i = n - 2;i >= 0;i--)
		  {
				  for (int j = 0;j <= i;j++)
				  {
						  if (a[j + 1] <= a[j])
						  {
										  int x = 0;
										  x = a[j + 1];
										  a[j + 1] = a[j];
										  a[j] = x;
						  }
				  }
		  }
		  for (int i = n - 2;i >= 0;i--)
		  {
				  for (int j = 0;j <= i;j++)
				  {
						  if (b[j + 1] <= b[j])
						  {
										  int x = 0;
										  x = b[j + 1];
										  b[j + 1] = b[j];
										  b[j] = x;
						  }
				  }
		  }
		  int i;
		  int j;
		  for (i = 0;i <= n - 1;i++)
		  {
				  int l;
				  int c = -1;
				  for (l = 0;l <= n - 1;l++)
				  {
							   while (b[l] == 1000000)
							   {
												 l++;
							   }
							   if (a[i] <= b[l])
							   {
							   break;
							   }
							   else
							   {
							   c = l;
							   }
				  }
				  if (c != -1)
				  {
						  k++;
						  b[c] = 1000000;
						  a[i] = -1;
				  }
		  }
		  for (i = 0;i <= n - 1;i++)
		  {
							 for (j = 0;j <= n - 1;j++)
							 {
												if (a[i] == b[j])
												{
															  u++;
															  a[i] = -1;
															  b[j] = 1000000;
												}
							 }
		  }
		  n = -200 * n + 400 * k + 200 * u;
		  System.out.printf("%d\n",n);
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  n = Integer.parseInt(tempVar4);
		  }
		  }
	}


}

