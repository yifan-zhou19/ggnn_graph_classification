package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] test = new int[100][17];

		int i;
		int j;
		int k;
		int num;
		int turn = 0;
		int nonzero = 0;
		int valid = 0;

		for (i = 0;;i++)
		{
					 for (j = 0;;j++)
					 {
								   String tempVar = ConsoleInput.scanfRead();
								   if (tempVar != null)
								   {
									   num = Integer.parseInt(tempVar);
								   }
								   if (num == 0)
								   {
											 break;
								   }
								   if (num == -1)
								   {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
											  goto start;
								   }
								   test[i][j] = num;
					 }
								   turn += 1;
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		start:
		for (i = 0;i < turn;i++)
		{
								   for (j = 0;;j++)
								   {
												 if (test[i][j] != 0)
												 {
															   nonzero += 1;
												 }
												 else
												 {
													 break;
												 }
								   }
								   for (j = 0;j < nonzero;j++)
								   {
														 for (k = 0;k < nonzero;k++)
														 {
															 if ((float)(test[i][j]) / (float)(test[i][k]) == 2)
															 {
																valid += 1;
															 }
														 }
								   }
								   System.out.printf("%d\n",valid);
								   valid = 0;
								   nonzero = 0;
		}

		   return 0;
	}

}

