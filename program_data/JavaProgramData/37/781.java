package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int n = 0;
		char a;
		int[] x = new int[26];
		int[] y = new int[26];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i <= 25;i++)
		{
						  x[i] = y[i] = 0;
		}
		for (k = 1;k <= n;k++)
		{
			for (i = 0;i <= 25;i++)
			{
						  x[i] = y[i] = 0;
			}

						 for (i = 1;;i++)
						 {
								a = System.in.read();
								if (a == '\n')
								{
									break;
								}
								b = a - 97;
								if (x[b] > b + 97)
								{
									continue;
								}

								if (x[b] == 0)
								{
									y[b] = i;
								}
								x[b] = x[b] + a; //cout<<b<<"  "<<x[b]<<"  "<<y[b]<<endl;
						 }
						 b = 0;
						 for (j = 0;j <= 25;j++)
						 {
										   if (y[j] == 0)
										   {
											   b = b + 1; //cout<<b<<endl;
										   }
						 }
						  for (j = 0;j <= 25;j++)
						  {
											if (x[j] > j + 97)
											{
												b = b + 1; //cout<<b<<endl;
											}
						  }
						  if (b == 26)
						  {
							  System.out.print("no");
							  System.out.print("\n");
						  }
						  else
						  {
							  for (j = 1;j <= 100;j++)
							  {
													for (i = 0;i <= 25;i++)
													{ //cout<<i<<"  "<<x[i]<<"  "<<y[i]<<endl;
																	  if (x[i] != i + 97)
																	  {
																		  continue;
																	  }
																	  if (y[i] == j)
																	  {
																				 a = i + 97;
																				 break;
																	  }

													}
													if (y[i] == j)
													{
																				 System.out.print(a);
																				 System.out.print("\n");
																				 break;
													}
							  }
						  }
		}

	return 0;
	}


}

