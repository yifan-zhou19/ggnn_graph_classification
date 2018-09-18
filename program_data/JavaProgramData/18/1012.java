package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[110][110];
		int[] b = new int[110];
		int[] ju = a;
		int num1;
		int num;
		int i;
		int j;
		int m;
		int sum = 0;
		int[] min = b;
		num1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (m = 0;m < num1;m++)
		{
						  num = num1;
						  sum = 0;
						  for (i = 0;i < num;i++)
						  {
										 for (j = 0;j < num;j++)
										 {
											 *(ju[i] + j) = ConsoleInput.readToWhiteSpace(true);
										 }
						  }
						  while (num > 1)
						  {
									 // for(i=0;i<num;i++)
									   //  for(j=0;j<num;j++) cout<<*(*(ju+i)+j);
									  for (i = 0;i < num;i++)
									  {
														min[i] = 10000;
														for (j = 0;j < num;j++)
														{
																		  if (*(ju[i] + j) < min[i])
																		  {
																			  min[i] = (ju[i] + j);
																		  }
														}
									  }
									//  for(i=0;i<num;i++) cout<<min[i]<<endl;
									  for (i = 0;i < num;i++)
									  {
										 for (j = 0;j < num;j++)
										 {
											 *(ju[i] + j) = *(ju[i] + j) - min[i];
										 }
									  }
										// for(i=0;i<num;i++)
										  // for(j=0;j<num;j++) cout<<*(*(ju+i)+j);
									  for (j = 0;j < num;j++)
									  {
														min[j] = 10000;
														for (i = 0;i < num;i++)
														{
																		  if (*(ju[i] + j) < min[j])
																		  {
																			  min[j] = (ju[i] + j);
																		  }
														}
									  }
									  //for(i=0;i<num;i++) cout<<min[i]<<endl;
									  for (i = 0;i < num;i++)
									  {
										 for (j = 0;j < num;j++)
										 {
											 *(ju[i] + j) = *(ju[i] + j) - min[j];
										 }
									  }
									 //  for(i=0;i<num;i++)
									   //    for(j=0;j<num;j++) cout<<*(*(ju+i)+j);
										 //  cout<<endl;
									  sum = sum + *(ju[1] + 1);
									  //cout<<sum<<endl;
									  for (i = 0;i < num;i++)
									  {
														for (j = 0;j < num - 1;j++)
														{
																			if (j >= 1)
																			{
																				*(ju[i] + j) = *(ju[i] + j + 1);
																			}
														}
									  }
									//  for(i=0;i<num;i++)
									  //   for(j=0;j<num-1;j++) cout<<*(*(ju+i)+j);
									  for (j = 0;j < num - 1;j++)
									  {
														for (i = 0;i < num - 1;i++)
														{
																			if (i >= 1)
																			{
																				*(ju[i] + j) = *(ju[i + 1] + j);
																			}
														}
									  }
									 // for(i=0;i<num-1;i++)
									   //    for(j=0;j<num-1;j++) cout<<*(*(ju+i)+j);
									  num--;
									  //cout<<sum<<" "<<num<<endl;
						  }
						  System.out.print(sum);
						  System.out.print("\n");
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		return 0;
	}

}

