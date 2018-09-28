package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  for (;;)
		  {
			  int[] a = new int[1050];
			  int[] b = new int[1050];
			  int i;
			  int j;
			  int k;
			  int t;
			  int h;
			  int m;
			  int w1 = 0;
			  int w2 = 0;
			  int w3 = 0;
			  int n;
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  n = Integer.parseInt(tempVar);
			  }
			  if (n == 0)
			  {
			  break;
			  }
			  else
			  {
				  for (i = 1;i <= n;i++)
				  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  a[i] = Integer.parseInt(tempVar2);
				  }
				  }
				  for (i = 1;i <= n;i++)
				  {
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  b[i] = Integer.parseInt(tempVar3);
				  }
				  }
				  for (i = 1;i <= n - 1;i++)
				  {
					  for (j = i + 1;j <= n;j++)
					  {
						  if (a[i] > a[j])
						  {
						  t = a[i],a[i] = a[j],a[j] = t;
						  }
						  if (b[i] > b[j])
						  {
						  t = b[i],b[i] = b[j],b[j] = t;
						  }
					  }
				  }
				  for (i = 1,h = n,m = n,j = 1;i <= m;)
				  {
					  for (;j <= h;)
					  {
						  if (a[i] > b[j])
						  {
							  w1++;
							  j++;
							  i++;
							  break;
						  }
						  if (a[i] < b[j])
						  {
							  w2++;
							  i++;
							  h = h - 1;
							  break;
						  }
						  if (a[i] == b[j])
						  {
							  if (a[m] > b[h])
							  {
								  w1++;
								  m = m - 1,h = h - 1;
								  break;
							  }
							  if (a[m] < b[h])
							  {
								  w2++;
								  h = h - 1;
								  i++;
								  break;
							  }
							  if (a[m] == b[h])
							  {
								  if (a[i] == b[h])
								  {
									  i++;
									  h = h - 1;
									  break;
								  }
								  if (a[i] < b[h])
								  {
									  w2++;
									  i++;
									  h = h - 1;
									  break;
								  }
							  }
						  }
					  }
				  }
				  w3 = 200 * w1 - 200 * w2;
				  System.out.printf("%d\n",w3);
			  }
		  }
	}
}

