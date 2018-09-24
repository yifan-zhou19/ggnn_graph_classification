package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] high = new int[30];
		int point;
		int m;
		int sum1;
		int sum2;
		int check;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 0;m < n;m++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				high[m] = Integer.parseInt(tempVar2);
			}
		}
		for (check = 1;check == 1;)
		{
			check = 0;
			for (point = 0;point < n - 1;point++)
			{
			if (high[point] < high[point + 1])
			{
				check = 1;
				for (m = 0,sum1 = 0;m < point;m++)
				{
					if (high[m] < high[point + 1])
					{
						sum1++;
					}
				}
				for (m = point + 2,sum2 = 0;m < n;m++)
				{
					if (high[m] > high[point])
					{
						sum2++;
					}
				}
				if (sum1 > sum2)
				{
					for (m = point + 1;m < n - 1;m++)
					{
						high[m] = high[m + 1];
					}
				}
				else
				{
					for (m = point;m < n - 1;m++)
					{
						high[m] = high[m + 1];
					}
					point--;
				}
				n--;
			}
			}
		}
		System.out.printf("%d\n",n);
	}


}

