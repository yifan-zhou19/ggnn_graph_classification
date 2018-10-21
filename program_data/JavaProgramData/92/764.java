package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int k;
		int money;
		int tf;
		int ts;
		int wf;
		int ws;
		int[] tj = new int[1000];
		int[] qw = new int[1000];
		money = 0;
		while (scanf("%d", n) && (n != 0))
		{
					 for (i = 0;i < n;i++)
					 {
										  String tempVar = ConsoleInput.scanfRead();
										  if (tempVar != null)
										  {
											  tj[i] = Integer.parseInt(tempVar);
										  }
					 }
					 for (i = 0;i < n;i++)
					 {
										  String tempVar2 = ConsoleInput.scanfRead();
										  if (tempVar2 != null)
										  {
											  qw[i] = Integer.parseInt(tempVar2);
										  }
					 }
					 for (i = 0;i < n - 1;i++)
					 {
									   for (j = 0;j < n - 1 - i;j++)
									   {
														   if (tj[j] < tj[j + 1])
														   {
																			k = tj[j];
																			tj[j] = tj[j + 1];
																			tj[j + 1] = k;
														   }
									   }
					 }
					 for (i = 0;i < n - 1;i++)
					 {
									   for (j = 0;j < n - 1 - i;j++)
									   {
														   if (qw[j] < qw[j + 1])
														   {
																			k = qw[j];
																			qw[j] = qw[j + 1];
																			qw[j + 1] = k;
														   }
									   }
					 }
					tf = 0;
					ts = n - 1;
					wf = 0;
					ws = n - 1;
					for (i = 0;i < n;i++)
					{
									if (tj[tf] == qw[wf])
									{
													  if (tj[ts] > qw[ws])
													  {
																		 money += 200;
																		 ts--;
																		 ws--;
													  }
													  else if (tj[ts] < qw[ws])
													  {
														   money -= 200;
														   ts--;
														   wf++;
													  }
													  else if (tj[ts] == qw[ws])
													  {
														   if (tj[ts] < qw[wf])
														   {
																			money -= 200;
																			ts--;
																			wf++;
														   }
														   else if (tj[ts] == qw[wf])
														   {
															   break;
														   }
													  }
									}
									else if (tj[tf] > qw[wf])
									{
										 money += 200;
										 tf++;
										 wf++;
									}
									else
									{
										 money -= 200;
										 ts--;
										 wf++;
									}
					}
					System.out.printf("%d\n",money);
					money = 0;
		}
		return 0;
	}
}

