package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i = 0;
	  for (i = 0;;i++)
	  {

	  int n;
	  int i;
	  int j;
	  int s;
	  int t = 0;
	  int win = 0;
	  int loss = 0;
	  int equal = 0;
	  int sum = 0;
	  int f;
	  int g;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  if (n == 0)
	  {
		  break;
	  }
	  int[] a = new int[1000];
	  int[] b = new int[1000];
	  int[] c = new int[1000];
	  int[] d = new int[1000];


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


	  for (i = 0;i <= (n - 2);i++)
	  {
		   for (j = (n - 2); j >= i; j--)
		   {
			  if (a[j] > a[j + 1])
			  {
			   s = a[j];
			   a[j] = a[j + 1];
			   a[j + 1] = s;
			  }
		   }
		  // printf("%d ",a[i]) ; 
	  } // printf("%d",a[n-1]);

	  for (i = 0;i <= (n - 2);i++)
	  {
		   for (j = (n - 2); j >= i; j--)
		   {
			  if (b[j] > b[j + 1])
			  {
			   s = b[j];
			   b[j] = b[j + 1];
			   b[j + 1] = s;
			  }
		   }
		  // printf("%d ",a[i]) ; 
	  } // printf("%d",a[n-1]);
	  /*for (i=0;i<=(n-1);i++)
	  {
	  printf("a[i]=%d     b[i]=%d\n",a[i],b[i]);
	  }*/

							 for (i = 0, j = (n - 1), f = 0, g = (n - 1);i <= j != 0 && f <= g;)
							 {
							  if (a[i] > b[f])
							  {
									sum += 200;
									i++;
									f++;
									//printf("%d\n",sum);
							  }
							  else
							  {
								   if (a[i] < b[f])
								   {
									sum = sum - 200;
									i++;
									g--;
								   // printf("%d\n",sum);
								   }
									else //????????????????
									{
										   if (a[j] > b[g]) //??????????? ?????????
										   {
											sum += 200;
											//printf("%d\n",sum);
											j--;
											g--;
										   }
										   else
										   {
													 if (a [j] < b[g]) //????????????????????
													 {
													sum -= 200;
												   // printf("%d\n",sum);
													i++;
													g--;
													 }
												 else //????????????????????
												 {
														 if (a[i] < b[g])
														 {
															   sum -= 200;
															   i++;
															   g--;
														 }
														 else
														 {
															   sum = sum;
															   i++;
															   g--;
														 }
												 }


										   }



									}

							  }
							 }
	System.out.printf("%d\n",sum);
	  }

	}

}

