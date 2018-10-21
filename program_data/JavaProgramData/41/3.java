package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] f = new int[100];
		int[] g = new int[100];
		for (int a = 1;a <= 5;a++)
		{
				for (int b = 1;b <= 5;b++)
				{
						if (b != a)
						{
								 for (int c = 1;c <= 5;c++)
								 {
										 if (c != b && c != a)
										 {
													   for (int d = 1;d <= 5;d++)
													   {
															   if (d != c && d != b && d != a)
															   {
																					   for (int e = 1;e <= 5;e++)
																					   {
																							   if (e != d && e != c && e != b && e != a && e != 2 && e != 3)
																							   {
																																	  f[1] = e == 1;
																																	  g[1] = a;
																																	  f[2] = b == 2;
																																	  g[2] = b;
																																	  f[3] = a == 5;
																																	  g[3] = c;
																																	  f[4] = c != 1;
																																	  g[4] = d;
																																	  f[5] = d == 1;
																																	  g[5] = e;
																																	  int flag = 1;
																																	  for (int i = 1;i <= 5;i++)
																																	  {
																																			  if (!((g[i] <= 2 && f[i] != 0) || (g[i]>2 && f[i] == 0)))
																																			  {
																																			  flag = 0;
																																			  break;
																																			  }
																																	  }
																																			  if (flag != 0)
																																			  {
																																				  System.out.print(a);
																																				  System.out.print(' ');
																																				  System.out.print(b);
																																				  System.out.print(' ');
																																				  System.out.print(c);
																																				  System.out.print(' ');
																																				  System.out.print(d);
																																				  System.out.print(' ');
																																				  System.out.print(e);
																																				  System.out.print("\n");
																																				  return 0;
																																			  }

																							   }
																					   }
															   }
													   }
										 }
								 }
						}
				}
		}



		return 0;
	}

}
