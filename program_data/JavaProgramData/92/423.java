package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int temp = 0;
		int num = 0;
		int sum1 = 0;
		int sum2 = 0;
		int money = 0;
		int[] tian = new int[1000];
		int[] qi = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
		temp = 0,num = 0,sum1 = 0,sum2 = 0,money = 0;
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			tian[i] = Integer.parseInt(tempVar2);
		}
		}
		for (j = 0;j < n;j++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			qi[j] = Integer.parseInt(tempVar3);
		}
		}

		for (i = 0;i <= n - 2;i++)
		{
						   for (j = n - 1;j >= 1;j--)
						   {
											  if (tian[j] > tian[j - 1])
											  {
																   temp = tian[j];
																   tian[j] = tian[j - 1];
																   tian[j - 1] = temp;
											  }
						   }
		}


		 for (i = 0;i <= n - 2;i++)
		 {
						   for (j = n - 1;j >= 1;j--)
						   {
											  if (qi[j] > qi[j - 1])
											  {
																   temp = qi[j];
																   qi[j] = qi[j - 1];
																   qi[j - 1] = temp;
											  }
						   }
		 }

		for (i = 0;i < n;i++)
		{
						num = i;
						for (j = num;j >= 0;j--)
						{
										   if (tian[j] > qi[i])
										   {
															sum1 = sum1 + 1;
															tian[j] = 0;
															 qi[i] = 0;
															 break;
										   }
						}
		}

		for (i = 0;i < n;i++)
		{
					   for (j = 0;j < n;j++)
					   {
						  if (tian[i] == qi[j] && tian[i] != 0)
						  {
									   sum2++;
									   break;
						  }
					   }
		}

		money = 200 * (sum1 - (n - sum1 - sum2));
		System.out.printf("%d\n",money);
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			n = Integer.parseInt(tempVar4);
		}
		}
	System.in.read();
	System.in.read();
	}
}

