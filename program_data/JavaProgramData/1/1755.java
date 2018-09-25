package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : hanshu0109.cpp
	// Author      : 1300012911
	// Version     : 20131120,Wed,11th week
	// Copyright   :
	// Description : ????
	//============================================================================


	public static int fenjie(int a,int max)
	{ //a:?????max??1??????????????
		int i = 0;
		int sum = 0; //????
		if (a == 1)
		{
			return 1; //1???????1??????
		}
		for (i = max;i >= 2;i--)
		{
			if ((a % i) == 0)
			{
				sum += fenjie(a / i, i); //i??????
			}
		}
		return sum; //????
	}

	public static int Main()
	{
		int k = 0;
		int n = 0;
		int num = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k <= n;k++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(fenjie(num, num));
			if (k < n)
			{
				System.out.print("\n");
			}
		}
		return 0;
	}

}

