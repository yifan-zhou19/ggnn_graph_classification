package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int[] a = new int[1000];
		  int[] b = new int[1000];
		  int i;
		  int k;
		  int c;
		  int s;
		  int p;
		  int q;
		  int j;
		  p = 0;
		  q = 0;
		  for (j = 1;;j++)
		  {

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
											for (k = i + 1;k < n;k++)
											{
															  if (a[i] < a[k])
															  {
																		   c = a[i];
																		   a[i] = a[k];
																		   a[k] = c;
															  }
																		 if (b[i] < b[k])
																		 {
																		   c = b[i];
																		   b[i] = b[k];
																		   b[k] = c;
																		 }
											}
						  }

																		   s = n;
																		   while (s >= 1)
																		   {
																					  if (a[s - 1] > b[s - 1])
																					  {
																					  p++;
																					  }
																					  else if (a[s - 1] < b[s - 1])
																					  {
																						   if (a[s - 1] < b[0])
																						   {
																						   q++;
																						   }
																						   for (i = 0;i < s - 1;i++)
																						   {
																						   b[i] = b[i + 1];
																						   }

																					  }
																						   else
																						   {
																							   if (a[0] > b[0])
																							   {
																											p++;
																											for (i = 0;i < s - 1;i++)
																											{
																															  b[i] = b[i + 1];
																															  a[i] = a[i + 1];
																											}
																							   }
																															  else
																															  {
																																  if (a[s - 1] < b[0])
																																  {
																																  q++;
																																  }
																																  for (i = 0;i < s - 1;i++)
																																  {
																																  b[i] = b[i + 1];
																																  }
																															  }
																						   }
																																  s--;
																		   }

																																  System.out.printf("%d\n",200 * p - 200 * q);
																																  p = 0;
																																  q = 0;
		  }
		  }

	}




}

