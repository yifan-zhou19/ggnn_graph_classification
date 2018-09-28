package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n = 1;
		  while (true)
		  {
					 String tempVar = ConsoleInput.scanfRead();
					 if (tempVar != null)
					 {
						 n = Integer.parseInt(tempVar);
					 }
					 if (n != 0)
					 {
							 int i;
							 int j;
							 int k = 0;
							 int m;
							 int lim;
							 int num = 0;
							 int win = 0;
							 int draw = 0;
							 int lose = 0;
							 int count;
							 int hehe;
							 int[] t = new int[1024];
							 int[] q = new int[1024];
							 for (i = 0;i < n;i++)
							 {
							 String tempVar2 = ConsoleInput.scanfRead();
							 if (tempVar2 != null)
							 {
								 t[i] = Integer.parseInt(tempVar2);
							 }
							 }
							 for (i = 0;i < n;i++)
							 {
							 String tempVar3 = ConsoleInput.scanfRead();
							 if (tempVar3 != null)
							 {
								 q[i] = Integer.parseInt(tempVar3);
							 }
							 }
							 for (i = n - 1;i > 0;i--)
							 {
											   for (j = 0;j < i;j++)
											   {
															   if (t[j] > t[j + 1])
															   {
																	   hehe = t[j];
																	   t[j] = t[j + 1];
																	   t[j + 1] = hehe;
															   }
											   }
							 }
							 for (i = n - 1;i > 0;i--)
							 {
										for (j = 0;j < i;j++)
										{
														if (q[j] > q[j + 1])
														{
																	   hehe = q[j];
																	   q[j] = q[j + 1];
																	   q[j + 1] = hehe;
														}
										}
							 }
							 lim = n;
							 m = n;
							 j = 0;
							 for (i = 0;i < m;i++)
							 {
											 for (;j < lim;)
											 {
															 if (t[i] > q[j])
															 {
																		  win++;
																		  j++;
																		  break;
															 }
															 else if (t[i] < q[j])
															 {
																  lose++;
																  lim--;
																  break;
															 }
															 else if (t[i] == q[j])
															 {
																 if (t[m - 1] > q[lim - 1])
																 {
																					win++;
																					m--;
																					lim--;
																					i--;
																					break;
																 }
																 else if (t[m - 1] < q[lim - 1])
																 {
																	  lose++;
																	  lim--;
																	  break;
																 }
																 else
																 {
																	 if (t[i] < q[lim - 1])
																	 {
																					   lose++;
																					   lim--;
																					   break;
																	 }
																	 else if (t[i] == q[lim - 1])
																	 {
																		  draw++;
																		  lim--;
																		  break;
																	 }
																 }
															 }
											 }
							 }
							 System.out.printf("%d\n",200 * (win - lose));
					 }
					 else
					 {
						 break;
					 }
		  }
	}
}

