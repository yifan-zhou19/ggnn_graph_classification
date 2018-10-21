package <missing>;

public class GlobalMembers
{
	//*********************************************************************
	//*????caixiang.cpp                                               *
	//*?  ??spica                                                      *
	//*?????2011?10?                                               *
	//*????:???????????m,?????2??????           *
	//*********************************************************************
	public static int Main()
	{
		int even = 0; //????even,?????odd1,odd2,??????sum1,sum2???????j,k
		int odd1 = 0;
		int odd2 = 0;
		int sum1 = 0;
		int sum2 = 0;
		int j = 0;
		int k = 0;
		even = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (odd1 = 3;odd1 <= even / 2;odd1++)
		{
			sum1 = 0;
			sum2 = 0;
			odd2 = even - odd1;
			for (j = 2;j < odd1;j++)
			{
				if (odd1 % j == 0)
				{
					sum1 = sum1 + 1;
				}
			}
			for (k = 2;k < odd2;k++)
			{
				if (odd2 % k == 0)
				{
					sum2 = sum2 + 1;
				}
			}
		if (sum1 == 0 && sum2 == 0)
		{
			System.out.print(odd1);
			System.out.print(" ");
			System.out.print(odd2);
			System.out.print("\n");
		}
		}
	return 0;
	}
}

